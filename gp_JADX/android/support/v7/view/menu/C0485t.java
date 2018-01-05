package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.view.C0350g;
import android.support.v7.p041b.p042a.C0436b;
import android.support.v7.widget.eq;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;

public final class C0485t implements C0284b {
    public static String f2817F;
    public static String f2818G;
    public static String f2819H;
    public static String f2820I;
    public View f2821A;
    public C0350g f2822B;
    public OnActionExpandListener f2823C;
    public boolean f2824D = false;
    public ContextMenuInfo f2825E;
    public final int f2826a;
    public final int f2827b;
    public final int f2828c;
    public final int f2829d;
    public CharSequence f2830e;
    public CharSequence f2831f;
    public Intent f2832g;
    public char f2833h;
    public int f2834i = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public char f2835j;
    public int f2836k = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public Drawable f2837l;
    public int f2838m = 0;
    public C0471p f2839n;
    public ap f2840o;
    public Runnable f2841p;
    public OnMenuItemClickListener f2842q;
    public CharSequence f2843r;
    public CharSequence f2844s;
    public ColorStateList f2845t = null;
    public Mode f2846u = null;
    public boolean f2847v = false;
    public boolean f2848w = false;
    public boolean f2849x = false;
    public int f2850y = 16;
    public int f2851z = 0;

    C0485t(C0471p c0471p, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f2839n = c0471p;
        this.f2826a = i2;
        this.f2827b = i;
        this.f2828c = i3;
        this.f2829d = i4;
        this.f2830e = charSequence;
        this.f2851z = i5;
    }

    public final boolean m2916b() {
        if ((this.f2842q != null && this.f2842q.onMenuItemClick(this)) || this.f2839n.mo681a(this.f2839n, (MenuItem) this)) {
            return true;
        }
        if (this.f2841p != null) {
            this.f2841p.run();
            return true;
        }
        if (this.f2832g != null) {
            try {
                this.f2839n.f2715b.startActivity(this.f2832g);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f2822B == null || !this.f2822B.mo653d()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.f2850y & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f2850y |= 16;
        } else {
            this.f2850y &= -17;
        }
        this.f2839n.m2830b(false);
        return this;
    }

    public final int getGroupId() {
        return this.f2827b;
    }

    @CapturedViewProperty
    public final int getItemId() {
        return this.f2826a;
    }

    public final int getOrder() {
        return this.f2828c;
    }

    public final Intent getIntent() {
        return this.f2832g;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f2832g = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.f2835j;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f2835j != c) {
            this.f2835j = Character.toLowerCase(c);
            this.f2839n.m2830b(false);
        }
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (!(this.f2835j == c && this.f2836k == i)) {
            this.f2835j = Character.toLowerCase(c);
            this.f2836k = KeyEvent.normalizeMetaState(i);
            this.f2839n.m2830b(false);
        }
        return this;
    }

    public final int getAlphabeticModifiers() {
        return this.f2836k;
    }

    public final char getNumericShortcut() {
        return this.f2833h;
    }

    public final int getNumericModifiers() {
        return this.f2834i;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f2833h != c) {
            this.f2833h = c;
            this.f2839n.m2830b(false);
        }
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (!(this.f2833h == c && this.f2834i == i)) {
            this.f2833h = c;
            this.f2834i = KeyEvent.normalizeMetaState(i);
            this.f2839n.m2830b(false);
        }
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f2833h = c;
        this.f2835j = Character.toLowerCase(c2);
        this.f2839n.m2830b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2833h = c;
        this.f2834i = KeyEvent.normalizeMetaState(i);
        this.f2835j = Character.toLowerCase(c2);
        this.f2836k = KeyEvent.normalizeMetaState(i2);
        this.f2839n.m2830b(false);
        return this;
    }

    final char m2918c() {
        return this.f2839n.mo683b() ? this.f2835j : this.f2833h;
    }

    final boolean m2921d() {
        return this.f2839n.mo685c() && m2918c() != '\u0000';
    }

    public final SubMenu getSubMenu() {
        return this.f2840o;
    }

    public final boolean hasSubMenu() {
        return this.f2840o != null;
    }

    public final void m2913a(ap apVar) {
        this.f2840o = apVar;
        apVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f2830e;
    }

    final CharSequence m2912a(ai aiVar) {
        if (aiVar == null || !aiVar.mo59a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2830e = charSequence;
        this.f2839n.m2830b(false);
        if (this.f2840o != null) {
            this.f2840o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle(this.f2839n.f2715b.getString(i));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2831f != null ? this.f2831f : this.f2830e;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2831f = charSequence;
        this.f2839n.m2830b(false);
        return this;
    }

    public final Drawable getIcon() {
        if (this.f2837l != null) {
            return m2907a(this.f2837l);
        }
        if (this.f2838m == 0) {
            return null;
        }
        Drawable b = C0436b.m2650b(this.f2839n.f2715b, this.f2838m);
        this.f2838m = 0;
        this.f2837l = b;
        return m2907a(b);
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f2838m = 0;
        this.f2837l = drawable;
        this.f2849x = true;
        this.f2839n.m2830b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f2837l = null;
        this.f2838m = i;
        this.f2849x = true;
        this.f2839n.m2830b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2845t = colorStateList;
        this.f2847v = true;
        this.f2849x = true;
        this.f2839n.m2830b(false);
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.f2845t;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f2846u = mode;
        this.f2848w = true;
        this.f2849x = true;
        this.f2839n.m2830b(false);
        return this;
    }

    public final Mode getIconTintMode() {
        return this.f2846u;
    }

    private final Drawable m2907a(Drawable drawable) {
        if (drawable != null && this.f2849x && (this.f2847v || this.f2848w)) {
            drawable = C0259a.m1526e(drawable).mutate();
            if (this.f2847v) {
                C0259a.m1516a(drawable, this.f2845t);
            }
            if (this.f2848w) {
                C0259a.m1519a(drawable, this.f2846u);
            }
            this.f2849x = false;
        }
        return drawable;
    }

    public final boolean isCheckable() {
        return (this.f2850y & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z) {
        int i;
        int i2 = this.f2850y;
        int i3 = this.f2850y & -2;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        this.f2850y = i | i3;
        if (i2 != this.f2850y) {
            this.f2839n.m2830b(false);
        }
        return this;
    }

    public final void m2914a(boolean z) {
        this.f2850y = (z ? 4 : 0) | (this.f2850y & -5);
    }

    public final boolean m2922e() {
        return (this.f2850y & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.f2850y & 2) == 2;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f2850y & 4) != 0) {
            C0471p c0471p = this.f2839n;
            int groupId = getGroupId();
            int size = c0471p.f2720g.size();
            c0471p.m2834d();
            for (int i = 0; i < size; i++) {
                C0485t c0485t = (C0485t) c0471p.f2720g.get(i);
                if (c0485t.getGroupId() == groupId && c0485t.m2922e() && c0485t.isCheckable()) {
                    boolean z2;
                    if (c0485t == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c0485t.m2908e(z2);
                }
            }
            c0471p.m2835e();
        } else {
            m2908e(z);
        }
        return this;
    }

    private final void m2908e(boolean z) {
        int i;
        int i2 = this.f2850y;
        int i3 = this.f2850y & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f2850y = i | i3;
        if (i2 != this.f2850y) {
            this.f2839n.m2830b(false);
        }
    }

    public final boolean isVisible() {
        if (this.f2822B == null || !this.f2822B.mo657b()) {
            if ((this.f2850y & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.f2850y & 8) == 0 && this.f2822B.mo658c()) {
            return true;
        } else {
            return false;
        }
    }

    final boolean m2917b(boolean z) {
        int i = this.f2850y;
        this.f2850y = (z ? 0 : 8) | (this.f2850y & -9);
        if (i != this.f2850y) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z) {
        if (m2917b(z)) {
            this.f2839n.m2836f();
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f2842q = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        return this.f2830e != null ? this.f2830e.toString() : null;
    }

    public final ContextMenuInfo getMenuInfo() {
        return this.f2825E;
    }

    public final boolean m2923f() {
        return (this.f2850y & 32) == 32;
    }

    public final boolean m2924g() {
        return (this.f2851z & 1) == 1;
    }

    public final boolean m2925h() {
        return (this.f2851z & 2) == 2;
    }

    public final void m2919c(boolean z) {
        if (z) {
            this.f2850y |= 32;
        } else {
            this.f2850y &= -33;
        }
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f2851z = i;
                this.f2839n.m2837g();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final View getActionView() {
        if (this.f2821A != null) {
            return this.f2821A;
        }
        if (this.f2822B == null) {
            return null;
        }
        this.f2821A = this.f2822B.mo655a((MenuItem) this);
        return this.f2821A;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final C0350g mo629a() {
        return this.f2822B;
    }

    public final C0284b mo627a(C0350g c0350g) {
        if (this.f2822B != null) {
            this.f2822B.f1895a = null;
        }
        this.f2821A = null;
        this.f2822B = c0350g;
        this.f2839n.m2830b(true);
        if (this.f2822B != null) {
            this.f2822B.mo656a(new C0486u(this));
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!m2926i()) {
            return false;
        }
        if (this.f2823C == null || this.f2823C.onMenuItemActionExpand(this)) {
            return this.f2839n.mo682a(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.f2851z & 8) == 0) {
            return false;
        }
        if (this.f2821A == null) {
            return true;
        }
        if (this.f2823C == null || this.f2823C.onMenuItemActionCollapse(this)) {
            return this.f2839n.mo684b(this);
        }
        return false;
    }

    public final boolean m2926i() {
        if ((this.f2851z & 8) == 0) {
            return false;
        }
        if (this.f2821A == null && this.f2822B != null) {
            this.f2821A = this.f2822B.mo655a((MenuItem) this);
        }
        if (this.f2821A != null) {
            return true;
        }
        return false;
    }

    public final void m2920d(boolean z) {
        this.f2824D = z;
        this.f2839n.m2830b(false);
    }

    public final boolean isActionViewExpanded() {
        return this.f2824D;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f2823C = onActionExpandListener;
        return this;
    }

    public final C0284b mo628a(CharSequence charSequence) {
        this.f2843r = charSequence;
        this.f2839n.m2830b(false);
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f2843r;
    }

    public final C0284b mo630b(CharSequence charSequence) {
        this.f2844s = charSequence;
        this.f2839n.m2830b(false);
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.f2844s;
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f2839n.f2715b;
        setActionView(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        this.f2821A = view;
        this.f2822B = null;
        if (view != null && view.getId() == -1 && this.f2826a > 0) {
            view.setId(this.f2826a);
        }
        this.f2839n.m2837g();
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        return mo630b(charSequence);
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        return mo628a(charSequence);
    }
}
