package com.google.common.flogger.p423b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C7012c {
    public final Object f34488a;
    public final Method f34489b;
    public final Method f34490c;

    public static C7012c m31955a() {
        try {
            Object invoke = Class.forName("sun.misc.SharedSecrets").getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
            Method method = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceElement", new Class[]{Throwable.class, Integer.TYPE});
            Method method2 = Class.forName("sun.misc.JavaLangAccess").getMethod("getStackTraceDepth", new Class[]{Throwable.class});
            method.invoke(invoke, new Object[]{new Throwable(), Integer.valueOf(0)});
            ((Integer) method2.invoke(invoke, new Object[]{new Throwable()})).intValue();
            return new C7012c(invoke, method, method2);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return null;
        }
    }

    private C7012c(Object obj, Method method, Method method2) {
        this.f34488a = obj;
        this.f34489b = method;
        this.f34490c = method2;
    }

    public final StackTraceElement m31957a(Throwable th, int i) {
        try {
            return (StackTraceElement) this.f34489b.invoke(this.f34488a, new Object[]{th, Integer.valueOf(i)});
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final int m31956a(Throwable th) {
        try {
            return ((Integer) this.f34490c.invoke(this.f34488a, new Object[]{th})).intValue();
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e.getCause());
            } else if (e.getCause() instanceof Error) {
                throw ((Error) e.getCause());
            } else {
                throw new RuntimeException(e.getCause());
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
