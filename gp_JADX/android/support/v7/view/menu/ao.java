package android.support.v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class ao implements OnAttachStateChangeListener {
    public final /* synthetic */ am f2713a;

    ao(am amVar) {
        this.f2713a = amVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.f2713a.f2706o != null) {
            if (!this.f2713a.f2706o.isAlive()) {
                this.f2713a.f2706o = view.getViewTreeObserver();
            }
            this.f2713a.f2706o.removeGlobalOnLayoutListener(this.f2713a.f2700i);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
