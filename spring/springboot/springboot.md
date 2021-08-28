## springboot

### springboot的版本仲裁中心

springboot-web就是集成了所有在web开发过程中需要引用的jar包，并且通过spring-boot-starter-parent进行了统一的版本管理。而在spring-boot-starter-parent中又是通过spring-boot-dependencies进行所引入jar包版本的统一管理。

#### 如何在开发的过程中想查看或修改引入jar包的版本？

##### 查看：

```xml
spring-boot-starter-parent-->spring-boot-dependencies
```

##### 修改:

```xml
1. 查看对应jar的版本
2. 在如下位置进行修改想要的jar版本
<properties>
        <java.version>1.8</java.version>
 </properties>
```



### springboot的自动配置

springboot的主启动类默认扫描主类位置的子包的，如果程序不再子包下的话，那么就需要进行指定的包扫描，才能扫描到对应的包。

![image-20210815140005044](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210815140005044.png)

![image-20210815140355209](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210815140355209.png)

springboot的所有自动配置都基于@ springbootAutoConfig，自动配置也是按需加载

![image-20210815190839118](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210815190839118.png)

![image-20210815193421882](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210815193421882.png)