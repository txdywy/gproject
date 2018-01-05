package com.google.protobuf;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class eb implements PrivilegedExceptionAction {
    eb() {
    }

    public final /* synthetic */ Object run() {
        Class cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        return null;
    }
}
