package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements C4871a {
    public int f25190a;
    public int f25191b;
    public int f25192c;
    public int f25193d;
    public int f25194e;
    public Drawable f25195f;
    public Drawable f25196g;
    public int f25197h;
    public int f25198i;
    public int f25199j;
    public int f25200k;
    public int[] f25201l;
    public SparseIntArray f25202m;
    public C4873c f25203n;
    public List f25204o;
    public C4874d f25205p;

    public class LayoutParams extends MarginLayoutParams implements FlexItem {
        public static final Creator CREATOR = new C4876f();
        public int f25180a = 1;
        public float f25181b = 0.0f;
        public float f25182c = 1.0f;
        public int f25183d = -1;
        public float f25184e = -1.0f;
        public int f25185f;
        public int f25186g;
        public int f25187h = 16777215;
        public int f25188i = 16777215;
        public boolean f25189j;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4877g.FlexboxLayout_Layout);
            this.f25180a = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_Layout_layout_order, 1);
            this.f25181b = obtainStyledAttributes.getFloat(C4877g.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f25182c = obtainStyledAttributes.getFloat(C4877g.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f25183d = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f25184e = obtainStyledAttributes.getFraction(C4877g.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f25185f = obtainStyledAttributes.getDimensionPixelSize(C4877g.FlexboxLayout_Layout_layout_minWidth, 0);
            this.f25186g = obtainStyledAttributes.getDimensionPixelSize(C4877g.FlexboxLayout_Layout_layout_minHeight, 0);
            this.f25187h = obtainStyledAttributes.getDimensionPixelSize(C4877g.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f25188i = obtainStyledAttributes.getDimensionPixelSize(C4877g.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f25189j = obtainStyledAttributes.getBoolean(C4877g.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public final int mo4425a() {
            return this.width;
        }

        public final int mo4426b() {
            return this.height;
        }

        public final int mo4427c() {
            return this.f25180a;
        }

        public final float mo4428d() {
            return this.f25181b;
        }

        public final float mo4429e() {
            return this.f25182c;
        }

        public final int mo4430f() {
            return this.f25183d;
        }

        public final int mo4431g() {
            return this.f25185f;
        }

        public final int mo4432h() {
            return this.f25186g;
        }

        public final int mo4433i() {
            return this.f25187h;
        }

        public final int mo4434j() {
            return this.f25188i;
        }

        public final boolean mo4435k() {
            return this.f25189j;
        }

        public final float mo4436l() {
            return this.f25184e;
        }

        public final int mo4437m() {
            return this.leftMargin;
        }

        public final int mo4438n() {
            return this.topMargin;
        }

        public final int mo4439o() {
            return this.rightMargin;
        }

        public final int mo4440p() {
            return this.bottomMargin;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f25180a);
            parcel.writeFloat(this.f25181b);
            parcel.writeFloat(this.f25182c);
            parcel.writeInt(this.f25183d);
            parcel.writeFloat(this.f25184e);
            parcel.writeInt(this.f25185f);
            parcel.writeInt(this.f25186g);
            parcel.writeInt(this.f25187h);
            parcel.writeInt(this.f25188i);
            parcel.writeByte(this.f25189j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        protected LayoutParams(Parcel parcel) {
            boolean z = true;
            super(0, 0);
            this.f25180a = parcel.readInt();
            this.f25181b = parcel.readFloat();
            this.f25182c = parcel.readFloat();
            this.f25183d = parcel.readInt();
            this.f25184e = parcel.readFloat();
            this.f25185f = parcel.readInt();
            this.f25186g = parcel.readInt();
            this.f25187h = parcel.readInt();
            this.f25188i = parcel.readInt();
            if (parcel.readByte() == (byte) 0) {
                z = false;
            }
            this.f25189j = z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25203n = new C4873c(this);
        this.f25204o = new ArrayList();
        this.f25205p = new C4874d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4877g.FlexboxLayout, i, 0);
        this.f25190a = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_flexDirection, 0);
        this.f25191b = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_flexWrap, 0);
        this.f25192c = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_justifyContent, 0);
        this.f25193d = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_alignItems, 4);
        this.f25194e = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_alignContent, 5);
        Drawable drawable = obtainStyledAttributes.getDrawable(C4877g.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        drawable = obtainStyledAttributes.getDrawable(C4877g.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
        }
        drawable = obtainStyledAttributes.getDrawable(C4877g.FlexboxLayout_dividerDrawableVertical);
        if (drawable != null) {
            setDividerDrawableVertical(drawable);
        }
        int i2 = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f25198i = i2;
            this.f25197h = i2;
        }
        i2 = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_showDividerVertical, 0);
        if (i2 != 0) {
            this.f25198i = i2;
        }
        i2 = obtainStyledAttributes.getInt(C4877g.FlexboxLayout_showDividerHorizontal, 0);
        if (i2 != 0) {
            this.f25197h = i2;
        }
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25202m == null) {
            this.f25202m = new SparseIntArray(getChildCount());
        }
        if (this.f25203n.m22884b(this.f25202m)) {
            this.f25201l = this.f25203n.m22881a(this.f25202m);
        }
        switch (this.f25190a) {
            case 0:
            case 1:
                m22802b(i, i2);
                return;
            case 2:
            case 3:
                this.f25204o.clear();
                this.f25205p.m22885a();
                this.f25203n.m22880a(this.f25205p, i, i2);
                this.f25204o = this.f25205p.f25226a;
                this.f25203n.m22876a(i, i2);
                this.f25203n.m22877a(i, i2, getPaddingLeft() + getPaddingRight());
                this.f25203n.m22875a();
                m22797a(this.f25190a, i, i2, this.f25205p.f25227b);
                return;
            default:
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f25190a);
        }
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public final View mo4442a(int i) {
        return getChildAt(i);
    }

    private final View m22805c(int i) {
        if (i < 0 || i >= this.f25201l.length) {
            return null;
        }
        return getChildAt(this.f25201l[i]);
    }

    public final View q_(int i) {
        return m22805c(i);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.f25202m == null) {
            this.f25202m = new SparseIntArray(getChildCount());
        }
        this.f25201l = this.f25203n.m22882a(view, i, layoutParams, this.f25202m);
        super.addView(view, i, layoutParams);
    }

    private final void m22802b(int i, int i2) {
        this.f25204o.clear();
        this.f25205p.m22885a();
        this.f25203n.m22883b(this.f25205p, i, i2);
        this.f25204o = this.f25205p.f25226a;
        this.f25203n.m22876a(i, i2);
        if (this.f25193d == 3) {
            int i3 = 0;
            for (C4872b c4872b : this.f25204o) {
                int i4 = Integer.MIN_VALUE;
                for (int i5 = i3; i5 < c4872b.f25213h + i3; i5++) {
                    View c = m22805c(i5);
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (this.f25191b != 2) {
                        i4 = Math.max(i4, layoutParams.bottomMargin + (c.getHeight() + Math.max(c4872b.f25217l - c.getBaseline(), layoutParams.topMargin)));
                    } else {
                        i4 = Math.max(i4, (layoutParams.topMargin + c.getHeight()) + Math.max((c4872b.f25217l - c.getMeasuredHeight()) + c.getBaseline(), layoutParams.bottomMargin));
                    }
                }
                c4872b.f25212g = i4;
                i3 = c4872b.f25213h + i3;
            }
        }
        this.f25203n.m22877a(i, i2, getPaddingTop() + getPaddingBottom());
        this.f25203n.m22875a();
        m22797a(this.f25190a, i, i2, this.f25205p.f25227b);
    }

    private final void m22797a(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i3);
        int size2 = MeasureSpec.getSize(i3);
        switch (i) {
            case 0:
            case 1:
                paddingBottom = getPaddingBottom() + (getSumOfCrossSize() + getPaddingTop());
                largestMainSize = getLargestMainSize();
                break;
            case 2:
            case 3:
                paddingBottom = getLargestMainSize();
                largestMainSize = (getSumOfCrossSize() + getPaddingLeft()) + getPaddingRight();
                break;
            default:
                throw new IllegalArgumentException("Invalid flex direction: " + i);
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                if (size < largestMainSize) {
                    i4 = ai.m1819a(i4, 16777216);
                } else {
                    size = largestMainSize;
                }
                mode = ai.m1820a(size, i2, i4);
                size = i4;
                break;
            case 0:
                mode = ai.m1820a(largestMainSize, i2, i4);
                size = i4;
                break;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                if (size < largestMainSize) {
                    i4 = ai.m1819a(i4, 16777216);
                }
                mode = ai.m1820a(size, i2, i4);
                size = i4;
                break;
            default:
                throw new IllegalStateException("Unknown width mode is set: " + mode);
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                if (size2 < paddingBottom) {
                    largestMainSize = ai.m1819a(size, 256);
                    size = size2;
                } else {
                    largestMainSize = size;
                    size = paddingBottom;
                }
                size = ai.m1820a(size, i3, largestMainSize);
                break;
            case 0:
                size = ai.m1820a(paddingBottom, i3, size);
                break;
            case MemoryMappedFileBuffer.DEFAULT_SIZE /*1073741824*/:
                if (size2 < paddingBottom) {
                    size = ai.m1819a(size, 256);
                }
                size = ai.m1820a(size2, i3, size);
                break;
            default:
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
        }
        setMeasuredDimension(mode, size);
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C4872b c4872b : this.f25204o) {
            i = Math.max(i, c4872b.f25210e);
        }
        return i;
    }

    public int getSumOfCrossSize() {
        int size = this.f25204o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C4872b c4872b = (C4872b) this.f25204o.get(i2);
            if (m22807d(i2)) {
                if (mo4447b()) {
                    i += this.f25199j;
                } else {
                    i += this.f25200k;
                }
            }
            if (m22808e(i2)) {
                if (mo4447b()) {
                    i += this.f25199j;
                } else {
                    i += this.f25200k;
                }
            }
            i += c4872b.f25212g;
        }
        return i;
    }

    public final boolean mo4447b() {
        return this.f25190a == 0 || this.f25190a == 1;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = false;
        boolean z3 = true;
        int k = ai.f1848a.mo400k(this);
        boolean z4;
        boolean z5;
        switch (this.f25190a) {
            case 0:
                m22800a(k == 1, i, i2, i3, i4);
                return;
            case 1:
                if (k != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m22800a(z4, i, i2, i3, i4);
                return;
            case 2:
                if (k == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f25191b == 2) {
                    if (z5) {
                        z3 = false;
                    }
                    z4 = z3;
                } else {
                    z4 = z5;
                }
                m22801a(z4, false, i, i2, i3, i4);
                return;
            case 3:
                if (k == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.f25191b == 2) {
                    if (!z5) {
                        z2 = true;
                    }
                    z4 = z2;
                } else {
                    z4 = z5;
                }
                m22801a(z4, true, i, i2, i3, i4);
                return;
            default:
                throw new IllegalStateException("Invalid flex direction is set: " + this.f25190a);
        }
    }

    private final void m22800a(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f25204o.size();
        for (int i6 = 0; i6 < size; i6++) {
            float f;
            float f2;
            C4872b c4872b = (C4872b) this.f25204o.get(i6);
            if (m22807d(i6)) {
                paddingBottom -= this.f25199j;
                paddingTop += this.f25199j;
            }
            float f3 = 0.0f;
            switch (this.f25192c) {
                case 0:
                    f = (float) paddingLeft;
                    f2 = (float) (i5 - paddingRight);
                    break;
                case 1:
                    f = (float) ((i5 - c4872b.f25210e) + paddingRight);
                    f2 = (float) (c4872b.f25210e - paddingLeft);
                    break;
                case 2:
                    f = (((float) (i5 - c4872b.f25210e)) / 2.0f) + ((float) paddingLeft);
                    f2 = ((float) (i5 - paddingRight)) - (((float) (i5 - c4872b.f25210e)) / 2.0f);
                    break;
                case 3:
                    f = (float) paddingLeft;
                    int a = c4872b.m22853a();
                    f3 = ((float) (i5 - c4872b.f25210e)) / (a != 1 ? (float) (a - 1) : 1.0f);
                    f2 = (float) (i5 - paddingRight);
                    break;
                case 4:
                    int a2 = c4872b.m22853a();
                    if (a2 != 0) {
                        f3 = ((float) (i5 - c4872b.f25210e)) / ((float) a2);
                    }
                    f = (f3 / 2.0f) + ((float) paddingLeft);
                    f2 = ((float) (i5 - paddingRight)) - (f3 / 2.0f);
                    break;
                default:
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f25192c);
            }
            float max = Math.max(f3, 0.0f);
            int i7 = 0;
            float f4 = f;
            f = f2;
            while (i7 < c4872b.f25213h) {
                int i8 = c4872b.f25220o + i7;
                View c = m22805c(i8);
                if (!(c == null || c.getVisibility() == 8)) {
                    float f5;
                    float f6;
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    f4 += (float) layoutParams.leftMargin;
                    f3 = f - ((float) layoutParams.rightMargin);
                    int i9 = 0;
                    int i10 = 0;
                    if (m22806c(i8, i7)) {
                        i9 = this.f25200k;
                        f5 = f3 - ((float) i9);
                        f6 = ((float) i9) + f4;
                    } else {
                        f5 = f3;
                        f6 = f4;
                    }
                    if (i7 == c4872b.f25213h - 1 && (this.f25198i & 4) > 0) {
                        i10 = this.f25200k;
                    }
                    if (this.f25191b == 2) {
                        if (z) {
                            this.f25203n.m22878a(c, c4872b, Math.round(f5) - c.getMeasuredWidth(), paddingBottom - c.getMeasuredHeight(), Math.round(f5), paddingBottom);
                        } else {
                            this.f25203n.m22878a(c, c4872b, Math.round(f6), paddingBottom - c.getMeasuredHeight(), Math.round(f6) + c.getMeasuredWidth(), paddingBottom);
                        }
                    } else if (z) {
                        this.f25203n.m22878a(c, c4872b, Math.round(f5) - c.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + c.getMeasuredHeight());
                    } else {
                        this.f25203n.m22878a(c, c4872b, Math.round(f6), paddingTop, Math.round(f6) + c.getMeasuredWidth(), paddingTop + c.getMeasuredHeight());
                    }
                    f4 = f6 + ((((float) c.getMeasuredWidth()) + max) + ((float) layoutParams.rightMargin));
                    f = f5 - ((((float) c.getMeasuredWidth()) + max) + ((float) layoutParams.leftMargin));
                    if (z) {
                        c4872b.m22854a(c, i10, 0, i9, 0);
                        f2 = f;
                        f = f4;
                        i7++;
                        f4 = f;
                        f = f2;
                    } else {
                        c4872b.m22854a(c, i9, 0, i10, 0);
                    }
                }
                f2 = f;
                f = f4;
                i7++;
                f4 = f;
                f = f2;
            }
            paddingTop += c4872b.f25212g;
            paddingBottom -= c4872b.f25212g;
        }
    }

    private final void m22801a(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i5 = i4 - i2;
        int i6 = (i3 - i) - paddingRight;
        int size = this.f25204o.size();
        for (int i7 = 0; i7 < size; i7++) {
            float f;
            float f2;
            C4872b c4872b = (C4872b) this.f25204o.get(i7);
            if (m22807d(i7)) {
                paddingLeft += this.f25200k;
                i6 -= this.f25200k;
            }
            float f3 = 0.0f;
            switch (this.f25192c) {
                case 0:
                    f = (float) paddingTop;
                    f2 = (float) (i5 - paddingBottom);
                    break;
                case 1:
                    f = (float) ((i5 - c4872b.f25210e) + paddingBottom);
                    f2 = (float) (c4872b.f25210e - paddingTop);
                    break;
                case 2:
                    f = (((float) (i5 - c4872b.f25210e)) / 2.0f) + ((float) paddingTop);
                    f2 = ((float) (i5 - paddingBottom)) - (((float) (i5 - c4872b.f25210e)) / 2.0f);
                    break;
                case 3:
                    f = (float) paddingTop;
                    paddingRight = c4872b.m22853a();
                    f3 = ((float) (i5 - c4872b.f25210e)) / (paddingRight != 1 ? (float) (paddingRight - 1) : 1.0f);
                    f2 = (float) (i5 - paddingBottom);
                    break;
                case 4:
                    int a = c4872b.m22853a();
                    if (a != 0) {
                        f3 = ((float) (i5 - c4872b.f25210e)) / ((float) a);
                    }
                    f = (f3 / 2.0f) + ((float) paddingTop);
                    f2 = ((float) (i5 - paddingBottom)) - (f3 / 2.0f);
                    break;
                default:
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f25192c);
            }
            float max = Math.max(f3, 0.0f);
            int i8 = 0;
            float f4 = f;
            f = f2;
            while (i8 < c4872b.f25213h) {
                int i9 = c4872b.f25220o + i8;
                View c = m22805c(i9);
                if (!(c == null || c.getVisibility() == 8)) {
                    float f5;
                    float f6;
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    f4 += (float) layoutParams.topMargin;
                    f3 = f - ((float) layoutParams.bottomMargin);
                    int i10 = 0;
                    int i11 = 0;
                    if (m22806c(i9, i8)) {
                        i10 = this.f25199j;
                        f5 = f3 - ((float) i10);
                        f6 = ((float) i10) + f4;
                    } else {
                        f5 = f3;
                        f6 = f4;
                    }
                    if (i8 == c4872b.f25213h - 1 && (this.f25197h & 4) > 0) {
                        i11 = this.f25199j;
                    }
                    if (z) {
                        if (z2) {
                            this.f25203n.m22879a(c, c4872b, true, i6 - c.getMeasuredWidth(), Math.round(f5) - c.getMeasuredHeight(), i6, Math.round(f5));
                        } else {
                            this.f25203n.m22879a(c, c4872b, true, i6 - c.getMeasuredWidth(), Math.round(f6), i6, Math.round(f6) + c.getMeasuredHeight());
                        }
                    } else if (z2) {
                        this.f25203n.m22879a(c, c4872b, false, paddingLeft, Math.round(f5) - c.getMeasuredHeight(), paddingLeft + c.getMeasuredWidth(), Math.round(f5));
                    } else {
                        this.f25203n.m22879a(c, c4872b, false, paddingLeft, Math.round(f6), paddingLeft + c.getMeasuredWidth(), Math.round(f6) + c.getMeasuredHeight());
                    }
                    f4 = f6 + ((((float) c.getMeasuredHeight()) + max) + ((float) layoutParams.bottomMargin));
                    f = f5 - ((((float) c.getMeasuredHeight()) + max) + ((float) layoutParams.topMargin));
                    if (z2) {
                        c4872b.m22854a(c, 0, i11, 0, i10);
                        f2 = f;
                        f = f4;
                        i8++;
                        f4 = f;
                        f = f2;
                    } else {
                        c4872b.m22854a(c, 0, i10, 0, i11);
                    }
                }
                f2 = f;
                f = f4;
                i8++;
                f4 = f;
                f = f2;
            }
            paddingLeft += c4872b.f25212g;
            i6 -= c4872b.f25212g;
        }
    }

    protected void onDraw(Canvas canvas) {
        boolean z = false;
        boolean z2 = true;
        if (this.f25196g != null || this.f25195f != null) {
            if (this.f25197h != 0 || this.f25198i != 0) {
                int k = ai.f1848a.mo400k(this);
                boolean z3;
                switch (this.f25190a) {
                    case 0:
                        if (k == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f25191b != 2) {
                            z2 = false;
                        }
                        m22799a(canvas, z3, z2);
                        return;
                    case 1:
                        if (k != 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f25191b != 2) {
                            z2 = false;
                        }
                        m22799a(canvas, z3, z2);
                        return;
                    case 2:
                        if (k == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f25191b != 2) {
                            z2 = z3;
                        } else if (z3) {
                            z2 = false;
                        }
                        m22804b(canvas, z2, false);
                        return;
                    case 3:
                        if (k == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f25191b != 2) {
                            z = z3;
                        } else if (!z3) {
                            z = true;
                        }
                        m22804b(canvas, z, true);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private final void m22799a(Canvas canvas, boolean z, boolean z2) {
        int i = 0;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f25204o.size();
        int i2 = 0;
        while (i2 < size) {
            int left;
            C4872b c4872b = (C4872b) this.f25204o.get(i2);
            int i3 = i;
            for (i = 0; i < c4872b.f25213h; i++) {
                View c = m22805c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m22806c(i3, i)) {
                        int right;
                        if (z) {
                            right = c.getRight() + layoutParams.rightMargin;
                        } else {
                            right = (c.getLeft() - layoutParams.leftMargin) - this.f25200k;
                        }
                        m22798a(canvas, right, c4872b.f25207b, c4872b.f25212g);
                    }
                    if (i == c4872b.f25213h - 1 && (this.f25198i & 4) > 0) {
                        if (z) {
                            left = (c.getLeft() - layoutParams.leftMargin) - this.f25200k;
                        } else {
                            left = layoutParams.rightMargin + c.getRight();
                        }
                        m22798a(canvas, left, c4872b.f25207b, c4872b.f25212g);
                    }
                    i3++;
                }
            }
            if (m22807d(i2)) {
                if (z2) {
                    left = c4872b.f25209d;
                } else {
                    left = c4872b.f25207b - this.f25199j;
                }
                m22803b(canvas, paddingLeft, left, max);
            }
            if (m22808e(i2) && (this.f25197h & 4) > 0) {
                int i4;
                if (z2) {
                    i4 = c4872b.f25207b - this.f25199j;
                } else {
                    i4 = c4872b.f25209d;
                }
                m22803b(canvas, paddingLeft, i4, max);
            }
            i2++;
            i = i3;
        }
    }

    private final void m22804b(Canvas canvas, boolean z, boolean z2) {
        int i = 0;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f25204o.size();
        int i2 = 0;
        while (i2 < size) {
            C4872b c4872b = (C4872b) this.f25204o.get(i2);
            int i3 = i;
            for (i = 0; i < c4872b.f25213h; i++) {
                int top;
                View c = m22805c(i3);
                if (!(c == null || c.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                    if (m22806c(i3, i)) {
                        int bottom;
                        if (z2) {
                            bottom = c.getBottom() + layoutParams.bottomMargin;
                        } else {
                            bottom = (c.getTop() - layoutParams.topMargin) - this.f25199j;
                        }
                        m22803b(canvas, c4872b.f25206a, bottom, c4872b.f25212g);
                    }
                    if (i == c4872b.f25213h - 1 && (this.f25197h & 4) > 0) {
                        if (z2) {
                            top = (c.getTop() - layoutParams.topMargin) - this.f25199j;
                        } else {
                            top = layoutParams.bottomMargin + c.getBottom();
                        }
                        m22803b(canvas, c4872b.f25206a, top, c4872b.f25212g);
                    }
                    i3++;
                }
            }
            if (m22807d(i2)) {
                if (z) {
                    top = c4872b.f25208c;
                } else {
                    top = c4872b.f25206a - this.f25200k;
                }
                m22798a(canvas, top, paddingTop, max);
            }
            if (m22808e(i2) && (this.f25198i & 4) > 0) {
                int i4;
                if (z) {
                    i4 = c4872b.f25206a - this.f25200k;
                } else {
                    i4 = c4872b.f25208c;
                }
                m22798a(canvas, i4, paddingTop, max);
            }
            i2++;
            i = i3;
        }
    }

    private final void m22798a(Canvas canvas, int i, int i2, int i3) {
        if (this.f25196g != null) {
            this.f25196g.setBounds(i, i2, this.f25200k + i, i2 + i3);
            this.f25196g.draw(canvas);
        }
    }

    private final void m22803b(Canvas canvas, int i, int i2, int i3) {
        if (this.f25195f != null) {
            this.f25195f.setBounds(i, i2, i + i3, this.f25199j + i2);
            this.f25195f.draw(canvas);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getFlexDirection() {
        return this.f25190a;
    }

    public void setFlexDirection(int i) {
        if (this.f25190a != i) {
            this.f25190a = i;
            requestLayout();
        }
    }

    public int getFlexWrap() {
        return this.f25191b;
    }

    public void setFlexWrap(int i) {
        if (this.f25191b != i) {
            this.f25191b = i;
            requestLayout();
        }
    }

    public int getJustifyContent() {
        return this.f25192c;
    }

    public void setJustifyContent(int i) {
        if (this.f25192c != i) {
            this.f25192c = i;
            requestLayout();
        }
    }

    public int getAlignItems() {
        return this.f25193d;
    }

    public void setAlignItems(int i) {
        if (this.f25193d != i) {
            this.f25193d = i;
            requestLayout();
        }
    }

    public int getAlignContent() {
        return this.f25194e;
    }

    public void setAlignContent(int i) {
        if (this.f25194e != i) {
            this.f25194e = i;
            requestLayout();
        }
    }

    public List getFlexLines() {
        List arrayList = new ArrayList(this.f25204o.size());
        for (C4872b c4872b : this.f25204o) {
            if (c4872b.m22853a() != 0) {
                arrayList.add(c4872b);
            }
        }
        return arrayList;
    }

    public final int mo4441a(int i, int i2) {
        int i3 = 0;
        if (mo4447b()) {
            if (m22806c(i, i2)) {
                i3 = this.f25200k + 0;
            }
            if ((this.f25198i & 4) > 0) {
                return i3 + this.f25200k;
            }
            return i3;
        }
        if (m22806c(i, i2)) {
            i3 = this.f25199j + 0;
        }
        if ((this.f25197h & 4) > 0) {
            return i3 + this.f25199j;
        }
        return i3;
    }

    public final int mo4448c() {
        return 0;
    }

    public final void mo4444a(C4872b c4872b) {
        if (mo4447b()) {
            if ((this.f25198i & 4) > 0) {
                c4872b.f25210e += this.f25200k;
                c4872b.f25211f += this.f25200k;
            }
        } else if ((this.f25197h & 4) > 0) {
            c4872b.f25210e += this.f25199j;
            c4872b.f25211f += this.f25199j;
        }
    }

    public final int a_(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final int mo4446b(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    public final void mo4443a(int i, int i2, C4872b c4872b) {
        if (!m22806c(i, i2)) {
            return;
        }
        if (mo4447b()) {
            c4872b.f25210e += this.f25200k;
            c4872b.f25211f += this.f25200k;
            return;
        }
        c4872b.f25210e += this.f25199j;
        c4872b.f25211f += this.f25199j;
    }

    public void setFlexLines(List list) {
        this.f25204o = list;
    }

    public List getFlexLinesInternal() {
        return this.f25204o;
    }

    public final void mo4449g() {
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f25195f;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f25196g;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f25195f) {
            this.f25195f = drawable;
            if (drawable != null) {
                this.f25199j = drawable.getIntrinsicHeight();
            } else {
                this.f25199j = 0;
            }
            m22796a();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f25196g) {
            this.f25196g = drawable;
            if (drawable != null) {
                this.f25200k = drawable.getIntrinsicWidth();
            } else {
                this.f25200k = 0;
            }
            m22796a();
            requestLayout();
        }
    }

    public int getShowDividerVertical() {
        return this.f25198i;
    }

    public int getShowDividerHorizontal() {
        return this.f25197h;
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f25198i) {
            this.f25198i = i;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f25197h) {
            this.f25197h = i;
            requestLayout();
        }
    }

    private final void m22796a() {
        if (this.f25195f == null && this.f25196g == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean m22806c(int i, int i2) {
        boolean z;
        for (int i3 = 1; i3 <= i2; i3++) {
            View c = m22805c(i - i3);
            if (c != null && c.getVisibility() != 8) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            if (mo4447b()) {
                if ((this.f25198i & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f25197h & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (mo4447b()) {
            if ((this.f25198i & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.f25197h & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean m22807d(int i) {
        if (i < 0 || i >= this.f25204o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (((C4872b) this.f25204o.get(i2)).m22853a() > 0) {
                Object obj = null;
                break;
            }
        }
        int i3 = 1;
        if (obj == null) {
            return mo4447b() ? (this.f25197h & 2) != 0 : (this.f25198i & 2) != 0;
        } else {
            if (!mo4447b()) {
                return (this.f25198i & 1) != 0;
            } else {
                if ((this.f25197h & 1) != 0) {
                    return true;
                }
                return false;
            }
        }
    }

    private final boolean m22808e(int i) {
        if (i < 0 || i >= this.f25204o.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f25204o.size(); i2++) {
            if (((C4872b) this.f25204o.get(i2)).m22853a() > 0) {
                return false;
            }
        }
        return mo4447b() ? (this.f25197h & 4) != 0 : (this.f25198i & 4) != 0;
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
