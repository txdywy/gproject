package com.google.android.finsky.ca;

import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.by.c;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.foregroundcoordinator.b;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dd;
import com.google.wireless.android.finsky.dfe.nano.dj;

final class com.google.android.finsky.ca.c
{

    public final com.google.android.finsky.by.c a;
    public final com.google.android.finsky.l.a b;
    public final com.google.android.finsky.api.h c;
    public final com.google.android.finsky.bn.b d;
    public final com.google.android.finsky.ca.a e;
    public final ForegroundCoordinator f;
    public final com.google.android.finsky.ba.c g;
    public final com.google.android.finsky.d.g h;
    public com.google.android.finsky.foregroundcoordinator.b i;

    c(com.google.android.finsky.by.c p0, com.google.android.finsky.l.a p1, com.google.android.finsky.api.h p2, com.google.android.finsky.bn.b p3, com.google.android.finsky.ca.a p4, ForegroundCoordinator p5, com.google.android.finsky.ba.c p6, com.google.android.finsky.d.g p7) {
        this.a = (com.google.android.finsky.by.c)com.google.android.finsky.utils.aj.a(p0);
        this.b = (com.google.android.finsky.l.a)com.google.android.finsky.utils.aj.a(p1);
        this.c = (com.google.android.finsky.api.h)com.google.android.finsky.utils.aj.a(p2);
        this.d = (com.google.android.finsky.bn.b)com.google.android.finsky.utils.aj.a(p3);
        this.e = (com.google.android.finsky.ca.a)com.google.android.finsky.utils.aj.a(p4);
        this.f = (ForegroundCoordinator)com.google.android.finsky.utils.aj.a(p5);
        this.g = (com.google.android.finsky.ba.c)com.google.android.finsky.utils.aj.a(p6);
        this.h = (com.google.android.finsky.d.g)com.google.android.finsky.utils.aj.a(p7);
    }

    static void a(com.google.android.finsky.ca.c p0, String p1, int p2, Exception p3) {
        p0.a(p1, 1301, 0, p2, p3, 0);
    }

    public final com.google.wireless.android.finsky.dfe.nano.dj a(String p0, String p1) {
        v1 = -1;
        v3 = 0;
        com.google.android.finsky.utils.aj.a(p0);
        com.google.android.finsky.utils.aj.a(p1);
        v4 = this.b.a(p0);
        if (v4 == 0)
            this.a(p1, 1304, 0, 6, 0, p0);
        else {
            v7 = new com.google.wireless.android.finsky.dfe.nano.dj();
            v7.a(p0);
            if (v4.d != 0)
                v0 = v4.d.c;
            else
                v0 = -1;
            if (v4.c != 0)
                v1 = v4.c.d;
            if (v0 <= v1)
                v0 = v1;
            if (v0 > 0)
                v7.a(v0);
            v0 = this.d.a(p0);
            if (v0 == 0)
                this.a(p1, 1304, 0, 7, 0, p0);
            else if (v0.x != 0) {
                if (v0.x == 0)
                    throw new NullPointerException();
                v7.b = v7.b | 4;
                v7.e = v0.x;
            }
            v3 = v7;
        }
        return v3;
    }

    public final void a(String p0, int p1, String p2, int p3, Exception p4, String p5) {
        this.h.f(p0).a(new com.google.android.finsky.d.c(p1).b(p2).a(p4).a(p3).a(p5).a, 0);
    }

    public final void a(dj[] p0, String p1, Runnable p2) {
        com.google.android.finsky.utils.aj.a(p0);
        com.google.android.finsky.utils.aj.a(p1);
        if (this.g.j(p1).a(12609726))
            this.b(p0, p1, p2);
        else if (!this.f.a())
            this.b(p0, p1, p2);
        else
            this.i = this.f.a(2, this.g.j(p1), new com.google.android.finsky.ca.e(this, p0, p1, p2));
    }

    final void b(dj[] p0, String p1, Runnable p2) {
        com.google.android.finsky.utils.aj.a(p0);
        com.google.android.finsky.utils.aj.a(p1);
        if (p0.length == 0) {
            if (p2 != 0)
                p2.run();
        }
        else {
            v0 = new com.google.wireless.android.finsky.dfe.nano.dd();
            v0.a = p0;
            this.c.a(p1).a(v0, new com.google.android.finsky.ca.f(this, p1, p2), new com.google.android.finsky.ca.g(this, p1, p2));
        }
    }

}
