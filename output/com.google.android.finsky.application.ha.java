package com.google.android.finsky.application;

import android.text.TextUtils;
import com.google.android.finsky.api.a.b;
import com.google.android.finsky.wear.i;
import java.util.Map;

public final class com.google.android.finsky.application.ha implements com.google.android.finsky.api.a.c
{

    public final com.google.android.finsky.wear.i a;

    ha(com.google.android.finsky.wear.i p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.api.a.b p0, Map p1) {
        if (!TextUtils.isEmpty(this.a.n))
            p1.put("X-DFE-Device-Checkin-Consistency-Token", this.a.n);
        v0 = p0.f();
        if (!TextUtils.isEmpty(v0))
            p1.put("X-DFE-Proxy-Device-Checkin-Consistency-Token", v0);
    }

}
