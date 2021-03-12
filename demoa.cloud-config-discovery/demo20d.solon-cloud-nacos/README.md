## 本示例演示内容包括：

* rpc基础架构
* rpc使用注册与发现服务
* 使用配置服务
* 使用配置服务的注入@CloudConfig
* 订阅配置
* 使用SocketD做为rpc通道（新货）
* 使用安全停止方案[基于注册服务的rpc；可以直接stop 然后更新再start（新货）


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
  