package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class C0410b extends MarginLayoutParams {
    public int f2316a;

    public C0410b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2316a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ActionBarLayout);
        this.f2316a = obtainStyledAttributes.getInt(C0403j.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public C0410b(int i) {
        super(i, -2);
        this.f2316a = 0;
        this.f2316a = 8388627;
    }

    public C0410b(C0410b c0410b) {
        super(c0410b);
        this.f2316a = 0;
        this.f2316a = c0410b.f2316a;
    }

    public C0410b(LayoutParams layoutParams) {
        super(layoutParams);
        this.f2316a = 0;
    }
}
