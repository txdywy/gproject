package com.google.android.finsky.activities;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.adapters.C1161e;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;

public final class bo extends ev {
    public final C1161e f6510a;

    public bo(C1161e c1161e) {
        this.f6510a = c1161e;
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        int i;
        int i2;
        int i3;
        if (view instanceof PlayClusterViewContentV2) {
            i = 1;
            i2 = 1;
            i3 = 0;
        } else {
            i2 = this.f6510a.f7187w;
            i = RecyclerView.m262d(view);
            if (!this.f6510a.m7028e(i)) {
                i = 1;
                i3 = i2;
                i2 = 1;
            } else if ((i - this.f6510a.f7184t) % 2 == 0) {
                i = 0;
                i3 = i2;
                i2 = 1;
            } else {
                i = 1;
                i3 = i2;
                i2 = 0;
            }
        }
        if (i2 != 0) {
            i2 = i3;
        } else {
            i2 = 0;
        }
        if (i == 0) {
            i3 = 0;
        }
        rect.set(i2, 0, i3, 0);
    }
}
