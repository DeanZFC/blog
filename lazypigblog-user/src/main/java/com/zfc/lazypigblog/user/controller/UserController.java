package com.zfc.lazypigblog.user.controller;

import com.zfc.lazypigblog.common.api.CommonResult;
import com.zfc.lazypigblog.common.domain.UserDto;
import com.zfc.lazypigblog.user.dto.UserLoginParam;
import com.zfc.lazypigblog.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 用户请求Controller
 * @Author zfc
 * @Date 2020/10/11
 */
@RestController
@RequestMapping("/user")
@Api(tags = "UserController", value = "用户")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "登录")
    @PostMapping("/login")
    public CommonResult<Map<String, String>> login(@RequestBody UserLoginParam userLoginParam){
        return userService.login(userLoginParam.getUsername(), userLoginParam.getPassword());
    }



    @ApiOperation(value = "auth获取用户信息")
    @GetMapping("/loadByUsername")
    public UserDto loadUserByUsername(@RequestParam String username) {
        return userService.loadUserByUsername(username);
    }

}
