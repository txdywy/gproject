package com.squareup.okhttp.internal.http;

import java.io.IOException;
import java.lang.reflect.Method;

public final class RouteException extends Exception {
    public static final Method f39593a;
    public IOException f39594b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f39594b = iOException;
    }

    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception e) {
            declaredMethod = null;
        }
        f39593a = declaredMethod;
    }
}
