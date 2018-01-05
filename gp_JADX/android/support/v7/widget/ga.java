package android.support.v7.widget;

final class ga implements Runnable {
    public final /* synthetic */ SearchView f3501a;

    ga(SearchView searchView) {
        this.f3501a = searchView;
    }

    public final void run() {
        this.f3501a.updateFocusedState();
    }
}
