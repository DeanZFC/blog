package com.zfc.lazypigblog.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 登录用户信息
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UserDto implements Serializable {
    private String id;
    private String username;
    private String password;
    private Byte status;
    private String clientId;
    private List<String> roles;

}
