package com.squareup.okhttp.internal.p525a;

import android.support.v7.widget.eq;
import com.squareup.haha.perflib.HprofParser;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p526e.C7725i;
import p526e.C7728j;
import p526e.C7733p;

final class aa {
    public final List f39388a = new ArrayList();
    public final C7725i f39389b;
    public int f39390c = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public int f39391d = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public C7636x[] f39392e = new C7636x[8];
    public int f39393f = (this.f39392e.length - 1);
    public int f39394g = 0;
    public int f39395h = 0;

    aa(p526e.aa aaVar) {
        this.f39389b = C7733p.m37442a(aaVar);
    }

    final void m36688a() {
        if (this.f39391d >= this.f39395h) {
            return;
        }
        if (this.f39391d == 0) {
            m36682c();
        } else {
            m36685d(this.f39395h - this.f39391d);
        }
    }

    private final void m36682c() {
        this.f39388a.clear();
        Arrays.fill(this.f39392e, null);
        this.f39393f = this.f39392e.length - 1;
        this.f39394g = 0;
        this.f39395h = 0;
    }

    private final int m36685d(int i) {
        int i2 = 0;
        if (i > 0) {
            for (int length = this.f39392e.length - 1; length >= this.f39393f && i > 0; length--) {
                i -= this.f39392e[length].f39547j;
                this.f39395h -= this.f39392e[length].f39547j;
                this.f39394g--;
                i2++;
            }
            System.arraycopy(this.f39392e, this.f39393f + 1, this.f39392e, (this.f39393f + 1) + i2, this.f39394g);
            this.f39393f += i2;
        }
        return i2;
    }

    final int m36686a(int i) {
        return (this.f39393f + 1) + i;
    }

    final C7728j m36691b(int i) {
        if (aa.m36683c(i)) {
            return C7638z.f39553a[i].f39545h;
        }
        return this.f39392e[m36686a(i - C7638z.f39553a.length)].f39545h;
    }

    static boolean m36683c(int i) {
        return i >= 0 && i <= C7638z.f39553a.length - 1;
    }

    final void m36689a(C7636x c7636x) {
        this.f39388a.add(c7636x);
        int i = c7636x.f39547j;
        if (i > this.f39391d) {
            m36682c();
            return;
        }
        m36685d((this.f39395h + i) - this.f39391d);
        if (this.f39394g + 1 > this.f39392e.length) {
            Object obj = new C7636x[(this.f39392e.length * 2)];
            System.arraycopy(this.f39392e, 0, obj, this.f39392e.length, this.f39392e.length);
            this.f39393f = this.f39392e.length - 1;
            this.f39392e = obj;
        }
        int i2 = this.f39393f;
        this.f39393f = i2 - 1;
        this.f39392e[i2] = c7636x;
        this.f39394g++;
        this.f39395h = i + this.f39395h;
    }

    private final int m36684d() {
        return this.f39389b.mo6496f() & HprofParser.ROOT_UNKNOWN;
    }

    final int m36687a(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        i3 = 0;
        while (true) {
            int d = m36684d();
            if ((d & 128) == 0) {
                return (d << i3) + i2;
            }
            i2 += (d & 127) << i3;
            i3 += 7;
        }
    }

    final C7728j m36690b() {
        int i = 0;
        int d = m36684d();
        int i2 = (d & 128) == 128 ? 1 : 0;
        d = m36687a(d, 127);
        if (i2 == 0) {
            return this.f39389b.mo6490c((long) d);
        }
        ah ahVar = ah.f39420c;
        byte[] e = this.f39389b.mo6495e((long) d);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d = 0;
        ai aiVar = ahVar.f39421d;
        i2 = 0;
        while (i < e.length) {
            d = (d << 8) | (e[i] & HprofParser.ROOT_UNKNOWN);
            i2 += 8;
            while (i2 >= 8) {
                aiVar = aiVar.f39422a[(d >>> (i2 - 8)) & HprofParser.ROOT_UNKNOWN];
                if (aiVar.f39422a == null) {
                    byteArrayOutputStream.write(aiVar.f39423b);
                    i2 -= aiVar.f39424c;
                    aiVar = ahVar.f39421d;
                } else {
                    i2 -= 8;
                }
            }
            i++;
        }
        while (i2 > 0) {
            ai aiVar2 = aiVar.f39422a[(d << (8 - i2)) & HprofParser.ROOT_UNKNOWN];
            if (aiVar2.f39422a != null || aiVar2.f39424c > i2) {
                break;
            }
            byteArrayOutputStream.write(aiVar2.f39423b);
            i2 -= aiVar2.f39424c;
            aiVar = ahVar.f39421d;
        }
        return C7728j.m37413a(byteArrayOutputStream.toByteArray());
    }
}
