package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C2715d implements C0657w {
    public final /* synthetic */ int f14919a;

    C2715d(int i) {
        this.f14919a = i;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Failed to send %d events because of [%s]", Integer.valueOf(this.f14919a), volleyError);
    }
}
