package android.support.v7.app;

import android.support.v7.view.C0407n;
import android.support.v7.view.menu.C0471p;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

class ag extends C0407n {
    public final /* synthetic */ ad f2265a;

    ag(ad adVar, Callback callback) {
        this.f2265a = adVar;
        super(callback);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f2265a.mo530a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f2265a.mo528a(keyEvent.getKeyCode(), keyEvent);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C0471p)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public void onContentChanged() {
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        C0471p c0471p = menu instanceof C0471p ? (C0471p) menu : null;
        if (i == 0 && c0471p == null) {
            return false;
        }
        if (c0471p != null) {
            c0471p.f2739z = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (c0471p == null) {
            return onPreparePanel;
        }
        c0471p.f2739z = false;
        return onPreparePanel;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f2265a.mo538e(i);
        return true;
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.f2265a.mo537d(i);
    }
}
