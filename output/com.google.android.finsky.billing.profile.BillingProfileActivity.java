package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.flushlogs.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.u;

protected class BillingProfileActivity extends android.support.v7.app.aa implements com.google.android.finsky.billing.profile.j
{

    public com.google.android.finsky.d.a q;
    public com.google.android.finsky.flushlogs.a r;
    public com.google.android.finsky.billing.common.m s;
    public Account t;
    public String u;
    public com.google.android.finsky.cv.a.ax v;
    public com.google.android.finsky.d.w w;
    public PurchaseFlowConfig x;
    public Intent y;

    BillingProfileActivity() {
        android.support.v7.app.aa();
    }

    public static Intent a(Context p0, Account p1, String p2, com.google.android.finsky.cv.a.ax p3, int p4, com.google.wireless.android.finsky.dfe.nano.u p5, PurchaseFlowConfig p6, com.google.android.finsky.d.w p7, int p8) {
        v0 = new Intent(p0, BillingProfileActivity);
        v0.putExtra("BillingProfileActiivty.account", p1);
        v0.putExtra("BillingProfileActiivty.purchaseContextToken", p2);
        v0.putExtra("BillingProfileActiivty.docid", ParcelableProto.a(p3));
        v0.putExtra("BillingProfileActiivty.offerType", p4);
        v0.putExtra("BillingProfileActiivty.prefetchedBillingProfile", ParcelableProto.a(p5));
        com.google.android.finsky.billing.common.m.a(v0, p6);
        v0.putExtra("BillingProfileActiivty.redemption_context", p8);
        v0.putExtra("BillingProfileActiivty.using_cached_billing_profile", 0);
        p7.a(p1).a(v0);
        return v0;
    }

    public final void a(RedeemCodeResult p0) {
        v0 = new Intent();
        v0.putExtra("BillingProfileActivity.redeemPromoCodeResult", p0);
        this.y = v0;
        this.setResult(-1, v0);
        this.finish();
    }

    public final void a(String p0, byte[] p1) {
        v0 = new Intent();
        v0.putExtra("BillingProfileActivity.selectedInstrumentId", p0);
        this.y = v0;
        this.setResult(-1, v0);
        this.finish();
    }

    public void finish() {
        v0 = (com.google.android.finsky.billing.profile.a)this.H_().a("BillingProfileActiivty.fragment");
        if (v0 != 0) {
            v2 = v0.e.al;
            if (v0.e.l == 4)
                v0 = 1;
            else
                v0 = 0;
            if (v2 != 0 && v0 == 0)
                v0 = v2.k;
            else
                v0 = 0;
            if (this.y == 0 && v0 != 0) {
                this.y = new Intent();
                this.y.putExtra("BillingProfileActiivty.catchAbandonmentDialog", ParcelableProto.a(v0));
                this.setResult(0, this.y);
            }
        }
        super.finish();
    }

    public final void k() {
        this.setResult(0);
        this.finish();
    }

    protected void onCreate(Bundle p0) {
  1:    super.onCreate(p0);
 12:    ((com.google.android.finsky.billing.profile.l)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.profile.l)).a(this);
 18:    this.setContentView(2130968650);
 21:    v1 = this.getIntent();
 33:    this.t = (Account)v1.getParcelableExtra("BillingProfileActiivty.account");
 41:    this.u = v1.getStringExtra("BillingProfileActiivty.purchaseContextToken");
 51:    this.v = (com.google.android.finsky.cv.a.ax)ParcelableProto.a(v1, "BillingProfileActiivty.docid");
 59:    v5 = (com.google.wireless.android.finsky.dfe.nano.u)ParcelableProto.a(v1, "BillingProfileActiivty.prefetchedBillingProfile");
 63:    v8 = v1.getBooleanExtra("BillingProfileActiivty.using_cached_billing_profile", 0);
 71:    this.x = com.google.android.finsky.billing.common.m.a(v1);
 79:    this.w = this.q.a(p0, v1);
 89:    v9 = (TextView)this.findViewById(2131755114);
 91:    if (v5 != 0 && !TextUtils.isEmpty(v5.h))
103:        v9.setText(v5.h);
226:    else if (v8 != 0)
231:        v9.setText(2131951798);
        else
238:        v9.setText(2131952751);
106:    if (v5 == 0) goto 112;
110:    if (v5.j != 0 || v8 != 0)
121:        this.findViewById(2131755333).setVisibility(0);
132:    v10 = (TextView)this.findViewById(2131755755);
138:    v10.setText(this.t.name);
141:    v10.setVisibility(0);
154:    if (this.H_().a("BillingProfileActiivty.fragment") == 0)
202:        this.H_().a().a(2131755313, com.google.android.finsky.billing.profile.c.a(this.t, this.u, this.v, v1.getIntExtra("BillingProfileActiivty.offerType", 12), v1.getIntExtra("BillingProfileActiivty.redemption_context", 1), v5, this.x, this.w, v8), "BillingProfileActiivty.fragment").c();
211:    v1 = this.s.a(this.x);
217:    this.s.a("ALL_TITLE", v9, v1);
222:    this.s.a("ALL_FOP", v10, v1);
    }

    protected void onPause() {
        super.onPause();
        this.r.a();
    }

    protected void onResume() {
        super.onResume();
        this.r.c();
    }

}
