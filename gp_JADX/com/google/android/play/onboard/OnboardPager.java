package com.google.android.play.onboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.play.widget.C6401c;

public class OnboardPager extends C6401c {
    public boolean ah = true;
    public boolean ai = true;
    public float aj;

    public OnboardPager(Context context) {
        super(context);
    }

    public OnboardPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setAllowSwipeToNext(boolean z) {
        this.ah = z;
    }

    public void setAllowSwipeToPrevious(boolean z) {
        this.ai = z;
    }

    protected final boolean m29343c() {
        return m29342b(-1) ? super.c() : false;
    }

    protected final boolean m29344d() {
        return m29342b(1) ? super.d() : false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 || !m29341a(motionEvent)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            motionEvent.setAction(3);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m29341a(motionEvent)) {
            return true;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    private final boolean m29341a(MotionEvent motionEvent) {
        boolean z = motionEvent.getPointerCount() > 1;
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.aj = motionEvent.getX(0);
                break;
            case 2:
                if (z) {
                    return false;
                }
                float x = motionEvent.getX(0);
                float f = x - this.aj;
                this.aj = x;
                if (!m29342b((int) Math.signum(-f))) {
                    return false;
                }
                break;
            case 5:
            case 6:
                return false;
        }
        return true;
    }

    private final boolean m29342b(int i) {
        int currentVisualItem = getCurrentVisualItem();
        int a = getAdapter() == null ? 0 : getAdapter().a();
        if (i < 0 && currentVisualItem > 0) {
            return e() ? this.ah : this.ai;
        } else {
            if (i <= 0 || currentVisualItem >= a - 1) {
                return true;
            }
            return e() ? this.ai : this.ah;
        }
    }
}
