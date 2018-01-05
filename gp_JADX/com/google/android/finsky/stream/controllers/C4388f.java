package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C4388f extends C4348b implements ad {
    public final ab f22272p;
    public final C1164b f22273q;
    public final C4407g f22274r;
    public ce f22275s;

    protected final int mo4152b() {
        return -1;
    }

    public C4388f(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar) {
        super(context, c3748a, c4808a, ffVar, c3676f, adVar, c1611k, c1556d, c2495w);
        this.f22272p = abVar;
        this.f22273q = new C4412h(context);
        this.f22274r = new C4407g(this);
        this.f22274r.f22361a = this;
        this.j = this.d.m9275a(this.e.getResources());
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f22275s = C2482j.m13283a(473);
        C2482j.m13285a(this.f22275s, this.g.f14908a.f14885a.f12087D);
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_card_circle_link_cluster;
    }

    public final void mo1510a(View view, int i) {
        byte[] bArr;
        Document document = this.g.f14908a;
        C1031w c1031w = (PlayCardClusterViewV2) view;
        this.g.m11918a(c1031w);
        Bundle bundle = this.D != null ? ((C4354c) this.D).f22000a : null;
        C1158a c1158a = this.f22274r;
        C1164b c1164b = this.f22273q;
        int i2 = this.l;
        ff ffVar = this.o;
        ad adVar = this.h;
        if (document == null) {
            bArr = null;
        } else {
            bArr = document.f14885a.f12087D;
        }
        c1031w.m13757a(c1158a, c1164b, i2, ffVar, bundle, adVar, bArr, null);
        c1031w.m13751a(document, this.f, this.e, this.k, this.i);
        c1031w.m13759a(this.j);
    }

    public final ce getPlayStoreUiElement() {
        return this.f22275s;
    }

    public final ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
