package android.support.v7.app;

import android.view.View;

final class C0424p implements Runnable {
    public final /* synthetic */ View f2452a;
    public final /* synthetic */ View f2453b;
    public final /* synthetic */ AlertController f2454c;

    C0424p(AlertController alertController, View view, View view2) {
        this.f2454c = alertController;
        this.f2452a = view;
        this.f2453b = view2;
    }

    public final void run() {
        AlertController.m2309a(this.f2454c.f2220f, this.f2452a, this.f2453b);
    }
}
