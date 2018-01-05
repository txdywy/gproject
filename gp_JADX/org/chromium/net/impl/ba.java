package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.ay;

final class ba implements Runnable {
    public final /* synthetic */ ay f40829a;
    public final /* synthetic */ aw f40830b;

    ba(aw awVar, ay ayVar) {
        this.f40830b = awVar;
        this.f40829a = ayVar;
    }

    public final void run() {
        try {
            this.f40830b.f40817a.mo6585c(this.f40830b.f40820d, this.f40829a);
        } catch (Throwable e) {
            Log.e(af.f40774a, "Exception in onCanceled method", e);
        }
    }
}
