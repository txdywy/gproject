package com.google.android.play.p203b;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.play.C6282d;
import com.google.android.play.layout.q;

final class C6269g extends C6268f {
    C6269g() {
    }

    protected final Drawable mo5368a(Resources resources, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        return new C6265c(resources, new C6264b(resources, C6282d.play_white, f, f2, f3, f4, i, i2, i3));
    }

    protected final void mo5369d(View view, int i) {
        if (view instanceof q) {
            Drawable foreground = ((q) view).getForeground();
            if (foreground instanceof C6265c) {
                C6265c c6265c = (C6265c) foreground;
            } else {
                throw new IllegalArgumentException("Given view was not initialized by this CardBubbleViewGroupDelegate");
            }
        }
        c6265c = null;
        if (c6265c != null) {
            c6265c.f31321b.m28779a(i);
            c6265c.m28782a(c6265c.getBounds());
        }
    }
}
