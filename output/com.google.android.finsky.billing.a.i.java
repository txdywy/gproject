package com.google.android.finsky.billing.a;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.c.a.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.billing.c.b;
import com.google.android.finsky.billing.c.h;
import com.google.android.finsky.billing.common.r;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.c.a.ao;
import com.google.wireless.android.finsky.dfe.c.a.w;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.billing.a.i implements Runnable
{

    public final com.google.android.finsky.billing.a.h a;
    public final com.google.wireless.android.finsky.dfe.c.a.ao b;
    public final com.google.android.finsky.billing.c.b c;
    public final Context d;
    public final Account e;
    public final com.google.android.finsky.api.c f;
    public final com.google.android.finsky.d.w g;

    i(com.google.android.finsky.billing.a.h p0, com.google.wireless.android.finsky.dfe.c.a.ao p1, com.google.android.finsky.billing.c.b p2, Context p3, Account p4, com.google.android.finsky.api.c p5, com.google.android.finsky.d.w p6) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
    }

    public final void run() {
        if (this.a.f == 0) {
            new com.google.android.finsky.billing.common.r();
            this.a.f = new com.google.android.finsky.billing.c.h(this.d, this.a.b.j(this.e.name), 0);
        }
        this.b.f = new com.google.android.finsky.billing.c.a(this.d, this.e, new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this.d)), this.a.f, this.c, this.a.c, this.a.d, this.a.e, 0).a();
        v3 = this.f.c();
        v4 = this.a.b.j(v3);
        if (v4.a(12639965) && this.a.b(v3, 0)) {
            if (v4.a(12644643) && this.a.a.a(this.a.a(this.d, v3, this.b.f)))
                this.b.b = new w[0];
            else {
                v2 = new ArrayList();
                v0 = 0;
                while (v0 < this.b.b.length) {
                    if (!this.a.a.a(this.a.a(this.d, v3, this.b.b[v0].c.b, this.b.f)))
                        v2.add(this.b.b[v0]);
                    v0 = v0 + 1;
                }
                this.b.b = (w[])v2.toArray(new w[v2.size()]);
            }
        }
        if (this.b.b.length == 0)
            FinskyLog.a("Skipping a request to /bulkAcquire since cache has all the records.", new Object[0]);
        else {
            if (!v4.a(12639867))
                v7 = 1;
            else
                v7 = 0;
            v3 = this.a.b.j(v3).a(12639864);
            this.f.a(this.b, new com.google.android.finsky.billing.a.k(this.a, v4.a(12639865), v3, this.g, this.d.getApplicationContext(), this.f, v7, this.b), new com.google.android.finsky.billing.a.m(v3, this.g));
            if (v3 != 0)
                this.g.a(new com.google.android.finsky.d.c(2050));
        }
    }

}
