package com.google.android.finsky.billing.lightpurchase.p159a;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class C1888b implements OnCheckedChangeListener {
    public final /* synthetic */ C1887a f9687a;

    C1888b(C1887a c1887a) {
        this.f9687a = c1887a;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f9687a.ao.setError(null);
        }
    }
}
