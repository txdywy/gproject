package com.google.android.finsky.stream.controllers;

import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4262b;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public final class by implements C4260a {
    public final Document f21983a;
    public final C4808a f21984b;
    public final ab f21985c;
    public final ao f21986d;
    public final C2495w f21987e;
    public final C3748a f21988f;
    public boolean f21989g = false;
    public int f21990h;
    public boolean f21991i;
    public String f21992j;
    public int f21993k;
    public int f21994l;
    public float f21995m;
    public float f21996n;
    public bz f21997o;

    public by(Document document, C4808a c4808a, ab abVar, ao aoVar, C2495w c2495w, C3748a c3748a, int i, String str, float f, float f2, Resources resources) {
        this.f21983a = document;
        this.f21984b = c4808a;
        this.f21985c = abVar;
        this.f21986d = aoVar;
        this.f21987e = c2495w;
        this.f21988f = c3748a;
        this.f21990h = i;
        this.f21991i = false;
        this.f21992j = str;
        this.f21994l = resources.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_content_height);
        this.f21993k = resources.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_xpadding);
        this.f21995m = f;
        this.f21996n = f2;
        this.f21997o = new bz();
    }

    public final int mo4069a(int i) {
        return (int) ((((float) (i - (this.f21993k * 2))) * this.f21996n) + ((float) this.f21994l));
    }

    public final int mo4068a() {
        return C7582R.layout.flat_card_screenshot;
    }

    public final /* synthetic */ int mo4070a(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getWidth();
    }

    public final /* synthetic */ int mo4073b(View view) {
        return ((d) view).getThumbnail().getChildAt(0).getHeight();
    }

    public final /* synthetic */ C4262b mo4074b() {
        return this.f21997o;
    }

    public final /* synthetic */ void mo4075c(View view) {
        ao.m18509b((d) view);
    }

    public final /* synthetic */ void mo4071a(View view, ad adVar) {
        d dVar = (d) view;
        dVar.setThumbnailAspectRatio(this.f21995m);
        boolean be = this.f21983a.be();
        ab abVar = this.f21985c;
        boolean z = be && abVar != null && this.f21984b.m22588a(this.f21983a.f14885a.f12096c);
        ao aoVar = this.f21986d;
        Document document = this.f21983a;
        int i = this.f21990h;
        String str = this.f21992j;
        C3748a c3748a = this.f21988f;
        if (!be) {
            abVar = null;
        }
        aoVar.m18515a(dVar, document, i, str, c3748a, z, abVar, adVar, false, -1, true, this.f21983a.aZ(), this.f21987e, false, this.f21989g, this.f21991i);
    }

    public final /* synthetic */ void mo4072a(C4262b c4262b) {
        bz bzVar = (bz) c4262b;
        if (bzVar != null) {
            this.f21997o = bzVar;
        }
    }
}
