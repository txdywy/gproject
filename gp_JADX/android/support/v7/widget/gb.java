package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class gb implements TextWatcher {
    public final /* synthetic */ SearchView f3502a;

    gb(SearchView searchView) {
        this.f3502a = searchView;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3502a.onTextChanged(charSequence);
    }

    public final void afterTextChanged(Editable editable) {
    }
}
