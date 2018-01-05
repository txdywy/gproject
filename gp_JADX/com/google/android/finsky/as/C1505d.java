package com.google.android.finsky.as;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.p104e.C0942a;
import com.google.android.p104e.C0943b;

final class C1505d implements ServiceConnection {
    public final C1124c f8191a;
    public final Context f8192b;
    public final /* synthetic */ C1504b f8193c;

    C1505d(C1504b c1504b, Context context, C1124c c1124c) {
        this.f8193c = c1504b;
        this.f8192b = context;
        this.f8191a = c1124c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (C1504b.class) {
            C0942a c0942a;
            if (iBinder == null) {
                c0942a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
                if (queryLocalInterface instanceof C0942a) {
                    c0942a = (C0942a) queryLocalInterface;
                } else {
                    c0942a = new C0943b(iBinder);
                }
            }
            try {
                this.f8193c.f8187b = Boolean.valueOf(c0942a.mo1161a());
            } catch (RemoteException e) {
                FinskyLog.m21669e("Error calling school-ownership service; assume not school-owned", new Object[0]);
                this.f8193c.f8187b = Boolean.valueOf(false);
            } finally {
                this.f8192b.unbindService(this);
                this.f8191a.mo1442a(this.f8193c.f8187b.booleanValue());
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
