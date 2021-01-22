# lazypigblog
懒猪博客

## 项目介绍
`lazypigblog`是一套基于SpringBoot博客系统，采用了Spring Boot 2.3、MyBatis、MyBatisGenerator等核心技术。

## 组织结构

``` lua
lazypigblog
├── lazypigblog-common -- 工具类及通用代码模块
├── lazypigblog-common-db -- 数据库通用代码模块
├── lazypigblog-mbg -- MyBatisGenerator生成的数据库操作代码模块
├── lazypigblog-user -- 用户微服务模块
└── lazypigblog-article -- 文章微服务模块
```

## 技术选型
| 技术                   | 说明                 | 官网                                                 |
| ---------------------- | -------------------- | ---------------------------------------------------- |
| Spring Boot            | 容器+MVC框架         | https://spring.io/projects/spring-boot               |
| MyBatis                | ORM框架              | http://www.mybatis.org/mybatis-3/zh/index.html       |
| MyBatisGenerator       | 数据层代码生成       | http://www.mybatis.org/generator/index.html          |
| PageHelper             | MyBatis物理分页插件  | http://git.oschina.net/free/Mybatis_PageHelper       |
| Swagger2                | 文档生产工具         | https://swagger.io/     |
| RabbitMq               | 消息队列             | https://www.rabbitmq.com/                            |
| Redis                  | 分布式缓存           | https://redis.io/                                    |
| Docker                 | 应用容器引擎         | https://www.docker.com/                              |
| Druid                  | 数据库连接池         | https://github.com/alibaba/druid                     |
| JWT                    | JWT登录支持          | https://github.com/jwtk/jjwt                         |


