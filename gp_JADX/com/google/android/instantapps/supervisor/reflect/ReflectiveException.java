package com.google.android.instantapps.supervisor.reflect;

import java.lang.reflect.InvocationTargetException;

public class ReflectiveException extends Exception {
    public ReflectiveException(InvocationTargetException invocationTargetException) {
        super(invocationTargetException);
    }

    public ReflectiveException(ClassNotFoundException classNotFoundException) {
        super(classNotFoundException);
    }

    public ReflectiveException(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
    }
}
