package android.support.design.widget;

import android.view.ViewTreeObserver.OnPreDrawListener;

final class ar implements OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout f812a;

    ar(CoordinatorLayout coordinatorLayout) {
        this.f812a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.f812a.m458a(0);
        return true;
    }
}
