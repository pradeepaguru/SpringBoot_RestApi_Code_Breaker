package com.gold.exceptionHandling;

public class DepartmentIDNotFound extends Exception{
    public DepartmentIDNotFound() {
        super();
    }

    public DepartmentIDNotFound(String message) {
        super(message);
    }

    public DepartmentIDNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentIDNotFound(Throwable cause) {
        super(cause);
    }

    protected DepartmentIDNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
