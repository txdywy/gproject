package com.google.android.finsky.stream.controllers.minicategories;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.horizontalclusters.C4258a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4260a;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4264l;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.controllers.minicategories.view.C4447c;
import com.google.android.finsky.stream.controllers.minicategories.view.C4451d;
import com.google.android.finsky.stream.controllers.minicategories.view.MiniCategoriesClusterView;
import com.google.android.play.image.C1294w;
import com.squareup.leakcanary.C7582R;

public final class C4448c extends C4258a implements C4447c {
    public static final int[] f22577s = new int[]{5, 0};
    public final Context f22578e;
    public final C4254d f22579t;
    public final Resources f22580u = this.f22578e.getResources();
    public final ab f22581v;
    public final int f22582w;
    public C4451d f22583x;

    public C4448c(Context context, C3748a c3748a, C1294w c1294w, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, af afVar, C4254d c4254d, ab abVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, afVar, f22577s, false, c1294w);
        this.f22578e = context;
        this.f22579t = c4254d;
        this.f22581v = abVar;
        this.f22582w = C7582R.layout.mini_categories_card;
    }

    protected final C4260a mo4108b(int i) {
        return new C4445a((Document) this.g.m14679a(i, false), this.f22582w, this.f22580u, this.f, this.f22581v, this.g.f14908a.f14885a.f12099f, f22577s, this.i);
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.mini_categories_cluster;
    }

    public final void mo1510a(View view, int i) {
        C4451d c4451d;
        Bundle bundle;
        super.mo1510a(view, i);
        Document document = this.g.f14908a;
        MiniCategoriesClusterView miniCategoriesClusterView = (MiniCategoriesClusterView) view;
        C4451d c4451d2 = this.f22583x;
        if (c4451d2 == null) {
            c4451d = new C4451d();
        } else {
            c4451d = c4451d2;
        }
        c4451d.f22609g = C1542f.m8970a(document);
        c4451d.f22604b = document.f14885a.f12099f;
        c4451d.f22605c = document.f14885a.f12100g;
        c4451d.f22606d = document.f14885a.f12101h;
        c4451d.f22610h = 0;
        c4451d.f22611i = document.f14885a.f12087D;
        c4451d.f22608f = document.m14660o() ? document.f14885a.f12111r.f12023i : null;
        c4451d.f22607e = this.f22579t.m19769a(this.f22578e, document, document.m14638a(), null, false);
        c4451d.f22603a = m19771a(c4451d.f22603a);
        this.f22583x = c4451d;
        if (this.D != null) {
            bundle = ((C4449d) this.D).f22584b;
        } else {
            bundle = null;
        }
        C4451d c4451d3 = this.f22583x;
        C4264l c4264l = this.f21522q;
        miniCategoriesClusterView.f22596f = this.h;
        miniCategoriesClusterView.f22592b = this;
        miniCategoriesClusterView.f22593c = this;
        miniCategoriesClusterView.f22595e = C2482j.m13283a(476);
        C2482j.m13285a(miniCategoriesClusterView.f22595e, c4451d3.f22611i);
        if (miniCategoriesClusterView.f22594d != null) {
            C4295c c4295c = new C4295c();
            c4295c.f21657a = c4451d3.f22604b;
            c4295c.f21658b = c4451d3.f22605c;
            c4295c.f21659c = c4451d3.f22606d;
            c4295c.f21660d = c4451d3.f22607e;
            c4295c.f21661e = c4451d3.f22608f;
            c4295c.f21662f = c4451d3.f22609g;
            miniCategoriesClusterView.f22594d.setTextShade(c4451d3.f22610h);
            miniCategoriesClusterView.f22594d.mo3611a(c4295c, miniCategoriesClusterView);
            miniCategoriesClusterView.f22594d.setVisibility(0);
        }
        miniCategoriesClusterView.f22591a.m19813a(c4451d3.f22603a, bundle, miniCategoriesClusterView, c4264l, miniCategoriesClusterView.f22593c, miniCategoriesClusterView, miniCategoriesClusterView);
    }

    public final void mo1511b(View view, int i) {
        MiniCategoriesClusterView miniCategoriesClusterView = (MiniCategoriesClusterView) view;
        if (this.D == null) {
            this.D = new C4449d();
            ((C4449d) this.D).f22584b = new Bundle();
        }
        ((C4449d) this.D).f22584b.clear();
        miniCategoriesClusterView.m20802a(((C4449d) this.D).f22584b);
        miniCategoriesClusterView.Z_();
    }

    public final void mo4212a(ad adVar) {
        this.f.mo3655a(this.g.f14908a, adVar, this.i);
    }

    public final void mo4213a(MiniCategoriesClusterView miniCategoriesClusterView) {
        if (this.D == null) {
            this.D = new C4449d();
            ((C4449d) this.D).f22584b = new Bundle();
        }
        ((C4449d) this.D).f22584b.clear();
        miniCategoriesClusterView.m20802a(((C4449d) this.D).f22584b);
    }
}
