package com.google.android.finsky.playcard;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

final class bj implements C0657w {
    public final /* synthetic */ Document f19653a;

    bj(Document document) {
        this.f19653a = document;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Volley error while dismissing %s: %s", this.f19653a.f14885a.f12096c, volleyError);
    }
}
