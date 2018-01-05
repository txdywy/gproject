package com.google.android.play.headerlist;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ai;
import android.support.v4.view.be;
import android.support.v4.view.bi;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.bf;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.em;
import android.support.v7.widget.fe;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.play.animation.a;
import com.google.android.play.animation.c;
import com.google.android.play.d;
import com.google.android.play.e;
import com.google.android.play.f;
import com.google.android.play.g;
import com.google.android.play.h;
import com.google.android.play.widget.ScrollProxyView;
import com.squareup.haha.perflib.HprofParser;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

public class PlayHeaderListLayout extends FrameLayout implements bf {
    public static final boolean f31822s;
    public static final boolean f31823t;
    public static Map f31824w = new WeakHashMap();
    public a f31825A;
    public View f31826B;
    public a f31827C;
    public a f31828D;
    public View f31829E;
    public a f31830F;
    public FrameLayout f31831G;
    public a f31832H;
    public int f31833I;
    public View f31834J;
    public PlayHeaderListTabStrip f31835K;
    public TextView f31836L;
    public TextView f31837M;
    public a f31838N;
    public PlayHeaderStatusBarUnderlay f31839O;
    public Toolbar f31840P;
    public ViewGroup f31841Q;
    public int f31842R;
    public int f31843S;
    public a f31844T;
    public ViewPager f31845U;
    public ViewGroup f31846V;
    public SwipeRefreshLayout f31847W;
    public fe aA;
    public C6347m aB;
    public C6349o aC;
    public CharSequence aD;
    public int aE;
    public int aF;
    public float aG;
    public boolean aH;
    public float aI;
    public int aJ;
    public boolean aK;
    public int aL;
    public boolean aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public float aQ;
    public boolean aR;
    public Runnable aS;
    public boolean aT;
    public ObjectAnimator aU;
    public C6346l aV;
    public boolean aW;
    public boolean aX;
    public boolean aY;
    public int aZ;
    public a aa;
    public ScrollProxyView ab;
    public int ac;
    public int ad;
    public int ae;
    public boolean af;
    public boolean ag;
    public int ah;
    public boolean ai;
    public int aj;
    public float ak;
    public int al;
    public int am;
    public Drawable an;
    public int ao;
    public int ap;
    public boolean aq;
    public int ar;
    public boolean as;
    public int at;
    public int au;
    public boolean av;
    public C6341g aw;
    public bi ax;
    public Drawable ay;
    public OnScrollListener az;
    public boolean ba;
    public boolean bb;
    public final C6351q bc;
    public final C6353s bd;
    public final C6358x be;
    public final float bf;
    public SavedState bg;
    public Map bh;
    public final Runnable bi;
    public final Runnable bj;
    public final Runnable bk;
    public ViewGroup f31848g;
    public final Handler f31849u;
    public final bi f31850v;
    public FrameLayout f31851x;
    public a f31852y;
    public View f31853z;

    class SavedState extends BaseSavedState {
        public static final Creator CREATOR = new C6350p();
        public final int f31820a;
        public final boolean f31821b;

        SavedState(Parcelable parcelable, PlayHeaderListLayout playHeaderListLayout) {
            super(parcelable);
            this.f31820a = playHeaderListLayout.aJ;
            this.f31821b = playHeaderListLayout.aT;
        }

        SavedState(Parcel parcel) {
            boolean z = true;
            super(parcel);
            this.f31820a = parcel.readInt();
            if (parcel.readByte() != (byte) 1) {
                z = false;
            }
            this.f31821b = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f31820a);
            parcel.writeInt(this.f31821b ? 1 : 0);
        }

        public String toString() {
            return String.format(Locale.US, "absoluteY: %d, lastSnapControlsWasDown: %s", new Object[]{Integer.valueOf(this.f31820a), Boolean.valueOf(this.f31821b)});
        }
    }

    public static int m29045a(Context context, int i, int i2, int i3) {
        return (m29044a(context, i) + i2) + i3;
    }

    public static int m29054b(Context context, int i, int i2, int i3) {
        return ((m29044a(context, i) + 0) + i2) + i3;
    }

    public PlayHeaderListLayout(Context context) {
        this(context, null);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31849u = new Handler();
        this.f31850v = new C6335a(this);
        this.ap = 0;
        this.aL = -1;
        this.aN = true;
        this.aQ = 0.5f;
        this.aR = true;
        this.aY = false;
        this.bc = new C6351q(this);
        this.bd = new C6353s(this);
        this.be = new C6358x(this);
        this.bh = new HashMap();
        this.bi = new C6336b(this);
        this.bj = new C6337c(this);
        this.bk = new C6338d(this);
        this.bf = context.getResources().getDisplayMetrics().density * 20.0f;
    }

    @SuppressLint({"newapi"})
    public void m29089a(C6344i c6344i) {
        boolean z;
        int h;
        ViewGroup viewGroup;
        this.aw = new C6345j(c6344i);
        this.ak = c6344i.m29136k();
        this.ad = c6344i.m29125b();
        this.ac = c6344i.m29132g();
        this.ae = g.play_header_spacer;
        this.ae = this.ae == 0 ? g.play_header_spacer : this.ae;
        this.af = c6344i.K_();
        this.ag = c6344i.m29131f();
        this.ah = c6344i.m29144u();
        if (c6344i.m29140q() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.ai = z;
        this.ap = c6344i.m29130e();
        if (c6344i.m29129d() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.aq = z;
        this.ar = c6344i.m29134i();
        this.au = c6344i.m29127c();
        this.as = c6344i.m29135j();
        if (f31823t && c6344i.m29137l()) {
            z = true;
        } else {
            z = false;
        }
        this.av = z;
        if (f31822s) {
            h = c6344i.m29133h();
        } else {
            h = 1;
        }
        this.at = h;
        this.al = 0;
        this.am = 0;
        this.aX = c6344i.m29141r();
        LayoutInflater from = LayoutInflater.from(getContext());
        View a = c6344i.m29122a(getContext(), from);
        if (f31822s) {
            h = h.play_header_list_layout;
        } else {
            h = h.play_header_list_layout_gb;
        }
        from.inflate(h, this);
        this.f31851x = (FrameLayout) findViewById(g.background_container);
        this.f31852y = new a(this.f31851x);
        this.f31853z = findViewById(g.alt_play_background);
        this.f31825A = new a(this.f31853z);
        this.f31826B = findViewById(g.content_container);
        this.f31827C = new a(this.f31826B);
        this.an = new ColorDrawable(c6344i.f31900f.getResources().getColor(d.play_main_background));
        this.f31848g = (ViewGroup) findViewById(g.controls_container);
        this.f31828D = new a(this.f31848g);
        this.f31829E = findViewById(g.header_shadow);
        this.f31830F = new a(this.f31829E);
        this.f31831G = (FrameLayout) findViewById(g.hero_container);
        this.f31832H = new a(this.f31831G);
        this.f31833I = c6344i.m29142s();
        if (this.f31833I > 0) {
            from.inflate(h.phll_controls_tabs_and_subnav, this.f31848g);
            FrameLayout frameLayout = (FrameLayout) findViewById(g.subnav_container);
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            layoutParams.height = this.f31833I;
            frameLayout.setLayoutParams(layoutParams);
            c6344i.m29126b(from, frameLayout);
        } else {
            from.inflate(h.phll_controls_just_tabs, this.f31848g);
        }
        this.f31834J = findViewById(g.tab_bar);
        this.f31835K = (PlayHeaderListTabStrip) findViewById(g.pager_tab_strip);
        if (a != null) {
            View view = this.f31835K;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            viewGroup = (ViewGroup) view.getParent();
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            viewGroup.addView(a, indexOfChild, layoutParams2);
            View childAt = view.getChildAt(0);
            view.removeViewAt(0);
            a.addView(childAt);
            a.m29108c();
            this.f31835K = a;
        }
        this.f31835K.f31873q = this.f31850v;
        this.f31835K.m29110d(f.play_header_list_tab_high_contrast_bg);
        this.f31836L = (TextView) findViewById(g.tab_bar_title);
        this.aj = c6344i.m29143t();
        this.ao = c6344i.m29146x();
        m29064e(this.aj - this.ao);
        m29078r();
        if (this.af) {
            this.f31840P = (Toolbar) from.inflate(h.play_header_list_toolbar, getToolbarContainer(), false);
            getToolbarContainer().addView(this.f31840P);
            m29087a(this.f31840P);
        } else {
            this.f31840P = (Toolbar) this.aw.mo5393a().getWindow().findViewById(g.action_bar);
        }
        this.f31842R = c6344i.m29121a(getContext());
        this.f31841Q = getToolbarContainer();
        this.f31844T = new a(this.f31841Q);
        this.f31837M = (TextView) findViewById(g.play_header_banner);
        this.f31838N = new a(this.f31837M);
        if (this.av) {
            this.f31839O = (PlayHeaderStatusBarUnderlay) findViewById(g.play_header_status_bar_underlay);
            this.f31839O.setVisibility(0);
            this.f31839O.setOutlineProvider(null);
            this.f31839O.m29114a(c6344i.m29138m(), c6344i.m29139n());
            this.f31837M.setBackground(null);
        }
        this.f31847W = (SwipeRefreshLayout) findViewById(g.swipe_refresh_layout);
        this.aa = new a(this.f31847W);
        this.f31847W.setOnRefreshListener(this);
        this.ab = (ScrollProxyView) findViewById(g.scroll_proxy);
        m29058b(false);
        if (f31822s) {
            c6344i.m29124a(this.f31831G);
            c6344i.m29123a(from, this.f31851x);
        } else if (!this.as) {
            c6344i.m29123a(from, this.f31851x);
        }
        viewGroup = (ViewGroup) this.f31826B;
        c6344i.m29128c(from, viewGroup);
        if (viewGroup.getChildCount() == 1) {
            view = viewGroup.getChildAt(0);
            int indexOfChild2 = indexOfChild(this.f31826B);
            removeViewAt(indexOfChild2);
            viewGroup.removeViewAt(0);
            addView(view, indexOfChild2);
            this.f31826B = view;
            this.f31827C = new a(this.f31826B);
        }
        if (f31822s) {
            m29057b(this.f31841Q, -3);
            this.f31844T.c(3.0f);
            m29057b(this.f31837M, -2);
            this.f31838N.c((float) ((-getBannerHeight()) + 2));
        } else {
            this.f31838N.c((float) (-getBannerHeight()));
        }
        h = c6344i.m29145w();
        if (h != 0) {
            addView(from.inflate(h, this, false), 0);
        }
        m29070j();
        m29071k();
        if (VERSION.SDK_INT >= 14) {
            this.f31848g.setOnHoverListener(new C6339e(this));
        }
        if (this.as) {
            m29056b(this.ay, false);
        }
        if (this.av) {
            m29052a(false);
        }
        setBannerFraction(this.aG);
        m29062d(false);
        m29076p();
        m29072l();
        m29055b();
    }

    public final void m29083a(int i, int i2) {
        if (this.f31839O != null) {
            this.f31839O.m29114a(i, i2);
            this.f31839O.invalidate();
        }
    }

    public void setAlwaysUseFloatingBackground(boolean z) {
        this.as = z;
        if (this.as) {
            m29056b(this.ay, false);
        } else {
            m29056b(null, true);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.bg = savedState;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m29072l();
        m29099g();
        boolean z2 = this.bg != null;
        if (!(this.bg == null || this.f31846V == null)) {
            if (!m29061c(false)) {
                this.aJ = this.bg.f31820a;
            }
            this.aT = this.bg.f31821b;
            m29090a(this.aT, false);
            m29094c();
            m29065e(false);
            this.bg = null;
            this.aM = false;
        }
        if (!z2) {
            if (z) {
                this.aZ = 2;
            }
            if (this.aK) {
                m29061c(true);
                this.aK = false;
            }
        }
        switch (this.aZ) {
            case 1:
                m29065e(false);
                break;
            case 2:
                m29065e(true);
                break;
        }
        if (z) {
            m29077q();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.bb) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onInterceptTouchEvent = this.f31847W.onInterceptTouchEvent(obtain);
        obtain.recycle();
        if (!onInterceptTouchEvent) {
            return onInterceptTouchEvent;
        }
        float f;
        a aVar = this.aa;
        if (aVar.a == null || VERSION.SDK_INT < 11) {
            f = aVar.b;
        } else {
            f = aVar.a.getAlpha();
        }
        if (f >= 1.0f) {
            return onInterceptTouchEvent;
        }
        this.aa.a(1.0f);
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.bb) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        boolean onTouchEvent = this.f31847W.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }

    @TargetApi(21)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        int i = this.aF;
        this.aF = Math.max(systemWindowInsetTop, i);
        if (!this.av) {
            return super.onApplyWindowInsets(windowInsets);
        }
        if (this.aF != i) {
            m29052a(true);
        }
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    private static void m29050a(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    private final void m29052a(boolean z) {
        if (this.av) {
            ((FrameLayout.LayoutParams) this.f31839O.getLayoutParams()).height = this.aF + this.f31837M.getLayoutParams().height;
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.f31839O;
            int i = this.aF;
            if (f31823t && playHeaderStatusBarUnderlay.f31887e != i) {
                playHeaderStatusBarUnderlay.f31887e = i;
                playHeaderStatusBarUnderlay.invalidate();
            }
            this.f31839O.requestLayout();
            m29057b(this.f31853z, this.aF);
            m29057b(this.f31826B, this.aF);
            m29057b(this.f31848g, -1);
            this.f31848g.setClipToPadding(false);
            m29050a(this.f31848g, this.aF);
            m29064e(this.f31843S);
            m29078r();
            m29057b(this.f31841Q, -3);
            if (this.af) {
                m29050a(this.f31841Q, this.aF);
            }
            if (z) {
                m29094c();
            }
        }
    }

    private static void m29057b(View view, int i) {
        ((MarginLayoutParams) view.getLayoutParams()).topMargin = i;
        view.requestLayout();
    }

    private final void m29058b(boolean z) {
        boolean z2;
        int i = 1;
        if (this.ab.getScrollY() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            ScrollProxyView scrollProxyView = this.ab;
            if (z) {
                i = 0;
            }
            scrollProxyView.scrollTo(0, i);
        }
    }

    public final void m29081a() {
        if (this.aC != null) {
            this.aC.m29152a();
        }
    }

    public void setPullToRefreshProvider(C6349o c6349o) {
        if (this.f31847W == null) {
            throw new IllegalStateException("Cannot initialize pull to refresh before HeaderListLayout has been configured");
        }
        this.f31847W.setRefreshing(false);
        this.aa.a(1.0f);
        this.aa.c(0.0f);
        this.aC = c6349o;
        m29099g();
        findViewById(g.swipe_refresh_layout_parent).setVisibility(this.aC != null ? 0 : 8);
        if (this.aC != null) {
            throw new NoSuchMethodError();
        }
        m29058b(false);
    }

    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return this.f31847W;
    }

    public void setFloatingControlsBackground(Drawable drawable) {
        m29086a(drawable, false);
    }

    public final void m29086a(Drawable drawable, boolean z) {
        this.ay = drawable;
        if ((this.f31848g != null && this.aO) || this.as) {
            m29056b(this.ay, z);
        }
    }

    public void setSingleTabTitle(CharSequence charSequence) {
        this.f31836L.setText(charSequence);
    }

    public void setSingleTabTitle(int i) {
        this.f31836L.setText(i);
    }

    public void setSingleTabContentDescription(CharSequence charSequence) {
        this.f31836L.setContentDescription(charSequence);
    }

    public void setOnPageChangeListener(bi biVar) {
        this.ax = biVar;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.az = onScrollListener;
    }

    public void setOnScrollListener(fe feVar) {
        this.aA = feVar;
    }

    public void setOnScrollListener(aa aaVar) {
    }

    public void setOnLayoutChangedListener(C6347m c6347m) {
        this.aB = c6347m;
    }

    public void setOnTabSelectedListener(C6348n c6348n) {
        this.f31835K.f31878v = c6348n;
    }

    private final void m29051a(CharSequence charSequence) {
        this.f31849u.removeCallbacks(this.bk);
        this.aS = null;
        this.aD = charSequence;
        if (charSequence == null) {
            m29067f(false);
            return;
        }
        this.f31837M.setText(charSequence);
        m29067f(true);
    }

    public void setBannerText(CharSequence charSequence) {
        m29051a(charSequence);
    }

    public void setBannerText(int i) {
        if (i == 0) {
            setBannerText(null);
        } else {
            m29051a(getResources().getText(i));
        }
    }

    public void setBannerOnClickListener(OnClickListener onClickListener) {
        this.f31837M.setOnClickListener(onClickListener);
    }

    public CharSequence getBannerText() {
        return this.aD;
    }

    public final boolean m29096d() {
        return this.av && this.f31839O.f31891i;
    }

    public int getStatusBarHeight() {
        return this.av ? this.aF : 0;
    }

    public final void m29085a(int i, boolean z) {
        if (this.aE != i) {
            this.aE = i;
            this.aW = false;
            switch (i) {
                case 1:
                    m29090a(true, z);
                    return;
                case 2:
                case 3:
                    m29090a(false, z);
                    return;
                default:
                    return;
            }
        }
    }

    public int getHeaderLockMode() {
        return this.aE;
    }

    public void setHeaderShadowMode(int i) {
        if (this.au != i) {
            this.au = i;
            m29094c();
        }
    }

    public void setHeaderMode(int i) {
        if (this.ar != i) {
            this.ar = i;
            m29094c();
        }
    }

    public void setBackgroundParallaxRatio(float f) {
        if (this.ak != f) {
            this.ak = f;
            m29094c();
        }
    }

    public void setContentProtectionMode(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (this.ai != z) {
            this.ai = z;
            m29071k();
            m29094c();
        }
    }

    public final void m29091b(int i, int i2) {
        boolean z;
        if (this.ah != i) {
            this.ah = i;
            m29070j();
            z = true;
        } else {
            z = false;
        }
        if (i2 != this.aj) {
            this.aj = i2;
            m29064e(this.aj - this.ao);
            m29078r();
            z = true;
        }
        if (z) {
            m29065e(true);
        }
        m29062d(false);
        m29094c();
    }

    public int getTabMode() {
        return this.ah;
    }

    public int getHeaderHeight() {
        return this.aj;
    }

    public float getVisibleHeaderHeight() {
        if (this.aO) {
            return getNonScrollingFloatingHeaderHeight() + (getScrollingFloatingHeaderHeight() * this.aI);
        }
        return m29068h() - ((float) this.ao);
    }

    public final boolean m29097e() {
        return this.aO || this.as;
    }

    public final void m29087a(Toolbar toolbar) {
        this.aw.mo5393a().a(toolbar);
    }

    protected final void setActionBarTitleAlpha(float f) {
        if (this.aQ != f) {
            this.aQ = f;
            m29088a(this.f31840P, f);
        }
    }

    public void m29088a(Toolbar toolbar, float f) {
        int max = (Math.max(0, Math.min(HprofParser.ROOT_UNKNOWN, Math.round(255.0f * f))) << 24) | 16777215;
        toolbar.setTitleTextColor(max);
        toolbar.setSubtitleTextColor(max);
    }

    protected final float getActionBarTitleAlpha() {
        return this.aQ;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29055b();
    }

    private final void m29055b() {
        if (ai.a.t(this) && this.f31840P != null && !this.ba) {
            this.ba = true;
            Integer num = (Integer) f31824w.get(this.f31840P);
            f31824w.put(this.f31840P, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
            m29072l();
            m29077q();
            if (this.aq) {
                setActionBarTitleAlpha(0.0f);
            } else {
                setActionBarTitleAlpha(1.0f);
            }
            m29099g();
        }
    }

    public void onDetachedFromWindow() {
        m29098f();
        super.onDetachedFromWindow();
    }

    public final void m29098f() {
        if (this.ba) {
            this.ba = false;
            Integer num = (Integer) f31824w.get(this.f31840P);
            num = Integer.valueOf(num == null ? 0 : num.intValue() - 1);
            if (num.intValue() == 0) {
                f31824w.remove(this.f31840P);
            } else {
                f31824w.put(this.f31840P, num);
            }
            m29066e(null);
            this.f31849u.removeCallbacksAndMessages(null);
            if (!this.af && num.intValue() == 0) {
                this.f31844T.c(0.0f);
                m29057b(this.f31841Q, 0);
            }
            this.aS = null;
        }
    }

    private final boolean m29066e(ViewGroup viewGroup) {
        if (this.f31846V != viewGroup) {
            boolean z = this.f31846V != null;
            if (this.f31846V != null) {
                if (this.f31846V instanceof ListView) {
                    ((ListView) this.f31846V).setOnScrollListener(null);
                    this.bc.m29155a(true);
                } else if (this.f31846V instanceof RecyclerView) {
                    ((RecyclerView) this.f31846V).setOnScrollListener(null);
                    this.bd.m29159a(true);
                } else if (this.f31846V instanceof C6360z) {
                    ((C6360z) this.f31846V).m29168a();
                    this.be.m29167a(true);
                }
                this.aM = true;
            }
            this.f31846V = viewGroup;
            if (this.f31846V == null) {
                return false;
            }
            boolean z2 = this.aM;
            if (!this.aM) {
                this.aM = this.f31846V.isLayoutRequested();
            }
            if (this.f31846V instanceof ListView) {
                ((ListView) this.f31846V).setOnScrollListener(this.bc);
            } else if (this.f31846V instanceof RecyclerView) {
                ((RecyclerView) this.f31846V).setOnScrollListener(this.bd);
            } else if (this.f31846V instanceof C6360z) {
                ((C6360z) this.f31846V).m29168a();
            }
            this.aM = z2;
            if (z) {
                m29065e(true);
            }
            if (this.aC != null) {
                if (this.ag) {
                    this.f31845U.getCurrentItem();
                }
                throw new NoSuchMethodError();
            }
            this.bb = false;
            return true;
        } else if (this.f31846V != null) {
            return true;
        } else {
            return false;
        }
    }

    final void m29099g() {
        m29066e(m29060c(1));
    }

    private final int m29053b(int i) {
        int currentItem = this.f31845U.getCurrentItem();
        if (i == 0) {
            currentItem--;
        }
        if (i == 2) {
            return currentItem + 1;
        }
        return currentItem;
    }

    public ViewGroup getCurrentListView() {
        return m29060c(1);
    }

    private final ViewGroup m29060c(int i) {
        if (this.f31845U == null && i == 1) {
            return m29047a(this.f31826B.findViewById(this.ad));
        }
        View view;
        int b = m29053b(i);
        if (this.f31845U == null || this.f31845U.getAdapter() == null || b < 0 || b >= this.f31845U.getAdapter().a()) {
            view = null;
        } else {
            for (int i2 = 0; i2 < this.f31845U.getChildCount(); i2++) {
                View childAt = this.f31845U.getChildAt(i2);
                be a = this.f31845U.a(childAt);
                Integer valueOf = a == null ? null : Integer.valueOf(a.b);
                if (valueOf != null && valueOf.intValue() == b) {
                    view = childAt;
                    break;
                }
            }
            view = null;
        }
        if (view != null) {
            return m29047a(view.findViewById(this.ad));
        }
        return null;
    }

    private static ViewGroup m29047a(View view) {
        if (view == null || (view instanceof ListView) || (view instanceof RecyclerView) || (view instanceof C6360z)) {
            return (ViewGroup) view;
        }
        throw new IllegalStateException("Found a view that isn't a ListView or a RecyclerView or a PlayScrollableContentView implementation");
    }

    private final float m29068h() {
        if (this.aJ == -1) {
            return (float) this.ao;
        }
        return (float) Math.max(this.ao, this.aj - this.aJ);
    }

    public float getFullFloatingHeaderHeight() {
        return (((float) getActionBarHeight()) + m29069i()) + ((float) getSubNavHeight());
    }

    public float getNonScrollingFloatingHeaderHeight() {
        switch (this.ar) {
            case 1:
                return 0.0f + (m29069i() + ((float) getSubNavHeight()));
            case 2:
                return 0.0f + ((float) getActionBarHeight());
            case 3:
                return 0.0f + ((m29069i() + ((float) getActionBarHeight())) + ((float) getSubNavHeight()));
            case 4:
                return 0.0f + ((float) getSubNavHeight());
            default:
                return 0.0f;
        }
    }

    public float getScrollingFloatingHeaderHeight() {
        switch (this.ar) {
            case 0:
                return (m29069i() + ((float) getActionBarHeight())) + ((float) getSubNavHeight());
            case 1:
                return (float) getActionBarHeight();
            case 2:
                return m29069i() + ((float) getSubNavHeight());
            case 3:
                return 0.0f;
            case 4:
                return m29069i() + ((float) getActionBarHeight());
            default:
                throw new IllegalStateException();
        }
    }

    private final float m29069i() {
        return (float) m29044a(getContext(), this.ah);
    }

    static int m29043a(Context context) {
        return context.getResources().getDimensionPixelSize(e.abc_action_bar_default_height_material);
    }

    public int getActionBarHeight() {
        return this.f31842R;
    }

    public int getSubNavHeight() {
        return this.f31833I;
    }

    public float getActionBarTranslationY() {
        return this.f31844T.a();
    }

    public float getControlsContainerTranslationY() {
        return this.f31828D.a();
    }

    public float getFloatingHeaderElevation() {
        return (float) getResources().getDimensionPixelSize(e.play_header_list_floating_elevation);
    }

    private static int m29044a(Context context, int i) {
        switch (i) {
            case 0:
            case 1:
                return context.getResources().getDimensionPixelSize(e.play_header_list_tab_strip_height);
            case 2:
                return 0;
            default:
                throw new IllegalStateException();
        }
    }

    public int getTabBarHeight() {
        return m29044a(getContext(), this.ah);
    }

    public int getBannerHeight() {
        return getResources().getDimensionPixelSize(e.play_header_list_banner_height);
    }

    private final void m29070j() {
        switch (this.ah) {
            case 0:
                this.f31834J.setVisibility(0);
                this.f31836L.setVisibility(4);
                this.f31835K.setVisibility(0);
                return;
            case 1:
                this.f31834J.setVisibility(0);
                this.f31836L.setVisibility(0);
                this.f31835K.setVisibility(4);
                return;
            case 2:
                this.f31834J.setVisibility(4);
                this.f31836L.setVisibility(0);
                this.f31835K.setVisibility(0);
                return;
            default:
                throw new IllegalStateException("Unexpected tab mode: " + this.ah);
        }
    }

    private final void m29071k() {
        if (this.ai) {
            this.f31853z.setBackgroundDrawable(this.an);
            this.f31853z.setVisibility(0);
            return;
        }
        this.f31853z.setVisibility(8);
    }

    private final void m29072l() {
        if (this.ag && this.f31845U == null) {
            ViewPager viewPager = (ViewPager) this.f31826B.findViewById(this.ac);
            if (viewPager != null) {
                setViewPager(viewPager);
            }
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.f31845U = viewPager;
        this.f31835K.setViewPager(viewPager);
    }

    public View m29093c(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getId() == this.ae) {
                return childAt;
            }
        }
        return null;
    }

    public int m29095d(ViewGroup viewGroup) {
        if (viewGroup instanceof ListView) {
            ListView listView = (ListView) viewGroup;
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int childCount = listView.getChildCount();
            if (firstVisiblePosition != 0 || childCount <= 0) {
                return -1;
            }
            return -listView.getChildAt(0).getTop();
        } else if (!(viewGroup instanceof RecyclerView) && !(viewGroup instanceof C6360z)) {
            return -1;
        } else {
            View c = m29093c(viewGroup);
            if (c != null) {
                return -c.getTop();
            }
            return -1;
        }
    }

    public int m29080a(ViewGroup viewGroup) {
        View c = m29093c(viewGroup);
        if (c != null) {
            return c.getBottom();
        }
        return -1;
    }

    public void m29094c() {
        float nonScrollingFloatingHeaderHeight;
        Object obj;
        float f;
        int bannerHeight = getBannerHeight();
        int statusBarHeight = getStatusBarHeight();
        float f2 = this.aG * ((float) (bannerHeight + statusBarHeight));
        this.f31838N.c(((float) (f31822s ? 2 : 0)) + (f2 - ((float) bannerHeight)));
        float max = Math.max(0.0f, f2 - ((float) statusBarHeight));
        this.f31827C.c(max);
        float h = m29068h();
        float scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
        if (this.aO) {
            nonScrollingFloatingHeaderHeight = ((((float) (-this.aj)) + getNonScrollingFloatingHeaderHeight()) + (this.aI * scrollingFloatingHeaderHeight)) + ((float) this.ao);
        } else {
            nonScrollingFloatingHeaderHeight = h - ((float) this.aj);
        }
        float f3 = max + nonScrollingFloatingHeaderHeight;
        this.f31828D.c(1.0f + f3);
        this.f31830F.c(f3);
        if (this.av) {
            PlayHeaderStatusBarUnderlay playHeaderStatusBarUnderlay = this.f31839O;
            boolean z = this.aO;
            obj = h - ((float) this.ao) < scrollingFloatingHeaderHeight ? 1 : null;
            if (f31823t) {
                boolean z2 = playHeaderStatusBarUnderlay.f31891i;
                boolean z3 = z || obj != null;
                playHeaderStatusBarUnderlay.f31891i = z3;
                int round = Math.round(f2);
                if (playHeaderStatusBarUnderlay.f31891i && playHeaderStatusBarUnderlay.f31887e > round) {
                    round = playHeaderStatusBarUnderlay.f31887e;
                }
                if (f2 >= 1.0f || z) {
                    playHeaderStatusBarUnderlay.m29113a(round);
                    playHeaderStatusBarUnderlay.m29115a(1, false);
                } else {
                    statusBarHeight = playHeaderStatusBarUnderlay.f31891i ? 1 : 2;
                    if (playHeaderStatusBarUnderlay.f31890h != statusBarHeight) {
                        if (!playHeaderStatusBarUnderlay.f31891i && z2) {
                            round = playHeaderStatusBarUnderlay.f31887e;
                        }
                        playHeaderStatusBarUnderlay.m29113a(round);
                        if (round == 0) {
                            playHeaderStatusBarUnderlay.m29115a(2, false);
                        } else {
                            playHeaderStatusBarUnderlay.m29115a(statusBarHeight, true);
                        }
                    }
                }
            }
        }
        if (this.ar != 0 && this.ar != 1 && this.ar != 4) {
            f = max;
        } else if (this.aO) {
            f = max - ((1.0f - this.aI) * scrollingFloatingHeaderHeight);
        } else {
            f = Math.min(max, ((((h - ((float) this.ao)) + max) - m29069i()) - ((float) getActionBarHeight())) - ((float) getSubNavHeight()));
        }
        this.f31844T.c(((float) (f31822s ? 3 : 0)) + f);
        if (f31822s) {
            float measuredHeight = ((((float) this.aj) - ((float) this.f31831G.getMeasuredHeight())) - ((float) this.ao)) * 0.5f;
            switch (this.ap) {
                case 0:
                case 1:
                    boolean z4 = f3 + measuredHeight >= f + ((float) getActionBarHeight());
                    if (this.aN != z4) {
                        this.aN = z4;
                        m29049a(this.aN ? 1.0f : 0.0f, true);
                        break;
                    }
                    break;
                case 2:
                    f = ((float) this.aj) - getFullFloatingHeaderHeight();
                    f = Math.max(0.0f, (nonScrollingFloatingHeaderHeight + f) / Math.max(f, 1.0f));
                    this.aN = f > 0.0f;
                    m29049a(f, false);
                    break;
            }
        }
        if (this.ai) {
            if (this.f31846V != null) {
                statusBarHeight = m29080a(this.f31846V);
                if (statusBarHeight != -1) {
                    nonScrollingFloatingHeaderHeight = max + ((float) Math.min(statusBarHeight, m29079s()));
                    obj = 1;
                    if (obj == null && !this.aO) {
                        nonScrollingFloatingHeaderHeight += (float) m29079s();
                    }
                    this.f31825A.c(nonScrollingFloatingHeaderHeight);
                }
            }
            obj = null;
            nonScrollingFloatingHeaderHeight = max;
            nonScrollingFloatingHeaderHeight += (float) m29079s();
            this.f31825A.c(nonScrollingFloatingHeaderHeight);
        }
        if (this.aJ == -1) {
            this.f31851x.setVisibility(4);
        } else {
            Object obj2 = null;
            if (this.f31851x.getVisibility() == 4) {
                this.f31851x.setVisibility(0);
                obj2 = 1;
            }
            f = Math.max(((float) (-this.f31851x.getMeasuredHeight())) / this.ak, (((float) (-this.aJ)) * this.ak) + max);
            this.f31852y.c(f);
            f = (f + ((float) this.f31851x.getMeasuredHeight())) - max;
            if (obj2 != null && f > this.bf) {
                this.f31852y.a(0.0f);
                this.f31852y.b(1.0f);
            }
        }
        m29077q();
        if (this.aB != null) {
            this.aB.m29149a();
        }
    }

    final void m29084a(int i, int i2, int i3) {
        if (this.aC != null) {
            m29058b(i3 == 0);
        }
        if (!this.aM || i != 0) {
            boolean z;
            PlayHeaderListLayout playHeaderListLayout;
            float scrollingFloatingHeaderHeight;
            float h;
            float nonScrollingFloatingHeaderHeight;
            this.aJ = i3;
            switch (i) {
                case 0:
                    z = true;
                    playHeaderListLayout = this;
                    break;
                case 1:
                    if (((float) i2) > 0.0f) {
                        z = false;
                        playHeaderListLayout = this;
                        break;
                    }
                    z = true;
                    playHeaderListLayout = this;
                    break;
                default:
                    if (!m29073m() && this.aO) {
                        scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
                        if (scrollingFloatingHeaderHeight != 0.0f && this.aE != 3) {
                            this.aI = 1.0f;
                        } else if (this.aE == 0) {
                            this.aI -= ((float) i2) / scrollingFloatingHeaderHeight;
                        } else if (this.aE == 2) {
                            h = m29068h() - ((float) this.ao);
                            nonScrollingFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
                            if (h > nonScrollingFloatingHeaderHeight) {
                                m29090a(false, true);
                            } else {
                                this.aW = false;
                                m29074n();
                                if (i2 < 0 || this.aI > 0.0f) {
                                    this.aI -= ((float) i2) / scrollingFloatingHeaderHeight;
                                } else {
                                    this.aI = (h - nonScrollingFloatingHeaderHeight) / scrollingFloatingHeaderHeight;
                                }
                            }
                        }
                        this.aI = Math.min(1.0f, Math.max(0.0f, this.aI));
                    }
                    m29094c();
                    if (i2 == 0) {
                        this.aZ = 1;
                    }
            }
            playHeaderListLayout.aR = z;
            scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
            if (scrollingFloatingHeaderHeight != 0.0f) {
            }
            if (this.aE == 0) {
                this.aI -= ((float) i2) / scrollingFloatingHeaderHeight;
            } else if (this.aE == 2) {
                h = m29068h() - ((float) this.ao);
                nonScrollingFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
                if (h > nonScrollingFloatingHeaderHeight) {
                    this.aW = false;
                    m29074n();
                    if (i2 < 0) {
                    }
                    this.aI -= ((float) i2) / scrollingFloatingHeaderHeight;
                } else {
                    m29090a(false, true);
                }
            }
            this.aI = Math.min(1.0f, Math.max(0.0f, this.aI));
            m29094c();
            if (i2 == 0) {
                this.aZ = 1;
            }
        }
    }

    public void setForceShowToolbar(boolean z) {
        this.aY = z;
    }

    private final boolean m29073m() {
        boolean z;
        if (this.aJ == -1 || this.aE == 3) {
            z = true;
        } else {
            float f = (float) (this.aj - this.ao);
            if (this.aY) {
                z = ((float) this.aJ) >= f - ((float) getToolbar().getHeight());
            } else {
                float fullFloatingHeaderHeight;
                if (this.aO) {
                    fullFloatingHeaderHeight = (f - getFullFloatingHeaderHeight()) + 1.0f;
                } else {
                    if (this.aE == 1) {
                        fullFloatingHeaderHeight = getFullFloatingHeaderHeight();
                    } else {
                        fullFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
                    }
                    fullFloatingHeaderHeight = f - fullFloatingHeaderHeight;
                }
                z = this.aJ >= Math.round(fullFloatingHeaderHeight);
            }
        }
        if (z == this.aO) {
            return false;
        }
        m29059b(z, true);
        return true;
    }

    public boolean m29092b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int count;
            if (viewGroup instanceof ListView) {
                ListAdapter adapter = ((ListView) viewGroup).getAdapter();
                count = adapter == null ? 0 : adapter.getCount();
            } else if (viewGroup instanceof RecyclerView) {
                em adapter2 = ((RecyclerView) viewGroup).getAdapter();
                count = adapter2 == null ? 0 : adapter2.a();
            } else if (viewGroup instanceof C6360z) {
                Adapter d = ((C6360z) viewGroup).m29171d();
                count = d == null ? 0 : d.getCount();
            } else {
                String valueOf = String.valueOf(viewGroup);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unexpected listview type: ").append(valueOf).toString());
            }
            if (count > 1) {
                if (viewGroup.getChildCount() > 1) {
                    return true;
                }
                if (viewGroup.getChildCount() == 1) {
                    return viewGroup.getChildAt(0).getId() != this.ae;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private final boolean m29061c(boolean z) {
        boolean z2 = false;
        if (!m29092b(this.f31846V)) {
            return false;
        }
        this.aJ = m29095d(this.f31846V);
        if (this.aC != null) {
            if (this.aJ == 0) {
                z2 = true;
            }
            m29058b(z2);
        }
        m29073m();
        if (z) {
            m29094c();
        }
        return true;
    }

    final void m29082a(int i) {
        boolean z = true;
        this.f31849u.removeCallbacks(this.bi);
        this.f31849u.removeCallbacks(this.bj);
        if (i == 0) {
            float h = m29068h() - ((float) this.ao);
            boolean z2 = h > getMaxContentPositionToNotSnapDownWhenIdle();
            if (this.aR) {
                z2 = z2 || getVisibleHeaderHeight() >= getMinVisibleHeaderHeightToIdleSnapDownAfterScrollDown();
            }
            if (this.aE != 0) {
                if (this.aE != 2) {
                    z = false;
                } else if (!z2 || h <= getNonScrollingFloatingHeaderHeight()) {
                    z = false;
                }
            }
            if (z) {
                Runnable runnable;
                this.aT = z2;
                Handler handler = this.f31849u;
                if (z2) {
                    runnable = this.bj;
                } else {
                    runnable = this.bi;
                }
                handler.postDelayed(runnable, 50);
            }
            m29065e(false);
        }
    }

    public float getMaxContentPositionToNotSnapDownWhenIdle() {
        return 0.0f;
    }

    public float getMinVisibleHeaderHeightToIdleSnapDownAfterScrollDown() {
        return ((float) getActionBarHeight()) * 0.5f;
    }

    public boolean getHeroElementVisible() {
        return this.aN;
    }

    public boolean getLastSnapControlsWasDown() {
        return this.aT;
    }

    private final void m29049a(float f, boolean z) {
        a aVar;
        Animation scaleAnimation;
        if (z) {
            switch (this.ap) {
                case 0:
                    aVar = this.f31832H;
                    if (aVar.a == null) {
                        aVar.d = f;
                        return;
                    } else if (VERSION.SDK_INT >= 12) {
                        aVar.a.animate().scaleX(f).scaleY(f).setDuration(100);
                        return;
                    } else {
                        scaleAnimation = new ScaleAnimation(aVar.d, f, aVar.d, f);
                        scaleAnimation.setDuration(100);
                        scaleAnimation.setFillAfter(true);
                        if (VERSION.SDK_INT < 12) {
                            scaleAnimation.setAnimationListener(new c(aVar, f));
                        }
                        aVar.a.startAnimation(scaleAnimation);
                        return;
                    }
                case 1:
                case 2:
                    this.f31832H.b(f);
                    return;
                default:
                    return;
            }
        }
        switch (this.ap) {
            case 0:
                aVar = this.f31832H;
                if (aVar.a == null) {
                    aVar.d = f;
                    return;
                } else if (VERSION.SDK_INT >= 11) {
                    aVar.a.setScaleX(f);
                    aVar.a.setScaleY(f);
                    return;
                } else if (aVar.d != f) {
                    aVar.d = f;
                    scaleAnimation = new ScaleAnimation(aVar.d, aVar.d, aVar.d, aVar.d);
                    scaleAnimation.setDuration(0);
                    scaleAnimation.setFillAfter(true);
                    aVar.a.startAnimation(scaleAnimation);
                    return;
                } else {
                    return;
                }
            case 1:
            case 2:
                this.f31832H.a(f);
                return;
            default:
                return;
        }
    }

    @TargetApi(11)
    final void m29090a(boolean z, boolean z2) {
        float f = 1.0f;
        if (this.ar != 3) {
            this.f31849u.removeCallbacks(this.bi);
            this.f31849u.removeCallbacks(this.bj);
            float visibleHeaderHeight = getVisibleHeaderHeight();
            float nonScrollingFloatingHeaderHeight = getNonScrollingFloatingHeaderHeight();
            float fullFloatingHeaderHeight = getFullFloatingHeaderHeight();
            if (z) {
                nonScrollingFloatingHeaderHeight -= 1.0f;
            } else if (m29068h() - ((float) this.ao) <= nonScrollingFloatingHeaderHeight) {
                if (this.aE == 2) {
                    if (!this.aW) {
                        this.aW = true;
                    } else {
                        return;
                    }
                }
                fullFloatingHeaderHeight += 1.0f;
            } else {
                return;
            }
            if (visibleHeaderHeight > nonScrollingFloatingHeaderHeight && visibleHeaderHeight < r1) {
                if (!z) {
                    f = 0.0f;
                }
                this.aT = z;
                if (!this.aO) {
                    m29059b(true, z2);
                }
                if (z2) {
                    m29074n();
                    if (VERSION.SDK_INT >= 11) {
                        this.aU = m29046a("floatingFraction", getFloatingFraction(), f).setDuration(200);
                        this.aU.start();
                        return;
                    }
                    this.aV = new C6346l(this, getFloatingFraction(), f);
                    this.aV.setDuration(200);
                    startAnimation(this.aV);
                    return;
                }
                m29048a(f);
            }
        }
    }

    @TargetApi(11)
    private final void m29074n() {
        if (this.aU != null) {
            this.aU.cancel();
            this.aU = null;
        }
        if (this.aV != null) {
            this.aV.cancel();
            if (this.aV == getAnimation()) {
                clearAnimation();
            }
            this.aV = null;
        }
    }

    protected void setFloatingFraction(float f) {
        m29048a(f);
    }

    private final void m29048a(float f) {
        if (this.aO && this.aI != f) {
            this.aI = f;
            m29094c();
            m29065e(false);
        }
    }

    protected final float getFloatingFraction() {
        if (this.aO) {
            return this.aI;
        }
        return 0.0f;
    }

    private static Drawable m29075o() {
        return new ColorDrawable(0);
    }

    private final void m29059b(boolean z, boolean z2) {
        float f = 1.0f;
        if (this.aO != z) {
            this.aW = false;
            if (z) {
                float visibleHeaderHeight = getVisibleHeaderHeight() - getNonScrollingFloatingHeaderHeight();
                float scrollingFloatingHeaderHeight = getScrollingFloatingHeaderHeight();
                if (scrollingFloatingHeaderHeight == 0.0f || this.aE == 1) {
                    this.aI = 1.0f;
                } else {
                    this.aI = Math.max(0.0f, Math.min(1.0f, visibleHeaderHeight / scrollingFloatingHeaderHeight));
                }
            } else {
                this.aI = 0.0f;
            }
            this.aO = z;
            if (!this.as) {
                if (this.aO) {
                    m29056b(this.ay, z2);
                } else {
                    m29056b(m29075o(), z2);
                }
            }
            if (this.aq) {
                if (!this.aO) {
                    f = 0.0f;
                }
                if (!z2) {
                    setActionBarTitleAlpha(f);
                } else if (f != getActionBarTitleAlpha()) {
                    if (VERSION.SDK_INT >= 11) {
                        m29046a("actionBarTitleAlpha", getActionBarTitleAlpha(), f).setDuration(200).start();
                    } else {
                        Animation c6343h = new C6343h(this, getActionBarTitleAlpha(), f);
                        c6343h.setDuration(200);
                        startAnimation(c6343h);
                    }
                }
            }
            m29077q();
            m29062d(z2);
            m29076p();
        }
    }

    private final void m29062d(boolean z) {
        if (this.ah == 0) {
            boolean z2;
            switch (this.at) {
                case 1:
                    z2 = true;
                    break;
                case 2:
                    z2 = false;
                    break;
                default:
                    z2 = this.aO;
                    break;
            }
            PlayHeaderListTabStrip playHeaderListTabStrip = this.f31835K;
            playHeaderListTabStrip.f31869m.setUseFloatingTabPadding(z2);
            playHeaderListTabStrip.f31877u = z;
            playHeaderListTabStrip.m29112f();
        }
    }

    private final void m29076p() {
        boolean z;
        Object obj = 1;
        switch (this.al) {
            case 1:
                if (!this.aO && !this.as) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            case 2:
                if (!this.aO && !this.as) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
                break;
            case 3:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (this.am != 0) {
            obj = null;
        }
        PlayHeaderListTabStrip playHeaderListTabStrip = this.f31835K;
        if (playHeaderListTabStrip.f31880x != z) {
            playHeaderListTabStrip.f31880x = z;
            int childCount = playHeaderListTabStrip.f31869m.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView = (TextView) playHeaderListTabStrip.f31869m.getChildAt(i);
                playHeaderListTabStrip.m29106a(textView, playHeaderListTabStrip.f31880x);
                if (obj != null) {
                    int i2;
                    if (playHeaderListTabStrip.f31880x) {
                        i2 = playHeaderListTabStrip.f31881y;
                    } else {
                        i2 = 0;
                    }
                    textView.setBackgroundResource(i2);
                }
            }
        }
    }

    private final void m29056b(Drawable drawable, boolean z) {
        if (z && f31822s) {
            Drawable background = this.f31848g.getBackground();
            if (background == null) {
                background = m29075o();
            }
            if (drawable == null) {
                drawable = m29075o();
            }
            if (background != drawable) {
                Drawable c6340f = new C6340f(new Drawable[]{background, drawable});
                c6340f.setCrossFadeEnabled(true);
                c6340f.startTransition(300);
                this.f31848g.setBackgroundDrawable(c6340f);
                return;
            }
            return;
        }
        this.f31848g.setBackgroundDrawable(drawable);
    }

    private final void m29077q() {
        boolean z;
        int i;
        int i2 = 0;
        switch (this.au) {
            case 1:
                if (this.aO && getVisibleHeaderHeight() > 0.0f) {
                    z = true;
                    break;
                } else {
                    z = false;
                    break;
                }
            case 2:
                z = false;
                break;
            case 3:
                if (getVisibleHeaderHeight() <= 0.0f) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            default:
                if ((this.aO || this.as) && getVisibleHeaderHeight() > 0.0f) {
                    i = this.f31851x.getVisibility() != 0 ? 0 : (getMeasuredHeight() == 0 || (!(this.aO || this.as) || Math.max(0.0f, Math.max(0.0f, ((float) this.f31851x.getMeasuredHeight()) + this.f31852y.a()) - getVisibleHeaderHeight()) > 0.0f)) ? 1 : 0;
                    if (i == 0) {
                        z = true;
                        break;
                    }
                }
                z = false;
                break;
        }
        if (this.aP != z) {
            this.aP = z;
            if (this.aX) {
                int i3;
                float floatingHeaderElevation;
                float floatingFraction = getFloatingFraction();
                if (!z || ((double) floatingFraction) <= 0.25d) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                if (z) {
                    floatingHeaderElevation = getFloatingHeaderElevation();
                } else {
                    floatingHeaderElevation = 0.0f;
                }
                if (z) {
                    i = 150;
                } else {
                    i = 0;
                }
                if (i3 != 0) {
                    i2 = 100;
                }
                this.f31828D.a(floatingHeaderElevation, i, i2);
                this.f31844T.a(floatingHeaderElevation, i, i2);
                this.f31837M.animate().z(floatingHeaderElevation).setStartDelay((long) i2).setDuration((long) i);
                if (this.av) {
                    this.f31839O.animate().z(floatingHeaderElevation).setStartDelay((long) i2).setDuration((long) i);
                    return;
                }
                return;
            }
            View view = this.f31829E;
            if (!z) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    public ViewGroup getToolbarContainer() {
        if (this.f31841Q != null) {
            return this.f31841Q;
        }
        if (this.af) {
            ViewGroup viewGroup = (ViewGroup) findViewById(g.toolbar_container);
            viewGroup.setVisibility(0);
            return viewGroup;
        }
        viewGroup = (ViewGroup) this.aw.mo5393a().getWindow().findViewById(g.action_bar_container);
        if (f31822s) {
            return viewGroup;
        }
        findViewById(g.toolbar_container).setMinimumHeight(getActionBarHeight());
        return viewGroup;
    }

    public Toolbar getToolbar() {
        return this.f31840P;
    }

    private final void m29065e(boolean z) {
        if (this.f31845U != null) {
            int d;
            if (z) {
                d = m29063d(1);
                if (d == 0) {
                    this.aM = false;
                }
            } else {
                d = 0;
            }
            if (((m29063d(0) | d) | m29063d(2)) != 0) {
                this.aZ = d != 0 ? 2 : 1;
            } else {
                this.aZ = 0;
            }
        }
    }

    private final boolean m29063d(int i) {
        if (this.f31845U == null || this.f31845U.getAdapter() == null) {
            return false;
        }
        int b = m29053b(i);
        if (b < 0 || b >= this.f31845U.getAdapter().a()) {
            return false;
        }
        boolean z;
        ViewGroup c = m29060c(i);
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!m29092b(c)) {
            return true;
        }
        int a = m29080a(c);
        if (a != -1) {
            float fullFloatingHeaderHeight;
            boolean z2 = this.aO && (this.ar == 0 || this.ar == 2);
            if (z2) {
                fullFloatingHeaderHeight = getFullFloatingHeaderHeight();
            } else {
                fullFloatingHeaderHeight = getVisibleHeaderHeight();
            }
            int i2 = a - (((int) fullFloatingHeaderHeight) + this.ao);
            if (this.aO && i2 < 0) {
                return false;
            }
            if (Math.abs(i2) > 0 && ai.a(c, i2)) {
                this.aM = true;
                if (c instanceof ListView) {
                    ListView listView = (ListView) c;
                    if (VERSION.SDK_INT >= 19) {
                        listView.scrollListBy(i2);
                    } else {
                        listView.smoothScrollBy(i2, 0);
                    }
                } else if (c instanceof RecyclerView) {
                    ((RecyclerView) c).scrollBy(0, i2);
                } else if (c instanceof C6360z) {
                    ((C6360z) c).m29169b();
                }
                this.aM = false;
                if (!z) {
                    return false;
                }
                this.aK = true;
                return false;
            } else if (!z) {
                return false;
            } else {
                m29061c(true);
                return false;
            }
        } else if (this.aO) {
            return false;
        } else {
            this.aM = true;
            if (c instanceof ListView) {
                ((ListView) c).setSelectionFromTop(0, 0);
            } else if (c instanceof RecyclerView) {
                ((RecyclerView) c).c(0);
            } else if (c instanceof C6360z) {
                ((C6360z) c).m29170c();
            }
            this.aM = false;
            return true;
        }
    }

    private final void m29067f(boolean z) {
        if (z != this.aH) {
            int i;
            int i2;
            this.aH = z;
            int bannerHeight;
            if (f31822s) {
                m29046a("bannerFraction", getBannerFraction(), z ? 1.0f : 0.0f).setDuration(200).start();
                if (z) {
                    bannerHeight = getBannerHeight();
                } else {
                    bannerHeight = 0;
                }
                i = bannerHeight;
                i2 = 0;
            } else {
                this.f31837M.setVisibility(z ? 0 : 8);
                if (z) {
                    bannerHeight = getBannerHeight();
                } else {
                    bannerHeight = 0;
                }
                i = 0;
                i2 = bannerHeight;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31826B.getLayoutParams();
            layoutParams.setMargins(0, i2 + getStatusBarHeight(), 0, i);
            this.f31826B.setLayoutParams(layoutParams);
        }
    }

    protected void setBannerFraction(float f) {
        if (f != this.aG) {
            this.aG = f;
            m29094c();
        }
    }

    protected final float getBannerFraction() {
        return this.aG;
    }

    private final void m29064e(int i) {
        this.f31843S = i;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31848g.getLayoutParams();
        layoutParams.height = this.aF + i;
        this.f31848g.setLayoutParams(layoutParams);
    }

    private final void m29078r() {
        if (!this.aX) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31829E.getLayoutParams();
            layoutParams.setMargins(0, m29079s(), 0, 0);
            this.f31829E.setLayoutParams(layoutParams);
        }
    }

    private final int m29079s() {
        return (this.aj - this.ao) + this.aF;
    }

    @TargetApi(11)
    private final ObjectAnimator m29046a(String str, float f, float f2) {
        ObjectAnimator objectAnimator = (ObjectAnimator) this.bh.get(str);
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        objectAnimator = ObjectAnimator.ofFloat(this, str, new float[]{f, f2});
        this.bh.put(str, objectAnimator);
        return objectAnimator;
    }

    static {
        boolean z;
        boolean z2 = true;
        if (VERSION.SDK_INT > 10) {
            z = true;
        } else {
            z = false;
        }
        f31822s = z;
        if (VERSION.SDK_INT < 21) {
            z2 = false;
        }
        f31823t = z2;
    }
}
