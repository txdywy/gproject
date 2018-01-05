package com.google.android.finsky.detailscomponents;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.fa;
import android.view.View;
import com.google.android.finsky.cv.p177a.bd;

final class C2590p extends LinearLayoutManager {
    public final /* synthetic */ ScreenshotsRecyclerView f13795a;

    public C2590p(ScreenshotsRecyclerView screenshotsRecyclerView, boolean z) {
        this.f13795a = screenshotsRecyclerView;
        super(0, z);
    }

    public final void mo2969a(View view, int i, int i2) {
        C2593t c2593t = this.f13795a.aI;
        fa faVar = (fa) view.getLayoutParams();
        if (faVar.width == 0) {
            bd bdVar = ((C2591r) c2593t.f13801d.get(faVar.f3356c.m3267d())).f13796a;
            if (bdVar.f11859e == null || bdVar.f11859e.f11878b <= 0 || bdVar.f11859e.f11879c <= 0) {
                faVar.width = -2;
            } else {
                int measuredHeight;
                ScreenshotsRecyclerView screenshotsRecyclerView = c2593t.f13800c;
                switch (screenshotsRecyclerView.aJ) {
                    case 1:
                        measuredHeight = screenshotsRecyclerView.getMeasuredHeight();
                        break;
                    default:
                        measuredHeight = screenshotsRecyclerView.getHeight();
                        break;
                }
                int i3 = bdVar.f11859e.f11878b;
                int i4 = bdVar.f11859e.f11879c;
                faVar.width = (((measuredHeight * i3) + i4) - 1) / i4;
            }
        }
        super.mo2969a(view, i, i2);
    }
}
