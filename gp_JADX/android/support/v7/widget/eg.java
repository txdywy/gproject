package android.support.v7.widget;

final class eg implements Runnable {
    public final /* synthetic */ RecyclerView f3428a;

    eg(RecyclerView recyclerView) {
        this.f3428a = recyclerView;
    }

    public final void run() {
        if (this.f3428a.f496D && !this.f3428a.isLayoutRequested()) {
            if (!this.f3428a.f493A) {
                this.f3428a.requestLayout();
            } else if (this.f3428a.f499G) {
                this.f3428a.f498F = true;
            } else {
                this.f3428a.m295d();
            }
        }
    }
}
