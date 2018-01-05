package com.google.android.finsky.p142j;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class C3634m implements OnClickListener {
    public final /* synthetic */ C3633l f18002a;

    C3634m(C3633l c3633l) {
        this.f18002a = c3633l;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f18002a.m626a(false);
        if (this.f18002a.af != null) {
            this.f18002a.af.mo4131a(C3632i.values()[((Integer) this.f18002a.ag.get(i)).intValue()]);
        }
    }
}
