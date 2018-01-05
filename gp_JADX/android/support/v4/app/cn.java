package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class cn implements OnAttachStateChangeListener, OnPreDrawListener {
    public final View f1550a;
    public ViewTreeObserver f1551b;
    public final Runnable f1552c;

    private cn(View view, Runnable runnable) {
        this.f1550a = view;
        this.f1551b = view.getViewTreeObserver();
        this.f1552c = runnable;
    }

    public static cn m1440a(View view, Runnable runnable) {
        cn cnVar = new cn(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(cnVar);
        view.addOnAttachStateChangeListener(cnVar);
        return cnVar;
    }

    public final boolean onPreDraw() {
        m1441a();
        this.f1552c.run();
        return true;
    }

    private final void m1441a() {
        if (this.f1551b.isAlive()) {
            this.f1551b.removeOnPreDrawListener(this);
        } else {
            this.f1550a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1550a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f1551b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        m1441a();
    }
}
