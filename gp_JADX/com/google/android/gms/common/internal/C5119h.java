package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class C5119h {
    public static final Object f26039a = new Object();
    public static C5119h f26040b;

    public static C5119h m23789a(Context context) {
        synchronized (f26039a) {
            if (f26040b == null) {
                f26040b = new C5121j(context.getApplicationContext());
            }
        }
        return f26040b;
    }

    public final void m23790a(ComponentName componentName, ServiceConnection serviceConnection) {
        mo4623b(new C5120i(componentName), serviceConnection);
    }

    public final void m23791a(String str, String str2, int i, ServiceConnection serviceConnection) {
        mo4623b(new C5120i(str, str2, i), serviceConnection);
    }

    public abstract boolean mo4622a(C5120i c5120i, ServiceConnection serviceConnection);

    protected abstract void mo4623b(C5120i c5120i, ServiceConnection serviceConnection);
}
