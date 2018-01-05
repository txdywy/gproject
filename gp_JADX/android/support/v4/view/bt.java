package android.support.v4.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class bt {
    public WeakReference f1883a;
    public Runnable f1884b = null;
    public Runnable f1885c = null;
    public int f1886d = -1;

    bt(View view) {
        this.f1883a = new WeakReference(view);
    }

    public final bt m1994a(long j) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final bt m1993a(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final bt m1999b(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final bt m1997a(Interpolator interpolator) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final bt m2001c(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final bt m2002d(float f) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final void m1998a() {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void m2000b() {
        View view = (View) this.f1883a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final bt m1995a(bx bxVar) {
        View view = (View) this.f1883a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m1992a(view, bxVar);
            } else {
                view.setTag(2113929216, bxVar);
                m1992a(view, new bw(this));
            }
        }
        return this;
    }

    private static void m1992a(View view, bx bxVar) {
        if (bxVar != null) {
            view.animate().setListener(new bu(bxVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public final bt m1996a(bz bzVar) {
        View view = (View) this.f1883a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (bzVar != null) {
                animatorUpdateListener = new bv(bzVar);
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }
}
