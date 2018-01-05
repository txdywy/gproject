package android.support.v4.widget;

import android.os.SystemClock;
import android.support.v4.view.ai;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

final class C0372c implements Runnable {
    public final /* synthetic */ C0368a f2141a;

    C0372c(C0368a c0368a) {
        this.f2141a = c0368a;
    }

    public final void run() {
        if (this.f2141a.f2056o) {
            boolean z;
            if (this.f2141a.f2054m) {
                this.f2141a.f2054m = false;
                C0371b c0371b = this.f2141a.f2042a;
                c0371b.f2102e = AnimationUtils.currentAnimationTimeMillis();
                c0371b.f2105h = -1;
                c0371b.f2103f = c0371b.f2102e;
                c0371b.f2106i = 0.5f;
                c0371b.f2104g = 0;
            }
            C0371b c0371b2 = this.f2141a.f2042a;
            if (c0371b2.f2105h <= 0 || AnimationUtils.currentAnimationTimeMillis() <= c0371b2.f2105h + ((long) c0371b2.f2107j)) {
                z = false;
            } else {
                z = true;
            }
            if (z || !this.f2141a.m2150a()) {
                this.f2141a.f2056o = false;
                return;
            }
            long uptimeMillis;
            if (this.f2141a.f2055n) {
                this.f2141a.f2055n = false;
                C0368a c0368a = this.f2141a;
                uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                c0368a.f2044c.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (c0371b2.f2103f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            uptimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = c0371b2.m2218a(uptimeMillis);
            a = (a * 4.0f) + ((-4.0f * a) * a);
            long j = uptimeMillis - c0371b2.f2103f;
            c0371b2.f2103f = uptimeMillis;
            c0371b2.f2104g = (int) ((((float) j) * a) * c0371b2.f2101d);
            this.f2141a.mo464a(c0371b2.f2104g);
            ai.m1830a(this.f2141a.f2044c, (Runnable) this);
        }
    }
}
