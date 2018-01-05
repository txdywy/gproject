package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class dh extends ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int INDEX_BOTTOM = 2;
    public static final int INDEX_CENTER_VERTICAL = 0;
    public static final int INDEX_FILL = 3;
    public static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_GRAVITY_COUNT = 4;
    public boolean mBaselineAligned;
    public int mBaselineAlignedChildIndex;
    public int mBaselineChildTop;
    public Drawable mDivider;
    public int mDividerHeight;
    public int mDividerPadding;
    public int mDividerWidth;
    public int mGravity;
    public int[] mMaxAscent;
    public int[] mMaxDescent;
    public int mOrientation;
    public int mShowDividers;
    public int mTotalLength;
    public boolean mUseLargestChild;
    public float mWeightSum;

    public dh(Context context) {
        this(context, null);
    }

    public dh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public dh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        hc a = hc.m3769a(context, attributeSet, C0403j.LinearLayoutCompat, i, 0);
        int a2 = a.m3770a(C0403j.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        a2 = a.m3770a(C0403j.LinearLayoutCompat_android_gravity, -1);
        if (a2 >= 0) {
            setGravity(a2);
        }
        boolean a3 = a.m3772a(C0403j.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.mWeightSum = a.f3558b.getFloat(C0403j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = a.m3770a(C0403j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = a.m3772a(C0403j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m3771a(C0403j.LinearLayoutCompat_divider));
        this.mShowDividers = a.m3770a(C0403j.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = a.m3779e(C0403j.LinearLayoutCompat_dividerPadding, 0);
        a.f3558b.recycle();
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.mDivider) {
            this.mDivider = drawable;
            if (drawable != null) {
                this.mDividerWidth = drawable.getIntrinsicWidth();
                this.mDividerHeight = drawable.getIntrinsicHeight();
            } else {
                this.mDividerWidth = 0;
                this.mDividerHeight = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    protected void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (this.mOrientation == 1) {
                drawDividersVertical(canvas);
            } else {
                drawDividersHorizontal(canvas);
            }
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((di) virtualChildAt.getLayoutParams()).topMargin) - this.mDividerHeight);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            int height;
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                di diVar = (di) virtualChildAt2.getLayoutParams();
                height = diVar.bottomMargin + virtualChildAt2.getBottom();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    void drawDividersHorizontal(Canvas canvas) {
        di diVar;
        int virtualChildCount = getVirtualChildCount();
        boolean a = id.m3869a(this);
        int i = 0;
        while (i < virtualChildCount) {
            int right;
            View virtualChildAt = getVirtualChildAt(i);
            if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || !hasDividerBeforeChildAt(i))) {
                diVar = (di) virtualChildAt.getLayoutParams();
                if (a) {
                    right = diVar.rightMargin + virtualChildAt.getRight();
                } else {
                    right = (virtualChildAt.getLeft() - diVar.leftMargin) - this.mDividerWidth;
                }
                drawVerticalDivider(canvas, right);
            }
            i++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                diVar = (di) virtualChildAt2.getLayoutParams();
                if (a) {
                    right = (virtualChildAt2.getLeft() - diVar.leftMargin) - this.mDividerWidth;
                } else {
                    right = diVar.rightMargin + virtualChildAt2.getRight();
                }
            } else if (a) {
                right = getPaddingLeft();
            } else {
                right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public int getBaseline() {
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.mBaselineAlignedChildIndex) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.mBaselineAlignedChildIndex);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.mBaselineChildTop;
            if (this.mOrientation == 1) {
                i = this.mGravity & 112;
                if (i != 48) {
                    switch (i) {
                        case 16:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2);
                            break;
                        case 80:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
                            break;
                    }
                }
            }
            i = i2;
            return (((di) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.mBaselineAlignedChildIndex == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.mBaselineAlignedChildIndex = i;
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    protected void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            if ((this.mShowDividers & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.mShowDividers & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.mShowDividers & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        View virtualChildAt;
        this.mTotalLength = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        int i10 = this.mBaselineAlignedChildIndex;
        boolean z = this.mUseLargestChild;
        int i11 = 0;
        int i12 = 0;
        while (i12 < virtualChildCount) {
            int i13;
            int measuredWidth;
            Object obj4;
            int i14;
            int i15;
            View virtualChildAt2 = getVirtualChildAt(i12);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i12);
            } else {
                Object obj5;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i12)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    di diVar = (di) virtualChildAt2.getLayoutParams();
                    float f3 = f + diVar.f3374g;
                    if (mode2 == 1073741824 && diVar.height == 0 && diVar.f3374g > 0.0f) {
                        i3 = this.mTotalLength;
                        this.mTotalLength = Math.max(i3, (diVar.topMargin + i3) + diVar.bottomMargin);
                        obj3 = 1;
                    } else {
                        i3 = Integer.MIN_VALUE;
                        if (diVar.height == 0 && diVar.f3374g > 0.0f) {
                            i3 = 0;
                            diVar.height = -2;
                        }
                        i4 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i12, i, 0, i2, f3 == 0.0f ? this.mTotalLength : 0);
                        if (i4 != Integer.MIN_VALUE) {
                            diVar.height = i4;
                        }
                        i3 = virtualChildAt2.getMeasuredHeight();
                        int i16 = this.mTotalLength;
                        this.mTotalLength = Math.max(i16, (((i16 + i3) + diVar.topMargin) + diVar.bottomMargin) + getNextLocationOffset(virtualChildAt2));
                        if (z) {
                            i11 = Math.max(i3, i11);
                        }
                    }
                    if (i10 >= 0 && i10 == i12 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i12 >= i10 || diVar.f3374g <= 0.0f) {
                        Object obj6 = null;
                        if (mode == 1073741824 || diVar.width != -1) {
                            obj5 = obj2;
                        } else {
                            obj5 = 1;
                            obj6 = 1;
                        }
                        i13 = diVar.rightMargin + diVar.leftMargin;
                        measuredWidth = virtualChildAt2.getMeasuredWidth() + i13;
                        i6 = Math.max(i6, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i7, virtualChildAt2.getMeasuredState());
                        Object obj7 = (obj == null || diVar.width != -1) ? null : 1;
                        if (diVar.f3374g > 0.0f) {
                            if (obj6 != null) {
                                i3 = i13;
                            } else {
                                i3 = measuredWidth;
                            }
                            obj4 = obj7;
                            measuredWidth = Math.max(i9, i3);
                            i14 = i8;
                            f2 = f3;
                            i3 = i11;
                            i11 = combineMeasuredStates;
                            obj2 = obj5;
                            obj5 = obj3;
                            i15 = i6;
                        } else {
                            if (obj6 == null) {
                                i13 = measuredWidth;
                            }
                            i3 = Math.max(i8, i13);
                            obj4 = obj7;
                            measuredWidth = i9;
                            i14 = i3;
                            f2 = f3;
                            i3 = i11;
                            i11 = combineMeasuredStates;
                            obj2 = obj5;
                            obj5 = obj3;
                            i15 = i6;
                        }
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i3 = i11;
                f2 = f;
                obj4 = obj;
                measuredWidth = i9;
                i14 = i8;
                obj5 = obj3;
                i11 = i7;
                i15 = i6;
                i12 += getChildrenSkipCount(virtualChildAt2, i12);
                obj = obj4;
                i9 = measuredWidth;
                i8 = i14;
                i7 = i11;
                i6 = i15;
                i11 = i3;
                obj3 = obj5;
                f = f2;
            }
            i12++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerHeight;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.mTotalLength = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i5);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i5);
                    i3 = i5;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i5) + i5;
                } else {
                    di diVar2 = (di) virtualChildAt.getLayoutParams();
                    int i17 = this.mTotalLength;
                    this.mTotalLength = Math.max(i17, (diVar2.bottomMargin + ((i17 + i11) + diVar2.topMargin)) + getNextLocationOffset(virtualChildAt));
                    i3 = i5;
                }
                i5 = i3 + 1;
            }
        }
        this.mTotalLength += getPaddingTop() + getPaddingBottom();
        i4 = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumHeight()), i2, 0);
        i12 = (16777215 & i4) - this.mTotalLength;
        if (obj3 != null || (i12 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            this.mTotalLength = 0;
            Object obj8 = obj;
            i15 = i8;
            i14 = i7;
            int i18 = i6;
            int i19 = 0;
            int i20 = i12;
            float f4 = f;
            i16 = i20;
            while (i19 < virtualChildCount) {
                float f5;
                View virtualChildAt3 = getVirtualChildAt(i19);
                if (virtualChildAt3.getVisibility() != 8) {
                    diVar2 = (di) virtualChildAt3.getLayoutParams();
                    float f6 = diVar2.f3374g;
                    if (f6 > 0.0f) {
                        View view;
                        i5 = (int) ((((float) i16) * f6) / f4);
                        f6 = f4 - f6;
                        measuredWidth = i16 - i5;
                        i12 = getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + diVar2.leftMargin) + diVar2.rightMargin, diVar2.width);
                        if (diVar2.height != 0 || mode2 != 1073741824) {
                            i5 += virtualChildAt3.getMeasuredHeight();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            view = virtualChildAt3;
                        } else if (i5 > 0) {
                            view = virtualChildAt3;
                        } else {
                            i5 = 0;
                            view = virtualChildAt3;
                        }
                        view.measure(i12, MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE));
                        i12 = measuredWidth;
                        i16 = View.combineMeasuredStates(i14, virtualChildAt3.getMeasuredState() & -256);
                        f5 = f6;
                    } else {
                        f5 = f4;
                        i12 = i16;
                        i16 = i14;
                    }
                    i13 = diVar2.leftMargin + diVar2.rightMargin;
                    measuredWidth = virtualChildAt3.getMeasuredWidth() + i13;
                    i14 = Math.max(i18, measuredWidth);
                    Object obj9 = (mode == 1073741824 || diVar2.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i13 = measuredWidth;
                    }
                    measuredWidth = Math.max(i15, i13);
                    obj4 = (obj8 == null || diVar2.width != -1) ? null : 1;
                    i11 = this.mTotalLength;
                    this.mTotalLength = Math.max(i11, (diVar2.bottomMargin + ((virtualChildAt3.getMeasuredHeight() + i11) + diVar2.topMargin)) + getNextLocationOffset(virtualChildAt3));
                    i3 = measuredWidth;
                    i17 = i14;
                } else {
                    f5 = f4;
                    obj4 = obj8;
                    i3 = i15;
                    i17 = i18;
                    i12 = i16;
                    i16 = i14;
                }
                i19++;
                obj8 = obj4;
                i15 = i3;
                i14 = i16;
                i18 = i17;
                i16 = i12;
                f4 = f5;
            }
            this.mTotalLength += getPaddingTop() + getPaddingBottom();
            obj = obj8;
            i3 = i15;
            i7 = i14;
            i5 = i18;
        } else {
            i15 = Math.max(i8, i9);
            if (z && mode2 != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    virtualChildAt = getVirtualChildAt(i5);
                    if (!(virtualChildAt == null || virtualChildAt.getVisibility() == 8 || ((di) virtualChildAt.getLayoutParams()).f3374g <= 0.0f)) {
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(virtualChildAt.getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i11, MemoryMappedFileBuffer.DEFAULT_SIZE));
                    }
                }
            }
            i3 = i15;
            i5 = i6;
        }
        if (obj != null || mode == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i7), i4);
        if (obj2 != null) {
            forceUniformWidth(virtualChildCount, i2);
        }
    }

    private void forceUniformWidth(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), MemoryMappedFileBuffer.DEFAULT_SIZE);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                di diVar = (di) virtualChildAt.getLayoutParams();
                if (diVar.width == -1) {
                    int i4 = diVar.height;
                    diVar.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    diVar.height = i4;
                }
            }
        }
    }

    void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View virtualChildAt;
        di diVar;
        this.mTotalLength = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.mBaselineAligned;
        boolean z2 = this.mUseLargestChild;
        Object obj4 = mode == 1073741824 ? 1 : null;
        int i12 = 0;
        int i13 = 0;
        while (i13 < virtualChildCount) {
            int i14;
            int measuredHeight;
            View virtualChildAt2 = getVirtualChildAt(i13);
            if (virtualChildAt2 == null) {
                this.mTotalLength += measureNullChild(i13);
            } else {
                Object obj5;
                Object obj6;
                int i15;
                float f2;
                if (virtualChildAt2.getVisibility() != 8) {
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    di diVar2 = (di) virtualChildAt2.getLayoutParams();
                    float f3 = f + diVar2.f3374g;
                    if (mode == 1073741824 && diVar2.width == 0 && diVar2.f3374g > 0.0f) {
                        if (obj4 != null) {
                            this.mTotalLength += diVar2.leftMargin + diVar2.rightMargin;
                        } else {
                            i3 = this.mTotalLength;
                            this.mTotalLength = Math.max(i3, (diVar2.leftMargin + i3) + diVar2.rightMargin);
                        }
                        if (z) {
                            i3 = MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt2.measure(i3, i3);
                        } else {
                            obj3 = 1;
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                        if (diVar2.width == 0 && diVar2.f3374g > 0.0f) {
                            i3 = 0;
                            diVar2.width = -2;
                        }
                        int i16 = i3;
                        measureChildBeforeLayout(virtualChildAt2, i13, i, f3 == 0.0f ? this.mTotalLength : 0, i2, 0);
                        if (i16 != Integer.MIN_VALUE) {
                            diVar2.width = i16;
                        }
                        i3 = virtualChildAt2.getMeasuredWidth();
                        if (obj4 != null) {
                            this.mTotalLength += ((diVar2.leftMargin + i3) + diVar2.rightMargin) + getNextLocationOffset(virtualChildAt2);
                        } else {
                            int i17 = this.mTotalLength;
                            this.mTotalLength = Math.max(i17, (((i17 + i3) + diVar2.leftMargin) + diVar2.rightMargin) + getNextLocationOffset(virtualChildAt2));
                        }
                        if (z2) {
                            i12 = Math.max(i3, i12);
                        }
                    }
                    Object obj7 = null;
                    if (mode2 == 1073741824 || diVar2.height != -1) {
                        obj5 = obj2;
                    } else {
                        obj5 = 1;
                        obj7 = 1;
                    }
                    i14 = diVar2.bottomMargin + diVar2.topMargin;
                    measuredHeight = virtualChildAt2.getMeasuredHeight() + i14;
                    int combineMeasuredStates = View.combineMeasuredStates(i9, virtualChildAt2.getMeasuredState());
                    if (z) {
                        i9 = virtualChildAt2.getBaseline();
                        if (i9 != -1) {
                            i4 = ((((diVar2.f3375h < 0 ? this.mGravity : diVar2.f3375h) & 112) >> 4) & -2) >> 1;
                            iArr[i4] = Math.max(iArr[i4], i9);
                            iArr2[i4] = Math.max(iArr2[i4], measuredHeight - i9);
                        }
                    }
                    i9 = Math.max(i8, measuredHeight);
                    Object obj8 = (obj == null || diVar2.height != -1) ? null : 1;
                    if (diVar2.f3374g > 0.0f) {
                        if (obj7 != null) {
                            i3 = i14;
                        } else {
                            i3 = measuredHeight;
                        }
                        obj6 = obj8;
                        measuredHeight = Math.max(i11, i3);
                        i15 = i10;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj2 = obj5;
                        obj5 = obj3;
                        i5 = i9;
                    } else {
                        if (obj7 == null) {
                            i14 = measuredHeight;
                        }
                        i3 = Math.max(i10, i14);
                        obj6 = obj8;
                        measuredHeight = i11;
                        i15 = i3;
                        f2 = f3;
                        i3 = i12;
                        i12 = combineMeasuredStates;
                        obj2 = obj5;
                        obj5 = obj3;
                        i5 = i9;
                    }
                } else {
                    i3 = i12;
                    f2 = f;
                    obj6 = obj;
                    measuredHeight = i11;
                    i15 = i10;
                    obj5 = obj3;
                    i12 = i9;
                    i5 = i8;
                }
                i13 += getChildrenSkipCount(virtualChildAt2, i13);
                obj = obj6;
                i11 = measuredHeight;
                i10 = i15;
                i9 = i12;
                i8 = i5;
                i12 = i3;
                obj3 = obj5;
                f = f2;
            }
            i13++;
        }
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i6 = i8;
        } else {
            i6 = Math.max(i8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            i7 = 0;
            while (i7 < virtualChildCount) {
                virtualChildAt = getVirtualChildAt(i7);
                if (virtualChildAt == null) {
                    this.mTotalLength += measureNullChild(i7);
                    i3 = i7;
                } else if (virtualChildAt.getVisibility() == 8) {
                    i3 = getChildrenSkipCount(virtualChildAt, i7) + i7;
                } else {
                    diVar = (di) virtualChildAt.getLayoutParams();
                    if (obj4 != null) {
                        this.mTotalLength = ((diVar.rightMargin + (diVar.leftMargin + i12)) + getNextLocationOffset(virtualChildAt)) + this.mTotalLength;
                        i3 = i7;
                    } else {
                        i4 = this.mTotalLength;
                        this.mTotalLength = Math.max(i4, (diVar.rightMargin + ((i4 + i12) + diVar.leftMargin)) + getNextLocationOffset(virtualChildAt));
                        i3 = i7;
                    }
                }
                i7 = i3 + 1;
            }
        }
        this.mTotalLength += getPaddingLeft() + getPaddingRight();
        i8 = View.resolveSizeAndState(Math.max(this.mTotalLength, getSuggestedMinimumWidth()), i, 0);
        i4 = (16777215 & i8) - this.mTotalLength;
        View virtualChildAt3;
        if (obj3 != null || (i4 != 0 && f > 0.0f)) {
            if (this.mWeightSum > 0.0f) {
                f = this.mWeightSum;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            i6 = -1;
            this.mTotalLength = 0;
            float f4 = f;
            Object obj9 = obj;
            i12 = i10;
            i14 = i9;
            int i18 = 0;
            while (i18 < virtualChildCount) {
                float f5;
                Object obj10;
                virtualChildAt3 = getVirtualChildAt(i18);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    f5 = f4;
                    i7 = i4;
                    i17 = i12;
                    obj10 = obj9;
                    i4 = i14;
                    i14 = i6;
                } else {
                    float f6;
                    diVar = (di) virtualChildAt3.getLayoutParams();
                    float f7 = diVar.f3374g;
                    if (f7 > 0.0f) {
                        i7 = (int) ((((float) i4) * f7) / f4);
                        f7 = f4 - f7;
                        i4 -= i7;
                        i5 = getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + diVar.topMargin) + diVar.bottomMargin, diVar.height);
                        if (diVar.width != 0 || mode != 1073741824) {
                            i7 += virtualChildAt3.getMeasuredWidth();
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            virtualChildAt = virtualChildAt3;
                        } else if (i7 > 0) {
                            virtualChildAt = virtualChildAt3;
                        } else {
                            i7 = 0;
                            virtualChildAt = virtualChildAt3;
                        }
                        virtualChildAt.measure(MeasureSpec.makeMeasureSpec(i7, MemoryMappedFileBuffer.DEFAULT_SIZE), i5);
                        i5 = View.combineMeasuredStates(i14, virtualChildAt3.getMeasuredState() & -16777216);
                        f6 = f7;
                        measuredHeight = i4;
                    } else {
                        measuredHeight = i4;
                        i5 = i14;
                        f6 = f4;
                    }
                    if (obj4 != null) {
                        this.mTotalLength += ((virtualChildAt3.getMeasuredWidth() + diVar.leftMargin) + diVar.rightMargin) + getNextLocationOffset(virtualChildAt3);
                    } else {
                        i7 = this.mTotalLength;
                        this.mTotalLength = Math.max(i7, (((virtualChildAt3.getMeasuredWidth() + i7) + diVar.leftMargin) + diVar.rightMargin) + getNextLocationOffset(virtualChildAt3));
                    }
                    Object obj11 = (mode2 == 1073741824 || diVar.height != -1) ? null : 1;
                    i13 = diVar.topMargin + diVar.bottomMargin;
                    i4 = virtualChildAt3.getMeasuredHeight() + i13;
                    i6 = Math.max(i6, i4);
                    if (obj11 != null) {
                        i7 = i13;
                    } else {
                        i7 = i4;
                    }
                    i13 = Math.max(i12, i7);
                    obj11 = (obj9 == null || diVar.height != -1) ? null : 1;
                    if (z) {
                        i17 = virtualChildAt3.getBaseline();
                        if (i17 != -1) {
                            i3 = ((((diVar.f3375h < 0 ? this.mGravity : diVar.f3375h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i17);
                            iArr2[i3] = Math.max(iArr2[i3], i4 - i17);
                        }
                    }
                    f5 = f6;
                    i17 = i13;
                    i4 = i5;
                    obj10 = obj11;
                    i14 = i6;
                    i7 = measuredHeight;
                }
                i18++;
                obj9 = obj10;
                i12 = i17;
                i6 = i14;
                i14 = i4;
                f4 = f5;
                i4 = i7;
            }
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i6 = Math.max(i6, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj = obj9;
            i3 = i12;
            i9 = i14;
            i7 = i6;
        } else {
            i7 = Math.max(i10, i11);
            if (z2 && mode != 1073741824) {
                for (i13 = 0; i13 < virtualChildCount; i13++) {
                    virtualChildAt3 = getVirtualChildAt(i13);
                    if (!(virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8 || ((di) virtualChildAt3.getLayoutParams()).f3374g <= 0.0f)) {
                        virtualChildAt3.measure(MeasureSpec.makeMeasureSpec(i12, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
                    }
                }
            }
            i3 = i7;
            i7 = i6;
        }
        if (obj != null || mode2 == 1073741824) {
            i3 = i7;
        }
        setMeasuredDimension((-16777216 & i9) | i8, View.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i9 << 16));
        if (obj2 != null) {
            forceUniformHeight(virtualChildCount, i);
        }
    }

    private void forceUniformHeight(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                di diVar = (di) virtualChildAt.getLayoutParams();
                if (diVar.height == -1) {
                    int i4 = diVar.width;
                    diVar.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    diVar.width = i4;
                }
            }
        }
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    void layoutVertical(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.mGravity & 8388615;
        switch (this.mGravity & 112) {
            case 16:
                i5 = getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
                break;
            case 80:
                i5 = ((getPaddingTop() + i4) - i2) - this.mTotalLength;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt == null) {
                i8 += measureNullChild(i7);
                i5 = i7;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i9;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                di diVar = (di) virtualChildAt.getLayoutParams();
                i5 = diVar.f3375h;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (C0357n.m2043a(i5, ai.f1848a.mo400k(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + diVar.leftMargin) - diVar.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - diVar.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + diVar.leftMargin;
                        break;
                }
                if (hasDividerBeforeChildAt(i7)) {
                    i5 = this.mDividerHeight + i8;
                } else {
                    i5 = i8;
                }
                int i10 = i5 + diVar.topMargin;
                setChildFrame(virtualChildAt, i9, i10 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                i8 = i10 + ((diVar.bottomMargin + measuredHeight) + getNextLocationOffset(virtualChildAt));
                i5 = getChildrenSkipCount(virtualChildAt, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    void layoutHorizontal(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = id.m3869a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.mGravity & 8388615;
        int i8 = this.mGravity & 112;
        boolean z = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        switch (C0357n.m2043a(i7, ai.f1848a.mo400k(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.mTotalLength;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i10);
                i7 = i9;
            } else if (virtualChildAt.getVisibility() != 8) {
                int i11;
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                di diVar = (di) virtualChildAt.getLayoutParams();
                if (!z || diVar.height == -1) {
                    i7 = -1;
                } else {
                    i7 = virtualChildAt.getBaseline();
                }
                int i12 = diVar.f3375h;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & 112) {
                    case 16:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + diVar.topMargin) - diVar.bottomMargin;
                        break;
                    case 48:
                        i11 = paddingTop + diVar.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[1] - i7;
                            break;
                        }
                        break;
                    case 80:
                        i11 = (paddingBottom - measuredHeight) - diVar.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                if (hasDividerBeforeChildAt(i10)) {
                    i7 = this.mDividerWidth + paddingLeft;
                } else {
                    i7 = paddingLeft;
                }
                paddingLeft = i7 + diVar.leftMargin;
                setChildFrame(virtualChildAt, paddingLeft + getLocationOffset(virtualChildAt), i11, measuredWidth, measuredHeight);
                paddingLeft += (diVar.rightMargin + measuredWidth) + getNextLocationOffset(virtualChildAt);
                i7 = getChildrenSkipCount(virtualChildAt, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            int i2;
            if ((8388615 & i) == 0) {
                i2 = 8388611 | i;
            } else {
                i2 = i;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.mGravity = i2;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.mGravity;
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.mGravity & 8388615) != i2) {
            this.mGravity = i2 | (this.mGravity & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.mGravity & 112) != i2) {
            this.mGravity = i2 | (this.mGravity & -113);
            requestLayout();
        }
    }

    public di generateLayoutParams(AttributeSet attributeSet) {
        return new di(getContext(), attributeSet);
    }

    protected di generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new di(-2);
        }
        if (this.mOrientation == 1) {
            return new di(-1);
        }
        return null;
    }

    protected di generateLayoutParams(LayoutParams layoutParams) {
        return new di(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof di;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(dh.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(dh.class.getName());
    }
}
