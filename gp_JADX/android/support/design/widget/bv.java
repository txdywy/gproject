package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import java.util.ArrayList;

final class bv {
    public final ArrayList f900a = new ArrayList();
    public bx f901b = null;
    public ValueAnimator f902c = null;
    public final AnimatorListener f903d = new bw(this);

    bv() {
    }

    public final void m721a(int[] iArr, ValueAnimator valueAnimator) {
        bx bxVar = new bx(iArr, valueAnimator);
        valueAnimator.addListener(this.f903d);
        this.f900a.add(bxVar);
    }
}
