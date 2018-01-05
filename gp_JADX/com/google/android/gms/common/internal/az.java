package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public final class az implements ServiceConnection {
    public final int f25998a;
    public /* synthetic */ ar f25999b;

    public az(ar arVar, int i) {
        this.f25999b = arVar;
        this.f25998a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            ar.m22990a(this.f25999b);
            return;
        }
        synchronized (this.f25999b.f25422o) {
            C5133x c5133x;
            ar arVar = this.f25999b;
            if (iBinder == null) {
                c5133x = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c5133x = (queryLocalInterface == null || !(queryLocalInterface instanceof C5133x)) ? new C5135z(iBinder) : (C5133x) queryLocalInterface;
            }
            arVar.f25423p = c5133x;
        }
        this.f25999b.m23007a(0, this.f25998a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f25999b.f25422o) {
            this.f25999b.f25423p = null;
        }
        this.f25999b.f25420m.sendMessage(this.f25999b.f25420m.obtainMessage(6, this.f25998a, 1));
    }
}
