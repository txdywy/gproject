package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class dn extends fl {
    public final LinearInterpolator f3403a = new LinearInterpolator();
    public final DecelerateInterpolator f3404b = new DecelerateInterpolator();
    public PointF f3405c;
    public final float f3406d;
    public int f3407e = 0;
    public int f3408f = 0;

    public dn(Context context) {
        this.f3406d = mo3051a(context.getResources().getDisplayMetrics());
    }

    public void mo815a() {
    }

    public void mo817a(View view, fo foVar, fm fmVar) {
        int i = (this.f3405c == null || this.f3405c.x == 0.0f) ? 0 : this.f3405c.x > 0.0f ? 1 : -1;
        i = mo4255b(view, i);
        int a = mo3052a(view, mo5195c());
        int ceil = (int) Math.ceil(((double) m3520b((int) Math.sqrt((double) ((i * i) + (a * a))))) / 0.3356d);
        if (ceil > 0) {
            fmVar.m3703a(-i, -a, ceil, this.f3404b);
        }
    }

    protected final void mo816a(int i, int i2, fm fmVar) {
        if (m3518e() == 0) {
            m3517d();
            return;
        }
        this.f3407e = m3519a(this.f3407e, i);
        this.f3408f = m3519a(this.f3408f, i2);
        if (this.f3407e == 0 && this.f3408f == 0) {
            PointF a = mo5194a(this.f3396g);
            if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
                fmVar.f3460d = this.f3396g;
                m3517d();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((a.x * a.x) + (a.y * a.y)));
            a.x /= sqrt;
            a.y /= sqrt;
            this.f3405c = a;
            this.f3407e = (int) (a.x * 10000.0f);
            this.f3408f = (int) (a.y * 10000.0f);
            fmVar.m3703a((int) (((float) this.f3407e) * 1.2f), (int) (((float) this.f3408f) * 1.2f), (int) (((float) m3520b(10000)) * 1.2f), this.f3403a);
        }
    }

    public void mo818b() {
        this.f3408f = 0;
        this.f3407e = 0;
        this.f3405c = null;
    }

    public float mo3051a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    private final int m3520b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f3406d));
    }

    public int mo5195c() {
        if (this.f3405c == null || this.f3405c.y == 0.0f) {
            return 0;
        }
        return this.f3405c.y > 0.0f ? 1 : -1;
    }

    private static int m3519a(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public int mo5193a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                int i6 = i3 - i;
                if (i6 > 0) {
                    return i6;
                }
                i6 = i4 - i2;
                return i6 >= 0 ? 0 : i6;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int mo3052a(View view, int i) {
        ew ewVar = this.f3398i;
        if (ewVar == null || !ewVar.mo747f()) {
            return 0;
        }
        fa faVar = (fa) view.getLayoutParams();
        return mo5193a(ew.m2988f(view) - faVar.topMargin, ew.m2990h(view) + faVar.bottomMargin, ewVar.getPaddingTop(), ewVar.f2958N - ewVar.getPaddingBottom(), i);
    }

    public int mo4255b(View view, int i) {
        ew ewVar = this.f3398i;
        if (ewVar == null || !ewVar.mo745e()) {
            return 0;
        }
        fa faVar = (fa) view.getLayoutParams();
        return mo5193a(ew.m2987e(view) - faVar.leftMargin, ew.m2989g(view) + faVar.rightMargin, ewVar.getPaddingLeft(), ewVar.f2957M - ewVar.getPaddingRight(), i);
    }

    public PointF mo5194a(int i) {
        ew ewVar = this.f3398i;
        if (ewVar instanceof fn) {
            return ((fn) ewVar).mo738c(i);
        }
        Log.w("LinearSmoothScroller", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + fn.class.getCanonicalName());
        return null;
    }
}
