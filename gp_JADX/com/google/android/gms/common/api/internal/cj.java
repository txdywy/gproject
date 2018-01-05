package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C5058o;

public final class cj implements C1634r {
    public final int f25804a;
    public final C5058o f25805b;
    public final C1634r f25806c;
    public /* synthetic */ ci f25807d;

    public cj(ci ciVar, int i, C5058o c5058o, C1634r c1634r) {
        this.f25807d = ciVar;
        this.f25804a = i;
        this.f25805b = c5058o;
        this.f25806c = c1634r;
        c5058o.mo4549a((C1634r) this);
    }

    public final void mo2364a(ConnectionResult connectionResult) {
        String valueOf = String.valueOf(connectionResult);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
        this.f25807d.m23536b(connectionResult, this.f25804a);
    }
}
