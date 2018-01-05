package android.support.v7.app;

import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ag;
import android.view.Window.Callback;

final class ay implements ag {
    public final /* synthetic */ aq f2313a;

    ay(aq aqVar) {
        this.f2313a = aqVar;
    }

    public final boolean mo554a(C0471p c0471p) {
        Callback callback = this.f2313a.f2249f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, c0471p);
        }
        return true;
    }

    public final void mo553a(C0471p c0471p, boolean z) {
        this.f2313a.m2424b(c0471p);
    }
}
