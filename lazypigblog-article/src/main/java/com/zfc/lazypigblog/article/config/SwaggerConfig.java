package com.zfc.lazypigblog.article.config;


import com.zfc.lazypigblog.common.config.BaseSwaggerConfig;
import com.zfc.lazypigblog.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.zfc.lazypigblog.article.controller")
                .title("懒猪博客")
                .description("懒猪博客文章模块接口文档")
                .contactName("zfc")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
