# Springcloud框架搭建和学习

微服务框架架构图
![Image text](https://github.com/iot-wangshuyu/springcloud/blob/master/server/src/main/resources/static/TIM%E6%88%AA%E5%9B%BE20171129100838.png.png)

在Spring Cloud微服务系统中，一种常见的负载均衡方式是，客户端的请求首先经过负载均衡（zuul、Ngnix），再到达服务网关（zuul集群），然后再到具体的服。，服务统一注册到高可用的服务注册中心集群，服务的所有的配置文件由配置服务管理（下一篇文章讲述），配置服务的配置文件放在git仓库，方便开发人员随时改配置。

SpringCloud分布式开发五大神兽

    服务发现——Netflix Eureka
    客服端负载均衡——Netflix Ribbon
    断路器——Netflix Hystrix
    服务网关——Netflix Zuul
    分布式配置——Spring Cloud Config
1：实现服务注册  

    server 服务注册中心
    client 服务提供者
    client2 服务提供者2
查询地址http://127.0.0.1:8081/

2：实现服务消费

    service-ribbon服务消费者
    http://127.0.0.1:8084/hi?name=%E7%8E%8B
    web输出：hi 王,i am from port:8083或者hi 王,i am from port:8082
    证明实现了负载均衡
   
![Image text](https://github.com/iot-wangshuyu/springcloud/blob/master/service-ribbon/src/main/resources/static/TIM%E6%88%AA%E5%9B%BE20171128153036.png)


3:使用Feign实现服务消费者

    Feign 采用的是基于接口的注解
    Feign 整合了ribbon

4：整合Hystrix，避免雪崩效应

    Feign是自带断路器的，在D版本的Spring Cloud中，它没有默认打开。需要在配置文件中配置打开它，在配置文件加以下代码：
    feign.hystrix.enabled=true

5:断路器（Hystrix）实现

    a.在ribbon使用断路器
    改造serice-ribbon 工程的代码，首先在pox.xml文件中加入spring-cloud-starter-hystrix的起步依赖：
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-hystrix</artifactId>
    </dependency>
    在程序的启动类ServiceRibbonApplication 加@EnableHystrix注解开启Hystrix
    b.Feign是自带断路器的，在D版本的Spring Cloud中，它没有默认打开。需要在配置文件中配置打开它，在配置文件加以下代码：   
      feign.hystrix.enabled=true
      
      断路器仪表盘监控：
      重启工程，打开浏览器访问：http://localhost:8084/hystrix
![Image text](http://img.blog.csdn.net/20171201175624221?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2FuZ19zaHV5dQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)
      在1处输入：http://localhost:8084/hystrix.stream
      在2处随便输入一个名称，点击按钮跳转到如下页面：
![Image text](http://img.blog.csdn.net/20171201175754760?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2FuZ19zaHV5dQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


6:集成Zuul
Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如／api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能。
      zuul有以下功能：
      
      Authentication
      Insights
      Stress Testing
      Canary Testing
      Dynamic Routing
      Service Migration
      Load Shedding
      Security
      Static Response handling
      Active/Active traffic management
      
7: 分布式配置中心(Spring Cloud Config)

    在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。
    在Spring Cloud中，有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），
    也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，一是config server，二是config client。
    每个应该工程都可以上配置成一个config client，通过config server从中央仓库拉去相关配置
![Image text](https://github.com/iot-wangshuyu/springcloud/blob/master/config-server/src/main/resources/static/TIM%E6%88%AA%E5%9B%BE20171130175602.png)
 config server 访问地址：http://localhost:8888/config-client/dev/
 config client 访问地址：http://localhost:8881/hi
8:高可用的分布式配置中心(Spring Cloud Config)

    将配置中心做成一个微服务，将其集群化，从而达到高可用，架构图如下
![Image text](https://github.com/iot-wangshuyu/springcloud/blob/master/config-server/src/main/resources/static/TIM%E6%88%AA%E5%9B%BE20171130180351.png)
    
    配置服务查看网址http://localhost:8889/
    配置服务测试网址：http://localhost:8881/hi
    
 9:消息总线(Spring Cloud Bus)
 
     复制一个新的config-client，修改端口号，添加相关配置
     一次启动config的相关工程，访问http://localhost:8881/hi和http://localhost:8882/hi，返回相同结果
     修改仓库的foo 版本号，然后post请求 http://localhost:8881/bus/refresh
     重新访问http://localhost:8881/hi和http://localhost:8882/hi，返回结果都变为新更改的版本号
 ![Image text](https://github.com/iot-wangshuyu/springcloud/blob/master/config-server/src/main/resources/static/TIM%E6%88%AA%E5%9B%BE20171201164614.png)
  
