package com.zfc.lazypigblog.user.service;

import com.zfc.lazypigblog.common.api.CommonResult;
import com.zfc.lazypigblog.user.model.User;

import java.util.Map;

/**
 * User服务类
 * @Author zfc
 * @Date 2020/10/11
 */
public interface UserService {

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return CommonResult
     */
    CommonResult<Map<String, Object>> login(String username, String password);


    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    User getUserByUsername(String username);



}
