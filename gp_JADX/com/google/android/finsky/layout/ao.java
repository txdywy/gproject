package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class ao implements OnFocusChangeListener {
    public final /* synthetic */ int f18491a;
    public final /* synthetic */ HorizontalStrip f18492b;

    ao(HorizontalStrip horizontalStrip, int i) {
        this.f18492b = horizontalStrip;
        this.f18491a = i;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C3657a c3657a = this.f18492b;
            int i = this.f18491a;
            if (c3657a.f18223c > ((float) c3657a.getWidth())) {
                float scrollPosition = (-c3657a.mo3563a(i)) - c3657a.getScrollPosition();
                float sqrt = (float) Math.sqrt((double) Math.abs((2.0f * c3657a.f18231k) * scrollPosition));
                float f = sqrt / c3657a.f18231k;
                if (scrollPosition < 0.0f) {
                    sqrt = -sqrt;
                }
                c3657a.m17312a(sqrt, f);
            }
        }
    }
}
