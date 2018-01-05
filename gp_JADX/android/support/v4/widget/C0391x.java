package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class C0391x extends MarginLayoutParams {
    public int f2190a = 0;
    public float f2191b;
    public boolean f2192c;
    public int f2193d;

    public C0391x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1934b);
        this.f2190a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0391x() {
        super(-1, -1);
    }

    public C0391x(C0391x c0391x) {
        super(c0391x);
        this.f2190a = c0391x.f2190a;
    }

    public C0391x(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0391x(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
