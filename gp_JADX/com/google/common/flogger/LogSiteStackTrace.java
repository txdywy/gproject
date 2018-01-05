package com.google.common.flogger;

public final class LogSiteStackTrace extends Exception {
    LogSiteStackTrace(Throwable th, C7077u c7077u, StackTraceElement[] stackTraceElementArr) {
        super(c7077u.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
