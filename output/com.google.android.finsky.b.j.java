package com.google.android.finsky.b;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.finsky.ct.a;

public final class com.google.android.finsky.b.j implements View$OnTouchListener
{

    public final com.google.android.finsky.ct.a a;

    j(com.google.android.finsky.ct.a p0) {
        this.a = p0;
    }

    public final boolean onTouch(View p0, MotionEvent p1) {
        if (p1 != 0)
            this.a.a(p0.getContext(), new com.google.android.finsky.b.k(this, p1));
        return 0;
    }

}
