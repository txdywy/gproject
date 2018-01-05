package com.google.android.finsky.setup;

import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;

final class dk implements Runnable {
    public final /* synthetic */ dp f21070a;
    public final /* synthetic */ String f21071b;
    public final /* synthetic */ ee[] f21072c;
    public final /* synthetic */ ef[] f21073d;

    dk(dp dpVar, String str, ee[] eeVarArr, ef[] efVarArr) {
        this.f21070a = dpVar;
        this.f21071b = str;
        this.f21072c = eeVarArr;
        this.f21073d = efVarArr;
    }

    public final void run() {
        this.f21070a.mo3935a(this.f21071b, this.f21072c, this.f21073d);
    }
}
