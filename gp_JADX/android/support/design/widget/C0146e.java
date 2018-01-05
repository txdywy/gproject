package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0134j;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout.LayoutParams;

public final class C0146e extends LayoutParams {
    public int f964a = 1;
    public Interpolator f965b;

    public C0146e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.AppBarLayout_Layout);
        this.f964a = obtainStyledAttributes.getInt(C0134j.AppBarLayout_Layout_layout_scrollFlags, 0);
        if (obtainStyledAttributes.hasValue(C0134j.AppBarLayout_Layout_layout_scrollInterpolator)) {
            this.f965b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0134j.AppBarLayout_Layout_layout_scrollInterpolator, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C0146e() {
        super(-1, -2);
    }

    public C0146e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0146e(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C0146e(LayoutParams layoutParams) {
        super(layoutParams);
    }
}
