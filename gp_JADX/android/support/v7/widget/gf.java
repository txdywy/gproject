package android.support.v7.widget;

import android.view.View;
import android.view.View.OnClickListener;

final class gf implements OnClickListener {
    public final /* synthetic */ SearchView f3506a;

    gf(SearchView searchView) {
        this.f3506a = searchView;
    }

    public final void onClick(View view) {
        if (view == this.f3506a.mSearchButton) {
            this.f3506a.onSearchClicked();
        } else if (view == this.f3506a.mCloseButton) {
            this.f3506a.onCloseClicked();
        } else if (view == this.f3506a.mGoButton) {
            this.f3506a.onSubmitQuery();
        } else if (view == this.f3506a.mVoiceButton) {
            this.f3506a.onVoiceClicked();
        } else if (view == this.f3506a.mSearchSrcTextView) {
            this.f3506a.forceSuggestionQuery();
        }
    }
}
