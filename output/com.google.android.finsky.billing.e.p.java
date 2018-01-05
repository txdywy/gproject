package com.google.android.finsky.billing.e;

import com.android.volley.a.z;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.q.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.e.p extends com.android.volley.a.z
{

    public final Map t;

    p(String p0, String p1, String p2, JSONObject p3, com.android.volley.x p4, com.android.volley.w p5) {
        com.android.volley.a.z(p0, p3, p4, p5);
        this.t = new HashMap();
        com.google.android.finsky.q.c.a(this.t, p1, p2);
    }

    public static JSONObject c(String p0) {
        v0 = new JSONObject();
        try {
            v0.put("appName", "play");
            v0.put("recoveryOptions", p0);
        }
        catch (JSONException ex) {
            throw new RuntimeException("Error while creating recovery option request", ex);
        }
        return v0;
    }

    public final Map h() {
        return this.t;
    }

}
