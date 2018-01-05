package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public abstract class C2046a extends Fragment implements ad {
    public C2471a f10531a;
    public C2495w af;
    public View ag;
    public View ah;
    public View ai;
    public final C2047b f10532b = new C2047b(this);
    public String f10533c;
    public int f10534d = -1;
    public C2056m f10535e;
    public u f10536f;
    public Account f10537g;
    public int f10538h;
    public boolean f10539i = true;

    public abstract void mo968W();

    public abstract void mo2599Z();

    public abstract C2066w mo2600a(v vVar);

    public abstract void mo2601a(RedeemCodeResult redeemCodeResult);

    public abstract void mo2602a(String str);

    public abstract void mo2603a(String str, byte[] bArr);

    public abstract void mo2604a(List list);

    public abstract void mo2605a(ao[] aoVarArr, byte[] bArr);

    public abstract Intent ac();

    public abstract int ad();

    public void mo1292a(Activity activity) {
        ((C1358l) C3947d.m18649a(C1358l.class)).mo1770a(this);
        super.mo1292a(activity);
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f10537g = (Account) this.f760q.getParcelable("BillingProfileFragment.account");
        this.f10533c = this.f760q.getString("BillingProfileFragment.purchaseContextToken");
        if (bundle != null) {
            this.f10536f = (u) ParcelableProto.m21673a(bundle, "BillingProfileFragment.profile");
            if (this.f10536f != null) {
                this.f10539i = true;
            }
            this.f10534d = bundle.getInt("BillingProfileFragment.lastBillingProfileStateInstance", -1);
            this.af = this.f10531a.m13179a(bundle);
            return;
        }
        this.af = this.f10531a.m13179a(this.f760q);
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("BillingProfileFragment.profile", ParcelableProto.m21671a(this.f10536f));
        bundle.putInt("BillingProfileFragment.lastBillingProfileStateInstance", this.f10534d);
        this.af.m13377a(bundle);
    }

    public void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        if (this.ag == null) {
            throw new IllegalStateException("mProfileView not set up.");
        } else if (this.ah == null) {
            throw new IllegalStateException("mProgressIndicator not set up.");
        } else {
            this.f10535e = (C2056m) this.f730B.mo283a("BillingProfileFragment.billingProfileSidecar");
            if (this.f10535e == null) {
                this.f10535e = C2056m.m10807a(this.f10537g, this.f10533c, ab(), ac(), ad(), this.f10538h);
                this.f730B.mo284a().mo328a(this.f10535e, "BillingProfileFragment.billingProfileSidecar").mo334c();
            }
            mo2598Y();
        }
    }

    public final void mo979u() {
        super.mo979u();
        mo2598Y();
        this.f10535e.m6757a(this.f10532b);
    }

    public final void mo980v() {
        this.f10535e.m6757a(null);
        super.mo980v();
    }

    public final void mo138d() {
        super.mo138d();
        this.f10539i = true;
        this.f10534d = -1;
    }

    protected void mo2597X() {
        switch (this.f10535e.af) {
            case 1:
                mo2602a(this.f10535e.am);
                return;
            case 2:
                mo2602a(C1290m.m7702a(m603h(), this.f10535e.an));
                return;
            default:
                FinskyLog.m21667d("Don't know how to handle error substate %d, cancel.", Integer.valueOf(this.f10535e.af));
                mo2602a(m592c((int) C7582R.string.error));
                return;
        }
    }

    protected void mo2598Y() {
        if (this.f10539i) {
            this.f10539i = false;
            if (this.f10536f != null && mo2622a(this.f10536f.b)) {
                aa();
                mo2605a(this.f10536f.b, this.f10536f.e);
                List arrayList = new ArrayList(this.f10536f.d.length);
                for (v vVar : this.f10536f.d) {
                    Object a;
                    if (vVar.d == 7) {
                        a = mo2600a(vVar);
                    } else {
                        a = this.f10535e.m10810a(vVar, this.f10536f.e, (ad) this, this.af);
                    }
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                mo2604a(arrayList);
                mo2610b(this.f10536f.i);
                this.ah.setVisibility(8);
                if (this.ai != null) {
                    this.ai.setVisibility(8);
                }
                this.ag.setVisibility(0);
                this.ag.requestFocus();
                mo2599Z();
            }
        }
    }

    protected void mo2610b(String str) {
    }

    protected void aa() {
    }

    public boolean mo2622a(ao[] aoVarArr) {
        return true;
    }

    public SetupWizardParams ab() {
        return null;
    }

    public void ae() {
        u uVar = (u) ParcelableProto.m21673a(this.f760q, "BillingProfileFragment.prefetchedBillingProfile");
        C1089s c1089s = this.f10535e;
        C2495w c2495w = this.af;
        if (uVar == null) {
            c1089s.m10816a(c1089s.mo968W(), null, 0, c2495w);
            return;
        }
        c1089s.al = uVar;
        c1089s.m6758b(2, 0);
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }
}
