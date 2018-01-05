package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

final class aa implements Runnable {
    public final /* synthetic */ C0393z f2059a;

    aa(C0393z c0393z) {
        this.f2059a = c0393z;
    }

    public final void run() {
        View view;
        int i;
        int i2 = 0;
        C0393z c0393z = this.f2059a;
        int i3 = c0393z.f2195b.f2132o;
        boolean z = c0393z.f2194a == 3;
        int i4;
        if (z) {
            View a = c0393z.f2197d.m2095a(3);
            if (a != null) {
                i4 = -a.getWidth();
            } else {
                i4 = 0;
            }
            i4 += i3;
            view = a;
            i = i4;
        } else {
            i4 = c0393z.f2197d.getWidth() - i3;
            view = c0393z.f2197d.m2095a(5);
            i = i4;
        }
        if (view == null) {
            return;
        }
        if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && c0393z.f2197d.m2094a(view) == 0) {
            C0391x c0391x = (C0391x) view.getLayoutParams();
            c0393z.f2195b.m2262a(view, i, view.getTop());
            c0391x.f2192c = true;
            c0393z.f2197d.invalidate();
            c0393z.m2304c();
            DrawerLayout drawerLayout = c0393z.f2197d;
            if (!drawerLayout.f1966v) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                i = drawerLayout.getChildCount();
                while (i2 < i) {
                    drawerLayout.getChildAt(i2).dispatchTouchEvent(obtain);
                    i2++;
                }
                obtain.recycle();
                drawerLayout.f1966v = true;
            }
        }
    }
}
