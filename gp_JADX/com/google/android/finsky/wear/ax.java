package com.google.android.finsky.wear;

import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;

final class ax implements Runnable {
    public int f24846a;
    public final /* synthetic */ Intent f24847b;
    public final /* synthetic */ ar f24848c;

    ax(ar arVar, Intent intent) {
        this.f24848c = arVar;
        this.f24847b = intent;
    }

    public final void run() {
        this.f24846a++;
        if (this.f24846a == 2) {
            ar arVar = this.f24848c;
            Intent intent = this.f24847b;
            C5058o c5058o = arVar.f24823g.f24792b;
            if (c5058o == null || !c5058o.mo4562j()) {
                FinskyLog.m21665c("Dropping command=hygiene due to Gms not connected", new Object[0]);
            } else {
                arVar.m22466a(intent, arVar.f24830n, arVar.f24829m);
            }
        }
    }
}
