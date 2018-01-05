package com.google.android.finsky.contentfilterui;

import android.text.Editable;

public final class com.google.android.finsky.contentfilterui.s implements TextWatcher
{

    public final PinEntryDialog a;

    s(PinEntryDialog p0) {
        this.a = p0;
    }

    public final void afterTextChanged(Editable p0) {
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        this.a.k();
    }

}
