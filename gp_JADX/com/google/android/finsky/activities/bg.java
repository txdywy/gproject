package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.squareup.leakcanary.C7582R;

final class bg implements OnCheckedChangeListener {
    public final /* synthetic */ bc f6482a;

    bg(bc bcVar) {
        this.f6482a = bcVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        bc bcVar = this.f6482a;
        if (i == C7582R.id.expiration_length_default) {
            bcVar.f6477a.mo3765a(43200000);
            bcVar.m6307a("Expiration default");
        } else if (i == C7582R.id.expiration_length_15s) {
            bcVar.f6477a.mo3765a(15000);
            bcVar.m6307a("Expiration 15s");
        } else {
            bcVar.m6307a("Unknown expiration length");
        }
    }
}
