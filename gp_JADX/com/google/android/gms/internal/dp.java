package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.C5155j;
import java.lang.reflect.InvocationTargetException;

public final class dp {
    public static Context f26664a;
    public static Boolean f26665b;

    public static synchronized boolean m24293a(Context context) {
        boolean booleanValue;
        synchronized (dp.class) {
            Context applicationContext = context.getApplicationContext();
            if (f26664a == null || f26665b == null || f26664a != applicationContext) {
                f26665b = null;
                if (C5155j.m23890c()) {
                    try {
                        f26665b = (Boolean) PackageManager.class.getDeclaredMethod("isInstantApp", new Class[0]).invoke(applicationContext.getPackageManager(), new Object[0]);
                    } catch (NoSuchMethodException e) {
                        f26665b = Boolean.valueOf(false);
                        f26664a = applicationContext;
                        booleanValue = f26665b.booleanValue();
                        return booleanValue;
                    } catch (InvocationTargetException e2) {
                        f26665b = Boolean.valueOf(false);
                        f26664a = applicationContext;
                        booleanValue = f26665b.booleanValue();
                        return booleanValue;
                    } catch (IllegalAccessException e3) {
                        f26665b = Boolean.valueOf(false);
                        f26664a = applicationContext;
                        booleanValue = f26665b.booleanValue();
                        return booleanValue;
                    }
                }
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f26665b = Boolean.valueOf(true);
                } catch (ClassNotFoundException e4) {
                    f26665b = Boolean.valueOf(false);
                }
                f26664a = applicationContext;
                booleanValue = f26665b.booleanValue();
            } else {
                booleanValue = f26665b.booleanValue();
            }
        }
        return booleanValue;
    }
}
