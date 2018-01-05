package android.support.v7.widget;

import android.view.View;

final class dp implements Runnable {
    public final /* synthetic */ C0491do f3409a;

    dp(C0491do c0491do) {
        this.f3409a = c0491do;
    }

    public final void run() {
        View view = this.f3409a.f3172y;
        if (view != null && view.getWindowToken() != null) {
            this.f3409a.mo671b();
        }
    }
}
