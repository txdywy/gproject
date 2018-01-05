package com.google.android.wallet.ui.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.wallet.p383e.C6622f;

final class cj extends AnimatorListenerAdapter {
    public final /* synthetic */ Runnable f33637a;
    public final /* synthetic */ View f33638b;
    public final /* synthetic */ long f33639c;
    public final /* synthetic */ long f33640d;

    cj(Runnable runnable, View view, long j, long j2) {
        this.f33637a = runnable;
        this.f33638b = view;
        this.f33639c = j;
        this.f33640d = j2;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f33637a != null) {
            this.f33637a.run();
        }
        if (Boolean.TRUE == this.f33638b.getTag(C6622f.view_is_animating_downwards)) {
            View findFocus = this.f33638b.findFocus();
            if (findFocus != null) {
                Rect rect = new Rect();
                findFocus.getDrawingRect(rect);
                findFocus.requestRectangleOnScreen(rect);
            }
        }
        m30897a();
    }

    public final void onAnimationCancel(Animator animator) {
        m30897a();
    }

    private final void m30897a() {
        ViewPropertyAnimator listener = this.f33638b.animate().setListener(null);
        if (this.f33639c >= 0) {
            listener.setDuration(this.f33640d);
        }
        this.f33638b.setTag(C6622f.view_is_animating_downwards, null);
    }
}
