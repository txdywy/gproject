package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.android.vending.C0629a;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class DetailsTitleFlowLayout extends ViewGroup {
    public final int f13706a;
    public final int f13707b;
    public final Paint f13708c;
    public final int f13709d;
    public int[] f13710e;

    public DetailsTitleFlowLayout(Context context) {
        this(context, null);
    }

    public DetailsTitleFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.DetailsTitleFlowLayout);
        this.f13706a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f13707b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f13709d = obtainStyledAttributes.getInt(0, 8388611);
        int color = obtainStyledAttributes.getColor(3, resources.getColor(C7582R.color.play_fg_secondary));
        this.f13708c = new Paint();
        this.f13708c.setAntiAlias(true);
        this.f13708c.setColor(color);
        this.f13708c.setStyle(Style.FILL_AND_STROKE);
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int mode = MeasureSpec.getMode(i);
        int max = Math.max((MeasureSpec.getSize(i) - l) - m, 0);
        Object obj = mode == MemoryMappedFileBuffer.DEFAULT_SIZE ? 1 : null;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
        int i3 = 0;
        this.f13710e = new int[childCount];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = paddingTop;
        while (i4 < childCount) {
            int i10;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                childAt.measure(makeMeasureSpec, 0);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i8 + measuredWidth > max) {
                    i9 += i6;
                    i6 = 0;
                    i8 = 0;
                    i7 = 0;
                    if (i4 > 0) {
                        i5++;
                    }
                }
                paddingTop = (this.f13706a + measuredWidth) + i8;
                i8 = (this.f13706a + measuredWidth) + i7;
                i7 = Math.max(i6, measuredHeight);
                i6 = Math.max(i8, i3);
                this.f13710e[i5] = i8;
                i3 = i9;
                i9 = paddingTop;
            } else {
                i10 = i3;
                i3 = i9;
                i9 = i8;
                i8 = i7;
                i7 = i6;
                i6 = i10;
            }
            i4++;
            i10 = i6;
            i6 = i7;
            i7 = i8;
            i8 = i9;
            i9 = i3;
            i3 = i10;
        }
        setMeasuredDimension((Math.max(obj != null ? max : i3 - this.f13706a, 0) + l) + m, i9 + i6);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int i5 = (width - l) - m;
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i8 + measuredWidth > i5) {
                    i9 += i7;
                    i7 = 0;
                    i8 = 0;
                    i6++;
                }
                switch (C0357n.m2043a(this.f13709d, ai.f1848a.mo400k(this))) {
                    case 1:
                        paddingTop = ((width - this.f13710e[i6]) / 2) + i8;
                        break;
                    case 8388613:
                        paddingTop = ((i8 + width) - this.f13710e[i6]) - m;
                        break;
                    default:
                        paddingTop = i8 + l;
                        break;
                }
                paddingTop = k.a(width, measuredWidth, z2, paddingTop);
                childAt.layout(paddingTop, i9, paddingTop + measuredWidth, i9 + measuredHeight);
                i7 = Math.max(i7, measuredHeight);
                i8 += this.f13706a + measuredWidth;
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        int i = 0;
        super.onDraw(canvas);
        if (this.f13707b > 0) {
            int i2 = ai.f1848a.mo400k(this) == 0 ? 1 : 0;
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int childCount = getChildCount();
            while (i < childCount) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    int left;
                    int bottom;
                    if (i2 != 0) {
                        left = childAt.getLeft();
                        if (left > paddingLeft) {
                            bottom = (childAt.getBottom() + childAt.getTop()) / 2;
                            left -= this.f13706a / 2;
                            canvas.save();
                            canvas.drawCircle((float) left, (float) bottom, (float) (this.f13707b / 2), this.f13708c);
                            canvas.restore();
                        }
                    } else {
                        left = childAt.getRight();
                        if (left < width) {
                            bottom = (childAt.getBottom() + childAt.getTop()) / 2;
                            left += this.f13706a / 2;
                            canvas.save();
                            canvas.drawCircle((float) left, (float) bottom, (float) (this.f13707b / 2), this.f13708c);
                            canvas.restore();
                        }
                    }
                }
                i++;
            }
        }
    }
}
