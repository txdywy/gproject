package com.google.android.finsky.actionbuttons;

import android.graphics.Rect;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

final class af implements OnGlobalLayoutListener {
    public final /* synthetic */ PlayActionButtonV2 f6036a;
    public final /* synthetic */ String f6037b;
    public final /* synthetic */ ae f6038c;

    af(ae aeVar, PlayActionButtonV2 playActionButtonV2, String str) {
        this.f6038c = aeVar;
        this.f6036a = playActionButtonV2;
        this.f6037b = str;
    }

    public final void onGlobalLayout() {
        Rect rect;
        this.f6036a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        PlayActionButtonV2 playActionButtonV2 = this.f6036a;
        r2 = new int[2];
        playActionButtonV2.getLocationInWindow(r2);
        r2[1] = r2[1] + 4;
        if (r2[0] <= 0 || r2[1] <= 0) {
            rect = null;
        } else {
            rect = new Rect(r2[0], r2[1], r2[0] + playActionButtonV2.getWidth(), playActionButtonV2.getHeight() + r2[1]);
        }
        if (rect != null && this.f6038c.f6035j != null) {
            this.f6038c.f6035j.mo1203a(rect, this.f6036a, this.f6037b);
        }
    }
}
