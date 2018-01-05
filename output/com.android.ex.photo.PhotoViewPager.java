package com.android.ex.photo;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class PhotoViewPager extends ViewPager
{

    public float D;
    public int H;
    public com.android.ex.photo.v ah;

    PhotoViewPager(Context p0) {
        ViewPager(p0);
        this.e();
    }

    PhotoViewPager(Context p0, AttributeSet p1) {
        ViewPager(p0, p1);
        this.e();
    }

    private final void e() {
        v0 = 0;
        if (this.aa != 0)
            v2 = 1;
        else
            v2 = 0;
        if (1 != v2)
            v0 = 1;
        this.aa = new com.android.ex.photo.t();
        this.setChildrenDrawingOrderEnabled(1);
        this.ac = 2;
        this.ab = 2;
        if (v0 != 0)
            this.al_();
    }

    public boolean onInterceptTouchEvent(MotionEvent p0) {
  1:    v3 = 1;
  2:    v2 = 0;
  5:    if (this.ah != 0)
  9:        v0 = this.ah.i();
        else
 52:        v0 = com.android.ex.photo.u.a;
 15:    if (v0 == com.android.ex.photo.u.d || v0 == com.android.ex.photo.u.b)
 21:        v1 = 1;
        else
 55:        v1 = 0;
 24:    if (v0 == com.android.ex.photo.u.d || v0 == com.android.ex.photo.u.c)
 30:        v0 = 1;
        else
 57:        v0 = 0;
 35:    v4 = p0.getAction() & 255;
 38:    if (v4 == 3 || v4 == 1)
 42:        this.H = -1;
 44:    switch (v4) {
            case 0:
 44:            goto 104;
            case 2:
 44:            goto 59;
            case 6:
 44:            goto 123;
            default:
        }
 47:    v2 = super.onInterceptTouchEvent(p0);
 51:    return v2;
 59:    if (v1 == 0 && v0 == 0) {
 47:        v2 = super.onInterceptTouchEvent(p0);
 51:        return v2;
        }
 65:    if (this.H == -1) {
 47:        v2 = super.onInterceptTouchEvent(p0);
 51:        return v2;
        }
 71:    v3 = p0.getX(p0.findPointerIndex(this.H));
 75:    if (v1 != 0 && v0 != 0) {
 79:        this.D = v3;
 81:        return v2;
        }
 82:    if (v1 != 0 && v3 > this.D) {
 90:        this.D = v3;
 92:        return v2;
        }
 93:    if (v0 == 0) {
 47:        v2 = super.onInterceptTouchEvent(p0);
 51:        return v2;
        }
 99:    if (v3 >= this.D) {
 47:        v2 = super.onInterceptTouchEvent(p0);
 51:        return v2;
        }
101:    this.D = v3;
103:    goto 51;
108:    this.D = p0.getX();
110:    p0.getRawX();
113:    p0.getRawY();
120:    this.H = p0.getPointerId(0);
122:    goto 47;
123:    v0 = p0.getActionIndex();
133:    if (p0.getPointerId(v0) == this.H) {
135:        if (v0 != 0)
150:            v3 = 0;
141:        this.D = p0.getX(v3);
147:        this.H = p0.getPointerId(v3);
        }
149:    goto 47;
    }

    public void setOnInterceptTouchListener(com.android.ex.photo.v p0) {
        this.ah = p0;
    }

}
