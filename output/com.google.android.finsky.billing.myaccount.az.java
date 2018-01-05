package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class com.google.android.finsky.billing.myaccount.az implements Runnable
{

    public final View a;

    az(View p0) {
        this.a = p0;
    }

    public final void run() {
        ((InputMethodManager)this.a.getContext().getSystemService("input_method")).showSoftInput(this.a, 1);
    }

}
