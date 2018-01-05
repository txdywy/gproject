package android.support.v4.p013b.p014a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

final class C0266h extends C0264f {
    public static Method f1640h;

    C0266h(Drawable drawable) {
        super(drawable);
        C0266h.m1536d();
    }

    C0266h(C0262d c0262d, Resources resources) {
        super(c0262d, resources);
        C0266h.m1536d();
    }

    public final void setHotspot(float f, float f2) {
        this.g.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.g.setHotspotBounds(i, i2, i3, i4);
    }

    public final void getOutline(Outline outline) {
        this.g.getOutline(outline);
    }

    public final Rect getDirtyBounds() {
        return this.g.getDirtyBounds();
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo364c()) {
            super.setTintList(colorStateList);
        } else {
            this.g.setTintList(colorStateList);
        }
    }

    public final void setTint(int i) {
        if (mo364c()) {
            super.setTint(i);
        } else {
            this.g.setTint(i);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo364c()) {
            super.setTintMode(mode);
        } else {
            this.g.setTintMode(mode);
        }
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    protected final boolean mo364c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.g;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    final C0262d mo363b() {
        return new C0267i(this.e);
    }

    private static void m1536d() {
        if (f1640h == null) {
            try {
                f1640h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Throwable e) {
                Log.w("DrawableWrapperApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }
}
