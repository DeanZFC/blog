package com.zfc.lazypigblog.user.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Feign 配置类
 */
@Configuration
@EnableFeignClients(basePackages = {"com.zfc.lazypigblog.user.feign"})
public class FeignConfig {
}
