package com.google.android.wallet.ui.common;

import android.graphics.Rect;
import android.support.v4.h.u;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

public final class cg extends TouchDelegate {
    public static final Rect f33632a = new Rect();
    public final u f33633b = new u();
    public TouchDelegate f33634c;

    public cg(View view) {
        super(f33632a, view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z;
            if (this.f33634c == null || !this.f33634c.onTouchEvent(motionEvent)) {
                z = false;
            } else {
                z = true;
            }
            if (actionMasked != 1 && actionMasked != 32) {
                return z;
            }
            this.f33634c = null;
            return z;
        } else if (motionEvent.getPointerCount() > 1) {
            return false;
        } else {
            int size = this.f33633b.size();
            for (actionMasked = 0; actionMasked < size; actionMasked++) {
                if (((View) this.f33633b.b(actionMasked)).isShown()) {
                    TouchDelegate touchDelegate = (TouchDelegate) this.f33633b.c(actionMasked);
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    boolean onTouchEvent = touchDelegate.onTouchEvent(motionEvent);
                    motionEvent.setLocation(x, y);
                    if (onTouchEvent) {
                        this.f33634c = touchDelegate;
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
