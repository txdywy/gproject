package com.google.android.instantapps.supervisor.reflect;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@UsedByReflection
public class ReflectionUtils {
    public static Object m27268a(Method method, Object... objArr) {
        try {
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            throw new ReflectiveException(e);
        } catch (InvocationTargetException e2) {
            throw m27266a(e2);
        }
    }

    public static Class m27267a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new ReflectiveException(e);
        }
    }

    private static ReflectiveException m27266a(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if ((cause instanceof RuntimeException) && ((cause instanceof SecurityException) || (cause instanceof BadParcelableException) || (cause instanceof IllegalArgumentException) || (cause instanceof NullPointerException) || (cause instanceof IllegalStateException) || (cause instanceof NetworkOnMainThreadException) || (cause instanceof UnsupportedOperationException))) {
            RuntimeException runtimeException;
            try {
                Constructor declaredConstructor = cause.getClass().getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                runtimeException = (RuntimeException) declaredConstructor.newInstance(new Object[0]);
                try {
                    runtimeException.initCause(invocationTargetException);
                } catch (NoSuchMethodException e) {
                } catch (IllegalAccessException e2) {
                } catch (InstantiationException e3) {
                } catch (InvocationTargetException e4) {
                }
            } catch (NoSuchMethodException e5) {
                runtimeException = null;
            } catch (IllegalAccessException e6) {
                runtimeException = null;
            } catch (InstantiationException e7) {
                runtimeException = null;
            } catch (InvocationTargetException e8) {
                runtimeException = null;
            }
            if (runtimeException != null) {
                throw runtimeException;
            }
        }
        return new ReflectiveException(invocationTargetException);
    }
}
