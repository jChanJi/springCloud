# springCloud

## 项目说明

### 微服务简介
> 微服务，简单来说就是将一个项目中的多个模块分离开来，部署在不同的机器上，但需要强调的一点是其核心并不是简单的将多个模块部署在不同机器上这么简单，而在于服务的治。

> 微服务需要用到很多的组件，这里只简单的介绍项目中用到的几个：

### 注册中心
> 所有的服务都要在注册中心中注册，所以注册中心必须要第一个启动，对应项目中的springcloud 项目文件。简单的理解，很多个服务之间的互相发现是通过注册中心完成的，只有都在注册中心注册了才被认可。

### 服务生产者（提供服务的一方）
>一个服务既可以作为生产者，也可以作为消费者。比如说会员服务中有获取用户信息的接口，而订单服务需要调用会员服务中的用户信息接口。这样会员服务就是服务生产者，而订单服务是服务消费者。

### 服务消费者（调用服务的一方）
>和服务生产者相反，应该不难理解


## 文件说明
1. 项目代码在同级目录中，一个文件夹代表一个项目，一共需要启动三个项目
2. springcloud 项目为注册中心，需要第一个启动，项目代码说明参考链接：[传送门](https://jchanji.github.io/year/07/25/SpringCloud-chapter3/)
3. service-member 项目作为服务的提供方，第二个启动。项目代码说明参考链接：[传送门](https://jchanji.github.io/year/07/27/SpringCloud-chapter4/)
4. service-order-feign 项目作为服务的调用方，第三个启动项目。项目代码说明参考链接：[传送门1](https://jchanji.github.io/year/07/25/SpringCloud-chapter3/)，[传送门2](https://jchanji.github.io/year/08/06/springCloud-chapter9/)

> 参考链接中的内容和项目代码不完全一致，主要看起搭建的过程和配置文件。具体的代码以提供的代码为准。

## 运行环境
1. IntelliJ IDEA
2. maven(IntelliJ IDEA 中自带不需要安装)
3. jdk 1.8 (版本务必保持一致)

## 启动流程
>直接将项目代码下载下来，使用IntelliJ IDEA 打开。file->open->open as project。打开后需要等maven将所有依赖都下载好才能运行项目。 

### 1. 启动springcloud项目
访问 http://localhost:1234/ 地址，如果出现以下界面，则代表注册中心启动成功
![注册中心](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka4.png)

### 2. 启动service-member项目
再次访问 http://localhost:1234/ 如果出现以下界面，则启动成功
![会员服务](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka8.png)

### 3. 启动 service-order-feign项目
又一次的访问注册中心界面 http://localhost:1234/ 出现如下界面则启动成功
![订单中心](https://raw.githubusercontent.com/jChanJi/static_resource/master/img/eureka11.png)

## CURD操作
### postman插件安装
> 因为使用浏览器无法发送Post请求，所以我们必须使用调试HTTP接口的工具postman。现在chrome浏览器中安装postman。注意需要科学上网。

1. 打开应用商店
![postman_01](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/postman_01.png)
![postman_02](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/postman02.png)
2. 搜索postman
![postman03](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/postman03.png)
3. 打开postman
![posman04](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/postman04.png)

### CURD操作
#### 1. 添加用户
![add_user](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/add.png)

#### 2. 修改用户
![modify_user](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/modify.png)
#### 3. 查看用户
![search_user](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/get.png)

#### 4. 删除用户
![delete_user](https://raw.githubusercontent.com/jChanJi/static_resource/master/springcloud/delete.png)



























