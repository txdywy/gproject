package android.support.design.widget;

import android.content.Context;
import android.support.design.p018a.C0095a;
import android.util.AttributeSet;
import android.view.View;

public class HideBottomViewOnScrollBehavior extends an {
    public int f652a = 0;

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean mo69a(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f652a = view.getMeasuredHeight();
        return super.mo69a(coordinatorLayout, view, i);
    }

    public final boolean mo95a(int i) {
        return i == 2;
    }

    public final void mo122b(View view, int i) {
        if (i > 0) {
            view.clearAnimation();
            view.animate().translationY((float) this.f652a).setInterpolator(C0095a.f422b).setDuration(175);
        } else if (i < 0) {
            view.clearAnimation();
            view.animate().translationY(0.0f).setInterpolator(C0095a.f423c).setDuration(225);
        }
    }
}
