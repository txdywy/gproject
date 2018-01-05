package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v4.view.av;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    public static final int[] f1933a = new int[]{16843828};
    public static final int[] f1934b = new int[]{16842931};
    public static final boolean f1935c;
    public static final boolean f1936d;
    public Drawable f1937A;
    public Drawable f1938B;
    public Drawable f1939C;
    public CharSequence f1940D;
    public CharSequence f1941E;
    public Object f1942F;
    public boolean f1943G;
    public Drawable f1944H;
    public Drawable f1945I;
    public Drawable f1946J;
    public Drawable f1947K;
    public final ArrayList f1948L;
    public final C0389v f1949e;
    public float f1950f;
    public int f1951g;
    public int f1952h;
    public float f1953i;
    public Paint f1954j;
    public final bp f1955k;
    public final bp f1956l;
    public final C0393z f1957m;
    public final C0393z f1958n;
    public int f1959o;
    public boolean f1960p;
    public boolean f1961q;
    public int f1962r;
    public int f1963s;
    public int f1964t;
    public int f1965u;
    public boolean f1966v;
    public C0390w f1967w;
    public List f1968x;
    public float f1969y;
    public float f1970z;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new C0392y();
        public int f1928a = 0;
        public int f1929b;
        public int f1930c;
        public int f1931f;
        public int f1932g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1928a = parcel.readInt();
            this.f1929b = parcel.readInt();
            this.f1930c = parcel.readInt();
            this.f1931f = parcel.readInt();
            this.f1932g = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1928a);
            parcel.writeInt(this.f1929b);
            parcel.writeInt(this.f1930c);
            parcel.writeInt(this.f1931f);
            parcel.writeInt(this.f1932g);
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1949e = new C0389v();
        this.f1952h = -1728053248;
        this.f1954j = new Paint();
        this.f1961q = true;
        this.f1962r = 3;
        this.f1963s = 3;
        this.f1964t = 3;
        this.f1965u = 3;
        this.f1944H = null;
        this.f1945I = null;
        this.f1946J = null;
        this.f1947K = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1951g = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1957m = new C0393z(this, 3);
        this.f1958n = new C0393z(this, 5);
        this.f1955k = bp.m2243a((ViewGroup) this, 1.0f, this.f1957m);
        this.f1955k.f2133p = 1;
        this.f1955k.f2131n = f2;
        this.f1957m.f2195b = this.f1955k;
        this.f1956l = bp.m2243a((ViewGroup) this, 1.0f, this.f1958n);
        this.f1956l.f2133p = 2;
        this.f1956l.f2131n = f2;
        this.f1958n.f2195b = this.f1956l;
        setFocusableInTouchMode(true);
        ai.m1838b((View) this, 1);
        ai.m1829a((View) this, new C0388u(this));
        av.m1959a(this);
        if (ai.f1848a.mo397i(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0387t());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1933a);
                try {
                    this.f1937A = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1937A = null;
            }
        }
        this.f1950f = f * 10.0f;
        this.f1948L = new ArrayList();
    }

    public void setDrawerElevation(float f) {
        this.f1950f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2090d(childAt)) {
                ai.m1851g(childAt, this.f1950f);
            }
        }
    }

    public float getDrawerElevation() {
        if (f1936d) {
            return this.f1950f;
        }
        return 0.0f;
    }

    public void setScrimColor(int i) {
        this.f1952h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(C0390w c0390w) {
        if (this.f1967w != null) {
            C0390w c0390w2 = this.f1967w;
            if (!(c0390w2 == null || this.f1968x == null)) {
                this.f1968x.remove(c0390w2);
            }
        }
        if (!(c0390w == null || c0390w == null)) {
            if (this.f1968x == null) {
                this.f1968x = new ArrayList();
            }
            this.f1968x.add(c0390w);
        }
        this.f1967w = c0390w;
    }

    public void setDrawerLockMode(int i) {
        mo3593a(i, 3);
        mo3593a(i, 5);
    }

    private final void mo3593a(int i, int i2) {
        int a = C0357n.m2043a(i2, ai.f1848a.mo400k(this));
        switch (i2) {
            case 3:
                this.f1962r = i;
                break;
            case 5:
                this.f1963s = i;
                break;
            case 8388611:
                this.f1964t = i;
                break;
            case 8388613:
                this.f1965u = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.f1955k : this.f1956l).m2257a();
        }
        View a2;
        switch (i) {
            case 1:
                a2 = m2095a(a);
                if (a2 != null) {
                    m2103f(a2);
                    return;
                }
                return;
            case 2:
                a2 = m2095a(a);
                if (a2 != null) {
                    m2102e(a2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final int m2094a(View view) {
        if (m2090d(view)) {
            int i = ((C0391x) view.getLayoutParams()).f2190a;
            int k = ai.f1848a.mo400k(this);
            switch (i) {
                case 3:
                    if (this.f1962r != 3) {
                        return this.f1962r;
                    }
                    i = k == 0 ? this.f1964t : this.f1965u;
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 5:
                    if (this.f1963s != 3) {
                        return this.f1963s;
                    }
                    i = k == 0 ? this.f1965u : this.f1964t;
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 8388611:
                    if (this.f1964t != 3) {
                        return this.f1964t;
                    }
                    i = k == 0 ? this.f1962r : this.f1963s;
                    if (i != 3) {
                        return i;
                    }
                    break;
                case 8388613:
                    if (this.f1965u != 3) {
                        return this.f1965u;
                    }
                    i = k == 0 ? this.f1963s : this.f1962r;
                    if (i != 3) {
                        return i;
                    }
                    break;
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    final void m2097a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2090d(childAt)) && !(z && childAt == view)) {
                ai.m1838b(childAt, 4);
            } else {
                ai.m1838b(childAt, 1);
            }
        }
    }

    final void a_(View view, float f) {
        C0391x c0391x = (C0391x) view.getLayoutParams();
        if (f != c0391x.f2191b) {
            c0391x.f2191b = f;
            if (this.f1968x != null) {
                for (int size = this.f1968x.size() - 1; size >= 0; size--) {
                    ((C0390w) this.f1968x.get(size)).mo614a(view, f);
                }
            }
        }
    }

    static float m2088b(View view) {
        return ((C0391x) view.getLayoutParams()).f2191b;
    }

    final int m2100c(View view) {
        return C0357n.m2043a(((C0391x) view.getLayoutParams()).f2190a, ai.f1848a.mo400k(this));
    }

    final boolean m2098a(View view, int i) {
        return (m2100c(view) & i) == i;
    }

    private final View mo3590d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0391x) childAt.getLayoutParams()).f2193d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View m2095a(int i) {
        int a = C0357n.m2043a(i, ai.f1848a.mo400k(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2100c(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1961q = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1961q = true;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        int k;
        Object obj2;
        Object obj3;
        int childCount;
        int i3;
        View childAt;
        C0391x c0391x;
        int a;
        WindowInsets windowInsets;
        Object obj4;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == MemoryMappedFileBuffer.DEFAULT_SIZE && mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    mode = 300;
                    mode2 = size;
                    setMeasuredDimension(mode2, mode);
                    if (this.f1942F == null && ai.f1848a.mo397i(this)) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    k = ai.f1848a.mo400k(this);
                    obj2 = null;
                    obj3 = null;
                    childCount = getChildCount();
                    for (i3 = 0; i3 < childCount; i3++) {
                        childAt = getChildAt(i3);
                        if (childAt.getVisibility() != 8) {
                            c0391x = (C0391x) childAt.getLayoutParams();
                            if (obj != null) {
                                a = C0357n.m2043a(c0391x.f2190a, k);
                                if (ai.f1848a.mo397i(childAt)) {
                                    if (VERSION.SDK_INT >= 21) {
                                        windowInsets = (WindowInsets) this.f1942F;
                                        if (a == 3) {
                                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                        } else if (a == 5) {
                                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                        }
                                        c0391x.leftMargin = windowInsets.getSystemWindowInsetLeft();
                                        c0391x.topMargin = windowInsets.getSystemWindowInsetTop();
                                        c0391x.rightMargin = windowInsets.getSystemWindowInsetRight();
                                        c0391x.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                                    }
                                } else if (VERSION.SDK_INT >= 21) {
                                    windowInsets = (WindowInsets) this.f1942F;
                                    if (a == 3) {
                                        windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                    } else if (a == 5) {
                                        windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                    }
                                    childAt.dispatchApplyWindowInsets(windowInsets);
                                }
                            }
                            if (m2093i(childAt)) {
                                childAt.measure(MeasureSpec.makeMeasureSpec((mode2 - c0391x.leftMargin) - c0391x.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((mode - c0391x.topMargin) - c0391x.bottomMargin, MemoryMappedFileBuffer.DEFAULT_SIZE));
                            } else if (m2090d(childAt)) {
                                throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                            } else {
                                if (f1936d && ai.f1848a.mo423v(childAt) != this.f1950f) {
                                    ai.m1851g(childAt, this.f1950f);
                                }
                                a = m2100c(childAt) & 7;
                                obj4 = a != 3 ? 1 : null;
                                if ((obj4 != null || obj2 == null) && (obj4 != null || obj3 == null)) {
                                    if (obj4 == null) {
                                        Object obj5 = obj3;
                                        obj3 = 1;
                                        obj4 = obj5;
                                    } else {
                                        obj4 = 1;
                                        obj3 = obj2;
                                    }
                                    childAt.measure(getChildMeasureSpec(i, (this.f1951g + c0391x.leftMargin) + c0391x.rightMargin, c0391x.width), getChildMeasureSpec(i2, c0391x.topMargin + c0391x.bottomMargin, c0391x.height));
                                    obj2 = obj3;
                                    obj3 = obj4;
                                } else {
                                    String str;
                                    StringBuilder stringBuilder = new StringBuilder("Child drawer has absolute gravity ");
                                    if ((a & 3) == 3) {
                                        str = "LEFT";
                                    } else if ((a & 5) == 5) {
                                        str = "RIGHT";
                                    } else {
                                        str = Integer.toHexString(a);
                                    }
                                    throw new IllegalStateException(stringBuilder.append(str).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                                }
                            }
                        }
                    }
                }
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
        mode = size2;
        mode2 = size;
        setMeasuredDimension(mode2, mode);
        if (this.f1942F == null) {
        }
        obj = null;
        k = ai.f1848a.mo400k(this);
        obj2 = null;
        obj3 = null;
        childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                c0391x = (C0391x) childAt.getLayoutParams();
                if (obj != null) {
                    a = C0357n.m2043a(c0391x.f2190a, k);
                    if (ai.f1848a.mo397i(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            windowInsets = (WindowInsets) this.f1942F;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            c0391x.leftMargin = windowInsets.getSystemWindowInsetLeft();
                            c0391x.topMargin = windowInsets.getSystemWindowInsetTop();
                            c0391x.rightMargin = windowInsets.getSystemWindowInsetRight();
                            c0391x.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        windowInsets = (WindowInsets) this.f1942F;
                        if (a == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    }
                }
                if (m2093i(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((mode2 - c0391x.leftMargin) - c0391x.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((mode - c0391x.topMargin) - c0391x.bottomMargin, MemoryMappedFileBuffer.DEFAULT_SIZE));
                } else if (m2090d(childAt)) {
                    throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                } else {
                    ai.m1851g(childAt, this.f1950f);
                    a = m2100c(childAt) & 7;
                    if (a != 3) {
                    }
                    if (obj4 != null) {
                    }
                    if (obj4 == null) {
                        obj4 = 1;
                        obj3 = obj2;
                    } else {
                        Object obj52 = obj3;
                        obj3 = 1;
                        obj4 = obj52;
                    }
                    childAt.measure(getChildMeasureSpec(i, (this.f1951g + c0391x.leftMargin) + c0391x.rightMargin, c0391x.width), getChildMeasureSpec(i2, c0391x.topMargin + c0391x.bottomMargin, c0391x.height));
                    obj2 = obj3;
                    obj3 = obj4;
                }
            }
        }
    }

    public final void m2096a() {
        if (!f1936d) {
            Drawable drawable;
            int k = ai.f1848a.mo400k(this);
            if (k == 0) {
                if (this.f1944H != null) {
                    m2087a(this.f1944H, k);
                    drawable = this.f1944H;
                }
                drawable = this.f1946J;
            } else {
                if (this.f1945I != null) {
                    m2087a(this.f1945I, k);
                    drawable = this.f1945I;
                }
                drawable = this.f1946J;
            }
            this.f1938B = drawable;
            k = ai.f1848a.mo400k(this);
            if (k == 0) {
                if (this.f1945I != null) {
                    m2087a(this.f1945I, k);
                    drawable = this.f1945I;
                }
                drawable = this.f1947K;
            } else {
                if (this.f1944H != null) {
                    m2087a(this.f1944H, k);
                    drawable = this.f1944H;
                }
                drawable = this.f1947K;
            }
            this.f1939C = drawable;
        }
    }

    private static boolean m2087a(Drawable drawable, int i) {
        if (drawable == null || !C0259a.m1521a(drawable)) {
            return false;
        }
        C0259a.m1523b(drawable, i);
        return true;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1960p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0391x c0391x = (C0391x) childAt.getLayoutParams();
                if (m2093i(childAt)) {
                    childAt.layout(c0391x.leftMargin, c0391x.topMargin, c0391x.leftMargin + childAt.getMeasuredWidth(), c0391x.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2098a(childAt, 3)) {
                        i7 = ((int) (((float) measuredWidth) * c0391x.f2191b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i7)) / ((float) measuredWidth);
                    } else {
                        i7 = i5 - ((int) (((float) measuredWidth) * c0391x.f2191b));
                        f = ((float) (i5 - i7)) / ((float) measuredWidth);
                    }
                    Object obj = f != c0391x.f2191b ? 1 : null;
                    int i8;
                    switch (c0391x.f2190a & 112) {
                        case 16:
                            int i9 = i4 - i2;
                            i8 = (i9 - measuredHeight) / 2;
                            if (i8 < c0391x.topMargin) {
                                i8 = c0391x.topMargin;
                            } else if (i8 + measuredHeight > i9 - c0391x.bottomMargin) {
                                i8 = (i9 - c0391x.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
                            break;
                        case 80:
                            i8 = i4 - i2;
                            childAt.layout(i7, (i8 - c0391x.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i8 - c0391x.bottomMargin);
                            break;
                        default:
                            childAt.layout(i7, c0391x.topMargin, measuredWidth + i7, measuredHeight + c0391x.topMargin);
                            break;
                    }
                    if (obj != null) {
                        a_(childAt, f);
                    }
                    int i10 = c0391x.f2191b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i10) {
                        childAt.setVisibility(i10);
                    }
                }
            }
        }
        this.f1960p = false;
        this.f1961q = false;
    }

    public void requestLayout() {
        if (!this.f1960p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0391x) getChildAt(i).getLayoutParams()).f2191b);
        }
        this.f1953i = f;
        boolean b = this.f1955k.m2266b();
        boolean b2 = this.f1956l.m2266b();
        if (b || b2) {
            ai.f1848a.mo391c(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1937A = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1937A;
    }

    public void setStatusBarBackground(int i) {
        this.f1937A = i != 0 ? C0216d.m1112a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1937A = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        m2096a();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1943G && this.f1937A != null) {
            int systemWindowInsetTop = VERSION.SDK_INT >= 21 ? this.f1942F != null ? ((WindowInsets) this.f1942F).getSystemWindowInsetTop() : 0 : 0;
            if (systemWindowInsetTop > 0) {
                this.f1937A.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1937A.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int right;
        int height = getHeight();
        boolean i = m2093i(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (i) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    Object obj = background != null ? background.getOpacity() == -1 ? 1 : null : null;
                    if (obj != null && m2090d(childAt) && childAt.getHeight() >= height) {
                        if (m2098a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right <= i2) {
                                right = i2;
                            }
                            i2 = right;
                            right = width;
                        } else {
                            right = childAt.getLeft();
                            if (right < width) {
                            }
                        }
                        i3++;
                        width = right;
                    }
                }
                right = width;
                i3++;
                width = right;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        right = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f1953i > 0.0f && i) {
            this.f1954j.setColor((((int) (((float) ((this.f1952h & -16777216) >>> 24)) * this.f1953i)) << 24) | (this.f1952h & 16777215));
            canvas.drawRect((float) i2, 0.0f, (float) right, (float) getHeight(), this.f1954j);
        } else if (this.f1938B != null && m2098a(view, 3)) {
            right = this.f1938B.getIntrinsicWidth();
            i2 = view.getRight();
            r2 = Math.max(0.0f, Math.min(((float) i2) / ((float) this.f1955k.f2132o), 1.0f));
            this.f1938B.setBounds(i2, view.getTop(), right + i2, view.getBottom());
            this.f1938B.setAlpha((int) (255.0f * r2));
            this.f1938B.draw(canvas);
        } else if (this.f1939C != null && m2098a(view, 5)) {
            right = this.f1939C.getIntrinsicWidth();
            i2 = view.getLeft();
            r2 = Math.max(0.0f, Math.min(((float) (getWidth() - i2)) / ((float) this.f1956l.f2132o), 1.0f));
            this.f1939C.setBounds(i2 - right, view.getTop(), i2, view.getBottom());
            this.f1939C.setAlpha((int) (255.0f * r2));
            this.f1939C.draw(canvas);
        }
        return drawChild;
    }

    private static boolean m2093i(View view) {
        return ((C0391x) view.getLayoutParams()).f2190a == 0;
    }

    static boolean m2090d(View view) {
        int a = C0357n.m2043a(((C0391x) view.getLayoutParams()).f2190a, ai.f1848a.mo400k(view));
        if ((a & 3) != 0) {
            return true;
        }
        if ((a & 5) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r1 = 1;
        r2 = 0;
        r0 = r10.getActionMasked();
        r3 = r9.f1955k;
        r3 = r3.m2261a(r10);
        r4 = r9.f1956l;
        r4 = r4.m2261a(r10);
        r4 = r4 | r3;
        switch(r0) {
            case 0: goto L_0x0039;
            case 1: goto L_0x00aa;
            case 2: goto L_0x0060;
            case 3: goto L_0x00aa;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r2;
    L_0x0017:
        if (r4 != 0) goto L_0x0037;
    L_0x0019:
        if (r0 != 0) goto L_0x0037;
    L_0x001b:
        r4 = r9.getChildCount();
        r3 = r2;
    L_0x0020:
        if (r3 >= r4) goto L_0x00b6;
    L_0x0022:
        r0 = r9.getChildAt(r3);
        r0 = r0.getLayoutParams();
        r0 = (android.support.v4.widget.C0391x) r0;
        r0 = r0.f2192c;
        if (r0 == 0) goto L_0x00b1;
    L_0x0030:
        r0 = r1;
    L_0x0031:
        if (r0 != 0) goto L_0x0037;
    L_0x0033:
        r0 = r9.f1966v;
        if (r0 == 0) goto L_0x0038;
    L_0x0037:
        r2 = r1;
    L_0x0038:
        return r2;
    L_0x0039:
        r0 = r10.getX();
        r3 = r10.getY();
        r9.f1969y = r0;
        r9.f1970z = r3;
        r5 = r9.f1953i;
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x00b9;
    L_0x004c:
        r5 = r9.f1955k;
        r0 = (int) r0;
        r3 = (int) r3;
        r0 = r5.m2263b(r0, r3);
        if (r0 == 0) goto L_0x00b9;
    L_0x0056:
        r0 = m2093i(r0);
        if (r0 == 0) goto L_0x00b9;
    L_0x005c:
        r0 = r1;
    L_0x005d:
        r9.f1966v = r2;
        goto L_0x0017;
    L_0x0060:
        r5 = r9.f1955k;
        r0 = r5.f2121d;
        r6 = r0.length;
        r3 = r2;
    L_0x0066:
        if (r3 >= r6) goto L_0x00a8;
    L_0x0068:
        r0 = r5.m2259a(r3);
        if (r0 == 0) goto L_0x00a2;
    L_0x006e:
        r0 = r5.f2123f;
        r0 = r0[r3];
        r7 = r5.f2121d;
        r7 = r7[r3];
        r0 = r0 - r7;
        r7 = r5.f2124g;
        r7 = r7[r3];
        r8 = r5.f2122e;
        r8 = r8[r3];
        r7 = r7 - r8;
        r0 = r0 * r0;
        r7 = r7 * r7;
        r0 = r0 + r7;
        r7 = r5.f2119b;
        r8 = r5.f2119b;
        r7 = r7 * r8;
        r7 = (float) r7;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a0;
    L_0x008d:
        r0 = r1;
    L_0x008e:
        if (r0 == 0) goto L_0x00a4;
    L_0x0090:
        r0 = r1;
    L_0x0091:
        if (r0 == 0) goto L_0x0016;
    L_0x0093:
        r0 = r9.f1957m;
        r0.m2301b();
        r0 = r9.f1958n;
        r0.m2301b();
        r0 = r2;
        goto L_0x0017;
    L_0x00a0:
        r0 = r2;
        goto L_0x008e;
    L_0x00a2:
        r0 = r2;
        goto L_0x008e;
    L_0x00a4:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0066;
    L_0x00a8:
        r0 = r2;
        goto L_0x0091;
    L_0x00aa:
        r9.mo3594a(r1);
        r9.f1966v = r2;
        goto L_0x0016;
    L_0x00b1:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0020;
    L_0x00b6:
        r0 = r2;
        goto L_0x0031;
    L_0x00b9:
        r0 = r2;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        this.f1955k.m2265b(motionEvent);
        this.f1956l.m2265b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getAction() & HprofParser.ROOT_UNKNOWN) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f1969y = x;
                this.f1970z = y;
                this.f1966v = false;
                break;
            case 1:
                x = motionEvent.getX();
                y = motionEvent.getY();
                View b = this.f1955k.m2263b((int) x, (int) y);
                if (b != null && m2093i(b)) {
                    x -= this.f1969y;
                    y -= this.f1970z;
                    int i = this.f1955k.f2119b;
                    if ((x * x) + (y * y) < ((float) (i * i))) {
                        View d = mo3590d();
                        if (d != null) {
                            if (m2094a(d) == 2) {
                                z = true;
                            }
                            mo3594a(z);
                            break;
                        }
                    }
                }
                z = true;
                mo3594a(z);
            case 3:
                mo3594a(true);
                this.f1966v = false;
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo3594a(true);
        }
    }

    private final void mo3594a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0391x c0391x = (C0391x) childAt.getLayoutParams();
            if (m2090d(childAt) && (!z || c0391x.f2192c)) {
                int width = childAt.getWidth();
                if (m2098a(childAt, 3)) {
                    i |= this.f1955k.m2262a(childAt, -width, childAt.getTop());
                } else {
                    i |= this.f1956l.m2262a(childAt, getWidth(), childAt.getTop());
                }
                c0391x.f2192c = false;
            }
        }
        this.f1957m.m2301b();
        this.f1958n.m2301b();
        if (i != 0) {
            invalidate();
        }
    }

    public final void m2102e(View view) {
        if (m2090d(view)) {
            C0391x c0391x = (C0391x) view.getLayoutParams();
            if (this.f1961q) {
                c0391x.f2191b = 1.0f;
                c0391x.f2193d = 1;
                m2097a(view, true);
            } else {
                c0391x.f2193d |= 2;
                if (m2098a(view, 3)) {
                    this.f1955k.m2262a(view, 0, view.getTop());
                } else {
                    this.f1956l.m2262a(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void m2103f(View view) {
        if (m2090d(view)) {
            C0391x c0391x = (C0391x) view.getLayoutParams();
            if (this.f1961q) {
                c0391x.f2191b = 0.0f;
                c0391x.f2193d = 0;
            } else {
                c0391x.f2193d |= 4;
                if (m2098a(view, 3)) {
                    this.f1955k.m2262a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1956l.m2262a(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public static boolean m2091g(View view) {
        if (m2090d(view)) {
            return (((C0391x) view.getLayoutParams()).f2193d & 1) == 1;
        } else {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
    }

    public final boolean m2099b() {
        View a = m2095a(8388611);
        if (a != null) {
            return m2091g(a);
        }
        return false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0391x();
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0391x) {
            return new C0391x((C0391x) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new C0391x((MarginLayoutParams) layoutParams) : new C0391x(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0391x) && super.checkLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0391x(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        int i3 = 0;
        if (getDescendantFocusability() != 393216) {
            int i4;
            int childCount = getChildCount();
            int i5 = 0;
            for (i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!m2090d(childAt)) {
                    this.f1948L.add(childAt);
                } else if (m2091g(childAt)) {
                    i5 = 1;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (i5 == 0) {
                i4 = this.f1948L.size();
                while (i3 < i4) {
                    View view = (View) this.f1948L.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f1948L.clear();
        }
    }

    final View m2101c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2090d(childAt)) {
                if (m2090d(childAt)) {
                    Object obj;
                    if (((C0391x) childAt.getLayoutParams()).f2191b > 0.0f) {
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m2101c() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = m2101c();
        if (c != null && m2094a(c) == 0) {
            mo3594a(false);
        }
        if (c != null) {
            return true;
        }
        return false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f542e);
            if (savedState.f1928a != 0) {
                View a = m2095a(savedState.f1928a);
                if (a != null) {
                    m2102e(a);
                }
            }
            if (savedState.f1929b != 3) {
                mo3593a(savedState.f1929b, 3);
            }
            if (savedState.f1930c != 3) {
                mo3593a(savedState.f1930c, 5);
            }
            if (savedState.f1931f != 3) {
                mo3593a(savedState.f1931f, 8388611);
            }
            if (savedState.f1932g != 3) {
                mo3593a(savedState.f1932g, 8388613);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0391x c0391x = (C0391x) getChildAt(i).getLayoutParams();
            Object obj = c0391x.f2193d == 1 ? 1 : null;
            Object obj2;
            if (c0391x.f2193d == 2) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj != null || r4 != null) {
                savedState.f1928a = c0391x.f2190a;
                break;
            }
        }
        savedState.f1929b = this.f1962r;
        savedState.f1930c = this.f1963s;
        savedState.f1931f = this.f1964t;
        savedState.f1932g = this.f1965u;
        return savedState;
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo3590d() != null || m2090d(view)) {
            ai.m1838b(view, 4);
        } else {
            ai.m1838b(view, 1);
        }
        if (!f1935c) {
            ai.m1829a(view, this.f1949e);
        }
    }

    static boolean m2092h(View view) {
        return (ai.f1848a.mo392d(view) == 4 || ai.f1848a.mo392d(view) == 2) ? false : true;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        f1935c = z;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        f1936d = z2;
    }
}
