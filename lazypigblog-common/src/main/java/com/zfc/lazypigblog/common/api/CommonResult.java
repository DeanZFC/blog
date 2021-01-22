package com.zfc.lazypigblog.common.api;

/**
 * 通用返回对象
 * @Author zfc
 * @Date 2020/10/11
 */
public class CommonResult<T> {
    private Long code;
    private Boolean flag;
    private String message;
    private T data;

    protected CommonResult() {
    }

    protected CommonResult(Long code, Boolean flag, String message, T data) {
        this.code = code;
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data 数据
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), true, ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     * @param data 数据
     * @param message 成功信息
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), true, message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<>(errorCode.getCode(), false, errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     * @param message 错误信息
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode, String message) {
        return new CommonResult<>(errorCode.getCode(), false, message, null);
    }

    /**
     * 失败返回结果
     * @param message 错误信息
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), false, message, null);
    }

    /**
     * 失败返回结果
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     * @param message 错误信息
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<>(ResultCode.VALIDATE_FAILED.getCode(), false, message, null);
    }

    /**
     * 未登录返回结果
     * @param data 数据
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(), false, ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     * @param data 数据
     * @param <T> 数据类型
     * @return CommonResult
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<>(ResultCode.FORBIDDEN.getCode(), false, ResultCode.FORBIDDEN.getMessage(), data);
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
