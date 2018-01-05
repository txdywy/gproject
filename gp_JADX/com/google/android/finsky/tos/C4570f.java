package com.google.android.finsky.tos;

import com.google.android.finsky.aa.C0954a;

final class C4570f implements Runnable {
    public final /* synthetic */ String f23368a;
    public final /* synthetic */ String f23369b;
    public final /* synthetic */ C4569e f23370c;

    C4570f(C4569e c4569e, String str, String str2) {
        this.f23370c = c4569e;
        this.f23368a = str;
        this.f23369b = str2;
    }

    public final void run() {
        this.f23370c.m21202a(this.f23368a, this.f23369b, (Boolean) C0954a.f5810F.m5777b(this.f23368a).m5760a());
    }
}
