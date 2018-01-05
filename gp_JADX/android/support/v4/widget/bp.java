package android.support.v4.widget;

import android.content.Context;
import android.support.v4.view.ai;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

public final class bp {
    public static final Interpolator f2117v = new bq();
    public int f2118a;
    public int f2119b;
    public int f2120c = -1;
    public float[] f2121d;
    public float[] f2122e;
    public float[] f2123f;
    public float[] f2124g;
    public int[] f2125h;
    public int[] f2126i;
    public int[] f2127j;
    public int f2128k;
    public VelocityTracker f2129l;
    public float f2130m;
    public float f2131n;
    public int f2132o;
    public int f2133p;
    public OverScroller f2134q;
    public final bs f2135r;
    public View f2136s;
    public boolean f2137t;
    public final ViewGroup f2138u;
    public final Runnable f2139w = new br(this);

    public static bp m2244a(ViewGroup viewGroup, bs bsVar) {
        return new bp(viewGroup.getContext(), viewGroup, bsVar);
    }

    public static bp m2243a(ViewGroup viewGroup, float f, bs bsVar) {
        bp a = m2244a(viewGroup, bsVar);
        a.f2119b = (int) (((float) a.f2119b) * (1.0f / f));
        return a;
    }

    private bp(Context context, ViewGroup viewGroup, bs bsVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (bsVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f2138u = viewGroup;
            this.f2135r = bsVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f2132o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2119b = viewConfiguration.getScaledTouchSlop();
            this.f2130m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f2131n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f2134q = new OverScroller(context, f2117v);
        }
    }

    public final void m2258a(View view, int i) {
        if (view.getParent() != this.f2138u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2138u + ")");
        }
        this.f2136s = view;
        this.f2120c = i;
        this.f2135r.mo177e(view, i);
        m2264b(1);
    }

    public final void m2257a() {
        this.f2120c = -1;
        if (this.f2121d != null) {
            Arrays.fill(this.f2121d, 0.0f);
            Arrays.fill(this.f2122e, 0.0f);
            Arrays.fill(this.f2123f, 0.0f);
            Arrays.fill(this.f2124g, 0.0f);
            Arrays.fill(this.f2125h, 0);
            Arrays.fill(this.f2126i, 0);
            Arrays.fill(this.f2127j, 0);
            this.f2128k = 0;
        }
        if (this.f2129l != null) {
            this.f2129l.recycle();
            this.f2129l = null;
        }
    }

    public final boolean m2262a(View view, int i, int i2) {
        this.f2136s = view;
        this.f2120c = -1;
        boolean a = m2248a(i, i2, 0, 0);
        if (!(a || this.f2118a != 0 || this.f2136s == null)) {
            this.f2136s = null;
        }
        return a;
    }

    public final boolean m2260a(int i, int i2) {
        if (this.f2137t) {
            return m2248a(i, i2, (int) this.f2129l.getXVelocity(this.f2120c), (int) this.f2129l.getYVelocity(this.f2120c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    private final boolean m2248a(int i, int i2, int i3, int i4) {
        int left = this.f2136s.getLeft();
        int top = this.f2136s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f2134q.abortAnimation();
            m2264b(0);
            return false;
        }
        View view = this.f2136s;
        int b = m2250b(i3, (int) this.f2131n, (int) this.f2130m);
        int b2 = m2250b(i4, (int) this.f2131n, (int) this.f2130m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        this.f2134q.startScroll(left, top, i5, i6, (int) (((b2 != 0 ? ((float) abs4) / ((float) i7) : ((float) abs2) / ((float) i8)) * ((float) m2242a(i6, b2, this.f2135r.mo196a()))) + ((b != 0 ? ((float) abs3) / ((float) i7) : ((float) abs) / ((float) i8)) * ((float) m2242a(i5, b, this.f2135r.mo170a(view))))));
        m2264b(2);
        return true;
    }

    private final int m2242a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f2138u.getWidth();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * ((float) i4)) + ((float) i4);
        i4 = Math.abs(i2);
        if (i4 > 0) {
            width = Math.round(Math.abs(sin / ((float) i4)) * 1000.0f) * 4;
        } else {
            width = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(width, 600);
    }

    private static int m2250b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            return -i3;
        }
        return i3;
    }

    private static float m2241a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            return -f3;
        }
        return f3;
    }

    public final boolean m2266b() {
        if (this.f2118a == 2) {
            boolean computeScrollOffset = this.f2134q.computeScrollOffset();
            int currX = this.f2134q.getCurrX();
            int currY = this.f2134q.getCurrY();
            int left = currX - this.f2136s.getLeft();
            int top = currY - this.f2136s.getTop();
            if (left != 0) {
                ai.m1847e(this.f2136s, left);
            }
            if (top != 0) {
                ai.m1844d(this.f2136s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f2135r.mo174b(this.f2136s, currX);
            }
            if (computeScrollOffset && currX == this.f2134q.getFinalX() && currY == this.f2134q.getFinalY()) {
                this.f2134q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f2138u.post(this.f2139w);
            }
        }
        if (this.f2118a == 2) {
            return true;
        }
        return false;
    }

    private final void m2245a(float f, float f2) {
        this.f2137t = true;
        this.f2135r.mo172a(this.f2136s, f, f2);
        this.f2137t = false;
        if (this.f2118a == 1) {
            m2264b(0);
        }
    }

    private final void m2254c(int i) {
        if (this.f2121d != null && m2259a(i)) {
            this.f2121d[i] = 0.0f;
            this.f2122e[i] = 0.0f;
            this.f2123f[i] = 0.0f;
            this.f2124g[i] = 0.0f;
            this.f2125h[i] = 0;
            this.f2126i[i] = 0;
            this.f2127j[i] = 0;
            this.f2128k &= (1 << i) ^ -1;
        }
    }

    private final void m2246a(float f, float f2, int i) {
        int i2 = 0;
        if (this.f2121d == null || this.f2121d.length <= i) {
            Object obj = new float[(i + 1)];
            Object obj2 = new float[(i + 1)];
            Object obj3 = new float[(i + 1)];
            Object obj4 = new float[(i + 1)];
            Object obj5 = new int[(i + 1)];
            Object obj6 = new int[(i + 1)];
            Object obj7 = new int[(i + 1)];
            if (this.f2121d != null) {
                System.arraycopy(this.f2121d, 0, obj, 0, this.f2121d.length);
                System.arraycopy(this.f2122e, 0, obj2, 0, this.f2122e.length);
                System.arraycopy(this.f2123f, 0, obj3, 0, this.f2123f.length);
                System.arraycopy(this.f2124g, 0, obj4, 0, this.f2124g.length);
                System.arraycopy(this.f2125h, 0, obj5, 0, this.f2125h.length);
                System.arraycopy(this.f2126i, 0, obj6, 0, this.f2126i.length);
                System.arraycopy(this.f2127j, 0, obj7, 0, this.f2127j.length);
            }
            this.f2121d = obj;
            this.f2122e = obj2;
            this.f2123f = obj3;
            this.f2124g = obj4;
            this.f2125h = obj5;
            this.f2126i = obj6;
            this.f2127j = obj7;
        }
        float[] fArr = this.f2121d;
        this.f2123f[i] = f;
        fArr[i] = f;
        fArr = this.f2122e;
        this.f2124g[i] = f2;
        fArr[i] = f2;
        int[] iArr = this.f2125h;
        int i3 = (int) f;
        int i4 = (int) f2;
        if (i3 < this.f2138u.getLeft() + this.f2132o) {
            i2 = 1;
        }
        if (i4 < this.f2138u.getTop() + this.f2132o) {
            i2 |= 4;
        }
        if (i3 > this.f2138u.getRight() - this.f2132o) {
            i2 |= 2;
        }
        if (i4 > this.f2138u.getBottom() - this.f2132o) {
            i2 |= 8;
        }
        iArr[i] = i2;
        this.f2128k |= 1 << i;
    }

    private final void m2255c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m2256d(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f2123f[pointerId] = x;
                this.f2124g[pointerId] = y;
            }
        }
    }

    public final boolean m2259a(int i) {
        return (this.f2128k & (1 << i)) != 0;
    }

    final void m2264b(int i) {
        this.f2138u.removeCallbacks(this.f2139w);
        if (this.f2118a != i) {
            this.f2118a = i;
            this.f2135r.mo171a(i);
            if (this.f2118a == 0) {
                this.f2136s = null;
            }
        }
    }

    private final boolean m2252b(View view, int i) {
        if (view == this.f2136s && this.f2120c == i) {
            return true;
        }
        if (view == null || !this.f2135r.mo173a(view, i)) {
            return false;
        }
        this.f2120c = i;
        m2258a(view, i);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2261a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r0 = r14.getActionMasked();
        r1 = r14.getActionIndex();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r13.m2257a();
    L_0x000d:
        r2 = r13.f2129l;
        if (r2 != 0) goto L_0x0017;
    L_0x0011:
        r2 = android.view.VelocityTracker.obtain();
        r13.f2129l = r2;
    L_0x0017:
        r2 = r13.f2129l;
        r2.addMovement(r14);
        switch(r0) {
            case 0: goto L_0x0026;
            case 1: goto L_0x011f;
            case 2: goto L_0x008c;
            case 3: goto L_0x011f;
            case 4: goto L_0x001f;
            case 5: goto L_0x0057;
            case 6: goto L_0x0116;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = r13.f2118a;
        r1 = 1;
        if (r0 != r1) goto L_0x0124;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = r14.getX();
        r1 = r14.getY();
        r2 = 0;
        r2 = r14.getPointerId(r2);
        r13.m2246a(r0, r1, r2);
        r0 = (int) r0;
        r1 = (int) r1;
        r0 = r13.m2263b(r0, r1);
        r1 = r13.f2136s;
        if (r0 != r1) goto L_0x0048;
    L_0x0040:
        r1 = r13.f2118a;
        r3 = 2;
        if (r1 != r3) goto L_0x0048;
    L_0x0045:
        r13.m2252b(r0, r2);
    L_0x0048:
        r0 = r13.f2125h;
        r0 = r0[r2];
        r1 = r13.f2133p;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0051:
        r0 = r13.f2135r;
        r0.mo488d();
        goto L_0x001f;
    L_0x0057:
        r0 = r14.getPointerId(r1);
        r2 = r14.getX(r1);
        r1 = r14.getY(r1);
        r13.m2246a(r2, r1, r0);
        r3 = r13.f2118a;
        if (r3 != 0) goto L_0x0079;
    L_0x006a:
        r1 = r13.f2125h;
        r0 = r1[r0];
        r1 = r13.f2133p;
        r0 = r0 & r1;
        if (r0 == 0) goto L_0x001f;
    L_0x0073:
        r0 = r13.f2135r;
        r0.mo488d();
        goto L_0x001f;
    L_0x0079:
        r3 = r13.f2118a;
        r4 = 2;
        if (r3 != r4) goto L_0x001f;
    L_0x007e:
        r2 = (int) r2;
        r1 = (int) r1;
        r1 = r13.m2263b(r2, r1);
        r2 = r13.f2136s;
        if (r1 != r2) goto L_0x001f;
    L_0x0088:
        r13.m2252b(r1, r0);
        goto L_0x001f;
    L_0x008c:
        r0 = r13.f2121d;
        if (r0 == 0) goto L_0x001f;
    L_0x0090:
        r0 = r13.f2122e;
        if (r0 == 0) goto L_0x001f;
    L_0x0094:
        r2 = r14.getPointerCount();
        r0 = 0;
        r1 = r0;
    L_0x009a:
        if (r1 >= r2) goto L_0x0111;
    L_0x009c:
        r3 = r14.getPointerId(r1);
        r0 = r13.m2256d(r3);
        if (r0 == 0) goto L_0x010b;
    L_0x00a6:
        r0 = r14.getX(r1);
        r4 = r14.getY(r1);
        r5 = r13.f2121d;
        r5 = r5[r3];
        r5 = r0 - r5;
        r6 = r13.f2122e;
        r6 = r6[r3];
        r6 = r4 - r6;
        r0 = (int) r0;
        r4 = (int) r4;
        r4 = r13.m2263b(r0, r4);
        if (r4 == 0) goto L_0x010f;
    L_0x00c2:
        r0 = r13.m2249a(r4, r5, r6);
        if (r0 == 0) goto L_0x010f;
    L_0x00c8:
        r0 = 1;
    L_0x00c9:
        if (r0 == 0) goto L_0x00fb;
    L_0x00cb:
        r7 = r4.getLeft();
        r8 = (int) r5;
        r8 = r8 + r7;
        r9 = r13.f2135r;
        r8 = r9.mo176d(r4, r8);
        r9 = r4.getTop();
        r10 = (int) r6;
        r10 = r10 + r9;
        r11 = r13.f2135r;
        r10 = r11.mo175c(r4, r10);
        r11 = r13.f2135r;
        r11 = r11.mo170a(r4);
        r12 = r13.f2135r;
        r12 = r12.mo196a();
        if (r11 == 0) goto L_0x00f5;
    L_0x00f1:
        if (r11 <= 0) goto L_0x00fb;
    L_0x00f3:
        if (r8 != r7) goto L_0x00fb;
    L_0x00f5:
        if (r12 == 0) goto L_0x0111;
    L_0x00f7:
        if (r12 <= 0) goto L_0x00fb;
    L_0x00f9:
        if (r10 == r9) goto L_0x0111;
    L_0x00fb:
        r13.m2251b(r5, r6, r3);
        r5 = r13.f2118a;
        r6 = 1;
        if (r5 == r6) goto L_0x0111;
    L_0x0103:
        if (r0 == 0) goto L_0x010b;
    L_0x0105:
        r0 = r13.m2252b(r4, r3);
        if (r0 != 0) goto L_0x0111;
    L_0x010b:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x009a;
    L_0x010f:
        r0 = 0;
        goto L_0x00c9;
    L_0x0111:
        r13.m2255c(r14);
        goto L_0x001f;
    L_0x0116:
        r0 = r14.getPointerId(r1);
        r13.m2254c(r0);
        goto L_0x001f;
    L_0x011f:
        r13.m2257a();
        goto L_0x001f;
    L_0x0124:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.bp.a(android.view.MotionEvent):boolean");
    }

    public final void m2265b(MotionEvent motionEvent) {
        int i = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m2257a();
        }
        if (this.f2129l == null) {
            this.f2129l = VelocityTracker.obtain();
        }
        this.f2129l.addMovement(motionEvent);
        float x;
        int pointerCount;
        float x2;
        int y;
        switch (actionMasked) {
            case 0:
                x = motionEvent.getX();
                float y2 = motionEvent.getY();
                i = motionEvent.getPointerId(0);
                View b = m2263b((int) x, (int) y2);
                m2246a(x, y2, i);
                m2252b(b, i);
                if ((this.f2125h[i] & this.f2133p) != 0) {
                    this.f2135r.mo488d();
                    return;
                }
                return;
            case 1:
                if (this.f2118a == 1) {
                    m2253c();
                }
                m2257a();
                return;
            case 2:
                if (this.f2118a != 1) {
                    pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        actionMasked = motionEvent.getPointerId(i);
                        if (m2256d(actionMasked)) {
                            x2 = motionEvent.getX(i);
                            float y3 = motionEvent.getY(i);
                            float f = x2 - this.f2121d[actionMasked];
                            float f2 = y3 - this.f2122e[actionMasked];
                            m2251b(f, f2, actionMasked);
                            if (this.f2118a != 1) {
                                View b2 = m2263b((int) x2, (int) y3);
                                if (m2249a(b2, f, f2) && m2252b(b2, actionMasked)) {
                                }
                            }
                            m2255c(motionEvent);
                            return;
                        }
                        i++;
                    }
                    m2255c(motionEvent);
                    return;
                } else if (m2256d(this.f2120c)) {
                    i = motionEvent.findPointerIndex(this.f2120c);
                    x = motionEvent.getX(i);
                    pointerCount = (int) (x - this.f2123f[this.f2120c]);
                    y = (int) (motionEvent.getY(i) - this.f2124g[this.f2120c]);
                    i = this.f2136s.getLeft() + pointerCount;
                    actionMasked = this.f2136s.getTop() + y;
                    actionIndex = this.f2136s.getLeft();
                    int top = this.f2136s.getTop();
                    if (pointerCount != 0) {
                        i = this.f2135r.mo176d(this.f2136s, i);
                        ai.m1847e(this.f2136s, i - actionIndex);
                    }
                    if (y != 0) {
                        ai.m1844d(this.f2136s, this.f2135r.mo175c(this.f2136s, actionMasked) - top);
                    }
                    if (!(pointerCount == 0 && y == 0)) {
                        this.f2135r.mo174b(this.f2136s, i);
                    }
                    m2255c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f2118a == 1) {
                    m2245a(0.0f, 0.0f);
                }
                m2257a();
                return;
            case 5:
                pointerCount = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                x2 = motionEvent.getY(actionIndex);
                m2246a(x3, x2, pointerCount);
                if (this.f2118a == 0) {
                    m2252b(m2263b((int) x3, (int) x2), pointerCount);
                    if ((this.f2125h[pointerCount] & this.f2133p) != 0) {
                        this.f2135r.mo488d();
                        return;
                    }
                    return;
                }
                actionMasked = (int) x3;
                actionIndex = (int) x2;
                View view = this.f2136s;
                if (view != null && actionMasked >= view.getLeft() && actionMasked < view.getRight() && actionIndex >= view.getTop() && actionIndex < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    m2252b(this.f2136s, pointerCount);
                    return;
                }
                return;
            case 6:
                actionMasked = motionEvent.getPointerId(actionIndex);
                if (this.f2118a == 1 && actionMasked == this.f2120c) {
                    y = motionEvent.getPointerCount();
                    while (i < y) {
                        actionIndex = motionEvent.getPointerId(i);
                        if (actionIndex != this.f2120c) {
                            if (m2263b((int) motionEvent.getX(i), (int) motionEvent.getY(i)) == this.f2136s && m2252b(this.f2136s, actionIndex)) {
                                i = this.f2120c;
                                if (i == -1) {
                                    m2253c();
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    if (i == -1) {
                        m2253c();
                    }
                }
                m2254c(actionMasked);
                return;
            default:
                return;
        }
    }

    private final void m2251b(float f, float f2, int i) {
        int i2 = 1;
        if (!m2247a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m2247a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m2247a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m2247a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f2126i;
            iArr[i] = iArr[i] | i2;
            this.f2135r.mo487a(i2, i);
        }
    }

    private final boolean m2247a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f2125h[i] & i2) != i2 || (this.f2133p & i2) == 0 || (this.f2127j[i] & i2) == i2 || (this.f2126i[i] & i2) == i2) {
            return false;
        }
        if ((abs > ((float) this.f2119b) || abs2 > ((float) this.f2119b)) && (this.f2126i[i] & i2) == 0 && abs > ((float) this.f2119b)) {
            return true;
        }
        return false;
    }

    private final boolean m2249a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z;
        boolean z2;
        if (this.f2135r.mo170a(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f2135r.mo196a() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if ((f * f) + (f2 * f2) > ((float) (this.f2119b * this.f2119b))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f2119b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f2119b)) {
            return false;
        } else {
            return true;
        }
    }

    private final void m2253c() {
        this.f2129l.computeCurrentVelocity(1000, this.f2130m);
        m2245a(m2241a(this.f2129l.getXVelocity(this.f2120c), this.f2131n, this.f2130m), m2241a(this.f2129l.getYVelocity(this.f2120c), this.f2131n, this.f2130m));
    }

    public final View m2263b(int i, int i2) {
        for (int childCount = this.f2138u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2138u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private final boolean m2256d(int i) {
        if (m2259a(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
