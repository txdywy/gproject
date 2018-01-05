package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ButtonBarLayout extends LinearLayout {
    public boolean f2937a;
    public int f2938b = -1;
    public int f2939c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        boolean z = false;
        super(context, attributeSet);
        if (getResources().getConfiguration().screenHeightDp >= 320) {
            z = true;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.ButtonBarLayout);
        this.f2937a = obtainStyledAttributes.getBoolean(C0403j.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.f2937a != z) {
            this.f2937a = z;
            if (!this.f2937a && getOrientation() == 1) {
                m2974a(false);
            }
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int size = MeasureSpec.getSize(i);
        if (this.f2937a) {
            if (size > this.f2938b && m2975a()) {
                m2974a(false);
            }
            this.f2938b = size;
        }
        if (m2975a() || MeasureSpec.getMode(i) != MemoryMappedFileBuffer.DEFAULT_SIZE) {
            size = i;
            z = false;
        } else {
            size = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(size, i2);
        if (this.f2937a && !m2975a() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            m2974a(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m2973a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            size = (layoutParams.bottomMargin + ((childAt.getMeasuredHeight() + getPaddingTop()) + layoutParams.topMargin)) + 0;
            if (m2975a()) {
                a = m2973a(a + 1);
                if (a >= 0) {
                    size += getChildAt(a).getPaddingTop() + ((int) (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                size += getPaddingBottom();
            }
        } else {
            size = 0;
        }
        if (ai.f1848a.mo395g(this) != size) {
            setMinimumHeight(size);
        }
    }

    private final int m2973a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f2939c, super.getMinimumHeight());
    }

    private final void m2974a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0399f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private final boolean m2975a() {
        return getOrientation() == 1;
    }
}
