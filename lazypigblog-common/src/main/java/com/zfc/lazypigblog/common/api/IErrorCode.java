package com.zfc.lazypigblog.common.api;


/**
 * 封装API的错误码
 * @Author zfc
 * @Date 2020/10/11
 */
public interface IErrorCode {

    Long getCode();

    String getMessage();
}
