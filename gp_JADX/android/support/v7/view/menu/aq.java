package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p032d.p033a.C0285c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class aq extends ak implements SubMenu {
    aq(Context context, C0285c c0285c) {
        super(context, c0285c);
    }

    public final SubMenu setHeaderTitle(int i) {
        ((C0285c) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((C0285c) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        ((C0285c) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((C0285c) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((C0285c) this.d).setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        ((C0285c) this.d).clearHeader();
    }

    public final SubMenu setIcon(int i) {
        ((C0285c) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((C0285c) this.d).setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return m2747a(((C0285c) this.d).getItem());
    }
}
