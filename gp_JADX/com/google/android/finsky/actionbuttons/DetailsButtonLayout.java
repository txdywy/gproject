package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class DetailsButtonLayout extends ViewGroup {
    public final int f5998a;
    public final int f5999b;
    public boolean f6000c;
    public boolean f6001d;
    public boolean f6002e;
    public boolean f6003f;
    public boolean f6004g;

    public DetailsButtonLayout(Context context) {
        this(context, null);
    }

    public DetailsButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6000c = false;
        this.f6001d = false;
        Resources resources = context.getResources();
        this.f5998a = (resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin) * 2) / 3;
        this.f5999b = resources.getDimensionPixelSize(C7582R.dimen.details_button_row_padding);
        this.f6002e = resources.getBoolean(C7582R.bool.use_wide_layout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.DetailsButtonLayout);
        this.f6003f = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public void setForceWideLayout(boolean z) {
        this.f6002e = z;
    }

    public void setForceMultiLineLayout(boolean z) {
        this.f6001d = z;
    }

    public void setUseMultiLineLayoutForSingleChild(boolean z) {
        this.f6004g = z;
    }

    public boolean getForceMultiLineLayout() {
        return this.f6001d;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                i6++;
                childAt.measure(0, 0);
                i5 += childAt.getMeasuredWidth();
                i4 = Math.max(i4, childAt.getMeasuredHeight());
            }
        }
        boolean z = this.f6001d || (i6 == 1 && this.f6004g);
        if (i6 > 0) {
            i5 += this.f5998a * (i6 - 1);
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (z || mode != Integer.MIN_VALUE || i5 > size) {
            i5 = size - i5;
            if (!z && i5 > 0 && (i6 == 1 || this.f6002e)) {
                i5 = 0;
            }
            if (i5 < 0 || z) {
                this.f6000c = true;
                i3 = MeasureSpec.makeMeasureSpec(size, MemoryMappedFileBuffer.DEFAULT_SIZE);
                i4 = 0;
                for (i5 = 0; i5 < childCount; i5++) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2.getVisibility() == 0) {
                        i4 += childAt2.getMeasuredHeight();
                        childAt2.measure(i3, 0);
                    }
                }
                if (i6 > 0) {
                    i4 += this.f5999b * (i6 - 1);
                }
            } else if (i5 > 0 && i6 > 0) {
                i6 = i5 / i6;
                for (i5 = 0; i5 < childCount; i5++) {
                    View childAt3 = getChildAt(i5);
                    if (childAt3.getVisibility() == 0) {
                        childAt3.measure(MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth() + i6, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    }
                }
            }
            setMeasuredDimension(size, i4 + paddingTop);
            return;
        }
        setMeasuredDimension(i5, i4 + paddingTop);
        this.f6000c = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int i5 = 0;
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        int i6 = childCount - 1;
        while (i6 >= 0) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                int measuredWidth = childAt.getMeasuredWidth();
                if (this.f6003f) {
                    childCount = k.a(width, measuredWidth, z2, i5);
                } else {
                    childCount = k.b(width, measuredWidth, z2, i5);
                }
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(childCount, paddingTop, childCount + measuredWidth, childAt.getMeasuredHeight() + paddingTop);
                if (this.f6000c) {
                    childCount = (this.f5999b + measuredHeight) + paddingTop;
                    paddingTop = i5;
                } else {
                    int i7 = paddingTop;
                    paddingTop = (this.f5998a + measuredWidth) + i5;
                    childCount = i7;
                }
            } else {
                childCount = paddingTop;
                paddingTop = i5;
            }
            i6--;
            i5 = paddingTop;
            paddingTop = childCount;
        }
    }

    public final void m5887a(List list, List list2) {
        int i = 0;
        removeAllViews();
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sparseArray.append(((Integer) list.get(i2)).intValue(), (C0995a) list2.get(i2));
        }
        while (i < list.size()) {
            C0995a c0995a = (C0995a) sparseArray.valueAt(i);
            PlayActionButtonV2 a = c0995a.mo1199a((ViewGroup) this);
            c0995a.mo1201a(a);
            addView(a);
            i++;
        }
    }

    public int getFirstVisibleActionButtonXPadding() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            PlayActionButtonV2 playActionButtonV2 = (PlayActionButtonV2) getChildAt(childCount);
            if (playActionButtonV2.getVisibility() == 0) {
                return playActionButtonV2.getActionXPadding();
            }
        }
        return 0;
    }
}
