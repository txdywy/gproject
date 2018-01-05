package com.google.android.finsky.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.google.android.finsky.headerlistlayout.C3161c;
import com.google.android.finsky.headerlistlayout.FinskyTabStrip;
import com.google.android.finsky.ia2.Ia2SubNavView;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.search.PlaySearchToolbar;
import com.squareup.leakcanary.C7582R;

final class gr extends C1047f {
    public final int f6903a;
    public final boolean f6904b;
    public final /* synthetic */ gn f6905c;

    public gr(gn gnVar, Context context, int i, boolean z) {
        this.f6905c = gnVar;
        super(context);
        this.f6903a = i;
        this.f6904b = z;
    }

    protected final void mo1395a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f6905c.aw = viewGroup;
    }

    protected final int mo1394a(Context context) {
        if ((this.f6905c.N_() || this.f6905c.al) && !this.f6905c.aj()) {
            return PlaySearchToolbar.a(this.f) + this.f6905c.m605i().getDimensionPixelSize(C7582R.dimen.finsky_extra_toolbar_height);
        }
        return super.mo1394a(context);
    }

    protected final int mo1397d() {
        if (this.f6904b) {
            return 0;
        }
        return 1;
    }

    protected final void mo1396a(ViewGroup viewGroup) {
        this.f6905c.az = viewGroup;
    }

    protected final int m6667e() {
        return 3;
    }

    protected final int mo1305a() {
        return C7582R.layout.header_list_pager;
    }

    protected final boolean mo1398f() {
        return true;
    }

    protected final int m6669g() {
        return C7582R.id.viewpager;
    }

    protected final int m6670h() {
        return 1;
    }

    protected final int mo1399i() {
        if (this.f6905c.aj() && C1473m.f7980a.dj().mo2294a(12624222)) {
            return 0;
        }
        if (this.f6905c.ao()) {
            return this.f6905c.aN;
        }
        return 1;
    }

    protected final int m6663b() {
        return C7582R.id.tab_recycler_view;
    }

    protected final boolean mo1400j() {
        return false;
    }

    protected final float m6673k() {
        return 0.8f;
    }

    protected final int m6665c() {
        if (this.f6905c.aj() || this.f6905c.ao() || this.f6903a != 1) {
            return 3;
        }
        return 2;
    }

    protected final boolean m6674l() {
        return !this.f6905c.ao();
    }

    protected final int m6675m() {
        return this.f.getResources().getColor(C7582R.color.status_bar_overlay);
    }

    protected final int m6676n() {
        return C1608h.m9243a(this.f, this.f6905c.f6894e);
    }

    public final int mo1401o() {
        return this.f6905c.ah();
    }

    public final C3161c mo1402p() {
        return this.f6905c.aB;
    }

    protected final int mo1403q() {
        if (this.f6905c.al || this.f6904b) {
            return 1;
        }
        return super.mo1403q();
    }

    protected final boolean m6680r() {
        return super.r() && (!(this.f6905c.al && this.f6905c.N_()) && this.f6905c.aq == null);
    }

    protected final void m6664b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f6905c.ao()) {
            this.f6905c.aM = (Ia2SubNavView) layoutInflater.inflate(C7582R.layout.ia2_subnav, viewGroup, false);
            viewGroup.addView(this.f6905c.aM);
            viewGroup.setVisibility(0);
        }
    }

    protected final int m6681s() {
        if (this.f6905c.ao()) {
            return this.f.getResources().getDimensionPixelSize(C7582R.dimen.ia2_subnav_height);
        }
        return 0;
    }

    protected final /* synthetic */ PlayHeaderListTabStrip m6660a(Context context, LayoutInflater layoutInflater) {
        this.f6905c.aA = (FinskyTabStrip) layoutInflater.inflate(C7582R.layout.finsky_tab_strip, null);
        this.f6905c.aA.setUseHomeScrollingTabs(this.f6905c.aj());
        if (this.f6905c.aB == null) {
            this.f6905c.aB = new C3161c(context);
        }
        this.f6905c.aA.setControlsContainerBackgroundCoordinator(this.f6905c.aB);
        return this.f6905c.aA;
    }
}
