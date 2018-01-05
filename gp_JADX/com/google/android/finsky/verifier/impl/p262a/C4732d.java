package com.google.android.finsky.verifier.impl.p262a;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C4732d implements C0657w {
    public final /* synthetic */ String f24363a;

    C4732d(String str) {
        this.f24363a = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Verification feedback for package=%s: error response %s", this.f24363a, volleyError);
    }
}
