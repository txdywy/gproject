package android.support.v7.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final class gd implements OnFocusChangeListener {
    public final /* synthetic */ SearchView f3504a;

    gd(SearchView searchView) {
        this.f3504a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (this.f3504a.mOnQueryTextFocusChangeListener != null) {
            this.f3504a.mOnQueryTextFocusChangeListener.onFocusChange(this.f3504a, z);
        }
    }
}
