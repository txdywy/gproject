package com.google.android.finsky.billing.lightpurchase.p118d;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cf;
import com.squareup.leakcanary.C7582R;

public abstract class C1086a extends Fragment implements C1085g {
    public boolean aA;
    public OnClickListener aB;
    public View aC;
    public View aD;
    public View aE;
    public View aF;
    public View aG;
    public View aH;
    public C1920f aI = new C1920f(this);
    public C2495w aJ;
    public final C2471a au = C1473m.f7980a.aR();
    public final Runnable av = new C1916b(this);
    public Account aw;
    public C1076h ax;
    public boolean ay;
    public boolean az;

    public abstract int mo968W();

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (this.f760q.containsKey("MultiStepFragment.account")) {
            this.aw = (Account) this.f760q.getParcelable("MultiStepFragment.account");
        } else if (this.f760q.containsKey("authAccount")) {
            this.aw = C1473m.f7980a.mo2041U().mo1183b(this.f760q.getString("authAccount"));
        }
        if (this.aw == null) {
            throw new IllegalStateException("No account specified.");
        } else if (bundle != null) {
            this.ay = bundle.getBoolean("MultiStepFragment.isLoading");
            this.aJ = this.au.m13179a(bundle);
        } else {
            this.aJ = this.au.m13179a(this.f760q);
        }
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("MultiStepFragment.isLoading", this.ay);
        this.aJ.m13377a(bundle);
    }

    public void g_() {
        super.g_();
        this.ax = (C1076h) m607j().mo281a((int) C7582R.id.content_frame_above_button);
        an();
    }

    public void h_() {
        this.aC.removeCallbacks(this.av);
        super.h_();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7582R.layout.light_purchase, viewGroup, false);
    }

    public final Account ai() {
        return this.aw;
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        this.aC = view;
        SetupWizardNavBar a = cs.m19397a(m603h());
        if (a != null) {
            this.aA = false;
            this.aF = a.getView();
            this.aG = a.f20629b;
            this.aH = null;
        } else {
            this.aA = true;
            this.aF = this.aC.findViewById(C7582R.id.continue_button_bar);
            this.aG = this.aC.findViewById(C7582R.id.continue_button);
            this.aH = this.aC.findViewById(C7582R.id.secondary_button);
        }
        this.aF.setVisibility(8);
        this.aB = new C1917c(this);
        if (!(this.aG instanceof PlayActionButtonV2)) {
            this.aG.setOnClickListener(this.aB);
        }
        if (!(this.aH == null || (this.aH instanceof PlayActionButtonV2))) {
            this.aH.setOnClickListener(this.aB);
        }
        this.aE = this.aC.findViewById(C7582R.id.progress_bar);
        this.aD = this.aC.findViewById(C7582R.id.content_frame_above_button);
    }

    public final void aj() {
        C1920f c1920f = this.aI;
        if (c1920f.f9845a.az) {
            C1086a c1086a = c1920f.f9845a;
            if (c1086a.az) {
                c1086a.az = false;
                if (c1086a.aA) {
                    c1086a.m6742b(c1086a.aF);
                } else {
                    c1086a.aF.setVisibility(4);
                }
            }
        }
        if (!c1920f.f9845a.ay) {
            if (c1920f.f9845a.ax != null) {
                Fragment fragment = c1920f.f9845a;
                Animation loadAnimation = AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.slide_out_left);
                loadAnimation.setAnimationListener(new C1918d(fragment));
                fragment.aD.startAnimation(loadAnimation);
                c1920f.f9845a.aE.setVisibility(0);
                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.slide_in_right));
            } else {
                c1920f.f9845a.aD.setVisibility(4);
                c1920f.f9845a.aE.setVisibility(0);
                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.play_fade_in));
            }
            c1920f.f9845a.ay = true;
            Fragment fragment2 = c1920f.f9845a;
            fragment2.aJ.m13370a(new C2488p().m13340a(213).m13345b((ad) fragment2.m603h()));
        }
    }

    public final void ak() {
        C1920f c1920f = this.aI;
        if (c1920f.f9845a.ax == null) {
            FinskyLog.m21669e("Illegal state: hideLoading called without fragment.", new Object[0]);
            return;
        }
        Fragment fragment = c1920f.f9845a;
        fragment.aD.setVisibility(0);
        fragment.aD.startAnimation(AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.play_fade_in));
        C1086a c1086a = c1920f.f9845a;
        c1086a.m6742b(c1086a.aE);
        c1920f.f9845a.ay = false;
        c1920f.f9845a.m6743b(c1920f.f9845a.ax);
        c1920f.f9845a.mo1412a(c1920f.f9845a.ax);
    }

    public final boolean al() {
        return this.ay;
    }

    public final void mo1411a(C1076h c1076h) {
        C1920f c1920f = this.aI;
        aw a = c1920f.f9845a.m607j().mo284a();
        if (c1920f.f9845a.ay) {
            c1920f.f9845a.aD.setVisibility(4);
            c1920f.f9845a.aC.postDelayed(c1920f.f9845a.av, 100);
        } else {
            if (c1920f.f9845a.ax != null) {
                a.mo323a((int) C7582R.anim.slide_in_right, (int) C7582R.anim.slide_out_left);
            }
            c1920f.f9845a.aD.setVisibility(0);
            c1920f.f9845a.m6743b(c1076h);
        }
        if (c1920f.f9845a.ax != null) {
            a.mo327a(c1920f.f9845a.ax);
        }
        a.mo325a((int) C7582R.id.content_frame_above_button, (Fragment) c1076h);
        a.mo334c();
        c1920f.f9845a.ax = c1076h;
        c1920f.f9845a.ay = false;
    }

    public final void mo1422b(boolean z) {
        this.aG.setEnabled(z);
    }

    public final C2495w am() {
        return this.aJ;
    }

    public final void mo1412a(ad adVar) {
        this.aJ.m13370a(new C2488p().m13345b(adVar));
    }

    public final void mo1408a(int i, ad adVar) {
        this.aJ.m13379b(new C2475d(adVar).m13256a(i));
    }

    public final void mo1409a(int i, cf cfVar, ad adVar) {
        this.aJ.m13379b(new C2475d(adVar).m13256a(i).m13257a(cfVar));
    }

    public final void m6743b(C1076h c1076h) {
        String str = null;
        if (c1076h == null || c1076h.mo968W()) {
            int i;
            int i2;
            String str2;
            if (!(this.az || c1076h == null || this.az)) {
                this.az = !this.ay;
                if (this.az) {
                    this.aF.setVisibility(0);
                    if (this.aA) {
                        this.aF.startAnimation(AnimationUtils.loadAnimation(m603h(), C7582R.anim.play_fade_in));
                    }
                }
            }
            if (c1076h == null || this.ay) {
                i = -1;
                i2 = -1;
                str2 = null;
            } else {
                str2 = c1076h.mo1406a(m605i());
                str = c1076h.mo2536b(m605i());
                i2 = c1076h.f760q.getInt("continueButtonBgColor", -1);
                i = c1076h.f760q.getInt("continueButtonTextColor", -1);
            }
            m6733a(this.aG, str2, i2, i);
            if (this.aH != null) {
                m6733a(this.aH, str, -1, -1);
                return;
            }
            return;
        }
        this.aF.setVisibility(8);
        this.az = false;
    }

    private final void m6733a(View view, String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (view instanceof PlayActionButtonV2) {
            ((PlayActionButtonV2) view).mo2588a(mo968W(), str, this.aB);
            if (i != -1) {
                view.setBackgroundColor(i);
            }
            if (i2 != -1) {
                ((TextView) view).setTextColor(i2);
            }
        } else if (view instanceof Button) {
            ((Button) view).setText(str);
        }
    }

    public final void m6742b(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(m603h(), C7582R.anim.fade_out);
        loadAnimation.setAnimationListener(new C1919e(view));
        view.startAnimation(loadAnimation);
    }

    public final void an() {
        if (this.ay) {
            this.aE.setVisibility(0);
        } else if (this.ax != null) {
            this.aD.setVisibility(0);
        }
        m6743b(this.ax);
    }

    public final View ao() {
        return this.aF;
    }

    public final Button ap() {
        return (Button) this.aG;
    }

    public final Button aq() {
        return (Button) this.aH;
    }
}
