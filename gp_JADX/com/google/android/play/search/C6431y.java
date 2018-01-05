package com.google.android.play.search;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;

final class C6431y implements OnTouchListener {
    public final /* synthetic */ InputMethodManager f32387a;

    C6431y(InputMethodManager inputMethodManager) {
        this.f32387a = inputMethodManager;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f32387a.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return false;
    }
}
