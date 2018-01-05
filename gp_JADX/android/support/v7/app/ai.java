package android.support.v7.app;

import android.view.Menu;
import android.view.Window.Callback;
import java.util.List;

final class ai extends ap {
    public final /* synthetic */ ah f2299b;

    ai(ah ahVar, Callback callback) {
        this.f2299b = ahVar;
        super(ahVar, callback);
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        bc g = this.f2299b.m2433g(0);
        if (g == null || g.f2336j == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, g.f2336j, i);
        }
    }
}
