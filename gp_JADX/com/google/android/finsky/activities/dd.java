package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;

final class dd implements OnClickListener {
    public final /* synthetic */ dc f6657a;

    dd(dc dcVar) {
        this.f6657a = dcVar;
    }

    public final void onClick(View view) {
        if (this.f6657a.D.m14644c(4) != null) {
            this.f6657a.z.mo3652a(this.f6657a.D, 0, 4);
        } else if (this.f6657a.D.m14644c(0) != null) {
            this.f6657a.z.mo3652a(this.f6657a.D, 0, 0);
        }
    }
}
