package com.google.android.finsky.dialogbuilder.p137a;

import android.text.Editable;
import android.text.TextWatcher;

final class C2780v implements TextWatcher {
    public final /* synthetic */ boolean f15068a;
    public final /* synthetic */ C2779u f15069b;

    C2780v(C2779u c2779u, boolean z) {
        this.f15069b = c2779u;
        this.f15068a = z;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f15068a) {
            this.f15069b.f15067d.m14868a(this.f15069b.f15065b.b.d.b, editable.toString().matches(this.f15069b.f15065b.d));
        }
        if (editable.length() > 0) {
            this.f15069b.f15066c.m14870a(this.f15069b.f15065b.c, editable.toString());
        } else {
            this.f15069b.f15066c.m14869a(this.f15069b.f15065b.c);
        }
    }
}
