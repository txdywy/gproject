package com.google.android.finsky.billing.lightpurchase.d;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cf;

public class com.google.android.finsky.billing.lightpurchase.d.a extends Fragment implements com.google.android.finsky.billing.lightpurchase.d.g
{

    public boolean aA;
    public View$OnClickListener aB;
    public View aC;
    public View aD;
    public View aE;
    public View aF;
    public View aG;
    public View aH;
    public com.google.android.finsky.billing.lightpurchase.d.f aI;
    public com.google.android.finsky.d.w aJ;
    public final com.google.android.finsky.d.a au;
    public final Runnable av;
    public Account aw;
    public com.google.android.finsky.billing.lightpurchase.d.h ax;
    public boolean ay;
    public boolean az;

    a() {
        Fragment();
        this.au = com.google.android.finsky.m.a.aR();
        this.av = new com.google.android.finsky.billing.lightpurchase.d.b(this);
        this.aI = new com.google.android.finsky.billing.lightpurchase.d.f(this);
    }

    private final void a(View p0, String p1, int p2, int p3) {
        if (TextUtils.isEmpty(p1))
            p0.setVisibility(8);
        else {
            p0.setVisibility(0);
            if (p0 instanceof PlayActionButtonV2) {
                ((PlayActionButtonV2)p0).a(this.W(), p1, this.aB);
                if (p2 != -1)
                    p0.setBackgroundColor(p2);
                if (p3 != -1)
                    ((TextView)p0).setTextColor(p3);
            }
            else if (p0 instanceof Button)
                ((Button)p0).setText(p1);
        }
    }

    public abstract int W();

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        return p0.inflate(2130969058, p1, 0);
    }

    public final void a(int p0, com.google.android.finsky.d.ad p1) {
        this.aJ.b(new com.google.android.finsky.d.d(p1).a(p0));
    }

    public final void a(int p0, com.google.wireless.android.a.a.a.a.cf p1, com.google.android.finsky.d.ad p2) {
        this.aJ.b(new com.google.android.finsky.d.d(p2).a(p0).a(p1));
    }

    public final void a(View p0, Bundle p1) {
        super.a(p0, p1);
        this.aC = p0;
        v0 = com.google.android.finsky.setup.cs.a(this.h());
        if (v0 != 0) {
            this.aA = 0;
            this.aF = v0.getView();
            this.aG = v0.b;
            this.aH = 0;
        }
        else {
            this.aA = 1;
            this.aF = this.aC.findViewById(2131756143);
            this.aG = this.aC.findViewById(2131755791);
            this.aH = this.aC.findViewById(2131755776);
        }
        this.aF.setVisibility(8);
        this.aB = new com.google.android.finsky.billing.lightpurchase.d.c(this);
        if (!(this.aG instanceof PlayActionButtonV2))
            this.aG.setOnClickListener(this.aB);
        if (this.aH != 0 && !(this.aH instanceof PlayActionButtonV2))
            this.aH.setOnClickListener(this.aB);
        this.aE = this.aC.findViewById(2131755380);
        this.aD = this.aC.findViewById(2131756033);
    }

    public final void a(com.google.android.finsky.billing.lightpurchase.d.h p0) {
        v1 = this.aI.a.j().a();
        if (this.aI.a.ay != 0) {
            this.aI.a.aD.setVisibility(4);
            this.aI.a.aC.postDelayed(this.aI.a.av, 100);
        }
        else {
            if (this.aI.a.ax != 0)
                v1.a(2131034152, 2131034155);
            this.aI.a.aD.setVisibility(0);
            this.aI.a.b(p0);
        }
        if (this.aI.a.ax != 0)
            v1.a(this.aI.a.ax);
        v1.a(2131756033, p0);
        v1.c();
        this.aI.a.ax = p0;
        this.aI.a.ay = 0;
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        this.aJ.a(new com.google.android.finsky.d.p().b(p0));
    }

    public final Account ai() {
        return this.aw;
    }

    public final void aj() {
        if (this.aI.a.az != 0 && this.aI.a.az != 0) {
            this.aI.a.az = 0;
            if (this.aI.a.aA != 0)
                this.aI.a.b(this.aI.a.aF);
            else
                this.aI.a.aF.setVisibility(4);
        }
        if (this.aI.a.ay == 0) {
            if (this.aI.a.ax != 0) {
                v2 = AnimationUtils.loadAnimation(this.aI.a.h(), 2131034155);
                v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.aI.a));
                this.aI.a.aD.startAnimation(v2);
                this.aI.a.aE.setVisibility(0);
                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034152));
            }
            else {
                this.aI.a.aD.setVisibility(4);
                this.aI.a.aE.setVisibility(0);
                this.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
            }
            this.aI.a.ay = 1;
            this.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.aI.a.h()));
        }
    }

    public final void ak() {
        if (this.aI.a.ax == 0)
            FinskyLog.e("Illegal state: hideLoading called without fragment.", new Object[0]);
        else {
            this.aI.a.aD.setVisibility(0);
            this.aI.a.aD.startAnimation(AnimationUtils.loadAnimation(this.aI.a.h(), 2131034135));
            this.aI.a.b(this.aI.a.aE);
            this.aI.a.ay = 0;
            this.aI.a.b(this.aI.a.ax);
            this.aI.a.a(this.aI.a.ax);
        }
    }

    public final boolean al() {
        return this.ay;
    }

    public final com.google.android.finsky.d.w am() {
        return this.aJ;
    }

    public final void an() {
        if (this.ay != 0)
            this.aE.setVisibility(0);
        else if (this.ax != 0)
            this.aD.setVisibility(0);
        this.b(this.ax);
    }

    public final View ao() {
        return this.aF;
    }

    public final Button ap() {
        return (Button)this.aG;
    }

    public final Button aq() {
        return (Button)this.aH;
    }

    public void b(Bundle p0) {
        super.b(p0);
        if (this.q.containsKey("MultiStepFragment.account"))
            this.aw = (Account)this.q.getParcelable("MultiStepFragment.account");
        else if (this.q.containsKey("authAccount"))
            this.aw = com.google.android.finsky.m.a.U().b(this.q.getString("authAccount"));
        if (this.aw == 0)
            throw new IllegalStateException("No account specified.");
        if (p0 != 0) {
            this.ay = p0.getBoolean("MultiStepFragment.isLoading");
            this.aJ = this.au.a(p0);
        }
        else
            this.aJ = this.au.a(this.q);
    }

    public final void b(View p0) {
        v0 = AnimationUtils.loadAnimation(this.h(), 2131034127);
        v0.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.e(p0));
        p0.startAnimation(v0);
    }

    public final void b(com.google.android.finsky.billing.lightpurchase.d.h p0) {
        v3 = 0;
        if (p0 != 0 && !p0.W()) {
            this.aF.setVisibility(8);
            this.az = 0;
        }
        else {
            if (this.az == 0 && p0 != 0 && this.az == 0) {
                if (this.ay == 0)
                    v0 = 1;
                else
                    v0 = 0;
                this.az = v0;
                if (this.az != 0) {
                    this.aF.setVisibility(0);
                    if (this.aA != 0)
                        this.aF.startAnimation(AnimationUtils.loadAnimation(this.h(), 2131034135));
                }
            }
            if (p0 != 0 && this.ay == 0) {
                v4 = p0.a(this.i());
                v3 = p0.b(this.i());
                v1 = p0.q.getInt("continueButtonBgColor", -1);
                v0 = p0.q.getInt("continueButtonTextColor", -1);
            }
            else {
                v0 = -1;
                v1 = -1;
                v4 = 0;
            }
            this.a(this.aG, v4, v1, v0);
            if (this.aH != 0)
                this.a(this.aH, v3, -1, -1);
        }
    }

    public final void b(boolean p0) {
        this.aG.setEnabled(p0);
    }

    public void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("MultiStepFragment.isLoading", this.ay);
        this.aJ.a(p0);
    }

    public void g_() {
        super.g_();
        this.ax = (com.google.android.finsky.billing.lightpurchase.d.h)this.j().a(2131756033);
        this.an();
    }

    public void h_() {
        this.aC.removeCallbacks(this.av);
        super.h_();
    }

}
