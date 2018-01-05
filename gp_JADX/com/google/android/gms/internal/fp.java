package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class fp extends fq {
    public /* synthetic */ Integer f26755a = null;
    public /* synthetic */ Long f26756u;
    public /* synthetic */ Integer f26757v;
    public /* synthetic */ Integer f26758w;
    public /* synthetic */ Bundle f26759x;

    fp(C5053a c5053a, C5058o c5058o, Long l, Bundle bundle) {
        this.f26756u = l;
        this.f26757v = null;
        this.f26758w = null;
        this.f26759x = bundle;
        super(c5053a, c5058o);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        fj fjVar = (fj) c4948f;
        Bundle bundle = new Bundle();
        if (this.f26755a != null) {
            bundle.putInt("latency_micros", this.f26755a.intValue());
        }
        if (this.f26756u != null) {
            bundle.putLong("latency_bps", this.f26756u.longValue());
        }
        if (this.f26757v != null) {
            bundle.putInt("latitude_e6", this.f26757v.intValue());
        }
        if (this.f26758w != null) {
            bundle.putInt("longitude_e6", this.f26758w.intValue());
        }
        if (!(bundle.isEmpty() && (this.f26759x == null || this.f26759x.isEmpty()))) {
            Bundle bundle2 = this.f26759x;
            fjVar.m23031t();
            ((gb) fjVar.m23032u()).mo4726a(fjVar.f25418k.getPackageName(), bundle, bundle2);
        }
        m23071a(Status.f25625a);
    }
}
