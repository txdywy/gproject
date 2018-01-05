package com.google.android.finsky.layout.actionbar;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

final class C3661d extends LayerDrawable {
    C3661d(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public final boolean getPadding(Rect rect) {
        rect.top = 0;
        rect.bottom = 0;
        rect.left = 0;
        rect.right = 0;
        return false;
    }
}
