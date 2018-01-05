package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.ff;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.playcluster.C1164b;
import com.google.android.finsky.stream.controllers.view.FlatEntertainmentStoryClusterView;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.libraries.play.entertainment.C6052c;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.squareup.leakcanary.C7582R;

public final class C4500v extends C4250b {
    public final af f22859a;
    public boolean f22860b;
    public int f22861o;
    public int f22862p;
    public C1164b f22863q;
    public final ff f22864r;

    public C4500v(Context context, C3748a c3748a, ff ffVar, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22859a = afVar;
        this.f22864r = ffVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        C2998a.m15496l().m15520w();
        Context context = this.e;
        boolean z = (C6115a.m28098b(16) || context.getResources().getBoolean(C6052c.pe__is_tablet) || context.getResources().getBoolean(C6052c.pe__is_low_end)) ? false : true;
        this.f22860b = z;
        if (this.f22860b) {
            Resources resources = this.e.getResources();
            this.f22861o = resources.getDimensionPixelSize(C7582R.dimen.pe__card_v2_margin_bottom);
            this.f22862p = resources.getDimensionPixelSize(C7582R.dimen.pe__card_padding);
            this.f22863q = new C4531y(this);
            this.k = this.d.m9278c(resources);
        }
    }

    public final int mo1509a(int i) {
        return this.f22860b ? C7582R.layout.flat_entertainment_story_cluster : C7582R.layout.dummy_view;
    }

    public final int mo1508a() {
        return 1;
    }

    public final void mo1510a(View view, int i) {
        if (this.f22860b) {
            Document document = this.g.f14908a;
            C1031w c1031w = (FlatEntertainmentStoryClusterView) view;
            Bundle bundle = this.D != null ? ((C4532z) this.D).f23200a : null;
            this.g.m11918a(c1031w);
            C4522w c4522w = new C4522w(this.e, C1473m.f7980a.be(), document, this.g, this.f, c1031w, this.i);
            bd bdVar = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
            CharSequence a = C1542f.m8970a(document);
            c1031w.m17483a(document.f14885a.f12087D, this.h);
            c1031w.m17486a(document.f14885a.f12099f, document.f14885a.f12100g, document.f14885a.f12101h, null, null, bdVar, a, 0, c4522w, this.f22863q, this.l, this.k, this.f22864r, bundle, null);
        }
    }

    public final void mo1511b(View view, int i) {
        if (this.f22860b) {
            C1031w c1031w = (FlatEntertainmentStoryClusterView) view;
            this.g.m11922b(c1031w);
            if (this.D == null) {
                this.D = new C4532z();
                ((C4532z) this.D).f23200a = new Bundle();
            }
            ((C4532z) this.D).f23200a.clear();
            c1031w.mo3581a(((C4532z) this.D).f23200a);
            c1031w.Z_();
        }
    }
}
