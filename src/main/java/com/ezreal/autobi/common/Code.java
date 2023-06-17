package com.ezreal.autobi.common;

public enum Code {
    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    NO_AUTH_ERROR(40101, "无权限"),
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    FORBIDDEN_ERROR(40300, "禁止访问"),
    SYSTEM_ERROR(50000, "系统内部异常"),
    SYSTEM_BUSY(50002, "系统繁忙"),
    OPERATION_ERROR(50001, "操作失败");

    private final int code;
    private final String message;

    Code(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static class ShiroCode {

        public final static String SALT = "ezreal";
        public final static int HASH_ITERATIONS = 3;
        public final static String MD5_ALGORITHM = "md5";
    }
}
