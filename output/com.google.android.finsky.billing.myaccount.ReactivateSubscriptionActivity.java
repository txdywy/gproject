package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.m;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.common.LightPurchaseButtonBarLayout;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.hv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.c.a.dy;
import com.google.wireless.android.finsky.dfe.c.a.dz;

protected class ReactivateSubscriptionActivity extends com.google.android.finsky.billing.common.h implements View$OnClickListener, com.google.android.finsky.billing.common.t
{

    public com.google.android.finsky.billing.myaccount.bl G;
    public com.google.android.finsky.by.l n;
    public Account o;
    public Document p;
    public com.google.android.finsky.billing.myaccount.bm q;
    public com.google.android.finsky.cv.a.hv r;
    public TextView s;
    public TextView t;
    public PlayActionButtonV2 u;
    public PlayActionButtonV2 v;
    public View w;

    ReactivateSubscriptionActivity() {
        com.google.android.finsky.billing.common.h();
    }

    private final void a(boolean p0, boolean p1) {
        v1 = 0;
        if (p0 != 0)
            v0 = 0;
        else
            v0 = 8;
        this.t.setVisibility(v0);
        this.u.setVisibility(0);
        if (p1 == 0)
            v1 = 8;
        this.v.setVisibility(v1);
        this.w.setVisibility(8);
    }

    private final com.google.android.finsky.d.c c(int p0) {
        return new com.google.android.finsky.d.c(p0).a(this.p.a.c).a(this.p.d());
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        switch (this.q.l) {
            case 0:
                break;
            case 1:
                this.t.setVisibility(8);
                this.u.setVisibility(8);
                this.v.setVisibility(8);
                this.w.setVisibility(0);
                break;
            case 2:
                this.E.a(this.c(1431).a(0).a(1));
                v5 = new w[1];
                v5[0] = this.q.d.a;
                this.n.a(this.o, "reactivateSubscription", new com.google.android.finsky.billing.myaccount.bk(this), v5);
                break;
            case 3:
                this.E.a(this.c(1431).a(1).a(0).a(this.q.e));
                this.t.setText(com.google.android.finsky.api.m.a(this, this.q.e));
                this.u.a(0, 2131952688, this);
                this.a(1, 0);
                break;
            default:
                throw new IllegalStateException(35 + "Unhandled state change: " + p0.l);
        }
    }

    protected final int f() {
        return 330;
    }

    public void onClick(View p0) {
        if (p0 == this.u) {
            if (this.q.l == 3) {
                this.E.b(new com.google.android.finsky.d.d(this).a(2903));
                this.finish();
            }
            else {
                this.E.b(new com.google.android.finsky.d.d(this).a(2941));
                v1 = new com.google.wireless.android.finsky.dfe.c.a.dy();
                v1.a = this.q.c;
                this.q.b.a(v1, this.q, this.q);
                this.q.b(1, 0);
                this.E.a(this.c(1430));
            }
        }
        else {
            if (p0 != this.v) {
                v1 = String.valueOf(p0);
                throw new IllegalArgumentException((String.valueOf(v1).length() + 22) + "Unknown view clicked: " + v1);
            }
            this.E.b(new com.google.android.finsky.d.d(this).a(2942));
            this.finish();
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        v1 = this.getIntent();
        this.o = (Account)v1.getParcelableExtra("ReactivateSubscriptionDialog.account");
        this.p = (Document)v1.getParcelableExtra("ReactivateSubscriptionDialog.document");
        this.r = (com.google.android.finsky.cv.a.hv)ParcelableProto.a(v1, "ReactivateSubscriptionDialog.dialog");
        this.setContentView(2130968674);
        this.w = this.findViewById(2131755388);
        this.s = (TextView)this.findViewById(2131755114);
        this.t = (TextView)this.findViewById(2131755334);
        this.u = (PlayActionButtonV2)this.findViewById(2131755791);
        this.v = (PlayActionButtonV2)this.findViewById(2131755776);
        this.s.setText(this.r.b);
        if (this.r.bl_())
            this.t.setText(this.r.c);
        this.u.a(0, this.r.d, this);
        this.v.a(0, this.r.e, this);
        this.a(this.r.bl_(), 1);
        ((LightPurchaseButtonBarLayout)this.findViewById(2131756143)).setShouldShowLogo(0);
    }

    protected void onPause() {
        this.q.a(0);
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.q.a(this);
        if (this.G == 0)
            com.google.android.finsky.bg.a.a(this, this.s.getText(), this.s, 0);
        else {
            this.s.getText();
            this.G.a();
        }
    }

    protected void onStart() {
        super.onStart();
        this.q = (com.google.android.finsky.billing.myaccount.bm)this.H_().a("ReactivateSubscriptionDialog.sidecar");
        if (this.q == 0) {
            this.q = com.google.android.finsky.billing.myaccount.bm.a(this.B, this.p.d());
            this.H_().a().a(this.q, "ReactivateSubscriptionDialog.sidecar").c();
        }
    }

}
