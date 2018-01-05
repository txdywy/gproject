package android.support.v7.widget;

import android.view.ViewParent;

final class ct implements Runnable {
    public final /* synthetic */ cs f3329a;

    ct(cs csVar) {
        this.f3329a = csVar;
    }

    public final void run() {
        ViewParent parent = this.f3329a.f2745f.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
