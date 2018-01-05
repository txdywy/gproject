package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;

class ak extends aj {
    ak() {
    }

    public final boolean mo390b(View view) {
        return view.hasTransientState();
    }

    public final void mo388a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public final void mo391c(View view) {
        view.postInvalidateOnAnimation();
    }

    public final void mo386a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public final void mo387a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public final int mo392d(View view) {
        return view.getImportantForAccessibility();
    }

    public void mo384a(View view, int i) {
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public final boolean mo389a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public final ViewParent mo393e(View view) {
        return view.getParentForAccessibility();
    }

    public final int mo394f(View view) {
        return view.getMinimumWidth();
    }

    public final int mo395g(View view) {
        return view.getMinimumHeight();
    }

    public void mo396h(View view) {
        view.requestFitSystemWindows();
    }

    public final boolean mo397i(View view) {
        return view.getFitsSystemWindows();
    }

    public final boolean mo398j(View view) {
        return view.hasOverlappingRendering();
    }

    public final void mo385a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
