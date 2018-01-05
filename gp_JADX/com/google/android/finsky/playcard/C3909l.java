package com.google.android.finsky.playcard;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.frameworkviews.BucketRowLayout;

public final class C3909l extends ev {
    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            C3896m c3896m;
            View childAt = recyclerView.getChildAt(i);
            View childAt2 = recyclerView.getChildAt(i + 1);
            if (childAt instanceof C3896m) {
                c3896m = (C3896m) childAt;
            } else {
                if (childAt instanceof BucketRowLayout) {
                    childAt = ((BucketRowLayout) childAt).getChildAt(0);
                    if (childAt instanceof C3896m) {
                        c3896m = (C3896m) childAt;
                    }
                }
                c3896m = null;
            }
            if (c3896m != null) {
                int i2;
                if (childAt2 instanceof C3896m) {
                    i2 = 1;
                } else if ((childAt2 instanceof BucketRowLayout) && (((BucketRowLayout) childAt2).getChildAt(0) instanceof C3896m)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c3896m.j_(i2 != 0 ? 0 : 8);
            }
        }
    }
}
