package android.support.design.widget;

import android.view.View;

final class C0173y implements Runnable {
    public final /* synthetic */ View f1004a;
    public final /* synthetic */ int f1005b;
    public final /* synthetic */ BottomSheetBehavior f1006c;

    C0173y(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1006c = bottomSheetBehavior;
        this.f1004a = view;
        this.f1005b = i;
    }

    public final void run() {
        this.f1006c.m425a(this.f1004a, this.f1005b);
    }
}
