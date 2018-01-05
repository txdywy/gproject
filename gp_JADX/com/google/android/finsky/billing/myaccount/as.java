package com.google.android.finsky.billing.myaccount;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class as implements OnCheckedChangeListener {
    public final /* synthetic */ String f10218a;
    public final /* synthetic */ SwitchCompat f10219b;
    public final /* synthetic */ View f10220c;
    public final /* synthetic */ an f10221d;

    as(an anVar, String str, SwitchCompat switchCompat, View view) {
        this.f10221d = anVar;
        this.f10218a = str;
        this.f10219b = switchCompat;
        this.f10220c = view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        C2495w c2495w = this.f10221d.j;
        C2475d c2475d = new C2475d(this.f10221d.l);
        if (z) {
            i = 2690;
        } else {
            i = 2691;
        }
        c2495w.m13379b(c2475d.m13256a(i));
        this.f10221d.f10204g.m15188a(this.f10218a, z, new at(this, z));
    }
}
