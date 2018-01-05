package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class C0352i {
    public final C0353j f1896a;

    public C0352i(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, (byte) 0);
    }

    public C0352i(Context context, OnGestureListener onGestureListener, byte b) {
        if (VERSION.SDK_INT > 17) {
            this.f1896a = new C0356m(context, onGestureListener);
        } else {
            this.f1896a = new C0354k(context, onGestureListener);
        }
    }

    public final boolean m2036a(MotionEvent motionEvent) {
        return this.f1896a.mo447a(motionEvent);
    }
}
