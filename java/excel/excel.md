![image-20210501194815629](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501194815629.png)

![image-20210501195133217](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501195133217.png)

![image-20210501195413605](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501195413605.png)

poi是將数据全部加载进内存当中，而easyExcel则是一行一行进行读取，

excel中的对象

![image-20210501195951627](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501195951627.png)

![image-20210501200519431](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501200519431.png)

![image-20210501200840624](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501200840624.png)

![image-20210501201017413](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210501201017413.png)

**03和07的在大数据情况下的异同**

![image-20210502130218692](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502130218692.png)

03只有65536行，而07则不会进行限制。但是速度会比较慢，可以使用加强版的，速度会更加快些

但是需要清除临时文件

![image-20210502130653961](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502130653961.png)

读取数据

![image-20210502131205449](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502131205449.png)

**讀取值的時候一定得注意類型**

![image-20210502132222249](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502132222249.png)

![image-20210502132442947](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502132442947.png)

![image-20210502132623156](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502132623156.png)

![image-20210502132757343](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502132757343.png)

![image-20210502132842861](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502132842861.png)

计算

![image-20210502133544804](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502133544804.png)

easyExcel会根据实体类自动生成表

![image-20210502134507908](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502134507908.png)

![image-20210502134925575](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502134925575.png)

![image-20210502135012199](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502135012199.png)

只需要写一个类继承监听器，然后重写invoke方法





**springmvc拦截器**

![image-20210508211354741](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210508211354741.png)

1. 进入方法之前可以进行校验
2. 进入方法后并未返回值之后可以进行对应的拦截
3. 方法返回值之后进行对应的操作