package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.a;
import com.google.android.play.utils.k;

public class DetailsSummaryDynamic extends ViewGroup
{

    public boolean a;
    public com.google.android.finsky.actionbuttons.aa b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;

    DetailsSummaryDynamic(Context p0) {
        DetailsSummaryDynamic(p0, 0);
    }

    DetailsSummaryDynamic(Context p0, AttributeSet p1) {
        ViewGroup(p0, p1);
        this.f = 0;
        v0 = p0.obtainStyledAttributes(p1, com.android.vending.a.DetailsSummaryDynamic);
        this.a = v0.getBoolean(0, 0);
        v0.recycle();
    }

    public int getVisibleButtonsCount() {
        v0 = 0;
        if (this.c.getVisibility() == 0) {
            v1 = 0;
            while (v0 < this.c.getChildCount()) {
                if (this.c.getChildAt(v0).getVisibility() == 0)
                    v1 = v1 + 1;
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

    public int getXStartOffset() {
        return this.f;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ViewGroup)this.findViewById(2131755323);
        this.d = this.findViewById(2131755324);
        this.e = this.findViewById(2131755325);
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        v1 = 0;
        if (android.support.v4.view.ai.a.k(this) == 0)
            v0 = 1;
        else
            v0 = 0;
        v5 = this.getPaddingTop();
        v3 = android.support.v4.view.ai.a.l(this);
        while (v1 < this.getChildCount()) {
            v6 = this.getChildAt(v1);
            if (v6.getVisibility() != 8) {
                v7 = v6.getMeasuredWidth();
                if (!(v6 instanceof DetailsButtonLayout))
                    v2 = this.f + v3;
                else
                    v2 = v3;
                v2 = com.google.android.play.utils.k.a(this.getMeasuredWidth(), v7, v0, v2);
                v6.layout(v2, v5, v7 + v2, v5 + v6.getMeasuredHeight());
            }
            v1 = v1 + 1;
        }
    }

    protected void onMeasure(int p0, int p1) {
        v1 = View$MeasureSpec.getMode(p0);
        this.c.measure(p0, p1);
        if (this.a != 0 && this.c instanceof DetailsButtonLayout) {
            this.f = ((DetailsButtonLayout)this.c).getFirstVisibleActionButtonXPadding();
            p0 = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(p0) - this.f, v1);
        }
        v0 = View$MeasureSpec.makeMeasureSpec(0, 1073741824);
        if (this.d.getVisibility() != 8 && v1 == 1073741824)
            this.d.measure(p0, p1);
        else
            this.d.measure(v0, p1);
        if (this.e.getVisibility() != 8 && v1 == 1073741824)
            this.e.measure(p0, p1);
        else
            this.e.measure(v0, p1);
        this.setMeasuredDimension(Math.max(Math.max(this.c.getMeasuredWidth(), this.d.getMeasuredWidth()), this.e.getMeasuredWidth()), Math.max(Math.max(this.c.getMeasuredHeight(), this.d.getMeasuredHeight()), this.e.getMeasuredHeight()));
    }

    public void setForceWideLayout(boolean p0) {
        if (this.c instanceof DetailsButtonLayout)
            ((DetailsButtonLayout)this.c).setForceWideLayout(p0);
    }

    public void setRefreshListener(com.google.android.finsky.actionbuttons.aa p0) {
        this.b = p0;
    }

}
