package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import java.util.concurrent.Executor;

@Deprecated
public final class C5785k {
    public final Executor f29223a;
    public final GmsConnection f29224b;

    public C5785k(Executor executor, GmsConnection gmsConnection) {
        this.f29223a = executor;
        this.f29224b = gmsConnection;
    }

    public final void m27186a(C1643x c1643x) {
        this.f29224b.m27167a(new C5794t(this, c1643x));
    }

    public final void m27187a(String str, C1643x c1643x) {
        this.f29224b.m27167a(new ag(this, this.f29223a, c1643x, str, c1643x));
    }

    public final void m27188a(String str, boolean z, C1643x c1643x) {
        this.f29224b.m27167a(new C5793s(this, this.f29223a, c1643x, str, z, c1643x));
    }
}
