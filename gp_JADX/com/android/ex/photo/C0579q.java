package com.android.ex.photo;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class C0579q implements OnGlobalLayoutListener {
    public final /* synthetic */ View f3842a;
    public final /* synthetic */ C0572j f3843b;

    C0579q(C0572j c0572j, View view) {
        this.f3843b = c0572j;
        this.f3842a = view;
    }

    public final void onGlobalLayout() {
        if (VERSION.SDK_INT >= 16) {
            this.f3842a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f3842a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
        this.f3843b.m4163k();
    }
}
