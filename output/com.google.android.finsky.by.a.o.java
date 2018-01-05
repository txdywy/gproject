package com.google.android.finsky.by.a;

import android.accounts.Account;
import com.google.android.finsky.api.c;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.h;

public final class com.google.android.finsky.by.a.o implements com.google.android.finsky.by.d, com.google.android.finsky.by.k
{

    public final Account a;
    public final com.google.android.finsky.by.c b;
    public final com.google.android.finsky.api.c c;
    public long d;
    public String[] e;

    o(Account p0, com.google.android.finsky.by.c p1, com.google.android.finsky.api.c p2) {
        this.a = p0;
        this.b = p1;
        this.d = this.a();
        this.c = p2;
        this.b.a(this);
    }

    private final long a() {
        return this.b.a(this.a).g(com.google.android.finsky.by.h.a).h();
    }

    public final void a(com.google.android.finsky.by.a p0) {
        if (this.e != 0 && this.e.length != 0 && p0.a().equals(this.a)) {
            v0 = this.a();
            if (this.d != v0) {
                this.d = v0;
                v0 = 0;
                while (v0 < this.e.length) {
                    this.c.e(this.e[v0]);
                    v0 = v0 + 1;
                }
            }
        }
    }

    public final void a(String[] p0) {
        this.e = p0;
    }

    public final void ab_() {
    }

}
