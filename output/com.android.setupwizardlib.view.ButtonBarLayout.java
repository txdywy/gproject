package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout$LayoutParams;
import com.android.setupwizardlib.c;

protected class ButtonBarLayout extends LinearLayout
{

    public boolean a;
    public int b;
    public int c;

    ButtonBarLayout(Context p0) {
        LinearLayout(p0);
        this.a = 0;
    }

    ButtonBarLayout(Context p0, AttributeSet p1) {
        LinearLayout(p0, p1);
        this.a = 0;
    }

    private final void a(boolean p0) {
        if (this.a == p0)
            return;
        this.a = p0;
        v4 = this.getChildCount();
        v3 = 0;
        while (v3 < v4) {
            v5 = this.getChildAt(v3);
            v0 = (LinearLayout$LayoutParams)v5.getLayoutParams();
            if (p0 != 0) {
                v5.setTag(com.android.setupwizardlib.c.suw_original_weight, Float.valueOf(v0.weight));
                v0.weight = 0;
            }
            else {
                v1 = (Float)v5.getTag(com.android.setupwizardlib.c.suw_original_weight);
                if (v1 != 0)
                    v0.weight = v1.floatValue();
            }
            v5.setLayoutParams(v0);
            v3 = v3 + 1;
        }
        if (p0 != 0)
            v0 = 1;
        else
            v0 = 0;
        this.setOrientation(v0);
        v0 = v4 - 1;
        while (v0 >= 0) {
            this.bringChildToFront(this.getChildAt(v0));
            v0 = v0 - 1;
        }
        if (p0 != 0) {
            this.b = this.getPaddingLeft();
            this.c = this.getPaddingRight();
            v0 = Math.max(this.b, this.c);
            this.setPadding(v0, this.getPaddingTop(), v0, this.getPaddingBottom());
        }
        else
            this.setPadding(this.b, this.getPaddingTop(), this.c, this.getPaddingBottom());
    }

    protected void onMeasure(int p0, int p1) {
        v2 = 1;
        this.a(0);
        if (View$MeasureSpec.getMode(p0) == 1073741824) {
            v0 = View$MeasureSpec.makeMeasureSpec(0, 0);
            v1 = 1;
        }
        else {
            v1 = 0;
            v0 = p0;
        }
        super.onMeasure(v0, p1);
        if (this.getMeasuredWidth() > View$MeasureSpec.getSize(p0))
            this.a(1);
        else
            v2 = v1;
        if (v2 != 0)
            super.onMeasure(p0, p1);
    }

}
