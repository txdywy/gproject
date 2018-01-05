package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class com.google.android.finsky.activities.av implements DialogInterface$OnShowListener
{

    public final EditText a;
    public final com.google.android.finsky.activities.t b;

    av(com.google.android.finsky.activities.t p0, EditText p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onShow(DialogInterface p0) {
        if (this.a.requestFocus())
            ((InputMethodManager)this.b.getSystemService("input_method")).showSoftInput(this.a, 0);
    }

}
