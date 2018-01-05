package com.google.android.play.headerlist;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

final class C6340f extends TransitionDrawable {
    C6340f(Drawable[] drawableArr) {
        super(drawableArr);
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(1.0f);
    }
}
