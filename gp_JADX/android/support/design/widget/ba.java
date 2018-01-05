package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class ba extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean f857a;
    public final /* synthetic */ bf f858b;
    public final /* synthetic */ ay f859c;

    ba(ay ayVar, boolean z, bf bfVar) {
        this.f859c = ayVar;
        this.f857a = z;
        this.f858b = bfVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f859c.f849z.m478a(0, this.f857a);
        this.f859c.f831b = 2;
        this.f859c.f832c = animator;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f859c.f831b = 0;
        this.f859c.f832c = null;
        if (this.f858b != null) {
            this.f858b.mo146a();
        }
    }
}
