package com.google.common.p420f.p421a;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

class C6994l implements PrivilegedExceptionAction {
    C6994l() {
    }

    public /* synthetic */ Object run() {
        Class cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
