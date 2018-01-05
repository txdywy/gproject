package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;

final class bd implements Runnable {
    public final /* synthetic */ String f24867a;
    public final /* synthetic */ cc f24868b;
    public final /* synthetic */ ar f24869c;

    bd(ar arVar, String str, cc ccVar) {
        this.f24869c = arVar;
        this.f24867a = str;
        this.f24868b = ccVar;
    }

    public final void run() {
        C2693e b = this.f24869c.f24824h.m22522b(this.f24867a);
        C1473m c1473m = C1473m.f7980a;
        C1254c c = c1473m.mo2168c(this.f24867a);
        if (c == null) {
            FinskyLog.m21667d("WSS:Bad things are happening!", new Object[0]);
            this.f24869c.m22468a(this.f24867a, this.f24868b);
            return;
        }
        c1473m.bI().m13571a(c, b, new be(this, b, c));
    }
}
