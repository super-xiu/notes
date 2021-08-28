![image-20210720213018013](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720213018013.png)

![image-20210720215130389](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720215130389.png)

![image-20210720215253303](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720215253303.png)

控制反转就是将对象的创建交给spring，会减少程序的耦合，让用户不用再去管理对象的创建了，系统的耦合性大大降低，可以花费更多的时间再业务的实现上。

![image-20210720230025725](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720230025725.png)

![image-20210720230116448](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720230116448.png)

![image-20210720230622737](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720230622737.png)

![image-20210720230750042](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720230750042.png)

![image-20210720231142300](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720231142300.png)

**spring使用bean进行对象的注入其实是依赖对象的set方法。**

![image-20210720232046301](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720232046301.png)

![image-20210720233126870](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720233126870.png)

![image-20210720233146909](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210720233146909.png)

**spring的bean的注册的时候全部已经被实例化了。在配置文件加载的时候，容器中管理的对象已经全部被初始化了。**

![image-20210722092227641](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210722092227641.png)

![image-20210722092528746](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210722092528746.png)

![image-20210722092920908](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210722092920908.png)

![image-20210722093156162](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210722093156162.png)

![image-20210722094158817](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210722094158817.png)

=========

导入pringweb

数据库驱动 lombook,使用mybatis-plus

 不要同时导入mybatis和mybatisplus，

数据库连接驱动会有问题，如果scope的范围是test的时候。  

![image-20210723003325578](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210723003325578.png)

wind.fdc.log,lxxiu