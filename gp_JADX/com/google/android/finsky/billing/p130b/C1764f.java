package com.google.android.finsky.billing.p130b;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.dialogbuilder.C2794b;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.h.b.a.a.a.a;
import com.google.wireless.android.finsky.dfe.c.a.q;
import com.google.wireless.android.finsky.dfe.c.a.v;
import p002a.C0002a;

public final class C1764f {
    public C0002a f9094a;
    public C0002a f9095b;
    public v f9096c;
    public C2794b f9097d;
    public a f9098e;
    public boolean f9099f;
    public boolean f9100g;
    public final C2792h f9101h;
    public final C1776q f9102i;
    public final C2495w f9103j;
    public final C1763d f9104k;

    public C1764f(C1763d c1763d, Bundle bundle, C2792h c2792h, C2495w c2495w, C1776q c1776q) {
        ((C1349e) C3947d.m18649a(C1349e.class)).mo1728a(this);
        this.f9101h = c2792h;
        this.f9102i = c1776q;
        this.f9103j = c2495w;
        this.f9104k = c1763d;
        if (bundle != null) {
            this.f9100g = bundle.getBoolean("AcquireOrchestrationModel.finishedEventLogged");
            if (bundle.containsKey("AcquireOrchestrationModel.component")) {
                this.f9096c = (v) ParcelableProto.m21673a(bundle, "AcquireOrchestrationModel.component");
            }
        }
    }

    public final void m9688a(q qVar) {
        if (this.f9099f) {
            if (qVar.d != null) {
                this.f9103j.m13371a(new C2474c(qVar.d.b).m13240a(qVar.d.c).m13248d(1).f13342a, null);
                if (qVar.e) {
                    C1763d c1763d = this.f9104k;
                    ad c2473o = new C2473o(1600);
                    c2473o.mo1219a(C1763d.e);
                    c1763d.f.m13373a(new C2488p().m13342a(c2473o).m13344a(), null);
                    c2473o = new C2473o(800);
                    c2473o.mo1219a(C1763d.e);
                    c1763d.f.m13373a(new C2488p().m13342a(c2473o).m13344a(), null);
                }
            }
            this.f9097d.mo3138a(qVar.b);
        } else {
            this.f9097d.mo3138a(qVar.c);
        }
        this.f9099f = false;
        this.f9102i.mo2453a();
    }

    public final void m9687a(Bundle bundle) {
        Object string = bundle.getString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID");
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) bundle.getParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD");
        if (((this.f9096c.a & 16) != 0) && !TextUtils.isEmpty(string)) {
            this.f9101h.m14870a(this.f9096c.g, string);
        }
        if (!(securePaymentsPayload == null || securePaymentsPayload.c == null)) {
            this.f9098e = securePaymentsPayload.c;
        }
        this.f9099f = true;
    }

    public final void m9686a(int i) {
        if (!this.f9100g && this.f9096c.k != null) {
            this.f9100g = true;
            this.f9103j.m13371a(new C2474c(this.f9096c.k.c).m13210a(i).f13342a, null);
        }
    }
}
