package android.support.v7.app;

import android.view.View;

final class C0422n implements Runnable {
    public final /* synthetic */ View f2447a;
    public final /* synthetic */ View f2448b;
    public final /* synthetic */ AlertController f2449c;

    C0422n(AlertController alertController, View view, View view2) {
        this.f2449c = alertController;
        this.f2447a = view;
        this.f2448b = view2;
    }

    public final void run() {
        AlertController.m2309a(this.f2449c.f2237w, this.f2447a, this.f2448b);
    }
}
