package com.zfc.lazypigblog.user.feign;

import com.zfc.lazypigblog.common.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 认证服务远程调用
 * @Author zfc
 * @Date 2020/10/11
 */

@FeignClient(value = "lazypigblog-auth")
public interface AuthFeignService {

    /**
     * 从认证中心获取token
     * @param params
     * @return
     */
    @PostMapping("/oauth/token")
    @ResponseBody
    CommonResult<Map<String, String>> getAccessToken(@RequestParam Map<String, String> params);
}
