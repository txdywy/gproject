package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.inlineappinstaller.c extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.google.android.finsky.dfemodel.w, com.google.android.finsky.installqueue.o
{

    public final com.google.android.finsky.d.a a;
    public com.google.android.finsky.dfemodel.i b;
    public Document c;
    public String d;
    public int e;
    public final List f;
    public com.google.android.finsky.api.c g;

    c() {
        com.google.android.finsky.billing.common.s();
        this.a = com.google.android.finsky.m.a.aR();
        this.e = -1;
        this.f = new ArrayList();
    }

    final void a(Account p0, Document p1) {
        v0 = com.google.android.finsky.m.a.o();
        v0.a(p1.N().k, p1.bV());
        v0.a(p1.a.d, p1.h(), p0.name, p1.a.g, 2, p1.z(), this.a.a("content_dependency"));
        com.google.android.finsky.m.a.bw().a(this);
        this.b(7, 0);
    }

    public final void a(VolleyError p0) {
        this.a(this.c(2131952242));
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        if (p0.a() != 0 && p0.a().equals(this.c.a.d)) {
            this.e = p0.c.d;
            v1 = this.f.iterator();
            while (v1.hasNext())
                ((com.google.android.finsky.activities.inlineappinstaller.e)v1.next()).a(p0.c.d);
        }
    }

    public final void a(String p0) {
        this.d = p0;
        this.b(3, 0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.g = com.google.android.finsky.m.a.b(this.q.getString("authAccount"));
        this.b = new com.google.android.finsky.dfemodel.i(this.g, com.google.android.finsky.api.l.a(com.google.android.finsky.m.a.bn().a(((com.google.android.finsky.cv.a.cv)ParcelableProto.a(this.q, "InlineConsumptionAppInstallerSidecar.mediaDoc")).f)));
        this.b.a(this);
        this.b.a(this);
    }

    public final void g_() {
        super.g_();
        this.b.a(this);
        this.b.a(this);
    }

    public final void h_() {
        this.b.b(this);
        this.b.b(this);
        super.h_();
    }

    public final void m_() {
        this.c = this.b.b();
        if (this.c == 0)
            this.a(this.c(2131952242));
        else
            this.b(5, 0);
    }

}
