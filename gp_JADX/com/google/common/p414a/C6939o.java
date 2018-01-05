package com.google.common.p414a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class C6939o {
    public static final Object f34268a;

    public static void m31642a(Throwable th) {
        C6937m.m31623a((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException m31643b(Throwable th) {
        C6939o.m31642a(th);
        throw new RuntimeException(th);
    }

    private static Object m31640a() {
        Object obj = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return obj;
    }

    private static Method m31644b() {
        try {
            Method a = C6939o.m31641a("getStackTraceDepth", Throwable.class);
            if (a == null) {
                return null;
            }
            a.invoke(C6939o.m31640a(), new Object[]{new Throwable()});
            return a;
        } catch (UnsupportedOperationException e) {
            return null;
        } catch (IllegalAccessException e2) {
            return null;
        } catch (InvocationTargetException e3) {
            return null;
        }
    }

    private static Method m31641a(String str, Class... clsArr) {
        Method method = null;
        try {
            method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
        }
        return method;
    }

    static {
        Object a = C6939o.m31640a();
        f34268a = a;
        if (a != null) {
            C6939o.m31641a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f34268a != null) {
            C6939o.m31644b();
        }
    }
}
