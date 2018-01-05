package com.google.android.play.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

public final class C6451j extends TouchDelegate {
    public final View f32419a;
    public final Rect f32420b;
    public final Rect f32421c;
    public boolean f32422d;
    public final int f32423e;
    public final AccessibilityManager f32424f;

    public C6451j(Rect rect, View view) {
        super(rect, view);
        this.f32420b = rect;
        this.f32423e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f32421c = new Rect(rect);
        this.f32421c.inset(-this.f32423e, -this.f32423e);
        this.f32419a = view;
        this.f32424f = (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.f32424f;
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r0 = r6.f32424f;
        r0 = r0.isTouchExplorationEnabled();
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        return r1;
    L_0x000f:
        r0 = r7.getX();
        r0 = (int) r0;
        r3 = r7.getY();
        r4 = (int) r3;
        r3 = r7.getAction();
        switch(r3) {
            case 0: goto L_0x003d;
            case 1: goto L_0x0049;
            case 2: goto L_0x0049;
            case 3: goto L_0x0061;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = r1;
    L_0x0021:
        if (r0 == 0) goto L_0x000e;
    L_0x0023:
        r0 = r6.f32419a;
        if (r2 == 0) goto L_0x0066;
    L_0x0027:
        r1 = r0.getWidth();
        r1 = r1 / 2;
        r1 = (float) r1;
        r2 = r0.getHeight();
        r2 = r2 / 2;
        r2 = (float) r2;
        r7.setLocation(r1, r2);
    L_0x0038:
        r1 = r0.dispatchTouchEvent(r7);
        goto L_0x000e;
    L_0x003d:
        r3 = r6.f32420b;
        r0 = r3.contains(r0, r4);
        if (r0 == 0) goto L_0x0020;
    L_0x0045:
        r6.f32422d = r2;
        r0 = r2;
        goto L_0x0021;
    L_0x0049:
        r3 = r6.f32422d;
        if (r3 == 0) goto L_0x0077;
    L_0x004d:
        r5 = r6.f32421c;
        r0 = r5.contains(r0, r4);
        if (r0 != 0) goto L_0x0077;
    L_0x0055:
        r0 = r1;
    L_0x0056:
        r4 = r7.getAction();
        if (r4 != r2) goto L_0x0074;
    L_0x005c:
        r6.f32422d = r1;
        r2 = r0;
        r0 = r3;
        goto L_0x0021;
    L_0x0061:
        r0 = r6.f32422d;
        r6.f32422d = r1;
        goto L_0x0021;
    L_0x0066:
        r1 = r6.f32423e;
        r2 = r1 * 2;
        r2 = -r2;
        r2 = (float) r2;
        r1 = r1 * 2;
        r1 = -r1;
        r1 = (float) r1;
        r7.setLocation(r2, r1);
        goto L_0x0038;
    L_0x0074:
        r2 = r0;
        r0 = r3;
        goto L_0x0021;
    L_0x0077:
        r0 = r2;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.utils.j.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
