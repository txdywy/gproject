package com.google.android.play.search;

import android.view.View;
import android.view.View.OnClickListener;

final class C6422p implements OnClickListener {
    public final /* synthetic */ PlaySearchNavigationButton f32366a;

    C6422p(PlaySearchNavigationButton playSearchNavigationButton) {
        this.f32366a = playSearchNavigationButton;
    }

    public final void onClick(View view) {
        if (this.f32366a.f32295a != null) {
            C6420m c6420m = this.f32366a.f32295a;
            if (c6420m.f32365e != null) {
                c6420m.f32365e.onClick(view);
            }
            if (this.f32366a.f32296b == 1) {
                this.f32366a.f32295a.m29446b();
            }
        }
    }
}
