package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class C0476h implements OnGlobalLayoutListener {
    public final /* synthetic */ C0475g f2786a;

    C0476h(C0475g c0475g) {
        this.f2786a = c0475g;
    }

    public final void onGlobalLayout() {
        if (this.f2786a.mo677d() && this.f2786a.f2767h.size() > 0 && !((C0480l) this.f2786a.f2767h.get(0)).f2793a.f3152J) {
            View view = this.f2786a.f2774o;
            if (view == null || !view.isShown()) {
                this.f2786a.mo674c();
                return;
            }
            for (C0480l c0480l : this.f2786a.f2767h) {
                c0480l.f2793a.mo671b();
            }
        }
    }
}
