package com.google.android.finsky.bg;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class C1619t implements Runnable {
    public final /* synthetic */ InputMethodManager f8535a;
    public final /* synthetic */ EditText f8536b;

    C1619t(InputMethodManager inputMethodManager, EditText editText) {
        this.f8535a = inputMethodManager;
        this.f8536b = editText;
    }

    public final void run() {
        this.f8535a.showSoftInput(this.f8536b, 1);
        this.f8536b.requestFocus();
    }
}
