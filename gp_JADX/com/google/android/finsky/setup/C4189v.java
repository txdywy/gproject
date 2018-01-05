package com.google.android.finsky.setup;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.finsky.utils.FinskyLog;

final class C4189v implements bx {
    public boolean f21116a;
    public final /* synthetic */ ResultReceiver f21117b;
    public final /* synthetic */ Bundle f21118c;

    C4189v(ResultReceiver resultReceiver, Bundle bundle) {
        this.f21117b = resultReceiver;
        this.f21118c = bundle;
    }

    public final void mo3913a(int i, String str) {
        if (!this.f21116a && i == 1) {
            FinskyLog.m21659a("Sending final hold complete", new Object[0]);
            this.f21117b.send(1, this.f21118c);
            this.f21116a = true;
        }
    }
}
