package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.C0471p;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class dz extends C0491do implements dy {
    public static Method f3417a;
    public dy f3418c;

    public dz(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    final ck mo823a(Context context, boolean z) {
        ck eaVar = new ea(context, z);
        eaVar.setHoverListener(this);
        return eaVar;
    }

    public final void mo692b(C0471p c0471p, MenuItem menuItem) {
        if (this.f3418c != null) {
            this.f3418c.mo692b(c0471p, menuItem);
        }
    }

    public final void mo691a(C0471p c0471p, MenuItem menuItem) {
        if (this.f3418c != null) {
            this.f3418c.mo691a(c0471p, menuItem);
        }
    }

    static {
        try {
            f3417a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }
}
