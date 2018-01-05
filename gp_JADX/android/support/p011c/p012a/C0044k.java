package android.support.p011c.p012a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0043j;
import android.support.v4.p013b.p014a.C0259a;

abstract class C0044k extends Drawable implements C0043j {
    public Drawable f70e;

    C0044k() {
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f70e != null) {
            this.f70e.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f70e == null) {
            return null;
        }
        Drawable drawable = this.f70e;
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    protected boolean onLevelChange(int i) {
        if (this.f70e != null) {
            return this.f70e.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f70e != null) {
            this.f70e.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f70e != null) {
            C0259a.m1513a(this.f70e, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f70e != null) {
            C0259a.m1515a(this.f70e, i, i2, i3, i4);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f70e != null) {
            this.f70e.setFilterBitmap(z);
        }
    }

    public void jumpToCurrentState() {
        if (this.f70e != null) {
            this.f70e.jumpToCurrentState();
        }
    }

    public void applyTheme(Theme theme) {
        if (this.f70e != null) {
            C0259a.m1517a(this.f70e, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f70e != null) {
            this.f70e.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f70e != null) {
            return this.f70e.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        if (this.f70e != null) {
            return this.f70e.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        if (this.f70e != null) {
            return this.f70e.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect rect) {
        if (this.f70e != null) {
            return this.f70e.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        if (this.f70e != null) {
            return this.f70e.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f70e != null) {
            return this.f70e.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int i) {
        if (this.f70e != null) {
            this.f70e.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f70e != null) {
            return this.f70e.setState(iArr);
        }
        return super.setState(iArr);
    }
}
