package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class av implements OnShowListener {
    public final /* synthetic */ EditText f6467a;
    public final /* synthetic */ C1033t f6468b;

    av(C1033t c1033t, EditText editText) {
        this.f6468b = c1033t;
        this.f6467a = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f6467a.requestFocus()) {
            ((InputMethodManager) this.f6468b.getSystemService("input_method")).showSoftInput(this.f6467a, 0);
        }
    }
}
