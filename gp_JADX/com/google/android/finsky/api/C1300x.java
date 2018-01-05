package com.google.android.finsky.api;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.C0683z;
import com.google.android.finsky.aa.C0955b;
import java.util.HashMap;
import java.util.Map;

public final class C1300x extends C0683z {
    public C1300x(String str, C0660x c0660x, C0657w c0657w) {
        super(str, null, c0660x, c0657w);
    }

    public final Map mo1547h() {
        Map hashMap = new HashMap();
        hashMap.put("X-Device-Logging-ID", (String) C1285f.f7611h.m28964b());
        hashMap.put("X-Device-ID", Long.toHexString(((Long) C0955b.m5748a().m28964b()).longValue()));
        return hashMap;
    }
}
