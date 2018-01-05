package com.android.setupwizardlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.android.setupwizardlib.C0609c;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ButtonBarLayout extends LinearLayout {
    public boolean f3966a = false;
    public int f3967b;
    public int f3968c;

    public ButtonBarLayout(Context context) {
        super(context);
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        boolean z;
        boolean z2 = true;
        int size = MeasureSpec.getSize(i);
        m4254a(false);
        if (MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            z = true;
        } else {
            z = false;
            makeMeasureSpec = i;
        }
        super.onMeasure(makeMeasureSpec, i2);
        if (getMeasuredWidth() > size) {
            m4254a(true);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    private final void m4254a(boolean z) {
        if (this.f3966a != z) {
            int i;
            this.f3966a = z;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    childAt.setTag(C0609c.suw_original_weight, Float.valueOf(layoutParams.weight));
                    layoutParams.weight = 0.0f;
                } else {
                    Float f = (Float) childAt.getTag(C0609c.suw_original_weight);
                    if (f != null) {
                        layoutParams.weight = f.floatValue();
                    }
                }
                childAt.setLayoutParams(layoutParams);
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            setOrientation(i);
            for (i = childCount - 1; i >= 0; i--) {
                bringChildToFront(getChildAt(i));
            }
            if (z) {
                this.f3967b = getPaddingLeft();
                this.f3968c = getPaddingRight();
                i = Math.max(this.f3967b, this.f3968c);
                setPadding(i, getPaddingTop(), i, getPaddingBottom());
                return;
            }
            setPadding(this.f3967b, getPaddingTop(), this.f3968c, getPaddingBottom());
        }
    }
}
