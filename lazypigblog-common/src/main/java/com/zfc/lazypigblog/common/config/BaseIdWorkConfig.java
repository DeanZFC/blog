package com.zfc.lazypigblog.common.config;

import com.zfc.lazypigblog.common.utils.IdWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 添加IdWork
 * @Author zfc
 * @Date 2020/10/18
 */
public class BaseIdWorkConfig {

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
