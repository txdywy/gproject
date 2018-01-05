package android.support.v7.app;

import android.support.v7.view.C0407n;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

final class bo extends C0407n {
    public final /* synthetic */ bj f2377a;

    public bo(bj bjVar, Callback callback) {
        this.f2377a = bjVar;
        super(callback);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel && !this.f2377a.f2365b) {
            this.f2377a.f2364a.mo914m();
            this.f2377a.f2365b = true;
        }
        return onPreparePanel;
    }

    public final View onCreatePanelView(int i) {
        if (i == 0) {
            return new View(this.f2377a.f2364a.mo893b());
        }
        return super.onCreatePanelView(i);
    }
}
