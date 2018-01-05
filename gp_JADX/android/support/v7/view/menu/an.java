package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class an implements OnGlobalLayoutListener {
    public final /* synthetic */ am f2712a;

    an(am amVar) {
        this.f2712a = amVar;
    }

    public final void onGlobalLayout() {
        if (this.f2712a.mo677d() && !this.f2712a.f2699h.f3152J) {
            View view = this.f2712a.f2704m;
            if (view == null || !view.isShown()) {
                this.f2712a.mo674c();
            } else {
                this.f2712a.f2699h.mo671b();
            }
        }
    }
}
