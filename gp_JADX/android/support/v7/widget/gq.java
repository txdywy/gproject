package android.support.v7.widget;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

final class gq extends TouchDelegate {
    public final View f3515a;
    public final Rect f3516b = new Rect();
    public final Rect f3517c = new Rect();
    public final Rect f3518d = new Rect();
    public final int f3519e;
    public boolean f3520f;

    public gq(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f3519e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        m3739a(rect, rect2);
        this.f3515a = view;
    }

    public final void m3739a(Rect rect, Rect rect2) {
        this.f3516b.set(rect);
        this.f3518d.set(rect);
        this.f3518d.inset(-this.f3519e, -this.f3519e);
        this.f3517c.set(rect2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = r7.getX();
        r3 = (int) r2;
        r2 = r7.getY();
        r4 = (int) r2;
        r2 = r7.getAction();
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x0048;
            case 2: goto L_0x0048;
            case 3: goto L_0x0056;
            default: goto L_0x0013;
        };
    L_0x0013:
        r2 = r0;
    L_0x0014:
        if (r2 == 0) goto L_0x003b;
    L_0x0016:
        if (r1 == 0) goto L_0x005b;
    L_0x0018:
        r0 = r6.f3517c;
        r0 = r0.contains(r3, r4);
        if (r0 != 0) goto L_0x005b;
    L_0x0020:
        r0 = r6.f3515a;
        r0 = r0.getWidth();
        r0 = r0 / 2;
        r0 = (float) r0;
        r1 = r6.f3515a;
        r1 = r1.getHeight();
        r1 = r1 / 2;
        r1 = (float) r1;
        r7.setLocation(r0, r1);
    L_0x0035:
        r0 = r6.f3515a;
        r0 = r0.dispatchTouchEvent(r7);
    L_0x003b:
        return r0;
    L_0x003c:
        r2 = r6.f3516b;
        r2 = r2.contains(r3, r4);
        if (r2 == 0) goto L_0x0013;
    L_0x0044:
        r6.f3520f = r1;
        r2 = r1;
        goto L_0x0014;
    L_0x0048:
        r2 = r6.f3520f;
        if (r2 == 0) goto L_0x0014;
    L_0x004c:
        r5 = r6.f3518d;
        r5 = r5.contains(r3, r4);
        if (r5 != 0) goto L_0x0014;
    L_0x0054:
        r1 = r0;
        goto L_0x0014;
    L_0x0056:
        r2 = r6.f3520f;
        r6.f3520f = r0;
        goto L_0x0014;
    L_0x005b:
        r0 = r6.f3517c;
        r0 = r0.left;
        r0 = r3 - r0;
        r0 = (float) r0;
        r1 = r6.f3517c;
        r1 = r1.top;
        r1 = r4 - r1;
        r1 = (float) r1;
        r7.setLocation(r0, r1);
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.gq.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
