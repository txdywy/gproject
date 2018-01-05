package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.bt;
import android.support.v4.widget.am;
import android.support.v7.p040a.C0394a;

class ck extends dw {
    public boolean f3288a;
    public boolean f3289b;
    public boolean f3290c;
    public bt f3291d;
    public am f3292e;

    public ck(Context context, boolean z) {
        super(context, C0394a.dropDownListViewStyle);
        this.f3289b = z;
        setCacheColorHint(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo824a(android.view.MotionEvent r15, int r16) {
        /*
        r14 = this;
        r0 = 1;
        r1 = 0;
        r3 = r15.getActionMasked();
        switch(r3) {
            case 1: goto L_0x0055;
            case 2: goto L_0x0056;
            case 3: goto L_0x0050;
            default: goto L_0x0009;
        };
    L_0x0009:
        r13 = r1;
        r1 = r0;
        r0 = r13;
    L_0x000c:
        if (r1 == 0) goto L_0x0010;
    L_0x000e:
        if (r0 == 0) goto L_0x0037;
    L_0x0010:
        r0 = 0;
        r14.f3290c = r0;
        r0 = 0;
        r14.setPressed(r0);
        r14.drawableStateChanged();
        r0 = r14.k;
        r2 = r14.getFirstVisiblePosition();
        r0 = r0 - r2;
        r0 = r14.getChildAt(r0);
        if (r0 == 0) goto L_0x002b;
    L_0x0027:
        r2 = 0;
        r0.setPressed(r2);
    L_0x002b:
        r0 = r14.f3291d;
        if (r0 == 0) goto L_0x0037;
    L_0x002f:
        r0 = r14.f3291d;
        r0.m1998a();
        r0 = 0;
        r14.f3291d = r0;
    L_0x0037:
        if (r1 == 0) goto L_0x0187;
    L_0x0039:
        r0 = r14.f3292e;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new android.support.v4.widget.am;
        r0.<init>(r14);
        r14.f3292e = r0;
    L_0x0044:
        r0 = r14.f3292e;
        r2 = 1;
        r0.m2148a(r2);
        r0 = r14.f3292e;
        r0.onTouch(r14, r15);
    L_0x004f:
        return r1;
    L_0x0050:
        r0 = 0;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x000c;
    L_0x0055:
        r0 = 0;
    L_0x0056:
        r2 = r15.findPointerIndex(r16);
        if (r2 >= 0) goto L_0x0061;
    L_0x005c:
        r0 = 0;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x000c;
    L_0x0061:
        r4 = r15.getX(r2);
        r4 = (int) r4;
        r2 = r15.getY(r2);
        r2 = (int) r2;
        r5 = r14.pointToPosition(r4, r2);
        r6 = -1;
        if (r5 != r6) goto L_0x0077;
    L_0x0072:
        r1 = 1;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x000c;
    L_0x0077:
        r0 = r14.getFirstVisiblePosition();
        r0 = r5 - r0;
        r6 = r14.getChildAt(r0);
        r4 = (float) r4;
        r7 = (float) r2;
        r0 = 1;
        r14.f3290c = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r0 < r2) goto L_0x008f;
    L_0x008c:
        r14.drawableHotspotChanged(r4, r7);
    L_0x008f:
        r0 = r14.isPressed();
        if (r0 != 0) goto L_0x0099;
    L_0x0095:
        r0 = 1;
        r14.setPressed(r0);
    L_0x0099:
        r14.layoutChildren();
        r0 = r14.k;
        r2 = -1;
        if (r0 == r2) goto L_0x00ba;
    L_0x00a1:
        r0 = r14.k;
        r2 = r14.getFirstVisiblePosition();
        r0 = r0 - r2;
        r0 = r14.getChildAt(r0);
        if (r0 == 0) goto L_0x00ba;
    L_0x00ae:
        if (r0 == r6) goto L_0x00ba;
    L_0x00b0:
        r2 = r0.isPressed();
        if (r2 == 0) goto L_0x00ba;
    L_0x00b6:
        r2 = 0;
        r0.setPressed(r2);
    L_0x00ba:
        r14.k = r5;
        r0 = r6.getLeft();
        r0 = (float) r0;
        r0 = r4 - r0;
        r2 = r6.getTop();
        r2 = (float) r2;
        r2 = r7 - r2;
        r8 = android.os.Build.VERSION.SDK_INT;
        r9 = 21;
        if (r8 < r9) goto L_0x00d3;
    L_0x00d0:
        r6.drawableHotspotChanged(r0, r2);
    L_0x00d3:
        r0 = r6.isPressed();
        if (r0 != 0) goto L_0x00dd;
    L_0x00d9:
        r0 = 1;
        r6.setPressed(r0);
    L_0x00dd:
        r8 = r14.getSelector();
        if (r8 == 0) goto L_0x0178;
    L_0x00e3:
        r0 = -1;
        if (r5 == r0) goto L_0x0178;
    L_0x00e6:
        r0 = 1;
        r2 = r0;
    L_0x00e8:
        if (r2 == 0) goto L_0x00ef;
    L_0x00ea:
        r0 = 0;
        r9 = 0;
        r8.setVisible(r0, r9);
    L_0x00ef:
        r0 = r14.f3280f;
        r9 = r6.getLeft();
        r10 = r6.getTop();
        r11 = r6.getRight();
        r12 = r6.getBottom();
        r0.set(r9, r10, r11, r12);
        r9 = r0.left;
        r10 = r14.f3281g;
        r9 = r9 - r10;
        r0.left = r9;
        r9 = r0.top;
        r10 = r14.f3282h;
        r9 = r9 - r10;
        r0.top = r9;
        r9 = r0.right;
        r10 = r14.f3283i;
        r9 = r9 + r10;
        r0.right = r9;
        r9 = r0.bottom;
        r10 = r14.f3284j;
        r9 = r9 + r10;
        r0.bottom = r9;
        r0 = r14.f3286l;	 Catch:{ IllegalAccessException -> 0x017e }
        r0 = r0.getBoolean(r14);	 Catch:{ IllegalAccessException -> 0x017e }
        r9 = r6.isEnabled();	 Catch:{ IllegalAccessException -> 0x017e }
        if (r9 == r0) goto L_0x013e;
    L_0x012c:
        r9 = r14.f3286l;	 Catch:{ IllegalAccessException -> 0x017e }
        if (r0 != 0) goto L_0x017c;
    L_0x0130:
        r0 = 1;
    L_0x0131:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IllegalAccessException -> 0x017e }
        r9.set(r14, r0);	 Catch:{ IllegalAccessException -> 0x017e }
        r0 = -1;
        if (r5 == r0) goto L_0x013e;
    L_0x013b:
        r14.refreshDrawableState();	 Catch:{ IllegalAccessException -> 0x017e }
    L_0x013e:
        if (r2 == 0) goto L_0x0158;
    L_0x0140:
        r0 = r14.f3280f;
        r2 = r0.exactCenterX();
        r9 = r0.exactCenterY();
        r0 = r14.getVisibility();
        if (r0 != 0) goto L_0x0185;
    L_0x0150:
        r0 = 1;
    L_0x0151:
        r10 = 0;
        r8.setVisible(r0, r10);
        android.support.v4.p013b.p014a.C0259a.m1513a(r8, r2, r9);
    L_0x0158:
        r0 = r14.getSelector();
        if (r0 == 0) goto L_0x0164;
    L_0x015e:
        r2 = -1;
        if (r5 == r2) goto L_0x0164;
    L_0x0161:
        android.support.v4.p013b.p014a.C0259a.m1513a(r0, r4, r7);
    L_0x0164:
        r0 = 0;
        r14.setSelectorEnabled(r0);
        r14.refreshDrawableState();
        r0 = 1;
        r2 = 1;
        if (r3 != r2) goto L_0x0009;
    L_0x016f:
        r2 = r14.getItemIdAtPosition(r5);
        r14.performItemClick(r6, r5, r2);
        goto L_0x0009;
    L_0x0178:
        r0 = 0;
        r2 = r0;
        goto L_0x00e8;
    L_0x017c:
        r0 = 0;
        goto L_0x0131;
    L_0x017e:
        r0 = move-exception;
        r9 = com.google.c.a.a.a.a.a.a;
        r9.a(r0);
        goto L_0x013e;
    L_0x0185:
        r0 = 0;
        goto L_0x0151;
    L_0x0187:
        r0 = r14.f3292e;
        if (r0 == 0) goto L_0x004f;
    L_0x018b:
        r0 = r14.f3292e;
        r2 = 0;
        r0.m2148a(r2);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ck.a(android.view.MotionEvent, int):boolean");
    }

    protected final boolean mo786a() {
        return this.f3290c || super.mo786a();
    }

    public boolean isInTouchMode() {
        return (this.f3289b && this.f3288a) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f3289b || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3289b || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f3289b || super.hasFocus();
    }
}
