package com.google.android.finsky.stream.controllers.ctaassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.dy;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.ctaassistcard.view.C4366a;
import com.google.android.finsky.stream.controllers.ctaassistcard.view.CtaAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4365a extends C4356r {
    public C4542a f22136a;
    public C4542a f22137b;
    public C4542a f22138o;
    public C4542a f22139p;
    public C4366a f22140q;

    public C4365a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        dy cm = document.cm();
        this.f22140q = new C4366a(cm.f12228c, cm.f12230e, cm.f12231f.f13221c, cm.f12229d.f13225c, cm.f12231f.f13222d, cm.f12227b.f13218e, cm.f12229d.f13227e, cm.f12227b.f13216c != null, document.f14885a.f12087D);
        this.f22136a = this.s.m21155a(cm.f12231f.f13220b, 2833);
        this.f22137b = this.s.m21155a(cm.f12227b.f13217d, 2835);
        this.f22138o = this.s.m21155a(cm.f12229d.f13226d, 2844);
        this.f22139p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.cta_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (CtaAssistCardView) view;
        C4366a c4366a = this.f22140q;
        ad adVar = this.h;
        C4542a c4542a = this.f22136a;
        C4542a c4542a2 = this.f22137b;
        C4542a c4542a3 = this.f22138o;
        C4542a c4542a4 = this.f22139p;
        onClickListener.f22148h = c4542a;
        onClickListener.f22149i = c4542a2;
        onClickListener.f22150j = c4542a3;
        onClickListener.f22151k = c4542a4;
        onClickListener.f22146f.mo2588a(3, c4366a.f22156c, onClickListener);
        if (!TextUtils.isEmpty(c4366a.f22158e)) {
            onClickListener.f22146f.setContentDescription(c4366a.f22158e);
        }
        onClickListener.f22147g.setVisibility(c4366a.f22161h ? 0 : 4);
        onClickListener.f22143c.setText(c4366a.f22154a);
        onClickListener.f22144d.setText(c4366a.f22155b);
        onClickListener.f22145e.a(c4366a.f22157d.f11860f, c4366a.f22157d.f11863i, onClickListener.f22141a);
        if (!TextUtils.isEmpty(c4366a.f22160g)) {
            onClickListener.f22145e.setContentDescription(c4366a.f22160g);
        }
        if (!TextUtils.isEmpty(c4366a.f22159f)) {
            onClickListener.setContentDescription(c4366a.f22159f);
        }
        C2482j.m13285a(onClickListener.f22153m, c4366a.f22162i);
        onClickListener.f22152l = adVar;
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((CtaAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.cm().f12227b;
    }
}
