package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.squareup.leakcanary.C7582R;

final class bf implements OnCheckedChangeListener {
    public final /* synthetic */ bc f6481a;

    bf(bc bcVar) {
        this.f6481a = bcVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        bc bcVar = this.f6481a;
        if (i == C7582R.id.delay_decision_ml) {
            bcVar.f6477a.mo3764a(0);
            bcVar.m6307a("Use machine learning model");
        } else if (i == C7582R.id.delay_decision_always) {
            bcVar.f6477a.mo3764a(1);
            bcVar.m6307a("Always delay");
        } else if (i == C7582R.id.delay_decision_never) {
            bcVar.f6477a.mo3764a(2);
            bcVar.m6307a("Never delay");
        } else {
            bcVar.m6307a("Unknown delay decision");
        }
    }
}
