package com.google.android.agera.p100a;

import android.support.v7.widget.em;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.agera.C0893t;
import com.google.android.agera.C0914u;
import com.google.android.agera.C0917x;
import com.google.android.agera.am;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

public class C0884a extends em implements am {
    public final int f5615c;
    public final int f5616d;
    public final C0889f[] f5617e;
    public final Map f5618f;
    public final C0893t f5619g;
    public final int[] f5620h;
    public boolean f5621i;
    public int f5622j;
    public int f5623k;

    public C0884a(C0886c c0886c) {
        int size = c0886c.f5624a.size();
        C0917x.m5641b(size > 0, "Must add at least one part");
        this.f5615c = size;
        this.f5616d = c0886c.f5626c;
        this.f5617e = new C0889f[size];
        for (int i = 0; i < size; i++) {
            C0889f c0889f = (C0889f) c0886c.f5624a.get(i);
            this.f5617e[i] = c0889f;
            c0889f.mo1139a(this, i);
        }
        this.f5618f = new IdentityHashMap();
        this.f5619g = C0914u.m5634a((C0893t[]) c0886c.f5625b.toArray(new C0893t[c0886c.f5625b.size()]));
        this.f5620h = new int[size];
        this.f5621i = true;
        c0886c.f5624a.clear();
        c0886c.f5625b.clear();
        c0886c.f5626c = 0;
    }

    public final void m5528b() {
        this.f5619g.mo1144a(this);
        for (C0889f c : this.f5617e) {
            c.mo1142c();
        }
    }

    public final void m5530c() {
        this.f5619g.mo1145b(this);
        for (C0889f e : this.f5617e) {
            e.mo1143e();
        }
    }

    public final void ad_() {
        if (!this.f5621i) {
            if (this.f3433a.m3637a()) {
                int i = this.f5620h[0];
                C0888e a = C0888e.m5533a(0);
                int i2 = i;
                i = 0;
                while (i < this.f5615c) {
                    a.f5635e = i2;
                    if (this.f5617e[i].mo1140a(false)) {
                        int a2 = a.m5535a();
                        if (i + 1 < this.f5615c) {
                            i2 = this.f5620h[i + 1] - this.f5620h[i];
                        }
                        this.f5620h[i] = a2;
                        i++;
                    } else {
                        this.f5621i = true;
                        this.f3433a.m3638b();
                        a.m5539b();
                        return;
                    }
                }
                a.m5538a(this);
                return;
            }
            m5520e();
        }
    }

    public final int mo1039a() {
        if (this.f5621i) {
            m5520e();
            this.f5621i = false;
        }
        return this.f5620h[this.f5615c - 1];
    }

    private final void m5520e() {
        int i = 0;
        int i2 = 0;
        while (i < this.f5615c) {
            i2 += this.f5617e[i].mo1135a();
            this.f5620h[i] = i2;
            i++;
        }
    }

    public final int mo1040a(int i) {
        m5521e(i);
        return this.f5617e[this.f5622j].mo1136a(this.f5623k);
    }

    public final long mo1043b(int i) {
        m5521e(i);
        return this.f5617e[this.f5622j].mo1137a(this.f5623k, (long) this.f5616d);
    }

    public fr mo1041a(ViewGroup viewGroup, int i) {
        return new C0885b(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }

    public final void mo1042a(fr frVar, int i) {
        m5521e(i);
        C0889f c0889f = this.f5617e[this.f5622j];
        this.f5618f.put(frVar, c0889f);
        c0889f.mo1138a(this.f5623k, frVar);
    }

    public boolean mo1134b(fr frVar) {
        m5519c(frVar);
        return super.mo1134b(frVar);
    }

    public void mo1132a(fr frVar) {
        m5519c(frVar);
    }

    private final void m5519c(fr frVar) {
        C0889f c0889f = (C0889f) this.f5618f.remove(frVar);
        if (c0889f != null) {
            c0889f.mo1141b();
        }
    }

    private final void m5521e(int i) {
        int a = mo1039a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException("Asked for position " + i + " while count is " + a);
        }
        a = Arrays.binarySearch(this.f5620h, i);
        if (a >= 0) {
            do {
                a++;
            } while (this.f5620h[a] == i);
        } else {
            a ^= -1;
        }
        this.f5622j = a;
        if (a != 0) {
            i -= this.f5620h[a - 1];
        }
        this.f5623k = i;
    }

    final void m5531e(int i, int i2) {
        while (i < this.f5615c) {
            int[] iArr = this.f5620h;
            iArr[i] = iArr[i] + i2;
            i++;
        }
    }
}
