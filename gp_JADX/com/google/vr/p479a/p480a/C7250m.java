package com.google.vr.p479a.p480a;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class C7250m extends C7248k {
    public final Object f35523a;

    private C7250m(Object obj) {
        this.f35523a = obj;
    }

    public static C7247j m33871a(Object obj) {
        return new C7250m(obj);
    }

    public static Object m33872a(C7247j c7247j) {
        if (c7247j == null) {
            return null;
        }
        if (c7247j instanceof C7250m) {
            return ((C7250m) c7247j).f35523a;
        }
        IBinder asBinder = c7247j.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
