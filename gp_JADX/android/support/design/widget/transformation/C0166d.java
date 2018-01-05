package android.support.design.widget.transformation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class C0166d implements AnimatorUpdateListener {
    public final /* synthetic */ View f996a;

    C0166d(View view) {
        this.f996a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f996a.invalidate();
    }
}
