主要是对mybatis进行增强的，使得crud更加的高效，更加的快速

![image-20210502213501492](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502213501492.png)

![image-20210502213615802](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502213615802.png)

尽量·不要同时导入mybaits和mybatisplus,要不然会冲突

![image-20210502213937994](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502213937994.png)

![image-20210502214045947](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214045947.png)

![image-20210502214303136](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214303136.png)

![image-20210502214712949](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214712949.png)

![image-20210502214737417](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214737417.png)

![image-20210502214812906](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214812906.png)

![image-20210502214924290](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502214924290.png)

![image-20210502215056074](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502215056074.png)

![image-20210502215242361](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502215242361.png)

**问题？**

![image-20210502215402528](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210502215402528.png)

![image-20210518094520538](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518094520538.png)

**会自动插入id**

![image-20210518095130285](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518095130285.png)

![image-20210518095327589](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518095327589.png)

**代码中的主键生成策略默认的是全局唯一id是ID_WORKER**,在原有的情况下自增1

![image-20210518095557162](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518095557162.png)

![image-20210518095840759](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518095840759.png)

![image-20210518100235765](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518100235765.png)

**会根据条件会自动进行动态sql的拼接**

**如果数据库中时间的修改就是自动填充的**

数据库层面需要创建一个自动跟新的时间类的列，或者是重代码层次也需进行对应的书写

![image-20210518100931905](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518100931905.png)

代码级别的。实体类上进行注解，写一个控制器进行插入策略的书写

![image-20210518101443927](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518101443927.png)

![image-20210518101855938](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518101855938.png)

![image-20210518102836223](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210518102836223.png)

mp在操作数据库的过程中可能会存在并发问题，需要采用乐观锁进行解决。而mp中提供了乐观锁的插件来解决这个问题。

**=======删除=========**

![image-20210522205520466](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522205520466.png)

![image-20210522205635601](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522205635601.png)

**逻辑删除**

![image-20210522210001888](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522210001888.png)

![image-20210522210142512](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522210142512.png)

![image-20210522210223053](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522210223053.png)

![image-20210522210230331](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522210230331.png)

![image-20210522210338862](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522210338862.png)

小结：逻辑删除，走的是更新操纵，而不是删除操作，就是在数据库中添加一个字段，配置之后如果执行删除操作，那么该字段就会发生改变，最后在查询的时候就不会查询出字段已经改变的值，这样有啥用呢？就是非管理人员操作数据库，如果误操作的话，管理员方便进行对应的操作。



**性能分析插件**

![image-20210522211836485](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522211836485.png)

![image-20210522211902926](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522211902926.png)

![image-20210522212105732](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522212105732.png)

![image-20210522212239318](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210522212239318.png)

性能分析就是对执行sql进行慢sql查询，然后可以对sql进行一些操作





**条件构造器**

**可以用来查询复杂的sql** 

![image-20210525150814587](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525150814587.png)

![image-20210525151430484](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525151430484.png)

![image-20210525151715547](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525151715547.png)

![image-20210525152117471](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525152117471.png)

![image-20210525164634829](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525164634829.png)

![image-20210525165123665](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210525165123665.png)

**代码自动生成器**

![image-20210526112028628](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526112028628.png)

![image-20210526112909211](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526112909211.png)

![image-20210526113133898](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526113133898.png)

![image-20210526113329629](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526113329629.png)

![image-20210526114336320](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526114336320.png)

![image-20210526114450415](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526114450415.png)

![image-20210526114720409](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210526114720409.png)

代码自动生成器，通过数据库中的字段和对应的代码生成器，则可以自动生成代码