package com.zfc.lazypigmall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Admin implements Serializable {
    @ApiModelProperty(value = "管理员id")
    private Integer id;

    @ApiModelProperty(value = "管理员登陆名称")
    private String username;

    @ApiModelProperty(value = "管理员登陆密码")
    private String password;

    @ApiModelProperty(value = "管理员显示昵称")
    private String nickName;

    @ApiModelProperty(value = "是否锁定 0未锁定 1已锁定无法登陆")
    private Byte locked;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", locked=").append(locked);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}