# 一套接口多个实现示例

solon rpc 以服务为单位进行注册，以路径做为接口标识。

可通过两种，或相互组合的方式实现一套接口多个实现：

### 1、多服务实现的方式

本案定义：demo20.server1 和 demo20.service2，即是此方式


### 2、不同的路径实现的方式

本案定义：HelloServiceImpl 和 HelloServiceImpl2，即是此方式