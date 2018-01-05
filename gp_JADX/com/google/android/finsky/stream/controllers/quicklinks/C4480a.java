package com.google.android.finsky.stream.controllers.quicklinks;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.p143a.p144a.C4246b;
import com.google.android.finsky.stream.base.p143a.p144a.C4247c;
import com.google.android.finsky.stream.controllers.quicklinks.view.C4482a;
import com.google.android.finsky.stream.controllers.quicklinks.view.C4483c;
import com.google.android.finsky.stream.controllers.quicklinks.view.QuickLinksBannerRecyclerView;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4480a extends C4250b implements C4247c {
    public ag[] f22773a;
    public final ab f22774b;
    public C4482a f22775o;

    public C4480a(Context context, C3748a c3748a, ag[] agVarArr, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22773a = agVarArr;
        this.f22774b = abVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        if (this.f22773a == null || this.f22773a.length == 0) {
            this.f22775o = m20931b();
            return;
        }
        ag[] agVarArr = this.f22773a;
        C4482a c4482a = new C4482a();
        c4482a.f22781b = new ArrayList();
        c4482a.f22780a = null;
        for (ag agVar : agVarArr) {
            List list = c4482a.f22781b;
            C4246b c4246b = new C4246b();
            c4246b.f21479a = agVar.c;
            c4246b.f21480b = agVar.g;
            c4246b.f21482d = agVar.d;
            c4246b.f21481c = agVar.i;
            list.add(c4246b);
        }
        this.f22775o = c4482a;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.play_quicklinks_recycler_view;
    }

    public final void mo1510a(View view, int i) {
        Bundle bundle = this.D != null ? ((C4481b) this.D).f22776a : null;
        QuickLinksBannerRecyclerView quickLinksBannerRecyclerView = (QuickLinksBannerRecyclerView) view;
        C4482a c4482a = this.f22775o;
        ad adVar = this.h;
        quickLinksBannerRecyclerView.m19714a(c4482a.f22780a, adVar);
        if (quickLinksBannerRecyclerView.getAdapter() == null) {
            quickLinksBannerRecyclerView.aP = new C4483c(quickLinksBannerRecyclerView.getContext());
            quickLinksBannerRecyclerView.setAdapter(quickLinksBannerRecyclerView.aP);
        } else {
            quickLinksBannerRecyclerView.aP = (C4483c) quickLinksBannerRecyclerView.getAdapter();
        }
        C4483c c4483c = quickLinksBannerRecyclerView.aP;
        List arrayList = new ArrayList(c4482a.f22781b);
        c4483c.f22784e = C7582R.layout.play_quicklinks_banner_pill_item;
        c4483c.f22783d = adVar;
        c4483c.f22785f = this;
        c4483c.f22786g = arrayList;
        quickLinksBannerRecyclerView.aP.f3433a.m3638b();
        quickLinksBannerRecyclerView.aJ = bundle;
    }

    public final void mo1511b(View view, int i) {
        if (this.D == null) {
            this.D = new C4481b();
            ((C4481b) this.D).f22776a = new Bundle();
        }
        ((C4481b) this.D).f22776a.clear();
        QuickLinksBannerRecyclerView quickLinksBannerRecyclerView = (QuickLinksBannerRecyclerView) view;
        quickLinksBannerRecyclerView.m19713a(((C4481b) this.D).f22776a);
        quickLinksBannerRecyclerView.Z_();
    }

    private final C4482a m20931b() {
        Document[] b = this.g.f14908a.m14643b();
        C4482a c4482a = new C4482a();
        c4482a.f22781b = new ArrayList();
        c4482a.f22780a = this.g.f14908a.f14885a.f12087D;
        for (Document document : b) {
            List list = c4482a.f22781b;
            C4246b c4246b = new C4246b();
            c4246b.f21479a = document.f14885a.f12100g;
            c4246b.f21480b = document.f14885a.f12099f;
            c4246b.f21482d = C1600a.m9198a(document);
            c4246b.f21481c = document.f14885a.f12087D;
            list.add(c4246b);
        }
        return c4482a;
    }

    public final void mo4224a(int i, ad adVar) {
        if (this.f22773a == null || this.f22773a.length == 0) {
            if (i >= 0 && i < this.g.f14908a.m14638a()) {
                Document a = this.g.f14908a.m14641a(i);
                this.f.mo3643a(a.m14657l().f12324d, a.f14885a.f12100g, a.f14885a.f12099f, this.f22774b.dn(), adVar, 9, this.i);
            }
        } else if (i >= 0 && i < this.f22773a.length) {
            ag agVar = this.f22773a[i];
            this.f.mo3643a(agVar.e, agVar.c, agVar.g, this.f22774b.dn(), adVar, 9, this.i);
        }
    }
}
