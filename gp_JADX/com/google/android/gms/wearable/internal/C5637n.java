package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C5619g;

final class C5637n extends cb {
    public /* synthetic */ Uri f28611a;
    public /* synthetic */ int f28612u;

    C5637n(C5058o c5058o, Uri uri, int i) {
        this.f28611a = uri;
        this.f28612u = i;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5619g(DataHolder.m23675b(status.f25631g));
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        bt btVar = (bt) c4948f;
        ((at) btVar.m23032u()).mo5105a(new bo(this), this.f28611a, this.f28612u);
    }
}
