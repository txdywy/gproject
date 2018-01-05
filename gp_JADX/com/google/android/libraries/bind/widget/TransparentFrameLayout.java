package com.google.android.libraries.bind.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class TransparentFrameLayout extends FrameLayout {
    public TransparentFrameLayout(Context context) {
        this(context, null, 0);
    }

    public TransparentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransparentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(11)
    protected boolean onSetAlpha(int i) {
        return true;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setAlpha(getAlpha());
        }
    }
}
