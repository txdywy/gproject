package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class af implements OnShowListener {
    public final /* synthetic */ EditText f6442a;
    public final /* synthetic */ C1033t f6443b;

    af(C1033t c1033t, EditText editText) {
        this.f6443b = c1033t;
        this.f6442a = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f6442a.requestFocus()) {
            ((InputMethodManager) this.f6443b.getSystemService("input_method")).showSoftInput(this.f6442a, 0);
        }
    }
}
