package com.google.android.play.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchBlockingFrameLayout extends FrameLayout {
    public TouchBlockingFrameLayout(Context context) {
        super(context);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchBlockingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
