package android.support.v7.widget;

import android.support.v7.view.menu.al;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public abstract class cs implements OnAttachStateChangeListener, OnTouchListener {
    public final float f2742c;
    public final int f2743d;
    public final int f2744e;
    public final View f2745f;
    public Runnable f2746g;
    public Runnable f2747h;
    public boolean f2748i;
    public int f2749j;
    public final int[] f2750k = new int[2];

    public cs(View view) {
        this.f2745f = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2742c = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2743d = ViewConfiguration.getTapTimeout();
        this.f2744e = (this.f2743d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract al mo688a();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        r11 = this;
        r4 = 3;
        r5 = 0;
        r8 = 1;
        r7 = 0;
        r10 = r11.f2748i;
        if (r10 == 0) goto L_0x0078;
    L_0x0008:
        r1 = r11.f2745f;
        r0 = r11.mo688a();
        if (r0 == 0) goto L_0x0016;
    L_0x0010:
        r2 = r0.mo677d();
        if (r2 != 0) goto L_0x0028;
    L_0x0016:
        r0 = r7;
    L_0x0017:
        if (r0 != 0) goto L_0x001f;
    L_0x0019:
        r0 = r11.mo929c();
        if (r0 != 0) goto L_0x0076;
    L_0x001f:
        r0 = r8;
    L_0x0020:
        r11.f2748i = r0;
        if (r0 != 0) goto L_0x0026;
    L_0x0024:
        if (r10 == 0) goto L_0x0027;
    L_0x0026:
        r7 = r8;
    L_0x0027:
        return r7;
    L_0x0028:
        r0 = r0.mo678e();
        r0 = (android.support.v7.widget.ck) r0;
        if (r0 == 0) goto L_0x0036;
    L_0x0030:
        r2 = r0.isShown();
        if (r2 != 0) goto L_0x0038;
    L_0x0036:
        r0 = r7;
        goto L_0x0017;
    L_0x0038:
        r2 = android.view.MotionEvent.obtainNoHistory(r13);
        r3 = r11.f2750k;
        r1.getLocationOnScreen(r3);
        r1 = r3[r7];
        r1 = (float) r1;
        r3 = r3[r8];
        r3 = (float) r3;
        r2.offsetLocation(r1, r3);
        r1 = r11.f2750k;
        r0.getLocationOnScreen(r1);
        r3 = r1[r7];
        r3 = -r3;
        r3 = (float) r3;
        r1 = r1[r8];
        r1 = -r1;
        r1 = (float) r1;
        r2.offsetLocation(r3, r1);
        r1 = r11.f2749j;
        r1 = r0.mo824a(r2, r1);
        r2.recycle();
        r0 = r13.getActionMasked();
        if (r0 == r8) goto L_0x0072;
    L_0x0069:
        if (r0 == r4) goto L_0x0072;
    L_0x006b:
        r0 = r8;
    L_0x006c:
        if (r1 == 0) goto L_0x0074;
    L_0x006e:
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r0 = r8;
        goto L_0x0017;
    L_0x0072:
        r0 = r7;
        goto L_0x006c;
    L_0x0074:
        r0 = r7;
        goto L_0x0017;
    L_0x0076:
        r0 = r7;
        goto L_0x0020;
    L_0x0078:
        r1 = r11.f2745f;
        r0 = r1.isEnabled();
        if (r0 == 0) goto L_0x0087;
    L_0x0080:
        r0 = r13.getActionMasked();
        switch(r0) {
            case 0: goto L_0x00a8;
            case 1: goto L_0x0121;
            case 2: goto L_0x00d5;
            case 3: goto L_0x0121;
            default: goto L_0x0087;
        };
    L_0x0087:
        r0 = r7;
    L_0x0088:
        if (r0 == 0) goto L_0x0126;
    L_0x008a:
        r0 = r11.mo689b();
        if (r0 == 0) goto L_0x0126;
    L_0x0090:
        r9 = r8;
    L_0x0091:
        if (r9 == 0) goto L_0x00a5;
    L_0x0093:
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = r0;
        r6 = r5;
        r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
        r1 = r11.f2745f;
        r1.onTouchEvent(r0);
        r0.recycle();
    L_0x00a5:
        r0 = r9;
        goto L_0x0020;
    L_0x00a8:
        r0 = r13.getPointerId(r7);
        r11.f2749j = r0;
        r0 = r11.f2746g;
        if (r0 != 0) goto L_0x00b9;
    L_0x00b2:
        r0 = new android.support.v7.widget.ct;
        r0.<init>(r11);
        r11.f2746g = r0;
    L_0x00b9:
        r0 = r11.f2746g;
        r2 = r11.f2743d;
        r2 = (long) r2;
        r1.postDelayed(r0, r2);
        r0 = r11.f2747h;
        if (r0 != 0) goto L_0x00cc;
    L_0x00c5:
        r0 = new android.support.v7.widget.cu;
        r0.<init>(r11);
        r11.f2747h = r0;
    L_0x00cc:
        r0 = r11.f2747h;
        r2 = r11.f2744e;
        r2 = (long) r2;
        r1.postDelayed(r0, r2);
        goto L_0x0087;
    L_0x00d5:
        r0 = r11.f2749j;
        r0 = r13.findPointerIndex(r0);
        if (r0 < 0) goto L_0x0087;
    L_0x00dd:
        r2 = r13.getX(r0);
        r0 = r13.getY(r0);
        r3 = r11.f2742c;
        r6 = -r3;
        r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x011f;
    L_0x00ec:
        r6 = -r3;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x011f;
    L_0x00f1:
        r6 = r1.getRight();
        r9 = r1.getLeft();
        r6 = r6 - r9;
        r6 = (float) r6;
        r6 = r6 + r3;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x011f;
    L_0x0100:
        r2 = r1.getBottom();
        r6 = r1.getTop();
        r2 = r2 - r6;
        r2 = (float) r2;
        r2 = r2 + r3;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x011f;
    L_0x010f:
        r0 = r8;
    L_0x0110:
        if (r0 != 0) goto L_0x0087;
    L_0x0112:
        r11.m2853d();
        r0 = r1.getParent();
        r0.requestDisallowInterceptTouchEvent(r8);
        r0 = r8;
        goto L_0x0088;
    L_0x011f:
        r0 = r7;
        goto L_0x0110;
    L_0x0121:
        r11.m2853d();
        goto L_0x0087;
    L_0x0126:
        r9 = r7;
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.cs.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2748i = false;
        this.f2749j = -1;
        if (this.f2746g != null) {
            this.f2745f.removeCallbacks(this.f2746g);
        }
    }

    public boolean mo689b() {
        al a = mo688a();
        if (!(a == null || a.mo677d())) {
            a.mo671b();
        }
        return true;
    }

    protected boolean mo929c() {
        al a = mo688a();
        if (a != null && a.mo677d()) {
            a.mo674c();
        }
        return true;
    }

    final void m2853d() {
        if (this.f2747h != null) {
            this.f2745f.removeCallbacks(this.f2747h);
        }
        if (this.f2746g != null) {
            this.f2745f.removeCallbacks(this.f2746g);
        }
    }
}
