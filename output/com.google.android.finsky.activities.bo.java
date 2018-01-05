package com.google.android.finsky.activities;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.finsky.adapters.e;
import com.google.android.finsky.stream.base.playcluster.PlayClusterViewContentV2;

public final class com.google.android.finsky.activities.bo extends android.support.v7.widget.ev
{

    public final com.google.android.finsky.adapters.e a;

    bo(com.google.android.finsky.adapters.e p0) {
        android.support.v7.widget.ev();
        this.a = p0;
    }

    public final void a(Rect p0, View p1, RecyclerView p2, android.support.v7.widget.fo p3) {
        if (p1 instanceof PlayClusterViewContentV2) {
            v3 = 1;
            v2 = 1;
            v0 = 0;
        }
        else {
            v3 = RecyclerView.d(p1);
            if (this.a.e(v3)) {
                if (!((v3 - this.a.t) % 2)) {
                    v3 = 0;
                    v0 = this.a.w;
                    v2 = 1;
                }
                else {
                    v3 = 1;
                    v0 = this.a.w;
                    v2 = 0;
                }
            }
            else {
                v3 = 1;
                v0 = this.a.w;
                v2 = 1;
            }
        }
        if (v2 != 0)
            v2 = v0;
        else
            v2 = 0;
        if (v3 == 0)
            v0 = 0;
        p0.set(v2, 0, v0, 0);
    }

}
