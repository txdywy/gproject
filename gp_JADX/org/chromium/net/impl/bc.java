package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.CronetException;
import org.chromium.net.ay;

final class bc implements Runnable {
    public final /* synthetic */ ay f40833a;
    public final /* synthetic */ CronetException f40834b;
    public final /* synthetic */ aw f40835c;

    bc(aw awVar, ay ayVar, CronetException cronetException) {
        this.f40835c = awVar;
        this.f40833a = ayVar;
        this.f40834b = cronetException;
    }

    public final void run() {
        try {
            this.f40835c.f40817a.mo6583a(this.f40835c.f40820d, this.f40833a, this.f40834b);
        } catch (Throwable e) {
            Log.e(af.f40774a, "Exception in onFailed method", e);
        }
    }
}
