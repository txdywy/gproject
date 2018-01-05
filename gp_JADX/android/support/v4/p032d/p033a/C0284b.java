package android.support.v4.p032d.p033a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.v4.view.C0350g;
import android.view.MenuItem;
import android.view.View;

public interface C0284b extends MenuItem {
    C0284b mo627a(C0350g c0350g);

    C0284b mo628a(CharSequence charSequence);

    C0350g mo629a();

    C0284b mo630b(CharSequence charSequence);

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
