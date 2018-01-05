package com.google.android.finsky.application;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0987b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.C2713b;

final class cy implements C0987b {
    public final /* synthetic */ C1475d f7978a;

    cy(C1475d c1475d) {
        this.f7978a = c1475d;
    }

    public final void mo2020a(Account account) {
        C1473m c1473m = this.f7978a;
        synchronized (c1473m.f8027u) {
            c1473m.f8027u.clear();
        }
        Object obj = (c1473m.f8022p == null || !c1473m.f8022p.equals(account) || c1473m.f8023q == null || !c1473m.f8023q.equals(account)) ? 1 : null;
        c1473m.f8022p = account;
        c1473m.f8023q = account;
        if (obj != null) {
            c1473m.mo2041U().mo1182a(c1473m.f8023q, C0954a.f5838h);
            if (c1473m.f8014h != null) {
                C2713b c2713b = c1473m.f8014h;
                C1254c c1254c = c2713b.f14914c;
                c2713b.f14914c = c2713b.f14915d.mo2015a();
                if (c1254c != null) {
                    c2713b.f14913a.clear();
                } else {
                    c2713b.m14710a();
                }
            }
            c1473m.f8024r = c1473m.f8024r.m13366a(c1473m.f8023q);
        }
    }
}
