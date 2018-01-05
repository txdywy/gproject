package com.google.android.finsky.billing.lightpurchase;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.d.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.c;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.j;
import com.google.android.finsky.l.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.an;

public final class com.google.android.finsky.billing.lightpurchase.at implements Runnable
{

    public final com.google.wireless.android.finsky.dfe.nano.an a;
    public final boolean b;
    public final com.google.android.finsky.cv.a.ax c;
    public final Document d;
    public final String e;
    public final String f;
    public final Account g;
    public final com.google.android.finsky.d.w h;
    public final InstallRequest i;
    public final com.google.android.finsky.billing.d.e j;

    at(com.google.wireless.android.finsky.dfe.nano.an p0, boolean p1, com.google.android.finsky.cv.a.ax p2, Document p3, String p4, String p5, Account p6, com.google.android.finsky.d.w p7, InstallRequest p8, com.google.android.finsky.billing.d.e p9) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p7;
        this.i = p8;
        this.j = p9;
    }

    public final void run() {
        if (this.a.a == 1 && this.b != 0 && this.c.c == 1) {
            com.google.android.finsky.m.a.bu().b(this.d);
            com.google.android.finsky.m.a.I().b.b(this.d.a.d, this.e);
            if (this.a.c != 0) {
                if (!TextUtils.isEmpty(this.f))
                    com.google.android.finsky.m.a.o().a(this.d.a.c, this.f);
                v7 = this.h.a("single_install");
                if (this.d.N() == 0) {
                    v2 = new Object[1];
                    v2[0] = this.d.a.c;
                    FinskyLog.e("Document does not contain AppDetails, cannot download: %s", v2);
                }
                if (com.google.android.finsky.m.a.dj().a(12643667)) {
                    if (this.i == 0)
                        v6 = new com.google.android.finsky.installqueue.j(v7.c(), this.d).b(this.g.name).b(2).a();
                    else
                        v6 = this.i;
                    new com.google.android.finsky.billing.lightpurchase.aw(com.google.android.finsky.m.a.cS(), com.google.android.finsky.m.a.Y(), com.google.android.finsky.m.a.bw(), com.google.android.finsky.m.a.T(), com.google.android.finsky.m.a.bF()).a(v6);
                }
                else if (this.i != 0)
                    com.google.android.finsky.billing.lightpurchase.av.a.a(this.i);
                else {
                    v0 = com.google.android.finsky.m.a.o();
                    v0.a(this.d.N().k, this.d.bV());
                    v0.a(this.d.N().k, this.d.N().c, this.g.name, this.d.a.g, 2, this.d.z(), v7);
                }
            }
            else {
                v1 = new Object[1];
                v1[0] = this.d.a.c;
                FinskyLog.c("missing delivery data for %s", v1);
            }
        }
        if (this.j != 0)
            this.j.a(this.g, this.d);
    }

}
