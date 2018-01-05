package com.google.android.finsky.activities;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.installapi.C3267a;
import com.google.android.finsky.installapi.C3269c;

final class ap implements ServiceConnection {
    public final /* synthetic */ C1033t f6460a;

    ap(C1033t c1033t) {
        this.f6460a = c1033t;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3267a c3267a;
        C1033t c1033t = this.f6460a;
        if (iBinder == null) {
            c3267a = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installapi.IPlayInstallService");
            if (queryLocalInterface instanceof C3267a) {
                c3267a = (C3267a) queryLocalInterface;
            } else {
                c3267a = new C3269c(iBinder);
            }
        }
        c1033t.f6311f = c3267a;
        this.f6460a.m6049b();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6460a.f6311f = null;
        this.f6460a.m6049b();
    }
}
