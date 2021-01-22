package com.zfc.lazypigblog.user.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.zfc.lazypigblog.common.api.CommonResult;
import com.zfc.lazypigblog.common.utils.JWTUtil;
import com.zfc.lazypigblog.user.mapper.UserMapper;
import com.zfc.lazypigblog.user.model.User;
import com.zfc.lazypigblog.user.model.UserExample;
import com.zfc.lazypigblog.user.service.UserService;
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

    @Override
    public CommonResult<Map<String, Object>> login(String username, String password) {
        Map<String, String> params = new HashMap<>();
        if(StrUtil.isEmpty(username)||StrUtil.isEmpty(password)){
            return CommonResult.failed("用户名或密码不能为空！");
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        User user = userMapper.selectByExample(userExample).get(0);
        if (user == null || !BCrypt.checkpw(user.getPassword(),password)){
            return CommonResult.failed("用户名或密码错误！");
        }
        Map<String ,Object> result = new HashMap<>();
        result.put("token", JWTUtil.createToken(user.getId()));
        return CommonResult.success(result);
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

}
