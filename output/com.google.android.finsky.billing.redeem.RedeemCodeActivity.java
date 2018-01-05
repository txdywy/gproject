package com.google.android.finsky.billing.redeem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.eb;

protected class RedeemCodeActivity extends com.google.android.finsky.billing.common.h implements com.google.android.finsky.billing.redeem.b
{

    public com.google.android.finsky.billing.redeem.a n;

    RedeemCodeActivity() {
        com.google.android.finsky.billing.common.h();
    }

    public static Intent a(String p0, int p1, com.google.android.finsky.cv.a.ax p2, int p3, PurchaseFlowConfig p4, com.google.android.finsky.d.w p5) {
        v0 = new Intent(com.google.android.finsky.m.a.b, RedeemCodeActivity);
        v0.putExtra("authAccount", p0);
        v0.putExtra("RedeemCodeActivity.redemption_context", p1);
        v0.putExtra("RedeemCodeActivity.docid", ParcelableProto.a(p2));
        v0.putExtra("RedeemCodeActivity.offer_type", p3);
        com.google.android.finsky.billing.common.m.a(v0, p4);
        p5.b(p0).a(v0);
        return v0;
    }

    public static Intent a(String p0, int p1, String p2, String p3, com.google.android.finsky.d.w p4) {
        if (com.google.android.finsky.m.a.j(p0).a(12632678)) {
            v7 = new com.google.wireless.android.finsky.dfe.c.a.eb();
            if (!TextUtils.isEmpty(p3)) {
                if (p3 == 0)
                    throw new NullPointerException();
                v7.a = v7.a | 2;
                v7.c = p3;
            }
            if (!TextUtils.isEmpty(p2)) {
                if (p2 == 0)
                    throw new NullPointerException();
                v7.a = v7.a | 1;
                v7.b = p2;
            }
            v7.e = p1;
            v7.a = v7.a | 8;
            v0 = com.google.android.finsky.m.a.bo().a(com.google.android.finsky.m.a.U().b(p0), com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.j(p0), 0, p4, 0, v7, 0, 0);
        }
        else {
            v0 = new Intent(com.google.android.finsky.m.a.b, RedeemCodeActivity);
            v0.putExtra("authAccount", p0);
            v0.putExtra("RedeemCodeActivity.redemption_context", p1);
            v0.putExtra("RedeemCodeActivity.prefill_code", p2);
            v0.putExtra("RedeemCodeActivity.partner_payload", p3);
            p4.b(p0).a(v0);
        }
        return v0;
    }

    public final boolean a(Document p0) {
        return 0;
    }

    public final boolean a(String p0) {
        return 0;
    }

    protected final int f() {
        return 880;
    }

    public void finish() {
        if (this.n != 0 && this.n.f != 0) {
            v0 = new Intent();
            v0.putExtra("redeem_code_result", this.n.f);
            this.E.a(v0);
            this.setResult(-1, v0);
            if (this.n.f != 0 && this.n.f.c == 0)
                com.google.android.finsky.m.a.cw().a(this.B);
        }
        else
            this.setResult(0);
        super.finish();
    }

    public final void h() {
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130969329);
        if (p0 == 0) {
            v6 = this.getIntent();
            this.H_().a().a(2131755313, com.google.android.finsky.billing.redeem.a.a(this.B, v6.getIntExtra("RedeemCodeActivity.redemption_context", 0), (com.google.android.finsky.cv.a.ax)ParcelableProto.a(v6, "RedeemCodeActivity.docid"), v6.getIntExtra("RedeemCodeActivity.offer_type", 0), v6.getStringExtra("RedeemCodeActivity.prefill_code"), com.google.android.finsky.billing.payments.f.a(0), v6.getStringExtra("RedeemCodeActivity.partner_payload"), com.google.android.finsky.billing.common.m.a(v6), 0)).c();
        }
    }

    protected void onStart() {
        super.onStart();
        this.n = (com.google.android.finsky.billing.redeem.a)this.H_().a(2131755313);
        this.n.aJ = this.E;
    }

}
