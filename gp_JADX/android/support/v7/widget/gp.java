package android.support.v7.widget;

import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class gp implements Runnable {
    public final /* synthetic */ SearchAutoComplete f3514a;

    gp(SearchAutoComplete searchAutoComplete) {
        this.f3514a = searchAutoComplete;
    }

    public final void run() {
        View view = this.f3514a;
        if (view.f2984f) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            view.f2984f = false;
        }
    }
}
