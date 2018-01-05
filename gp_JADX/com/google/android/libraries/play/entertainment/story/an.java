package com.google.android.libraries.play.entertainment.story;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;

final class an implements OnApplyWindowInsetsListener {
    public final /* synthetic */ View f30390a;
    public final /* synthetic */ View f30391b;
    public final /* synthetic */ View f30392c;
    public final /* synthetic */ View f30393d;

    an(View view, View view2, View view3, View view4) {
        this.f30390a = view;
        this.f30391b = view2;
        this.f30392c = view3;
        this.f30393d = view4;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        WindowInsets replaceSystemWindowInsets = windowInsets.replaceSystemWindowInsets(0, systemWindowInsetTop, 0, 0);
        LayoutParams layoutParams = (LayoutParams) this.f30390a.getLayoutParams();
        layoutParams.topMargin = systemWindowInsetTop;
        this.f30390a.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.f30391b.getLayoutParams();
        layoutParams.topMargin = systemWindowInsetTop;
        this.f30391b.setLayoutParams(layoutParams);
        layoutParams = (LayoutParams) this.f30392c.getLayoutParams();
        layoutParams.height = systemWindowInsetTop;
        this.f30392c.setLayoutParams(layoutParams);
        return this.f30393d.dispatchApplyWindowInsets(replaceSystemWindowInsets);
    }
}
