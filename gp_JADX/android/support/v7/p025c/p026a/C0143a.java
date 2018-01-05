package android.support.v7.p025c.p026a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.p013b.p014a.C0259a;

public class C0143a extends Drawable implements Callback {
    public Drawable f872q;

    public C0143a(Drawable drawable) {
        if (this.f872q != null) {
            this.f872q.setCallback(null);
        }
        this.f872q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f872q.draw(canvas);
    }

    public void onBoundsChange(Rect rect) {
        this.f872q.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f872q.setChangingConfigurations(i);
    }

    public int getChangingConfigurations() {
        return this.f872q.getChangingConfigurations();
    }

    public void setDither(boolean z) {
        this.f872q.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f872q.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.f872q.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f872q.setColorFilter(colorFilter);
    }

    public boolean isStateful() {
        return this.f872q.isStateful();
    }

    public boolean setState(int[] iArr) {
        return this.f872q.setState(iArr);
    }

    public int[] getState() {
        return this.f872q.getState();
    }

    public void jumpToCurrentState() {
        this.f872q.jumpToCurrentState();
    }

    public Drawable getCurrent() {
        return this.f872q.getCurrent();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f872q.setVisible(z, z2);
    }

    public int getOpacity() {
        return this.f872q.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f872q.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f872q.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f872q.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f872q.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f872q.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f872q.getPadding(rect);
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
        return this.f872q.setLevel(i);
    }

    public void setAutoMirrored(boolean z) {
        C0259a.m1520a(this.f872q, z);
    }

    public boolean isAutoMirrored() {
        return C0259a.m1521a(this.f872q);
    }

    public void setTint(int i) {
        C0259a.m1514a(this.f872q, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0259a.m1516a(this.f872q, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0259a.m1519a(this.f872q, mode);
    }

    public void setHotspot(float f, float f2) {
        C0259a.m1513a(this.f872q, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0259a.m1515a(this.f872q, i, i2, i3, i4);
    }
}
