package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class az extends AnimatorListenerAdapter {
    public boolean f850a;
    public final /* synthetic */ boolean f851b;
    public final /* synthetic */ bf f852c;
    public final /* synthetic */ ay f853d;

    az(ay ayVar, boolean z, bf bfVar) {
        this.f853d = ayVar;
        this.f851b = z;
        this.f852c = bfVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f853d.f849z.m478a(0, this.f851b);
        this.f853d.f831b = 1;
        this.f853d.f832c = animator;
        this.f850a = false;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f850a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f853d.f831b = 0;
        this.f853d.f832c = null;
        if (!this.f850a) {
            this.f853d.f849z.m478a(this.f851b ? 8 : 4, this.f851b);
            if (this.f852c != null) {
                this.f852c.mo147b();
            }
        }
    }
}
