package com.google.android.finsky.stream.controllers.comboassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.ea;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.comboassistcard.view.C4360a;
import com.google.android.finsky.stream.controllers.comboassistcard.view.ComboAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4359a extends C4356r {
    public C4542a f22053a;
    public C4542a f22054b;
    public C4542a f22055o;
    public C4542a f22056p;
    public C4360a f22057q;

    public C4359a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        ea co = document.co();
        this.f22057q = new C4360a(co.f12242c, co.f12243d, co.f12245f, co.f12246g.f13221c, co.f12244e.f13225c, co.f12246g.f13222d, co.f12241b.f13218e, co.f12244e.f13227e, co.f12241b.f13216c != null, document.f14885a.f12087D);
        this.f22053a = this.s.m21155a(co.f12246g.f13220b, 2833);
        this.f22054b = this.s.m21155a(co.f12241b.f13217d, 2838);
        this.f22055o = this.s.m21155a(co.f12244e.f13226d, 2844);
        this.f22056p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.combo_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (ComboAssistCardView) view;
        C4360a c4360a = this.f22057q;
        ad adVar = this.h;
        C4542a c4542a = this.f22053a;
        C4542a c4542a2 = this.f22054b;
        C4542a c4542a3 = this.f22055o;
        C4542a c4542a4 = this.f22056p;
        onClickListener.f22066i = c4542a;
        onClickListener.f22067j = c4542a2;
        onClickListener.f22068k = c4542a3;
        onClickListener.f22069l = c4542a4;
        onClickListener.f22064g.mo2588a(3, c4360a.f22075d, onClickListener);
        if (!TextUtils.isEmpty(c4360a.f22077f)) {
            onClickListener.f22064g.setContentDescription(c4360a.f22077f);
        }
        onClickListener.f22065h.setVisibility(c4360a.f22080i ? 0 : 4);
        onClickListener.f22060c.setText(c4360a.f22072a);
        onClickListener.f22061d.setText(c4360a.f22073b);
        onClickListener.f22062e.setText(c4360a.f22074c);
        onClickListener.f22063f.a(c4360a.f22076e.f11860f, c4360a.f22076e.f11863i, onClickListener.f22058a);
        if (!TextUtils.isEmpty(c4360a.f22079h)) {
            onClickListener.f22063f.setContentDescription(c4360a.f22079h);
        }
        if (!TextUtils.isEmpty(c4360a.f22078g)) {
            onClickListener.setContentDescription(c4360a.f22078g);
        }
        C2482j.m13285a(onClickListener.f22071n, c4360a.f22081j);
        onClickListener.f22070m = adVar;
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((ComboAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.co().f12241b;
    }
}
