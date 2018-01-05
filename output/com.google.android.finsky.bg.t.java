package com.google.android.finsky.bg;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class com.google.android.finsky.bg.t implements Runnable
{

    public final InputMethodManager a;
    public final EditText b;

    t(InputMethodManager p0, EditText p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.showSoftInput(this.b, 1);
        this.b.requestFocus();
    }

}
