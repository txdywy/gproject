package com.google.android.finsky.detailspage;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class av implements C0657w {
    public final /* synthetic */ aq f14263a;

    av(aq aqVar) {
        this.f14263a = aqVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Volley error while fetching social details doc: %s", volleyError.getClass());
        this.f14263a.an = false;
        this.f14263a.m_();
    }
}
