package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2215k;
import com.google.android.finsky.by.C2229h;

public final class C2216o implements C0999d, C2215k {
    public final Account f11059a;
    public final C2206c f11060b;
    public final C1254c f11061c;
    public long f11062d = m11617a();
    public String[] f11063e;

    public C2216o(Account account, C2206c c2206c, C1254c c1254c) {
        this.f11059a = account;
        this.f11060b = c2206c;
        this.f11061c = c1254c;
        this.f11060b.mo2814a((C0999d) this);
    }

    public final void mo2825a(String... strArr) {
        this.f11063e = strArr;
    }

    private final long m11617a() {
        return this.f11060b.mo2811a(this.f11059a).mo2793g(C2229h.f11120a).mo2794h();
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (this.f11063e != null && this.f11063e.length != 0 && c2197a.mo2780a().equals(this.f11059a)) {
            long a = m11617a();
            if (this.f11062d != a) {
                this.f11062d = a;
                for (String e : this.f11063e) {
                    this.f11061c.mo1647e(e);
                }
            }
        }
    }
}
