package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;

final class C4655n implements Runnable {
    public final /* synthetic */ boolean f23970a;
    public final /* synthetic */ int f23971b;
    public final /* synthetic */ C4025c f23972c;
    public final /* synthetic */ C2495w f23973d;
    public final /* synthetic */ boolean f23974e;
    public final /* synthetic */ int f23975f;
    public final /* synthetic */ boolean f23976g;
    public final /* synthetic */ boolean f23977h;
    public final /* synthetic */ int f23978i;
    public final /* synthetic */ C4654m f23979j;

    C4655n(C4654m c4654m, boolean z, int i, C4025c c4025c, C2495w c2495w, boolean z2, int i2, boolean z3, boolean z4, int i3) {
        this.f23979j = c4654m;
        this.f23970a = z;
        this.f23971b = i;
        this.f23972c = c4025c;
        this.f23973d = c2495w;
        this.f23974e = z2;
        this.f23975f = i2;
        this.f23976g = z3;
        this.f23977h = z4;
        this.f23978i = i3;
    }

    public final void run() {
        boolean z = true;
        if (this.f23979j.f23969d != null) {
            if (this.f23970a || (this.f23971b & 2) == 0 || !this.f23979j.f23968c.f23994e.m9312b()) {
                int b = C1473m.f7980a.bB().m21697b();
                if ((this.f23971b & 1) == 0 || this.f23974e || C4651j.m21631a(b, this.f23975f)) {
                    if (this.f23976g) {
                        C4647e b2 = new C4647e().m21623a(b).m21624a(this.f23974e).m21626b(this.f23977h);
                        switch (this.f23978i) {
                            case 0:
                                b = 1;
                                break;
                            case 1:
                                b = 2;
                                break;
                            case 2:
                                b = 3;
                                break;
                            default:
                                FinskyLog.m21659a("unknown networkType [%d]", Integer.valueOf(this.f23978i));
                                b = 0;
                                break;
                        }
                        this.f23973d.m13367a(new C2474c(169).m13214a(b2.m21625b(b).f23946a));
                    }
                    boolean z2 = (this.f23979j.f23968c.f23994e.m9312b() || this.f23979j.f23968c.m21650b() || (this.f23974e && this.f23979j.f23968c.m21649a())) ? false : true;
                    if ((this.f23971b & 1) != 0 && z2) {
                        C0954a.f5840j.m5763a(Long.valueOf(System.currentTimeMillis()));
                    }
                    b = -1;
                    if (this.f23974e || !C1473m.f7980a.dj().mo2294a(12619131)) {
                        z = false;
                    }
                    if (z) {
                        b = ((Integer) C0955b.ha.m28964b()).intValue();
                    }
                    this.f23979j.f23968c.m21647a(this.f23979j, z2, b, this.f23973d);
                    return;
                }
                this.f23979j.m5802b(C4651j.m21630a(this.f23972c));
                return;
            }
            this.f23979j.m5802b(C4651j.m21630a(this.f23972c));
            C4661t c4661t = this.f23979j.f23968c;
            C2495w c2495w = this.f23973d;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(true);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        }
    }
}
