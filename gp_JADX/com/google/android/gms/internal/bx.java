package com.google.android.gms.internal;

import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;

final class bx implements DeathRecipient {
    public final WeakReference f26539a;

    public bx(bv bvVar) {
        this.f26539a = new WeakReference(bvVar);
    }

    public final void binderDied() {
        bv bvVar = (bv) this.f26539a.get();
        if (bvVar != null) {
            Log.e("CAR.CLIENT", "ICar died!");
            bvVar.f26533r.mo4707b();
            bvVar.m24236b();
            bvVar.m24238d();
            cc ccVar = bvVar.f26516a;
            RemoteException remoteException = new RemoteException("ICar died");
            ccVar.mo4512g();
        }
    }
}
