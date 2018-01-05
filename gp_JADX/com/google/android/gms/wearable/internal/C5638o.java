package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class C5638o extends cb {
    public /* synthetic */ Uri f28613a;
    public /* synthetic */ int f28614u = 0;

    C5638o(C5058o c5058o, Uri uri) {
        this.f28613a = uri;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5640q(status);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        bt btVar = (bt) c4948f;
        ((at) btVar.m23032u()).mo5109b(new bm(this), this.f28613a, this.f28614u);
    }
}
