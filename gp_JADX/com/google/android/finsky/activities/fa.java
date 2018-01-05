package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.aa;
import android.support.design.widget.ai;
import android.support.design.widget.an;
import android.support.design.widget.aq;
import android.support.v7.p041b.p042a.C0436b;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.finsky.C1400n;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.TimeUnit;

public final class fa extends ai implements ad {
    public static final long ak = TimeUnit.DAYS.toMillis(168);
    public C1461c af;
    public C0988c ag;
    public C2471a ah;
    public C1612l ai;
    public C1611k aj;
    public final ce al = C2482j.m13283a(2934);
    public String am;
    public PlayActionButtonV2 an;
    public Context ao;
    public C2495w ap;
    public C3748a aq;
    public aa ar = new fc(this);

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1400n) C3947d.m18649a(C1400n.class)).mo1703a(this);
        this.am = this.ag.cZ();
        if (bundle != null) {
            this.ap = this.ah.m13179a(bundle);
            return;
        }
        this.ap = this.ah.m13179a(this.f760q);
        this.ap.m13370a(new C2488p().m13345b(this));
    }

    public final Dialog mo143a(Bundle bundle) {
        Dialog a = super.mo143a(bundle);
        a.setOnShowListener(new fb(a));
        return a;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        this.ap.m13377a(bundle);
    }

    public final void mo144a(Dialog dialog, int i) {
        int i2 = 0;
        super.mo144a(dialog, i);
        View inflate = View.inflate(m601g(), C1592a.f8442Q.intValue(), null);
        dialog.setContentView(inflate);
        this.ao = m601g();
        this.aq = ((C1037e) m603h()).y_();
        an anVar = ((aq) ((View) inflate.getParent()).getLayoutParams()).f794a;
        if (anVar != null && (anVar instanceof BottomSheetBehavior)) {
            ((BottomSheetBehavior) anVar).f598t = this.ar;
        }
        ((Button) inflate.findViewById(C7582R.id.negative_button)).setOnClickListener(new fd(this));
        Configuration configuration = this.ao.getResources().getConfiguration();
        if (configuration.orientation == 2) {
            inflate.setMinimumWidth(C1611k.m9268a(360, this.ao.getResources()));
        }
        if (this.af.dj().mo2294a(12623744)) {
            int i3 = configuration.screenLayout & 15;
            if (configuration.orientation != 2 || i3 >= 4) {
                bd bdVar = new bd();
                bdVar.f11860f = (String) C0955b.ef.m28964b();
                bdVar.f11856b |= 16;
                bdVar.f11863i = true;
                if (bdVar.f11860f != null) {
                    this.ai.m9287a((FifeImageView) inflate.findViewById(C1592a.f8449X.intValue()), bdVar, -1);
                    ((FifeImageView) inflate.findViewById(C1592a.f8446U.intValue())).setImageDrawable(C0436b.m2650b(this.ao, C1592a.f8444S.intValue()));
                    ((FrameLayout) inflate.findViewById(C1592a.f8448W.intValue())).setVisibility(0);
                    i2 = 1;
                } else {
                    m626a(false);
                    i2 = 1;
                }
            } else {
                m6552b(inflate);
            }
        } else {
            m6552b(inflate);
            i2 = 2;
        }
        this.an = (PlayActionButtonV2) inflate.findViewById(C7582R.id.positive_button);
        this.an.mo2588a(2, this.ao.getString(C1592a.f8450Y.intValue()), new fe(this, i2));
    }

    private final void m6552b(View view) {
        ((FifeImageView) view.findViewById(C1592a.f8445T.intValue())).setImageDrawable(C0436b.m2650b(this.ao, C1592a.f8443R.intValue()));
        ((LinearLayout) view.findViewById(C1592a.f8447V.intValue())).setVisibility(0);
    }

    public static boolean m6551W() {
        return ((Long) C0954a.bk.m5760a()).longValue() > C4678i.m21812a();
    }

    public final ce getPlayStoreUiElement() {
        return this.al;
    }

    public final ad getParentNode() {
        return null;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
