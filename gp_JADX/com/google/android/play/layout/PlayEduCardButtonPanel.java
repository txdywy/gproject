package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.play.C6382j;
import com.google.android.play.C6383k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlayEduCardButtonPanel extends ViewGroup {
    public static final int f32203a = (VERSION.SDK_INT >= 11 ? 16777216 : 0);
    public int f32204b;
    public boolean f32205c;

    public PlayEduCardButtonPanel(Context context) {
        this(context, null, 0);
    }

    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29316a(context, attributeSet, i, C6382j.PlayEduCardButtonPanel);
    }

    @TargetApi(21)
    public PlayEduCardButtonPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m29316a(context, attributeSet, i, i2);
    }

    private final void m29316a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlayEduCardButtonPanel, i, i2);
        this.f32204b = obtainStyledAttributes.getDimensionPixelOffset(C6383k.PlayEduCardButtonPanel_playSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getSpacing() {
        return this.f32204b;
    }

    public void setSpacing(int i) {
        if (this.f32204b != i) {
            this.f32204b = i;
            requestLayout();
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    protected void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = this.f32204b * (childCount - 1);
        int a = m29315a(mode, size, paddingLeft);
        int a2 = m29315a(mode2, size2, paddingTop);
        Object obj = null;
        Object obj2 = null;
        int i6 = 0;
        int i7 = i5;
        int i8 = i5;
        i5 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                childAt.measure(a, a2);
                int c = ai.c(childAt);
                int i10 = 16777215 & c;
                i8 += i10;
                i5 = Math.max(i5, i10);
                obj2 = (obj2 == null && (16777216 & c) == 0) ? null : 1;
                int d = ai.d(childAt);
                c = 16777215 & d;
                i7 += c;
                i6 = Math.max(i6, c);
                obj = (obj == null && (16777216 & d) == 0) ? null : 1;
            }
        }
        i8 += paddingLeft;
        i5 += paddingLeft;
        if (mode == 0) {
            this.f32205c = false;
            i5 = i8;
        } else if (i8 <= size) {
            if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                i5 = size;
            } else {
                i5 = i8;
            }
            this.f32205c = false;
        } else if (i5 <= size) {
            if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE) {
                size = i5;
            }
            this.f32205c = true;
            i5 = size;
        } else {
            i5 = f32203a | size;
            this.f32205c = true;
        }
        if (obj2 != null) {
            i3 = f32203a | i5;
        } else {
            i3 = i5;
        }
        if (!this.f32205c) {
            i7 = i6;
        }
        i6 = i7 + paddingTop;
        if (mode2 != 0) {
            if (i6 > size2) {
                i6 = f32203a | size2;
            } else if (mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                i6 = size2;
            }
        }
        if (obj != null) {
            i4 = f32203a | i6;
        } else {
            i4 = i6;
        }
        setMeasuredDimension(i3, i4);
    }

    private static int m29315a(int i, int i2, int i3) {
        if (i == 0) {
            return MeasureSpec.makeMeasureSpec(0, 0);
        }
        return MeasureSpec.makeMeasureSpec(Math.max(0, i2 - i3), Integer.MIN_VALUE);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount != 0) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingTop = getPaddingTop();
            Object obj = ai.a.k(this) == 1 ? 1 : null;
            int i5 = 0;
            while (i5 < childCount) {
                int i6;
                View childAt = getChildAt(this.f32205c ? i5 : (childCount - 1) - i5);
                if (childAt.getVisibility() != 8) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (obj != null) {
                        childAt.layout(paddingLeft, paddingTop, paddingLeft + measuredWidth, paddingTop + measuredHeight);
                    } else {
                        childAt.layout(paddingRight - measuredWidth, paddingTop, paddingRight, paddingTop + measuredHeight);
                    }
                    if (this.f32205c) {
                        i6 = (this.f32204b + measuredHeight) + paddingTop;
                        paddingTop = paddingRight;
                        paddingRight = paddingLeft;
                    } else if (obj != null) {
                        r11 = paddingTop;
                        paddingTop = paddingRight;
                        paddingRight = (this.f32204b + measuredWidth) + paddingLeft;
                        i6 = r11;
                    } else {
                        i6 = paddingRight - (this.f32204b + measuredWidth);
                        paddingRight = paddingLeft;
                        r11 = i6;
                        i6 = paddingTop;
                        paddingTop = r11;
                    }
                } else {
                    i6 = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                }
                i5++;
                paddingLeft = paddingRight;
                paddingRight = paddingTop;
                paddingTop = i6;
            }
        }
    }
}
