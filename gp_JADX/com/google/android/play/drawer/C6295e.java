package com.google.android.play.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class C6295e implements OnTouchListener {
    C6295e() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
