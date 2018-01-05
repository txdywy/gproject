package com.google.android.gms.internal;

import android.os.RemoteException;

final class io implements Runnable {
    public /* synthetic */ il f27009a;

    io(il ilVar) {
        this.f27009a = ilVar;
    }

    public final void run() {
        gu guVar = this.f27009a.f27000b;
        if (guVar == null) {
            this.f27009a.mo4742p().f26845d.m24652a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            guVar.mo4750a(this.f27009a.mo4731e().m24555a(this.f27009a.mo4742p().m24651t()));
            this.f27009a.m24826a(guVar, null);
            this.f27009a.m24848u();
        } catch (RemoteException e) {
            this.f27009a.mo4742p().f26845d.m24653a("Failed to send app launch to the service", e);
        }
    }
}
