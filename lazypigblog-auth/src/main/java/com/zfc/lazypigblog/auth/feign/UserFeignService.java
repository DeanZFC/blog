package com.zfc.lazypigblog.auth.feign;

import com.zfc.lazypigblog.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户服务远程调用
 */
@FeignClient("lazypigblog-user")
public interface UserFeignService {

    /**
     * 根据用户名获取用户
     * @param username String
     * @return UserDto
     */
    @GetMapping("/user/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);

}
