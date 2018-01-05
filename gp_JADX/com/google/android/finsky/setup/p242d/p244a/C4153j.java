package com.google.android.finsky.setup.p242d.p244a;

import android.os.Bundle;
import android.os.ResultReceiver;

final class C4153j implements Runnable {
    public final /* synthetic */ ResultReceiver f21005a;
    public final /* synthetic */ int f21006b;
    public final /* synthetic */ Bundle f21007c;

    C4153j(ResultReceiver resultReceiver, int i, Bundle bundle) {
        this.f21005a = resultReceiver;
        this.f21006b = i;
        this.f21007c = bundle;
    }

    public final void run() {
        this.f21005a.send(this.f21006b, this.f21007c);
    }
}
