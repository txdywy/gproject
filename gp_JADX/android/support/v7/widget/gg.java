package android.support.v7.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class gg implements OnKeyListener {
    public final /* synthetic */ SearchView f3507a;

    gg(SearchView searchView) {
        this.f3507a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f3507a.mSearchable == null) {
            return false;
        }
        if (this.f3507a.mSearchSrcTextView.isPopupShowing() && this.f3507a.mSearchSrcTextView.getListSelection() != -1) {
            return this.f3507a.onSuggestionsKey(view, i, keyEvent);
        }
        if ((TextUtils.getTrimmedLength(this.f3507a.mSearchSrcTextView.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        this.f3507a.launchQuerySearch(0, null, this.f3507a.mSearchSrcTextView.getText().toString());
        return true;
    }
}
