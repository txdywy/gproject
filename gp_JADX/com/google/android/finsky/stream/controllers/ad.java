package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.volley.C0657w;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.am;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.base.view.FlatCardClusterView;
import com.squareup.leakcanary.C7582R;

public final class ad extends C4250b {
    public final int f21683a;
    public final int f21684b;
    public final C4254d f21685o;
    public final ao f21686p;
    public final af f21687q;
    public final C3028c f21688r;
    public final ff f21689s;

    public ad(Context context, C3748a c3748a, ff ffVar, com.google.android.finsky.p111d.ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, ao aoVar, C4254d c4254d, boolean z, C3028c c3028c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, z);
        this.f21686p = aoVar;
        this.f21685o = c4254d;
        this.f21687q = afVar;
        this.f21688r = c3028c;
        Resources resources = context.getResources();
        this.f21683a = resources.getDimensionPixelSize(C7582R.dimen.flat_multi_layout_card_content_min_height);
        this.f21684b = c1611k.m9279d(resources);
        this.f21689s = ffVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.k = this.d.m9278c(this.e.getResources());
    }

    public final void mo1510a(View view, int i) {
        bd bdVar;
        Document document = this.g.f14908a;
        C0657w c0657w = (FlatCardClusterView) view;
        this.g.m11918a((C1031w) c0657w);
        this.g.m11917a(c0657w);
        am amVar = new am(document, this.g, c0657w, this.e, C1473m.f7980a.be(), this.f, this.i, this.f21686p, this.f21688r);
        C1164b amVar2 = new am(this.f21683a, this.f21684b);
        Bundle bundle = this.D != null ? ((af) this.D).f21693a : null;
        c0657w.m17483a(document.f14885a.f12087D, this.h);
        OnClickListener a = this.f.mo3625a(new ae(this, document, c0657w), document);
        String a2 = this.f21685o.m19769a(this.e, document, document.m14638a(), null, false);
        CharSequence a3 = C1542f.m8970a(document);
        int i2 = document.f14885a.f12099f;
        String str = document.f14885a.f12100g;
        String str2 = document.f14885a.f12101h;
        if (document.m14660o()) {
            bdVar = document.f14885a.f12111r.f12023i;
        } else {
            bdVar = null;
        }
        c0657w.m17486a(i2, str, str2, a2, a, bdVar, a3, 0, amVar, amVar2, this.l, this.k, this.f21689s, bundle, null);
    }

    public final void mo1511b(View view, int i) {
        C0657w c0657w = (FlatCardClusterView) view;
        this.g.m11922b((C1031w) c0657w);
        this.g.m11921b(c0657w);
        if (this.D == null) {
            this.D = new af();
            ((af) this.D).f21693a = new Bundle();
        }
        ((af) this.D).f21693a.clear();
        c0657w.mo3581a(((af) this.D).f21693a);
        c0657w.Z_();
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.flat_multi_layout_cluster;
    }
}
