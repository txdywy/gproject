package android.support.v4.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

final class C0356m implements C0353j {
    public final GestureDetector f1922a;

    public C0356m(Context context, OnGestureListener onGestureListener) {
        this.f1922a = new GestureDetector(context, onGestureListener, null);
    }

    public final boolean mo447a(MotionEvent motionEvent) {
        return this.f1922a.onTouchEvent(motionEvent);
    }

    public final void mo446a() {
        this.f1922a.setIsLongpressEnabled(true);
    }
}
