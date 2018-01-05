package android.support.v7.app;

import android.support.v4.view.ai;
import android.support.v4.view.by;
import android.view.View;

final class ba extends by {
    public final /* synthetic */ az f2317a;

    ba(az azVar) {
        this.f2317a = azVar;
    }

    public final void mo441b(View view) {
        this.f2317a.f2315b.f2269C.setVisibility(8);
        if (this.f2317a.f2315b.f2270D != null) {
            this.f2317a.f2315b.f2270D.dismiss();
        } else if (this.f2317a.f2315b.f2269C.getParent() instanceof View) {
            ai.f1848a.mo396h((View) this.f2317a.f2315b.f2269C.getParent());
        }
        this.f2317a.f2315b.f2269C.removeAllViews();
        this.f2317a.f2315b.f2272F.m1995a(null);
        this.f2317a.f2315b.f2272F = null;
    }
}
