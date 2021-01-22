package com.zfc.lazypigblog.article.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis 配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zfc.lazypigblog.article.mapper","com.zfc.lazypigblog.article.dao"})
public class MyBatisConfig {
}
