package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;

final class is implements Runnable {
    public /* synthetic */ boolean f27017a = true;
    public /* synthetic */ boolean f27018b;
    public /* synthetic */ zzcqw f27019c;
    public /* synthetic */ String f27020d;
    public /* synthetic */ il f27021e;

    is(il ilVar, boolean z, zzcqw com_google_android_gms_internal_zzcqw, String str) {
        this.f27021e = ilVar;
        this.f27018b = z;
        this.f27019c = com_google_android_gms_internal_zzcqw;
        this.f27020d = str;
    }

    public final void run() {
        gu guVar = this.f27021e.f27000b;
        if (guVar == null) {
            this.f27021e.mo4742p().f26845d.m24652a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f27017a) {
            this.f27021e.m24826a(guVar, this.f27018b ? null : this.f27019c);
        } else {
            try {
                if (TextUtils.isEmpty(this.f27020d)) {
                    guVar.mo4752a(this.f27019c, this.f27021e.mo4731e().m24555a(this.f27021e.mo4742p().m24651t()));
                } else {
                    guVar.mo4753a(this.f27019c, this.f27020d, this.f27021e.mo4742p().m24651t());
                }
            } catch (RemoteException e) {
                this.f27021e.mo4742p().f26845d.m24653a("Failed to send event to the service", e);
            }
        }
        this.f27021e.m24848u();
    }
}
