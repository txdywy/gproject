package com.squareup.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C7645e {
    public final Class f39580a;
    public final String f39581b;
    public final Class[] f39582c;

    public C7645e(Class cls, String str, Class... clsArr) {
        this.f39580a = cls;
        this.f39581b = str;
        this.f39582c = clsArr;
    }

    public final boolean m36883a(Object obj) {
        return m36878a(obj.getClass()) != null;
    }

    private final Object m36880c(Object obj, Object... objArr) {
        Object obj2 = null;
        Method a = m36878a(obj.getClass());
        if (a != null) {
            try {
                obj2 = a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
            }
        }
        return obj2;
    }

    public final Object m36882a(Object obj, Object... objArr) {
        try {
            return m36880c(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private final Object m36881d(Object obj, Object... objArr) {
        Object a = m36878a(obj.getClass());
        if (a == null) {
            throw new AssertionError("Method " + this.f39581b + " not supported for object " + obj);
        }
        try {
            return a.invoke(obj, objArr);
        } catch (Throwable e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object m36884b(Object obj, Object... objArr) {
        try {
            return m36881d(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private final Method m36878a(Class cls) {
        if (this.f39581b == null) {
            return null;
        }
        Method a = C7645e.m36879a(cls, this.f39581b, this.f39582c);
        if (a == null || this.f39580a == null || this.f39580a.isAssignableFrom(a.getReturnType())) {
            return a;
        }
        return null;
    }

    private static Method m36879a(Class cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException e) {
                return method;
            }
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }
}
