package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.adapters.C1159c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.playcluster.C4290m;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.play.layout.d;

public abstract class C4348b extends C4250b implements ab, C4290m {
    public final C3676f f21897a;
    public final C4808a f21898b;
    public final ff f21899o;

    public C4348b(Context context, C3748a c3748a, C4808a c4808a, ff ffVar, C3676f c3676f, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21897a = c3676f;
        this.f21898b = c4808a;
        this.f21899o = ffVar;
    }

    protected abstract int mo4152b();

    public final int mo1508a() {
        return 1;
    }

    public void mo1510a(View view, int i) {
        byte[] bArr = null;
        Document document = this.g.f14908a;
        int b = mo4152b();
        C1031w c1031w = (PlayCardClusterViewV2) view;
        c1031w.m13759a(this.k);
        this.g.m11918a(c1031w);
        C1159c c1159c = new C1159c(document, b, this.g, c1031w, this.e, this.f21898b, this.f, this, this.i);
        Bundle bundle = this.D != null ? ((C4354c) this.D).f22000a : null;
        C1164b a = this.f21897a.m17439a(b);
        int i2 = this.l;
        ff ffVar = this.f21899o;
        ad adVar = this.h;
        if (document != null) {
            bArr = document.f14885a.f12087D;
        }
        c1031w.m13757a(c1159c, a, i2, ffVar, bundle, adVar, bArr, this);
        c1031w.m13751a(document, this.f, this.e, this.k, this.i);
    }

    public final void mo1511b(View view, int i) {
        C1031w c1031w = (PlayCardClusterViewV2) view;
        this.g.m11922b(c1031w);
        m20220c();
        ((C4354c) this.D).f22000a.clear();
        c1031w.mo2995a(((C4354c) this.D).f22000a);
        c1031w.Z_();
    }

    public final void mo1448a(Document document, d dVar) {
        this.f21898b.m22589b(document.f14885a.f12096c);
        this.C.mo4087a(this, 0, 1, true);
    }

    public final void mo4098b(int i) {
        m20220c();
        ((C4354c) this.D).f22000a.putInt("PlayClusterViewContentV2.recyclerViewScrollPosition", i);
    }

    private final void m20220c() {
        if (this.D == null) {
            this.D = new C4354c();
            ((C4354c) this.D).f22000a = new Bundle();
        }
    }
}
