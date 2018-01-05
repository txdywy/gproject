package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;

class ao extends an {
    public static ThreadLocal f1857a;

    ao() {
    }

    public final void mo418a(View view, String str) {
        view.setTransitionName(str);
    }

    public final String mo422u(View view) {
        return view.getTransitionName();
    }

    public final void mo396h(View view) {
        view.requestApplyInsets();
    }

    public final void mo414a(View view, float f) {
        view.setElevation(f);
    }

    public final float mo423v(View view) {
        return view.getElevation();
    }

    public final float mo424w(View view) {
        return view.getTranslationZ();
    }

    public final void mo417a(View view, ae aeVar) {
        if (aeVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ap(aeVar));
        }
    }

    public final boolean mo425x(View view) {
        return view.isNestedScrollingEnabled();
    }

    public final void mo426y(View view) {
        view.stopNestedScroll();
    }

    public final ColorStateList mo427z(View view) {
        return view.getBackgroundTintList();
    }

    public final void mo415a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public final void mo416a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
        if (VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
            if (background != null && obj != null) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public final Mode mo411A(View view) {
        return view.getBackgroundTintMode();
    }

    public final ca mo413a(View view, ca caVar) {
        Object obj = (WindowInsets) ca.m2020a(caVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
        if (onApplyWindowInsets != obj) {
            obj = new WindowInsets(onApplyWindowInsets);
        }
        return ca.m2019a(obj);
    }

    public final ca mo419b(View view, ca caVar) {
        Object obj = (WindowInsets) ca.m2020a(caVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
        if (dispatchApplyWindowInsets != obj) {
            obj = new WindowInsets(dispatchApplyWindowInsets);
        }
        return ca.m2019a(obj);
    }

    public final float mo412B(View view) {
        return view.getZ();
    }

    public void mo420b(View view, int i) {
        Object obj;
        Rect a = m1933a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        super.mo420b(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    public void mo421c(View view, int i) {
        Object obj;
        Rect a = m1933a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            obj = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ? 1 : null;
        } else {
            obj = null;
        }
        super.mo421c(view, i);
        if (obj != null && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    private static Rect m1933a() {
        if (f1857a == null) {
            f1857a = new ThreadLocal();
        }
        Rect rect = (Rect) f1857a.get();
        if (rect == null) {
            rect = new Rect();
            f1857a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }
}
