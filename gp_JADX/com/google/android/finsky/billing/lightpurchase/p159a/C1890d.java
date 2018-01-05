package com.google.android.finsky.billing.lightpurchase.p159a;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class C1890d implements OnCheckedChangeListener {
    public final /* synthetic */ C1887a f9689a;

    C1890d(C1887a c1887a) {
        this.f9689a = c1887a;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f9689a.ak.clearCheck();
            this.f9689a.am.setEnabled(true);
        }
    }
}
