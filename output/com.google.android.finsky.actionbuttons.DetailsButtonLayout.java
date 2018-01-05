package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.play.utils.k;
import java.util.List;

public class DetailsButtonLayout extends ViewGroup
{

    public final int a;
    public final int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    DetailsButtonLayout(Context p0) {
        DetailsButtonLayout(p0, 0);
    }

    DetailsButtonLayout(Context p0, AttributeSet p1) {
        ViewGroup(p0, p1);
        this.c = 0;
        this.d = 0;
        v0 = p0.getResources();
        this.a = v0.getDimensionPixelSize(2131624280) * 2 / 3;
        this.b = v0.getDimensionPixelSize(2131624237);
        this.e = v0.getBoolean(2131492903);
        v0 = p0.obtainStyledAttributes(p1, com.android.vending.a.DetailsButtonLayout);
        this.f = v0.getBoolean(0, 0);
        v0.recycle();
    }

    public final void a(List p0, List p1) {
        v2 = 0;
        this.removeAllViews();
        v3 = new SparseArray();
        v1 = 0;
        while (v1 < p0.size()) {
            v3.append(((Integer)p0.get(v1)).intValue(), (com.google.android.finsky.actionbuttons.a)p1.get(v1));
            v1 = v1 + 1;
        }
        while (v2 < p0.size()) {
            v0 = (com.google.android.finsky.actionbuttons.a)v3.valueAt(v2);
            v1 = v0.a(this);
            v0.a(v1);
            this.addView(v1);
            v2 = v2 + 1;
        }
    }

    public int getFirstVisibleActionButtonXPadding() {
        v1 = this.getChildCount() - 1;
        while (v1 >= 0) {
            v0 = (PlayActionButtonV2)this.getChildAt(v1);
            if (v0.getVisibility() == 0) {
                v0 = v0.getActionXPadding();
                return v0;
            }
            v1 = v1 - 1;
        }
        v0 = 0;
        return v0;
    }

    public boolean getForceMultiLineLayout() {
        return this.d;
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        if (android.support.v4.view.ai.a.k(this) == 0)
            v0 = 1;
        else
            v0 = 0;
        v5 = this.getWidth();
        v3 = 0;
        v2 = this.getPaddingTop();
        v4 = this.getChildCount() - 1;
        while (v4 >= 0) {
            v6 = this.getChildAt(v4);
            if (v6.getVisibility() == 0) {
                v7 = v6.getMeasuredWidth();
                if (this.f != 0)
                    v1 = com.google.android.play.utils.k.a(v5, v7, v0, v3);
                else
                    v1 = com.google.android.play.utils.k.b(v5, v7, v0, v3);
                v6.layout(v1, v2, v1 + v7, v6.getMeasuredHeight() + v2);
                if (this.c != 0) {
                    v1 = this.b + v6.getMeasuredHeight() + v2 + v2;
                    v2 = v3;
                }
                else {
                    v11 = v2;
                    v2 = this.a + v7 + v3;
                    v1 = v11;
                }
            }
            else {
                v1 = v2;
                v2 = v3;
            }
            v4 = v4 - 1;
            v3 = v2;
            v2 = v1;
        }
    }

    protected void onMeasure(int p0, int p1) {
        v6 = this.getChildCount();
        v7 = this.getPaddingTop() + this.getPaddingBottom();
        v4 = 0;
        v0 = 0;
        v1 = 0;
        v2 = 0;
        while (v4 < v6) {
            v8 = this.getChildAt(v4);
            if (v8.getVisibility() == 0) {
                v2 = v2 + 1;
                v8.measure(0, 0);
                v1 = v1 + v8.getMeasuredWidth();
                v0 = Math.max(v0, v8.getMeasuredHeight());
            }
            v4 = v4 + 1;
        }
        if (this.d != 0 || v2 == 1 && this.g != 0)
            v4 = 1;
        else
            v4 = 0;
        if (v2 > 0)
            v1 = v1 + this.a * (v2 - 1);
        v9 = View$MeasureSpec.getSize(p0);
        if (v4 == 0 && View$MeasureSpec.getMode(p0) == -2147483648 && v1 <= v9) {
            this.setMeasuredDimension(v1, v0 + v7);
            this.c = 0;
        }
        else {
            v1 = v9 - v1;
            if (v4 == 0 && v1 > 0 && (v2 == 1 || this.e != 0))
                v1 = 0;
            if (v1 < 0 || v4 != 0) {
                this.c = 1;
                v1 = 0;
                v0 = 0;
                while (v1 < v6) {
                    v5 = this.getChildAt(v1);
                    if (v5.getVisibility() == 0) {
                        v0 = v0 + v5.getMeasuredHeight();
                        v5.measure(View$MeasureSpec.makeMeasureSpec(v9, 1073741824), 0);
                    }
                    v1 = v1 + 1;
                }
                if (v2 > 0)
                    v0 = v0 + this.b * (v2 - 1);
            }
            else if (v1 > 0 && v2 > 0) {
                v2 = v1 / v2;
                v1 = 0;
                while (v1 < v6) {
                    v4 = this.getChildAt(v1);
                    if (v4.getVisibility() == 0)
                        v4.measure(View$MeasureSpec.makeMeasureSpec(v4.getMeasuredWidth() + v2, 1073741824), 0);
                    v1 = v1 + 1;
                }
            }
            this.setMeasuredDimension(v9, v0 + v7);
        }
    }

    public void setForceMultiLineLayout(boolean p0) {
        this.d = p0;
    }

    public void setForceWideLayout(boolean p0) {
        this.e = p0;
    }

    public void setUseMultiLineLayoutForSingleChild(boolean p0) {
        this.g = p0;
    }

}
