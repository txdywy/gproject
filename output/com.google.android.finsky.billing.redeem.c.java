package com.google.android.finsky.billing.redeem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.finsky.dfe.nano.ek;
import com.google.wireless.android.finsky.dfe.nano.el;
import com.google.wireless.android.finsky.dfe.nano.k;

public final class com.google.android.finsky.billing.redeem.c extends com.google.android.finsky.billing.common.s
{

    public com.google.android.finsky.api.c a;
    public com.google.wireless.android.finsky.dfe.nano.ek b;
    public com.google.wireless.android.finsky.dfe.nano.el c;
    public String d;
    public VolleyError e;
    public com.google.android.wallet.common.pub.e f;
    public com.google.android.finsky.billing.redeem.f g;

    c() {
        com.google.android.finsky.billing.common.s();
        this.b = new com.google.wireless.android.finsky.dfe.nano.ek();
        com.google.android.finsky.m.a.aE();
        this.f = new com.google.android.wallet.common.pub.e();
        this.g = new com.google.android.finsky.billing.redeem.e(this);
    }

    public final com.google.wireless.android.finsky.dfe.nano.k W() {
        if (this.l != 2) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(this.l);
            FinskyLog.e("Invalid state: %d", v1);
            v0 = 0;
        }
        else
            v0 = this.c.n;
        return v0;
    }

    public final Document X() {
        if (this.c == 0 || this.c.j == 0)
            v0 = 0;
        else
            v0 = new Document(this.c.j);
        return v0;
    }

    public final void a(com.google.android.finsky.d.w p0) {
 22:    p0.a(new com.google.android.finsky.d.c(800).c(com.google.android.wallet.common.util.a.a(this.h())));
 27:    if (this.c == 0) goto 153;
 35:    if (this.c.a & 2)
 37:        v0 = 1;
        else
 54:        v0 = 0;
 38:    if (v0 == 0) goto 153;
 46:    if (this.c.c == 0)
 53:        throw new NullPointerException();
 60:    this.b.a = this.b.a | 4;
 62:    this.b.f = this.c.c;
 68:    this.b.k = 0;
 74:    this.b.a = this.b.a & -65;
 78:    if (this.c != 0 && this.c.k != 0 && this.c.k.d == 3) {
107:        v0 = com.google.android.finsky.m.a.L().a(this.c.k.b);
111:        if (v0 != 0) {
122:            this.b.a = this.b.a | 64;
124:            this.b.k = (long)v0.d;
            }
        }
126:    this.c = 0;
128:    this.e = 0;
130:    this.d = 0;
146:    this.a.a(this.b, new com.google.android.finsky.billing.redeem.h(this, p0), new com.google.android.finsky.billing.redeem.g(this, p0));
149:    this.b(1, 0);
152:    return;
157:    this.b.f = "";
163:    this.b.a = this.b.a & -5;
165:    goto 64;
    }

    public final void b(Bundle p0) {
        this.a = com.google.android.finsky.m.a.b(this.q.getString("authAccount"));
        if (p0 != 0) {
            this.b = (com.google.wireless.android.finsky.dfe.nano.ek)ParcelableProto.a(p0, "RedeemCodeSidecar.request");
            this.c = (com.google.wireless.android.finsky.dfe.nano.el)ParcelableProto.a(p0, "RedeemCodeSidecar.last_redeem_code_response");
            this.d = p0.getString("RedeemCodeSidecar.error_html");
        }
        else {
            this.b.g = this.q.getInt("RedeemCodeSidecar.redemption_context");
            this.b.a = this.b.a | 8;
            this.b.i = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "RedeemCodeSidecar.docid");
            v0 = this.q.getInt("RedeemCodeSidecar.offer_type");
            if (v0 != 0) {
                this.b.j = v0;
                this.b.a = this.b.a | 32;
            }
            v0 = this.q.getString("RedeemCodeSidecar.partner_payload");
            if (v0 != 0) {
                if (v0 == 0)
                    throw new NullPointerException();
                this.b.a = this.b.a | 16;
                this.b.h = v0;
            }
            v0 = this.q.getString("RedeemCodeSidecar.pcampaign_id");
            if (v0 != 0) {
                if (v0 == 0)
                    throw new NullPointerException();
                this.b.a = this.b.a | 256;
                this.b.m = v0;
            }
        }
        v0 = this.g.a(new com.google.android.wallet.common.pub.i(this.q.getInt("RedeemCodeSidecar.im_theme_res_id")).a());
        if (v0 == 0)
            throw new NullPointerException();
        this.b.a = this.b.a | 128;
        this.b.l = v0;
        super.b(p0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("RedeemCodeSidecar.request", ParcelableProto.a(this.b));
        p0.putParcelable("RedeemCodeSidecar.last_redeem_code_response", ParcelableProto.a(this.c));
        p0.putString("RedeemCodeSidecar.error_html", this.d);
    }

}
