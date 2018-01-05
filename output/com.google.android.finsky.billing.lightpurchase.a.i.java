package com.google.android.finsky.billing.lightpurchase.a;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.nano.au;

public final class com.google.android.finsky.billing.lightpurchase.a.i extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.dfemodel.w
{

    public final com.google.android.finsky.d.a a;
    public com.google.android.finsky.api.c b;
    public com.google.wireless.android.finsky.a.a.m c;
    public String d;
    public com.google.android.finsky.dfemodel.i e;
    public com.google.android.finsky.d.w f;

    i() {
        com.google.android.finsky.billing.common.s();
        this.a = com.google.android.finsky.m.a.aR();
    }

    private final void a(int p0, Throwable p1) {
        v0 = new com.google.android.finsky.d.c(518).a(p1);
        if (p0 != -1)
            v0.a(p0);
        this.f.a(v0);
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("Volley error received: %s", v1);
        this.a(1, p0);
        this.d = com.google.android.finsky.api.m.a(com.google.android.finsky.m.a.b, p0);
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        this.b = com.google.android.finsky.m.a.b(this.q.getString("authAccount"));
        if (p0 != 0)
            this.f = this.a.a(p0);
        else
            this.f = this.a.a(this.q);
        super.b(p0);
    }

    public final void b_(Object p0) {
        this.c = ((com.google.wireless.android.finsky.dfe.nano.au)p0).b;
        if (this.c == 0) {
            if (((com.google.wireless.android.finsky.dfe.nano.au)p0).c == 0)
                throw new IllegalStateException("Received no challenge.");
            this.a(-1, 0);
            this.b(2, 0);
        }
        else {
            if (this.c.d != 0) {
                this.a(2, 0);
                this.b(5, 0);
                return;
            }
            if (this.c.e != 0) {
                this.a(3, 0);
                this.b(6, 0);
                return;
            }
            if (this.c.n == 0)
                throw new IllegalStateException("Received unknown challenge.");
            this.a(4, 0);
            this.b(3, 1);
        }
    }

    public final void m_() {
        v0 = this.e.b();
        if (v0 == 0) {
            this.d = this.c(2131952398);
            this.b(3, 0);
        }
        else if (v0.a.E != 0)
            this.b(4, 0);
        else
            this.b(7, 0);
    }

}
