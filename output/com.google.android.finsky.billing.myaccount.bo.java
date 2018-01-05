package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.api.m;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.common.LightPurchaseButtonBarLayout;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.providers.d;

protected class com.google.android.finsky.billing.myaccount.bo extends com.google.android.finsky.billing.common.h implements View$OnClickListener, com.google.android.finsky.billing.common.t
{

    public com.google.android.finsky.billing.myaccount.bq G;
    public com.google.android.finsky.by.l o;
    public Account p;
    public Document q;
    public com.google.android.finsky.billing.myaccount.br r;
    public TextView s;
    public TextView t;
    public PlayActionButtonV2 u;
    public PlayActionButtonV2 v;
    public View w;

    bo() {
        com.google.android.finsky.billing.common.h();
    }

    protected static Intent a(Intent p0, Account p1, Document p2, com.google.android.finsky.d.w p3) {
        if (p1 == 0)
            throw new IllegalArgumentException("account is required");
        if (p2 == 0)
            throw new IllegalArgumentException("document is required");
        p0.putExtra("SubscriptionActionActivity.document", p2);
        p0.putExtra("SubscriptionActionActivity.account", p1);
        p3.a(p1).a(p0);
        com.google.android.finsky.billing.common.h.a(p0, p1.name);
        return p0;
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
        return new com.google.android.finsky.d.c(p0).a(this.q.a.c).a(this.q.d()).b(1);
    }

    protected abstract void a(Intent p0);

    public final void a(com.google.android.finsky.billing.common.s p0) {
        switch (this.r.l) {
            case 0:
                break;
            case 1:
                this.t.setVisibility(8);
                this.u.setVisibility(8);
                this.v.setVisibility(8);
                this.w.setVisibility(0);
                break;
            case 2:
                this.E.a(this.c(this.j()).a(0).a(1));
                v2 = new w[1];
                v2[0] = this.r.e;
                this.o.a(this.p, this.l(), new com.google.android.finsky.billing.myaccount.bp(this, this.m()), v2);
                break;
            case 3:
                this.E.a(this.c(this.j()).a(1).a(0).a(this.r.f));
                this.t.setText(com.google.android.finsky.api.m.a(this, this.r.f));
                this.u.a(0, 2131952688, this);
                this.a(1, 0);
                break;
            default:
                throw new IllegalStateException(35 + "Unhandled state change: " + p0.l);
        }
    }

    protected abstract void a(com.google.android.finsky.billing.myaccount.br p0);

    protected abstract boolean a(TextView p0, TextView p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3);

    protected abstract int f();

    protected abstract int h();

    protected abstract int i();

    protected abstract int j();

    protected abstract int k();

    protected abstract String l();

    protected abstract int m();

    public void onClick(View p0) {
        if (p0 == this.u) {
            if (this.r.l == 3) {
                this.E.b(new com.google.android.finsky.d.d(this).a(2903));
                this.finish();
            }
            else {
                this.E.b(new com.google.android.finsky.d.d(this).a(this.h()));
                this.a(this.r);
                this.E.a(this.c(this.k()));
            }
        }
        else {
            if (p0 != this.v) {
                v1 = String.valueOf(p0);
                throw new IllegalArgumentException((String.valueOf(v1).length() + 22) + "Unknown view clicked: " + v1);
            }
            this.E.b(new com.google.android.finsky.d.d(this).a(this.i()));
            this.finish();
        }
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        v1 = this.getIntent();
        this.p = (Account)v1.getParcelableExtra("SubscriptionActionActivity.account");
        this.q = (Document)v1.getParcelableExtra("SubscriptionActionActivity.document");
        this.a(v1);
        this.setContentView(2130968674);
        this.w = this.findViewById(2131755388);
        this.s = (TextView)this.findViewById(2131755114);
        this.t = (TextView)this.findViewById(2131755334);
        this.u = (PlayActionButtonV2)this.findViewById(2131755791);
        this.v = (PlayActionButtonV2)this.findViewById(2131755776);
        this.a(this.a(this.s, this.t, this.u, this.v), 1);
        ((LightPurchaseButtonBarLayout)this.findViewById(2131756143)).setShouldShowLogo(0);
    }

    protected void onPause() {
        this.r.a(0);
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.r.a(this);
        if (this.G == 0)
            com.google.android.finsky.bg.a.a(this, this.s.getText(), this.s, 0);
        else {
            this.s.getText();
            this.G.a();
        }
    }

    protected void onStart() {
        super.onStart();
        this.r = (com.google.android.finsky.billing.myaccount.br)this.H_().a("SubscriptionActionActivity.sidecar");
        if (this.r == 0) {
            this.r = com.google.android.finsky.billing.myaccount.br.a(this.B, this.q.a.c, this.q.d());
            this.H_().a().a(this.r, "SubscriptionActionActivity.sidecar").c();
        }
    }

}
