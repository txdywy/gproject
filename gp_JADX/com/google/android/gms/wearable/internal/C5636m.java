package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.C5619g;

final class C5636m extends cb {
    C5636m(C5058o c5058o) {
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5619g(DataHolder.m23675b(status.f25631g));
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        ((at) ((bt) c4948f).m23032u()).mo5103a(new bo(this));
    }
}
