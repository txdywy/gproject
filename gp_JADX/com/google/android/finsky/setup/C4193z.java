package com.google.android.finsky.setup;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.finsky.utils.FinskyLog;

final class C4193z implements bx {
    public boolean f21121a;
    public final /* synthetic */ ResultReceiver f21122b;
    public final /* synthetic */ Bundle f21123c;

    C4193z(ResultReceiver resultReceiver, Bundle bundle) {
        this.f21122b = resultReceiver;
        this.f21123c = bundle;
    }

    public final void mo3913a(int i, String str) {
        if (!this.f21121a && i == 1) {
            FinskyLog.m21659a("Sending final hold complete", new Object[0]);
            this.f21122b.send(1, this.f21123c);
            this.f21121a = true;
        }
    }
}
