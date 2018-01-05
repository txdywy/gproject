package com.google.android.finsky.family.remoteescalation.p202a;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.ae;

final class C3080c implements C0657w {
    public final /* synthetic */ ae f15999a;
    public final /* synthetic */ C3078a f16000b;

    C3080c(C3078a c3078a, ae aeVar) {
        this.f16000b = c3078a;
        this.f15999a = aeVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f16000b.f15992b, C1290m.m7702a(this.f16000b.f15992b, volleyError), 1).show();
        this.f16000b.f15995e.m15804a(this.f15999a, this.f16000b.f15993c, this.f16000b.f15996f);
        FinskyLog.m21660a(volleyError, "error updating remote escalation", new Object[0]);
    }
}
