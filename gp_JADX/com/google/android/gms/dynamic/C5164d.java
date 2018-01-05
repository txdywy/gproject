package com.google.android.gms.dynamic;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class C5164d extends C5162b {
    public final Object f26105a;

    private C5164d(Object obj) {
        this.f26105a = obj;
    }

    public static C5161a m23906a(Object obj) {
        return new C5164d(obj);
    }

    public static Object m23907a(C5161a c5161a) {
        int i = 0;
        if (c5161a instanceof C5164d) {
            return ((C5164d) c5161a).f26105a;
        }
        IBinder asBinder = c5161a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
