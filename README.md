# lazypigblog
懒猪博客

## 项目介绍
`lazypigblog`是一套微服务博客系统，采用了 Spring Cloud Hoxton & Alibaba、Spring Boot 2.3、Oauth2、MyBatis、Docker等核心技术。`lazypigblog`在博客业务的基础集成了注册中心、配置中心、监控中心、网关等系统功能。

## 组织结构

``` lua
lazypigblog
├── lazypigblog-common -- 工具类及通用代码模块
├── lazypigblog-common-db -- 数据库通用代码模块
├── lazypigblog-mbg -- MyBatisGenerator生成的数据库操作代码模块
├── lazypigblog-auth -- 基于Spring Security Oauth2的统一的认证中心
├── lazypigblog-gateway -- 基于Spring Cloud Gateway的微服务API网关服务
├── lazypigblog-monitor -- 基于Spring Boot Admin的微服务监控中心
├── lazypigblog-user -- 用户微服务模块
└── lazypigblog-article -- 文章微服务模块
```

## 技术选型
| 技术                   | 说明                 | 官网                                                 |
| ---------------------- | -------------------- | ---------------------------------------------------- |
| Spring Cloud           | 微服务框架           | https://spring.io/projects/spring-cloud              |
| Spring Cloud Alibaba   | 微服务框架           | https://github.com/alibaba/spring-cloud-alibaba      |
| Spring Boot            | 容器+MVC框架         | https://spring.io/projects/spring-boot               |
| Spring Security Oauth2 | 认证和授权框架       | https://spring.io/projects/spring-security-oauth     |
| MyBatis                | ORM框架              | http://www.mybatis.org/mybatis-3/zh/index.html       |
| MyBatisGenerator       | 数据层代码生成       | http://www.mybatis.org/generator/index.html          |
| PageHelper             | MyBatis物理分页插件  | http://git.oschina.net/free/Mybatis_PageHelper       |
| Knife4j                | 文档生产工具         | https://github.com/xiaoymin/swagger-bootstrap-ui     |
| RabbitMq               | 消息队列             | https://www.rabbitmq.com/                            |
| Redis                  | 分布式缓存           | https://redis.io/                                    |
| Docker                 | 应用容器引擎         | https://www.docker.com/                              |
| Druid                  | 数据库连接池         | https://github.com/alibaba/druid                     |
| JWT                    | JWT登录支持          | https://github.com/jwtk/jjwt                         |
| Lombok                 | 简化对象封装工具     | https://github.com/rzwitserloot/lombok               |
| Jenkins                | 自动化部署工具       | https://github.com/jenkinsci/jenkins                 |

## 运行效果展示
- 查看注册中心注册服务信息，访问地址：http://192.168.1.112:8848/nacos/
![](http://116.62.110.148/img/discovery.png)

- 查看注册中心配置信息，访问地址：http://192.168.1.112:8848/nacos/
![](http://116.62.110.148/img/config.png)

- 监控中心应用信息，访问地址：http://192.168.1.112:8101
![](http://116.62.110.148/img/admin1.png)
![](http://116.62.110.148/img/admin2.png)

- API文档信息，访问地址：http://192.168.1.112:8888/doc.html
![](http://116.62.110.148/img/Knife4j.png)