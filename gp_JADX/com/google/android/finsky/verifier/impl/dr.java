package com.google.android.finsky.verifier.impl;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class dr implements C0657w {
    public final /* synthetic */ List f24630a;
    public final /* synthetic */ dk f24631b;

    dr(dk dkVar, List list) {
        this.f24631b = dkVar;
        this.f24630a = list;
    }

    public final void mo1062a(VolleyError volleyError) {
        Integer valueOf;
        dk dkVar = this.f24631b;
        if (dkVar.f24620z != null) {
            ForegroundCoordinator.m16015a(dkVar.f24620z);
            dkVar.f24620z = null;
        }
        FinskyLog.m21667d("Multi verification error response %s", volleyError);
        int a = bf.m22116a(volleyError);
        if (volleyError.f4022b != null) {
            valueOf = Integer.valueOf(volleyError.f4022b.f4166a);
        } else {
            valueOf = null;
        }
        bf.m22120a(this.f24631b.f24599c, true, a, null, null, null, valueOf);
        if (((Boolean) C0955b.cp.m28964b()).booleanValue()) {
            this.f24631b.m22325a(this.f24630a, new dw(this.f24631b, this.f24630a));
        } else {
            this.f24631b.m22328a(false);
        }
    }
}
