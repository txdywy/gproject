package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.support.v4.view.bi;
import android.view.View;

final class C6357w extends DataSetObserver implements bi {
    public int f31920a;
    public final /* synthetic */ PlayHeaderListTabStrip f31921b;

    C6357w(PlayHeaderListTabStrip playHeaderListTabStrip) {
        this.f31921b = playHeaderListTabStrip;
    }

    public final void m29165a(int i, float f, int i2) {
        if (this.f31921b.f31873q != null) {
            this.f31921b.f31873q.a(i, f, i2);
        }
        if (this.f31921b.f31874r) {
            int childCount = this.f31921b.f31869m.getChildCount();
            if (childCount != 0 && i >= 0 && i < childCount) {
                PlayHeaderListTabContainer playHeaderListTabContainer = this.f31921b.f31869m;
                playHeaderListTabContainer.f31863j = i;
                playHeaderListTabContainer.f31864k = f;
                playHeaderListTabContainer.invalidate();
                View childAt = this.f31921b.f31869m.getChildAt(i);
                childCount = childAt == null ? 0 : childAt.getWidth();
                View childAt2 = this.f31921b.f31869m.getChildAt(i + 1);
                this.f31921b.m29104a(i, (int) ((((float) (childCount + (childAt2 == null ? 0 : childAt2.getWidth()))) * f) * 0.5f), false);
            }
        }
    }

    public final void m29166b(int i) {
        if (this.f31921b.f31873q != null) {
            this.f31921b.f31873q.b(i);
        }
        PlayHeaderListTabContainer playHeaderListTabContainer = this.f31921b.f31869m;
        playHeaderListTabContainer.f31863j = i;
        playHeaderListTabContainer.f31864k = 0.0f;
        playHeaderListTabContainer.invalidate();
        this.f31921b.m29112f();
    }

    public final void d_(int i) {
        this.f31920a = i;
        if (this.f31921b.f31873q != null) {
            this.f31921b.f31873q.d_(i);
        }
        if (this.f31920a == 0) {
            this.f31921b.f31874r = true;
        }
    }

    public final void onChanged() {
        this.f31921b.m29111e();
    }
}
