package com.google.android.finsky.p111d;

import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.bt;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.by;
import com.google.wireless.android.a.a.a.a.cb;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C2478h {
    public static C2478h f13353a = null;
    public final C2479i f13354b = new C2479i(by.class, 40);
    public final C2479i f13355c = new C2479i(bu.class, 10);
    public final C2479i f13356d = new C2479i(bp.class, 10);
    public final C2479i f13357e = new C2479i(bt.class, 10);
    public final C2479i f13358f = new C2479i(bo.class, 10);
    public final C2479i f13359g = new C2479i(cb.class, 10);
    public final C2479i f13360h = new C2479i(ce.class, 50);
    public final C2479i f13361i = new C2479i(cn.class, 10);

    public static synchronized C2478h m13270a() {
        C2478h c2478h;
        synchronized (C2478h.class) {
            if (f13353a == null) {
                f13353a = new C2478h();
            }
            c2478h = f13353a;
        }
        return c2478h;
    }

    private C2478h() {
    }

    public final by m13272b() {
        return (by) this.f13354b.m13275a();
    }

    public final bp m13273c() {
        return (bp) this.f13356d.m13275a();
    }

    public final ce m13274d() {
        return (ce) this.f13360h.m13275a();
    }

    public final void m13271a(ce ceVar) {
        for (ce a : ceVar.f) {
            m13271a(a);
        }
        ceVar.e();
        this.f13360h.m13276a(ceVar);
    }
}
