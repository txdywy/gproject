package com.google.android.finsky.stream.base.playcluster;

import android.support.v7.widget.LinearLayoutManager;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.adapters.C1171n;
import com.google.android.play.image.x;
import com.google.android.play.layout.d;
import java.util.ArrayList;

final class C4287j implements Runnable {
    public final /* synthetic */ PlayClusterViewContentV2 f21646a;

    C4287j(PlayClusterViewContentV2 playClusterViewContentV2) {
        this.f21646a = playClusterViewContentV2;
    }

    public final void run() {
        if (this.f21646a.bd != null) {
            int preloadRadius = this.f21646a.getPreloadRadius();
            if (preloadRadius > 0 && this.f21646a.getChildCount() > 2 && (this.f21646a.getChildAt(1) instanceof d)) {
                int i;
                int i2;
                if (this.f21646a.bm == null) {
                    this.f21646a.bm = new ArrayList();
                }
                if (this.f21646a.aI.dj().mo2294a(12617606) && (this.f21646a.bd instanceof C1171n)) {
                    C1171n c1171n = (C1171n) this.f21646a.bd;
                    i = c1171n.f7214d;
                    i2 = c1171n.f7215e;
                } else {
                    i = this.f21646a.bd.mo1483b(this.f21646a.getChildAt(1));
                    i2 = this.f21646a.bd.mo1478a(this.f21646a.getChildAt(1));
                }
                int i3 = this.f21646a.bf + (this.f21646a.bp ? 1 : 0);
                int c = this.f21646a.bd.mo1486c();
                if (C1473m.f7980a.dj().mo2294a(12631929)) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f21646a.getLayoutManager();
                    int j = linearLayoutManager.m3124j();
                    int k = linearLayoutManager.m3125k();
                    int i4 = j - (preloadRadius * i3);
                    preloadRadius = k + (preloadRadius * i3);
                    m19890a(i4, j, c, i, i2);
                    m19890a(k + 1, preloadRadius + 1, c, i, i2);
                    return;
                }
                m19890a(this.f21646a.aL - (preloadRadius * i3), (preloadRadius * i3) + (this.f21646a.aL + i3), c, i, i2);
            }
        }
    }

    private final void m19890a(int i, int i2, int i3, int i4, int i5) {
        while (i < i2) {
            if (i >= this.f21646a.getLeadingSpacerCount()) {
                int leadingSpacerCount = i - this.f21646a.getLeadingSpacerCount();
                if (leadingSpacerCount < i3) {
                    x a = this.f21646a.bd.mo1479a(leadingSpacerCount, i4, i5, this.f21646a, this.f21646a.bh);
                    if (a != null && a.b() == null) {
                        this.f21646a.bm.add(a);
                    }
                } else {
                    return;
                }
            }
            i++;
        }
    }
}
