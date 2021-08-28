1. 第一个vue程序
   1. 导入vue.js 的cdn
   2. 书写对应的语法即可

```java
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>

```

![image-20210318190233352](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318190233352.png)

![image-20210318190650937](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318190650937.png)

![image-20210318190849546](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318190849546.png)

![image-20210318191407298](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318191407298.png)

![image-20210318191628695](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318191628695.png)

![image-20210318191720582](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318191720582.png)

![image-20210318191939329](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318191939329.png)

**双向绑定**

![image-20210318192239297](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318192239297.png)

![image-20210318192618464](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318192618464.png)

双向绑定就是两边的值一起变化，

![image-20210318195740132](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210318195740132.png)



vue组件，就是自定义标签并且让其合法

![image-20210319100150559](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210319100150559.png)

![image-20210319100434612](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210319100434612.png)

![image-20210319100625831](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210319100625831.png)

自定义组件：组件先去vue对象中去取到对应的值，然后将取出来的值传入到组件当中与组件中的某一个属性进行相关联。

qingjiang组件先去遍历vm中的items获取到item，然后将item传入主键中的props之后将组件与item进行绑定，就可以动态展示组件中的值