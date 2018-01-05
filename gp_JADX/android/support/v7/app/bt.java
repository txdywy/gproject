package android.support.v7.app;

import android.support.v4.view.ai;
import android.support.v4.view.by;
import android.view.View;

final class bt extends by {
    public final /* synthetic */ bs f2417a;

    bt(bs bsVar) {
        this.f2417a = bsVar;
    }

    public final void mo441b(View view) {
        if (this.f2417a.f2409s && this.f2417a.f2399i != null) {
            this.f2417a.f2399i.setTranslationY(0.0f);
            this.f2417a.f2396f.setTranslationY(0.0f);
        }
        this.f2417a.f2396f.setVisibility(8);
        this.f2417a.f2396f.setTransitioning(false);
        this.f2417a.f2414x = null;
        bs bsVar = this.f2417a;
        if (bsVar.f2404n != null) {
            bsVar.f2404n.mo555a(bsVar.f2403m);
            bsVar.f2403m = null;
            bsVar.f2404n = null;
        }
        if (this.f2417a.f2395e != null) {
            ai.f1848a.mo396h(this.f2417a.f2395e);
        }
    }
}
