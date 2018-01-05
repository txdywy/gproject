package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import com.google.android.play.utils.k;

public class BucketRowLayout extends LinearLayout
{

    public boolean f;

    BucketRowLayout(Context p0) {
        BucketRowLayout(p0, 0);
    }

    BucketRowLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.setOrientation(0);
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        v6 = this.getHeight() - this.getPaddingBottom();
        if (android.support.v4.view.ai.a.k(this) == 0)
            v1 = 1;
        else
            v1 = 0;
        v3 = 0;
        v2 = 0;
        while (v2 < this.getChildCount()) {
            v8 = this.getChildAt(v2);
            v0 = (ViewGroup$MarginLayoutParams)v8.getLayoutParams();
            v9 = v8.getMeasuredWidth();
            v10 = com.google.android.play.utils.k.a(this.getWidth(), v9, v1, android.support.v4.view.ai.a.l(this) + v3);
            v8.layout(v10, v6 - v8.getMeasuredHeight() - v0.bottomMargin, v10 + v9, v6 - v0.bottomMargin);
            v3 = v3 + v9;
            v2 = v2 + 1;
        }
    }

    protected void onMeasure(int p0, int p1) {
  2:    v1 = 0;
  3:    v4 = View$MeasureSpec.getSize(p0);
  7:    v5 = this.getChildCount();
 11:    if (v5 <= 0) {
 97:        v0 = 0;
108:        this.setMeasuredDimension(v4, v0 + this.getPaddingTop() + this.getPaddingBottom());
111:        return;
        }
 29:    v2 = 0;
 30:    v0 = 0;
 31:    while (v2 < v5) {
 33:        v3 = this.getChildAt(v2);
 47:        v3.measure(View$MeasureSpec.makeMeasureSpec((v4 - this.getPaddingLeft() - this.getPaddingRight()) / v5, 1073741824), BucketRowLayout.getChildMeasureSpec(0, 0, v3.getLayoutParams().height));
 60:        v2 = v2 + 1;
 61:        v0 = Math.max(v0, v3.getMeasuredHeight());
        }
 65:    if (this.f != 0)
 71:        while (v1 < v5) {
 73:            v3 = this.getChildAt(v1);
 81:            if (v3.getMeasuredHeight() != v0)
 91:                v3.measure(View$MeasureSpec.makeMeasureSpec(v3.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(v0, 1073741824));
 94:            v1 = v1 + 1;
            }
 96:    goto 98;
 97:    v0 = 0;
108:    this.setMeasuredDimension(v4, v0 + this.getPaddingTop() + this.getPaddingBottom());
    }

    public void setContentHorizontalPadding(int p0) {
        android.support.v4.view.ai.a(this, p0, this.getPaddingTop(), p0, this.getPaddingBottom());
    }

    public void setHorizontalMargin(int p0) {
        v0 = (ViewGroup$MarginLayoutParams)this.getLayoutParams();
        android.support.v4.view.r.a(v0, p0);
        android.support.v4.view.r.b(v0, p0);
        this.setLayoutParams(v0);
    }

    public void setSameChildHeight(boolean p0) {
        this.f = p0;
    }

}
