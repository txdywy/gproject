package android.support.v7.widget;

final class eh implements Runnable {
    public final /* synthetic */ RecyclerView f3429a;

    eh(RecyclerView recyclerView) {
        this.f3429a = recyclerView;
    }

    public final void run() {
        if (this.f3429a.f512T != null) {
            this.f3429a.f512T.runPendingAnimations();
        }
        this.f3429a.au = false;
    }
}
