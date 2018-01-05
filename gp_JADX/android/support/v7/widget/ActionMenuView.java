package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0465r;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ag;
import android.support.v7.view.menu.ah;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ActionMenuView extends dh implements ah, C0465r {
    public C0471p f2913a;
    public Context f2914b;
    public int f2915c;
    public boolean f2916d;
    public C0502k f2917e;
    public ag f2918f;
    public C0408q f2919g;
    public boolean f2920h;
    public int f2921i;
    public int f2922j;
    public int f2923k;
    public C0500w f2924l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2922j = (int) (56.0f * f);
        this.f2923k = (int) (f * 4.0f);
        this.f2914b = context;
        this.f2915c = 0;
    }

    public void setPopupTheme(int i) {
        if (this.f2915c != i) {
            this.f2915c = i;
            if (i == 0) {
                this.f2914b = getContext();
            } else {
                this.f2914b = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2915c;
    }

    public void setPresenter(C0502k c0502k) {
        this.f2917e = c0502k;
        this.f2917e.m3877a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2917e != null) {
            this.f2917e.mo668a(false);
            if (this.f2917e.m3888g()) {
                this.f2917e.m3885d();
                this.f2917e.m3884c();
            }
        }
    }

    public void setOnMenuItemClickListener(C0500w c0500w) {
        this.f2924l = c0500w;
    }

    protected void onMeasure(int i, int i2) {
        boolean z = this.f2920h;
        this.f2920h = MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE;
        if (z != this.f2920h) {
            this.f2921i = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (!(!this.f2920h || this.f2913a == null || size == this.f2921i)) {
            this.f2921i = size;
            this.f2913a.m2830b(true);
        }
        int childCount = getChildCount();
        int i3;
        if (!this.f2920h || childCount <= 0) {
            for (i3 = 0; i3 < childCount; i3++) {
                C0511u c0511u = (C0511u) getChildAt(i3).getLayoutParams();
                c0511u.rightMargin = 0;
                c0511u.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i2);
        size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        i3 = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i4 = size - i3;
        int i5 = i4 / this.f2922j;
        size = i4 % this.f2922j;
        if (i5 == 0) {
            setMeasuredDimension(i4, 0);
            return;
        }
        int i6;
        Object obj;
        Object obj2;
        int i7 = this.f2922j + (size / i5);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        i3 = 0;
        Object obj3 = null;
        long j = 0;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (i11 < childCount2) {
            int i12;
            int i13;
            long j2;
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                boolean z2 = childAt instanceof ActionMenuItemView;
                i6 = i3 + 1;
                if (z2) {
                    childAt.setPadding(this.f2923k, 0, this.f2923k, 0);
                }
                c0511u = (C0511u) childAt.getLayoutParams();
                c0511u.f3657f = false;
                c0511u.f3654c = 0;
                c0511u.f3653b = 0;
                c0511u.f3655d = false;
                c0511u.leftMargin = 0;
                c0511u.rightMargin = 0;
                z = z2 && ((ActionMenuItemView) childAt).m2731b();
                c0511u.f3656e = z;
                if (c0511u.f3652a) {
                    i3 = 1;
                } else {
                    i3 = i5;
                }
                int a = m2964a(childAt, i7, i3, childMeasureSpec, paddingTop);
                i9 = Math.max(i9, a);
                if (c0511u.f3655d) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
                if (c0511u.f3652a) {
                    obj = 1;
                } else {
                    obj = obj3;
                }
                int i14 = i5 - a;
                i10 = Math.max(i8, childAt.getMeasuredHeight());
                if (a == 1) {
                    long j3 = ((long) (1 << i11)) | j;
                    i12 = i10;
                    i13 = i14;
                    i10 = i3;
                    obj3 = obj;
                    j2 = j3;
                    i5 = i9;
                    childCount = i6;
                } else {
                    childCount = i6;
                    i5 = i9;
                    long j4 = j;
                    i12 = i10;
                    i13 = i14;
                    obj3 = obj;
                    i10 = i3;
                    j2 = j4;
                }
            } else {
                childCount = i3;
                j2 = j;
                i12 = i8;
                i13 = i5;
                i5 = i9;
            }
            i11++;
            i9 = i5;
            i8 = i12;
            i5 = i13;
            j = j2;
            i3 = childCount;
        }
        if (obj3 == null || i3 != 2) {
            obj2 = null;
        } else {
            obj2 = 1;
        }
        Object obj4 = null;
        long j5 = j;
        paddingTop = i5;
        while (i10 > 0 && paddingTop > 0) {
            i6 = Integer.MAX_VALUE;
            j = 0;
            i5 = 0;
            int i15 = 0;
            while (i15 < childCount2) {
                c0511u = (C0511u) getChildAt(i15).getLayoutParams();
                if (c0511u.f3655d) {
                    if (c0511u.f3653b < i6) {
                        i5 = c0511u.f3653b;
                        j = (long) (1 << i15);
                        size = 1;
                    } else if (c0511u.f3653b == i6) {
                        j |= (long) (1 << i15);
                        size = i5 + 1;
                        i5 = i6;
                    }
                    i15++;
                    i6 = i5;
                    i5 = size;
                }
                size = i5;
                i5 = i6;
                i15++;
                i6 = i5;
                i5 = size;
            }
            j5 |= j;
            if (i5 > paddingTop) {
                break;
            }
            i15 = i6 + 1;
            i6 = 0;
            i5 = paddingTop;
            long j6 = j5;
            while (i6 < childCount2) {
                View childAt2 = getChildAt(i6);
                c0511u = (C0511u) childAt2.getLayoutParams();
                if ((((long) (1 << i6)) & j) != 0) {
                    if (obj2 != null && c0511u.f3656e && i5 == 1) {
                        childAt2.setPadding(this.f2923k + i7, 0, this.f2923k, 0);
                    }
                    c0511u.f3653b++;
                    c0511u.f3657f = true;
                    size = i5 - 1;
                } else if (c0511u.f3653b == i15) {
                    j6 |= (long) (1 << i6);
                    size = i5;
                } else {
                    size = i5;
                }
                i6++;
                i5 = size;
            }
            j5 = j6;
            i11 = 1;
            paddingTop = i5;
        }
        j = j5;
        obj = (obj3 == null && i3 == 1) ? 1 : null;
        if (paddingTop <= 0 || j == 0 || (paddingTop >= i3 - 1 && obj == null && i9 <= 1)) {
            obj2 = obj4;
        } else {
            float f;
            View childAt3;
            float bitCount = (float) Long.bitCount(j);
            if (obj == null) {
                if (!((1 & j) == 0 || ((C0511u) getChildAt(0).getLayoutParams()).f3656e)) {
                    bitCount -= 0.5f;
                }
                if (!((((long) (1 << (childCount2 - 1))) & j) == 0 || ((C0511u) getChildAt(childCount2 - 1).getLayoutParams()).f3656e)) {
                    f = bitCount - 0.5f;
                    if (f <= 0.0f) {
                        i3 = (int) (((float) (paddingTop * i7)) / f);
                    } else {
                        i3 = 0;
                    }
                    i5 = 0;
                    obj2 = obj4;
                    while (i5 < childCount2) {
                        if ((((long) (1 << i5)) & j) != 0) {
                            childAt3 = getChildAt(i5);
                            c0511u = (C0511u) childAt3.getLayoutParams();
                            if (childAt3 instanceof ActionMenuItemView) {
                                c0511u.f3654c = i3;
                                c0511u.f3657f = true;
                                if (i5 == 0 && !c0511u.f3656e) {
                                    c0511u.leftMargin = (-i3) / 2;
                                }
                                obj = 1;
                            } else if (c0511u.f3652a) {
                                if (i5 != 0) {
                                    c0511u.leftMargin = i3 / 2;
                                }
                                if (i5 != childCount2 - 1) {
                                    c0511u.rightMargin = i3 / 2;
                                }
                            } else {
                                c0511u.f3654c = i3;
                                c0511u.f3657f = true;
                                c0511u.rightMargin = (-i3) / 2;
                                obj = 1;
                            }
                            i5++;
                            obj2 = obj;
                        }
                        obj = obj2;
                        i5++;
                        obj2 = obj;
                    }
                }
            }
            f = bitCount;
            if (f <= 0.0f) {
                i3 = 0;
            } else {
                i3 = (int) (((float) (paddingTop * i7)) / f);
            }
            i5 = 0;
            obj2 = obj4;
            while (i5 < childCount2) {
                if ((((long) (1 << i5)) & j) != 0) {
                    childAt3 = getChildAt(i5);
                    c0511u = (C0511u) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0511u.f3654c = i3;
                        c0511u.f3657f = true;
                        c0511u.leftMargin = (-i3) / 2;
                        obj = 1;
                    } else if (c0511u.f3652a) {
                        if (i5 != 0) {
                            c0511u.leftMargin = i3 / 2;
                        }
                        if (i5 != childCount2 - 1) {
                            c0511u.rightMargin = i3 / 2;
                        }
                    } else {
                        c0511u.f3654c = i3;
                        c0511u.f3657f = true;
                        c0511u.rightMargin = (-i3) / 2;
                        obj = 1;
                    }
                    i5++;
                    obj2 = obj;
                }
                obj = obj2;
                i5++;
                obj2 = obj;
            }
        }
        if (obj2 != null) {
            for (i3 = 0; i3 < childCount2; i3++) {
                childAt = getChildAt(i3);
                c0511u = (C0511u) childAt.getLayoutParams();
                if (c0511u.f3657f) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(c0511u.f3654c + (c0511u.f3653b * i7), MemoryMappedFileBuffer.DEFAULT_SIZE), childMeasureSpec);
                }
            }
        }
        if (mode == 1073741824) {
            i8 = size2;
        }
        setMeasuredDimension(i4, i8);
    }

    static int m2964a(View view, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        boolean z2 = false;
        C0511u c0511u = (C0511u) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        if (actionMenuItemView == null || !actionMenuItemView.m2731b()) {
            z = false;
        } else {
            z = true;
        }
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z && r1 < 2) {
                i5 = 2;
            }
        }
        if (!c0511u.f3652a && z) {
            z2 = true;
        }
        c0511u.f3655d = z2;
        c0511u.f3653b = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i5 * i, MemoryMappedFileBuffer.DEFAULT_SIZE), makeMeasureSpec);
        return i5;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2920h) {
            C0511u c0511u;
            int measuredWidth;
            int paddingLeft;
            int i5;
            int childCount = getChildCount();
            int i6 = (i4 - i2) / 2;
            int dividerWidth = getDividerWidth();
            int i7 = 0;
            int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
            Object obj = null;
            boolean a = id.m3869a(this);
            int i8 = 0;
            while (i8 < childCount) {
                Object obj2;
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    c0511u = (C0511u) childAt.getLayoutParams();
                    if (c0511u.f3652a) {
                        measuredWidth = childAt.getMeasuredWidth();
                        if (m2967a(i8)) {
                            measuredWidth += dividerWidth;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        if (a) {
                            paddingLeft = c0511u.leftMargin + getPaddingLeft();
                            i5 = paddingLeft + measuredWidth;
                        } else {
                            i5 = (getWidth() - getPaddingRight()) - c0511u.rightMargin;
                            paddingLeft = i5 - measuredWidth;
                        }
                        int i9 = i6 - (measuredHeight / 2);
                        childAt.layout(paddingLeft, i9, i5, measuredHeight + i9);
                        measuredWidth = paddingRight - measuredWidth;
                        obj2 = 1;
                        i5 = i7;
                    } else {
                        paddingLeft = paddingRight - (c0511u.rightMargin + (childAt.getMeasuredWidth() + c0511u.leftMargin));
                        m2967a(i8);
                        i5 = i7 + 1;
                        Object obj3 = obj;
                        measuredWidth = paddingLeft;
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj;
                    i5 = i7;
                    measuredWidth = paddingRight;
                }
                i8++;
                i7 = i5;
                paddingRight = measuredWidth;
                obj = obj2;
            }
            if (childCount == 1 && obj == null) {
                View childAt2 = getChildAt(0);
                measuredWidth = childAt2.getMeasuredWidth();
                i5 = childAt2.getMeasuredHeight();
                paddingRight = ((i3 - i) / 2) - (measuredWidth / 2);
                i7 = i6 - (i5 / 2);
                childAt2.layout(paddingRight, i7, measuredWidth + paddingRight, i5 + i7);
                return;
            }
            paddingLeft = i7 - (obj != null ? 0 : 1);
            paddingRight = Math.max(0, paddingLeft > 0 ? paddingRight / paddingLeft : 0);
            View childAt3;
            int i10;
            if (a) {
                measuredWidth = getWidth() - getPaddingRight();
                i5 = 0;
                while (i5 < childCount) {
                    childAt3 = getChildAt(i5);
                    c0511u = (C0511u) childAt3.getLayoutParams();
                    if (childAt3.getVisibility() == 8 || c0511u.f3652a) {
                        paddingLeft = measuredWidth;
                    } else {
                        measuredWidth -= c0511u.rightMargin;
                        i8 = childAt3.getMeasuredWidth();
                        dividerWidth = childAt3.getMeasuredHeight();
                        i10 = i6 - (dividerWidth / 2);
                        childAt3.layout(measuredWidth - i8, i10, measuredWidth, dividerWidth + i10);
                        paddingLeft = measuredWidth - ((c0511u.leftMargin + i8) + paddingRight);
                    }
                    i5++;
                    measuredWidth = paddingLeft;
                }
                return;
            }
            measuredWidth = getPaddingLeft();
            i5 = 0;
            while (i5 < childCount) {
                childAt3 = getChildAt(i5);
                c0511u = (C0511u) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || c0511u.f3652a) {
                    paddingLeft = measuredWidth;
                } else {
                    measuredWidth += c0511u.leftMargin;
                    i8 = childAt3.getMeasuredWidth();
                    dividerWidth = childAt3.getMeasuredHeight();
                    i10 = i6 - (dividerWidth / 2);
                    childAt3.layout(measuredWidth, i10, measuredWidth + i8, dividerWidth + i10);
                    paddingLeft = ((c0511u.rightMargin + i8) + paddingRight) + measuredWidth;
                }
                i5++;
                measuredWidth = paddingLeft;
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2971b();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0502k c0502k = this.f2917e;
        if (c0502k.f3626i != null) {
            c0502k.f3626i.setImageDrawable(drawable);
            return;
        }
        c0502k.f3628k = true;
        c0502k.f3627j = drawable;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0502k c0502k = this.f2917e;
        if (c0502k.f3626i != null) {
            return c0502k.f3626i.getDrawable();
        }
        if (c0502k.f3628k) {
            return c0502k.f3627j;
        }
        return null;
    }

    public void setOverflowReserved(boolean z) {
        this.f2916d = z;
    }

    protected static C0511u m2965a() {
        C0511u c0511u = new C0511u();
        c0511u.h = 16;
        return c0511u;
    }

    protected static C0511u m2966a(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m2965a();
        }
        C0511u c0511u = layoutParams instanceof C0511u ? new C0511u((C0511u) layoutParams) : new C0511u(layoutParams);
        if (c0511u.h > 0) {
            return c0511u;
        }
        c0511u.h = 16;
        return c0511u;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0511u);
    }

    public final boolean mo626a(C0485t c0485t) {
        return this.f2913a.m2827a((MenuItem) c0485t, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void mo64a(C0471p c0471p) {
        this.f2913a = c0471p;
    }

    public Menu getMenu() {
        if (this.f2913a == null) {
            Context context = getContext();
            this.f2913a = new C0471p(context);
            this.f2913a.mo680a(new C0512v(this));
            this.f2917e = new C0502k(context);
            this.f2917e.m3883b();
            this.f2917e.f2756e = this.f2918f != null ? this.f2918f : new C0510t();
            this.f2913a.m2822a(this.f2917e, this.f2914b);
            this.f2917e.m3877a(this);
        }
        return this.f2913a;
    }

    public final void m2968a(ag agVar, C0408q c0408q) {
        this.f2918f = agVar;
        this.f2919g = c0408q;
    }

    public final void m2971b() {
        if (this.f2917e != null) {
            this.f2917e.m3886e();
        }
    }

    private final boolean m2967a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0464s)) {
            z = ((C0464s) childAt).mo625d() | 0;
        }
        return (i <= 0 || !(childAt2 instanceof C0464s)) ? z : ((C0464s) childAt2).mo624c() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2917e.f3637t = z;
    }

    protected /* synthetic */ di generateLayoutParams(LayoutParams layoutParams) {
        return m2966a(layoutParams);
    }

    protected /* synthetic */ di generateDefaultLayoutParams() {
        return m2965a();
    }

    protected /* synthetic */ LayoutParams m38282generateDefaultLayoutParams() {
        return m2965a();
    }

    protected /* synthetic */ LayoutParams m38283generateLayoutParams(LayoutParams layoutParams) {
        return m2966a(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0511u(getContext(), attributeSet);
    }
}
