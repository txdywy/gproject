package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;

public final class bf extends LayoutParams {
    public boolean f1874a;
    public int f1875b;
    public float f1876c = 0.0f;
    public boolean f1877d;
    public int f1878e;
    public int f1879f;

    public bf() {
        super(-1, -1);
    }

    public bf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1780a);
        this.f1875b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
