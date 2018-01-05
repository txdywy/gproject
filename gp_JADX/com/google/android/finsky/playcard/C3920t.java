package com.google.android.finsky.playcard;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

final class C3920t extends InsetDrawable {
    C3920t(Drawable drawable, int i) {
        super(drawable, i);
    }

    public final boolean getPadding(Rect rect) {
        rect.setEmpty();
        return false;
    }
}
