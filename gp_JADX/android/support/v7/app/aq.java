package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.ca;
import android.support.v4.p037h.C0313h;
import android.support.v4.view.C0358o;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0396c;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0400g;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.support.v7.view.C0455e;
import android.support.v7.view.C0456f;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ag;
import android.support.v7.widget.bv;
import android.support.v7.widget.cq;
import android.support.v7.widget.id;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

class aq extends ad implements C0408q, Factory2 {
    public static final boolean f2266x = (VERSION.SDK_INT < 21);
    public bd f2267A;
    public C0412b f2268B;
    public ActionBarContextView f2269C;
    public PopupWindow f2270D;
    public Runnable f2271E;
    public bt f2272F = null;
    public boolean f2273G;
    public ViewGroup f2274H;
    public TextView f2275I;
    public View f2276J;
    public boolean f2277K;
    public boolean f2278L;
    public boolean f2279M;
    public bc[] f2280N;
    public bc f2281O;
    public boolean f2282P;
    public boolean f2283Q;
    public int f2284R;
    public final Runnable f2285S = new ar(this);
    public boolean f2286T;
    public Rect f2287U;
    public Rect f2288V;
    public bg f2289W;
    public bv f2290y;
    public ay f2291z;

    aq(Context context, Window window, ab abVar) {
        super(context, window, abVar);
    }

    public void mo523a(Bundle bundle) {
        if ((this.g instanceof Activity) && ca.m1404b((Activity) this.g) != null) {
            C0404a c0404a = this.f2253j;
            if (c0404a == null) {
                this.f2286T = true;
            } else {
                c0404a.mo573b(true);
            }
        }
    }

    public final void mo534c() {
        m2407r();
    }

    public final void mo542m() {
        m2407r();
        if (this.l && this.j == null) {
            if (this.g instanceof Activity) {
                this.j = new bs((Activity) this.g, this.m);
            } else if (this.g instanceof Dialog) {
                this.j = new bs((Dialog) this.g);
            }
            if (this.j != null) {
                this.j.mo573b(this.f2286T);
            }
        }
    }

    public final void mo525a(Toolbar toolbar) {
        if (this.g instanceof Activity) {
            C0404a a = mo500a();
            if (a instanceof bs) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.k = null;
            if (a != null) {
                a.mo587n();
            }
            if (toolbar != null) {
                C0404a bjVar = new bj(toolbar, ((Activity) this.g).getTitle(), this.h);
                this.j = bjVar;
                this.f.setCallback(bjVar.f2366c);
            } else {
                this.j = null;
                this.f.setCallback(this.h);
            }
            mo540h();
        }
    }

    public final View mo522a(int i) {
        m2407r();
        return this.f.findViewById(i);
    }

    public final void mo536d() {
        if (this.l && this.f2273G) {
            C0404a a = mo500a();
            if (a != null) {
                a.mo594i();
            }
        }
        ag a2 = ag.m3175a();
        Context context = this.e;
        synchronized (a2.f3106m) {
            C0313h c0313h = (C0313h) a2.f3107n.get(context);
            if (c0313h != null) {
                c0313h.m1687b();
            }
        }
        mo508l();
    }

    public void mo505f() {
        C0404a a = mo500a();
        if (a != null) {
            a.mo577c(false);
        }
    }

    public final void mo539g() {
        C0404a a = mo500a();
        if (a != null) {
            a.mo577c(true);
        }
    }

    public final void mo526a(View view) {
        m2407r();
        ViewGroup viewGroup = (ViewGroup) this.f2274H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.onContentChanged();
    }

    public final void mo531b(int i) {
        m2407r();
        ViewGroup viewGroup = (ViewGroup) this.f2274H.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i, viewGroup);
        this.g.onContentChanged();
    }

    public final void mo527a(View view, LayoutParams layoutParams) {
        m2407r();
        ViewGroup viewGroup = (ViewGroup) this.f2274H.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.onContentChanged();
    }

    public final void mo532b(View view, LayoutParams layoutParams) {
        m2407r();
        ((ViewGroup) this.f2274H.findViewById(16908290)).addView(view, layoutParams);
        this.g.onContentChanged();
    }

    public void mo506i() {
        if (this.f2283Q) {
            this.f.getDecorView().removeCallbacks(this.f2285S);
        }
        super.mo506i();
        if (this.j != null) {
            this.j.mo587n();
        }
    }

    private final void m2407r() {
        if (!this.f2273G) {
            TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(C0403j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(C0403j.AppCompatTheme_windowActionBar)) {
                View view;
                View view2;
                if (obtainStyledAttributes.getBoolean(C0403j.AppCompatTheme_windowNoTitle, false)) {
                    mo535c(1);
                } else if (obtainStyledAttributes.getBoolean(C0403j.AppCompatTheme_windowActionBar, false)) {
                    mo535c(108);
                }
                if (obtainStyledAttributes.getBoolean(C0403j.AppCompatTheme_windowActionBarOverlay, false)) {
                    mo535c(109);
                }
                if (obtainStyledAttributes.getBoolean(C0403j.AppCompatTheme_windowActionModeOverlay, false)) {
                    mo535c(10);
                }
                this.o = obtainStyledAttributes.getBoolean(C0403j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                this.f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.e);
                if (this.p) {
                    if (this.n) {
                        view = (ViewGroup) from.inflate(C0400g.abc_screen_simple_overlay_action_mode, null);
                    } else {
                        view = (ViewGroup) from.inflate(C0400g.abc_screen_simple, null);
                    }
                    if (VERSION.SDK_INT >= 21) {
                        ai.m1828a(view, new as(this));
                        view2 = view;
                    } else {
                        ((cq) view).setOnFitSystemWindowsListener(new at(this));
                        view2 = view;
                    }
                } else if (this.o) {
                    r0 = (ViewGroup) from.inflate(C0400g.abc_dialog_title_material, null);
                    this.m = false;
                    this.l = false;
                    view2 = r0;
                } else if (this.l) {
                    Context c0455e;
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(C0394a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        c0455e = new C0455e(this.e, typedValue.resourceId);
                    } else {
                        c0455e = this.e;
                    }
                    r0 = (ViewGroup) LayoutInflater.from(c0455e).inflate(C0400g.abc_screen_toolbar, null);
                    this.f2290y = (bv) r0.findViewById(C0399f.decor_content_parent);
                    this.f2290y.setWindowCallback(this.f2249f.getCallback());
                    if (this.m) {
                        this.f2290y.mo704a(109);
                    }
                    if (this.f2277K) {
                        this.f2290y.mo704a(2);
                    }
                    if (this.f2278L) {
                        this.f2290y.mo704a(5);
                    }
                    view2 = r0;
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.l + ", windowActionBarOverlay: " + this.m + ", android:windowIsFloating: " + this.o + ", windowActionModeOverlay: " + this.n + ", windowNoTitle: " + this.p + " }");
                }
                CharSequence title;
                if (this.f2290y == null) {
                    this.f2275I = (TextView) view2.findViewById(C0399f.title);
                }
                id.m3870b(view2);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view2.findViewById(C0399f.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.f.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.f.setContentView(view2);
                contentFrameLayout.setAttachListener(new au(this));
                this.f2274H = view2;
                if (this.f2250g instanceof Activity) {
                    title = ((Activity) this.f2250g).getTitle();
                } else {
                    title = this.f2260q;
                }
                if (!TextUtils.isEmpty(title)) {
                    mo533b(title);
                }
                contentFrameLayout = (ContentFrameLayout) this.f2274H.findViewById(16908290);
                view = this.f.getDecorView();
                contentFrameLayout.f2324h.set(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                if (ai.f1848a.mo409s(contentFrameLayout)) {
                    contentFrameLayout.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.e.obtainStyledAttributes(C0403j.AppCompatTheme);
                obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
                obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(C0403j.AppCompatTheme_windowFixedWidthMajor)) {
                    obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0403j.AppCompatTheme_windowFixedWidthMinor)) {
                    obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(C0403j.AppCompatTheme_windowFixedHeightMajor)) {
                    obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(C0403j.AppCompatTheme_windowFixedHeightMinor)) {
                    obtainStyledAttributes2.getValue(C0403j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout.requestLayout();
                this.f2273G = true;
                bc g = m2433g(0);
                if (!this.f2261r) {
                    if (g == null || g.f2336j == null) {
                        mo545f(108);
                        return;
                    }
                    return;
                }
                return;
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final boolean mo535c(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.p && i == 108) {
            return false;
        }
        if (this.l && i == 1) {
            this.l = false;
        }
        switch (i) {
            case 1:
                m2408s();
                this.p = true;
                return true;
            case 2:
                m2408s();
                this.f2277K = true;
                return true;
            case 5:
                m2408s();
                this.f2278L = true;
                return true;
            case 10:
                m2408s();
                this.n = true;
                return true;
            case 108:
                m2408s();
                this.l = true;
                return true;
            case 109:
                m2408s();
                this.m = true;
                return true;
            default:
                return this.f.requestFeature(i);
        }
    }

    final void mo533b(CharSequence charSequence) {
        if (this.f2290y != null) {
            this.f2290y.setWindowTitle(charSequence);
        } else if (this.f2253j != null) {
            this.f2253j.mo576c(charSequence);
        } else if (this.f2275I != null) {
            this.f2275I.setText(charSequence);
        }
    }

    final void mo537d(int i) {
        if (i == 108) {
            C0404a a = mo500a();
            if (a != null) {
                a.mo579d(false);
            }
        } else if (i == 0) {
            bc g = m2433g(i);
            if (g.f2341o) {
                m2415a(g, false);
            }
        }
    }

    final boolean mo538e(int i) {
        if (i != 108) {
            return false;
        }
        C0404a a = mo500a();
        if (a == null) {
            return true;
        }
        a.mo579d(true);
        return true;
    }

    public final boolean mo529a(C0471p c0471p, MenuItem menuItem) {
        Callback callback = this.f2249f.getCallback();
        if (!(callback == null || this.f2261r)) {
            bc a = m2409a(c0471p.mo686k());
            if (a != null) {
                return callback.onMenuItemSelected(a.f2327a, menuItem);
            }
        }
        return false;
    }

    public final void mo524a(C0471p c0471p) {
        if (this.f2290y == null || !this.f2290y.mo706b() || (ViewConfiguration.get(this.e).hasPermanentMenuKey() && !this.f2290y.mo708d())) {
            bc g = m2433g(0);
            g.f2343q = true;
            m2415a(g, false);
            m2403a(g, null);
            return;
        }
        Callback callback = this.f2249f.getCallback();
        if (this.f2290y.mo707c()) {
            this.f2290y.mo710f();
            if (!this.f2261r) {
                callback.onPanelClosed(108, m2433g(0).f2336j);
            }
        } else if (callback != null && !this.f2261r) {
            if (this.f2283Q && (this.f2284R & 1) != 0) {
                this.f.getDecorView().removeCallbacks(this.f2285S);
                this.f2285S.run();
            }
            bc g2 = m2433g(0);
            if (g2.f2336j != null && !g2.f2344r && callback.onPreparePanel(0, g2.f2335i, g2.f2336j)) {
                callback.onMenuOpened(108, g2.f2336j);
                this.f2290y.mo709e();
            }
        }
    }

    public final void mo540h() {
        C0404a a = mo500a();
        if (a == null || !a.mo585l()) {
            mo545f(0);
        }
    }

    final C0412b mo521a(C0409c c0409c) {
        m2442q();
        if (this.f2268B != null) {
            this.f2268B.mo608c();
        }
        if (!(this.i == null || this.f2261r)) {
            try {
                this.i.D_();
            } catch (AbstractMethodError e) {
            }
        }
        if (this.f2269C == null) {
            if (this.o) {
                Context c0455e;
                TypedValue typedValue = new TypedValue();
                Theme theme = this.e.getTheme();
                theme.resolveAttribute(C0394a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    Theme newTheme = this.e.getResources().newTheme();
                    newTheme.setTo(theme);
                    newTheme.applyStyle(typedValue.resourceId, true);
                    c0455e = new C0455e(this.e, 0);
                    c0455e.getTheme().setTo(newTheme);
                } else {
                    c0455e = this.e;
                }
                this.f2269C = new ActionBarContextView(c0455e);
                this.f2270D = new PopupWindow(c0455e, null, C0394a.actionModePopupWindowStyle);
                android.support.v4.widget.aq.m2196a(this.f2270D, 2);
                this.f2270D.setContentView(this.f2269C);
                this.f2270D.setWidth(-1);
                c0455e.getTheme().resolveAttribute(C0394a.actionBarSize, typedValue, true);
                this.f2269C.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0455e.getResources().getDisplayMetrics()));
                this.f2270D.setHeight(-2);
                this.f2271E = new av(this);
            } else {
                ViewStubCompat viewStubCompat = (ViewStubCompat) this.f2274H.findViewById(C0399f.action_mode_bar_stub);
                if (viewStubCompat != null) {
                    viewStubCompat.setLayoutInflater(LayoutInflater.from(m2389n()));
                    this.f2269C = (ActionBarContextView) viewStubCompat.m3156a();
                }
            }
        }
        if (this.f2269C != null) {
            m2442q();
            this.f2269C.m2941b();
            C0412b c0456f = new C0456f(this.f2269C.getContext(), this.f2269C, c0409c);
            if (c0409c.mo556a(c0456f, c0456f.mo605b())) {
                c0456f.mo609d();
                this.f2269C.m2939a(c0456f);
                this.f2268B = c0456f;
                if (m2441p()) {
                    this.f2269C.setAlpha(0.0f);
                    this.f2272F = ai.m1852h(this.f2269C).m1993a(1.0f);
                    this.f2272F.m1995a(new ax(this));
                } else {
                    this.f2269C.setAlpha(1.0f);
                    this.f2269C.setVisibility(0);
                    this.f2269C.sendAccessibilityEvent(32);
                    if (this.f2269C.getParent() instanceof View) {
                        ai.f1848a.mo396h((View) this.f2269C.getParent());
                    }
                }
                if (this.f2270D != null) {
                    this.f.getDecorView().post(this.f2271E);
                }
            } else {
                this.f2268B = null;
            }
        }
        if (!(this.f2268B == null || this.i == null)) {
            this.i.B_();
        }
        return this.f2268B;
    }

    final boolean m2441p() {
        if (this.f2273G && this.f2274H != null) {
            if (ai.f1848a.mo409s(this.f2274H)) {
                return true;
            }
        }
        return false;
    }

    final void m2442q() {
        if (this.f2272F != null) {
            this.f2272F.m1998a();
        }
    }

    final boolean mo528a(int i, KeyEvent keyEvent) {
        C0404a a = mo500a();
        if (a != null && a.mo567a(i, keyEvent)) {
            return true;
        }
        if (this.f2281O == null || !m2404a(this.f2281O, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f2281O == null) {
                bc g = m2433g(0);
                m2405b(g, keyEvent);
                boolean a2 = m2404a(g, keyEvent.getKeyCode(), keyEvent);
                g.f2339m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        } else if (this.f2281O == null) {
            return true;
        } else {
            this.f2281O.f2340n = true;
            return true;
        }
    }

    final boolean mo530a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 82 && this.g.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            switch (keyCode) {
                case 4:
                    this.f2282P = (keyEvent.getFlags() & 128) != 0;
                    break;
                case 82:
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    bc g = m2433g(0);
                    if (g.f2341o) {
                        return true;
                    }
                    m2405b(g, keyEvent);
                    return true;
            }
            return false;
        }
        boolean z;
        bc g2;
        switch (keyCode) {
            case 4:
                z = this.f2282P;
                this.f2282P = false;
                g2 = m2433g(0);
                if (g2 == null || !g2.f2341o) {
                    if (this.f2268B != null) {
                        this.f2268B.mo608c();
                        z = true;
                    } else {
                        C0404a a = mo500a();
                        if (a == null || !a.mo586m()) {
                            z = false;
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    m2415a(g2, true);
                    return true;
                }
                break;
            case 82:
                if (this.f2268B != null) {
                    return true;
                }
                g2 = m2433g(0);
                if (this.f2290y == null || !this.f2290y.mo706b() || ViewConfiguration.get(this.e).hasPermanentMenuKey()) {
                    if (g2.f2341o || g2.f2340n) {
                        z = g2.f2341o;
                        m2415a(g2, true);
                    } else {
                        if (g2.f2339m) {
                            if (g2.f2344r) {
                                g2.f2339m = false;
                                z = m2405b(g2, keyEvent);
                            } else {
                                z = true;
                            }
                            if (z) {
                                m2403a(g2, keyEvent);
                                z = true;
                            }
                        }
                        z = false;
                    }
                } else if (this.f2290y.mo707c()) {
                    z = this.f2290y.mo710f();
                } else {
                    if (!this.f2261r && m2405b(g2, keyEvent)) {
                        z = this.f2290y.mo709e();
                    }
                    z = false;
                }
                if (!z) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
        }
        return false;
    }

    public final void mo541k() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            C0358o.m2046b(from, this);
        } else if (!(from.getFactory2() instanceof aq)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
        r7 = this;
        r2 = 1;
        r3 = 0;
        r0 = r7.mo543a(r9, r10, r11);
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = r7.f2289W;
        if (r0 != 0) goto L_0x0014;
    L_0x000d:
        r0 = new android.support.v7.app.bg;
        r0.<init>();
        r7.f2289W = r0;
    L_0x0014:
        r0 = f2266x;
        if (r0 == 0) goto L_0x0175;
    L_0x0018:
        r0 = r11 instanceof org.xmlpull.v1.XmlPullParser;
        if (r0 == 0) goto L_0x005d;
    L_0x001c:
        r0 = r11;
        r0 = (org.xmlpull.v1.XmlPullParser) r0;
        r0 = r0.getDepth();
        if (r0 <= r2) goto L_0x005b;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r5 = r7.f2289W;
        r1 = f2266x;
        r4 = android.support.v7.widget.hv.m3848a();
        if (r0 == 0) goto L_0x0172;
    L_0x0030:
        if (r8 == 0) goto L_0x0172;
    L_0x0032:
        r0 = r8.getContext();
    L_0x0036:
        r0 = android.support.v7.app.bg.m2488a(r0, r11, r1);
        if (r4 == 0) goto L_0x0040;
    L_0x003c:
        r0 = android.support.v7.widget.gz.m3765a(r0);
    L_0x0040:
        r1 = 0;
        r4 = -1;
        r6 = r9.hashCode();
        switch(r6) {
            case -1946472170: goto L_0x00fc;
            case -1455429095: goto L_0x00d8;
            case -1346021293: goto L_0x00f0;
            case -938935918: goto L_0x0087;
            case -937446323: goto L_0x00b8;
            case -658531749: goto L_0x0108;
            case -339785223: goto L_0x00ae;
            case 776382189: goto L_0x00cd;
            case 1125864064: goto L_0x0090;
            case 1413872058: goto L_0x00e4;
            case 1601505219: goto L_0x00c2;
            case 1666676343: goto L_0x00a4;
            case 2001146706: goto L_0x009a;
            default: goto L_0x0049;
        };
    L_0x0049:
        r3 = r4;
    L_0x004a:
        switch(r3) {
            case 0: goto L_0x0114;
            case 1: goto L_0x011b;
            case 2: goto L_0x0122;
            case 3: goto L_0x0129;
            case 4: goto L_0x0130;
            case 5: goto L_0x0137;
            case 6: goto L_0x013e;
            case 7: goto L_0x0145;
            case 8: goto L_0x014c;
            case 9: goto L_0x0153;
            case 10: goto L_0x015a;
            case 11: goto L_0x0161;
            case 12: goto L_0x0168;
            default: goto L_0x004d;
        };
    L_0x004d:
        if (r1 != 0) goto L_0x016f;
    L_0x004f:
        if (r10 == r0) goto L_0x016f;
    L_0x0051:
        r0 = r5.m2491a(r0, r9, r11);
    L_0x0055:
        if (r0 == 0) goto L_0x0008;
    L_0x0057:
        android.support.v7.app.bg.m2490a(r0, r11);
        goto L_0x0008;
    L_0x005b:
        r0 = r3;
        goto L_0x0026;
    L_0x005d:
        r0 = r8;
        r0 = (android.view.ViewParent) r0;
        if (r0 != 0) goto L_0x0064;
    L_0x0062:
        r0 = r3;
        goto L_0x0026;
    L_0x0064:
        r1 = r7.f;
        r4 = r1.getDecorView();
        r1 = r0;
    L_0x006b:
        if (r1 != 0) goto L_0x006f;
    L_0x006d:
        r0 = r2;
        goto L_0x0026;
    L_0x006f:
        if (r1 == r4) goto L_0x0080;
    L_0x0071:
        r0 = r1 instanceof android.view.View;
        if (r0 == 0) goto L_0x0080;
    L_0x0075:
        r0 = r1;
        r0 = (android.view.View) r0;
        r5 = android.support.v4.view.ai.f1848a;
        r0 = r5.mo410t(r0);
        if (r0 == 0) goto L_0x0082;
    L_0x0080:
        r0 = r3;
        goto L_0x0026;
    L_0x0082:
        r1 = r1.getParent();
        goto L_0x006b;
    L_0x0087:
        r2 = "TextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x008f:
        goto L_0x004a;
    L_0x0090:
        r3 = "ImageView";
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0049;
    L_0x0098:
        r3 = r2;
        goto L_0x004a;
    L_0x009a:
        r2 = "Button";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00a2:
        r3 = 2;
        goto L_0x004a;
    L_0x00a4:
        r2 = "EditText";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00ac:
        r3 = 3;
        goto L_0x004a;
    L_0x00ae:
        r2 = "Spinner";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00b6:
        r3 = 4;
        goto L_0x004a;
    L_0x00b8:
        r2 = "ImageButton";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00c0:
        r3 = 5;
        goto L_0x004a;
    L_0x00c2:
        r2 = "CheckBox";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00ca:
        r3 = 6;
        goto L_0x004a;
    L_0x00cd:
        r2 = "RadioButton";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00d5:
        r3 = 7;
        goto L_0x004a;
    L_0x00d8:
        r2 = "CheckedTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00e0:
        r3 = 8;
        goto L_0x004a;
    L_0x00e4:
        r2 = "AutoCompleteTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00ec:
        r3 = 9;
        goto L_0x004a;
    L_0x00f0:
        r2 = "MultiAutoCompleteTextView";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x00f8:
        r3 = 10;
        goto L_0x004a;
    L_0x00fc:
        r2 = "RatingBar";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x0104:
        r3 = 11;
        goto L_0x004a;
    L_0x0108:
        r2 = "SeekBar";
        r2 = r9.equals(r2);
        if (r2 == 0) goto L_0x0049;
    L_0x0110:
        r3 = 12;
        goto L_0x004a;
    L_0x0114:
        r1 = new android.support.v7.widget.bg;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x011b:
        r1 = new android.support.v7.widget.ap;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0122:
        r1 = new android.support.v7.widget.ad;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0129:
        r1 = new android.support.v7.widget.al;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0130:
        r1 = new android.support.v7.widget.AppCompatSpinner;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0137:
        r1 = new android.support.v7.widget.an;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x013e:
        r1 = new android.support.v7.widget.AppCompatCheckBox;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0145:
        r1 = new android.support.v7.widget.at;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x014c:
        r1 = new android.support.v7.widget.ae;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0153:
        r1 = new android.support.v7.widget.ab;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x015a:
        r1 = new android.support.v7.widget.aq;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0161:
        r1 = new android.support.v7.widget.au;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x0168:
        r1 = new android.support.v7.widget.av;
        r1.<init>(r0, r11);
        goto L_0x004d;
    L_0x016f:
        r0 = r1;
        goto L_0x0055;
    L_0x0172:
        r0 = r10;
        goto L_0x0036;
    L_0x0175:
        r0 = r3;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.aq.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    View mo543a(String str, Context context, AttributeSet attributeSet) {
        if (this.g instanceof Factory) {
            View onCreateView = ((Factory) this.g).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2403a(android.support.v7.app.bc r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r1 = -1;
        r2 = -2;
        r3 = 0;
        r9 = 1;
        r0 = r11.f2341o;
        if (r0 != 0) goto L_0x000c;
    L_0x0008:
        r0 = r10.f2261r;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r0 = r11.f2327a;
        if (r0 != 0) goto L_0x0022;
    L_0x0011:
        r0 = r10.e;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;
        r0 = r0 & 15;
        r4 = 4;
        if (r0 == r4) goto L_0x000c;
    L_0x0022:
        r0 = r10.f2249f;
        r0 = r0.getCallback();
        if (r0 == 0) goto L_0x0038;
    L_0x002a:
        r4 = r11.f2327a;
        r5 = r11.f2336j;
        r0 = r0.onMenuOpened(r4, r5);
        if (r0 != 0) goto L_0x0038;
    L_0x0034:
        r10.m2415a(r11, r9);
        goto L_0x000c;
    L_0x0038:
        r0 = r10.e;
        r4 = "window";
        r0 = r0.getSystemService(r4);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000c;
    L_0x0045:
        r0 = r10.m2405b(r11, r12);
        if (r0 == 0) goto L_0x000c;
    L_0x004b:
        r0 = r11.f2333g;
        if (r0 == 0) goto L_0x0053;
    L_0x004f:
        r0 = r11.f2343q;
        if (r0 == 0) goto L_0x01cf;
    L_0x0053:
        r0 = r11.f2333g;
        if (r0 != 0) goto L_0x013e;
    L_0x0057:
        r0 = r10.m2389n();
        r1 = new android.util.TypedValue;
        r1.<init>();
        r4 = r0.getResources();
        r4 = r4.newTheme();
        r5 = r0.getTheme();
        r4.setTo(r5);
        r5 = android.support.v7.p040a.C0394a.actionBarPopupTheme;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x007d;
    L_0x0078:
        r5 = r1.resourceId;
        r4.applyStyle(r5, r9);
    L_0x007d:
        r5 = android.support.v7.p040a.C0394a.panelMenuListTheme;
        r4.resolveAttribute(r5, r1, r9);
        r5 = r1.resourceId;
        if (r5 == 0) goto L_0x0137;
    L_0x0086:
        r1 = r1.resourceId;
        r4.applyStyle(r1, r9);
    L_0x008b:
        r1 = new android.support.v7.view.e;
        r1.<init>(r0, r3);
        r0 = r1.getTheme();
        r0.setTo(r4);
        r11.f2338l = r1;
        r0 = android.support.v7.p040a.C0403j.AppCompatTheme;
        r0 = r1.obtainStyledAttributes(r0);
        r1 = android.support.v7.p040a.C0403j.AppCompatTheme_panelBackground;
        r1 = r0.getResourceId(r1, r3);
        r11.f2328b = r1;
        r1 = android.support.v7.p040a.C0403j.AppCompatTheme_android_windowAnimationStyle;
        r1 = r0.getResourceId(r1, r3);
        r11.f2332f = r1;
        r0.recycle();
        r0 = new android.support.v7.app.bb;
        r1 = r11.f2338l;
        r0.<init>(r10, r1);
        r11.f2333g = r0;
        r0 = 81;
        r11.f2329c = r0;
        r0 = r11.f2333g;
        if (r0 == 0) goto L_0x000c;
    L_0x00c3:
        r0 = r11.f2335i;
        if (r0 == 0) goto L_0x0151;
    L_0x00c7:
        r0 = r11.f2335i;
        r11.f2334h = r0;
        r0 = r9;
    L_0x00cc:
        if (r0 == 0) goto L_0x000c;
    L_0x00ce:
        r0 = r11.f2334h;
        if (r0 == 0) goto L_0x01cc;
    L_0x00d2:
        r0 = r11.f2335i;
        if (r0 == 0) goto L_0x01bd;
    L_0x00d6:
        r0 = r9;
    L_0x00d7:
        if (r0 == 0) goto L_0x000c;
    L_0x00d9:
        r0 = r11.f2334h;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x01e2;
    L_0x00e1:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x00e7:
        r0 = r11.f2328b;
        r4 = r11.f2333g;
        r4.setBackgroundResource(r0);
        r0 = r11.f2334h;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x0101;
    L_0x00f6:
        r4 = r0 instanceof android.view.ViewGroup;
        if (r4 == 0) goto L_0x0101;
    L_0x00fa:
        r0 = (android.view.ViewGroup) r0;
        r4 = r11.f2334h;
        r0.removeView(r4);
    L_0x0101:
        r0 = r11.f2333g;
        r4 = r11.f2334h;
        r0.addView(r4, r1);
        r0 = r11.f2334h;
        r0 = r0.hasFocus();
        if (r0 != 0) goto L_0x0115;
    L_0x0110:
        r0 = r11.f2334h;
        r0.requestFocus();
    L_0x0115:
        r1 = r2;
    L_0x0116:
        r11.f2340n = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.f2330d;
        r4 = r11.f2331e;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.f2329c;
        r0.gravity = r1;
        r1 = r11.f2332f;
        r0.windowAnimations = r1;
        r1 = r11.f2333g;
        r8.addView(r1, r0);
        r11.f2341o = r9;
        goto L_0x000c;
    L_0x0137:
        r1 = android.support.v7.p040a.C0402i.Theme_AppCompat_CompactMenu;
        r4.applyStyle(r1, r9);
        goto L_0x008b;
    L_0x013e:
        r0 = r11.f2343q;
        if (r0 == 0) goto L_0x00c3;
    L_0x0142:
        r0 = r11.f2333g;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x00c3;
    L_0x014a:
        r0 = r11.f2333g;
        r0.removeAllViews();
        goto L_0x00c3;
    L_0x0151:
        r0 = r11.f2336j;
        if (r0 == 0) goto L_0x01ba;
    L_0x0155:
        r0 = r10.f2267A;
        if (r0 != 0) goto L_0x0160;
    L_0x0159:
        r0 = new android.support.v7.app.bd;
        r0.<init>(r10);
        r10.f2267A = r0;
    L_0x0160:
        r0 = r10.f2267A;
        r1 = r11.f2336j;
        if (r1 != 0) goto L_0x0172;
    L_0x0166:
        r0 = 0;
    L_0x0167:
        r0 = (android.view.View) r0;
        r11.f2334h = r0;
        r0 = r11.f2334h;
        if (r0 == 0) goto L_0x01ba;
    L_0x016f:
        r0 = r9;
        goto L_0x00cc;
    L_0x0172:
        r1 = r11.f2337k;
        if (r1 != 0) goto L_0x018c;
    L_0x0176:
        r1 = new android.support.v7.view.menu.m;
        r4 = r11.f2338l;
        r5 = android.support.v7.p040a.C0400g.abc_list_menu_item_layout;
        r1.<init>(r4, r5);
        r11.f2337k = r1;
        r1 = r11.f2337k;
        r1.f2803h = r0;
        r0 = r11.f2336j;
        r1 = r11.f2337k;
        r0.m2821a(r1);
    L_0x018c:
        r1 = r11.f2337k;
        r0 = r11.f2333g;
        r4 = r1.f2799d;
        if (r4 != 0) goto L_0x01b7;
    L_0x0194:
        r4 = r1.f2797b;
        r5 = android.support.v7.p040a.C0400g.abc_expanded_menu_layout;
        r0 = r4.inflate(r5, r0, r3);
        r0 = (android.support.v7.view.menu.ExpandedMenuView) r0;
        r1.f2799d = r0;
        r0 = r1.f2804i;
        if (r0 != 0) goto L_0x01ab;
    L_0x01a4:
        r0 = new android.support.v7.view.menu.n;
        r0.<init>(r1);
        r1.f2804i = r0;
    L_0x01ab:
        r0 = r1.f2799d;
        r4 = r1.f2804i;
        r0.setAdapter(r4);
        r0 = r1.f2799d;
        r0.setOnItemClickListener(r1);
    L_0x01b7:
        r0 = r1.f2799d;
        goto L_0x0167;
    L_0x01ba:
        r0 = r3;
        goto L_0x00cc;
    L_0x01bd:
        r0 = r11.f2337k;
        r0 = r0.m2900b();
        r0 = r0.getCount();
        if (r0 <= 0) goto L_0x01cc;
    L_0x01c9:
        r0 = r9;
        goto L_0x00d7;
    L_0x01cc:
        r0 = r3;
        goto L_0x00d7;
    L_0x01cf:
        r0 = r11.f2335i;
        if (r0 == 0) goto L_0x01df;
    L_0x01d3:
        r0 = r11.f2335i;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x01df;
    L_0x01db:
        r0 = r0.width;
        if (r0 == r1) goto L_0x0116;
    L_0x01df:
        r1 = r2;
        goto L_0x0116;
    L_0x01e2:
        r1 = r0;
        goto L_0x00e7;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.aq.a(android.support.v7.app.bc, android.view.KeyEvent):void");
    }

    private final boolean m2405b(bc bcVar, KeyEvent keyEvent) {
        if (this.f2261r) {
            return false;
        }
        if (bcVar.f2339m) {
            return true;
        }
        if (!(this.f2281O == null || this.f2281O == bcVar)) {
            m2415a(this.f2281O, false);
        }
        Callback callback = this.f2249f.getCallback();
        if (callback != null) {
            bcVar.f2335i = callback.onCreatePanelView(bcVar.f2327a);
        }
        boolean z = bcVar.f2327a == 0 || bcVar.f2327a == 108;
        if (z && this.f2290y != null) {
            this.f2290y.mo711g();
        }
        if (bcVar.f2335i == null && !(z && (this.f2253j instanceof bj))) {
            if (bcVar.f2336j == null || bcVar.f2344r) {
                if (bcVar.f2336j == null) {
                    Context c0455e;
                    C0471p c0471p;
                    Context context = this.e;
                    if ((bcVar.f2327a == 0 || bcVar.f2327a == 108) && this.f2290y != null) {
                        Theme newTheme;
                        TypedValue typedValue = new TypedValue();
                        Theme theme = context.getTheme();
                        theme.resolveAttribute(C0394a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            newTheme = context.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            newTheme.resolveAttribute(C0394a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(C0394a.actionBarWidgetTheme, typedValue, true);
                            newTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (newTheme == null) {
                                newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                            }
                            newTheme.applyStyle(typedValue.resourceId, true);
                        }
                        Theme theme2 = newTheme;
                        if (theme2 != null) {
                            c0455e = new C0455e(context, 0);
                            c0455e.getTheme().setTo(theme2);
                            c0471p = new C0471p(c0455e);
                            c0471p.mo680a((C0408q) this);
                            bcVar.m2485a(c0471p);
                            if (bcVar.f2336j == null) {
                                return false;
                            }
                        }
                    }
                    c0455e = context;
                    c0471p = new C0471p(c0455e);
                    c0471p.mo680a((C0408q) this);
                    bcVar.m2485a(c0471p);
                    if (bcVar.f2336j == null) {
                        return false;
                    }
                }
                if (z && this.f2290y != null) {
                    if (this.f2291z == null) {
                        this.f2291z = new ay(this);
                    }
                    this.f2290y.mo705a(bcVar.f2336j, this.f2291z);
                }
                bcVar.f2336j.m2834d();
                if (callback.onCreatePanelMenu(bcVar.f2327a, bcVar.f2336j)) {
                    bcVar.f2344r = false;
                } else {
                    bcVar.m2485a(null);
                    if (!z || this.f2290y == null) {
                        return false;
                    }
                    this.f2290y.mo705a(null, this.f2291z);
                    return false;
                }
            }
            bcVar.f2336j.m2834d();
            if (bcVar.f2345s != null) {
                bcVar.f2336j.m2828b(bcVar.f2345s);
                bcVar.f2345s = null;
            }
            if (callback.onPreparePanel(0, bcVar.f2335i, bcVar.f2336j)) {
                boolean z2;
                if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bcVar.f2342p = z2;
                bcVar.f2336j.setQwertyMode(bcVar.f2342p);
                bcVar.f2336j.m2835e();
            } else {
                if (z && this.f2290y != null) {
                    this.f2290y.mo705a(null, this.f2291z);
                }
                bcVar.f2336j.m2835e();
                return false;
            }
        }
        bcVar.f2339m = true;
        bcVar.f2340n = false;
        this.f2281O = bcVar;
        return true;
    }

    final void m2424b(C0471p c0471p) {
        if (!this.f2279M) {
            this.f2279M = true;
            this.f2290y.mo712h();
            Callback callback = this.f2249f.getCallback();
            if (!(callback == null || this.f2261r)) {
                callback.onPanelClosed(108, c0471p);
            }
            this.f2279M = false;
        }
    }

    final void m2415a(bc bcVar, boolean z) {
        if (z && bcVar.f2327a == 0 && this.f2290y != null && this.f2290y.mo707c()) {
            m2424b(bcVar.f2336j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (!(windowManager == null || !bcVar.f2341o || bcVar.f2333g == null)) {
            windowManager.removeView(bcVar.f2333g);
            if (z) {
                m2413a(bcVar.f2327a, bcVar, null);
            }
        }
        bcVar.f2339m = false;
        bcVar.f2340n = false;
        bcVar.f2341o = false;
        bcVar.f2334h = null;
        bcVar.f2343q = true;
        if (this.f2281O == bcVar) {
            this.f2281O = null;
        }
    }

    final void m2413a(int i, bc bcVar, Menu menu) {
        if (menu == null) {
            if (bcVar == null && i >= 0 && i < this.f2280N.length) {
                bcVar = this.f2280N[i];
            }
            if (bcVar != null) {
                menu = bcVar.f2336j;
            }
        }
        if ((bcVar == null || bcVar.f2341o) && !this.f2261r) {
            this.g.onPanelClosed(i, menu);
        }
    }

    final bc m2409a(Menu menu) {
        bc[] bcVarArr = this.f2280N;
        int length = bcVarArr != null ? bcVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            bc bcVar = bcVarArr[i];
            if (bcVar != null && bcVar.f2336j == menu) {
                return bcVar;
            }
        }
        return null;
    }

    protected final bc m2433g(int i) {
        Object obj = this.f2280N;
        if (obj == null || obj.length <= i) {
            Object obj2 = new bc[(i + 1)];
            if (obj != null) {
                System.arraycopy(obj, 0, obj2, 0, obj.length);
            }
            this.f2280N = obj2;
            obj = obj2;
        }
        bc bcVar = obj[i];
        if (bcVar != null) {
            return bcVar;
        }
        bcVar = new bc(i);
        obj[i] = bcVar;
        return bcVar;
    }

    private final boolean m2404a(bc bcVar, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((bcVar.f2339m || m2405b(bcVar, keyEvent)) && bcVar.f2336j != null) {
            return bcVar.f2336j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private final void mo545f(int i) {
        this.f2284R |= 1 << i;
        if (!this.f2283Q) {
            ai.m1830a(this.f.getDecorView(), this.f2285S);
            this.f2283Q = true;
        }
    }

    final void m2436h(int i) {
        bc g = m2433g(i);
        if (g.f2336j != null) {
            Bundle bundle = new Bundle();
            g.f2336j.m2820a(bundle);
            if (bundle.size() > 0) {
                g.f2345s = bundle;
            }
            g.f2336j.m2834d();
            g.f2336j.clear();
        }
        g.f2344r = true;
        g.f2343q = true;
        if ((i == 108 || i == 0) && this.f2290y != null) {
            g = m2433g(0);
            if (g != null) {
                g.f2339m = false;
                m2405b(g, null);
            }
        }
    }

    final int m2437i(int i) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        if (this.f2269C == null || !(this.f2269C.getLayoutParams() instanceof MarginLayoutParams)) {
            i2 = 0;
        } else {
            int i5;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f2269C.getLayoutParams();
            if (this.f2269C.isShown()) {
                if (this.f2287U == null) {
                    this.f2287U = new Rect();
                    this.f2288V = new Rect();
                }
                Rect rect = this.f2287U;
                Rect rect2 = this.f2288V;
                rect.set(0, i, 0, 0);
                id.m3868a(this.f2274H, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f2276J == null) {
                        this.f2276J = new View(this.e);
                        this.f2276J.setBackgroundColor(this.e.getResources().getColor(C0396c.abc_input_method_navigation_guard));
                        this.f2274H.addView(this.f2276J, -1, new LayoutParams(-1, i));
                        i5 = 1;
                    } else {
                        LayoutParams layoutParams = this.f2276J.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f2276J.setLayoutParams(layoutParams);
                        }
                        i5 = 1;
                    }
                } else {
                    i5 = 0;
                }
                if (this.f2276J == null) {
                    i3 = 0;
                }
                if (!(this.n || i3 == 0)) {
                    i = 0;
                }
                int i6 = i5;
                i5 = i3;
                i3 = i6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                i5 = 0;
            } else {
                i3 = 0;
                i5 = 0;
            }
            if (i3 != 0) {
                this.f2269C.setLayoutParams(marginLayoutParams);
            }
            i2 = i5;
        }
        if (this.f2276J != null) {
            View view = this.f2276J;
            if (i2 == 0) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        return i;
    }

    private final void m2408s() {
        if (this.f2273G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}
