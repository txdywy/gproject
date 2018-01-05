package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0129y;
import android.support.v4.view.aa;
import android.support.v4.view.ab;
import android.support.v4.view.ad;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class SwipeRefreshLayout extends ViewGroup implements ab, C0129y {
    public static final String f2000a = SwipeRefreshLayout.class.getSimpleName();
    public static final int[] f2001v = new int[]{16842766};
    public int f2002A;
    public int f2003B;
    public C0376g f2004C;
    public Animation f2005D;
    public Animation f2006E;
    public Animation f2007F;
    public Animation f2008G;
    public Animation f2009H;
    public boolean f2010I;
    public int f2011J;
    public boolean f2012K;
    public be f2013L;
    public AnimationListener f2014M;
    public final Animation f2015N;
    public final Animation f2016O;
    public View f2017b;
    public bf f2018c;
    public boolean f2019d;
    public int f2020e;
    public float f2021f;
    public float f2022g;
    public final ad f2023h;
    public final aa f2024i;
    public final int[] f2025j;
    public final int[] f2026k;
    public boolean f2027l;
    public int f2028m;
    public int f2029n;
    public float f2030o;
    public float f2031p;
    public boolean f2032q;
    public int f2033r;
    public boolean f2034s;
    public boolean f2035t;
    public final DecelerateInterpolator f2036u;
    public C0374e f2037w;
    public int f2038x;
    public int f2039y;
    public float f2040z;

    final void m2139a() {
        this.f2037w.clearAnimation();
        this.f2004C.stop();
        this.f2037w.setVisibility(8);
        this.f2037w.getBackground().setAlpha(HprofParser.ROOT_UNKNOWN);
        this.f2004C.setAlpha(HprofParser.ROOT_UNKNOWN);
        if (this.f2034s) {
            m2140a(0.0f);
        } else {
            m2141a(this.f2002A - this.f2029n);
        }
        this.f2029n = this.f2037w.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m2139a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2139a();
    }

    public int getProgressViewStartOffset() {
        return this.f2002A;
    }

    public int getProgressViewEndOffset() {
        return this.f2003B;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f2011J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f2011J = (int) (displayMetrics.density * 40.0f);
            }
            this.f2037w.setImageDrawable(null);
            this.f2004C.m2272a(i);
            this.f2037w.setImageDrawable(this.f2004C);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2019d = false;
        this.f2021f = -1.0f;
        this.f2025j = new int[2];
        this.f2026k = new int[2];
        this.f2033r = -1;
        this.f2038x = -1;
        this.f2014M = new aw(this);
        this.f2015N = new bb(this);
        this.f2016O = new bc(this);
        this.f2020e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2028m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f2036u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f2011J = (int) (40.0f * displayMetrics.density);
        this.f2037w = new C0374e(getContext());
        this.f2004C = new C0376g(getContext());
        this.f2004C.m2272a(1);
        this.f2037w.setImageDrawable(this.f2004C);
        this.f2037w.setVisibility(8);
        addView(this.f2037w);
        setChildrenDrawingOrderEnabled(true);
        this.f2003B = (int) (displayMetrics.density * 64.0f);
        this.f2021f = (float) this.f2003B;
        this.f2023h = new ad();
        this.f2024i = new aa(this);
        setNestedScrollingEnabled(true);
        int i = -this.f2011J;
        this.f2029n = i;
        this.f2002A = i;
        m2143b(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2001v);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f2038x < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f2038x;
        }
        if (i2 >= this.f2038x) {
            return i2 + 1;
        }
        return i2;
    }

    public void setOnRefreshListener(bf bfVar) {
        this.f2018c = bfVar;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f2019d == z) {
            m2132a(z, false);
            return;
        }
        int i;
        this.f2019d = z;
        if (this.f2012K) {
            i = this.f2003B;
        } else {
            i = this.f2003B + this.f2002A;
        }
        m2141a(i - this.f2029n);
        this.f2010I = false;
        AnimationListener animationListener = this.f2014M;
        this.f2037w.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f2004C.setAlpha(HprofParser.ROOT_UNKNOWN);
        }
        this.f2005D = new ax(this);
        this.f2005D.setDuration((long) this.f2028m);
        if (animationListener != null) {
            this.f2037w.f2143a = animationListener;
        }
        this.f2037w.clearAnimation();
        this.f2037w.startAnimation(this.f2005D);
    }

    final void m2140a(float f) {
        this.f2037w.setScaleX(f);
        this.f2037w.setScaleY(f);
    }

    private final void m2132a(boolean z, boolean z2) {
        if (this.f2019d != z) {
            this.f2010I = z2;
            m2134b();
            this.f2019d = z;
            if (this.f2019d) {
                int i = this.f2029n;
                AnimationListener animationListener = this.f2014M;
                this.f2039y = i;
                this.f2015N.reset();
                this.f2015N.setDuration(200);
                this.f2015N.setInterpolator(this.f2036u);
                if (animationListener != null) {
                    this.f2037w.f2143a = animationListener;
                }
                this.f2037w.clearAnimation();
                this.f2037w.startAnimation(this.f2015N);
                return;
            }
            m2142a(this.f2014M);
        }
    }

    final void m2142a(AnimationListener animationListener) {
        this.f2006E = new ay(this);
        this.f2006E.setDuration(150);
        this.f2037w.f2143a = animationListener;
        this.f2037w.clearAnimation();
        this.f2037w.startAnimation(this.f2006E);
    }

    private final Animation m2130a(int i, int i2) {
        Animation azVar = new az(this, i, i2);
        azVar.setDuration(300);
        this.f2037w.f2143a = null;
        this.f2037w.clearAnimation();
        this.f2037w.startAnimation(azVar);
        return azVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0216d.m1116c(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f2037w.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0216d.m1116c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        m2134b();
        C0376g c0376g = this.f2004C;
        c0376g.f2151d.m2279a(iArr);
        c0376g.f2151d.m2277a(0);
        c0376g.invalidateSelf();
    }

    private final void m2134b() {
        if (this.f2017b == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f2037w)) {
                    i++;
                } else {
                    this.f2017b = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f2021f = (float) i;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f2017b == null) {
                m2134b();
            }
            if (this.f2017b != null) {
                View view = this.f2017b;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                measuredHeight = this.f2037w.getMeasuredWidth();
                this.f2037w.layout((measuredWidth / 2) - (measuredHeight / 2), this.f2029n, (measuredWidth / 2) + (measuredHeight / 2), this.f2029n + this.f2037w.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2017b == null) {
            m2134b();
        }
        if (this.f2017b != null) {
            this.f2017b.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), MemoryMappedFileBuffer.DEFAULT_SIZE));
            this.f2037w.measure(MeasureSpec.makeMeasureSpec(this.f2011J, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(this.f2011J, MemoryMappedFileBuffer.DEFAULT_SIZE));
            this.f2038x = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f2037w) {
                    this.f2038x = i3;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.f2011J;
    }

    private final boolean m2136c() {
        if (this.f2013L != null) {
            return this.f2013L.m2219a();
        }
        if (!(this.f2017b instanceof ListView)) {
            return this.f2017b.canScrollVertically(-1);
        }
        ListView listView = (ListView) this.f2017b;
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    public void setOnChildScrollUpCallback(be beVar) {
        this.f2013L = beVar;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m2134b();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2035t && actionMasked == 0) {
            this.f2035t = false;
        }
        if (!isEnabled() || this.f2035t || m2136c() || this.f2019d || this.f2027l) {
            return false;
        }
        switch (actionMasked) {
            case 0:
                m2141a(this.f2002A - this.f2037w.getTop());
                this.f2033r = motionEvent.getPointerId(0);
                this.f2032q = false;
                actionMasked = motionEvent.findPointerIndex(this.f2033r);
                if (actionMasked >= 0) {
                    this.f2031p = motionEvent.getY(actionMasked);
                    break;
                }
                return false;
            case 1:
            case 3:
                this.f2032q = false;
                this.f2033r = -1;
                break;
            case 2:
                if (this.f2033r == -1) {
                    Log.e(f2000a, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                actionMasked = motionEvent.findPointerIndex(this.f2033r);
                if (actionMasked >= 0) {
                    m2138e(motionEvent.getY(actionMasked));
                    break;
                }
                return false;
            case 6:
                m2131a(motionEvent);
                break;
        }
        return this.f2032q;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f2017b instanceof AbsListView)) {
            if (this.f2017b != null) {
                if (!ai.f1848a.mo425x(this.f2017b)) {
                    return;
                }
            }
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f2035t || this.f2019d || (i & 2) == 0) ? false : true;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2023h.f1844a = i;
        startNestedScroll(i & 2);
        this.f2022g = 0.0f;
        this.f2027l = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f2022g > 0.0f) {
            if (((float) i2) > this.f2022g) {
                iArr[1] = i2 - ((int) this.f2022g);
                this.f2022g = 0.0f;
            } else {
                this.f2022g -= (float) i2;
                iArr[1] = i2;
            }
            m2135c(this.f2022g);
        }
        if (this.f2012K && i2 > 0 && this.f2022g == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f2037w.setVisibility(8);
        }
        int[] iArr2 = this.f2025j;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.f2023h.f1844a;
    }

    public void onStopNestedScroll(View view) {
        this.f2023h.f1844a = 0;
        this.f2027l = false;
        if (this.f2022g > 0.0f) {
            m2137d(this.f2022g);
            this.f2022g = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f2026k);
        int i5 = this.f2026k[1] + i4;
        if (i5 < 0 && !m2136c()) {
            this.f2022g = ((float) Math.abs(i5)) + this.f2022g;
            m2135c(this.f2022g);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2024i.m1794a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2024i.f1842d;
    }

    public boolean startNestedScroll(int i) {
        return this.f2024i.m1798a(i, 0);
    }

    public void stopNestedScroll() {
        this.f2024i.m1803b(0);
    }

    public boolean hasNestedScrollingParent() {
        return this.f2024i.m1797a(0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2024i.m1799a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2024i.m1801a(i, i2, iArr, iArr2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2024i.m1796a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2024i.m1795a(f, f2);
    }

    private static boolean m2133a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private final void m2135c(float f) {
        float f2;
        this.f2004C.m2273a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f2021f));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f2021f;
        if (this.f2012K) {
            f2 = (float) (this.f2003B - this.f2002A);
        } else {
            f2 = (float) this.f2003B;
        }
        abs = Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2);
        abs = ((float) (((double) (abs / 4.0f)) - Math.pow((double) (abs / 4.0f), 2.0d))) * 2.0f;
        int i = ((int) ((f2 * min) + ((f2 * abs) * 2.0f))) + this.f2002A;
        if (this.f2037w.getVisibility() != 0) {
            this.f2037w.setVisibility(0);
        }
        if (!this.f2034s) {
            this.f2037w.setScaleX(1.0f);
            this.f2037w.setScaleY(1.0f);
        }
        if (this.f2034s) {
            m2140a(Math.min(1.0f, f / this.f2021f));
        }
        if (f < this.f2021f) {
            if (this.f2004C.getAlpha() > 76 && !m2133a(this.f2007F)) {
                this.f2007F = m2130a(this.f2004C.getAlpha(), 76);
            }
        } else if (this.f2004C.getAlpha() < HprofParser.ROOT_UNKNOWN && !m2133a(this.f2008G)) {
            this.f2008G = m2130a(this.f2004C.getAlpha(), (int) HprofParser.ROOT_UNKNOWN);
        }
        this.f2004C.m2274b(Math.min(0.8f, max * 0.8f));
        this.f2004C.m2271a(Math.min(1.0f, max));
        min = ((-0.25f + (max * 0.4f)) + (abs * 2.0f)) * 0.5f;
        C0376g c0376g = this.f2004C;
        c0376g.f2151d.f2167g = min;
        c0376g.invalidateSelf();
        m2141a(i - this.f2029n);
    }

    private final void m2137d(float f) {
        if (f > this.f2021f) {
            m2132a(true, true);
            return;
        }
        this.f2019d = false;
        this.f2004C.m2274b(0.0f);
        AnimationListener animationListener = null;
        if (!this.f2034s) {
            animationListener = new ba(this);
        }
        int i = this.f2029n;
        if (this.f2034s) {
            this.f2039y = i;
            this.f2040z = this.f2037w.getScaleX();
            this.f2009H = new bd(this);
            this.f2009H.setDuration(150);
            if (animationListener != null) {
                this.f2037w.f2143a = animationListener;
            }
            this.f2037w.clearAnimation();
            this.f2037w.startAnimation(this.f2009H);
        } else {
            this.f2039y = i;
            this.f2016O.reset();
            this.f2016O.setDuration(200);
            this.f2016O.setInterpolator(this.f2036u);
            if (animationListener != null) {
                this.f2037w.f2143a = animationListener;
            }
            this.f2037w.clearAnimation();
            this.f2037w.startAnimation(this.f2016O);
        }
        this.f2004C.m2273a(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2035t && actionMasked == 0) {
            this.f2035t = false;
        }
        if (!isEnabled() || this.f2035t || m2136c() || this.f2019d || this.f2027l) {
            return false;
        }
        float y;
        switch (actionMasked) {
            case 0:
                this.f2033r = motionEvent.getPointerId(0);
                this.f2032q = false;
                break;
            case 1:
                actionMasked = motionEvent.findPointerIndex(this.f2033r);
                if (actionMasked < 0) {
                    Log.e(f2000a, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f2032q) {
                    y = (motionEvent.getY(actionMasked) - this.f2030o) * 0.5f;
                    this.f2032q = false;
                    m2137d(y);
                }
                this.f2033r = -1;
                return false;
            case 2:
                actionMasked = motionEvent.findPointerIndex(this.f2033r);
                if (actionMasked < 0) {
                    Log.e(f2000a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                y = motionEvent.getY(actionMasked);
                m2138e(y);
                if (this.f2032q) {
                    y = (y - this.f2030o) * 0.5f;
                    if (y > 0.0f) {
                        m2135c(y);
                        break;
                    }
                    return false;
                }
                break;
            case 3:
                return false;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                if (actionMasked >= 0) {
                    this.f2033r = motionEvent.getPointerId(actionMasked);
                    break;
                }
                Log.e(f2000a, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                return false;
            case 6:
                m2131a(motionEvent);
                break;
        }
        return true;
    }

    private final void m2138e(float f) {
        if (f - this.f2031p > ((float) this.f2020e) && !this.f2032q) {
            this.f2030o = this.f2031p + ((float) this.f2020e);
            this.f2032q = true;
            this.f2004C.setAlpha(76);
        }
    }

    final void m2143b(float f) {
        m2141a((this.f2039y + ((int) (((float) (this.f2002A - this.f2039y)) * f))) - this.f2037w.getTop());
    }

    final void m2141a(int i) {
        this.f2037w.bringToFront();
        ai.m1844d(this.f2037w, i);
        this.f2029n = this.f2037w.getTop();
    }

    private final void m2131a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2033r) {
            this.f2033r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
