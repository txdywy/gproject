package com.google.android.finsky.dialogbuilder.p137a;

import android.widget.CheckBox;
import com.google.android.finsky.dialogbuilder.p154b.C2765k;

final class C2766f implements C2765k {
    public final CheckBox f15034a;
    public final C2764e f15035b;

    C2766f(CheckBox checkBox, C2764e c2764e) {
        this.f15034a = checkBox;
        this.f15035b = c2764e;
    }

    public final void mo3132a(boolean z) {
        this.f15034a.setOnCheckedChangeListener(null);
        this.f15034a.setChecked(z);
        this.f15034a.setOnCheckedChangeListener(this.f15035b);
    }
}
