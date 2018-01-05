package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.android.vending.C0629a;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup {
    public int f16191a;
    public int f16192b;
    public final int f16193c;
    public List f16194d;
    public boolean f16195e;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.FlowLayout);
        this.f16191a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f16192b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f16193c = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public void setVerticalGap(int i) {
        this.f16191a = i;
    }

    public void setHorizontalGap(int i) {
        this.f16192b = i;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f16195e = !k.b(getContext());
        this.f16194d = new ArrayList();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        this.f16194d.clear();
        int i4 = paddingLeft;
        int i5 = 0;
        paddingLeft = paddingTop;
        int i6 = paddingTop;
        paddingTop = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            childAt.measure(0, 0);
            int i8 = 0;
            int i9 = 0;
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    measuredWidth = Math.max(measuredWidth, layoutParams.width);
                    measuredHeight = Math.max(measuredHeight, layoutParams.height);
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i8 = marginLayoutParams.leftMargin + 0;
                        i9 = marginLayoutParams.rightMargin + 0;
                    }
                }
                i3 = (i4 + i8) + measuredWidth;
                if (i3 > paddingRight) {
                    i4 = getPaddingLeft();
                    i6 = paddingLeft + this.f16191a;
                    this.f16194d.add(Integer.valueOf(i5));
                    i3 = (i4 + i8) + measuredWidth;
                }
                paddingLeft = Math.max(paddingLeft, i6 + measuredHeight);
                if (i3 <= paddingTop) {
                    i3 = paddingTop;
                }
                i4 += ((i8 + i9) + measuredWidth) + this.f16192b;
                if (measuredHeight > i5) {
                    paddingTop = i3;
                    i5 = measuredHeight;
                } else {
                    paddingTop = i3;
                }
            }
        }
        this.f16194d.add(Integer.valueOf(i5));
        setMeasuredDimension(m16024a(size, mode, getPaddingRight() + paddingTop), m16024a(size2, mode2, getPaddingBottom() + paddingLeft));
    }

    private static int m16024a(int i, int i2, int i3) {
        switch (i2) {
            case Integer.MIN_VALUE:
                return Math.min(i3, i);
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                return i;
            default:
                return i3;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 0) {
            int l = ai.f1848a.mo401l(this);
            int m = ai.f1848a.mo402m(this);
            int paddingTop = getPaddingTop();
            int i5 = (i3 - i) - m;
            int i6 = paddingTop;
            int i7 = paddingTop;
            int i8 = l;
            paddingTop = 0;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int a;
                    int i10;
                    int b;
                    int i11;
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (layoutParams != null) {
                        measuredWidth = Math.max(measuredWidth, layoutParams.width);
                        measuredHeight = Math.max(measuredHeight, layoutParams.height);
                        if (layoutParams instanceof MarginLayoutParams) {
                            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                            a = C0361r.m2049a(marginLayoutParams);
                            i10 = measuredWidth;
                            b = C0361r.m2051b(marginLayoutParams);
                            i11 = a;
                            a = measuredHeight;
                            m = (i8 + i11) + i10;
                            if (m <= i5) {
                                i7 = i6 + this.f16191a;
                                paddingTop++;
                                i6 = (l + i11) + i10;
                                i8 = l;
                            } else {
                                i6 = m;
                            }
                            measuredHeight = i7 + a;
                            if (this.f16193c == 16 || a >= ((Integer) this.f16194d.get(paddingTop)).intValue()) {
                                m = measuredHeight;
                                measuredWidth = i7;
                            } else {
                                measuredWidth = i7 + ((((Integer) this.f16194d.get(paddingTop)).intValue() - a) / 2);
                                m = ((((Integer) this.f16194d.get(paddingTop)).intValue() - a) / 2) + measuredHeight;
                            }
                            if (this.f16195e) {
                                childAt.layout(i8 + i11, measuredWidth, i6, m);
                            } else {
                                childAt.layout(i5 - i6, measuredWidth, (i5 - i8) - i11, m);
                            }
                            i8 += ((i11 + b) + i10) + this.f16192b;
                            i6 = measuredHeight;
                        }
                    }
                    b = 0;
                    i11 = 0;
                    a = measuredHeight;
                    i10 = measuredWidth;
                    m = (i8 + i11) + i10;
                    if (m <= i5) {
                        i6 = m;
                    } else {
                        i7 = i6 + this.f16191a;
                        paddingTop++;
                        i6 = (l + i11) + i10;
                        i8 = l;
                    }
                    measuredHeight = i7 + a;
                    if (this.f16193c == 16) {
                    }
                    m = measuredHeight;
                    measuredWidth = i7;
                    if (this.f16195e) {
                        childAt.layout(i8 + i11, measuredWidth, i6, m);
                    } else {
                        childAt.layout(i5 - i6, measuredWidth, (i5 - i8) - i11, m);
                    }
                    i8 += ((i11 + b) + i10) + this.f16192b;
                    i6 = measuredHeight;
                }
            }
        }
    }
}
