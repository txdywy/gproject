package com.google.android.finsky.detailscomponents;

import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;

final class C2589o extends C1060p {
    public final /* synthetic */ ScreenshotsRecyclerView f13794a;

    C2589o(ScreenshotsRecyclerView screenshotsRecyclerView, ViewGroup viewGroup) {
        this.f13794a = screenshotsRecyclerView;
        super(viewGroup);
    }

    public final void onGlobalLayout() {
        m6486a();
        this.f13794a.aI.f3433a.m3638b();
    }
}
