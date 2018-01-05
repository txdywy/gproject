package com.google.android.finsky.layout;

import android.support.v7.widget.RecyclerView;
import android.view.ViewParent;
import com.google.android.finsky.utils.FinskyLog;

final class ag implements Runnable {
    public final /* synthetic */ ExtrasItemSnippet f18483a;

    ag(ExtrasItemSnippet extrasItemSnippet) {
        this.f18483a = extrasItemSnippet;
    }

    public final void run() {
        int[] iArr = new int[2];
        this.f18483a.getLocationInWindow(iArr);
        int i = iArr[1];
        ViewParent parent = this.f18483a.getParent();
        while (!(parent instanceof RecyclerView)) {
            parent = parent.getParent();
            if (parent == null) {
                FinskyLog.m21669e("Found no suitable parent.", new Object[0]);
            }
        }
        RecyclerView recyclerView = (RecyclerView) parent;
        recyclerView.getLocationInWindow(iArr);
        recyclerView.b_(0, i - iArr[1]);
    }
}
