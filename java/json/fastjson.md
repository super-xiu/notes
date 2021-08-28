![image-20210718114120949](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718114120949.png)

json的数据格式

[{name:"zs",age:18},{}]

![image-20210718114747965](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718114747965.png)

![image-20210718115102074](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718115102074.png)

**数据类型，对象，数组，数组中有对象，对象中有数组，数组中用下标进行取，而对象使用key进行取出**

![image-20210718115337118](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718115337118.png)

**json数据嵌套**

![image-20210718115745632](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718115745632.png)

**fastjson序列化**

![image-20210718120529932](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718120529932.png)

![image-20210718121705436](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718121705436.png)

![image-20210718134226704](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718134226704.png)

**json的反序列化**

![image-20210718134450582](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718134450582.png)

![image-20210718134626899](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718134626899.png)

![image-20210718135046283](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718135046283.png)

fastjson在做序列化的時候，空值默认不被序列化，意思就是如果为空，json字符串中就不会有这个值，

![image-20210718135615903](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718135615903.png)

![image-20210718135735376](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718135735376.png)

![image-20210718135932461](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718135932461.png)

![image-20210718140155521](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140155521.png)

![image-20210718140202374](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140202374.png)

![image-20210718140427309](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140427309.png)

![image-20210718140635485](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140635485.png)

![image-20210718140804231](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140804231.png)

![image-20210718140842093](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718140842093.png)

![image-20210718141023546](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718141023546.png)

![image-20210718141253783](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718141253783.png)

![image-20210718141323972](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718141323972.png)

![image-20210718141443799](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718141443799.png)

=============springmvc集成fastjson============

在spring体系中，用的是jackson进行对象的序列化的，如何进行fastjson的继承呢？

导入依赖，mysql-connect，drudi,fastjson,jdbctemplate

![image-20210718142056398](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718142056398.png)

![image-20210718142529857](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210718142529857.png)