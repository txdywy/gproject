package com.google.android.finsky.dc;

import com.google.android.finsky.download.C2839b;

final class C2564j implements Runnable {
    public final /* synthetic */ String f13676a;
    public final /* synthetic */ C2839b f13677b;
    public final /* synthetic */ C2561g f13678c;

    C2564j(C2561g c2561g, String str, C2839b c2839b) {
        this.f13678c = c2561g;
        this.f13676a = str;
        this.f13677b = c2839b;
    }

    public final void run() {
        this.f13678c.f13672p.mo3822a(this.f13677b.mo3162l(), this.f13678c.f13664g, this.f13678c.f13665h, new C2565k(this), false, "");
    }
}
