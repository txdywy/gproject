package com.google.android.finsky.detailspage.seasonlist;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;

final class C2668e implements Runnable {
    public final /* synthetic */ SeasonListModuleLayout f14749a;

    C2668e(SeasonListModuleLayout seasonListModuleLayout) {
        this.f14749a = seasonListModuleLayout;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.f14749a.getLocationInWindow(iArr);
        int i = iArr[1];
        ViewParent parent = this.f14749a.getParent();
        while (parent != null) {
            if (parent instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) parent;
                recyclerView.getLocationInWindow(iArr);
                recyclerView.b_(0, i - iArr[1]);
                return;
            }
        }
    }
}
