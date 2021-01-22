package com.zfc.lazypigblog.user;

import com.zfc.lazypigblog.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;

/**
 * User模块启动类
 * @Author zfc
 * @Date 2020/10/11
 */
@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Bean
    public IdWorker getIdWorker(){
        return new IdWorker();
    }
}
