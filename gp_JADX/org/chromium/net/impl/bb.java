package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.ay;

final class bb implements Runnable {
    public final /* synthetic */ ay f40831a;
    public final /* synthetic */ aw f40832b;

    bb(aw awVar, ay ayVar) {
        this.f40832b = awVar;
        this.f40831a = ayVar;
    }

    public final void run() {
        try {
            this.f40832b.f40817a.mo6584b(this.f40832b.f40820d, this.f40831a);
        } catch (Throwable e) {
            Log.e(af.f40774a, "Exception in onSucceeded method", e);
        }
    }
}
