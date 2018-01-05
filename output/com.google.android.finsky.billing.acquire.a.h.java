package com.google.android.finsky.billing.acquire.a;

import a.a;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.r;
import com.google.android.finsky.billing.b.f;
import com.google.android.finsky.billing.b.q;
import com.google.android.finsky.billing.payments.g;
import com.google.android.finsky.d.o;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.wallet.common.c.a;
import com.google.android.wallet.common.pub.a.a;
import com.google.wireless.android.finsky.dfe.c.a.v;

public final class com.google.android.finsky.billing.acquire.a.h extends com.google.android.finsky.dialogbuilder.a.l
{

    public final com.google.wireless.android.finsky.dfe.c.a.v a;
    public final com.google.android.finsky.billing.b.f b;

    h(com.google.wireless.android.finsky.dfe.c.a.v p0, com.google.android.finsky.billing.b.f p1) {
        com.google.android.finsky.dialogbuilder.a.l(0);
        this.a = p0;
        this.b = p1;
    }

    public final int a() {
        throw new UnsupportedOperationException("OrchestrationComponent has no fixed layout ID.");
    }

    public final View a(com.google.android.finsky.dialogbuilder.e p0, ViewGroup p1) {
        this.b.c = this.a;
        com.google.android.wallet.common.pub.a.a.a = new com.google.android.finsky.billing.payments.g(new com.google.android.finsky.d.o(1600), this.b.j);
        com.google.android.wallet.common.c.a.a((com.android.volley.r)this.b.a.a());
        com.google.android.wallet.common.c.a.b((com.android.volley.r)this.b.b.a());
        v1 = this.b.i.a(this.a, this.b.j);
        if (v1.getParent() != 0)
            ((ViewGroup)v1.getParent()).removeView(v1);
        return v1;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        throw new UnsupportedOperationException("OrchestrationComponent does not support view configuration.");
    }

}
