package com.android.ex.photo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.view.bj;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.squareup.haha.perflib.HprofParser;

public class PhotoViewPager extends ViewPager {
    public float f3724D;
    public int f3725H;
    public C0571v ah;

    public PhotoViewPager(Context context) {
        super(context);
        m4013e();
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4013e();
    }

    private final void m4013e() {
        boolean z = false;
        bj c0581t = new C0581t();
        if (true != (this.aa != null)) {
            z = true;
        }
        this.aa = c0581t;
        setChildrenDrawingOrderEnabled(true);
        this.ac = 2;
        this.ab = 2;
        if (z) {
            al_();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0582u i;
        boolean z;
        boolean z2;
        int i2 = 1;
        if (this.ah != null) {
            i = this.ah.mo1014i();
        } else {
            i = C0582u.NONE;
        }
        if (i == C0582u.BOTH || i == C0582u.LEFT) {
            z = true;
        } else {
            z = false;
        }
        if (i == C0582u.BOTH || i == C0582u.RIGHT) {
            z2 = true;
        } else {
            z2 = false;
        }
        int action = motionEvent.getAction() & HprofParser.ROOT_UNKNOWN;
        if (action == 3 || action == 1) {
            this.f3725H = -1;
        }
        switch (action) {
            case 0:
                this.f3724D = motionEvent.getX();
                motionEvent.getRawX();
                motionEvent.getRawY();
                this.f3725H = motionEvent.getPointerId(0);
                break;
            case 2:
                if (z || z2) {
                    i2 = this.f3725H;
                    if (i2 != -1) {
                        float x = motionEvent.getX(motionEvent.findPointerIndex(i2));
                        if (z && z2) {
                            this.f3724D = x;
                            return false;
                        } else if (z && x > this.f3724D) {
                            this.f3724D = x;
                            return false;
                        } else if (z2 && x < this.f3724D) {
                            this.f3724D = x;
                            return false;
                        }
                    }
                }
                break;
            case 6:
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.f3725H) {
                    if (actionIndex != 0) {
                        i2 = 0;
                    }
                    this.f3724D = motionEvent.getX(i2);
                    this.f3725H = motionEvent.getPointerId(i2);
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnInterceptTouchListener(C0571v c0571v) {
        this.ah = c0571v;
    }
}
