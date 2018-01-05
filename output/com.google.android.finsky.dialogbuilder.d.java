package com.google.android.finsky.dialogbuilder;

import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.play.a.a.ao;
import com.google.android.play.a.r;
import com.google.wireless.android.finsky.dfe.c.a.cp;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.dm;

public final class com.google.android.finsky.dialogbuilder.d
{

    public static final com.google.android.finsky.d.ad d;
    public static final com.google.android.finsky.d.ad e;
    public com.google.android.finsky.d.w f;
    public com.google.android.finsky.d.ad g;
    public com.google.android.finsky.d.ad h;
    public com.google.android.finsky.d.ad i;
    public int j;
    public boolean k;

    static {
        com.google.android.finsky.dialogbuilder.d.d = new com.google.android.finsky.d.o(213);
        com.google.android.finsky.dialogbuilder.d.e = new com.google.android.finsky.d.o(603);
    }

    d(com.google.android.finsky.d.w p0, int p1) {
        this.f = p0;
        this.j = p1;
    }

    d(com.google.android.finsky.d.w p0, int p1, byte[] p2) {
        com.google.android.finsky.dialogbuilder.d(p0, p1);
        if (p2 != 0) {
            this.b(0);
            ((com.google.android.finsky.d.o)this.g).a(p2);
        }
    }

    private static com.google.android.play.a.a.ao c(com.google.wireless.android.finsky.dfe.c.a.cr p0) {
        if (p0.h == 0 || p0.h.length == 0)
            v0 = 0;
        else {
            v0 = com.google.android.play.a.r.a().b();
            v0.e = p0.h;
        }
        return v0;
    }

    final com.google.android.finsky.d.ad a(com.google.wireless.android.finsky.dfe.c.a.cp p0) {
        if (this.g == 0)
            this.g = this.b(p0);
        return this.g;
    }

    public final com.google.android.finsky.d.ad a(com.google.wireless.android.finsky.dfe.c.a.cr p0, com.google.wireless.android.finsky.dfe.c.a.dm p1) {
        if (this.k != 0 || p0 == 0 || !p0.d())
            v0 = 0;
        else {
            v0 = new com.google.android.finsky.d.o(p0.b, p0.c, 0);
            if (p1 == 0 || p1.n.length == 0) {
                this.i.a(v0);
                this.g();
            }
        }
        return v0;
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        if (this.k == 0 && p0 != 0) {
            this.i.a(p0);
            this.g();
        }
    }

    public abstract void a(com.google.android.finsky.d.ad p0, com.google.wireless.android.finsky.dfe.c.a.cp p1);

    public final void a(com.google.wireless.android.finsky.dfe.c.a.cr p0) {
        if (p0.d()) {
            if (p0.e != 0)
                v0 = this.g;
            else
                v0 = this.i;
            this.f.a(new com.google.android.finsky.d.d(v0).a(p0.b).a(p0.c).a(), com.google.android.finsky.dialogbuilder.d.c(p0));
        }
    }

    final com.google.android.finsky.d.ad b(com.google.wireless.android.finsky.dfe.c.a.cp p0) {
        this.g = new com.google.android.finsky.d.o(this.j);
        this.a(this.g, p0);
        return this.g;
    }

    public final void b(com.google.wireless.android.finsky.dfe.c.a.cr p0) {
        v0 = 1;
        if (p0 == 0)
            return;
        if (p0.a & 16)
            v2 = 1;
        else
            v2 = 0;
        if (v2 == 0 || !p0.d())
            return;
        switch (p0.f) {
            case 1:
                v3 = this.d(p0.b);
                if (p0.a & 2)
                    v2 = 1;
                else
                    v2 = 0;
                if (v2 != 0)
                    v3.a(p0.c);
                if (p0.a & 32) {
                }
                else
                    v0 = 0;
                if (v0 != 0)
                    v3.d(p0.g);
                this.f.a(v3.a, com.google.android.finsky.dialogbuilder.d.c(p0));
                break;
            case 2:
                v0 = new com.google.android.finsky.d.o(this.j);
                v0.a(new com.google.android.finsky.d.o(p0.b));
                this.f.a(new com.google.android.finsky.d.p().a(v0).a(), com.google.android.finsky.dialogbuilder.d.c(p0));
                break;
            case 3:
                this.a(p0);
                break;
            default:
                break;
        }
    }

    public abstract com.google.android.finsky.d.c d(int p0);

    public final void g() {
        if (this.k == 0) {
            v0 = this.i.getParentNode();
            if (v0 == 0)
                v0 = this.i;
            this.f.a(new com.google.android.finsky.d.p().a(v0).a(), 0);
            this.i = this.h;
        }
    }

}
