package com.google.android.finsky.be;

import android.support.v7.widget.ff;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.activities.gm;
import com.google.android.finsky.adapters.CardRecyclerViewAdapter;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.p248a.C4234b;
import com.squareup.leakcanary.C7582R;

public final class C1599f extends C1598g implements C0657w, C1031w {
    public ViewGroup f8494a;
    public CardRecyclerViewAdapter f8495b;
    public C4279n f8496c;
    public C4234b f8497d;
    public PlayRecyclerView f8498e;
    public boolean f8499f;
    public final C4808a f8500g;
    public final C2581g f8501h;
    public final C2495w f8502i;
    public final ff f8503j;
    public gm f8504k;

    public C1599f(C4808a c4808a, C2581g c2581g, C2495w c2495w, ff ffVar) {
        this.f8500g = c4808a;
        this.f8501h = c2581g;
        this.f8502i = c2495w;
        this.f8503j = ffVar;
    }

    public final void m9196a(C2730u c2730u) {
        m9194a();
        super.mo2352a(c2730u);
        this.f8499f = false;
        if (this.o != null) {
            C2335k c2335k = c2730u.f14950a;
            if (c2335k != null) {
                c2335k.m11918a((C1031w) this);
                c2335k.m11917a((C0657w) this);
            }
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f8498e != null && this.f8495b != null) {
            this.f8495b.m6882e(2);
        }
    }

    public final void m_() {
        if (!(this.f8499f || this.f8498e == null)) {
            this.f8498e.setEmptyView(this.f8494a.findViewById(C7582R.id.no_results_view));
            this.f8499f = true;
        }
        if (this.f8495b != null) {
            this.f8495b.f3433a.m3638b();
        }
    }

    public final void m9194a() {
        if (this.o != null) {
            C2335k c2335k = ((C2730u) this.o).f14950a;
            if (c2335k != null) {
                c2335k.m11922b((C1031w) this);
                c2335k.m11921b((C0657w) this);
            }
            this.o = null;
        }
    }
}
