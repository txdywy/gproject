package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v4.view.bx;
import android.support.v4.view.bz;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.support.v7.p040a.C0403j;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.support.v7.view.C0453a;
import android.support.v7.view.C0462l;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.C0411i;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bw;
import android.support.v7.widget.fz;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class bs extends C0404a implements C0411i {
    public static final Interpolator f2388a = new AccelerateInterpolator();
    public static final Interpolator f2389b = new DecelerateInterpolator();
    public final bx f2390A = new bt(this);
    public final bx f2391B = new bu(this);
    public final bz f2392C = new bv(this);
    public Context f2393c;
    public Context f2394d;
    public ActionBarOverlayLayout f2395e;
    public ActionBarContainer f2396f;
    public bw f2397g;
    public ActionBarContextView f2398h;
    public View f2399i;
    public fz f2400j;
    public boolean f2401k;
    public bw f2402l;
    public C0412b f2403m;
    public C0409c f2404n;
    public boolean f2405o;
    public ArrayList f2406p = new ArrayList();
    public boolean f2407q;
    public int f2408r = 0;
    public boolean f2409s = true;
    public boolean f2410t;
    public boolean f2411u;
    public boolean f2412v;
    public boolean f2413w = true;
    public C0462l f2414x;
    public boolean f2415y;
    public boolean f2416z;

    public bs(Activity activity, boolean z) {
        ArrayList arrayList = new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m2541a(decorView);
        if (!z) {
            this.f2399i = decorView.findViewById(16908290);
        }
    }

    public bs(Dialog dialog) {
        ArrayList arrayList = new ArrayList();
        m2541a(dialog.getWindow().getDecorView());
    }

    private final void m2541a(View view) {
        bw bwVar;
        this.f2395e = (ActionBarOverlayLayout) view.findViewById(C0399f.decor_content_parent);
        if (this.f2395e != null) {
            this.f2395e.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C0399f.action_bar);
        if (findViewById instanceof bw) {
            bwVar = (bw) findViewById;
        } else if (findViewById instanceof Toolbar) {
            bwVar = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException(new StringBuilder("Can't make a decor toolbar out of ").append(findViewById).toString() != null ? findViewById.getClass().getSimpleName() : "null");
        }
        this.f2397g = bwVar;
        this.f2398h = (ActionBarContextView) view.findViewById(C0399f.action_context_bar);
        this.f2396f = (ActionBarContainer) view.findViewById(C0399f.action_bar_container);
        if (this.f2397g == null || this.f2398h == null || this.f2396f == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2393c = this.f2397g.mo893b();
        if ((this.f2397g.mo916o() & 4) != 0) {
            this.f2401k = true;
        }
        C0453a a = C0453a.m2684a(this.f2393c);
        int i = a.f2554a.getApplicationInfo().targetSdkVersion;
        mo581f();
        m2543g(a.m2686b());
        TypedArray obtainStyledAttributes = this.f2393c.obtainStyledAttributes(null, C0403j.ActionBar, C0394a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0403j.ActionBar_hideOnContentScroll, false)) {
            mo593h();
        }
        i = obtainStyledAttributes.getDimensionPixelSize(C0403j.ActionBar_elevation, 0);
        if (i != 0) {
            mo560a((float) i);
        }
        obtainStyledAttributes.recycle();
    }

    public final void mo560a(float f) {
        ai.m1851g(this.f2396f, f);
    }

    public final void mo594i() {
        m2543g(C0453a.m2684a(this.f2393c).m2686b());
    }

    private final void m2543g(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        this.f2407q = z;
        if (this.f2407q) {
            this.f2396f.setTabContainer(null);
            this.f2397g.mo888a(this.f2400j);
        } else {
            this.f2397g.mo888a(null);
            this.f2396f.setTabContainer(this.f2400j);
        }
        if (this.f2397g.mo918q() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2400j != null) {
            if (z2) {
                this.f2400j.setVisibility(0);
                if (this.f2395e != null) {
                    ai.f1848a.mo396h(this.f2395e);
                }
            } else {
                this.f2400j.setVisibility(8);
            }
        }
        bw bwVar = this.f2397g;
        if (this.f2407q || !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        bwVar.mo892a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2395e;
        if (this.f2407q || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z4);
    }

    public final void mo591c(int i) {
        this.f2408r = i;
    }

    public final void mo577c(boolean z) {
        this.f2415y = z;
        if (!z && this.f2414x != null) {
            this.f2414x.m2721b();
        }
    }

    public final void mo564a(C0413c c0413c) {
        this.f2406p.add(c0413c);
    }

    public final void mo579d(boolean z) {
        if (z != this.f2405o) {
            this.f2405o = z;
            int size = this.f2406p.size();
            for (int i = 0; i < size; i++) {
                ((C0413c) this.f2406p.get(i)).mo991a(z);
            }
        }
    }

    public final void mo559a() {
        mo562a(2, 2);
    }

    public final void mo566a(boolean z) {
        mo562a(z ? 4 : 0, 4);
    }

    public final void mo581f() {
        this.f2397g.mo917p();
    }

    public final void mo565a(CharSequence charSequence) {
        this.f2397g.mo896b(charSequence);
    }

    public final void mo576c(CharSequence charSequence) {
        this.f2397g.mo891a(charSequence);
    }

    public final void mo572b(CharSequence charSequence) {
        this.f2397g.mo899c(charSequence);
    }

    public final void mo562a(int i, int i2) {
        int o = this.f2397g.mo916o();
        if ((i2 & 4) != 0) {
            this.f2401k = true;
        }
        this.f2397g.mo897c((o & (i2 ^ -1)) | (i & i2));
    }

    public final void mo571b(Drawable drawable) {
        this.f2396f.setPrimaryBackground(drawable);
    }

    public final int mo569b() {
        return this.f2397g.mo916o();
    }

    public final C0412b mo590a(C0409c c0409c) {
        if (this.f2402l != null) {
            this.f2402l.mo608c();
        }
        this.f2395e.setHideOnContentScrollEnabled(false);
        this.f2398h.m2941b();
        C0412b bwVar = new bw(this, this.f2398h.getContext(), c0409c);
        if (!bwVar.m2608e()) {
            return null;
        }
        this.f2402l = bwVar;
        bwVar.mo609d();
        this.f2398h.m2939a(bwVar);
        m2570f(true);
        this.f2398h.sendAccessibilityEvent(32);
        return bwVar;
    }

    public final int mo574c() {
        return this.f2396f.getHeight();
    }

    public final void mo592e(boolean z) {
        this.f2409s = z;
    }

    public final void mo578d() {
        if (this.f2410t) {
            this.f2410t = false;
            m2544h(false);
        }
    }

    public final void mo595o() {
        if (this.f2411u) {
            this.f2411u = false;
            m2544h(true);
        }
    }

    public final void mo580e() {
        if (!this.f2410t) {
            this.f2410t = true;
            m2544h(false);
        }
    }

    public final void mo596p() {
        if (!this.f2411u) {
            this.f2411u = true;
            m2544h(true);
        }
    }

    public final void mo593h() {
        if (this.f2395e.f2894h) {
            this.f2416z = true;
            this.f2395e.setHideOnContentScrollEnabled(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    static boolean m2542a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    private final void m2544h(boolean z) {
        float f;
        C0462l c0462l;
        bt b;
        if (m2542a(this.f2410t, this.f2411u, this.f2412v)) {
            if (!this.f2413w) {
                this.f2413w = true;
                if (this.f2414x != null) {
                    this.f2414x.m2721b();
                }
                this.f2396f.setVisibility(0);
                if (this.f2408r == 0 && (this.f2415y || z)) {
                    this.f2396f.setTranslationY(0.0f);
                    f = (float) (-this.f2396f.getHeight());
                    if (z) {
                        int[] iArr = new int[]{0, 0};
                        this.f2396f.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f2396f.setTranslationY(f);
                    c0462l = new C0462l();
                    b = ai.m1852h(this.f2396f).m1999b(0.0f);
                    b.m1996a(this.f2392C);
                    c0462l.m2717a(b);
                    if (this.f2409s && this.f2399i != null) {
                        this.f2399i.setTranslationY(f);
                        c0462l.m2717a(ai.m1852h(this.f2399i).m1999b(0.0f));
                    }
                    c0462l.m2719a(f2389b);
                    c0462l.m2722c();
                    c0462l.m2718a(this.f2391B);
                    this.f2414x = c0462l;
                    c0462l.m2720a();
                } else {
                    this.f2396f.setAlpha(1.0f);
                    this.f2396f.setTranslationY(0.0f);
                    if (this.f2409s && this.f2399i != null) {
                        this.f2399i.setTranslationY(0.0f);
                    }
                    this.f2391B.mo441b(null);
                }
                if (this.f2395e != null) {
                    ai.f1848a.mo396h(this.f2395e);
                }
            }
        } else if (this.f2413w) {
            this.f2413w = false;
            if (this.f2414x != null) {
                this.f2414x.m2721b();
            }
            if (this.f2408r == 0 && (this.f2415y || z)) {
                this.f2396f.setAlpha(1.0f);
                this.f2396f.setTransitioning(true);
                c0462l = new C0462l();
                f = (float) (-this.f2396f.getHeight());
                if (z) {
                    int[] iArr2 = new int[]{0, 0};
                    this.f2396f.getLocationInWindow(iArr2);
                    f -= (float) iArr2[1];
                }
                b = ai.m1852h(this.f2396f).m1999b(f);
                b.m1996a(this.f2392C);
                c0462l.m2717a(b);
                if (this.f2409s && this.f2399i != null) {
                    c0462l.m2717a(ai.m1852h(this.f2399i).m1999b(f));
                }
                c0462l.m2719a(f2388a);
                c0462l.m2722c();
                c0462l.m2718a(this.f2390A);
                this.f2414x = c0462l;
                c0462l.m2720a();
                return;
            }
            this.f2390A.mo441b(null);
        }
    }

    public final void m2570f(boolean z) {
        if (z) {
            if (!this.f2412v) {
                this.f2412v = true;
                if (this.f2395e != null) {
                    this.f2395e.setShowingForActionMode(true);
                }
                m2544h(false);
            }
        } else if (this.f2412v) {
            this.f2412v = false;
            if (this.f2395e != null) {
                this.f2395e.setShowingForActionMode(false);
            }
            m2544h(false);
        }
        if (ai.f1848a.mo409s(this.f2396f)) {
            bt a;
            bt a2;
            long duration;
            if (z) {
                a = this.f2397g.mo883a(4, 100);
                a2 = this.f2398h.mo696a(0, 200);
            } else {
                a2 = this.f2397g.mo883a(0, 200);
                a = this.f2398h.mo696a(8, 100);
            }
            C0462l c0462l = new C0462l();
            c0462l.f2612a.add(a);
            View view = (View) a.f1883a.get();
            if (view != null) {
                duration = view.animate().getDuration();
            } else {
                duration = 0;
            }
            view = (View) a2.f1883a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            c0462l.f2612a.add(a2);
            c0462l.m2720a();
        } else if (z) {
            this.f2397g.mo907f(4);
            this.f2398h.setVisibility(0);
        } else {
            this.f2397g.mo907f(0);
            this.f2398h.setVisibility(8);
        }
    }

    public final Context mo582g() {
        if (this.f2394d == null) {
            TypedValue typedValue = new TypedValue();
            this.f2393c.getTheme().resolveAttribute(C0394a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2394d = new ContextThemeWrapper(this.f2393c, i);
            } else {
                this.f2394d = this.f2393c;
            }
        }
        return this.f2394d;
    }

    public final void mo575c(Drawable drawable) {
        this.f2397g.mo898c(drawable);
    }

    public final void mo561a(int i) {
        this.f2397g.mo902d(i);
    }

    public final void mo570b(int i) {
        this.f2397g.mo905e(i);
    }

    public final void mo597q() {
        if (this.f2414x != null) {
            this.f2414x.m2721b();
            this.f2414x = null;
        }
    }

    public final void mo598r() {
    }

    public final boolean mo586m() {
        if (this.f2397g == null || !this.f2397g.mo900c()) {
            return false;
        }
        this.f2397g.mo901d();
        return true;
    }

    public final void mo563a(Drawable drawable) {
        this.f2397g.mo895b(drawable);
    }

    public final void mo573b(boolean z) {
        if (!this.f2401k) {
            mo566a(z);
        }
    }

    public final boolean mo567a(int i, KeyEvent keyEvent) {
        if (this.f2402l == null) {
            return false;
        }
        Menu b = this.f2402l.mo605b();
        if (b == null) {
            return false;
        }
        boolean z;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
            z = true;
        } else {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }
}
