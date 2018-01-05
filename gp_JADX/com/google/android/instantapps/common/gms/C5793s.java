package com.google.android.instantapps.common.gms;

import android.os.Trace;
import com.google.android.gms.common.api.C1643x;
import java.util.concurrent.Executor;

final class C5793s extends ak {
    public final /* synthetic */ String f29239a;
    public final /* synthetic */ boolean f29240b;
    public final /* synthetic */ C1643x f29241c;
    public final /* synthetic */ C5785k f29242d;

    C5793s(C5785k c5785k, Executor executor, C1643x c1643x, String str, boolean z, C1643x c1643x2) {
        this.f29242d = c5785k;
        this.f29239a = str;
        this.f29240b = z;
        this.f29241c = c1643x2;
        super(executor, c1643x);
    }

    public final void mo5160a() {
        Trace.beginSection("gms:setUserPrefersBrowsers");
        this.f29242d.f29224b.m27163a().mo4677a(this.f29242d.f29224b.f29184e, this.f29239a, this.f29240b).mo4490a(new C5786l(this.f29242d, this.f29241c));
    }
}
