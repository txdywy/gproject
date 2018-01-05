package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.finsky.billing.d.d;
import com.google.android.finsky.billing.d.e;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.m;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.ak;
import com.google.wireless.android.finsky.dfe.nano.am;
import com.google.wireless.android.finsky.dfe.nano.an;

public final class com.google.android.finsky.billing.lightpurchase.as implements com.android.volley.x
{

    public final long a;
    public final com.google.android.finsky.d.w b;
    public final String c;
    public final com.google.android.finsky.cv.a.ax d;
    public final int e;
    public final Account f;
    public final Document g;
    public final String h;
    public final boolean i;
    public final com.google.android.finsky.billing.d.e j;
    public final InstallRequest k;
    public final boolean l;
    public final boolean m;
    public final com.google.android.finsky.billing.d.d n;

    as(long p0, com.google.android.finsky.d.w p2, String p3, com.google.android.finsky.cv.a.ax p4, int p5, Account p6, Document p7, String p8, boolean p9, com.google.android.finsky.billing.d.e p10, InstallRequest p11, boolean p12, boolean p13, com.google.android.finsky.billing.d.d p14) {
        this.a = p0;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10;
        this.k = p11;
        this.l = p12;
        this.m = p13;
        this.n = p14;
    }

    public final void b_(Object p0) {
        p0 = (com.google.wireless.android.finsky.dfe.nano.ak)p0;
        v0 = SystemClock.elapsedRealtime() - this.a;
        if (p0.b != 0) {
            if (p0.b.b == 0) {
                if (p0.c != 0) {
                    this.b.a(new com.google.android.finsky.d.c(301).a(this.c).a(this.d).b(this.e).a(p0.e).b(v0));
                    v3 = new w[1];
                    v3[0] = p0.c.b;
                    com.google.android.finsky.m.a.ai().a(this.f, "free_purchase", new com.google.android.finsky.billing.lightpurchase.at(p0.c, this.i, this.d, this.g, this.h, p0.f, this.f, this.b, this.k, this.j), v3);
                }
                else {
                    FinskyLog.c("Expected PurchaseStatusResponse.", new Object[0]);
                    if (this.l != 0 && this.j != 0)
                        this.j.S_();
                }
            }
            else {
                this.b.a(new com.google.android.finsky.d.c(301).a(this.c).b(this.e).a(p0.b.b).b(v0));
                if (this.m != 0)
                    com.google.android.finsky.m.a.r().a(com.google.android.finsky.m.a.a(2131952119), p0.b.d, p0.b.d, this.c, this.g.a.w, this.b.a());
                if (this.l != 0 && this.j != 0)
                    this.j.S_();
            }
        }
        else {
            if (p0.d == 0)
                throw new IllegalStateException("Expected purchase response or challenges.");
            this.n.a(p0.d);
        }
    }

}
