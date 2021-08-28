1. 如何将Windows的文件上传到linux上。

   ```shell
    #安装进行文件传输的插件，rz是将Windows上传到你敲rz命令的目录下
     yum install lrzsz  
   ```

   

2. 安装java的jdk

   ```shell
   
   
   ```

3. 三种下载工具的区别

   ```java
   1. wget就是去网络上去下载对应的安装包
   2. rpm 只能安装本地已经存在的.rpm包，一般使用wget去获取安装包，然后使用rpm去进行安装对应的.rpm安装包。
   3.  yum能在线下载并安装rpm包,能更新系统,且还能自动处理包与包之间的依赖问题,这个是rpm 工具所不具备的。
   ```

   