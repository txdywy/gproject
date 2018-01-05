package com.google.android.agera.p100a;

import android.support.v7.p045f.C0443j;
import com.google.android.agera.C0917x;
import java.util.ArrayList;
import java.util.List;

final class C0888e implements C0443j {
    public static C0888e f5631a;
    public final List f5632b = new ArrayList();
    public int f5633c;
    public int f5634d;
    public int f5635e;

    private C0888e() {
    }

    static C0888e m5533a(int i) {
        C0888e c0888e;
        synchronized (C0888e.class) {
            c0888e = f5631a;
            f5631a = null;
        }
        if (c0888e == null) {
            c0888e = new C0888e();
        }
        c0888e.f5634d = i;
        return c0888e;
    }

    private final C0887d m5534c() {
        C0917x.m5640a(this.f5634d != -1, "Illegal call to ListUpdateCallback");
        int i = this.f5633c;
        this.f5633c = i + 1;
        if (this.f5632b.size() > i) {
            return (C0887d) this.f5632b.get(i);
        }
        C0887d c0887d = new C0887d();
        this.f5632b.add(c0887d);
        return c0887d;
    }

    public final void mo620a(int i, int i2) {
        boolean z = false;
        boolean z2 = i >= 0 && i <= this.f5635e;
        C0917x.m5641b(z2, "onInserted: invalid position");
        if (i2 >= 0) {
            z = true;
        }
        C0917x.m5641b(z, "onInserted: invalid count");
        C0887d c = m5534c();
        c.f5627a = 1;
        c.f5628b = this.f5634d + i;
        c.f5629c = i2;
        c.f5630d = null;
        this.f5635e += i2;
    }

    public final void mo622b(int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < this.f5635e;
        C0917x.m5641b(z2, "onRemoved: invalid position");
        if (i2 < 0 || i + i2 > this.f5635e) {
            z = false;
        }
        C0917x.m5641b(z, "onRemoved: invalid count");
        C0887d c = m5534c();
        c.f5627a = 2;
        c.f5628b = this.f5634d + i;
        c.f5629c = i2;
        c.f5630d = null;
        this.f5635e -= i2;
    }

    public final void mo623c(int i, int i2) {
        boolean z = true;
        boolean z2 = i >= 0 && i < this.f5635e;
        C0917x.m5641b(z2, "onMoved: invalid fromPosition");
        if (i2 < 0 || i2 >= this.f5635e) {
            z = false;
        }
        C0917x.m5641b(z, "onMoved: invalid toPosition");
        C0887d c = m5534c();
        c.f5627a = 3;
        c.f5628b = this.f5634d + i;
        c.f5629c = this.f5634d + i2;
        c.f5630d = null;
    }

    public final void mo621a(int i, int i2, Object obj) {
        boolean z = true;
        boolean z2 = i >= 0 && i < this.f5635e;
        C0917x.m5641b(z2, "onChanged: invalid position");
        if (i2 < 0 || i + i2 > this.f5635e) {
            z = false;
        }
        C0917x.m5641b(z, "onChanged: invalid count");
        C0887d c = m5534c();
        c.f5627a = 4;
        c.f5628b = this.f5634d + i;
        c.f5629c = i2;
        c.f5630d = obj;
    }

    final int m5535a() {
        int i = this.f5634d + this.f5635e;
        this.f5634d = i;
        return i;
    }

    final void m5539b() {
        this.f5633c = 0;
        this.f5634d = -1;
        this.f5635e = 0;
        synchronized (C0888e.class) {
            f5631a = this;
        }
    }

    final void m5538a(C0884a c0884a) {
        for (int i = 0; i < this.f5633c; i++) {
            C0887d c0887d = (C0887d) this.f5632b.get(i);
            switch (c0887d.f5627a) {
                case 1:
                    c0884a.m3632c(c0887d.f5628b, c0887d.f5629c);
                    break;
                case 2:
                    c0884a.m3634d(c0887d.f5628b, c0887d.f5629c);
                    break;
                case 3:
                    c0884a.m3627b(c0887d.f5628b, c0887d.f5629c);
                    break;
                case 4:
                    c0884a.m3620a(c0887d.f5628b, c0887d.f5629c, c0887d.f5630d);
                    break;
                default:
                    break;
            }
        }
        m5539b();
    }
}
