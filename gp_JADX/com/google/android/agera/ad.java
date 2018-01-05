package com.google.android.agera;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class ad implements ae, ag, ah, aj {
    public static final ThreadLocal f5650a = new ThreadLocal();
    public Object f5651b;
    public final ArrayList f5652c = new ArrayList();
    public int f5653d;
    public final ArrayList f5654e = new ArrayList();
    public C0899j f5655f;
    public C0902y f5656g;
    public C0904p f5657h = C0912q.f5689a;
    public int f5658i;
    public int f5659j;
    public C0895z f5660k = C0898d.f5670a;
    public int f5661l;

    public static af m5583a(Object obj) {
        C0917x.m5639a(Looper.myLooper());
        af afVar = (ad) f5650a.get();
        if (afVar == null) {
            afVar = new ad();
        } else {
            f5650a.set(null);
        }
        afVar.m5584a(0);
        afVar.f5661l = 1;
        afVar.f5651b = obj;
        return afVar;
    }

    private ad() {
    }

    private final void m5584a(int i) {
        C0917x.m5640a(this.f5661l == i, "Unexpected compiler state");
    }

    private final void m5585a(int i, int i2) {
        boolean z = this.f5661l == i || this.f5661l == i2;
        C0917x.m5640a(z, "Unexpected compiler state");
    }

    private final void m5586c() {
        List list = this.f5654e;
        list.add(Integer.valueOf(0));
        list.add(Boolean.valueOf(false));
        this.f5661l = 6;
    }

    public final ac mo1148a() {
        m5584a(6);
        Object obj = this.f5651b;
        List list = this.f5652c;
        int i = this.f5653d;
        List list2 = this.f5654e;
        C0904p c0904p = this.f5657h;
        int i2 = this.f5659j;
        int i3 = this.f5658i;
        C0895z c0895z = this.f5660k;
        ac c0906i = new C0906i(obj, C0914u.m5633a(i, (C0893t[]) list.toArray(new C0893t[list.size()])), list2.toArray(), c0904p, i3, i2, c0895z);
        this.f5661l = 0;
        this.f5651b = null;
        this.f5652c.clear();
        this.f5653d = 0;
        this.f5654e.clear();
        this.f5657h = C0912q.f5689a;
        this.f5658i = 0;
        this.f5659j = 0;
        this.f5660k = C0898d.f5670a;
        f5650a.set(this);
        return c0906i;
    }

    public final /* synthetic */ ag mo1152b() {
        m5584a(2);
        this.f5653d = Math.max(0, 0);
        this.f5661l = 3;
        return this;
    }

    public final /* synthetic */ ah mo1150a(C0893t[] c0893tArr) {
        m5585a(1, 2);
        for (Object a : c0893tArr) {
            this.f5652c.add((C0893t) C0917x.m5639a(a));
        }
        this.f5661l = 2;
        return this;
    }

    public final /* synthetic */ aj mo1151a(al alVar) {
        m5584a(3);
        List list = this.f5654e;
        list.add(Integer.valueOf(1));
        list.add(alVar);
        this.f5661l = 4;
        return this;
    }

    public final /* synthetic */ ae mo1149a(C0899j c0899j) {
        m5584a(3);
        List list = this.f5654e;
        list.add(Integer.valueOf(3));
        list.add(c0899j);
        m5586c();
        return this;
    }

    public final /* synthetic */ Object mo1153b(C0899j c0899j) {
        m5585a(4, 5);
        if (this.f5655f != null) {
            C0899j c0899j2 = this.f5655f;
            C0902y c0902y = (C0902y) C0917x.m5639a(this.f5656g);
            List list = this.f5654e;
            list.add(Integer.valueOf(4));
            list.add(c0899j2);
            list.add(c0902y);
            list.add(c0899j);
        } else {
            List list2 = this.f5654e;
            list2.add(Integer.valueOf(9));
            list2.add(c0899j);
        }
        this.f5655f = null;
        this.f5656g = null;
        if (this.f5661l == 5) {
            m5586c();
        } else {
            this.f5661l = 3;
        }
        return this;
    }
}
