package com.google.android.finsky.detailspage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.detailscomponents.HeroGraphicView;
import com.google.android.finsky.headerlistlayout.C1047f;
import com.squareup.leakcanary.C7582R;

final class at extends C1047f {
    public boolean f14258a;
    public int f14259b;
    public int f14260c;
    public final /* synthetic */ aq f14261d;

    public at(aq aqVar, Context context, boolean z, int i, int i2) {
        this.f14261d = aqVar;
        super(context);
        this.f14258a = z;
        this.f14259b = i;
        this.f14260c = i2;
    }

    protected final void mo1395a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f14258a) {
            this.f14261d.aP = (HeroGraphicView) layoutInflater.inflate(C7582R.layout.hero_graphic, viewGroup, false);
            if (VERSION.SDK_INT >= 16) {
                this.f14261d.aP.setImportantForAccessibility(2);
            }
            viewGroup.addView(this.f14261d.aP);
        }
    }

    protected final int mo1305a() {
        boolean a = this.f14261d.n_.dj().mo2294a(12638391);
        if (this.f14261d.ai.m9285j(this.f.getResources())) {
            if (!this.f14261d.aM) {
                return C7582R.layout.header_list_recycler_view_fixed_width;
            }
            if (a) {
                return C7582R.layout.header_list_recycler_view_fixed_width_with_scrubber_v2;
            }
            return C7582R.layout.header_list_recycler_view_fixed_width_with_scrubber;
        } else if (!this.f14261d.aM) {
            return C7582R.layout.header_list_recycler_view;
        } else {
            if (a) {
                return C7582R.layout.header_list_recycler_view_with_scrubber_v2;
            }
            return C7582R.layout.header_list_recycler_view_with_scrubber;
        }
    }

    protected final int mo3042v() {
        return this.f14261d.aM ? C7582R.id.recycler_view : -1;
    }

    protected final int mo1440t() {
        return this.f14259b;
    }

    protected final int m13905b() {
        return C7582R.id.recycler_view;
    }

    protected final boolean mo1400j() {
        return !this.f14258a;
    }

    protected final float m13908k() {
        return 0.5f;
    }

    protected final int mo1397d() {
        if (this.f14258a) {
            return 0;
        }
        return 1;
    }

    protected final boolean m13909l() {
        return this.f14258a || this.f14261d.aj();
    }

    protected final int m13910m() {
        return this.f.getResources().getColor(C7582R.color.status_bar_overlay);
    }

    protected final int m13911n() {
        return C1608h.m9243a(this.f, this.f14260c);
    }

    protected final int m13914w() {
        if (this.f14261d.ai.m9285j(this.f.getResources())) {
            return C7582R.layout.phll_backdrop_view;
        }
        return 0;
    }
}
