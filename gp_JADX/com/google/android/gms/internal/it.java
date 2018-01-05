package com.google.android.gms.internal;

final class it implements Runnable {
    public /* synthetic */ boolean f27022a;
    public /* synthetic */ zzcvg f27023b;
    public /* synthetic */ il f27024c;

    it(il ilVar, boolean z, zzcvg com_google_android_gms_internal_zzcvg) {
        this.f27024c = ilVar;
        this.f27022a = z;
        this.f27023b = com_google_android_gms_internal_zzcvg;
    }

    public final void run() {
        gu guVar = this.f27024c.f27000b;
        if (guVar == null) {
            this.f27024c.mo4742p().f26845d.m24652a("Discarding data. Failed to set user attribute");
            return;
        }
        this.f27024c.m24826a(guVar, this.f27022a ? null : this.f27023b);
        this.f27024c.m24848u();
    }
}
