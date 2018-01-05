package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.e.j;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.Locale;

public final class com.google.android.finsky.billing.lightpurchase.e.ae extends com.google.android.finsky.billing.lightpurchase.d.h implements View$OnClickListener
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public PlayActionButtonV2 af;
    public PlayActionButtonV2 ag;
    public final com.google.android.finsky.d.t b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public View i;

    ae() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(1250);
        this.b = com.google.android.finsky.m.a.aP();
    }

    private final void a(int p0) {
        com.google.android.finsky.m.a.aQ().a(this.c, p0, 0, "success-step-with-choices", ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am());
    }

    public final boolean W() {
        return 0;
    }

    public final void X() {
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        if (this.f != 0 || this.g != 0)
            v0 = 2130969079;
        else
            v0 = 2130969078;
        this.i = p0.inflate(v0, p1, 0);
        if (this.f != 0) {
            if (this.e != 0)
                v0 = 2131952758;
            else
                v0 = 2131952754;
        }
        else if (this.g != 0) {
            if (this.e != 0)
                v0 = 2131952759;
            else
                v0 = 2131952755;
        }
        else if (this.e != 0)
            v0 = 2131952757;
        else
            v0 = 2131952753;
        this.d = this.c(v0);
        v4 = (TextView)this.i.findViewById(2131755312);
        com.google.android.finsky.bg.ae.a(v4, this.d);
        if (this.f != 0 || this.g != 0) {
            v0 = (TextView)this.i.findViewById(2131756200);
            if (this.f != 0 || this.g != 0) {
                if (this.e != 0)
                    v1 = 2131952760;
                else
                    v1 = 2131952756;
            }
            else
                v1 = 0;
            v6 = new Object[1];
            v6[0] = ((String)com.google.android.finsky.aa.b.gt.b()).replace("%lang%", Locale.getDefault().getLanguage().toLowerCase());
            com.google.android.finsky.bg.ae.a(v0, this.a(v1, v6));
            v7 = v0;
        }
        else
            v7 = 0;
        v1 = this.q.getInt("SuccessStepWithAuthChoices.backend");
        this.af = (PlayActionButtonV2)this.i.findViewById(2131756197);
        this.ag = (PlayActionButtonV2)this.i.findViewById(2131756199);
        if (this.f == 0 && this.g != 0)
            v0 = 2131953511;
        else
            v0 = 2131952946;
        this.af.a(v1, v0, this);
        if (this.f != 0)
            v0 = 2131952947;
        else if (this.g != 0)
            v0 = 2131952618;
        else
            v0 = 2131952948;
        this.ag.a(v1, v0, this);
        com.google.android.finsky.m.a.aH().a(this.q, this.i, (TextView)this.i.findViewById(2131755114), v4, 0, 0, v7, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return this.i;
    }

    public final String a(Resources p0) {
        return 0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.c = this.q.getString("authAccount");
        this.e = this.q.getBoolean("SuccessStepWithAuthChoices.usedPinBasedAuth");
        this.f = com.google.android.finsky.m.a.j(this.c).a(12609656);
        this.g = com.google.android.finsky.m.a.j(this.c).a(12609657);
        if (p0 != 0)
            this.h = p0.getBoolean("SuccessStepWithAuthChoices.stepFragmentReadyLogged");
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("SuccessStepWithAuthChoices.stepFragmentReadyLogged", this.h);
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void onClick(View p0) {
        if (p0 == this.af) {
            this.a(1251, 0);
            this.a(2);
        }
        else if (p0 == this.ag) {
            if (this.f != 0 || this.g != 0) {
                this.a(1253, 0);
                this.a(0);
            }
            else {
                this.a(1252, 0);
                this.a(1);
            }
        }
        v0 = (com.google.android.finsky.billing.lightpurchase.aq)this.aa();
        if (v0 != 0)
            v0.ah();
    }

    public final void u() {
        super.u();
        if (this.d == 0)
            throw new IllegalArgumentException("No text was specified for a11y announcements.");
        com.google.android.finsky.bg.a.a(this.i.getContext(), this.d, this.i, 0);
        if (this.h == 0) {
            this.b.c(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am(), "purchase_fragment_success_choice");
            this.h = 1;
        }
    }

}
