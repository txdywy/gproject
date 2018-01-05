package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0134j;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class C0137x extends FrameLayout {
    public C0156w f653a;
    public C0153v f654b;

    C0137x(Context context) {
        this(context, null);
    }

    C0137x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(C0134j.SnackbarLayout_elevation)) {
            ai.m1851g(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0134j.SnackbarLayout_elevation, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f653a != null) {
            this.f653a.mo191a();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f654b != null) {
            this.f654b.mo189a();
        }
        ai.f1848a.mo396h(this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f654b != null) {
            this.f654b.mo190b();
        }
    }
}
