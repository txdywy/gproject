package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class az implements Runnable {
    public final /* synthetic */ View f10234a;

    az(View view) {
        this.f10234a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f10234a.getContext().getSystemService("input_method")).showSoftInput(this.f10234a, 1);
    }
}
