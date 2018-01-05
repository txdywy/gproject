package android.support.v7.app;

import android.support.v4.view.ai;
import android.support.v4.view.by;
import android.view.View;

final class ax extends by {
    public final /* synthetic */ aq f2312a;

    ax(aq aqVar) {
        this.f2312a = aqVar;
    }

    public final void mo440a(View view) {
        this.f2312a.f2269C.setVisibility(0);
        this.f2312a.f2269C.sendAccessibilityEvent(32);
        if (this.f2312a.f2269C.getParent() instanceof View) {
            ai.f1848a.mo396h((View) this.f2312a.f2269C.getParent());
        }
    }

    public final void mo441b(View view) {
        this.f2312a.f2269C.setAlpha(1.0f);
        this.f2312a.f2272F.m1995a(null);
        this.f2312a.f2272F = null;
    }
}
