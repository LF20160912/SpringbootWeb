package com.mike.boot.bootservlet.exception;

/**
 * 自定义错误异常
 */
public class BizExceptionHandler extends RuntimeException {
    public BizExceptionHandler() {
        super();
    }

    public BizExceptionHandler(String message) {
        super(message);
    }

    public BizExceptionHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public BizExceptionHandler(Throwable cause) {
        super(cause);
    }

    protected BizExceptionHandler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
