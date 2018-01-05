package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.view.View;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.billing.profile.a extends Fragment implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.d.a a;
    public com.google.android.finsky.d.w af;
    public View ag;
    public View ah;
    public View ai;
    public final com.google.android.finsky.billing.profile.b b;
    public String c;
    public int d;
    public com.google.android.finsky.billing.profile.m e;
    public com.google.wireless.android.finsky.dfe.nano.u f;
    public Account g;
    public int h;
    public boolean i;

    a() {
        Fragment();
        this.b = new com.google.android.finsky.billing.profile.b(this);
        this.d = -1;
        this.i = 1;
    }

    public abstract void W();

    protected void X() {
        switch (this.e.af) {
            case 1:
                this.a(this.e.am);
                break;
            case 2:
                this.a(com.google.android.finsky.api.m.a(this.h(), this.e.an));
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.e.af);
                FinskyLog.d("Don't know how to handle error substate %d, cancel.", v1);
                this.a(this.c(2131952119));
                break;
        }
    }

    protected void Y() {
        if (this.i != 0) {
            this.i = 0;
            if (this.f != 0 && this.a(this.f.b)) {
                this.aa();
                this.a(this.f.b, this.f.e);
                v3 = new ArrayList(this.f.d.length);
                v1 = 0;
                while (v1 < this.f.d.length) {
                    if (this.f.d[v1].d == 7)
                        v0 = this.a(this.f.d[v1]);
                    else
                        v0 = this.e.a(this.f.d[v1], this.f.e, this, this.af);
                    if (v0 != 0)
                        v3.add(v0);
                    v1 = v1 + 1;
                }
                this.a(v3);
                this.b(this.f.i);
                this.ah.setVisibility(8);
                if (this.ai != 0)
                    this.ai.setVisibility(8);
                this.ag.setVisibility(0);
                this.ag.requestFocus();
                this.Z();
            }
        }
    }

    public abstract void Z();

    public abstract com.google.android.finsky.billing.profile.w a(com.google.wireless.android.finsky.dfe.nano.v p0);

    public void a(Activity p0) {
        ((com.google.android.finsky.billing.profile.l)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.profile.l)).a(this);
        super.a(p0);
    }

    public void a(View p0, Bundle p1) {
        super.a(p0, p1);
        if (this.ag == 0)
            throw new IllegalStateException("mProfileView not set up.");
        if (this.ah == 0)
            throw new IllegalStateException("mProgressIndicator not set up.");
        this.e = (com.google.android.finsky.billing.profile.m)this.B.a("BillingProfileFragment.billingProfileSidecar");
        if (this.e == 0) {
            this.e = com.google.android.finsky.billing.profile.m.a(this.g, this.c, this.ab(), this.ac(), this.ad(), this.h);
            this.B.a().a(this.e, "BillingProfileFragment.billingProfileSidecar").c();
        }
        this.Y();
    }

    public abstract void a(RedeemCodeResult p0);

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public abstract void a(String p0);

    public abstract void a(String p0, byte[] p1);

    public abstract void a(List p0);

    public abstract void a(ao[] p0, byte[] p1);

    public boolean a(ao[] p0) {
        return 1;
    }

    protected void aa() {
    }

    public SetupWizardParams ab() {
        return 0;
    }

    public abstract Intent ac();

    public abstract int ad();

    public void ae() {
        v0 = (com.google.wireless.android.finsky.dfe.nano.u)ParcelableProto.a(this.q, "BillingProfileFragment.prefetchedBillingProfile");
        if (v0 == 0)
            this.e.a(this.e.W(), 0, 0, this.af);
        else {
            this.e.al = v0;
            this.e.b(2, 0);
        }
    }

    public void b(Bundle p0) {
        super.b(p0);
        this.g = (Account)this.q.getParcelable("BillingProfileFragment.account");
        this.c = this.q.getString("BillingProfileFragment.purchaseContextToken");
        if (p0 != 0) {
            this.f = (com.google.wireless.android.finsky.dfe.nano.u)ParcelableProto.a(p0, "BillingProfileFragment.profile");
            if (this.f != 0)
                this.i = 1;
            this.d = p0.getInt("BillingProfileFragment.lastBillingProfileStateInstance", -1);
            this.af = this.a.a(p0);
        }
        else
            this.af = this.a.a(this.q);
    }

    protected void b(String p0) {
    }

    public final void d() {
        super.d();
        this.i = 1;
        this.d = -1;
    }

    public void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("BillingProfileFragment.profile", ParcelableProto.a(this.f));
        p0.putInt("BillingProfileFragment.lastBillingProfileStateInstance", this.d);
        this.af.a(p0);
    }

    public final void u() {
        super.u();
        this.Y();
        this.e.a(this.b);
    }

    public final void v() {
        this.e.a(0);
        super.v();
    }

}
