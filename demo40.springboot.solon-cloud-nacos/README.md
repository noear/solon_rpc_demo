## 本示例演示内容包括：

* rpc基础架构
* rpc使用注册与发现服务
* 使用配置服务
* 使用配置服务的注入@CloudConfig
* 


#### 演示配置初始化

* 增加配置：group=demo；dataid=water_cache_header
```
ddd
```

* 增加配置：group=demo；dataid=test.properties
```
db1.url=jdbc
db1.username=noear
db1.password=xxx
db1.jdbcUrl=${db1.url}
```
#### 关于Springboot的集成细节
* demo40-server 
    * 要排序 solon-rpc 框架，要排除两个框架（具体参考 pom.xml）
    * 启动器要增加 EnableSolon 注解
    * 增加一个 RpcConfig 类，使用 Solon 的配置注解，之后会取消掉。临时用用。

* demo40-client
    * 要排序 solon-rpc 框架，要排除两个框架（具体参考 pom.xml）
    * 启动类 加两个注解
  