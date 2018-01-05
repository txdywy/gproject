package com.google.android.finsky.headerlistlayout;

import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.finsky.bg.C1616q;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;

final class C3162d implements OnPreDrawListener {
    public final /* synthetic */ C3161c f16380a;

    C3162d(C3161c c3161c) {
        this.f16380a = c3161c;
    }

    public final boolean onPreDraw() {
        boolean z;
        C3161c c3161c = this.f16380a;
        if (c3161c.f16372i == null || c3161c.f16370g == null) {
            z = false;
        } else {
            int measuredHeight = c3161c.f16373j.getMeasuredHeight();
            int height = c3161c.f16370g.getHeight();
            if (InsetsFrameLayout.f14024a) {
                height += c3161c.f16367d;
            }
            ControlsContainerBackground controlsContainerBackground = c3161c.f16368e;
            if (controlsContainerBackground.f16326d == measuredHeight && controlsContainerBackground.f16327e == height) {
                z = false;
            } else {
                LayoutParams layoutParams = controlsContainerBackground.getLayoutParams();
                layoutParams.height = controlsContainerBackground.f16328f ? height : measuredHeight;
                controlsContainerBackground.setLayoutParams(layoutParams);
                controlsContainerBackground.f16326d = measuredHeight;
                controlsContainerBackground.f16327e = height;
                if (controlsContainerBackground.f16324b != null) {
                    controlsContainerBackground.f16324b.cancel();
                    if (controlsContainerBackground.f16324b == controlsContainerBackground.getAnimation()) {
                        controlsContainerBackground.clearAnimation();
                    }
                    controlsContainerBackground.f16324b = null;
                }
                if (controlsContainerBackground.f16325c != null) {
                    controlsContainerBackground.m16065a(controlsContainerBackground.f16325c.getBackground(), 0, false);
                }
                z = true;
            }
            if (z) {
                if (C3161c.f16364a) {
                    c3161c.f16370g.invalidateOutline();
                }
                z = true;
            } else {
                z = false;
            }
            c3161c.f16372i.getLocationInWindow(c3161c.f16365b);
            measuredHeight = (c3161c.f16365b[1] + c3161c.f16367d) + c3161c.f16372i.getActionBarHeight();
            if (c3161c.f16374k == null || r1) {
                c3161c.f16374k = new C1616q(height, measuredHeight);
            }
            c3161c.f16373j.getLocationInWindow(c3161c.f16365b);
            int i = c3161c.f16365b[1];
            View view = c3161c.f16368e;
            boolean z2 = i <= measuredHeight;
            boolean z3 = c3161c.f16375l;
            if (!(view.f16328f == z2 || view.f16327e == view.f16326d)) {
                Interpolator decelerateInterpolator;
                view.f16328f = z2;
                measuredHeight = z2 ? view.f16327e : view.f16326d;
                if (view.f16324b != null) {
                    view.f16324b.cancel();
                }
                view.f16324b = new C3159a(view);
                view.f16324b.m16059a(view.getHeight(), measuredHeight);
                view.f16324b.setDuration((long) ((Math.abs(view.getHeight() - measuredHeight) * 300) / Math.abs(view.f16327e - view.f16326d)));
                C3159a c3159a = view.f16324b;
                if (!z2 || z3) {
                    decelerateInterpolator = new DecelerateInterpolator();
                } else {
                    decelerateInterpolator = new AccelerateInterpolator();
                }
                c3159a.setInterpolator(decelerateInterpolator);
                view.startAnimation(view.f16324b);
            }
            float min = Math.min(1.0f, Math.max(0.0f, (((float) i) - 0.0f) / ((float) c3161c.f16367d)));
            if (c3161c.f16377n != min) {
                c3161c.f16377n = min;
                ai.m1837b(c3161c.f16373j, min);
            }
            C1616q c1616q = c3161c.f16374k;
            min = Math.min(1.0f, Math.max(0.0f, (((float) i) - ((float) c1616q.f8534b)) / ((float) (c1616q.f8533a - c1616q.f8534b))));
            if (c3161c.f16378o != min) {
                c3161c.f16378o = min;
                ai.m1837b(c3161c.f16371h, min);
            }
        }
        if (z) {
            return false;
        }
        return true;
    }
}
