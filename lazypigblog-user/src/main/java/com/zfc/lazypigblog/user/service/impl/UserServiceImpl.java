package com.zfc.lazypigblog.user.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.zfc.lazypigblog.common.api.CommonResult;
import com.zfc.lazypigblog.common.constant.AuthConstant;
import com.zfc.lazypigblog.common.domain.UserDto;
import com.zfc.lazypigblog.user.feign.AuthFeignService;
import com.zfc.lazypigblog.user.mapper.UserMapper;
import com.zfc.lazypigblog.user.model.User;
import com.zfc.lazypigblog.user.model.UserExample;
import com.zfc.lazypigblog.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User服务实现类
 * @Author zfc
 * @Date 2020/10/11
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private AuthFeignService authFeignService;

    @Override
    public CommonResult<Map<String, String>> login(String username, String password) {
        Map<String, String> params = new HashMap<>();
        if(StrUtil.isEmpty(username)||StrUtil.isEmpty(password)){
            return CommonResult.failed("用户名或密码不能为空！");
        }
        params.put("client_id", AuthConstant.WEB_CLIENT_ID);
        params.put("client_secret","123456");
        params.put("grant_type","password");
        params.put("username",username);
        params.put("password",password);
        return authFeignService.getAccessToken(params);
    }

    @Override
    public User getUserByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if (CollUtil.isNotEmpty(userList)) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public UserDto loadUserByUsername(String username) {
        //获取用户信息
        User user = getUserByUsername(username);
        if (user != null) {
            UserDto userDTO = new UserDto();
            BeanUtils.copyProperties(user,userDTO);
            return userDTO;
        }
        return null;
    }
}
