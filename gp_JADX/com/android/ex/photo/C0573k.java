package com.android.ex.photo;

import android.os.Build.VERSION;
import android.view.View.OnSystemUiVisibilityChangeListener;

final class C0573k implements OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ C0572j f3836a;

    C0573k(C0572j c0572j) {
        this.f3836a = c0572j;
    }

    public final void onSystemUiVisibilityChange(int i) {
        if (VERSION.SDK_INT >= 19 && i == 0 && this.f3836a.f3813d == 3846) {
            this.f3836a.m4147a(false, true);
        }
    }
}
