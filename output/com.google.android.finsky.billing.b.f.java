package com.google.android.finsky.billing.b;

import a.a;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dialogbuilder.b;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.h.b.a.a.a.a;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cr;
import com.google.wireless.android.finsky.dfe.c.a.q;
import com.google.wireless.android.finsky.dfe.c.a.v;

public final class com.google.android.finsky.billing.b.f
{

    public a.a a;
    public a.a b;
    public com.google.wireless.android.finsky.dfe.c.a.v c;
    public com.google.android.finsky.dialogbuilder.b d;
    public com.google.h.b.a.a.a.a e;
    public boolean f;
    public boolean g;
    public final com.google.android.finsky.dialogbuilder.b.h h;
    public final com.google.android.finsky.billing.b.q i;
    public final com.google.android.finsky.d.w j;
    public final com.google.android.finsky.billing.b.d k;

    f(com.google.android.finsky.billing.b.d p0, Bundle p1, com.google.android.finsky.dialogbuilder.b.h p2, com.google.android.finsky.d.w p3, com.google.android.finsky.billing.b.q p4) {
        ((com.google.android.finsky.billing.b.e)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.b.e)).a(this);
        this.h = p2;
        this.i = p4;
        this.j = p3;
        this.k = p0;
        if (p1 != 0) {
            this.g = p1.getBoolean("AcquireOrchestrationModel.finishedEventLogged");
            if (p1.containsKey("AcquireOrchestrationModel.component"))
                this.c = (com.google.wireless.android.finsky.dfe.c.a.v)ParcelableProto.a(p1, "AcquireOrchestrationModel.component");
        }
    }

    public final void a(int p0) {
        if (this.g == 0 && this.c.k != 0) {
            this.g = 1;
            this.j.a(new com.google.android.finsky.d.c(this.c.k.c).a(p0).a, 0);
        }
    }

    public final void a(Bundle p0) {
        v3 = p0.getString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID");
        v0 = (SecurePaymentsPayload)p0.getParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD");
        if (this.c.a & 16)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0 && !TextUtils.isEmpty(v3))
            this.h.a(this.c.g, v3);
        if (v0 != 0 && v0.c != 0)
            this.e = v0.c;
        this.f = 1;
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.q p0) {
        if (this.f != 0) {
            if (p0.d != 0) {
                this.j.a(new com.google.android.finsky.d.c(p0.d.b).a(p0.d.c).d(1).a, 0);
                if (p0.e != 0) {
                    v1 = new com.google.android.finsky.d.o(1600);
                    v1.a(com.google.android.finsky.billing.b.d.e);
                    this.k.f.a(new com.google.android.finsky.d.p().a(v1).a(), 0);
                    v1 = new com.google.android.finsky.d.o(800);
                    v1.a(com.google.android.finsky.billing.b.d.e);
                    this.k.f.a(new com.google.android.finsky.d.p().a(v1).a(), 0);
                }
            }
            this.d.a(p0.b);
        }
        else
            this.d.a(p0.c);
        this.f = 0;
        this.i.a();
    }

}
