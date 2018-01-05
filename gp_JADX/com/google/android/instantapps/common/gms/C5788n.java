package com.google.android.instantapps.common.gms;

import android.content.Intent;
import android.os.Trace;
import com.google.android.gms.common.api.C1643x;

public final class C5788n implements aj {
    public final /* synthetic */ Intent f29229a;
    public final /* synthetic */ C1643x f29230b;
    public final /* synthetic */ C5785k f29231c;

    public C5788n(C5785k c5785k, Intent intent, C1643x c1643x) {
        this.f29231c = c5785k;
        this.f29229a = intent;
        this.f29230b = c1643x;
    }

    public final void mo5160a() {
        Trace.beginSection("gms:getInstantAppPreLaunchInfo");
        this.f29231c.f29224b.m27163a().mo4675a(this.f29231c.f29224b.f29184e, this.f29229a).mo4490a(new C5789o(this, this.f29230b));
    }

    public final void mo5161b() {
        this.f29231c.f29223a.execute(new C5790p(this.f29230b));
    }
}
