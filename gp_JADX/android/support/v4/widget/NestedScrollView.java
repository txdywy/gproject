package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0130z;
import android.support.v4.view.aa;
import android.support.v4.view.ab;
import android.support.v4.view.ad;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

public class NestedScrollView extends FrameLayout implements ab, C0130z {
    public static final an f1972w = new an();
    public static final int[] f1973x = new int[]{16843130};
    public float f1974A;
    public ao f1975B;
    public long f1976a;
    public final Rect f1977b;
    public OverScroller f1978c;
    public EdgeEffect f1979d;
    public EdgeEffect f1980e;
    public int f1981f;
    public boolean f1982g;
    public boolean f1983h;
    public View f1984i;
    public boolean f1985j;
    public VelocityTracker f1986k;
    public boolean f1987l;
    public boolean f1988m;
    public int f1989n;
    public int f1990o;
    public int f1991p;
    public int f1992q;
    public final int[] f1993r;
    public final int[] f1994s;
    public int f1995t;
    public int f1996u;
    public SavedState f1997v;
    public final ad f1998y;
    public final aa f1999z;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new ap();
        public int f1971a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1971a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1971a);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1971a + "}";
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1977b = new Rect();
        this.f1982g = true;
        this.f1983h = false;
        this.f1984i = null;
        this.f1985j = false;
        this.f1988m = true;
        this.f1992q = -1;
        this.f1993r = new int[2];
        this.f1994s = new int[2];
        this.f1978c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1989n = viewConfiguration.getScaledTouchSlop();
        this.f1990o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1991p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1973x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1998y = new ad();
        this.f1999z = new aa(this);
        setNestedScrollingEnabled(true);
        ai.m1829a((View) this, f1972w);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1999z.m1794a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1999z.f1842d;
    }

    public boolean startNestedScroll(int i) {
        return this.f1999z.m1798a(i, 0);
    }

    private final boolean m2118c(int i) {
        return this.f1999z.m1798a(2, i);
    }

    public void stopNestedScroll() {
        this.f1999z.m1803b(0);
    }

    public final void n_(int i) {
        this.f1999z.m1803b(i);
    }

    public boolean hasNestedScrollingParent() {
        return this.f1999z.m1797a(0);
    }

    private final boolean m2120d(int i) {
        return this.f1999z.m1797a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1999z.m1799a(i, i2, i3, i4, iArr);
    }

    private final boolean m2109a(int i, int i2, int[] iArr, int i3) {
        return this.f1999z.m1800a(0, i, 0, i2, iArr, i3);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f1999z.m1801a(i, i2, iArr, iArr2);
    }

    private final boolean m2110a(int i, int[] iArr, int[] iArr2, int i2) {
        return this.f1999z.m1802a(0, i, iArr, iArr2, i2);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1999z.m1796a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1999z.m1795a(f, f2);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1998y.f1844a = i;
        startNestedScroll(2);
    }

    public void onStopNestedScroll(View view) {
        this.f1998y.f1844a = 0;
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m2125h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.f1998y.f1844a;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(ao aoVar) {
        this.f1975B = aoVar;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1987l) {
            this.f1987l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1988m = z;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f1975B != null) {
            this.f1975B.mo618a(this);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1987l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), MemoryMappedFileBuffer.DEFAULT_SIZE));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m2127a(keyEvent);
    }

    public final boolean m2127a(KeyEvent keyEvent) {
        boolean z;
        this.f1977b.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            z = getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
        } else {
            z = false;
        }
        View childAt2;
        if (z) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            switch (keyEvent.getKeyCode()) {
                case 19:
                    if (keyEvent.isAltPressed()) {
                        return m2122e(33);
                    }
                    return m2123f(33);
                case 20:
                    if (keyEvent.isAltPressed()) {
                        return m2122e(130);
                    }
                    return m2123f(130);
                case 62:
                    boolean z2;
                    int i = keyEvent.isShiftPressed() ? 33 : 130;
                    if (i == 130) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int height = getHeight();
                    if (z2) {
                        this.f1977b.top = getScrollY() + height;
                        int childCount = getChildCount();
                        if (childCount > 0) {
                            childAt2 = getChildAt(childCount - 1);
                            if (this.f1977b.top + height > childAt2.getBottom()) {
                                this.f1977b.top = childAt2.getBottom() - height;
                            }
                        }
                    } else {
                        this.f1977b.top = getScrollY() - height;
                        if (this.f1977b.top < 0) {
                            this.f1977b.top = 0;
                        }
                    }
                    this.f1977b.bottom = height + this.f1977b.top;
                    m2107a(i, this.f1977b.top, this.f1977b.bottom);
                    return false;
                default:
                    return false;
            }
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            childAt2 = findFocus();
            if (childAt2 == this) {
                childAt2 = null;
            }
            childAt2 = FocusFinder.getInstance().findNextFocus(this, childAt2, 130);
            if (childAt2 == null || childAt2 == this || !childAt2.requestFocus(130)) {
                return false;
            }
            return true;
        }
    }

    private final void m2115b() {
        if (this.f1986k == null) {
            this.f1986k = VelocityTracker.obtain();
        }
    }

    private final void m2117c() {
        if (this.f1986k != null) {
            this.f1986k.recycle();
            this.f1986k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2117c();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        int action = motionEvent.getAction();
        if (action == 2 && this.f1985j) {
            return true;
        }
        int y;
        switch (action & HprofParser.ROOT_UNKNOWN) {
            case 0:
                boolean z2;
                y = (int) motionEvent.getY();
                action = (int) motionEvent.getX();
                if (getChildCount() > 0) {
                    int scrollY = getScrollY();
                    View childAt = getChildAt(0);
                    z2 = y >= childAt.getTop() - scrollY && y < childAt.getBottom() - scrollY && action >= childAt.getLeft() && action < childAt.getRight();
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.f1985j = false;
                    m2117c();
                    break;
                }
                this.f1981f = y;
                this.f1992q = motionEvent.getPointerId(0);
                if (this.f1986k == null) {
                    this.f1986k = VelocityTracker.obtain();
                } else {
                    this.f1986k.clear();
                }
                this.f1986k.addMovement(motionEvent);
                this.f1978c.computeScrollOffset();
                if (this.f1978c.isFinished()) {
                    z = false;
                }
                this.f1985j = z;
                m2118c(0);
                break;
                break;
            case 1:
            case 3:
                this.f1985j = false;
                this.f1992q = -1;
                m2117c();
                if (this.f1978c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m2126a())) {
                    ai.f1848a.mo391c(this);
                }
                n_(0);
                break;
            case 2:
                action = this.f1992q;
                if (action != -1) {
                    y = motionEvent.findPointerIndex(action);
                    if (y != -1) {
                        action = (int) motionEvent.getY(y);
                        if (Math.abs(action - this.f1981f) > this.f1989n && (getNestedScrollAxes() & 2) == 0) {
                            this.f1985j = true;
                            this.f1981f = action;
                            m2115b();
                            this.f1986k.addMovement(motionEvent);
                            this.f1995t = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    }
                    Log.e("NestedScrollView", "Invalid pointerId=" + action + " in onInterceptTouchEvent");
                    break;
                }
                break;
            case 6:
                m2106a(motionEvent);
                break;
        }
        return this.f1985j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m2115b();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1995t = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f1995t);
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f1978c.isFinished();
                    this.f1985j = z;
                    if (z) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!this.f1978c.isFinished()) {
                        this.f1978c.abortAnimation();
                    }
                    this.f1981f = (int) motionEvent.getY();
                    this.f1992q = motionEvent.getPointerId(0);
                    m2118c(0);
                    break;
                }
                return false;
            case 1:
                VelocityTracker velocityTracker = this.f1986k;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1991p);
                actionMasked = (int) velocityTracker.getYVelocity(this.f1992q);
                if (Math.abs(actionMasked) > this.f1990o) {
                    m2125h(-actionMasked);
                } else {
                    if (this.f1978c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m2126a())) {
                        ai.f1848a.mo391c(this);
                    }
                }
                this.f1992q = -1;
                m2119d();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f1992q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    actionMasked = this.f1981f - y;
                    if (m2110a(actionMasked, this.f1994s, this.f1993r, 0)) {
                        actionMasked -= this.f1994s[1];
                        obtain.offsetLocation(0.0f, (float) this.f1993r[1]);
                        this.f1995t += this.f1993r[1];
                    }
                    if (!this.f1985j && Math.abs(actionMasked) > this.f1989n) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1985j = true;
                        if (actionMasked > 0) {
                            actionMasked -= this.f1989n;
                        } else {
                            actionMasked += this.f1989n;
                        }
                    }
                    if (this.f1985j) {
                        boolean z2;
                        this.f1981f = y - this.f1993r[1];
                        int scrollY = getScrollY();
                        int a = m2126a();
                        y = getOverScrollMode();
                        if (y == 0 || (y == 1 && a > 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (m2108a(actionMasked, 0, getScrollY(), a) && !m2120d(0)) {
                            this.f1986k.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!m2109a(scrollY2, actionMasked - scrollY2, this.f1993r, 0)) {
                            if (z2) {
                                m2121e();
                                y = scrollY + actionMasked;
                                if (y < 0) {
                                    ab.m2153a(this.f1979d, ((float) actionMasked) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f1980e.isFinished()) {
                                        this.f1980e.onRelease();
                                    }
                                } else if (y > a) {
                                    ab.m2153a(this.f1980e, ((float) actionMasked) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f1979d.isFinished()) {
                                        this.f1979d.onRelease();
                                    }
                                }
                                if (!(this.f1979d == null || (this.f1979d.isFinished() && this.f1980e.isFinished()))) {
                                    ai.f1848a.mo391c(this);
                                    break;
                                }
                            }
                        }
                        this.f1981f -= this.f1993r[1];
                        obtain.offsetLocation(0.0f, (float) this.f1993r[1]);
                        this.f1995t += this.f1993r[1];
                        break;
                    }
                }
                Log.e("NestedScrollView", "Invalid pointerId=" + this.f1992q + " in onTouchEvent");
                break;
                break;
            case 3:
                if (this.f1985j && getChildCount() > 0) {
                    if (this.f1978c.springBack(getScrollX(), getScrollY(), 0, 0, 0, m2126a())) {
                        ai.f1848a.mo391c(this);
                    }
                }
                this.f1992q = -1;
                m2119d();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                this.f1981f = (int) motionEvent.getY(actionMasked);
                this.f1992q = motionEvent.getPointerId(actionMasked);
                break;
            case 6:
                m2106a(motionEvent);
                this.f1981f = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1992q));
                break;
        }
        if (this.f1986k != null) {
            this.f1986k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    private final void m2106a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1992q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f1981f = (int) motionEvent.getY(actionIndex);
            this.f1992q = motionEvent.getPointerId(actionIndex);
            if (this.f1986k != null) {
                this.f1986k.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            switch (motionEvent.getAction()) {
                case 8:
                    if (!this.f1985j) {
                        float axisValue = motionEvent.getAxisValue(9);
                        if (axisValue != 0.0f) {
                            if (this.f1974A == 0.0f) {
                                TypedValue typedValue = new TypedValue();
                                Context context = getContext();
                                if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                                    this.f1974A = typedValue.getDimension(context.getResources().getDisplayMetrics());
                                } else {
                                    throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
                                }
                            }
                            int i = (int) (axisValue * this.f1974A);
                            int a = m2126a();
                            int scrollY = getScrollY();
                            i = scrollY - i;
                            if (i < 0) {
                                a = 0;
                            } else if (i <= a) {
                                a = i;
                            }
                            if (a != scrollY) {
                                super.scrollTo(getScrollX(), a);
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private final boolean m2108a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i2 + 0;
        int i6 = i3 + i;
        int i7 = i4 + 0;
        if (i5 > 0) {
            z = true;
            i5 = 0;
        } else if (i5 < 0) {
            z = true;
            i5 = 0;
        } else {
            z = false;
        }
        if (i6 > i7) {
            z2 = true;
        } else if (i6 < 0) {
            z2 = true;
            i7 = 0;
        } else {
            z2 = false;
            i7 = i6;
        }
        if (z2 && !m2120d(1)) {
            this.f1978c.springBack(i5, i7, 0, 0, 0, m2126a());
        }
        onOverScrolled(i5, i7, z, z2);
        if (z || z2) {
            return true;
        }
        return false;
    }

    final int m2126a() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    private final boolean m2122e(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.f1977b.top = 0;
        this.f1977b.bottom = height;
        if (i2 != 0) {
            i2 = getChildCount();
            if (i2 > 0) {
                this.f1977b.bottom = getChildAt(i2 - 1).getBottom() + getPaddingBottom();
                this.f1977b.top = this.f1977b.bottom - height;
            }
        }
        return m2107a(i, this.f1977b.top, this.f1977b.bottom);
    }

    private final boolean m2107a(int i, int i2, int i3) {
        Object obj;
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        if (i == 33) {
            obj = 1;
        } else {
            obj = null;
        }
        List focusables = getFocusables(2);
        View view = null;
        Object obj2 = null;
        int size = focusables.size();
        int i5 = 0;
        while (i5 < size) {
            View view2;
            Object obj3;
            View view3 = (View) focusables.get(i5);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i2 < bottom && top < i3) {
                Object obj4 = (i2 >= top || bottom >= i3) ? null : 1;
                if (view == null) {
                    Object obj5 = obj4;
                    view2 = view3;
                    obj3 = obj5;
                } else {
                    Object obj6 = ((obj == null || top >= view.getTop()) && (obj != null || bottom <= view.getBottom())) ? null : 1;
                    if (obj2 != null) {
                        if (!(obj4 == null || obj6 == null)) {
                            view2 = view3;
                            obj3 = obj2;
                        }
                    } else if (obj4 != null) {
                        view2 = view3;
                        height = 1;
                    } else if (obj6 != null) {
                        view2 = view3;
                        obj3 = obj2;
                    }
                }
                i5++;
                view = view2;
                obj2 = obj3;
            }
            obj3 = obj2;
            view2 = view;
            i5++;
            view = view2;
            obj2 = obj3;
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2124g(obj != null ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    private final boolean m2123f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2112a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2124g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1977b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1977b);
            m2124g(m2104a(this.f1977b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m2111a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    private final boolean m2111a(View view) {
        return !m2112a(view, 0, getHeight());
    }

    private final boolean m2112a(View view, int i, int i2) {
        view.getDrawingRect(this.f1977b);
        offsetDescendantRectToMyCoords(view, this.f1977b);
        return this.f1977b.bottom + i >= getScrollY() && this.f1977b.top - i <= getScrollY() + i2;
    }

    private final void m2124g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1988m) {
            m2105a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private final void m2105a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1976a > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f1978c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                ai.f1848a.mo391c(this);
            } else {
                if (!this.f1978c.isFinished()) {
                    this.f1978c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f1976a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void m2128b(int i) {
        m2105a(0 - getScrollX(), i - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        height = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > height) {
            return bottom + (scrollY - height);
        }
        return bottom;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void computeScroll() {
        int i = 0;
        if (this.f1978c.computeScrollOffset()) {
            this.f1978c.getCurrX();
            int currY = this.f1978c.getCurrY();
            int i2 = currY - this.f1996u;
            if (m2110a(i2, this.f1994s, null, 1)) {
                i2 -= this.f1994s[1];
            }
            if (i2 != 0) {
                int a = m2126a();
                int scrollY = getScrollY();
                m2108a(i2, getScrollX(), scrollY, a);
                int scrollY2 = getScrollY() - scrollY;
                if (!m2109a(scrollY2, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 == 0 || (i2 == 1 && a > 0)) {
                        i = 1;
                    }
                    if (i != 0) {
                        m2121e();
                        if (currY <= 0 && scrollY > 0) {
                            this.f1979d.onAbsorb((int) this.f1978c.getCurrVelocity());
                        } else if (currY >= a && scrollY < a) {
                            this.f1980e.onAbsorb((int) this.f1978c.getCurrVelocity());
                        }
                    }
                }
            }
            this.f1996u = currY;
            ai.f1848a.mo391c(this);
            return;
        }
        if (m2120d(1)) {
            n_(1);
        }
        this.f1996u = 0;
    }

    private final void m2116b(View view) {
        view.getDrawingRect(this.f1977b);
        offsetDescendantRectToMyCoords(view, this.f1977b);
        int a = m2104a(this.f1977b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private final int m2104a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i && rect.top > scrollY) {
            if (rect.height() > height) {
                scrollY = (rect.top - scrollY) + 0;
            } else {
                scrollY = (rect.bottom - i) + 0;
            }
            scrollY = Math.min(scrollY, getChildAt(0).getBottom() - i);
        } else if (rect.top >= scrollY || rect.bottom >= i) {
            scrollY = 0;
        } else {
            if (rect.height() > height) {
                scrollY = 0 - (i - rect.bottom);
            } else {
                scrollY = 0 - (scrollY - rect.top);
            }
            scrollY = Math.max(scrollY, -getScrollY());
        }
        return scrollY;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f1982g) {
            this.f1984i = view2;
        } else {
            m2116b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || m2111a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m2104a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m2105a(0, a);
            }
        }
        return z2;
    }

    public void requestLayout() {
        this.f1982g = true;
        super.requestLayout();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f1982g = false;
        if (this.f1984i != null && m2113a(this.f1984i, (View) this)) {
            m2116b(this.f1984i);
        }
        this.f1984i = null;
        if (!this.f1983h) {
            if (this.f1997v != null) {
                scrollTo(getScrollX(), this.f1997v.f1971a);
                this.f1997v = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1983h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1983h = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2112a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1977b);
            offsetDescendantRectToMyCoords(findFocus, this.f1977b);
            m2124g(m2104a(this.f1977b));
        }
    }

    private static boolean m2113a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m2113a((View) parent, view2);
    }

    private final void m2125h(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < m2126a() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (getChildCount() > 0) {
                m2118c(1);
                this.f1978c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
                this.f1996u = getScrollY();
                ai.f1848a.mo391c(this);
            }
        }
    }

    private final void m2119d() {
        this.f1985j = false;
        m2117c();
        n_(0);
        if (this.f1979d != null) {
            this.f1979d.onRelease();
            this.f1980e.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m2114b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m2114b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    private final void m2121e() {
        if (getOverScrollMode() == 2) {
            this.f1979d = null;
            this.f1980e = null;
        } else if (this.f1979d == null) {
            Context context = getContext();
            this.f1979d = new EdgeEffect(context);
            this.f1980e = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1979d != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.f1979d.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f1979d.setSize(width, getHeight());
                if (this.f1979d.draw(canvas)) {
                    ai.f1848a.mo391c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1980e.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(m2126a(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f1980e.setSize(width, height);
                if (this.f1980e.draw(canvas)) {
                    ai.f1848a.mo391c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    private static int m2114b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        if (i2 + i > i3) {
            return i3 - i2;
        }
        return i;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f1997v = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1971a = getScrollY();
        return savedState;
    }
}
