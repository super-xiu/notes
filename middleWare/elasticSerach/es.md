### es的安装

es的主要使用是用来存储数据的，安装es，为了方便管理es中的索引，需要安装header进行管理es中的索引，然后操作某个具体索引的可视化界面是kibana，所以一共需要安装三个软件，es ,header,kibana。如果需要加入分词的效果的话，在kibana的plugin目下下安装对应的分词器。其中需要注意的是head和kibana主要依赖的环境是node.js。



### es的基础概念

| 数据库（mysql等） | es                 |
| ----------------- | ------------------ |
| 数据库            | 索引               |
| 表                | type（即将被舍弃） |
| 行                | 文档               |
| 列                | 字段               |

### ES的基础语法 增删改查

```json
//添加数据
PUT /test5/user/1
{
  "name":"zs",
  "age":18,
  "sex":"man"
}

//修改数据
POST /test5/user/1/_update
{
  "doc":{
    "sex":"女"
  }
}

//查询数据
GET /test5/user/1

//删除数据
DELETE /test5/user/1
```

### ES的分词器

分词器的作用：如果不使用分词器，那么es会将一句中文分成一个一个的 字，对于中文搜索很不友好，所以使用中文分词器，会按照分词器的规则将语句话分为多个词语。便于查询！然而分词中也不是收录了所有的词语，有些想自定义的词语可以通过配置文件进行配置。

IK配置

   ```xml
 ik安装完毕后配置文件在 {ES_HOME}/config目录下, 本例目录是 /opt/apps/elasticsearch-6.4.0/config/analysis-ik/IKAnalyzer.cfg.xml

<?xml version="1.0" encoding="UTF-8"?>
   ```



<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>
        <!--配置文件名称,表明整个配置文件的目的即可,保持默认挺好的 -->
        <comment>IK Analyzer 扩展配置</comment>  
        <!--用户可以在这里配置自己的扩展字典,使用相对路径,多个词典使用逗号分隔,比如:custom/mydict1.dic,custom/mydict2.dic -->
        <entry key="ext_dict"></entry>
         <!--用户可以在这里配置自己的扩展停止词字典,使用相对路径,多个词典使用逗号分隔,比如:custom/mydict1.dic,custom/mydict2.dic -->
        <entry key="ext_stopwords"></entry>
        <!--用户可以在这里配置远程扩展字典,配置远程扩展字典,多个词典使用逗号分隔,比如: http://xxx.xx.com/xxx -->
        <entry key="remote_ext_dict">words_location</entry>
        <!--用户可以在这里配置远程扩展停止词字典,多个词典使用逗号分隔,比如: http://xxx.xx.com/xxx -->
        <entry key="remote_ext_stopwords">words_location</entry>
</properties>
IK自定义词典维护
文本词典
    ik文本词典均是以dic结尾,换行符作为分隔,示例如下:
```text
 ik安装完毕后配置文件在 {ES_HOME}/config目录下, 本例目录是 /opt/apps/elasticsearch-6.4.0/config/analysis-ik/IKAnalyzer.cfg.xml

<?xml version="1.0" encoding="UTF-8"?>
```




```xml
修改ik配置文件,将自定义的词典添加到ik配置中
<entry key="ext_dict">custom/myDic.dic</entry>
```


重启es,注意一定要重启es

通过前面教程中,我们发现短语"我爱祖国",会被分词为, "我","爱","祖国"三个词, 如果按照上面词典定义后, "我爱祖国"会被当成一个词语不被分词。

热更新远程词典
    热更新远程词典的优势是,修改词典后无需重启es。每分钟加载一次

    修改IK配置文件如下:
    
      <!--用户可以在这里配置远程扩展字典 -->
    <entry key="remote_ext_dict">location</entry>
 	<!--用户可以在这里配置远程扩展停止词字典-->
	<entry key="remote_ext_stopwords">location</entry>
其中 location 是指一个 url，比如 http://yoursite.com/getCustomDict，该请求只需满足以下两点即可完成分词热更新。

该 http 请求需要返回两个头部(header)，一个是 Last-Modified，一个是 ETag，这两者都是字符串类型，只要有一个发生变化，该插件就会去抓取新的分词进而更新词库。

该 http 请求返回的内容格式是一行一个分词，换行符用 \n 即可。

满足上面两点要求就可以实现热更新分词了，不需要重启 ES 实例。


### es的复杂查询