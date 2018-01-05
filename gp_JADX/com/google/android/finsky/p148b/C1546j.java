package com.google.android.finsky.p148b;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.google.android.finsky.ct.C2412a;

final class C1546j implements OnTouchListener {
    public final C2412a f8312a;

    C1546j(C2412a c2412a) {
        this.f8312a = c2412a;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f8312a.m12119a(view.getContext(), new C1547k(this, motionEvent));
        }
        return false;
    }
}
