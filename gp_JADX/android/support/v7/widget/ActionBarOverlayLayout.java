package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ab;
import android.support.v4.view.ad;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.support.v7.view.menu.ag;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements ab, bv {
    public static final int[] f2885A = new int[]{C0394a.actionBarSize, 16842841};
    public final ad f2886B;
    public int f2887a;
    public int f2888b;
    public ContentFrameLayout f2889c;
    public ActionBarContainer f2890d;
    public bw f2891e;
    public Drawable f2892f;
    public boolean f2893g;
    public boolean f2894h;
    public boolean f2895i;
    public boolean f2896j;
    public boolean f2897k;
    public int f2898l;
    public int f2899m;
    public final Rect f2900n;
    public final Rect f2901o;
    public final Rect f2902p;
    public final Rect f2903q;
    public final Rect f2904r;
    public final Rect f2905s;
    public final Rect f2906t;
    public C0411i f2907u;
    public OverScroller f2908v;
    public ViewPropertyAnimator f2909w;
    public final AnimatorListenerAdapter f2910x;
    public final Runnable f2911y;
    public final Runnable f2912z;

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2888b = 0;
        this.f2900n = new Rect();
        this.f2901o = new Rect();
        this.f2902p = new Rect();
        this.f2903q = new Rect();
        this.f2904r = new Rect();
        this.f2905s = new Rect();
        this.f2906t = new Rect();
        this.f2910x = new C0497f(this);
        this.f2911y = new C0498g(this);
        this.f2912z = new C0499h(this);
        m2951a(context);
        this.f2886B = new ad();
    }

    private final void m2951a(Context context) {
        boolean z;
        boolean z2 = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2885A);
        this.f2887a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2892f = obtainStyledAttributes.getDrawable(1);
        if (this.f2892f == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        }
        this.f2893g = z2;
        this.f2908v = new OverScroller(context);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2954a();
    }

    public void setActionBarVisibilityCallback(C0411i c0411i) {
        this.f2907u = c0411i;
        if (getWindowToken() != null) {
            this.f2907u.mo591c(this.f2888b);
            if (this.f2899m != 0) {
                onWindowSystemUiVisibilityChanged(this.f2899m);
                ai.f1848a.mo396h(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.f2894h = z;
        boolean z2 = z && getContext().getApplicationInfo().targetSdkVersion < 19;
        this.f2893g = z2;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2895i = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2951a(getContext());
        ai.f1848a.mo396h(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m2953i();
        int i2 = this.f2899m ^ i;
        this.f2899m = i;
        boolean z3 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f2907u != null) {
            C0411i c0411i = this.f2907u;
            if (z) {
                z2 = false;
            }
            c0411i.mo592e(z2);
            if (z3 || !z) {
                this.f2907u.mo595o();
            } else {
                this.f2907u.mo596p();
            }
        }
        if ((i2 & 256) != 0 && this.f2907u != null) {
            ai.f1848a.mo396h(this);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2888b = i;
        if (this.f2907u != null) {
            this.f2907u.mo591c(i);
        }
    }

    private static boolean m2952a(View view, Rect rect, boolean z) {
        boolean z2 = false;
        C0501j c0501j = (C0501j) view.getLayoutParams();
        if (c0501j.leftMargin != rect.left) {
            c0501j.leftMargin = rect.left;
            z2 = true;
        }
        if (c0501j.topMargin != rect.top) {
            c0501j.topMargin = rect.top;
            z2 = true;
        }
        if (c0501j.rightMargin != rect.right) {
            c0501j.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || c0501j.bottomMargin == rect.bottom) {
            return z2;
        }
        c0501j.bottomMargin = rect.bottom;
        return true;
    }

    protected boolean fitSystemWindows(Rect rect) {
        m2953i();
        ai.f1848a.mo403n(this);
        boolean a = m2952a(this.f2890d, rect, false);
        this.f2903q.set(rect);
        id.m3868a(this, this.f2903q, this.f2900n);
        if (!this.f2904r.equals(this.f2903q)) {
            this.f2904r.set(this.f2903q);
            a = true;
        }
        if (!this.f2901o.equals(this.f2900n)) {
            this.f2901o.set(this.f2900n);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0501j(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0501j;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        m2953i();
        measureChildWithMargins(this.f2890d, i, 0, i2, 0);
        C0501j c0501j = (C0501j) this.f2890d.getLayoutParams();
        int max = Math.max(0, (this.f2890d.getMeasuredWidth() + c0501j.leftMargin) + c0501j.rightMargin);
        int max2 = Math.max(0, c0501j.bottomMargin + (this.f2890d.getMeasuredHeight() + c0501j.topMargin));
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2890d.getMeasuredState());
        boolean z = (ai.f1848a.mo403n(this) & 256) != 0;
        if (z) {
            i3 = this.f2887a;
            if (this.f2895i && this.f2890d.getTabContainer() != null) {
                i3 += this.f2887a;
            }
        } else {
            i3 = this.f2890d.getVisibility() != 8 ? this.f2890d.getMeasuredHeight() : 0;
        }
        this.f2902p.set(this.f2900n);
        this.f2905s.set(this.f2903q);
        Rect rect;
        Rect rect2;
        if (this.f2894h || z) {
            rect = this.f2905s;
            rect.top = i3 + rect.top;
            rect2 = this.f2905s;
            rect2.bottom += 0;
        } else {
            rect = this.f2902p;
            rect.top = i3 + rect.top;
            rect2 = this.f2902p;
            rect2.bottom += 0;
        }
        m2952a(this.f2889c, this.f2902p, true);
        if (!this.f2906t.equals(this.f2905s)) {
            this.f2906t.set(this.f2905s);
            this.f2889c.m2484a(this.f2905s);
        }
        measureChildWithMargins(this.f2889c, i, 0, i2, 0);
        c0501j = (C0501j) this.f2889c.getLayoutParams();
        int max3 = Math.max(max, (this.f2889c.getMeasuredWidth() + c0501j.leftMargin) + c0501j.rightMargin);
        i3 = Math.max(max2, c0501j.bottomMargin + (this.f2889c.getMeasuredHeight() + c0501j.topMargin));
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2889c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0501j c0501j = (C0501j) childAt.getLayoutParams();
                int i6 = c0501j.leftMargin + paddingLeft;
                int i7 = c0501j.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2892f != null && !this.f2893g) {
            int bottom = this.f2890d.getVisibility() == 0 ? (int) ((((float) this.f2890d.getBottom()) + this.f2890d.getTranslationY()) + 0.5f) : 0;
            this.f2892f.setBounds(0, bottom, getWidth(), this.f2892f.getIntrinsicHeight() + bottom);
            this.f2892f.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2890d.getVisibility() != 0) {
            return false;
        }
        return this.f2896j;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2886B.f1844a = i;
        this.f2898l = getActionBarHideOffset();
        m2954a();
        if (this.f2907u != null) {
            this.f2907u.mo597q();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f2898l += i2;
        setActionBarHideOffset(this.f2898l);
    }

    public void onStopNestedScroll(View view) {
        if (this.f2896j && !this.f2897k) {
            if (this.f2898l <= this.f2890d.getHeight()) {
                m2954a();
                postDelayed(this.f2911y, 600);
            } else {
                m2954a();
                postDelayed(this.f2912z, 600);
            }
        }
        if (this.f2907u != null) {
            this.f2907u.mo598r();
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f2896j || !z) {
            return false;
        }
        this.f2908v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2908v.getFinalY() > this.f2890d.getHeight()) {
            m2954a();
            this.f2912z.run();
        } else {
            m2954a();
            this.f2911y.run();
        }
        this.f2897k = true;
        return true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.f2886B.f1844a;
    }

    private final void m2953i() {
        if (this.f2889c == null) {
            bw bwVar;
            this.f2889c = (ContentFrameLayout) findViewById(C0399f.action_bar_activity_content);
            this.f2890d = (ActionBarContainer) findViewById(C0399f.action_bar_container);
            View findViewById = findViewById(C0399f.action_bar);
            if (findViewById instanceof bw) {
                bwVar = (bw) findViewById;
            } else if (findViewById instanceof Toolbar) {
                bwVar = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.f2891e = bwVar;
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2896j) {
            this.f2896j = z;
            if (!z) {
                m2954a();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        return this.f2890d != null ? -((int) this.f2890d.getTranslationY()) : 0;
    }

    public void setActionBarHideOffset(int i) {
        m2954a();
        this.f2890d.setTranslationY((float) (-Math.max(0, Math.min(i, this.f2890d.getHeight()))));
    }

    final void m2954a() {
        removeCallbacks(this.f2911y);
        removeCallbacks(this.f2912z);
        if (this.f2909w != null) {
            this.f2909w.cancel();
        }
    }

    public void setWindowCallback(Callback callback) {
        m2953i();
        this.f2891e.mo890a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        m2953i();
        this.f2891e.mo891a(charSequence);
    }

    public CharSequence getTitle() {
        m2953i();
        return this.f2891e.mo904e();
    }

    public final void mo704a(int i) {
        m2953i();
        switch (i) {
            case 2:
                this.f2891e.mo906f();
                return;
            case 5:
                this.f2891e.mo908g();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    public void setUiOptions(int i) {
    }

    public void setIcon(int i) {
        m2953i();
        this.f2891e.mo885a(i);
    }

    public void setIcon(Drawable drawable) {
        m2953i();
        this.f2891e.mo886a(drawable);
    }

    public void setLogo(int i) {
        m2953i();
        this.f2891e.mo894b(i);
    }

    public final boolean mo706b() {
        m2953i();
        return this.f2891e.mo909h();
    }

    public final boolean mo707c() {
        m2953i();
        return this.f2891e.mo910i();
    }

    public final boolean mo708d() {
        m2953i();
        return this.f2891e.mo911j();
    }

    public final boolean mo709e() {
        m2953i();
        return this.f2891e.mo912k();
    }

    public final boolean mo710f() {
        m2953i();
        return this.f2891e.mo913l();
    }

    public final void mo711g() {
        m2953i();
        this.f2891e.mo914m();
    }

    public final void mo705a(Menu menu, ag agVar) {
        m2953i();
        this.f2891e.mo889a(menu, agVar);
    }

    public final void mo712h() {
        m2953i();
        this.f2891e.mo915n();
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0501j();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0501j(getContext(), attributeSet);
    }
}
