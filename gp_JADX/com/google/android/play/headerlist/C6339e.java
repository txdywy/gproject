package com.google.android.play.headerlist;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnHoverListener;

final class C6339e implements OnHoverListener {
    public final /* synthetic */ PlayHeaderListLayout f31896a;

    C6339e(PlayHeaderListLayout playHeaderListLayout) {
        this.f31896a = playHeaderListLayout;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        return this.f31896a.m29097e();
    }
}
