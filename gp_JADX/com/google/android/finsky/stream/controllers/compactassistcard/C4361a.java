package com.google.android.finsky.stream.controllers.compactassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.eb;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.compactassistcard.view.C4362a;
import com.google.android.finsky.stream.controllers.compactassistcard.view.CompactAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4361a extends C4356r {
    public C4542a f22082a;
    public C4542a f22083b;
    public C4542a f22084o;
    public C4542a f22085p;
    public C4362a f22086q;

    public C4361a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        eb ci = document.ci();
        this.f22086q = new C4362a(ci.f12249c, ci.f12250d, ci.f12252f.f13221c, ci.f12251e.f13225c, ci.f12252f.f13222d, ci.f12248b.f13218e, ci.f12251e.f13227e, ci.f12248b.f13216c != null, document.f14885a.f12087D);
        this.f22082a = this.s.m21155a(ci.f12252f.f13220b, 2833);
        this.f22083b = this.s.m21155a(ci.f12248b.f13217d, 2845);
        this.f22084o = this.s.m21155a(ci.f12251e.f13226d, 2844);
        this.f22085p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.compact_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (CompactAssistCardView) view;
        C4362a c4362a = this.f22086q;
        ad adVar = this.h;
        C4542a c4542a = this.f22082a;
        C4542a c4542a2 = this.f22083b;
        C4542a c4542a3 = this.f22084o;
        C4542a c4542a4 = this.f22085p;
        onClickListener.f22098l = adVar;
        onClickListener.f22094h = c4542a;
        onClickListener.f22095i = c4542a2;
        onClickListener.f22096j = c4542a3;
        onClickListener.f22097k = c4542a4;
        onClickListener.f22092f.mo2588a(3, c4362a.f22102c, onClickListener);
        if (!TextUtils.isEmpty(c4362a.f22104e)) {
            onClickListener.f22092f.setContentDescription(c4362a.f22104e);
        }
        onClickListener.f22093g.setVisibility(c4362a.f22107h ? 0 : 4);
        onClickListener.f22089c.setText(c4362a.f22100a);
        onClickListener.f22090d.setText(c4362a.f22101b);
        onClickListener.f22091e.a(c4362a.f22103d.f11860f, c4362a.f22103d.f11863i, onClickListener.f22087a);
        if (!TextUtils.isEmpty(c4362a.f22106g)) {
            onClickListener.f22091e.setContentDescription(c4362a.f22106g);
        }
        if (!TextUtils.isEmpty(c4362a.f22105f)) {
            onClickListener.setContentDescription(c4362a.f22105f);
        }
        C2482j.m13285a(onClickListener.f22099m, c4362a.f22108i);
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((CompactAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.ci().f12248b;
    }
}
