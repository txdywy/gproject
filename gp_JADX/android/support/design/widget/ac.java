package android.support.design.widget;

import android.support.v4.view.ai;
import android.view.View;

final class ac implements Runnable {
    public final View f715a;
    public final int f716b;
    public final /* synthetic */ BottomSheetBehavior f717c;

    ac(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f717c = bottomSheetBehavior;
        this.f715a = view;
        this.f716b = i;
    }

    public final void run() {
        if (this.f717c.f591m == null || !this.f717c.f591m.m2266b()) {
            this.f717c.m436c(this.f716b);
        } else {
            ai.m1830a(this.f715a, (Runnable) this);
        }
    }
}
