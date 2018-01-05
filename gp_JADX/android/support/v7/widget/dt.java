package android.support.v7.widget;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class dt implements OnScrollListener {
    public final /* synthetic */ C0491do f3413a;

    dt(C0491do c0491do) {
        this.f3413a = c0491do;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f3413a.m3221j() && this.f3413a.f3153K.getContentView() != null) {
            this.f3413a.f3149G.removeCallbacks(this.f3413a.f3145C);
            this.f3413a.f3145C.run();
        }
    }
}
