package com.google.android.finsky.datasync;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.play.dfe.api.C6287d;

final /* synthetic */ class C2516b implements Runnable {
    public final C2514a f13538a;
    public final Account[] f13539b;

    C2516b(C2514a c2514a, Account[] accountArr) {
        this.f13538a = c2514a;
        this.f13539b = accountArr;
    }

    public final void run() {
        C2514a c2514a = this.f13538a;
        for (Account account : this.f13539b) {
            C1254c a = c2514a.f13510e.mo2016a(account.name);
            C6287d a2 = c2514a.f13512g.mo2019a(account);
            c2514a.f13507a++;
            if (!(a == null || a.mo1620b() == null)) {
                Account b = a.mo1620b();
                Object obj = null;
                if (!TextUtils.isEmpty(b.name)) {
                    obj = (String) C0954a.aR.m5777b(b.name).m5760a();
                }
                if (TextUtils.isEmpty(obj)) {
                    c2514a.z_.m15108a(a, false, false, new C2517c(c2514a, a));
                } else {
                    c2514a.m13438a(obj, a);
                }
                if (a2 != null) {
                    c2514a.f13507a++;
                    a2.mo5377a(new C2518d(c2514a), new C2519e(c2514a), false);
                }
            }
        }
    }
}
