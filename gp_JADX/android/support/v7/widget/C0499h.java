package android.support.v7.widget;

final class C0499h implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout f3551a;

    C0499h(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f3551a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f3551a.m2954a();
        this.f3551a.f2909w = this.f3551a.f2890d.animate().translationY((float) (-this.f3551a.f2890d.getHeight())).setListener(this.f3551a.f2910x);
    }
}
