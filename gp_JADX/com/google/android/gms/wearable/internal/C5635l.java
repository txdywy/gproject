package com.google.android.gms.wearable.internal;

import android.net.Uri;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;

final class C5635l extends cb {
    public /* synthetic */ Uri f28610a;

    C5635l(C5058o c5058o, Uri uri) {
        this.f28610a = uri;
        super(c5058o);
    }

    protected final /* synthetic */ C4980w mo4495a(Status status) {
        return new C5639p(status, null);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        bt btVar = (bt) c4948f;
        ((at) btVar.m23032u()).mo5104a(new bn(this), this.f28610a);
    }
}
