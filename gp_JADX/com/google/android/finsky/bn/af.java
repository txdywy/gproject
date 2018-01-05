package com.google.android.finsky.bn;

import com.google.wireless.android.finsky.b.a;

final class af implements Runnable {
    public final /* synthetic */ String f10789a;
    public final /* synthetic */ a f10790b;
    public final /* synthetic */ long f10791c;
    public final /* synthetic */ C2134h f10792d;

    af(C2134h c2134h, String str, a aVar, long j) {
        this.f10792d = c2134h;
        this.f10789a = str;
        this.f10790b = aVar;
        this.f10791c = j;
    }

    public final void run() {
        this.f10792d.f10840b.mo2665a(this.f10789a, this.f10790b, this.f10791c);
    }
}
