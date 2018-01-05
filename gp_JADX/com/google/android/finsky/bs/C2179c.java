package com.google.android.finsky.bs;

import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.utils.FinskyLog;

final class C2179c implements Runnable {
    public final /* synthetic */ String f10953a;
    public final /* synthetic */ int f10954b;
    public final /* synthetic */ String f10955c;
    public final /* synthetic */ C2178b f10956d;

    C2179c(C2178b c2178b, String str, int i, String str2) {
        this.f10956d = c2178b;
        this.f10953a = str;
        this.f10954b = i;
        this.f10955c = str2;
    }

    public final void run() {
        FinskyLog.m21659a("Set autoupdate of %s to %d (%s)", this.f10953a, Integer.valueOf(this.f10954b), this.f10955c);
        ((C3646a) this.f10956d.f10952c.mo1a()).f18022b.mo2661a(this.f10953a, this.f10954b);
    }
}
