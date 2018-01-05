package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.b;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.as.e;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.accounts.impl.a extends com.google.android.finsky.accounts.impl.e implements com.google.android.finsky.accounts.a
{

    public final List a;
    public final com.google.android.finsky.dx.a b;

    a(Context p0, AccountManager p1, com.google.android.finsky.aq.a p2, com.google.android.finsky.as.e p3, com.google.android.finsky.dx.a p4) {
        com.google.android.finsky.accounts.impl.e(p0, p1, p3, p2);
        this.a = new ArrayList();
        this.b = p4;
    }

    a(Context p0, com.google.android.finsky.aq.a p1, com.google.android.finsky.as.e p2, com.google.android.finsky.dx.a p3) {
        com.google.android.finsky.accounts.impl.a(p0, AccountManager.get(p0), p1, p2, p3);
    }

    public final Account a(com.google.android.finsky.aa.n p0) {
        return super.a(p0);
    }

    public final void a(Account p0, com.google.android.finsky.aa.n p1) {
        super.a(p0, p1);
    }

    public final synchronized void a(com.google.android.finsky.accounts.b p0) {
        enter this;
        try {
            if (this.a.contains(p0))
                FinskyLog.e("Trying to register an already registered AccountSwitchListener.", new Object[0]);
            else {
                try {
                    this.a.add(p0);
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final boolean a(Account p0) {
        if (p0 != 0 && !this.b(p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean a(String p0) {
        return this.a(this.b(p0));
    }

    public final Account[] a() {
        v1 = 0;
        v3 = this.d();
        v2 = v3.length;
        v0 = 0;
        while (v0 < v3.length) {
            if (!this.a(v3[v0])) {
                v2 = v2 - 1;
                v3[v0] = 0;
            }
            v0 = v0 + 1;
        }
        if (v2 == 0)
            v0 = com.google.android.finsky.accounts.impl.a.c;
        else if (v2 == v3.length)
            v0 = v3;
        else {
            v4 = new Account[v2];
            v0 = 0;
            while (v0 < v3.length) {
                if (v3[v0] != 0) {
                    v4[v1] = v3[v0];
                    v1 = v1 + 1;
                }
                v0 = v0 + 1;
            }
            v0 = v4;
        }
        return v0;
    }

    public final Account b() {
        v0 = this.a();
        if (v0.length > 0)
            v0 = v0[0];
        else
            v0 = 0;
        return v0;
    }

    public final Account b(String p0) {
        return super.b(p0);
    }

    public final boolean b(Account p0) {
        v0 = 0;
        v1 = this.b.b(p0.name);
        if (v1 != 0 && v1.f != 0 && v1.f.e == 2)
            v0 = 1;
        return v0;
    }

    public final void c(Account p0) {
        if (p0 != 0 && !this.a(p0)) {
            FinskyLog.e("Cannot switch to non-visible account", new Object[0]);
            return;
        }
        enter this;
        try {
            v1 = this.a.size() - 1;
            while (v1 >= 0) {
                ((com.google.android.finsky.accounts.b)this.a.get(v1)).a(p0);
                v1 = v1 - 1;
            }
            exit this;
            return;
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final boolean c(String p0) {
        return super.c(p0);
    }

    public final String[] c() {
        return super.c();
    }

    public final String d(Account p0) {
        return super.d(p0);
    }

    public final String d(String p0) {
        return super.d(p0);
    }

    public final Account[] d() {
        return super.d();
    }

    public final Account e() {
        v0 = this.b();
        if (v0 == 0)
            v0 = super.e();
        return v0;
    }

    public final boolean f() {
        return super.f();
    }

    public final String[] g() {
        return super.g();
    }

}
