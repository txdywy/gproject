package com.google.android.finsky.billing.acquire.p152a;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

final class C1679l implements TextWatcher {
    public final /* synthetic */ View f8707a;
    public final /* synthetic */ C1678k f8708b;

    C1679l(C1678k c1678k, View view) {
        this.f8708b = c1678k;
        this.f8707a = view;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        ((PlayTextView) this.f8707a.findViewById(C7582R.id.error_message)).setVisibility(4);
        this.f8708b.f8706d.m14868a(this.f8708b.f8704b.a.d.b, editable.length() > 0);
    }
}
