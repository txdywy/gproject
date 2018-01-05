package com.google.android.finsky.billing.redeem;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.el;
import com.google.wireless.android.finsky.dfe.nano.k;

public final class C2089c extends C1089s {
    public C1254c f10652a;
    public ek f10653b = new ek();
    public el f10654c;
    public String f10655d;
    public VolleyError f10656e;
    public e f10657f;
    public C2091f f10658g;

    public C2089c() {
        C1473m.f7980a.aE();
        this.f10657f = new e();
        this.f10658g = new C2092e(this);
    }

    public final void mo136b(Bundle bundle) {
        Bundle bundle2 = this.f760q;
        this.f10652a = C1473m.f7980a.mo2112b(bundle2.getString("authAccount"));
        if (bundle != null) {
            this.f10653b = (ek) ParcelableProto.m21673a(bundle, "RedeemCodeSidecar.request");
            this.f10654c = (el) ParcelableProto.m21673a(bundle, "RedeemCodeSidecar.last_redeem_code_response");
            this.f10655d = bundle.getString("RedeemCodeSidecar.error_html");
        } else {
            int i = bundle2.getInt("RedeemCodeSidecar.redemption_context");
            ek ekVar = this.f10653b;
            ekVar.g = i;
            ekVar.a |= 8;
            this.f10653b.i = (ax) ParcelableProto.m21673a(bundle2, "RedeemCodeSidecar.docid");
            i = bundle2.getInt("RedeemCodeSidecar.offer_type");
            if (i != 0) {
                ekVar = this.f10653b;
                ekVar.j = i;
                ekVar.a |= 32;
            }
            String string = bundle2.getString("RedeemCodeSidecar.partner_payload");
            if (string != null) {
                ekVar = this.f10653b;
                if (string == null) {
                    throw new NullPointerException();
                }
                ekVar.a |= 16;
                ekVar.h = string;
            }
            string = bundle2.getString("RedeemCodeSidecar.pcampaign_id");
            if (string != null) {
                ekVar = this.f10653b;
                if (string == null) {
                    throw new NullPointerException();
                }
                ekVar.a |= 256;
                ekVar.m = string;
            }
        }
        UiConfig a = new i(bundle2.getInt("RedeemCodeSidecar.im_theme_res_id")).a();
        ek ekVar2 = this.f10653b;
        byte[] a2 = this.f10658g.mo2635a(a);
        if (a2 == null) {
            throw new NullPointerException();
        }
        ekVar2.a |= 128;
        ekVar2.l = a2;
        super.mo136b(bundle);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("RedeemCodeSidecar.request", ParcelableProto.m21671a(this.f10653b));
        bundle.putParcelable("RedeemCodeSidecar.last_redeem_code_response", ParcelableProto.m21671a(this.f10654c));
        bundle.putString("RedeemCodeSidecar.error_html", this.f10655d);
    }

    public final void m10947a(C2495w c2495w) {
        ek ekVar;
        C2322b a;
        c2495w.m13367a(new C2474c(800).m13247c(a.a(m603h())));
        if (this.f10654c != null) {
            if (((this.f10654c.a & 2) != 0 ? 1 : 0) != 0) {
                ekVar = this.f10653b;
                String str = this.f10654c.c;
                if (str == null) {
                    throw new NullPointerException();
                }
                ekVar.a |= 4;
                ekVar.f = str;
                ekVar = this.f10653b;
                ekVar.k = 0;
                ekVar.a &= -65;
                if (!(this.f10654c == null || this.f10654c.k == null || this.f10654c.k.f11835d != 3)) {
                    a = C1473m.f7980a.mo2032L().mo2854a(this.f10654c.k.f11833b);
                    if (a != null) {
                        ek ekVar2 = this.f10653b;
                        long j = (long) a.f11419d;
                        ekVar2.a |= 64;
                        ekVar2.k = j;
                    }
                }
                this.f10654c = null;
                this.f10656e = null;
                this.f10655d = null;
                this.f10652a.mo1575a(this.f10653b, new C2094h(this, c2495w), new C2093g(this, c2495w));
                m6758b(1, 0);
            }
        }
        ekVar = this.f10653b;
        ekVar.f = "";
        ekVar.a &= -5;
        ekVar = this.f10653b;
        ekVar.k = 0;
        ekVar.a &= -65;
        a = C1473m.f7980a.mo2032L().mo2854a(this.f10654c.k.f11833b);
        if (a != null) {
            ek ekVar22 = this.f10653b;
            long j2 = (long) a.f11419d;
            ekVar22.a |= 64;
            ekVar22.k = j2;
        }
        this.f10654c = null;
        this.f10656e = null;
        this.f10655d = null;
        this.f10652a.mo1575a(this.f10653b, new C2094h(this, c2495w), new C2093g(this, c2495w));
        m6758b(1, 0);
    }

    public final k mo968W() {
        if (this.f6948l == 2) {
            return this.f10654c.n;
        }
        FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(this.f6948l));
        return null;
    }

    public final Document m10946X() {
        if (this.f10654c == null || this.f10654c.j == null) {
            return null;
        }
        return new Document(this.f10654c.j);
    }
}
