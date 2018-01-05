package com.google.android.finsky.stream.controllers.jpkrquicklinks;

import android.content.Context;
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
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.C4433a;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.C4435b;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.C4436d;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.C4437e;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.view.JpkrQuickLinksRecyclerView;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C4434a extends C4250b implements C4433a {
    public final ab f22524a;
    public ag[] f22525b;
    public C4437e f22526o;

    public final int mo1508a() {
        return 1;
    }

    public final void mo4050a(C2720j c2720j) {
        int i = 0;
        super.mo4050a(c2720j);
        this.f22526o = new C4437e();
        this.f22526o.f22543b = new ArrayList();
        if (this.f22525b == null || this.f22525b.length == 0) {
            Document[] b = this.g.f14908a.m14643b();
            while (i < b.length) {
                List list = this.f22526o.f22543b;
                Document document = b[i];
                C4435b c4435b = new C4435b();
                c4435b.f22534a = document.f14885a.f12100g;
                c4435b.f22536c = C1600a.m9198a(document);
                c4435b.f22535b = document.f14885a.f12087D;
                list.add(c4435b);
                i++;
            }
            this.f22526o.f22542a = this.g.f14908a.f14885a.f12087D;
            return;
        }
        while (i < this.f22525b.length) {
            List list2 = this.f22526o.f22543b;
            ag agVar = this.f22525b[i];
            C4435b c4435b2 = new C4435b();
            c4435b2.f22534a = agVar.c;
            c4435b2.f22536c = agVar.d;
            c4435b2.f22535b = agVar.i;
            list2.add(c4435b2);
            i++;
        }
    }

    public C4434a(Context context, C3748a c3748a, ag[] agVarArr, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, ab abVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22525b = agVarArr;
        this.f22524a = abVar;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.jpkr_quicklinks_recycler_view;
    }

    public final void mo1510a(View view, int i) {
        JpkrQuickLinksRecyclerView jpkrQuickLinksRecyclerView = (JpkrQuickLinksRecyclerView) view;
        C4437e c4437e = this.f22526o;
        ad adVar = this.h;
        jpkrQuickLinksRecyclerView.m19714a(c4437e.f22542a, adVar);
        if (jpkrQuickLinksRecyclerView.getAdapter() == null) {
            jpkrQuickLinksRecyclerView.aN = new C4436d(jpkrQuickLinksRecyclerView.getContext());
            jpkrQuickLinksRecyclerView.setAdapter(jpkrQuickLinksRecyclerView.aN);
        } else {
            jpkrQuickLinksRecyclerView.aN = (C4436d) jpkrQuickLinksRecyclerView.getAdapter();
        }
        C4436d c4436d = jpkrQuickLinksRecyclerView.aN;
        c4436d.f22541g = new ArrayList(c4437e.f22543b);
        c4436d.f22539e = adVar;
        c4436d.f22538d = this;
        jpkrQuickLinksRecyclerView.aN.f3433a.m3638b();
    }

    public final void mo1511b(View view, int i) {
        ((JpkrQuickLinksRecyclerView) view).Z_();
    }

    public final void mo4207a(int i, ad adVar) {
        if (this.f22525b == null || this.f22525b.length == 0) {
            if (i >= 0 && i < this.g.f14908a.m14638a()) {
                Document a = this.g.f14908a.m14641a(i);
                this.f.mo3643a(a.m14657l().f12324d, a.f14885a.f12100g, a.f14885a.f12099f, this.f22524a.dn(), adVar, 0, this.i);
            }
        } else if (i >= 0 && i < this.f22525b.length) {
            ag agVar = this.f22525b[i];
            this.f.mo3643a(agVar.e, agVar.c, agVar.g, this.f22524a.dn(), adVar, 0, this.i);
        }
    }
}
