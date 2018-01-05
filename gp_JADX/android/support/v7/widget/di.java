package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class di extends MarginLayoutParams {
    public float f3374g;
    public int f3375h;

    public di(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3375h = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.LinearLayoutCompat_Layout);
        this.f3374g = obtainStyledAttributes.getFloat(C0403j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
        this.f3375h = obtainStyledAttributes.getInt(C0403j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
        obtainStyledAttributes.recycle();
    }

    public di(int i) {
        super(i, -2);
        this.f3375h = -1;
        this.f3374g = 0.0f;
    }

    public di(LayoutParams layoutParams) {
        super(layoutParams);
        this.f3375h = -1;
    }
}
