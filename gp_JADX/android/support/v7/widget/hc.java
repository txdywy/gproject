package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p041b.p042a.C0436b;
import android.util.AttributeSet;
import android.util.TypedValue;

public final class hc {
    public final Context f3557a;
    public final TypedArray f3558b;
    public TypedValue f3559c;

    public static hc m3768a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new hc(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static hc m3769a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new hc(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static hc m3767a(Context context, int i, int[] iArr) {
        return new hc(context, context.obtainStyledAttributes(i, iArr));
    }

    private hc(Context context, TypedArray typedArray) {
        this.f3557a = context;
        this.f3558b = typedArray;
    }

    public final Drawable m3771a(int i) {
        if (this.f3558b.hasValue(i)) {
            int resourceId = this.f3558b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0436b.m2650b(this.f3557a, resourceId);
            }
        }
        return this.f3558b.getDrawable(i);
    }

    public final Drawable m3774b(int i) {
        if (this.f3558b.hasValue(i)) {
            int resourceId = this.f3558b.getResourceId(i, 0);
            if (resourceId != 0) {
                return ag.m3175a().m3184a(this.f3557a, resourceId, true);
            }
        }
        return null;
    }

    public final CharSequence m3776c(int i) {
        return this.f3558b.getText(i);
    }

    public final String m3778d(int i) {
        return this.f3558b.getString(i);
    }

    public final boolean m3772a(int i, boolean z) {
        return this.f3558b.getBoolean(i, z);
    }

    public final int m3770a(int i, int i2) {
        return this.f3558b.getInt(i, i2);
    }

    public final int m3773b(int i, int i2) {
        return this.f3558b.getColor(i, i2);
    }

    public final ColorStateList m3780e(int i) {
        if (this.f3558b.hasValue(i)) {
            int resourceId = this.f3558b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0436b.m2649a(this.f3557a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f3558b.getColorStateList(i);
    }

    public final int m3775c(int i, int i2) {
        return this.f3558b.getInteger(i, i2);
    }

    public final int m3777d(int i, int i2) {
        return this.f3558b.getDimensionPixelOffset(i, i2);
    }

    public final int m3779e(int i, int i2) {
        return this.f3558b.getDimensionPixelSize(i, i2);
    }

    public final int m3781f(int i, int i2) {
        return this.f3558b.getLayoutDimension(i, i2);
    }

    public final int m3783g(int i, int i2) {
        return this.f3558b.getResourceId(i, i2);
    }

    public final boolean m3782f(int i) {
        return this.f3558b.hasValue(i);
    }
}
