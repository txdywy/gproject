package android.support.constraint.p015a.p016a;

import android.support.constraint.p015a.C0075b;
import android.support.constraint.p015a.C0078e;
import android.support.constraint.p015a.C0081h;
import java.util.ArrayList;

public final class C0070h extends C0066e {
    public float ak = -1.0f;
    public int al = -1;
    public int am = -1;
    public C0062a an = this.j;
    public int ao = 0;
    public boolean ap = false;

    public C0070h() {
        C0071i c0071i = new C0071i();
        this.q.clear();
        this.q.add(this.an);
    }

    public final void m128e(int i) {
        if (this.ao != i) {
            this.ao = i;
            this.q.clear();
            if (this.ao == 1) {
                this.an = this.i;
            } else {
                this.an = this.j;
            }
            this.q.add(this.an);
        }
    }

    public final C0062a mo43a(C0065d c0065d) {
        switch (c0065d.ordinal()) {
            case 1:
            case 3:
                if (this.ao == 1) {
                    return this.an;
                }
                break;
            case 2:
            case 4:
                if (this.ao == 0) {
                    return this.an;
                }
                break;
        }
        return null;
    }

    public final ArrayList mo45l() {
        return this.q;
    }

    public final void mo44a(C0078e c0078e) {
        C0069g c0069g = (C0069g) this.f232r;
        if (c0069g != null) {
            Object a;
            Object a2;
            C0062a a3 = c0069g.mo43a(C0065d.LEFT);
            C0062a a4 = c0069g.mo43a(C0065d.RIGHT);
            if (this.ao == 0) {
                a = c0069g.mo43a(C0065d.TOP);
                a2 = c0069g.mo43a(C0065d.BOTTOM);
            } else {
                C0062a c0062a = a4;
                a4 = a3;
            }
            if (this.al != -1) {
                c0078e.m159a(C0078e.m151a(c0078e, c0078e.m157a(this.an), c0078e.m157a(a), this.al, false));
            } else if (this.am != -1) {
                c0078e.m159a(C0078e.m151a(c0078e, c0078e.m157a(this.an), c0078e.m157a(a2), -this.am, false));
            } else if (this.ak != -1.0f) {
                C0081h a5 = c0078e.m157a(this.an);
                C0081h a6 = c0078e.m157a(a);
                C0081h a7 = c0078e.m157a(a2);
                float f = this.ak;
                boolean z = this.ap;
                C0075b b = c0078e.m165b();
                if (z) {
                    b.m140a(c0078e.m169d(), c0078e.m169d());
                }
                b.f271c.m134a(a5, -1.0f);
                b.f271c.m134a(a6, 1.0f - f);
                b.f271c.m134a(a7, f);
                c0078e.m159a(b);
            }
        }
    }

    public final void mo46n() {
        if (this.f232r != null) {
            int b = C0078e.m153b(this.an);
            if (this.ao == 1) {
                this.f237w = b;
                this.f238x = 0;
                m93b(this.f232r.m103f());
                m87a(0);
                return;
            }
            this.f237w = 0;
            this.f238x = b;
            m87a(this.f232r.m97c());
            m93b(0);
        }
    }
}
