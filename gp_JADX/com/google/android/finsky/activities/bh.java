package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.squareup.leakcanary.C7582R;

final class bh implements OnCheckedChangeListener {
    public final /* synthetic */ bc f6483a;

    bh(bc bcVar) {
        this.f6483a = bcVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        bc bcVar = this.f6483a;
        if (i == C7582R.id.reschedule_deadline_default) {
            bcVar.f6477a.mo3768b(86400000);
            bcVar.m6307a("Reschedule deadline default");
        } else if (i == C7582R.id.reschedule_deadline_5s) {
            bcVar.f6477a.mo3768b(5000);
            bcVar.m6307a("Reschedule deadline 5s");
        } else {
            bcVar.m6307a("Unknown reschedule deadline");
        }
    }
}
