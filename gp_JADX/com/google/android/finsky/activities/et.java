package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3363f;

final class et implements OnClickListener {
    et() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1789d.f9316c.m5765c();
        C1789d.f9315b.m5763a(Integer.valueOf(1));
        C3340g bw = C1473m.f7980a.bw();
        bw.mo3479a(new C3363f().m16801a("single_install").m16800a()).mo4398a(new eu(bw));
    }
}
