package android.support.design.widget;

import android.support.v4.view.ai;
import android.view.View;

final class bl implements Runnable {
    public final CoordinatorLayout f869a;
    public final View f870b;
    public final /* synthetic */ bk f871c;

    bl(bk bkVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f871c = bkVar;
        this.f869a = coordinatorLayout;
        this.f870b = view;
    }

    public final void run() {
        if (this.f870b != null && this.f871c.f551i != null) {
            if (this.f871c.f551i.computeScrollOffset()) {
                this.f871c.a_(this.f869a, this.f870b, this.f871c.f551i.getCurrY());
                ai.m1830a(this.f870b, (Runnable) this);
                return;
            }
            this.f871c.mo75a(this.f869a, this.f870b);
        }
    }
}
