# Springcloud框架搭建和学习

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