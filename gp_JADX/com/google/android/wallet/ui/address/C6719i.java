package com.google.android.wallet.ui.address;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.wallet.p366b.C6516f;

final class C6719i implements TextWatcher {
    public final /* synthetic */ C6713c f33162a;

    C6719i(C6713c c6713c) {
        this.f33162a = c6713c;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f33162a.f33129V != null) {
            C6516f.m29560a(this.f33162a.f33129V, this.f33162a.f33142l, null);
        }
    }
}
