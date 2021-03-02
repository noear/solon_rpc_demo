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
#### 关于 Springboot 的集成细节

* demo40-server （3处注意细节）
  * pom.xml：引入了 solonrpc-springboot-starter ，nacos-solon-plugin 两个框架
  * ServarApp：启动类 加注解 @EnableSolonRpc
  * HelloServiceRemoteImp：RPC服务类只能使用 Solon 的注解


* demo40-interface（1处注意细节）
  * HelloService：接口申明类 加 @NamiClient


* demo40-client（4处注意细节）
  * pom.xml：引入了 solonrpc-springboot-starter ，nacos-solon-plugin 两个框架
  * ServarApp：启动类 加注解 @EnableSolonRpc
  * NamiConfigurationImpl：定义一个Nami配置（控制消费端序列化等细节）
  * TestController：使用 @NamiClient 注入远程服务
  