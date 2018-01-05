package com.google.android.libraries.bind.data;

import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.bind.C5873b;

final class C5912v extends C5909s {
    C5912v() {
    }

    public final int mo5198a() {
        return C5873b.bind__default_error;
    }

    protected final void mo5199a(View view) {
        if (view instanceof TextView) {
            ((TextView) view).setText("Error! (replace me)");
        }
    }
}
