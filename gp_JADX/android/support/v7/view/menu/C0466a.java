package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.view.C0350g;
import android.support.v7.widget.eq;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class C0466a implements C0284b {
    public final int f2651a;
    public final int f2652b;
    public final int f2653c;
    public CharSequence f2654d;
    public CharSequence f2655e;
    public Intent f2656f;
    public char f2657g;
    public int f2658h = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public char f2659i;
    public int f2660j = eq.FLAG_APPEARED_IN_PRE_LAYOUT;
    public Drawable f2661k;
    public Context f2662l;
    public CharSequence f2663m;
    public CharSequence f2664n;
    public ColorStateList f2665o = null;
    public Mode f2666p = null;
    public boolean f2667q = false;
    public boolean f2668r = false;
    public int f2669s = 16;

    public C0466a(Context context, CharSequence charSequence) {
        this.f2662l = context;
        this.f2651a = 16908332;
        this.f2652b = 0;
        this.f2653c = 0;
        this.f2654d = charSequence;
    }

    public final char getAlphabeticShortcut() {
        return this.f2659i;
    }

    public final int getAlphabeticModifiers() {
        return this.f2660j;
    }

    public final int getGroupId() {
        return this.f2652b;
    }

    public final Drawable getIcon() {
        return this.f2661k;
    }

    public final Intent getIntent() {
        return this.f2656f;
    }

    public final int getItemId() {
        return this.f2651a;
    }

    public final ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final char getNumericShortcut() {
        return this.f2657g;
    }

    public final int getNumericModifiers() {
        return this.f2658h;
    }

    public final int getOrder() {
        return this.f2653c;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f2654d;
    }

    public final CharSequence getTitleCondensed() {
        return this.f2655e != null ? this.f2655e : this.f2654d;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f2669s & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f2669s & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f2669s & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f2669s & 8) == 0;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        this.f2659i = Character.toLowerCase(c);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f2659i = Character.toLowerCase(c);
        this.f2660j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f2669s = (z ? 1 : 0) | (this.f2669s & -2);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f2669s = (z ? 2 : 0) | (this.f2669s & -3);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f2669s = (z ? 16 : 0) | (this.f2669s & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f2661k = drawable;
        m2742b();
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f2661k = C0216d.m1112a(this.f2662l, i);
        m2742b();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f2656f = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        this.f2657g = c;
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        this.f2657g = c;
        this.f2658h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f2657g = c;
        this.f2659i = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f2657g = c;
        this.f2658h = KeyEvent.normalizeMetaState(i);
        this.f2659i = Character.toLowerCase(c2);
        this.f2660j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2654d = charSequence;
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f2654d = this.f2662l.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2655e = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        this.f2669s = (z ? 0 : 8) | (this.f2669s & 8);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final View getActionView() {
        return null;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final C0350g mo629a() {
        return null;
    }

    public final C0284b mo627a(C0350g c0350g) {
        throw new UnsupportedOperationException();
    }

    public final boolean expandActionView() {
        return false;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final C0284b mo628a(CharSequence charSequence) {
        this.f2663m = charSequence;
        return this;
    }

    public final CharSequence getContentDescription() {
        return this.f2663m;
    }

    public final C0284b mo630b(CharSequence charSequence) {
        this.f2664n = charSequence;
        return this;
    }

    public final CharSequence getTooltipText() {
        return this.f2664n;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2665o = colorStateList;
        this.f2667q = true;
        m2742b();
        return this;
    }

    public final ColorStateList getIconTintList() {
        return this.f2665o;
    }

    public final MenuItem setIconTintMode(Mode mode) {
        this.f2666p = mode;
        this.f2668r = true;
        m2742b();
        return this;
    }

    public final Mode getIconTintMode() {
        return this.f2666p;
    }

    private final void m2742b() {
        if (this.f2661k == null) {
            return;
        }
        if (this.f2667q || this.f2668r) {
            this.f2661k = C0259a.m1526e(this.f2661k);
            this.f2661k = this.f2661k.mutate();
            if (this.f2667q) {
                C0259a.m1516a(this.f2661k, this.f2665o);
            }
            if (this.f2668r) {
                C0259a.m1519a(this.f2661k, this.f2666p);
            }
        }
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.f2664n = charSequence;
        return this;
    }

    public final /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.f2663m = charSequence;
        return this;
    }
}
