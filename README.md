# 订餐系统
## 1. 运行环境
1.IDEA

2.MyBatis

3.MySQL

## 2.项目启动

### 2.1 运行顺序
1. EurekaServerApplication
2. ConfigServerApplication
3. AccountApplication
4. UserApplication
5. MenuApplication
6. OrderApplication
7. ClientFeignApplication

### 2.2 输入网址
* http://localhost:8761/
* http://localhost:8030/account/logout

## 3. 项目概述
本项目分为客户端和后台管理系统两个界面，客户端针对普通用户，功能包括用户登陆、用户退出、菜品订购、我的订单。

后台管理系统针对管理员，功能包括管理员登陆、管理员退出、添加菜品、查询菜品、修改菜品、删除菜品、订单处理、添加用户、查询用户、删除用户。

## 4.系统架构
首先分配出4个服务提供者，account、menu、order、user。

account 提供账户服务：用户和管理员登陆。

menu 提供菜品服务:添加菜品、删除菜品、修改菜品、查询菜品。

order 提供订单服务：添加订单、查询订单、删除订单、处理

user 提供用户服务：添加用户、查询用户、删除用户。

接下来分配出1个服务消费者，包括客户端的前端页面和后台接口、后台管理系统的前端页面和后台接口，用户/管理员直接访问的资源都保存在服务消费者中，然后服务消费者调用4个服务提供者对应的接口完成业务逻辑，并通过 feign 完成负载均衡。

4个服务提供者和1个服务消费者都需要在注册中心完成注册，同时注册配置中心，提供远程配置信息读取，服务提供者和服务消费者的配置信息保存在 Git 远程仓库，由配置中心负责拉取，关系如下图所示。

![./image/image-20211125152531117](image/model.png)

本系统共有8个模块组成，包括注册中心，配置中心，Git 仓库配置信息，服务消费者，4个服务提供者。

