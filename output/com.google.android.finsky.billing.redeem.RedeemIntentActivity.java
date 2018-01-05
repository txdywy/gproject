package com.google.android.finsky.billing.redeem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.android.wallet.common.util.a;

protected class RedeemIntentActivity extends com.google.android.finsky.billing.common.h implements com.google.android.finsky.billing.redeem.b
{

    public Document n;
    public String o;
    public int p;

    RedeemIntentActivity() {
        com.google.android.finsky.billing.common.h();
        this.p = 0;
        com.google.android.finsky.m.a.aJ();
    }

    public final boolean a(Document p0) {
        v0 = 1;
        this.n = p0;
        this.p = -1;
        if (this.getIntent().getBooleanExtra("show_success", 1))
            v0 = 0;
        return v0;
    }

    public final boolean a(String p0) {
        this.o = p0;
        this.p = 3;
        if (!TextUtils.isEmpty(this.getIntent().getStringExtra("code")))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int f() {
        return 880;
    }

    public void finish() {
        v0 = 0;
        if (this.n != 0)
            v0 = new Intent().putExtra("redeemed_docid", this.n.a.c);
        else if (!TextUtils.isEmpty(this.o))
            v0 = new Intent().putExtra("error_message", this.o);
        this.setResult(this.p, v0);
        super.finish();
    }

    public final void h() {
        this.finish();
    }

    protected void onCreate(Bundle p0) {
        v1 = this.getIntent();
        if (!v1.hasExtra("authAccount"))
            RedeemIntentActivity.a(v1, com.google.android.finsky.m.a.cZ());
        super.onCreate(p0);
        if (!((Boolean)com.google.android.finsky.aa.b.aq.b()).booleanValue()) {
            FinskyLog.c("Redeem intent API disabled by Gservices.", new Object[0]);
            this.p = 2;
            this.finish();
        }
        else {
            v4 = com.google.android.wallet.common.util.a.a(this);
            if (v4 == 0) {
                FinskyLog.c("Cannot find caller. Did you forget to use startActivityForResult?", new Object[0]);
                this.p = 1;
                this.finish();
            }
            else if (!com.google.android.finsky.dh.a.b(this) && !((Boolean)com.google.android.finsky.aa.b.ar.b()).booleanValue()) {
                v1 = new Object[1];
                v1[0] = v4;
                FinskyLog.c("Calling from untrusted package %s", v1);
                this.p = 1;
                this.finish();
            }
            else {
                this.setContentView(2130969329);
                v9 = this.H_();
                if (v9.a(2131755313) == 0)
                    v9.a().a(2131755313, com.google.android.finsky.billing.redeem.a.a(this.B, 8, 0, 0, v1.getStringExtra("code"), com.google.android.finsky.billing.payments.f.a(0), 0, PurchaseFlowConfig.a, v1.getStringExtra("pcampaign_id"))).c();
            }
        }
    }

    protected void onStart() {
        super.onStart();
        ((com.google.android.finsky.billing.redeem.a)this.H_().a(2131755313)).aJ = this.E;
    }

}
