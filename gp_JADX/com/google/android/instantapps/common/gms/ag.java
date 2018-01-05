package com.google.android.instantapps.common.gms;

import android.os.Trace;
import com.google.android.gms.common.api.C1643x;
import java.util.concurrent.Executor;

final class ag extends ak {
    public final /* synthetic */ String f29203a;
    public final /* synthetic */ C1643x f29204b;
    public final /* synthetic */ C5785k f29205c;

    ag(C5785k c5785k, Executor executor, C1643x c1643x, String str, C1643x c1643x2) {
        this.f29205c = c5785k;
        this.f29203a = str;
        this.f29204b = c1643x2;
        super(executor, c1643x);
    }

    public final void mo5160a() {
        Trace.beginSection("gms:optIn");
        this.f29205c.f29224b.m27163a().mo4676a(this.f29205c.f29224b.f29184e, this.f29203a).mo4490a(new C5786l(this.f29205c, this.f29204b));
    }
}
