package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;

@C5302b
public class xw {
    public ye f27724a;
    public final Object f27725b = new Object();
    public final ze f27726c;

    public xw(ze zeVar) {
        this.f27726c = zeVar;
    }

    private static ye m25989b() {
        try {
            Object newInstance = xw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                return queryLocalInterface instanceof ye ? (ye) queryLocalInterface : new yf(iBinder);
            } else {
                ap.m24193c("ClientApi class is not an instance of IBinder");
                return null;
            }
        } catch (Throwable e) {
            ap.m24194c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    final ye m25990a() {
        ye yeVar;
        synchronized (this.f27725b) {
            if (this.f27724a == null) {
                this.f27724a = m25989b();
            }
            yeVar = this.f27724a;
        }
        return yeVar;
    }
}
