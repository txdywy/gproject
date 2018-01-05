package com.google.android.finsky.stream.base.playcluster;

import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.squareup.leakcanary.C7582R;
import java.util.HashSet;

final class C4288k extends C1137h {
    public HashSet f21647c;
    public int f21648d;
    public final /* synthetic */ PlayClusterViewContentV2 f21649e;

    public C4288k(PlayClusterViewContentV2 playClusterViewContentV2) {
        this.f21649e = playClusterViewContentV2;
        this.f21648d = playClusterViewContentV2.bd.mo1484b() ? 1 : 0;
        this.f21647c = new HashSet();
    }

    public final int mo1039a() {
        if (this.f21649e.bd == null) {
            return 0;
        }
        return m19900b() + this.f21649e.bd.mo1486c();
    }

    public final int mo1040a(int i) {
        if (i < this.f21649e.getLeadingSpacerCount()) {
            return 0;
        }
        int a = mo1039a();
        if (this.f21648d == 1) {
            if (i == a - this.f21649e.getLeadingSpacerCount()) {
                return 2;
            }
            if (m19891c() && i == a - m19892d()) {
                return 1;
            }
        } else if (m19891c() && i == a - this.f21649e.getLeadingSpacerCount()) {
            return 1;
        }
        return this.f21649e.bd.mo1477a(i - this.f21649e.getLeadingSpacerCount());
    }

    private final int m19893e(int i) {
        if (this.f21649e.bg) {
            return Math.max(0, ((i - (this.f21649e.bb * 2)) - this.f21649e.mo3607z()) / 2);
        }
        return 0;
    }

    private final boolean m19891c() {
        return this.f21649e.bb > 0 || this.f21649e.bg;
    }

    private final int m19892d() {
        return (m19891c() ? 1 : 0) + this.f21649e.getLeadingSpacerCount();
    }

    final int m19900b() {
        int i = 1;
        int d = m19892d();
        if (this.f21648d != 1) {
            i = 0;
        }
        return i + d;
    }

    public final void m19899a(C1155g c1155g) {
        this.f21647c.remove(c1155g);
        View view = c1155g.a;
        if (view instanceof ae) {
            ((ae) view).Z_();
        }
    }

    public final /* bridge */ /* synthetic */ boolean mo1134b(fr frVar) {
        return true;
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        if (!this.f21649e.aU) {
            this.f21647c.add(c1155g);
            int i2 = c1155g.f3216f;
            int measuredWidth = this.f21649e.getMeasuredWidth();
            int measuredHeight = this.f21649e.getMeasuredHeight();
            LayoutParams layoutParams = c1155g.a.getLayoutParams();
            if (i2 == 0) {
                layoutParams.width = (this.f21649e.mo3605g(measuredWidth, measuredHeight) + this.f21649e.bb) + m19893e(measuredWidth);
            } else if (i2 == 1) {
                layoutParams.width = this.f21649e.bb + m19893e(measuredWidth);
            } else if (i2 != 2) {
                i2 = i - this.f21649e.getLeadingSpacerCount();
                this.f21649e.bd.mo1481a(c1155g.a, i2);
                if (this.f21649e.bi.mo1495c() != 3) {
                    if (this.f21649e.aI.dj().mo2294a(12638215)) {
                        measuredWidth = this.f21649e.m17553h(measuredWidth, measuredHeight);
                        float f = (float) measuredWidth;
                        layoutParams.width = (int) (f * this.f21649e.bi.mo1488a(this.f21649e.bd.mo1477a(i2)));
                    } else {
                        layoutParams.width = this.f21649e.m17553h(measuredWidth, measuredHeight);
                    }
                }
                if (layoutParams.height != -1) {
                    layoutParams.height = this.f21649e.bi.mo1490a(this.f21649e.bd.mo1482b(i2), this.f21649e.bk, layoutParams.width);
                }
            }
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0 || i == 1) {
            view = new View(this.f21649e.getContext());
            view.setLayoutParams(new LayoutParams(-2, -1));
            view.setTag("tagIsSpacer");
            return new C1155g(view);
        } else if (i != 2) {
            return new C1155g(this.f21649e.ba.inflate(i, viewGroup, false));
        } else {
            view = this.f21649e.ba.inflate(C7582R.layout.cluster_loading_cell, viewGroup, false);
            view.setTag("tagIsSpacer");
            return new C1155g(view);
        }
    }
}
