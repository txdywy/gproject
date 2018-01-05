package android.support.v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

final class C0477i implements OnAttachStateChangeListener {
    public final /* synthetic */ C0475g f2787a;

    C0477i(C0475g c0475g) {
        this.f2787a = c0475g;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.f2787a.f2783x != null) {
            if (!this.f2787a.f2783x.isAlive()) {
                this.f2787a.f2783x = view.getViewTreeObserver();
            }
            this.f2787a.f2783x.removeGlobalOnLayoutListener(this.f2787a.f2768i);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
