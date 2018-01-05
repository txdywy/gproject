package com.google.android.finsky.api;

import com.android.volley.a.z;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.aa.b;
import com.google.android.play.utils.b.a;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.api.x extends com.android.volley.a.z
{

    x(String p0, com.android.volley.x p1, com.android.volley.w p2) {
        com.android.volley.a.z(p0, 0, p1, p2);
    }

    public final Map h() {
        v1 = new HashMap();
        v1.put("X-Device-Logging-ID", (String)com.google.android.finsky.api.f.h.b());
        v1.put("X-Device-ID", Long.toHexString(((Long)com.google.android.finsky.aa.b.a().b()).longValue()));
        return v1;
    }

}
