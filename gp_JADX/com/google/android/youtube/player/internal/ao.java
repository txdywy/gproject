package com.google.android.youtube.player.internal;

import android.os.IBinder;
import java.lang.reflect.Field;

public final class ao extends am {
    public final Object f33847a;

    private ao(Object obj) {
        this.f33847a = obj;
    }

    public static al m31116a(Object obj) {
        return new ao(obj);
    }

    public static Object m31117a(al alVar) {
        if (alVar instanceof ao) {
            return ((ao) alVar).f33847a;
        }
        IBinder asBinder = alVar.asBinder();
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
