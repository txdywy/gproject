package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.vending.C0629a;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class SingleLineContainer extends LinearLayout {
    public final int f18297e;
    public View f18298f;

    public SingleLineContainer(Context context) {
        this(context, null);
    }

    public SingleLineContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.SingleLineContainer);
        this.f18297e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f18297e != 0) {
            this.f18298f = findViewById(this.f18297e);
        }
    }

    private static boolean m17336a(View view) {
        if (view.getBaseline() == -1) {
            return true;
        }
        return (((LayoutParams) view.getLayoutParams()).gravity & 112) == 16;
    }

    protected final void onMeasure(int i, int i2) {
        int max;
        int i3 = 0;
        int size = MeasureSpec.getSize(i);
        int l = (size - ai.f1848a.mo401l(this)) - ai.f1848a.mo402m(this);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.measure(0, 0);
                if (!m17336a(childAt)) {
                    max = Math.max(i5, childAt.getBaseline());
                    i4++;
                    i5 = max;
                }
            }
            max = i5;
            i4++;
            i5 = max;
        }
        int i6 = 0;
        max = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                i4 = childAt2.getMeasuredHeight();
                if (m17336a(childAt2)) {
                    max = Math.max(max, i4);
                    i4 = i3;
                    i3 = max;
                } else {
                    i4 = Math.max(i3, i4 - childAt2.getBaseline());
                    i3 = max;
                }
                LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                max = (C0361r.m2051b(layoutParams) + (childAt2.getMeasuredWidth() + C0361r.m2049a(layoutParams))) + i7;
            } else {
                i4 = i3;
                i3 = max;
                max = i7;
            }
            i6++;
            i7 = max;
            max = i3;
            i3 = i4;
        }
        max = Math.max(i5 + i3, max) + (getPaddingTop() + getPaddingBottom());
        if (!(i7 <= l || this.f18298f == null || this.f18298f.getVisibility() == 8)) {
            this.f18298f.measure(MeasureSpec.makeMeasureSpec(this.f18298f.getMeasuredWidth() - (i7 - l), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(this.f18298f.getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
        setMeasuredDimension(size, max);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int max;
        if (ai.f1848a.mo400k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                max = Math.max(i5, childAt.getBaseline());
            } else {
                max = i5;
            }
            i6++;
            i5 = max;
        }
        i6 = ai.f1848a.mo401l(this);
        int i7 = 0;
        while (i7 < childCount) {
            View childAt2 = getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                int measuredWidth = childAt2.getMeasuredWidth();
                int measuredHeight = childAt2.getMeasuredHeight();
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt2.getLayoutParams();
                int a = C0361r.m2049a(marginLayoutParams) + i6;
                if (m17336a(childAt2)) {
                    i6 = ((((height - paddingTop) - paddingBottom) - measuredHeight) / 2) + paddingTop;
                } else {
                    i6 = (paddingTop + i5) - childAt2.getBaseline();
                }
                measuredHeight = k.a(width, measuredWidth, z2, a);
                childAt2.layout(measuredHeight, i6, measuredHeight + measuredWidth, childAt2.getMeasuredHeight() + i6);
                max = (C0361r.m2051b(marginLayoutParams) + measuredWidth) + a;
            } else {
                max = i6;
            }
            i7++;
            i6 = max;
        }
    }
}
