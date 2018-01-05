package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class BucketRowLayout extends LinearLayout {
    public boolean f9433f;

    public BucketRowLayout(Context context) {
        this(context, null);
    }

    public BucketRowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public void setSameChildHeight(boolean z) {
        this.f9433f = z;
    }

    public void setContentHorizontalPadding(int i) {
        ai.m1823a(this, i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setHorizontalMargin(int i) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        C0361r.m2050a(marginLayoutParams, i);
        C0361r.m2052b(marginLayoutParams, i);
        setLayoutParams(marginLayoutParams);
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        int size = MeasureSpec.getSize(i);
        int childCount = getChildCount();
        if (childCount > 0) {
            View childAt;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(((size - getPaddingLeft()) - getPaddingRight()) / childCount, MemoryMappedFileBuffer.DEFAULT_SIZE);
            int i5 = 0;
            i3 = 0;
            while (i5 < childCount) {
                childAt = getChildAt(i5);
                childAt.measure(makeMeasureSpec, getChildMeasureSpec(0, 0, childAt.getLayoutParams().height));
                i5++;
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
            if (this.f9433f) {
                i5 = MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE);
                while (i4 < childCount) {
                    childAt = getChildAt(i4);
                    if (childAt.getMeasuredHeight() != i3) {
                        childAt.measure(MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), i5);
                    }
                    i4++;
                }
            }
        } else {
            i3 = 0;
        }
        setMeasuredDimension(size, i3 + (getPaddingTop() + getPaddingBottom()));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int l = ai.f1848a.mo401l(this);
        int width = getWidth();
        int height = getHeight() - getPaddingBottom();
        if (ai.f1848a.mo400k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int a = k.a(width, measuredWidth, z2, l + i5);
            childAt.layout(a, (height - childAt.getMeasuredHeight()) - marginLayoutParams.bottomMargin, a + measuredWidth, height - marginLayoutParams.bottomMargin);
            i5 += measuredWidth;
        }
    }
}
