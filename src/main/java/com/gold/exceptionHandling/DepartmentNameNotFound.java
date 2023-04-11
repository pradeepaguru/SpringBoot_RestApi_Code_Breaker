package com.gold.exceptionHandling;

public class DepartmentNameNotFound extends Exception{

    public DepartmentNameNotFound() {
        super();
    }

    public DepartmentNameNotFound(String message) {
        super(message);
    }

    public DepartmentNameNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNameNotFound(Throwable cause) {
        super(cause);
    }

    protected DepartmentNameNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
