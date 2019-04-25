package com.nwx.execption;

/**
 * @version : V1.0
 * @Description: 自定义系统异常
 * @Auther: Neil
 * @Date: 2019/4/25 11:25
 */
public class SystemException extends RuntimeException{

    private static final long serialVersionUID = 4589532733520537066L;

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    protected SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
