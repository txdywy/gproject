package com.google.android.finsky.layout;

import android.view.inputmethod.InputMethodManager;

final class ba implements Runnable {
    public final /* synthetic */ az f18511a;

    ba(az azVar) {
        this.f18511a = azVar;
    }

    public final void run() {
        ((InputMethodManager) this.f18511a.f18506a.getContext().getSystemService("input_method")).showSoftInput(this.f18511a.f18506a.e, 1);
    }
}
