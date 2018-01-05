package com.google.android.finsky.stream.controllers.contentassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.ec;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.contentassistcard.view.C4364a;
import com.google.android.finsky.stream.controllers.contentassistcard.view.ContentAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4363a extends C4356r {
    public C4542a f22109a;
    public C4542a f22110b;
    public C4542a f22111o;
    public C4542a f22112p;
    public C4364a f22113q;

    public C4363a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        ec cs = document.cs();
        this.f22113q = new C4364a(cs.f12255c, cs.f12256d, cs.f12258f.f13221c, cs.f12257e.f13225c, cs.f12258f.f13222d, cs.f12254b.f13218e, cs.f12257e.f13227e, cs.f12254b.f13216c != null, document.f14885a.f12087D);
        this.f22109a = this.s.m21155a(cs.f12258f.f13220b, 2833);
        this.f22110b = this.s.m21155a(cs.f12254b.f13217d, 2837);
        this.f22111o = this.s.m21155a(cs.f12257e.f13226d, 2844);
        this.f22112p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.content_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (ContentAssistCardView) view;
        C4364a c4364a = this.f22113q;
        ad adVar = this.h;
        C4542a c4542a = this.f22109a;
        C4542a c4542a2 = this.f22110b;
        C4542a c4542a3 = this.f22111o;
        C4542a c4542a4 = this.f22112p;
        onClickListener.f22121h = c4542a;
        onClickListener.f22122i = c4542a2;
        onClickListener.f22123j = c4542a3;
        onClickListener.f22124k = c4542a4;
        onClickListener.f22119f.mo2588a(3, c4364a.f22129c, onClickListener);
        if (!TextUtils.isEmpty(c4364a.f22131e)) {
            onClickListener.f22119f.setContentDescription(c4364a.f22131e);
        }
        onClickListener.f22120g.setVisibility(c4364a.f22134h ? 0 : 4);
        onClickListener.f22116c.setText(c4364a.f22127a);
        onClickListener.f22117d.setText(c4364a.f22128b);
        onClickListener.f22118e.a(c4364a.f22130d.f11860f, c4364a.f22130d.f11863i, onClickListener.f22114a);
        if (!TextUtils.isEmpty(c4364a.f22133g)) {
            onClickListener.f22118e.setContentDescription(c4364a.f22133g);
        }
        if (!TextUtils.isEmpty(c4364a.f22132f)) {
            onClickListener.setContentDescription(c4364a.f22132f);
        }
        C2482j.m13285a(onClickListener.f22126m, c4364a.f22135i);
        onClickListener.f22125l = adVar;
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((ContentAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.cs().f12254b;
    }
}
