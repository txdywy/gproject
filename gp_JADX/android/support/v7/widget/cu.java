package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

final class cu implements Runnable {
    public final /* synthetic */ cs f3330a;

    cu(cs csVar) {
        this.f3330a = csVar;
    }

    public final void run() {
        cs csVar = this.f3330a;
        csVar.m2853d();
        View view = csVar.f2745f;
        if (view.isEnabled() && !view.isLongClickable() && csVar.mo689b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            csVar.f2748i = true;
        }
    }
}
