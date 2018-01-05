package com.google.android.finsky.bg;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public final class C1618s {
    public static void m9294a(Context context, EditText editText) {
        editText.requestFocus();
        editText.postDelayed(new C1619t((InputMethodManager) context.getSystemService("input_method"), editText), 300);
    }

    public static void m9293a(Context context, View view) {
        if (view != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
