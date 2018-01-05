package com.google.android.finsky.billing.lightpurchase;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.a;
import com.google.android.finsky.billing.legacyauth.e;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.d;
import com.google.android.finsky.billing.lightpurchase.d.f;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.a.a.k;

public final class com.google.android.finsky.billing.lightpurchase.an implements com.google.android.finsky.billing.legacyauth.i
{

    public final com.google.android.finsky.billing.legacyauth.a a;
    public final com.google.wireless.android.finsky.a.a.k b;
    public final com.google.android.finsky.billing.lightpurchase.am c;

    an(com.google.android.finsky.billing.lightpurchase.am p0, com.google.android.finsky.billing.legacyauth.a p1, com.google.wireless.android.finsky.a.a.k p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void a(AuthState p0) {
        if (this.c.k()) {
            if (this.c.ay != 0) {
                if (this.c.aI.a.ax == 0)
                    FinskyLog.e("Illegal state: hideLoading called without fragment.", new Object[0]);
                else {
                    this.c.aI.a.aD.setVisibility(0);
                    this.c.aI.a.aD.startAnimation(AnimationUtils.loadAnimation(this.c.aI.a.h(), 2131034135));
                    this.c.aI.a.b(this.c.aI.a.aE);
                    this.c.aI.a.ay = 0;
                    this.c.aI.a.b(this.c.aI.a.ax);
                    this.c.aI.a.a(this.c.aI.a.ax);
                }
            }
            this.c.a(this.b, p0);
            if (p0.a() == 2)
                v0 = 1;
            else
                v0 = 0;
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.legacyauth.e(this.a, v0), new Void[0]);
        }
    }

    public final void g_() {
        if (!this.c.k())
            this.a.a();
        else {
            if (this.c.aI.a.az != 0 && this.c.aI.a.az != 0) {
                this.c.aI.a.az = 0;
                if (this.c.aI.a.aA != 0)
                    this.c.aI.a.b(this.c.aI.a.aF);
                else
                    this.c.aI.a.aF.setVisibility(4);
            }
            if (this.c.aI.a.ay == 0) {
                if (this.c.aI.a.ax != 0) {
                    v2 = AnimationUtils.loadAnimation(this.c.aI.a.h(), 2131034155);
                    v2.setAnimationListener(new com.google.android.finsky.billing.lightpurchase.d.d(this.c.aI.a));
                    this.c.aI.a.aD.startAnimation(v2);
                    this.c.aI.a.aE.setVisibility(0);
                    this.c.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.c.aI.a.h(), 2131034152));
                }
                else {
                    this.c.aI.a.aD.setVisibility(4);
                    this.c.aI.a.aE.setVisibility(0);
                    this.c.aI.a.aE.startAnimation(AnimationUtils.loadAnimation(this.c.aI.a.h(), 2131034135));
                }
                this.c.aI.a.ay = 1;
                this.c.aI.a.aJ.a(new com.google.android.finsky.d.p().a(213).b((com.google.android.finsky.d.ad)this.c.aI.a.h()));
            }
        }
    }

}
