package com.google.android.gms.internal;

import com.google.android.gms.common.C5095d;
import java.util.concurrent.atomic.AtomicReference;

final class ie implements Runnable {
    public /* synthetic */ AtomicReference f26978a;
    public /* synthetic */ zzcqw f26979b;
    public /* synthetic */ String f26980c;
    public /* synthetic */ ib f26981d;

    ie(ib ibVar, AtomicReference atomicReference, zzcqw com_google_android_gms_internal_zzcqw, String str) {
        this.f26981d = ibVar;
        this.f26978a = atomicReference;
        this.f26979b = com_google_android_gms_internal_zzcqw;
        this.f26980c = str;
    }

    public final void run() {
        hy j = this.f26981d.p.m24767j();
        AtomicReference atomicReference = this.f26978a;
        zzcqw com_google_android_gms_internal_zzcqw = this.f26979b;
        String str = this.f26980c;
        j.mo4728b();
        j.m24432x();
        if (C5095d.m23655a(j.mo4736j()) != 0) {
            j.mo4742p().f26847f.m24652a("Not bundling data. Service unavailable or out of date");
            synchronized (atomicReference) {
                atomicReference.set(new byte[0]);
                atomicReference.notify();
            }
            return;
        }
        j.m24828a(new iq(j, atomicReference, com_google_android_gms_internal_zzcqw, str));
    }
}
