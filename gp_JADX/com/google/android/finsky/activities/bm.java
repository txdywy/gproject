package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.cz;
import android.support.v7.widget.ew;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.adapters.C1161e;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.fastscroll.C3118n;
import com.google.android.finsky.fastscroll.ScrubberView;
import com.google.android.finsky.frameworkviews.C3141d;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ai;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.view.C4297g;
import com.google.android.finsky.utils.ac;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.finsky.dfe.nano.ab;
import com.google.wireless.android.finsky.dfe.nano.ag;
import com.google.wireless.android.finsky.dfe.nano.x;
import com.squareup.leakcanary.C7582R;
import java.util.Iterator;

public final class bm implements gt {
    public final LayoutInflater f6486a;
    public final Context f6487b;
    public final C3748a f6488c;
    public final C1611k f6489d;
    public final DfeToc f6490e;
    public final C1294w f6491f;
    public final x[] f6492g;
    public final ag[] f6493h;
    public final String f6494i;
    public final int f6495j;
    public final int f6496k;
    public final String f6497l;
    public boolean f6498m;
    public C1161e f6499n;
    public ViewGroup f6500o;
    public PlayRecyclerView f6501p;
    public ac f6502q = ac.f24031a;
    public ai f6503r;
    public final int f6504s;
    public final boolean f6505t;
    public final FinskyHeaderListLayout f6506u;
    public ScrubberView f6507v;
    public final C2495w f6508w;

    public bm(Context context, C3748a c3748a, C1611k c1611k, C1294w c1294w, LayoutInflater layoutInflater, gl glVar, DfeToc dfeToc, int i, FinskyHeaderListLayout finskyHeaderListLayout, boolean z, C2495w c2495w) {
        this.f6487b = context;
        this.f6488c = c3748a;
        this.f6489d = c1611k;
        this.f6491f = c1294w;
        this.f6486a = layoutInflater;
        this.f6490e = dfeToc;
        ab abVar = glVar.f6885a;
        this.f6494i = abVar.j;
        this.f6495j = abVar.l;
        this.f6496k = abVar.n;
        this.f6497l = abVar.k;
        this.f6492g = abVar.i;
        this.f6493h = abVar.e;
        this.f6503r = glVar.f6890f;
        this.f6504s = i;
        this.f6506u = finskyHeaderListLayout;
        this.f6505t = z;
        this.f6508w = c2495w;
    }

    public final View mo1309a() {
        if (this.f6500o == null) {
            int i;
            LayoutInflater layoutInflater = this.f6486a;
            if (this.f6505t) {
                i = C7582R.layout.category_tab_with_scrubber;
            } else {
                i = C7582R.layout.category_tab;
            }
            this.f6500o = (ViewGroup) layoutInflater.inflate(i, null);
            this.f6501p = (PlayRecyclerView) this.f6500o.findViewById(C7582R.id.tab_recycler_view);
            this.f6501p.setVisibility(0);
            C1161e c1161e = new C1161e(this.f6487b, this.f6492g, this.f6488c, this.f6495j, this.f6496k, this.f6490e, this.f6491f, this.f6493h, this.f6494i, this.f6497l, this.f6504s, this.f6503r, this.f6508w);
            this.f6499n = c1161e;
            if (this.f6502q.m21689a("CategoryTab.AdapterInstanceState")) {
                ac acVar = (ac) this.f6502q.m21690b("CategoryTab.AdapterInstanceState");
                if (acVar != null) {
                    c1161e.f7166B = (Bundle) acVar.m21690b("CategoryAdapterV2.QuickLinksViewState");
                }
            }
            ew czVar = new cz();
            this.f6501p.setLayoutManager(czVar);
            czVar.f3352g = new bn(c1161e);
            this.f6501p.m278a(new bo(c1161e));
            this.f6501p.m278a(new C3141d(this.f6487b, C7582R.color.play_white));
            i = this.f6489d.m9275a(this.f6487b.getResources());
            this.f6501p.m278a(new C4297g(i, i));
            this.f6501p.setAdapter(this.f6499n);
            if (this.f6502q.m21689a("CategoryTab.RecyclerViewState")) {
                this.f6501p.m13601a((Parcelable) this.f6502q.m21690b("CategoryTab.RecyclerViewState"));
            }
            if (this.f6505t) {
                this.f6507v = (ScrubberView) this.f6500o.findViewById(C7582R.id.scrubber_view);
                C3118n configurator = this.f6507v.getConfigurator();
                configurator.f16075d = this.f6501p;
                configurator.f16076e = this.f6506u;
                configurator.m15964a();
            }
        }
        return this.f6500o;
    }

    public final void mo1311a(boolean z) {
        if (z != this.f6498m) {
            if (z) {
                C2482j.m13305c(this.f6503r);
                this.f6503r.m13206a(true);
                if (this.f6503r.getPlayStoreUiElement().f.length == 0) {
                    C2482j.m13290a(this.f6500o);
                }
            } else {
                this.f6503r.m13206a(false);
            }
            this.f6498m = z;
        }
    }

    public final ac mo1312b() {
        if (this.f6505t) {
            this.f6507v.getConfigurator().m15967b();
            this.f6507v = null;
        }
        ac acVar = new ac();
        if (!(this.f6501p == null || this.f6499n == null)) {
            acVar.m21688a("CategoryTab.RecyclerViewState", this.f6501p.mo2959x());
            C1161e c1161e = this.f6499n;
            Iterator it = c1161e.f7190z.iterator();
            while (it.hasNext()) {
                c1161e.m7027a((C1155g) it.next());
            }
            c1161e.f7190z.clear();
            ac acVar2 = new ac();
            acVar2.m21688a("CategoryAdapterV2.QuickLinksViewState", c1161e.f7166B);
            acVar.m21688a("CategoryTab.AdapterInstanceState", acVar2);
        }
        this.f6499n = null;
        this.f6500o = null;
        return acVar;
    }

    public final void mo1310a(ac acVar) {
        if (acVar != null) {
            this.f6502q = acVar;
        }
    }
}
