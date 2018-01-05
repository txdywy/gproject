package com.google.android.finsky.accounts.impl;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.ac.e;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.by.c;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.hygiene.v;
import com.google.android.finsky.l.a;
import com.google.android.finsky.providers.c;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.e;
import com.google.android.finsky.w.a;
import com.google.android.play.utils.b.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class AccountsChangedReceiver extends com.google.android.finsky.w.a
{

    public com.google.android.finsky.accounts.a a;
    public com.google.android.finsky.accounts.c b;
    public com.google.android.finsky.d.a c;
    public com.google.android.finsky.f.b d;
    public com.google.android.finsky.l.a e;
    public com.google.android.finsky.ac.e f;
    public com.google.android.finsky.ba.c g;
    public com.google.android.finsky.providers.c h;
    public com.google.android.finsky.hygiene.v i;
    public com.google.android.finsky.by.c j;
    public com.google.android.finsky.dx.a k;
    public com.google.android.finsky.volley.e l;

    AccountsChangedReceiver() {
        com.google.android.finsky.w.a();
    }

    public final void a() {
        ((com.google.android.finsky.accounts.impl.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.accounts.impl.d)).a(this);
    }

    public final void a(Context p0, Intent p1) {
        v4 = 1;
        this.c.a(this.b.cY()).a(new com.google.android.finsky.d.c(189));
        if (!this.g.dj().a(12623699))
            com.google.android.finsky.aa.a.ak.a(Boolean.valueOf(1));
        v5 = com.google.android.finsky.aa.o.b(this.a.d());
        v6 = this.h.a(v5);
        if (v6 != 0)
            v1 = v5[0];
        else
            v1 = "";
        this.j.a(0);
        v7 = this.a.d();
        v8 = com.google.android.finsky.aa.o.a(v7);
        v0 = (String)com.google.android.finsky.aa.o.g.a();
        if (!TextUtils.isEmpty(v0) && v8.length > 0) {
            v9 = new Object[1];
            v9[0] = Integer.valueOf(v8.length);
            FinskyLog.a("Restoring apps for %d new accounts.", v9);
            this.h.b(v0, v8[0]);
        }
        if (v7.length == 1 && v8.length == 1)
            this.h.du();
        v0 = com.google.android.finsky.aa.o.b.a();
        v9 = v0.edit();
        v10 = v0.getAll().keySet().iterator();
        v2 = 0;
        while (v10.hasNext()) {
            v0 = (String)v10.next();
            if (v0.startsWith("account_exists_") && !com.google.android.finsky.aa.o.a(v7, v0.substring(15))) {
                v9.remove(v0);
                v0 = 1;
            }
            else
                v0 = v2;
            v2 = v0;
        }
        if (v2 != 0)
            v9.apply();
        v0 = 0;
        while (v0 < v7.length) {
            v9 = com.google.android.finsky.aa.o.l.b(v7[v0].name);
            if (!v9.b())
                v9.a(Boolean.valueOf(1));
            v0 = v0 + 1;
        }
        v0 = 0;
        while (v0 < v8.length) {
            this.k.a(v8[v0], 7);
            v0 = v0 + 1;
        }
        this.i.c();
        this.f.a();
        if (!((Boolean)com.google.android.finsky.aa.b.iq.b()).booleanValue() && this.g.dj().a(12629250) && v5.length == 0)
            v4 = 0;
        v0 = new com.google.android.finsky.accounts.impl.b(this, v6, v1);
        if (v4 != 0)
            this.l.a(v0, "accounts_changed");
        else
            v0.run();
    }

}
