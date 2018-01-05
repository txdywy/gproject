package android.support.design.widget;

import android.support.v4.view.ai;
import android.view.View;

final class ca implements Runnable {
    public final View f910a;
    public final boolean f911b;
    public final /* synthetic */ SwipeDismissBehavior f912c;

    ca(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f912c = swipeDismissBehavior;
        this.f910a = view;
        this.f911b = z;
    }

    public final void run() {
        if (this.f912c.f665b != null && this.f912c.f665b.m2266b()) {
            ai.m1830a(this.f910a, (Runnable) this);
        } else if (this.f911b && this.f912c.f666c != null) {
            this.f912c.f666c.mo188a(this.f910a);
        }
    }
}
