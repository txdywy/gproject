package com.google.android.finsky.stream.controllers.view;

import android.support.v7.widget.LinearLayoutManager;

final class C4514o implements Runnable {
    public final /* synthetic */ JpkrHighlightsBannerClusterView f23118a;

    C4514o(JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView) {
        this.f23118a = jpkrHighlightsBannerClusterView;
    }

    public final void run() {
        boolean z = true;
        if (this.f23118a.f22946u) {
            JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView = this.f23118a;
            jpkrHighlightsBannerClusterView.getLocationOnScreen(jpkrHighlightsBannerClusterView.f22936d);
            int i = jpkrHighlightsBannerClusterView.f22936d[0];
            int i2 = jpkrHighlightsBannerClusterView.f22936d[1];
            boolean z2 = jpkrHighlightsBannerClusterView.isShown() && jpkrHighlightsBannerClusterView.f22937l.contains(i, i2, jpkrHighlightsBannerClusterView.getWidth() + i, jpkrHighlightsBannerClusterView.getHeight() + i2);
            if (!z2) {
                this.f23118a.f22942q.postDelayed(this.f23118a.f22943r, 500);
                this.f23118a.f22944s = false;
            } else if (this.f23118a.f22944s) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f23118a.c.getLayoutManager();
                if (linearLayoutManager.m3125k() != this.f23118a.c.getLayoutManager().m3062r() - 1) {
                    z = false;
                }
                if (!z) {
                    this.f23118a.f22941p.f3396g = linearLayoutManager.m3124j() + 2;
                    this.f23118a.c.getLayoutManager().m3014a(this.f23118a.f22941p);
                    this.f23118a.f22942q.postDelayed(this.f23118a.f22943r, (long) this.f23118a.f22938m);
                }
            } else {
                this.f23118a.f22944s = true;
                this.f23118a.f22942q.postDelayed(this.f23118a.f22943r, (long) this.f23118a.f22938m);
            }
        }
    }
}
