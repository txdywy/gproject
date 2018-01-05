package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0401h;
import android.support.v7.p040a.C0403j;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.view.menu.C0408q;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.af;
import android.support.v7.view.menu.ag;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public final class hk implements bw {
    public Toolbar f3567a;
    public int f3568b;
    public View f3569c;
    public View f3570d;
    public Drawable f3571e;
    public Drawable f3572f;
    public Drawable f3573g;
    public boolean f3574h;
    public CharSequence f3575i;
    public CharSequence f3576j;
    public CharSequence f3577k;
    public Callback f3578l;
    public boolean f3579m;
    public C0502k f3580n;
    public int f3581o;
    public int f3582p;
    public Drawable f3583q;

    public hk(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0401h.abc_action_bar_up_description);
    }

    private hk(Toolbar toolbar, boolean z, int i) {
        this.f3581o = 0;
        this.f3582p = 0;
        this.f3567a = toolbar;
        this.f3575i = toolbar.getTitle();
        this.f3576j = toolbar.getSubtitle();
        this.f3574h = this.f3575i != null;
        this.f3573g = toolbar.getNavigationIcon();
        hc a = hc.m3769a(toolbar.getContext(), null, C0403j.ActionBar, C0394a.actionBarStyle, 0);
        this.f3583q = a.m3771a(C0403j.ActionBar_homeAsUpIndicator);
        int g;
        if (z) {
            Toolbar toolbar2;
            Context context;
            CharSequence c = a.m3776c(C0403j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo896b(c);
            }
            c = a.m3776c(C0403j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                mo899c(c);
            }
            Drawable a2 = a.m3771a(C0403j.ActionBar_logo);
            if (a2 != null) {
                mo895b(a2);
            }
            a2 = a.m3771a(C0403j.ActionBar_icon);
            if (a2 != null) {
                mo886a(a2);
            }
            if (this.f3573g == null && this.f3583q != null) {
                mo898c(this.f3583q);
            }
            mo897c(a.m3770a(C0403j.ActionBar_displayOptions, 0));
            g = a.m3783g(C0403j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                View inflate = LayoutInflater.from(this.f3567a.getContext()).inflate(g, this.f3567a, false);
                if (!(this.f3570d == null || (this.f3568b & 16) == 0)) {
                    this.f3567a.removeView(this.f3570d);
                }
                this.f3570d = inflate;
                if (!(inflate == null || (this.f3568b & 16) == 0)) {
                    this.f3567a.addView(this.f3570d);
                }
                mo897c(this.f3568b | 16);
            }
            g = a.m3781f(C0403j.ActionBar_height, 0);
            if (g > 0) {
                LayoutParams layoutParams = this.f3567a.getLayoutParams();
                layoutParams.height = g;
                this.f3567a.setLayoutParams(layoutParams);
            }
            g = a.m3777d(C0403j.ActionBar_contentInsetStart, -1);
            int d = a.m3777d(C0403j.ActionBar_contentInsetEnd, -1);
            if (g >= 0 || d >= 0) {
                Toolbar toolbar3 = this.f3567a;
                g = Math.max(g, 0);
                d = Math.max(d, 0);
                toolbar3.m3155g();
                toolbar3.f3062t.m3732a(g, d);
            }
            g = a.m3783g(C0403j.ActionBar_titleTextStyle, 0);
            if (g != 0) {
                toolbar2 = this.f3567a;
                context = this.f3567a.getContext();
                toolbar2.f3054l = g;
                if (toolbar2.f3044b != null) {
                    toolbar2.f3044b.setTextAppearance(context, g);
                }
            }
            g = a.m3783g(C0403j.ActionBar_subtitleTextStyle, 0);
            if (g != 0) {
                toolbar2 = this.f3567a;
                context = this.f3567a.getContext();
                toolbar2.f3055m = g;
                if (toolbar2.f3045c != null) {
                    toolbar2.f3045c.setTextAppearance(context, g);
                }
            }
            g = a.m3783g(C0403j.ActionBar_popupTheme, 0);
            if (g != 0) {
                this.f3567a.setPopupTheme(g);
            }
        } else {
            g = 11;
            if (this.f3567a.getNavigationIcon() != null) {
                g = 15;
                this.f3583q = this.f3567a.getNavigationIcon();
            }
            this.f3568b = g;
        }
        a.f3558b.recycle();
        if (i != this.f3582p) {
            this.f3582p = i;
            if (TextUtils.isEmpty(this.f3567a.getNavigationContentDescription())) {
                mo905e(this.f3582p);
            }
        }
        this.f3577k = this.f3567a.getNavigationContentDescription();
        this.f3567a.setNavigationOnClickListener(new hl(this));
    }

    public final ViewGroup mo884a() {
        return this.f3567a;
    }

    public final Context mo893b() {
        return this.f3567a.getContext();
    }

    public final boolean mo900c() {
        return this.f3567a.m3152d();
    }

    public final void mo901d() {
        this.f3567a.m3153e();
    }

    public final void mo890a(Callback callback) {
        this.f3578l = callback;
    }

    public final void mo891a(CharSequence charSequence) {
        if (!this.f3574h) {
            m3794d(charSequence);
        }
    }

    public final CharSequence mo904e() {
        return this.f3567a.getTitle();
    }

    public final void mo896b(CharSequence charSequence) {
        this.f3574h = true;
        m3794d(charSequence);
    }

    private final void m3794d(CharSequence charSequence) {
        this.f3575i = charSequence;
        if ((this.f3568b & 8) != 0) {
            this.f3567a.setTitle(charSequence);
        }
    }

    public final void mo899c(CharSequence charSequence) {
        this.f3576j = charSequence;
        if ((this.f3568b & 8) != 0) {
            this.f3567a.setSubtitle(charSequence);
        }
    }

    public final void mo906f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void mo908g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void mo885a(int i) {
        mo886a(i != 0 ? C0436b.m2650b(this.f3567a.getContext(), i) : null);
    }

    public final void mo886a(Drawable drawable) {
        this.f3571e = drawable;
        m3795t();
    }

    public final void mo894b(int i) {
        mo895b(i != 0 ? C0436b.m2650b(this.f3567a.getContext(), i) : null);
    }

    public final void mo895b(Drawable drawable) {
        this.f3572f = drawable;
        m3795t();
    }

    private final void m3795t() {
        Drawable drawable = null;
        if ((this.f3568b & 2) != 0) {
            drawable = (this.f3568b & 1) != 0 ? this.f3572f != null ? this.f3572f : this.f3571e : this.f3571e;
        }
        this.f3567a.setLogo(drawable);
    }

    public final boolean mo909h() {
        Toolbar toolbar = this.f3567a;
        return toolbar.getVisibility() == 0 && toolbar.f3043a != null && toolbar.f3043a.f2916d;
    }

    public final boolean mo910i() {
        return this.f3567a.m3150b();
    }

    public final boolean mo911j() {
        Toolbar toolbar = this.f3567a;
        if (toolbar.f3043a != null) {
            boolean z;
            ActionMenuView actionMenuView = toolbar.f3043a;
            if (actionMenuView.f2917e != null) {
                C0502k c0502k = actionMenuView.f2917e;
                if (c0502k.f3643z != null || c0502k.m3888g()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo912k() {
        return this.f3567a.m3151c();
    }

    public final boolean mo913l() {
        Toolbar toolbar = this.f3567a;
        if (toolbar.f3043a != null) {
            boolean z;
            ActionMenuView actionMenuView = toolbar.f3043a;
            if (actionMenuView.f2917e == null || !actionMenuView.f2917e.m3885d()) {
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

    public final void mo914m() {
        this.f3579m = true;
    }

    public final void mo889a(Menu menu, ag agVar) {
        if (this.f3580n == null) {
            this.f3580n = new C0502k(this.f3567a.getContext());
        }
        this.f3580n.f2756e = agVar;
        Toolbar toolbar = this.f3567a;
        C0471p c0471p = (C0471p) menu;
        af afVar = this.f3580n;
        if (c0471p != null || toolbar.f3043a != null) {
            toolbar.m3154f();
            C0471p c0471p2 = toolbar.f3043a.f2913a;
            if (c0471p2 != c0471p) {
                if (c0471p2 != null) {
                    c0471p2.m2829b(toolbar.f3037J);
                    c0471p2.m2829b(toolbar.f3038K);
                }
                if (toolbar.f3038K == null) {
                    toolbar.f3038K = new hg(toolbar);
                }
                afVar.f3637t = true;
                if (c0471p != null) {
                    c0471p.m2822a(afVar, toolbar.f3052j);
                    c0471p.m2822a(toolbar.f3038K, toolbar.f3052j);
                } else {
                    afVar.mo659a(toolbar.f3052j, null);
                    toolbar.f3038K.mo659a(toolbar.f3052j, null);
                    afVar.mo668a(true);
                    toolbar.f3038K.mo668a(true);
                }
                toolbar.f3043a.setPopupTheme(toolbar.f3053k);
                toolbar.f3043a.setPresenter(afVar);
                toolbar.f3037J = afVar;
            }
        }
    }

    public final void mo915n() {
        Toolbar toolbar = this.f3567a;
        if (toolbar.f3043a != null) {
            toolbar.f3043a.m2971b();
        }
    }

    public final int mo916o() {
        return this.f3568b;
    }

    public final void mo897c(int i) {
        int i2 = this.f3568b ^ i;
        this.f3568b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m3797v();
                }
                m3796u();
            }
            if ((i2 & 3) != 0) {
                m3795t();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f3567a.setTitle(this.f3575i);
                    this.f3567a.setSubtitle(this.f3576j);
                } else {
                    this.f3567a.setTitle(null);
                    this.f3567a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.f3570d != null) {
                if ((i & 16) != 0) {
                    this.f3567a.addView(this.f3570d);
                } else {
                    this.f3567a.removeView(this.f3570d);
                }
            }
        }
    }

    public final void mo888a(fz fzVar) {
        if (this.f3569c != null && this.f3569c.getParent() == this.f3567a) {
            this.f3567a.removeView(this.f3569c);
        }
        this.f3569c = fzVar;
        if (fzVar != null && this.f3581o == 2) {
            this.f3567a.addView(this.f3569c, 0);
            hh hhVar = (hh) this.f3569c.getLayoutParams();
            hhVar.width = -2;
            hhVar.height = -2;
            hhVar.a = 8388691;
            fzVar.setAllowCollapse(true);
        }
    }

    public final void mo892a(boolean z) {
        this.f3567a.setCollapsible(z);
    }

    public final void mo917p() {
    }

    public final int mo918q() {
        return this.f3581o;
    }

    public final bt mo883a(int i, long j) {
        return ai.m1852h(this.f3567a).m1993a(i == 0 ? 1.0f : 0.0f).m1994a(j).m1995a(new hm(this, i));
    }

    public final void mo898c(Drawable drawable) {
        this.f3573g = drawable;
        m3796u();
    }

    public final void mo902d(int i) {
        mo898c(i != 0 ? C0436b.m2650b(this.f3567a.getContext(), i) : null);
    }

    private final void m3796u() {
        if ((this.f3568b & 4) != 0) {
            this.f3567a.setNavigationIcon(this.f3573g != null ? this.f3573g : this.f3583q);
        } else {
            this.f3567a.setNavigationIcon(null);
        }
    }

    public final void mo905e(int i) {
        CharSequence charSequence;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = this.f3567a.getContext().getString(i);
        }
        this.f3577k = charSequence;
        m3797v();
    }

    private final void m3797v() {
        if ((this.f3568b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f3577k)) {
            this.f3567a.setNavigationContentDescription(this.f3582p);
        } else {
            this.f3567a.setNavigationContentDescription(this.f3577k);
        }
    }

    public final void mo903d(Drawable drawable) {
        ai.m1826a(this.f3567a, drawable);
    }

    public final int mo919r() {
        return this.f3567a.getHeight();
    }

    public final void mo907f(int i) {
        this.f3567a.setVisibility(i);
    }

    public final void mo887a(ag agVar, C0408q c0408q) {
        Toolbar toolbar = this.f3567a;
        toolbar.f3039L = agVar;
        toolbar.f3040M = c0408q;
        if (toolbar.f3043a != null) {
            toolbar.f3043a.m2968a(agVar, c0408q);
        }
    }

    public final Menu mo920s() {
        return this.f3567a.getMenu();
    }
}
