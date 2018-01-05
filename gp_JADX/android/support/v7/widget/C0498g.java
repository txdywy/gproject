package android.support.v7.widget;

final class C0498g implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout f3500a;

    C0498g(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3500a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f3500a.m2954a();
        this.f3500a.f2909w = this.f3500a.f2890d.animate().translationY(0.0f).setListener(this.f3500a.f2910x);
    }
}
