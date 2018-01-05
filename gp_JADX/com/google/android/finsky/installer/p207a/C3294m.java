package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.utils.FinskyLog;

final class C3294m implements Runnable {
    public final /* synthetic */ String f17047a;
    public final /* synthetic */ String f17048b;
    public final /* synthetic */ C3289h f17049c;

    C3294m(C3289h c3289h, String str, String str2) {
        this.f17049c = c3289h;
        this.f17047a = str;
        this.f17048b = str2;
    }

    public final void run() {
        C3296o b = this.f17049c.m16525b(this.f17047a, this.f17048b);
        if (b != null && !b.f17054d) {
            FinskyLog.m21665c("Holdoff timeout for %s reached, automatically resuming", b);
            this.f17049c.m16523a(b.f17051a, b.f17052b);
        }
    }
}
