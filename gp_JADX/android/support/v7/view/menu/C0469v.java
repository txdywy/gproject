package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.p032d.p033a.C0284b;
import android.support.v4.view.C0350g;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class C0469v extends C0468e implements MenuItem {
    public Method f2674e;

    C0469v(Context context, C0284b c0284b) {
        super(context, c0284b);
    }

    public int getItemId() {
        return ((C0284b) this.d).getItemId();
    }

    public int getGroupId() {
        return ((C0284b) this.d).getGroupId();
    }

    public int getOrder() {
        return ((C0284b) this.d).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0284b) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0284b) this.d).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((C0284b) this.d).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0284b) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((C0284b) this.d).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0284b) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0284b) this.d).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((C0284b) this.d).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((C0284b) this.d).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((C0284b) this.d).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0284b) this.d).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((C0284b) this.d).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0284b) this.d).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((C0284b) this.d).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((C0284b) this.d).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((C0284b) this.d).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0284b) this.d).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((C0284b) this.d).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((C0284b) this.d).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((C0284b) this.d).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((C0284b) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((C0284b) this.d).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((C0284b) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((C0284b) this.d).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((C0284b) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((C0284b) this.d).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((C0284b) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((C0284b) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((C0284b) this.d).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return m2748a(((C0284b) this.d).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0284b) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0489z(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0284b) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((C0284b) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0284b) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0487x(view);
        }
        ((C0284b) this.d).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0284b) this.d).setActionView(i);
        View actionView = ((C0284b) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0284b) this.d).setActionView(new C0487x(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((C0284b) this.d).getActionView();
        if (actionView instanceof C0487x) {
            return (View) ((C0487x) actionView).f2853a;
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0284b) this.d).mo627a(actionProvider != null ? mo650a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        C0350g a = ((C0284b) this.d).mo629a();
        if (a instanceof C0470w) {
            return ((C0470w) a).f2675b;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((C0284b) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((C0284b) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((C0284b) this.d).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0284b) this.d).setOnActionExpandListener(onActionExpandListener != null ? new C0488y(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((C0284b) this.d).mo628a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((C0284b) this.d).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((C0284b) this.d).mo630b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((C0284b) this.d).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((C0284b) this.d).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((C0284b) this.d).getIconTintList();
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((C0284b) this.d).setIconTintMode(mode);
        return this;
    }

    public Mode getIconTintMode() {
        return ((C0284b) this.d).getIconTintMode();
    }

    C0470w mo650a(ActionProvider actionProvider) {
        return new C0470w(this, actionProvider);
    }
}
