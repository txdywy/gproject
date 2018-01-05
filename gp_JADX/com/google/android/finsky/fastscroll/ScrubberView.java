package com.google.android.finsky.fastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.vending.C0629a;
import com.google.android.finsky.headerlistlayout.C3102k;
import com.google.android.finsky.providers.C3947d;

public class ScrubberView extends FrameLayout implements C3102k {
    public C3115l f16048a;
    public C3119o f16049b;
    public C3118n f16050c;
    public int f16051d;
    public boolean f16052e;

    public ScrubberView(Context context) {
        this(context, null);
    }

    public ScrubberView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrubberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.ScrubberView);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                this.f16051d = obtainStyledAttributes.getInteger(0, 0);
                this.f16052e = obtainStyledAttributes.getBoolean(1, false);
                return;
            }
            throw new RuntimeException("ScrubberView doesn't have required attribute finsky:fastScrollModel");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onFinishInflate() {
        ((C1384a) C3947d.m18649a(C1384a.class)).mo1839a(this);
        super.onFinishInflate();
        this.f16050c = new C3118n(this, this.f16051d, this.f16052e, this.f16048a.f16070a);
        this.f16049b = new C3119o(this, this.f16048a.f16070a);
        setWillNotDraw(false);
        refreshDrawableState();
    }

    public C3118n getConfigurator() {
        return this.f16050c;
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        this.f16049b.m15971a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        r10 = this;
        r8 = 2;
        r0 = 0;
        r2 = 0;
        r3 = 1;
        r4 = r10.f16049b;
        r1 = r4.f16097r;
        if (r1 == 0) goto L_0x000e;
    L_0x000a:
        r1 = r4.f16102w;
        if (r1 != 0) goto L_0x0019;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r0 = super.onTouchEvent(r11);
        if (r0 == 0) goto L_0x0123;
    L_0x0017:
        r0 = r3;
    L_0x0018:
        return r0;
    L_0x0019:
        r1 = r4.f16083d;
        r1 = r1.dj();
        r6 = 12638391; // 0xc0d8b7 float:1.7710158E-38 double:6.244195E-317;
        r5 = r1.mo2294a(r6);
        r1 = r11.getAction();
        switch(r1) {
            case 0: goto L_0x002f;
            case 1: goto L_0x0059;
            case 2: goto L_0x00ad;
            case 3: goto L_0x0118;
            default: goto L_0x002d;
        };
    L_0x002d:
        r0 = r2;
        goto L_0x000f;
    L_0x002f:
        r0 = r4.m15977b(r11);
        if (r0 == 0) goto L_0x002d;
    L_0x0035:
        r4.m15972a(r8);
        r0 = r11.getY();
        r4.f16094o = r0;
        r1 = r4.f16100u;
        if (r5 == 0) goto L_0x0056;
    L_0x0042:
        r0 = r4.f16102w;
        r0 = r0.mo3319c();
    L_0x0048:
        r1.mo3323a(r0);
        r0 = r4.f16099t;
        r0 = r0.getParent();
        r0.requestDisallowInterceptTouchEvent(r3);
        r0 = r3;
        goto L_0x000f;
    L_0x0056:
        r0 = r4.f16093n;
        goto L_0x0048;
    L_0x0059:
        r0 = r4.f16097r;
        if (r0 != r8) goto L_0x002d;
    L_0x005d:
        r0 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        r0 = r11.isFromSource(r0);
        if (r0 == 0) goto L_0x00a3;
    L_0x0065:
        r0 = r11.getX();
        r1 = r11.getY();
        r0 = r4.m15974a(r0, r1);
        if (r0 == 0) goto L_0x00a3;
    L_0x0073:
        r0 = 3;
        r4.m15972a(r0);
    L_0x0077:
        if (r5 == 0) goto L_0x00a7;
    L_0x0079:
        r0 = r4.f16102w;
        r0 = r0.mo3319c();
        r1 = r0;
    L_0x0080:
        r0 = r4.f16102w;
        r0 = r0 instanceof com.google.android.finsky.fastscroll.C3106e;
        if (r0 == 0) goto L_0x00ab;
    L_0x0086:
        if (r5 == 0) goto L_0x00ab;
    L_0x0088:
        r0 = r4.f16102w;
        r0 = (com.google.android.finsky.fastscroll.C3106e) r0;
        r0 = r0.f16057a;
        r0 = com.google.android.finsky.fastscroll.C3106e.m15916a(r0);
    L_0x0092:
        r5 = r4.f16100u;
        r5.mo3324a(r1, r0);
        r0 = r4.f16099t;
        r0 = r0.getParent();
        r0.requestDisallowInterceptTouchEvent(r2);
        r0 = r3;
        goto L_0x000f;
    L_0x00a3:
        r4.m15972a(r3);
        goto L_0x0077;
    L_0x00a7:
        r0 = r4.f16093n;
        r1 = r0;
        goto L_0x0080;
    L_0x00ab:
        r0 = r1;
        goto L_0x0092;
    L_0x00ad:
        r1 = r4.f16097r;
        if (r1 != r8) goto L_0x002d;
    L_0x00b1:
        r1 = r11.getY();
        r6 = r4.f16094o;
        r1 = r1 - r6;
        r1 = java.lang.Math.abs(r1);
        r6 = r4.f16092m;
        r6 = (float) r6;
        r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r1 >= 0) goto L_0x00c6;
    L_0x00c3:
        r0 = r3;
        goto L_0x000f;
    L_0x00c6:
        r6 = r4.f16102w;
        r7 = r11.getY();
        r1 = r4.f16101v;
        if (r1 != 0) goto L_0x00e8;
    L_0x00d0:
        r6.mo3314a(r0);
        r1 = r4.f16100u;
        if (r5 == 0) goto L_0x0115;
    L_0x00d7:
        r0 = r4.f16102w;
        r0 = r0.mo3319c();
    L_0x00dd:
        r1.mo3325b(r0);
        r0 = r4.f16099t;
        r0.invalidate();
        r0 = r3;
        goto L_0x000f;
    L_0x00e8:
        r1 = r4.f16101v;
        r8 = r1.mo3327a();
        r1 = r4.f16093n;
        r9 = r4.f16094o;
        r9 = r7 - r9;
        r1 = r1 + r9;
        r9 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r9 >= 0) goto L_0x0106;
    L_0x00f9:
        r4.f16093n = r0;
        r4.f16094o = r7;
        r0 = r4.f16093n;
        r1 = r4.f16087h;
        r1 = r8 - r1;
        r1 = (float) r1;
        r0 = r0 / r1;
        goto L_0x00d0;
    L_0x0106:
        r0 = r4.f16087h;
        r0 = (float) r0;
        r0 = r0 + r1;
        r9 = (float) r8;
        r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r0 <= 0) goto L_0x0126;
    L_0x010f:
        r0 = r4.f16087h;
        r0 = r8 - r0;
        r0 = (float) r0;
        goto L_0x00f9;
    L_0x0115:
        r0 = r4.f16093n;
        goto L_0x00dd;
    L_0x0118:
        r0 = r4.f16099t;
        r0 = r0.getParent();
        r0.requestDisallowInterceptTouchEvent(r2);
        goto L_0x002d;
    L_0x0123:
        r0 = r2;
        goto L_0x0018;
    L_0x0126:
        r0 = r1;
        goto L_0x00f9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.fastscroll.ScrubberView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f16049b.m15975a(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        C3119o c3119o = this.f16049b;
        if (motionEvent.isFromSource(2) && motionEvent.getAction() == 7 && c3119o.f16097r != 2) {
            if (c3119o.m15974a(motionEvent.getX(), motionEvent.getY())) {
                if (!(c3119o.f16097r == 3 || c3119o.f16102w == null || !c3119o.f16102w.mo3316a())) {
                    c3119o.m15972a(3);
                }
            } else if (c3119o.f16097r == 3) {
                c3119o.m15972a(1);
            }
        }
        if (super.onInterceptHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        C3119o c3119o = this.f16049b;
        if (c3119o.f16097r != 0 && c3119o.f16102w != null && c3119o.f16101v != null && c3119o.f16086g != null) {
            int e = c3119o.m15980e();
            c3119o.f16086g.setBounds((int) c3119o.m15979d(), e, (int) c3119o.m15978c(), c3119o.f16087h + e);
            canvas.save();
            c3119o.f16086g.draw(canvas);
            canvas.restore();
            c3119o.f16095p = e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3313a(android.view.MotionEvent r7, android.view.ViewGroup r8) {
        /*
        r6 = this;
        r0 = 0;
        r3 = r6.f16049b;
        r1 = r3.f16099t;
        r2 = r1;
        r1 = r0;
    L_0x0007:
        r4 = r2.getLeft();
        r4 = (float) r4;
        r1 = r1 - r4;
        r4 = r2.getTop();
        r4 = (float) r4;
        r4 = r0 - r4;
        r0 = r2.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0022;
    L_0x001c:
        r0 = 0;
        r1 = r0;
    L_0x001e:
        if (r1 != 0) goto L_0x0039;
    L_0x0020:
        r0 = 0;
    L_0x0021:
        return r0;
    L_0x0022:
        r2 = r0.getScrollX();
        r2 = (float) r2;
        r2 = r2 + r1;
        r1 = r0.getScrollY();
        r1 = (float) r1;
        r1 = r1 + r4;
        if (r0 != r8) goto L_0x0041;
    L_0x0030:
        r0 = android.view.MotionEvent.obtain(r7);
        r0.offsetLocation(r2, r1);
        r1 = r0;
        goto L_0x001e;
    L_0x0039:
        r0 = r3.m15975a(r1);
        r1.recycle();
        goto L_0x0021;
    L_0x0041:
        r5 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.fastscroll.ScrubberView.a(android.view.MotionEvent, android.view.ViewGroup):boolean");
    }
}
