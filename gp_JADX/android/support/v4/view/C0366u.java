package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

final class C0366u extends C0365v {
    C0366u() {
    }

    public final void mo452a(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public final void mo454b(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public final void mo449a(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public final void mo453b(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public final void mo450a(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public final void mo451a(MenuItem menuItem, Mode mode) {
        menuItem.setIconTintMode(mode);
    }
}
