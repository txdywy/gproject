package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C5091z;
import java.lang.ref.WeakReference;

final class cb implements DeathRecipient, cc {
    public final WeakReference f25788a;
    public final WeakReference f25789b;
    public final WeakReference f25790c;

    cb(ct ctVar, C5091z c5091z, IBinder iBinder) {
        this.f25789b = new WeakReference(c5091z);
        this.f25788a = new WeakReference(ctVar);
        this.f25790c = new WeakReference(iBinder);
    }

    private final void m23515a() {
        ct ctVar = (ct) this.f25788a.get();
        C5091z c5091z = (C5091z) this.f25789b.get();
        if (!(c5091z == null || ctVar == null)) {
            ctVar.mo4493d().intValue();
            c5091z.m23653a();
        }
        IBinder iBinder = (IBinder) this.f25790c.get();
        if (iBinder != null) {
            iBinder.unlinkToDeath(this, 0);
        }
    }

    public final void mo4591a(ct ctVar) {
        m23515a();
    }

    public final void binderDied() {
        m23515a();
    }
}
