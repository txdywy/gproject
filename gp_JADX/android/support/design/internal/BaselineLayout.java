package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
    public int f466a = -1;

    public BaselineLayout(Context context) {
        super(context, null, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        while (i3 < childCount) {
            int combineMeasuredStates;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i5 = Math.max(i5, baseline);
                    i8 = Math.max(i8, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                combineMeasuredStates = View.combineMeasuredStates(i4, childAt.getMeasuredState());
                i4 = i5;
                i5 = i8;
                i8 = combineMeasuredStates;
            } else {
                combineMeasuredStates = i4;
                i4 = i5;
                i5 = i8;
                i8 = combineMeasuredStates;
            }
            i3++;
            combineMeasuredStates = i8;
            i8 = i5;
            i5 = i4;
            i4 = combineMeasuredStates;
        }
        if (i5 != -1) {
            i6 = Math.max(i6, Math.max(i8, getPaddingBottom()) + i5);
            this.f466a = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i, i4), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i2, i4 << 16));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6;
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = paddingLeft + ((paddingRight - measuredWidth) / 2);
                if (this.f466a == -1 || childAt.getBaseline() == -1) {
                    i6 = paddingTop;
                } else {
                    i6 = (this.f466a + paddingTop) - childAt.getBaseline();
                }
                childAt.layout(i7, i6, measuredWidth + i7, measuredHeight + i6);
            }
        }
    }

    public int getBaseline() {
        return this.f466a;
    }
}
