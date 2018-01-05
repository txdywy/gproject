package com.google.android.finsky.setup;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

final class cu {
    public View f20958a;
    public int f20959b;
    public int f20960c = 0;
    public LayoutParams f20961d;

    cu(Activity activity) {
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.f20960c = activity.getResources().getDimensionPixelSize(identifier);
        }
        this.f20958a = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.f20958a.getViewTreeObserver().addOnGlobalLayoutListener(new cv(this));
        this.f20961d = (LayoutParams) this.f20958a.getLayoutParams();
    }
}
