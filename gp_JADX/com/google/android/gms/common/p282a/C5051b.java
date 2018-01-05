package com.google.android.gms.common.p282a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C5151f;

public final class C5051b {
    public static final Object f25618a = new Object();
    public static volatile C5051b f25619b;

    private C5051b() {
    }

    public static C5051b m23267a() {
        if (f25619b == null) {
            synchronized (f25618a) {
                if (f25619b == null) {
                    f25619b = new C5051b();
                }
            }
        }
        return f25619b;
    }

    public static boolean m23268a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C5151f.m23882a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    public static boolean m23269b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return C5051b.m23268a(context, intent, serviceConnection, i);
    }
}
