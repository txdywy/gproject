package com.google.android.finsky.billing.lightpurchase.p159a;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

final class C1889c implements OnCheckedChangeListener {
    public final /* synthetic */ C1887a f9688a;

    C1889c(C1887a c1887a) {
        this.f9688a = c1887a;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (this.f9688a.al != null && i != -1 && ((RadioButton) this.f9688a.ak.findViewById(i)).isChecked()) {
            this.f9688a.al.setChecked(false);
            this.f9688a.am.setEnabled(false);
        }
    }
}
