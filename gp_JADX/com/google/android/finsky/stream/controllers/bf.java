package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.p013b.p014a.C0259a;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.finsky.stream.controllers.view.C4516q;
import com.google.android.finsky.stream.controllers.view.JpkrFlatRecommendedCategoriesClusterView;
import com.squareup.leakcanary.C7582R;

public final class bf extends C4250b {
    public final ab f21920a;
    public final C4254d f21921b;

    public bf(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar, C4254d c4254d) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21920a = abVar;
        this.f21921b = c4254d;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k = this.d.m9278c(this.e.getResources());
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.jpkr_flat_recommended_categories_cluster;
    }

    public final void mo1510a(View view, int i) {
        Bundle bundle;
        bd bdVar;
        C3688e c3688e = (JpkrFlatRecommendedCategoriesClusterView) view;
        if (this.D != null) {
            bundle = ((bh) this.D).f21925a;
        } else {
            bundle = null;
        }
        Document document = this.g.f14908a;
        c3688e.m17483a(document.f14885a.f12087D, this.h);
        if (document.m14660o()) {
            bdVar = document.f14885a.f12111r.f12023i;
        } else {
            bdVar = null;
        }
        CharSequence a = C1542f.m8970a(document);
        OnClickListener a2 = this.f.mo3625a(new bg(this, document, c3688e), document);
        String a3 = this.f21921b.m19769a(this.e, document, document.m14638a(), null, false);
        int i2 = document.f14885a.f12099f;
        String str = document.f14885a.f12100g;
        C3748a c3748a = this.f;
        DfeToc dn = this.f21920a.dn();
        C2495w c2495w = this.i;
        int i3 = this.k;
        c3688e.m17480a(i2, str, null, a3, a2, bdVar, a, 0);
        if (c3688e.f18607f != null) {
            c3688e.f18607f.getParentNode().mo1219a(c3688e.f18607f);
        }
        c3688e.f22930c.setPadding(i3, 0, i3, 0);
        for (i3 = 0; i3 < document.m14638a(); i3++) {
            Object a4 = c3688e.m21015a(i3);
            Document a5 = document.m14641a(i3);
            bd a6 = C1600a.m9198a(a5);
            CharSequence charSequence = a5.f14885a.f12100g;
            int i4 = a5.f14885a.f12099f;
            ip ipVar = a5.m14657l().f12324d;
            ad playStoreUiElementNode = c3688e.getPlayStoreUiElementNode();
            byte[] bArr = a5.f14885a.f12087D;
            a4.f22967e = charSequence;
            a4.f22968f = i4;
            a4.f22969g = ipVar;
            a4.f22970h = c3748a;
            a4.f22971i = dn;
            a4.f22973k = playStoreUiElementNode;
            if (!(a4.f22966d == null || a6 == null)) {
                a4.f22963a.m9288a(a4.f22966d, a6.f11860f, a6.f11863i);
            }
            a4.f22965c.setText(charSequence);
            a4.setContentDescription(charSequence);
            C2482j.m13285a(a4.getPlayStoreUiElement(), bArr);
            a4.f22972j = c2495w;
            Drawable e = C0259a.m1526e(a4.f22964b.getBackground());
            C0259a.m1514a(e, Color.parseColor(a6.f11869o));
            if (VERSION.SDK_INT < 16) {
                a4.f22964b.setBackgroundDrawable(e);
            } else {
                a4.f22964b.setBackground(e);
            }
            a4.setOnClickListener(new C4516q(a4));
            a4.getParentNode().mo1219a(a4);
        }
        if (bundle != null && c3688e.f22931j != null) {
            c3688e.f22931j.scrollTo(bundle.getInt("RecommendedCategoriesClusterView.scrollPosition", 0), 0);
        }
    }

    public final void mo1511b(View view, int i) {
        JpkrFlatRecommendedCategoriesClusterView jpkrFlatRecommendedCategoriesClusterView = (JpkrFlatRecommendedCategoriesClusterView) view;
        if (this.D == null) {
            this.D = new bh();
            ((bh) this.D).f21925a = new Bundle();
        }
        ((bh) this.D).f21925a.clear();
        jpkrFlatRecommendedCategoriesClusterView.mo3581a(((bh) this.D).f21925a);
        jpkrFlatRecommendedCategoriesClusterView.Z_();
    }
}
