![image-20210419174203451](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210419174203451.png)

![image-20210419191444055](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210419191444055.png)

![image-20210419191732165](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210419191732165.png)

![image-20210419223327060](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210419223327060.png)

![image-20210419223452722](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210419223452722.png)安装以及使用

![image-20210420211953422](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210420211953422.png)

![image-20210420212037312](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210420212037312.png)

![image-20210420212549272](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210420212549272.png)

![image-20210420212737451](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210420212737451.png)

![image-20210420212952327](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210420212952327.png)

安装可视化界面head需要前端node环境，所以需要安装前需要安装对应的node环境。

如何安装对应的可视化界面 head，使用node进行对应的环境安装

cnpm使用国内淘宝的镜像，

安装好head之后（head的端口是9100）但是服务器的端口是9200，所以想使用head进行连接端口为9200的elasticsearch服务时，需要解决跨域问题

![image-20210421193446476](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421193446476.png)

![image-20210421193815029](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421193815029.png)

![image-20210421194359245](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421194359245.png)

汉化

![image-20210421194520622](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421194520622.png)

![image-20210421194555686](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421194555686.png)

elk主要就是搭建各类环境，其中head和kibana中都是依赖node.js环境。



es的核心概念

![image-20210421200040512](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421200040512.png)

一切都是json

![image-20210421200210955](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421200210955.png)

![image-20210421200436470](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421200436470.png)

![image-20210421200709476](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421200709476.png)

倒排索引，查询效率高，完全过滤掉所有无关的数据

![image-20210421200950501](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421200950501.png)

![image-20210421201009360](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421201009360.png)

![image-20210421201133755](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421201133755.png)

![image-20210421203308359](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421203308359.png)

![image-20210421203636336](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421203636336.png)

直接解压到es中的plugin目录下，然后重新启动es观察即可

![image-20210421203816447](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421203816447.png)

![image-20210421204003779](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421204003779.png)

![image-20210421204110811](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421204110811.png)

![image-20210421204149136](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210421204149136.png)

最小分词器就是将你需要分词的词作为一个整体使用，而最大分词器就是将你需要分词的词进行所有的组合进行分词

![image-20210422130841282](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422130841282.png)

![image-20210422130945590](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422130945590.png)

![image-20210422131043898](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422131043898.png)ik分词器：

 分词器有两种分词的方法，一种是最细粒度一种是最小分词，有些时候想将自己自定义的字作为一个词进行搜索，此时只需自定义一个字典，然后配置自定义的分词器，此时再次使用分词器进行搜索的时候直接就会将自定义的词作为一个词进行搜索

设置完字典后重新进行配置，然后重启es 重启kiban进行生效测试

![image-20210422141759335](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422141759335.png)

![image-20210422142040557](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422142040557.png)

![image-20210422142221433](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422142221433.png)

![image-20210422143356355](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422143356355.png)

![image-20210422143426468](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422143426468.png)

建索引，创建具体的索引规则，类似于创建数据库表，指定字段的属性

![image-20210422143643761](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422143643761.png)

![image-20210422143821978](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422143821978.png)

![image-20210422144012855](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422144012855.png)

![image-20210422144034090](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422144034090.png)

如何自己的文档字段没有指定会默认配置字段类型如何



如何修改

![image-20210422144604821](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422144604821.png)

![image-20210422145841263](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422145841263.png)

![image-20210422150047735](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422150047735.png)

![image-20210422152002881](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422152002881.png)

![image-20210422152050549](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422152050549.png)

​	

![image-20210422152322244](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422152322244.png)

![image-20210422152335898](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422152335898.png)

![image-20210422152555732](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210422152555732.png)

post用于发送请求，后面如果添加了update参数会当做修改命令进行使用，post的好处就是指定修改哪个就进行哪个的修改，而put如果没有对应的数据进行修改缺失值的字段会直接置空。

基本命令：

![image-20210424114256822](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424114256822.png)

![image-20210424144602325](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424144602325.png)

![image-20210424144657697](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424144657697.png)

带条件查询

![image-20210424144754855](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424144754855.png)

![image-20210424145103853](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424145103853.png)

发展查询

![image-20210424154317077](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424154317077.png)

![image-20210424154339418](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424154339418.png)

![image-20210424155039032](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210424155039032.png)

![image-20210425111235716](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425111235716.png)

![image-20210425111421931](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425111421931.png)

![image-20210425111703070](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425111703070.png)

过滤字段，结果的过滤

![image-20210425111905617](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425111905617.png)

排序，有固定的排序则不会显示其分数

![image-20210425112102973](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425112102973.png)

分页

![image-20210425112237705](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425112237705.png)

![image-20210425112323019](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210425112323019.png)

![image-20210428103426052](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428103426052.png)

![image-20210428103639883](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428103639883.png)

多条件查询 must就是所有的匹配条件都需要满足才能查询出来

![image-20210428104022882](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428104022882.png)

or

![image-20210428104206837](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428104206837.png)

![image-20210428104347191](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428104347191.png)

过滤器

![image-20210428104531711](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428104531711.png)

gt gte lt lte大小判断

![image-20210428105017453](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428105017453.png)

![image-20210428105231179](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428105231179.png)

![image-20210428105452772](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428105452772.png)

![image-20210428105725556](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428105725556.png)

![image-20210428105751272](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428105751272.png)

在查询的时候keyword就是将查询的词作为一个整体，没有被拆分分析，而默认的standard就会将传入的值进行拆分分析。

在es中文本会有两种属性，一种是text还有一种是keyword，其中text会被分词解析器所解析，而keyword则不会，会将传入的值作为一个整体，在对值进行查询的时候，如果查询值的类型是text则会进行拆分查询，如果类型的keyword就整体查询，如果整体没有匹配上则会出现错误

![image-20210428110426103](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428110426103.png)

**使用term进行精确查询的时候会使用分词器，但是如果查询值的类型为keyword时就不会进行分词器的解析**

多个值匹配的精确查询

![image-20210428110909923](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428110909923.png)

![image-20210428111202040](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428111202040.png)

自定义前缀，自定义高亮条件

![image-20210428111343059](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428111343059.png)

**复杂查询小结**

![image-20210428111525360](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210428111525360.png)

====================review================

![image-20210707194430554](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707194430554.png)

![image-20210707194828683](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707194828683.png)

![image-20210707201534926](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707201534926.png)

**设置索引中字段的数据类型**

![image-20210707201752115](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707201752115.png)

![image-20210707202908495](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707202908495.png)可以使用put进行文档字段的类型设置，如果没有进行字段的类型设置的话，会根据输入数据的类型自动设置数据类型。

![image-20210707212629234](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707212629234.png)

![image-20210707212742503](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707212742503.

**修改数据的方式**

![image-20210707212912192](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707212912192.png)

========文档相关的增删改查========

![image-20210707214107013](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707214107013.png)

![image-20210707214719267](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707214719267.png)

![image-20210707215013883](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707215013883.png)

查询

![image-20210707215449025](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707215449025.png)

![image-20210707221048258](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210707221048258.png)========es的复杂查询===

![image-20210708095720068](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708095720068.png)

![image-20210708095750300](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708095750300.png)

![image-20210708100122161](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708100122161.png)

must：表示所有的条件都需要被符合；should就是or的意思；

![image-20210708100301138](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708100301138.png)

![image-20210708100359857](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708100359857.png)

![image-20210708100613612](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708100613612.png)

![image-20210708100744726](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708100744726.png)

![image-20210708101019208](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708101019208.png)

text与keyword

![image-20210708102239811](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708102239811.png)

text会被分词器所解析，而keyword则不会被分词器所解析

term会将所查询的条件使用分词器进行解析，分为两种,text和keyword形式

![image-20210708102728949](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708102728949.png)

**高亮查询**

![image-20210708103041594](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708103041594.png)

自定义标签

![image-20210708103206209](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708103206209.png)

![image-20210708163652225](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708163652225.png)

![image-20210708164100696](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708164100696.png)

![image-20210708164445053](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708164445053.png)

![image-20210708171126307](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708171126307.png)

![image-20210708171512520](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708171512520.png)

![image-20210708171652655](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708171652655.png)

![image-20210708204951258](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708204951258.png)

![image-20210708205252707](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708205252707.png)

![image-20210708205958266](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708205958266.png)

![image-20210708210318046](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708210318046.png)

![image-20210708210446596](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708210446596.png)

![image-20210708210930713](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708210930713.png)

![image-20210708210946169](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708210946169.png)

![image-20210708211818157](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708211818157.png)

创建项目，导入es的依赖，但是导入的es依赖和我们本地下载的es的版本不一致，所以需要进行对应版本的修改

![image-20210708212727916](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210708212727916.png)

![image-20210709154820168](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709154820168.png)

![image-20210709161407653](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709161407653.png)

图片懒加载的问题

![image-20210709161731352](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709161731352.png)

![image-20210709161943764](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709161943764.png)

![image-20210709162113813](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709162113813.png)

![image-20210709162825135](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709162825135.png)

![image-20210709163111532](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709163111532.png)

![image-20210709163847632](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709163847632.png)

![image-20210709163955715](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709163955715.png)

![image-20210709164132010](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709164132010.png)

![image-20210709165027710](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709165027710.png)

![image-20210709165215375](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709165215375.png)

![image-20210709165325871](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709165325871.png)

![image-20210709165739461](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709165739461.png)

![image-20210709170105627](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709170105627.png)

![image-20210709170147002](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709170147002.png)

找出高亮部分并且将其进行替换

![image-20210709170248407](C:\Users\19586\AppData\Roaming\Typora\typora-user-images\image-20210709170248407.png)