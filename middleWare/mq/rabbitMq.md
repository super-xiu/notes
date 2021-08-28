### 消息中间件的作用

1. 流量消峰：mq内部可以对访问进行排队，缺：访问速度变慢
2. 应用解耦：直接发送请求给队列，而非哪个模块，任务下发队列后，队列去监督任务执行直至任务成功。
3. 异步处理：a调用b，但是执行时间很长，可以使用a调用mq，mq去执行b，然后a去做别的事情，等到做完b,队列将结果返回给a.不至于a一直在阻塞。

### 消息中间件的选用

1. kafka：适用于产生大量数据、且kafka带有日志采集功能
2. rocketMq:天生为金融互联网而生,双11高并发场景
3. rabbitMq:时效性微秒级、数据量不是很大、管理界面很方便

### rabbitMQ

#### 1. 概念

![image-20210817073410937](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210817073410937.png)

#### 2. rabbitMq的六大核心模式

![image-20210817073519797](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210817073519797.png)

#### 3. 安装

```shell
1. 去官网找erlang 的云下载包 wget进行下载对应的rpm
2. 去官网找rabbitmq 的云下载包 wget进行下载对应的rpm
# 进行安装到指定目录 rpm -ivh --prefix=/app/ jdk-8u111-linux-x64.rpm
rpm -ivh erlang-21.3.8.21-1.el7.x86_64.rpm
yum install socat -y
rpm -ivh rabbitmq-server-3.8.8-1.el7.noarch.rpm

# 启动服务
systemctl start rabbitmq-server
# 查看服务状态
systemctl status rabbitmq-server
# 开机自启动
systemctl enable rabbitmq-server
# 停止服务
systemctl stop rabbitmq-server
# 重启服务
systemctl restart rabbitmq-server

#关闭服务后安装插件
rabbitmq-plugins enable rabbitmq_management
#安装完毕以后，重启服务即可
systemctl restart rabbitmq-server
# 创建账号和密码
rabbitmqctl add_user admin 123456

# 设置用户角色
rabbitmqctl set_user_tags admin administrator

# 为用户添加资源权限
# set_permissions [-p <vhostpath>] <user> <conf> <write> <read>
rabbitmqctl set_permissions -p "/" admin ".*" ".*" ".*"
# 添加配置、写、读权限
 

```

#### 4. 创建java开发环境

背景：使用mq进行消息的通信

![image-20210822103034394](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822103034394.png)

![image-20210822105742276](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822105742276.png)

![image-20210822110100470](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822110100470.png)

![image-20210822110304183](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822110304183.png)

![image-20210822110541221](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822110541221.png)

![image-20210822110924885](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822110924885.png)

![image-20210822200434736](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822200434736.png)

![image-20210822200533674](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822200533674.png)

![image-20210822201335272](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822201335272.png)

#### 当有多个线程对mq中的消息进行消费的时候，遵循轮询消费的规则。1-aa cc 2-bbdd

![image-20210822202041539](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822202041539.png)

自动应答，不是很靠谱，环境比较理想化

![image-20210822202245027](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822202245027.png)

![image-20210822202505292](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822202505292.png)

批量就是5678一起应答，也可能会出现消息的丢失。

![image-20210822204039120](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822204039120.png)

![image-20210822204215533](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822204215533.png)

![image-20210822223254231](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210822223254231.png)

![image-20210824224303203](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824224303203.png)

![image-20210824224458457](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824224458457.png)

mq的消息手动应答，就是生产这轮询的发送消息的时候，当A处理到消息后，轮到B进行处理，但是B的处理时间比较长如果此B中出现了异常，很有可能会导致数据丢失，但是如果设置手动应答的时候用，当消息发送给B的时候，此时B挂掉了，会使用a进行处理消息，不至于消息丢失。

#### mq的持久化

![image-20210824225209607](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824225209607.png)

![image-20210824225408112](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824225408112.png)

队列的持久化，就是防止消息在队列宕机的时候丢失，所以在声明队列持久化，如果此时mq进行宕机的时候，只要声明了队列的持久化，那么队列中的数据就不会丢失。但是队列之前申明为非持久化的话，需要重新创建一个新的持久化队列，否则会报错，意思就是队列是否持久化的性质无法修改。



#### 消息持久化

队列的持久化只是保证在宕机的时候队列不会丢失，但是数据会丢失，而数据持久化才能保证在宕机的时候数据不会丢失。并非绝对的！

![image-20210824225859026](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824225859026.png)

![image-20210824230011737](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824230011737.png)

#### 不公平分发

![image-20210824230056047](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210824230056047.png)

#### 预取值：指定对应消费者消费多少。跟消费能力没有关系

![image-20210827211605409](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210827211605409.png)

![image-20210827211800996](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210827211800996.png)

#### 集群大搭建

![image-20210827212440386](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210827212440386.png)

![image-20210827212619831](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210827212619831.png)