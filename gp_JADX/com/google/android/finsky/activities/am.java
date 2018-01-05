package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class am implements OnShowListener {
    public final /* synthetic */ EditText f6452a;
    public final /* synthetic */ C1033t f6453b;

    am(C1033t c1033t, EditText editText) {
        this.f6453b = c1033t;
        this.f6452a = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f6452a.requestFocus()) {
            ((InputMethodManager) this.f6453b.getSystemService("input_method")).showSoftInput(this.f6452a, 0);
        }
    }
}
