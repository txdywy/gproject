package com.google.android.finsky.instantapps.p220f;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class C3476c implements OnCheckedChangeListener {
    public final /* synthetic */ String f17671a;
    public final /* synthetic */ C3475b f17672b;

    C3476c(C3475b c3475b, String str) {
        this.f17672b = c3475b;
        this.f17671a = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z && this.f17672b.f17670v != null) {
            this.f17672b.f17670v.mo3540a(this.f17671a);
        }
    }
}
