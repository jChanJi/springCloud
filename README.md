# springCloud
搭建微服务基本框架，主要包括注册中心、服务生产者、服务消费者、网关。

##文件说明
1. 项目代码在同级目录中，一个文件夹代表一个项目，一共需要启动四个项目
2. springcloud 项目为注册中心，需要第一个启动
3. service-member 项目作为服务的提供方，第二个启动
4. service-order-feign 项目作为服务的调用方，第三个启动
5. service-zuul 项目为网关，对用户请求进行拦截，最后一个启动

## 运行环境
1. Intel Idea
2. maven

## 启动流程

### 1. 启动springcloud项目
访问 http://localhost:1234/ 地址，如果出现以下界面，则代表注册中心启动成功
![注册中心](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka4.png)

### 2. 启动service-member项目
再次访问 http://localhost:1234/ 如果出现以下界面，则启动成功
![会员服务](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka8.png)

### 3. 启动 service-order-feign项目
又一次的访问注册中心界面 http://localhost:1234/ 出现如下界面则启动成功
![订单中心](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka11.png)
### 4. 启动 service-zuul 项目

1. 访问 http://localhost:8765/api/member/getMemberService 地址，显示: token is empty
2. 加上token后：http://localhost:8765/api/order/getAllUserByFeign?token=123,显示: this is order service

如果都显示正常，则网关配置成功。