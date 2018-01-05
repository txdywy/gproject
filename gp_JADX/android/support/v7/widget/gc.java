package android.support.v7.widget;

final class gc implements Runnable {
    public final /* synthetic */ SearchView f3503a;

    gc(SearchView searchView) {
        this.f3503a = searchView;
    }

    public final void run() {
        if (this.f3503a.mSuggestionsAdapter != null && (this.f3503a.mSuggestionsAdapter instanceof gu)) {
            this.f3503a.mSuggestionsAdapter.mo472a(null);
        }
    }
}
