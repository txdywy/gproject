package com.google.android.finsky.cm;

import com.google.android.finsky.installer.C3300k;

final class C2295b implements Runnable {
    public final /* synthetic */ String f11327a;
    public final /* synthetic */ boolean f11328b;
    public final /* synthetic */ C2293a f11329c;

    C2295b(C2293a c2293a, String str, boolean z) {
        this.f11329c = c2293a;
        this.f11327a = str;
        this.f11328b = z;
    }

    public final void run() {
        ((C3300k) this.f11329c.f11322b.mo1a()).mo3449c(this.f11327a, this.f11328b);
    }
}
