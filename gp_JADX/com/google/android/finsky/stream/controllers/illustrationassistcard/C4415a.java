package com.google.android.finsky.stream.controllers.illustrationassistcard;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.C2450w;
import com.google.android.finsky.cv.p177a.ee;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.illustrationassistcard.view.C4416a;
import com.google.android.finsky.stream.controllers.illustrationassistcard.view.IllustrationAssistCardView;
import com.google.android.finsky.stream.myapps.C4356r;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import p002a.C0002a;

public final class C4415a extends C4356r {
    public C4542a f22405a;
    public C4542a f22406b;
    public C4542a f22407o;
    public C4542a f22408p;
    public C4416a f22409q;

    public C4415a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, c0002a);
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        Document document = c2720j.f14908a;
        ee ck = document.ck();
        this.f22409q = new C4416a(ck.f12270c, ck.f12271d, ck.f12273f.f13221c, ck.f12272e.f13225c, ck.f12273f.f13222d, ck.f12269b.f13218e, ck.f12272e.f13227e, ck.f12269b.f13216c != null, document.f14885a.f12087D);
        this.f22405a = this.s.m21155a(ck.f12273f.f13220b, 2833);
        this.f22406b = this.s.m21155a(ck.f12269b.f13217d, 2832);
        this.f22407o = this.s.m21155a(ck.f12272e.f13226d, 2844);
        this.f22408p = this.s.m21154a();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.illustration_assist_card_view;
    }

    public final void mo1510a(View view, int i) {
        OnClickListener onClickListener = (IllustrationAssistCardView) view;
        C4416a c4416a = this.f22409q;
        ad adVar = this.h;
        C4542a c4542a = this.f22405a;
        C4542a c4542a2 = this.f22406b;
        C4542a c4542a3 = this.f22407o;
        C4542a c4542a4 = this.f22408p;
        onClickListener.f22421l = adVar;
        onClickListener.f22417h = c4542a;
        onClickListener.f22418i = c4542a2;
        onClickListener.f22419j = c4542a3;
        onClickListener.f22420k = c4542a4;
        onClickListener.f22415f.mo2588a(3, c4416a.f22425c, onClickListener);
        if (!TextUtils.isEmpty(c4416a.f22427e)) {
            onClickListener.f22415f.setContentDescription(c4416a.f22427e);
        }
        onClickListener.f22416g.setVisibility(c4416a.f22430h ? 0 : 4);
        onClickListener.f22412c.setText(c4416a.f22423a);
        onClickListener.f22413d.setText(c4416a.f22424b);
        onClickListener.f22414e.a(c4416a.f22426d.f11860f, c4416a.f22426d.f11863i, onClickListener.f22410a);
        if (!TextUtils.isEmpty(c4416a.f22429g)) {
            onClickListener.f22414e.setContentDescription(c4416a.f22429g);
        }
        if (!TextUtils.isEmpty(c4416a.f22428f)) {
            onClickListener.setContentDescription(c4416a.f22428f);
        }
        C2482j.m13285a(onClickListener.f22422m, c4416a.f22431i);
        this.h.mo1219a(onClickListener);
    }

    public final void mo1511b(View view, int i) {
        ((IllustrationAssistCardView) view).Z_();
    }

    protected final C2450w mo4180a(Document document) {
        return document.ck().f12269b;
    }
}
