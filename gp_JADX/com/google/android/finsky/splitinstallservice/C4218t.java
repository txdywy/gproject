package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class C4218t implements Runnable {
    public final C4215q f21288a;
    public final String f21289b;
    public final C4196a f21290c;
    public final C6279c f21291d;

    C4218t(C4215q c4215q, String str, C4196a c4196a, C6279c c6279c) {
        this.f21288a = c4215q;
        this.f21289b = str;
        this.f21290c = c4196a;
        this.f21291d = c6279c;
    }

    public final void run() {
        C4215q c4215q = this.f21288a;
        String str = this.f21289b;
        C4196a c4196a = this.f21290c;
        C6279c c6279c = this.f21291d;
        c4215q.m19615a(c4215q.f21262b.m16742a(str), c6279c, new C4219u(c4215q, c4196a.f21137b, str, c6279c));
    }
}
