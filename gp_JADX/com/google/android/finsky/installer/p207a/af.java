package com.google.android.finsky.installer.p207a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.finsky.installer.C3318d;
import com.google.android.finsky.installer.C3320f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

final class af implements ServiceConnection {
    public final /* synthetic */ C3301s f16865a;

    af(C3301s c3301s) {
        this.f16865a = c3301s;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3318d c3318d;
        int i = 0;
        bb.m21791a();
        C3301s c3301s = this.f16865a;
        if (iBinder == null) {
            c3318d = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.installer.IMultiUserCoordinatorService");
            if (queryLocalInterface instanceof C3318d) {
                c3318d = (C3318d) queryLocalInterface;
            } else {
                c3318d = new C3320f(iBinder);
            }
        }
        c3301s.f17068K = c3318d;
        try {
            this.f16865a.f17068K.mo3466a(this.f16865a.f17070M);
            while (i < this.f16865a.f17069L.size()) {
                ((Runnable) this.f16865a.f17069L.get(i)).run();
                i++;
            }
            this.f16865a.f17069L.clear();
        } catch (RemoteException e) {
            FinskyLog.m21665c("Couldn't register listener *** received %s", e);
            this.f16865a.m16623e();
            this.f16865a.f17069L.clear();
            if (!this.f16865a.f17093w) {
                FinskyLog.m21665c("Force-starting the installer after connection failure", new Object[0]);
                this.f16865a.f17093w = true;
                this.f16865a.m16607a(true);
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
