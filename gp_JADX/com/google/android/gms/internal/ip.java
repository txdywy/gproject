package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.measurement.C5312g;

final class ip implements Runnable {
    public /* synthetic */ C5312g f27010a;
    public /* synthetic */ il f27011b;

    ip(il ilVar, C5312g c5312g) {
        this.f27011b = ilVar;
        this.f27010a = c5312g;
    }

    public final void run() {
        gu guVar = this.f27011b.f27000b;
        if (guVar == null) {
            this.f27011b.mo4742p().f26845d.m24652a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f27010a == null) {
                guVar.mo4749a(0, null, null, this.f27011b.mo4736j().getPackageName());
            } else {
                guVar.mo4749a(this.f27010a.f26997d, this.f27010a.f26995b, this.f27010a.f26996c, this.f27011b.mo4736j().getPackageName());
            }
            this.f27011b.m24848u();
        } catch (RemoteException e) {
            this.f27011b.mo4742p().f26845d.m24653a("Failed to send current screen to the service", e);
        }
    }
}
