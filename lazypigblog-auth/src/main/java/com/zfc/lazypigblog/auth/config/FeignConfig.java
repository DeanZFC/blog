package com.zfc.lazypigblog.auth.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Feign配置类
 */
@Configuration
@EnableFeignClients({"com.zfc.lazypigblog.auth.feign"})
public class FeignConfig {
}
