package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.C4723a;
import com.google.android.finsky.verifier.C4725c;

final class au implements ServiceConnection {
    public final /* synthetic */ ar f24405a;

    au(ar arVar) {
        this.f24405a = arVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = 0;
        C4723a c4723a = null;
        bb.m21791a();
        FinskyLog.m21659a("Single user settings service is connected", new Object[0]);
        ar arVar = this.f24405a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.verifier.ISingleUserSettingsService");
            if (queryLocalInterface instanceof C4723a) {
                c4723a = (C4723a) queryLocalInterface;
            } else {
                c4723a = new C4725c(iBinder);
            }
        }
        arVar.f24399c = c4723a;
        synchronized (this.f24405a.f24400d) {
            while (i < this.f24405a.f24400d.size()) {
                ((Runnable) this.f24405a.f24400d.get(i)).run();
                i++;
            }
            this.f24405a.f24400d.clear();
        }
        ar arVar2 = this.f24405a;
        synchronized (arVar2.f24400d) {
            if (arVar2.f24398b == null) {
                return;
            }
            arVar2.f24399c = null;
            arVar2.f24397a.unbindService(arVar2.f24398b);
            arVar2.f24398b = null;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
