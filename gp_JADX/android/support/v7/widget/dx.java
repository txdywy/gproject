package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.p025c.p026a.C0143a;

final class dx extends C0143a {
    public boolean f3416a = true;

    public dx(Drawable drawable) {
        super(drawable);
    }

    public final boolean setState(int[] iArr) {
        if (this.f3416a) {
            return super.setState(iArr);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        if (this.f3416a) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.f3416a) {
            super.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f3416a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f3416a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
