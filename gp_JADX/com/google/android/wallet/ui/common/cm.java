package com.google.android.wallet.ui.common;

import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

final class cm implements Runnable {
    public final /* synthetic */ InputMethodManager f33645a;
    public final /* synthetic */ TextView f33646b;

    cm(InputMethodManager inputMethodManager, TextView textView) {
        this.f33645a = inputMethodManager;
        this.f33646b = textView;
    }

    public final void run() {
        this.f33645a.showSoftInput(this.f33646b, 1);
    }
}
