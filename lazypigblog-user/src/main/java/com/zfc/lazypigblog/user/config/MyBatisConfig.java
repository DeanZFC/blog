package com.zfc.lazypigblog.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis 配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zfc.lazypigblog.user.mapper","com.zfc.lazypigblog.user.dao"})
public class MyBatisConfig {
}
