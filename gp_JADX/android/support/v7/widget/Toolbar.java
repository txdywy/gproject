package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0357n;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.support.v7.app.C0410b;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ag;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public int f3028A;
    public boolean f3029B;
    public boolean f3030C;
    public final ArrayList f3031D;
    public final ArrayList f3032E;
    public final int[] f3033F;
    public hi f3034G;
    public final C0500w f3035H;
    public hk f3036I;
    public C0502k f3037J;
    public hg f3038K;
    public ag f3039L;
    public C0408q f3040M;
    public boolean f3041N;
    public final Runnable f3042O;
    public ActionMenuView f3043a;
    public TextView f3044b;
    public TextView f3045c;
    public ImageButton f3046d;
    public ImageView f3047e;
    public Drawable f3048f;
    public CharSequence f3049g;
    public ImageButton f3050h;
    public View f3051i;
    public Context f3052j;
    public int f3053k;
    public int f3054l;
    public int f3055m;
    public int f3056n;
    public int f3057o;
    public int f3058p;
    public int f3059q;
    public int f3060r;
    public int f3061s;
    public fy f3062t;
    public int f3063u;
    public int f3064v;
    public int f3065w;
    public CharSequence f3066x;
    public CharSequence f3067y;
    public int f3068z;

    public class SavedState extends AbsSavedState {
        public static final Creator CREATOR = new hj();
        public int f3026a;
        public boolean f3027b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3026a = parcel.readInt();
            this.f3027b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3026a);
            parcel.writeInt(this.f3027b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3065w = 8388627;
        this.f3031D = new ArrayList();
        this.f3032E = new ArrayList();
        this.f3033F = new int[2];
        this.f3035H = new hd(this);
        this.f3042O = new he(this);
        hc a = hc.m3769a(getContext(), attributeSet, C0403j.Toolbar, i, 0);
        this.f3054l = a.m3783g(C0403j.Toolbar_titleTextAppearance, 0);
        this.f3055m = a.m3783g(C0403j.Toolbar_subtitleTextAppearance, 0);
        this.f3065w = a.m3775c(C0403j.Toolbar_android_gravity, this.f3065w);
        this.f3056n = a.m3775c(C0403j.Toolbar_buttonGravity, 48);
        int d = a.m3777d(C0403j.Toolbar_titleMargin, 0);
        if (a.m3782f(C0403j.Toolbar_titleMargins)) {
            d = a.m3777d(C0403j.Toolbar_titleMargins, d);
        }
        this.f3061s = d;
        this.f3060r = d;
        this.f3059q = d;
        this.f3058p = d;
        d = a.m3777d(C0403j.Toolbar_titleMarginStart, -1);
        if (d >= 0) {
            this.f3058p = d;
        }
        d = a.m3777d(C0403j.Toolbar_titleMarginEnd, -1);
        if (d >= 0) {
            this.f3059q = d;
        }
        d = a.m3777d(C0403j.Toolbar_titleMarginTop, -1);
        if (d >= 0) {
            this.f3060r = d;
        }
        d = a.m3777d(C0403j.Toolbar_titleMarginBottom, -1);
        if (d >= 0) {
            this.f3061s = d;
        }
        this.f3057o = a.m3779e(C0403j.Toolbar_maxButtonHeight, -1);
        d = a.m3777d(C0403j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d2 = a.m3777d(C0403j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = a.m3779e(C0403j.Toolbar_contentInsetLeft, 0);
        int e2 = a.m3779e(C0403j.Toolbar_contentInsetRight, 0);
        m3155g();
        fy fyVar = this.f3062t;
        fyVar.f3497h = false;
        if (e != Integer.MIN_VALUE) {
            fyVar.f3494e = e;
            fyVar.f3490a = e;
        }
        if (e2 != Integer.MIN_VALUE) {
            fyVar.f3495f = e2;
            fyVar.f3491b = e2;
        }
        if (!(d == Integer.MIN_VALUE && d2 == Integer.MIN_VALUE)) {
            this.f3062t.m3732a(d, d2);
        }
        this.f3063u = a.m3777d(C0403j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f3064v = a.m3777d(C0403j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f3048f = a.m3771a(C0403j.Toolbar_collapseIcon);
        this.f3049g = a.m3776c(C0403j.Toolbar_collapseContentDescription);
        CharSequence c = a.m3776c(C0403j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        c = a.m3776c(C0403j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c)) {
            setSubtitle(c);
        }
        this.f3052j = getContext();
        setPopupTheme(a.m3783g(C0403j.Toolbar_popupTheme, 0));
        Drawable a2 = a.m3771a(C0403j.Toolbar_navigationIcon);
        if (a2 != null) {
            setNavigationIcon(a2);
        }
        c = a.m3776c(C0403j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c)) {
            setNavigationContentDescription(c);
        }
        a2 = a.m3771a(C0403j.Toolbar_logo);
        if (a2 != null) {
            setLogo(a2);
        }
        c = a.m3776c(C0403j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c)) {
            setLogoDescription(c);
        }
        if (a.m3782f(C0403j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.m3773b(C0403j.Toolbar_titleTextColor, -1));
        }
        if (a.m3782f(C0403j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m3773b(C0403j.Toolbar_subtitleTextColor, -1));
        }
        a.f3558b.recycle();
    }

    public void setPopupTheme(int i) {
        if (this.f3053k != i) {
            this.f3053k = i;
            if (i == 0) {
                this.f3052j = getContext();
            } else {
                this.f3052j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f3053k;
    }

    public int getTitleMarginStart() {
        return this.f3058p;
    }

    public void setTitleMarginStart(int i) {
        this.f3058p = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f3060r;
    }

    public void setTitleMarginTop(int i) {
        this.f3060r = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f3059q;
    }

    public void setTitleMarginEnd(int i) {
        this.f3059q = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f3061s;
    }

    public void setTitleMarginBottom(int i) {
        this.f3061s = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z = true;
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m3155g();
        fy fyVar = this.f3062t;
        if (i != 1) {
            z = false;
        }
        if (z != fyVar.f3496g) {
            fyVar.f3496g = z;
            if (!fyVar.f3497h) {
                fyVar.f3490a = fyVar.f3494e;
                fyVar.f3491b = fyVar.f3495f;
            } else if (z) {
                fyVar.f3490a = fyVar.f3493d != Integer.MIN_VALUE ? fyVar.f3493d : fyVar.f3494e;
                fyVar.f3491b = fyVar.f3492c != Integer.MIN_VALUE ? fyVar.f3492c : fyVar.f3495f;
            } else {
                fyVar.f3490a = fyVar.f3492c != Integer.MIN_VALUE ? fyVar.f3492c : fyVar.f3494e;
                fyVar.f3491b = fyVar.f3493d != Integer.MIN_VALUE ? fyVar.f3493d : fyVar.f3495f;
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0436b.m2650b(getContext(), i));
    }

    public final boolean m3150b() {
        if (this.f3043a != null) {
            boolean z;
            ActionMenuView actionMenuView = this.f3043a;
            if (actionMenuView.f2917e == null || !actionMenuView.f2917e.m3888g()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3151c() {
        if (this.f3043a != null) {
            boolean z;
            ActionMenuView actionMenuView = this.f3043a;
            if (actionMenuView.f2917e == null || !actionMenuView.f2917e.m3884c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m3139a();
            if (!m3147d(this.f3047e)) {
                m3141a(this.f3047e, true);
            }
        } else if (this.f3047e != null && m3147d(this.f3047e)) {
            removeView(this.f3047e);
            this.f3032E.remove(this.f3047e);
        }
        if (this.f3047e != null) {
            this.f3047e.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        return this.f3047e != null ? this.f3047e.getDrawable() : null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3139a();
        }
        if (this.f3047e != null) {
            this.f3047e.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        return this.f3047e != null ? this.f3047e.getContentDescription() : null;
    }

    private final void m3139a() {
        if (this.f3047e == null) {
            this.f3047e = new ap(getContext());
        }
    }

    public final boolean m3152d() {
        return (this.f3038K == null || this.f3038K.f3564b == null) ? false : true;
    }

    public final void m3153e() {
        C0485t c0485t = this.f3038K == null ? null : this.f3038K.f3564b;
        if (c0485t != null) {
            c0485t.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f3066x;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3044b == null) {
                Context context = getContext();
                this.f3044b = new bg(context);
                this.f3044b.setSingleLine();
                this.f3044b.setEllipsize(TruncateAt.END);
                if (this.f3054l != 0) {
                    this.f3044b.setTextAppearance(context, this.f3054l);
                }
                if (this.f3068z != 0) {
                    this.f3044b.setTextColor(this.f3068z);
                }
            }
            if (!m3147d(this.f3044b)) {
                m3141a(this.f3044b, true);
            }
        } else if (this.f3044b != null && m3147d(this.f3044b)) {
            removeView(this.f3044b);
            this.f3032E.remove(this.f3044b);
        }
        if (this.f3044b != null) {
            this.f3044b.setText(charSequence);
        }
        this.f3066x = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f3067y;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f3045c == null) {
                Context context = getContext();
                this.f3045c = new bg(context);
                this.f3045c.setSingleLine();
                this.f3045c.setEllipsize(TruncateAt.END);
                if (this.f3055m != 0) {
                    this.f3045c.setTextAppearance(context, this.f3055m);
                }
                if (this.f3028A != 0) {
                    this.f3045c.setTextColor(this.f3028A);
                }
            }
            if (!m3147d(this.f3045c)) {
                m3141a(this.f3045c, true);
            }
        } else if (this.f3045c != null && m3147d(this.f3045c)) {
            removeView(this.f3045c);
            this.f3032E.remove(this.f3045c);
        }
        if (this.f3045c != null) {
            this.f3045c.setText(charSequence);
        }
        this.f3067y = charSequence;
    }

    public void setTitleTextColor(int i) {
        this.f3068z = i;
        if (this.f3044b != null) {
            this.f3044b.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.f3028A = i;
        if (this.f3045c != null) {
            this.f3045c.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        return this.f3046d != null ? this.f3046d.getContentDescription() : null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3149i();
        }
        if (this.f3046d != null) {
            this.f3046d.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0436b.m2650b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3149i();
            if (!m3147d(this.f3046d)) {
                m3141a(this.f3046d, true);
            }
        } else if (this.f3046d != null && m3147d(this.f3046d)) {
            removeView(this.f3046d);
            this.f3032E.remove(this.f3046d);
        }
        if (this.f3046d != null) {
            this.f3046d.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        return this.f3046d != null ? this.f3046d.getDrawable() : null;
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m3149i();
        this.f3046d.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m3148h();
        return this.f3043a.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m3148h();
        this.f3043a.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m3148h();
        return this.f3043a.getOverflowIcon();
    }

    private final void m3148h() {
        m3154f();
        if (this.f3043a.f2913a == null) {
            C0471p c0471p = (C0471p) this.f3043a.getMenu();
            if (this.f3038K == null) {
                this.f3038K = new hg(this);
            }
            this.f3043a.setExpandedActionViewsExclusive(true);
            c0471p.m2822a(this.f3038K, this.f3052j);
        }
    }

    final void m3154f() {
        if (this.f3043a == null) {
            this.f3043a = new ActionMenuView(getContext());
            this.f3043a.setPopupTheme(this.f3053k);
            this.f3043a.setOnMenuItemClickListener(this.f3035H);
            this.f3043a.m2968a(this.f3039L, this.f3040M);
            LayoutParams hhVar = new hh();
            hhVar.a = 8388613 | (this.f3056n & 112);
            this.f3043a.setLayoutParams(hhVar);
            m3141a(this.f3043a, false);
        }
    }

    public void setOnMenuItemClickListener(hi hiVar) {
        this.f3034G = hiVar;
    }

    public int getContentInsetStart() {
        if (this.f3062t == null) {
            return 0;
        }
        fy fyVar = this.f3062t;
        return fyVar.f3496g ? fyVar.f3491b : fyVar.f3490a;
    }

    public int getContentInsetEnd() {
        if (this.f3062t == null) {
            return 0;
        }
        fy fyVar = this.f3062t;
        return fyVar.f3496g ? fyVar.f3490a : fyVar.f3491b;
    }

    public int getContentInsetLeft() {
        if (this.f3062t != null) {
            return this.f3062t.f3490a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        if (this.f3062t != null) {
            return this.f3062t.f3491b;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        if (this.f3063u != Integer.MIN_VALUE) {
            return this.f3063u;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3063u) {
            this.f3063u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        if (this.f3064v != Integer.MIN_VALUE) {
            return this.f3064v;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3064v) {
            this.f3064v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f3063u, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        int i;
        if (this.f3043a != null) {
            C0471p c0471p = this.f3043a.f2913a;
            i = (c0471p == null || !c0471p.hasVisibleItems()) ? 0 : 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return Math.max(getContentInsetEnd(), Math.max(this.f3064v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ai.f1848a.mo400k(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ai.f1848a.mo400k(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    private final void m3149i() {
        if (this.f3046d == null) {
            this.f3046d = new an(getContext(), null, C0394a.toolbarNavigationButtonStyle);
            LayoutParams hhVar = new hh();
            hhVar.a = 8388611 | (this.f3056n & 112);
            this.f3046d.setLayoutParams(hhVar);
        }
    }

    private final void m3141a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new hh();
        } else if (checkLayoutParams(layoutParams)) {
            hh hhVar = (hh) layoutParams;
        } else {
            layoutParams = m3138a(layoutParams);
        }
        layoutParams.f3566b = 1;
        if (!z || this.f3051i == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f3032E.add(view);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f3038K == null || this.f3038K.f3564b == null)) {
            savedState.f3026a = this.f3038K.f3564b.getItemId();
        }
        savedState.f3027b = m3150b();
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            Menu menu;
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.f542e);
            if (this.f3043a != null) {
                menu = this.f3043a.f2913a;
            } else {
                menu = null;
            }
            if (!(savedState.f3026a == 0 || this.f3038K == null || menu == null)) {
                MenuItem findItem = menu.findItem(savedState.f3026a);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (savedState.f3027b) {
                removeCallbacks(this.f3042O);
                post(this.f3042O);
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3042O);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3029B = false;
        }
        if (!this.f3029B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3029B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3029B = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3030C = false;
        }
        if (!this.f3030C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3030C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3030C = false;
        }
        return true;
    }

    private final void m3140a(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + 0, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private final int m3136a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int max;
        int combineMeasuredStates;
        int i5;
        Object obj;
        int[] iArr = this.f3033F;
        if (id.m3869a(this)) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 1;
            i4 = 0;
        }
        int i6 = 0;
        if (m3143a(this.f3046d)) {
            m3140a(this.f3046d, i, 0, i2, this.f3057o);
            i6 = this.f3046d.getMeasuredWidth() + m3144b(this.f3046d);
            max = Math.max(0, this.f3046d.getMeasuredHeight() + m3146c(this.f3046d));
            combineMeasuredStates = View.combineMeasuredStates(0, this.f3046d.getMeasuredState());
            i5 = max;
        } else {
            combineMeasuredStates = 0;
            i5 = 0;
        }
        if (m3143a(this.f3050h)) {
            m3140a(this.f3050h, i, 0, i2, this.f3057o);
            i6 = this.f3050h.getMeasuredWidth() + m3144b(this.f3050h);
            i5 = Math.max(i5, this.f3050h.getMeasuredHeight() + m3146c(this.f3050h));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f3050h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = Math.max(currentContentInsetStart, i6) + 0;
        iArr[i4] = Math.max(0, currentContentInsetStart - i6);
        i6 = 0;
        if (m3143a(this.f3043a)) {
            m3140a(this.f3043a, i, max2, i2, this.f3057o);
            i6 = this.f3043a.getMeasuredWidth() + m3144b(this.f3043a);
            i5 = Math.max(i5, this.f3043a.getMeasuredHeight() + m3146c(this.f3043a));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f3043a.getMeasuredState());
        }
        currentContentInsetStart = getCurrentContentInsetEnd();
        max2 += Math.max(currentContentInsetStart, i6);
        iArr[i3] = Math.max(0, currentContentInsetStart - i6);
        if (m3143a(this.f3051i)) {
            max2 += m3136a(this.f3051i, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f3051i.getMeasuredHeight() + m3146c(this.f3051i));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f3051i.getMeasuredState());
        }
        if (m3143a(this.f3047e)) {
            max2 += m3136a(this.f3047e, i, max2, i2, 0, iArr);
            i5 = Math.max(i5, this.f3047e.getMeasuredHeight() + m3146c(this.f3047e));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, this.f3047e.getMeasuredState());
        }
        i4 = getChildCount();
        i3 = 0;
        int i7 = combineMeasuredStates;
        int i8 = i5;
        while (i3 < i4) {
            View childAt = getChildAt(i3);
            if (((hh) childAt.getLayoutParams()).f3566b == 0 && m3143a(childAt)) {
                max2 += m3136a(childAt, i, max2, i2, 0, iArr);
                max = Math.max(i8, childAt.getMeasuredHeight() + m3146c(childAt));
                i6 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                currentContentInsetStart = max;
            } else {
                i6 = i7;
                currentContentInsetStart = i8;
            }
            i3++;
            i7 = i6;
            i8 = currentContentInsetStart;
        }
        currentContentInsetStart = 0;
        i6 = 0;
        int i9 = this.f3060r + this.f3061s;
        max = this.f3058p + this.f3059q;
        if (m3143a(this.f3044b)) {
            m3136a(this.f3044b, i, max2 + max, i2, i9, iArr);
            currentContentInsetStart = m3144b(this.f3044b) + this.f3044b.getMeasuredWidth();
            i6 = this.f3044b.getMeasuredHeight() + m3146c(this.f3044b);
            i7 = View.combineMeasuredStates(i7, this.f3044b.getMeasuredState());
        }
        if (m3143a(this.f3045c)) {
            currentContentInsetStart = Math.max(currentContentInsetStart, m3136a(this.f3045c, i, max2 + max, i2, i9 + i6, iArr));
            i6 += this.f3045c.getMeasuredHeight() + m3146c(this.f3045c);
            i7 = View.combineMeasuredStates(i7, this.f3045c.getMeasuredState());
        }
        currentContentInsetStart += max2;
        i6 = Math.max(i8, i6) + (getPaddingTop() + getPaddingBottom());
        int i10 = i;
        max = View.resolveSizeAndState(Math.max(currentContentInsetStart + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i10, -16777216 & i7);
        i6 = View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (this.f3041N) {
            max2 = getChildCount();
            for (currentContentInsetStart = 0; currentContentInsetStart < max2; currentContentInsetStart++) {
                View childAt2 = getChildAt(currentContentInsetStart);
                if (m3143a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            i6 = 0;
        }
        setMeasuredDimension(max, i6);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object obj;
        int measuredHeight;
        hh hhVar;
        int paddingTop;
        int measuredWidth;
        if (ai.f1848a.mo400k(this) == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i5 = width - paddingRight;
        int[] iArr = this.f3033F;
        iArr[1] = 0;
        iArr[0] = 0;
        int g = ai.f1848a.mo395g(this);
        int min = g >= 0 ? Math.min(g, i4 - i2) : 0;
        if (!m3143a(this.f3046d)) {
            g = i5;
            i5 = paddingLeft;
        } else if (obj != null) {
            g = m3145b(this.f3046d, i5, iArr, min);
            i5 = paddingLeft;
        } else {
            int i6 = i5;
            i5 = m3137a(this.f3046d, paddingLeft, iArr, min);
            g = i6;
        }
        if (m3143a(this.f3050h)) {
            if (obj != null) {
                g = m3145b(this.f3050h, g, iArr, min);
            } else {
                i5 = m3137a(this.f3050h, i5, iArr, min);
            }
        }
        if (m3143a(this.f3043a)) {
            if (obj != null) {
                i5 = m3137a(this.f3043a, i5, iArr, min);
            } else {
                g = m3145b(this.f3043a, g, iArr, min);
            }
        }
        int currentContentInsetLeft = getCurrentContentInsetLeft();
        int currentContentInsetRight = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft - i5);
        iArr[1] = Math.max(0, currentContentInsetRight - ((width - paddingRight) - g));
        i5 = Math.max(i5, currentContentInsetLeft);
        g = Math.min(g, (width - paddingRight) - currentContentInsetRight);
        if (m3143a(this.f3051i)) {
            if (obj != null) {
                g = m3145b(this.f3051i, g, iArr, min);
            } else {
                i5 = m3137a(this.f3051i, i5, iArr, min);
            }
        }
        if (!m3143a(this.f3047e)) {
            currentContentInsetLeft = g;
            currentContentInsetRight = i5;
        } else if (obj != null) {
            currentContentInsetLeft = m3145b(this.f3047e, g, iArr, min);
            currentContentInsetRight = i5;
        } else {
            currentContentInsetLeft = g;
            currentContentInsetRight = m3137a(this.f3047e, i5, iArr, min);
        }
        boolean a = m3143a(this.f3044b);
        boolean a2 = m3143a(this.f3045c);
        i5 = 0;
        if (a) {
            hh hhVar2 = (hh) this.f3044b.getLayoutParams();
            i5 = (hhVar2.bottomMargin + (hhVar2.topMargin + this.f3044b.getMeasuredHeight())) + 0;
        }
        if (a2) {
            hhVar2 = (hh) this.f3045c.getLayoutParams();
            measuredHeight = (hhVar2.bottomMargin + (hhVar2.topMargin + this.f3045c.getMeasuredHeight())) + i5;
        } else {
            measuredHeight = i5;
        }
        if (a || a2) {
            hhVar2 = (hh) (a ? this.f3044b : this.f3045c).getLayoutParams();
            hhVar = (hh) (a2 ? this.f3045c : this.f3044b).getLayoutParams();
            Object obj2 = ((!a || this.f3044b.getMeasuredWidth() <= 0) && (!a2 || this.f3045c.getMeasuredWidth() <= 0)) ? null : 1;
            switch (this.f3065w & 112) {
                case 48:
                    paddingTop = (hhVar2.topMargin + getPaddingTop()) + this.f3060r;
                    break;
                case 80:
                    paddingTop = (((height - paddingBottom) - hhVar.bottomMargin) - this.f3061s) - measuredHeight;
                    break;
                default:
                    paddingTop = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (paddingTop < hhVar2.topMargin + this.f3060r) {
                        g = hhVar2.topMargin + this.f3060r;
                    } else {
                        measuredHeight = (((height - paddingBottom) - measuredHeight) - paddingTop) - paddingTop2;
                        if (measuredHeight < hhVar2.bottomMargin + this.f3061s) {
                            g = Math.max(0, paddingTop - ((hhVar.bottomMargin + this.f3061s) - measuredHeight));
                        } else {
                            g = paddingTop;
                        }
                    }
                    paddingTop = paddingTop2 + g;
                    break;
            }
            if (obj != null) {
                g = (obj2 != null ? this.f3058p : 0) - iArr[1];
                i5 = currentContentInsetLeft - Math.max(0, g);
                iArr[1] = Math.max(0, -g);
                if (a) {
                    hhVar2 = (hh) this.f3044b.getLayoutParams();
                    measuredWidth = i5 - this.f3044b.getMeasuredWidth();
                    currentContentInsetLeft = this.f3044b.getMeasuredHeight() + paddingTop;
                    this.f3044b.layout(measuredWidth, paddingTop, i5, currentContentInsetLeft);
                    paddingTop = currentContentInsetLeft + hhVar2.bottomMargin;
                    currentContentInsetLeft = measuredWidth - this.f3059q;
                } else {
                    currentContentInsetLeft = i5;
                }
                if (a2) {
                    hhVar2 = (hh) this.f3045c.getLayoutParams();
                    measuredWidth = hhVar2.topMargin + paddingTop;
                    this.f3045c.layout(i5 - this.f3045c.getMeasuredWidth(), measuredWidth, i5, this.f3045c.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i5 - this.f3059q;
                    g = hhVar2.bottomMargin;
                    g = measuredWidth;
                } else {
                    g = i5;
                }
                if (obj2 != null) {
                    g = Math.min(currentContentInsetLeft, g);
                } else {
                    g = i5;
                }
                currentContentInsetLeft = g;
            } else {
                g = (obj2 != null ? this.f3058p : 0) - iArr[0];
                currentContentInsetRight += Math.max(0, g);
                iArr[0] = Math.max(0, -g);
                if (a) {
                    hhVar2 = (hh) this.f3044b.getLayoutParams();
                    i5 = this.f3044b.getMeasuredWidth() + currentContentInsetRight;
                    measuredWidth = this.f3044b.getMeasuredHeight() + paddingTop;
                    this.f3044b.layout(currentContentInsetRight, paddingTop, i5, measuredWidth);
                    g = hhVar2.bottomMargin + measuredWidth;
                    measuredWidth = i5 + this.f3059q;
                    i5 = g;
                } else {
                    measuredWidth = currentContentInsetRight;
                    i5 = paddingTop;
                }
                if (a2) {
                    hhVar2 = (hh) this.f3045c.getLayoutParams();
                    i5 += hhVar2.topMargin;
                    paddingTop = this.f3045c.getMeasuredWidth() + currentContentInsetRight;
                    this.f3045c.layout(currentContentInsetRight, i5, paddingTop, this.f3045c.getMeasuredHeight() + i5);
                    i5 = this.f3059q + paddingTop;
                    g = hhVar2.bottomMargin;
                    g = i5;
                } else {
                    g = currentContentInsetRight;
                }
                if (obj2 != null) {
                    currentContentInsetRight = Math.max(measuredWidth, g);
                }
            }
        }
        m3142a(this.f3031D, 3);
        int size = this.f3031D.size();
        measuredWidth = currentContentInsetRight;
        for (i5 = 0; i5 < size; i5++) {
            measuredWidth = m3137a((View) this.f3031D.get(i5), measuredWidth, iArr, min);
        }
        m3142a(this.f3031D, 5);
        currentContentInsetRight = this.f3031D.size();
        i5 = 0;
        measuredHeight = currentContentInsetLeft;
        while (i5 < currentContentInsetRight) {
            currentContentInsetLeft = m3145b((View) this.f3031D.get(i5), measuredHeight, iArr, min);
            i5++;
            measuredHeight = currentContentInsetLeft;
        }
        m3142a(this.f3031D, 1);
        List list = this.f3031D;
        currentContentInsetRight = iArr[0];
        currentContentInsetLeft = iArr[1];
        paddingTop2 = list.size();
        size = currentContentInsetLeft;
        paddingTop = currentContentInsetRight;
        currentContentInsetLeft = 0;
        currentContentInsetRight = 0;
        while (currentContentInsetLeft < paddingTop2) {
            View view = (View) list.get(currentContentInsetLeft);
            hhVar = (hh) view.getLayoutParams();
            paddingTop = hhVar.leftMargin - paddingTop;
            i5 = hhVar.rightMargin - size;
            paddingBottom = Math.max(0, paddingTop);
            int max = Math.max(0, i5);
            paddingTop = Math.max(0, -paddingTop);
            size = Math.max(0, -i5);
            currentContentInsetLeft++;
            currentContentInsetRight += (view.getMeasuredWidth() + paddingBottom) + max;
        }
        g = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (currentContentInsetRight / 2);
        i5 = g + currentContentInsetRight;
        if (g < measuredWidth) {
            g = measuredWidth;
        } else if (i5 > measuredHeight) {
            g -= i5 - measuredHeight;
        }
        paddingLeft = this.f3031D.size();
        measuredWidth = g;
        for (i5 = 0; i5 < paddingLeft; i5++) {
            measuredWidth = m3137a((View) this.f3031D.get(i5), measuredWidth, iArr, min);
        }
        this.f3031D.clear();
    }

    private final int m3137a(View view, int i, int[] iArr, int i2) {
        hh hhVar = (hh) view.getLayoutParams();
        int i3 = hhVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        i3 = m3135a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i3, max + measuredWidth, view.getMeasuredHeight() + i3);
        return (hhVar.rightMargin + measuredWidth) + max;
    }

    private final int m3145b(View view, int i, int[] iArr, int i2) {
        hh hhVar = (hh) view.getLayoutParams();
        int i3 = hhVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        i3 = m3135a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i3, max, view.getMeasuredHeight() + i3);
        return max - (hhVar.leftMargin + measuredWidth);
    }

    private final int m3135a(View view, int i) {
        hh hhVar = (hh) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = hhVar.a & 112;
        switch (i3) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i3 = this.f3065w & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - hhVar.bottomMargin) - i2;
            default:
                int i4;
                i3 = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                i2 = (((height - i3) - paddingBottom) - measuredHeight) / 2;
                if (i2 < hhVar.topMargin) {
                    i4 = hhVar.topMargin;
                } else {
                    measuredHeight = (((height - paddingBottom) - measuredHeight) - i2) - i3;
                    i4 = measuredHeight < hhVar.bottomMargin ? Math.max(0, i2 - (hhVar.bottomMargin - measuredHeight)) : i2;
                }
                return i4 + i3;
        }
    }

    private final void m3142a(List list, int i) {
        int i2 = 1;
        int i3 = 0;
        if (ai.f1848a.mo400k(this) != 1) {
            i2 = 0;
        }
        int childCount = getChildCount();
        int a = C0357n.m2043a(i, ai.f1848a.mo400k(this));
        list.clear();
        hh hhVar;
        if (i2 != 0) {
            for (i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                hhVar = (hh) childAt.getLayoutParams();
                if (hhVar.f3566b == 0 && m3143a(childAt) && m3134a(hhVar.a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (i3 < childCount) {
            View childAt2 = getChildAt(i3);
            hhVar = (hh) childAt2.getLayoutParams();
            if (hhVar.f3566b == 0 && m3143a(childAt2) && m3134a(hhVar.a) == a) {
                list.add(childAt2);
            }
            i3++;
        }
    }

    private final int m3134a(int i) {
        int k = ai.f1848a.mo400k(this);
        int a = C0357n.m2043a(i, k) & 7;
        switch (a) {
            case 1:
            case 3:
            case 5:
                return a;
            default:
                return k == 1 ? 5 : 3;
        }
    }

    private final boolean m3143a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int m3144b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0361r.m2051b(marginLayoutParams) + C0361r.m2049a(marginLayoutParams);
    }

    private static int m3146c(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static hh m3138a(LayoutParams layoutParams) {
        if (layoutParams instanceof hh) {
            return new hh((hh) layoutParams);
        }
        if (layoutParams instanceof C0410b) {
            return new hh((C0410b) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new hh((MarginLayoutParams) layoutParams);
        }
        return new hh(layoutParams);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof hh);
    }

    public bw getWrapper() {
        if (this.f3036I == null) {
            this.f3036I = new hk(this, true);
        }
        return this.f3036I;
    }

    private final boolean m3147d(View view) {
        return view.getParent() == this || this.f3032E.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.f3041N = z;
        requestLayout();
    }

    final void m3155g() {
        if (this.f3062t == null) {
            this.f3062t = new fy();
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new hh();
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m3138a(layoutParams);
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new hh(getContext(), attributeSet);
    }
}
