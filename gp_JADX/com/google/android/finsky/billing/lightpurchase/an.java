package com.google.android.finsky.billing.lightpurchase;

import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1874a;
import com.google.android.finsky.billing.legacyauth.C1878e;
import com.google.android.finsky.billing.legacyauth.C1882i;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1918d;
import com.google.android.finsky.billing.lightpurchase.p118d.C1920f;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.a.a.k;
import com.squareup.leakcanary.C7582R;

final class an implements C1882i {
    public final /* synthetic */ C1874a f9761a;
    public final /* synthetic */ k f9762b;
    public final /* synthetic */ am f9763c;

    an(am amVar, C1874a c1874a, k kVar) {
        this.f9763c = amVar;
        this.f9761a = c1874a;
        this.f9762b = kVar;
    }

    public final void g_() {
        if (this.f9763c.m610k()) {
            C1920f c1920f = this.f9763c.aI;
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
                return;
            }
            return;
        }
        this.f9761a.m10010a();
    }

    public final void mo2509a(AuthState authState) {
        if (this.f9763c.m610k()) {
            boolean z;
            if (this.f9763c.ay) {
                C1920f c1920f = this.f9763c.aI;
                if (c1920f.f9845a.ax == null) {
                    FinskyLog.m21669e("Illegal state: hideLoading called without fragment.", new Object[0]);
                } else {
                    Fragment fragment = c1920f.f9845a;
                    fragment.aD.setVisibility(0);
                    fragment.aD.startAnimation(AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.play_fade_in));
                    C1086a c1086a = c1920f.f9845a;
                    c1086a.m6742b(c1086a.aE);
                    c1920f.f9845a.ay = false;
                    c1920f.f9845a.m6743b(c1920f.f9845a.ax);
                    c1920f.f9845a.mo1412a(c1920f.f9845a.ax);
                }
            }
            this.f9763c.mo2516a(this.f9762b, authState);
            C1874a c1874a = this.f9761a;
            if (authState.m10001a() == 2) {
                z = true;
            } else {
                z = false;
            }
            bb.m21792a(new C1878e(c1874a, z), new Void[0]);
        }
    }
}
