package com.google.android.finsky.activities;

import android.os.Bundle;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1067x;
import com.google.android.finsky.adapters.C1177u;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2722m;
import com.google.android.finsky.dfemodel.C2723n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.ratereview.C1068o;
import com.google.android.finsky.ratereview.C3973p;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ak;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ga extends C1045b implements fz, gd, C1067x, C1068o {
    public ce f6834a = C2482j.m13283a(302);
    public boolean ag;
    public PlayRecyclerView ah;
    public C1177u ai;
    public C3974q f6835c;
    public Document f6836f;
    public boolean f6837g;
    public boolean f6838h;
    public C2723n o_;
    public String p_;

    public ga() {
        C1473m.f7980a.aO();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f6836f = (Document) this.f760q.getParcelable("finsky.ReviewsFragment.document");
        this.p_ = this.f760q.getString("finsky.ReviewsFragment.reviewsUrl");
        this.f6837g = this.f760q.getBoolean("finsky.ReviewsFragment.isRottenTomatoesReviews");
        this.f740L = true;
    }

    protected final int mo1298Z() {
        return C7582R.layout.generic_reviews;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        int i = this.f6837g ? -1 : 4;
        C2719i c2719i = new C2719i(this.bo, this.f6836f.f14885a.f12116w);
        this.f6835c = C1473m.f7980a.mo2248i(C1473m.f7980a.cZ());
        if (this.o_ == null) {
            this.o_ = C2721l.m14734a(this.bo, this.p_, this.f6836f.m14653h(), true);
            this.o_.m11918a((C1031w) this);
            this.o_.m11917a((C0657w) this);
            this.o_.f14938f = i;
        }
        this.o_.m14738a(this.f6838h, this.ag);
        this.ai = new C1177u(m603h(), this.f6836f, this.o_, this.f6837g, this.k_, this, this.bp, this, this, this.bw);
        this.ah.setAdapter(this.ai);
        if (!aj()) {
            au();
            aa();
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.ah = (PlayRecyclerView) this.bt.findViewById(C7582R.id.all_reviews_list);
        RecyclerView recyclerView = this.ah;
        this.ah.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        if (aj()) {
            m_();
        }
        return a;
    }

    private final boolean aj() {
        return this.o_ != null && this.o_.mo2861a();
    }

    protected final void cg_() {
        ac();
    }

    public final void ac() {
        this.bm.mo1237a(this.f6836f.f14885a.f12099f, false);
        this.bm.mo1241c(this.f6836f.f14885a.f12100g);
        this.bm.mo1246z();
    }

    protected final void aa() {
        this.o_.m14699n();
    }

    public final void m_() {
        C2482j.m13285a(this.f6834a, this.f6836f.f14885a.f12087D);
        this.o_.m11922b((C1031w) this);
        this.o_.m11921b((C0657w) this);
        this.o_.f14893l = null;
        if (this.ah != null) {
            this.ah.setEmptyView(this.bt.findViewById(C7582R.id.no_results_view));
        }
        super.m_();
    }

    public final void mo1062a(VolleyError volleyError) {
        super.mo1062a(volleyError);
        if (this.ah != null && this.ai != null) {
            this.ai.m6882e(2);
        }
    }

    public final void mo138d() {
        if (this.o_ != null) {
            this.o_.m11922b((C1031w) this);
            this.o_.m11921b((C0657w) this);
        }
        if (this.ai != null) {
            C0657w c0657w = this.ai;
            c0657w.f7230d.m11922b((C1031w) c0657w);
            c0657w.f7230d.m11921b(c0657w);
        }
        this.ai = null;
        this.ah = null;
        super.mo138d();
    }

    public final void mo1365a(boolean z, boolean z2) {
        this.f6838h = z;
        this.ag = z2;
        this.o_.m14738a(z, z2);
        this.o_.mo3119b();
    }

    public final void mo1366b(int i) {
        this.o_.f14938f = i;
        this.o_.mo3119b();
    }

    public final void I_() {
        if (this.o_ != null) {
            ab abVar = this.f730B;
            if (abVar.mo283a("filter_options_dialog") == null) {
                boolean z = this.o_.f14934b;
                boolean z2 = this.o_.f14935c;
                Fragment fwVar = new fw();
                Bundle bundle = new Bundle();
                bundle.putBoolean("filterByVersion", z);
                bundle.putBoolean("filterByDevice", z2);
                fwVar.m600f(bundle);
                fwVar.m581a((Fragment) this, 0);
                fwVar.m625a(abVar, "filter_options_dialog");
            }
        }
    }

    public final void J_() {
        if (this.o_ != null) {
            ab abVar = this.f730B;
            if (abVar.mo283a("sorting_dialog") == null) {
                C2723n c2723n = this.o_;
                Fragment gbVar = new gb();
                Bundle bundle = new Bundle();
                bundle.putInt("sorting_type", ak.m21702a(c2723n));
                gbVar.m600f(bundle);
                gbVar.m581a((Fragment) this, 0);
                gbVar.m625a(abVar, "sorting_dialog");
            }
        }
    }

    public final void mo1364a(String str, String str2, C3973p c3973p) {
        C0254u h = m603h();
        if (h != null) {
            h.setResult(-1);
        }
        if (!this.f6835c.m18695c(str, str2, c3973p)) {
            int i;
            switch (c3973p.ordinal()) {
                case 0:
                    i = 1212;
                    break;
                case 1:
                    i = 1213;
                    break;
                case 2:
                    i = 1214;
                    break;
                case 3:
                    i = 1217;
                    break;
                default:
                    FinskyLog.m21669e("Unknown review rating selected in reviews samples section: %s", c3973p.toString());
                    return;
            }
            this.bw.m13379b(new C2475d(this).m13256a(i));
            C2722m c2722m = new C2722m(C1473m.f7980a.ap(), str, str2, c3973p.f20051e);
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f6834a;
    }
}
