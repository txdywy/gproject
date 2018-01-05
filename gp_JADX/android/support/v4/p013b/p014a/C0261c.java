package android.support.v4.p013b.p014a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class C0261c extends Drawable implements Callback, C0260b, C0043j {
    public static final Mode f1629a = Mode.SRC_IN;
    public int f1630b;
    public Mode f1631c;
    public boolean f1632d;
    public C0262d f1633e;
    public boolean f1634f;
    public Drawable f1635g;

    C0261c(C0262d c0262d, Resources resources) {
        this.f1633e = c0262d;
        if (this.f1633e != null && this.f1633e.f1637b != null) {
            mo361a(this.f1633e.f1637b.newDrawable(resources));
        }
    }

    C0261c(Drawable drawable) {
        this.f1633e = mo363b();
        mo361a(drawable);
    }

    public void jumpToCurrentState() {
        this.f1635g.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f1635g.draw(canvas);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f1635g != null) {
            this.f1635g.setBounds(rect);
        }
    }

    public void setChangingConfigurations(int i) {
        this.f1635g.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return ((this.f1633e != null ? this.f1633e.getChangingConfigurations() : 0) | super.getChangingConfigurations()) | this.f1635g.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f1635g.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1635g.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f1635g.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1635g.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo364c() || this.f1633e == null) ? null : this.f1633e.f1638c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1635g.isStateful();
    }

    public boolean setState(int[] iArr) {
        return m1530a(iArr) || this.f1635g.setState(iArr);
    }

    public int[] getState() {
        return this.f1635g.getState();
    }

    public Drawable getCurrent() {
        return this.f1635g.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1635g.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f1635g.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f1635g.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f1635g.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1635g.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f1635g.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f1635g.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f1635g.getPadding(rect);
    }

    public ConstantState getConstantState() {
        if (this.f1633e != null) {
            if ((this.f1633e.f1637b != null ? 1 : null) != null) {
                this.f1633e.f1636a = getChangingConfigurations();
                return this.f1633e;
            }
        }
        return null;
    }

    public Drawable mutate() {
        if (!this.f1634f && super.mutate() == this) {
            this.f1633e = mo363b();
            if (this.f1635g != null) {
                this.f1635g.mutate();
            }
            if (this.f1633e != null) {
                this.f1633e.f1637b = this.f1635g != null ? this.f1635g.getConstantState() : null;
            }
            this.f1634f = true;
        }
        return this;
    }

    C0262d mo363b() {
        return new C0263e(this.f1633e);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected boolean onLevelChange(int i) {
        return this.f1635g.setLevel(i);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1633e.f1638c = colorStateList;
        m1530a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1633e.f1639d = mode;
        m1530a(getState());
    }

    private final boolean m1530a(int[] iArr) {
        if (!mo364c()) {
            return false;
        }
        ColorStateList colorStateList = this.f1633e.f1638c;
        Mode mode = this.f1633e.f1639d;
        if (colorStateList == null || mode == null) {
            this.f1632d = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1632d && colorForState == this.f1630b && mode == this.f1631c) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f1630b = colorForState;
        this.f1631c = mode;
        this.f1632d = true;
        return true;
    }

    public final Drawable mo360a() {
        return this.f1635g;
    }

    public final void mo361a(Drawable drawable) {
        if (this.f1635g != null) {
            this.f1635g.setCallback(null);
        }
        this.f1635g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f1633e != null) {
                this.f1633e.f1637b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean mo364c() {
        return true;
    }
}
