package android.support.v4.p013b.p014a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class C0262d extends ConstantState {
    public int f1636a;
    public ConstantState f1637b;
    public ColorStateList f1638c = null;
    public Mode f1639d = C0261c.f1629a;

    C0262d(C0262d c0262d) {
        if (c0262d != null) {
            this.f1636a = c0262d.f1636a;
            this.f1637b = c0262d.f1637b;
            this.f1638c = c0262d.f1638c;
            this.f1639d = c0262d.f1639d;
        }
    }

    public abstract Drawable newDrawable(Resources resources);

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public int getChangingConfigurations() {
        return (this.f1637b != null ? this.f1637b.getChangingConfigurations() : 0) | this.f1636a;
    }
}
