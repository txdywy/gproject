package com.google.android.finsky.installer.p207a;

import android.os.ResultReceiver;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.utils.FinskyLog;

final class C3291j implements Runnable {
    public final /* synthetic */ C3296o f17037a;
    public final /* synthetic */ ResultReceiver f17038b;
    public final /* synthetic */ boolean f17039c;
    public final /* synthetic */ boolean f17040d;
    public final /* synthetic */ C3289h f17041e;

    C3291j(C3289h c3289h, C3296o c3296o, ResultReceiver resultReceiver, boolean z, boolean z2) {
        this.f17041e = c3289h;
        this.f17037a = c3296o;
        this.f17038b = resultReceiver;
        this.f17039c = z;
        this.f17040d = z2;
    }

    public final void run() {
        C3289h c3289h = this.f17041e;
        C3296o c3296o = this.f17037a;
        ResultReceiver resultReceiver = this.f17038b;
        boolean z = this.f17039c;
        if (this.f17040d) {
            c3289h.m16521a(2, c3296o, resultReceiver);
        }
        c3289h.m16521a(1, c3296o, resultReceiver);
        if (z) {
            FinskyLog.m21659a("Install holdoff complete", new Object[0]);
            C0954a.bI.m5763a(Boolean.valueOf(false));
            c3289h.f17032d.mo3403a();
        }
    }
}
