package com.google.android.finsky.billing.e;

import com.android.volley.a.z;
import com.android.volley.q;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.q.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.e.q extends com.android.volley.a.z
{

    public final Map t;

    q(String p0, String p1, String p2, JSONObject p3, com.android.volley.x p4, com.android.volley.w p5) {
        com.android.volley.a.z(p0, p3, p4, p5);
        this.t = new HashMap();
        com.google.android.finsky.q.c.a(this.t, p1, p2);
    }

    public static JSONObject a(String p0, boolean p1) {
        v1 = new JSONObject();
        try {
            if (p1 != 0)
                v0 = "pin";
            else
                v0 = "password";
            v1.put("credentialType", v0);
            v1.put("credential", p0);
            return v1;
        }
        catch (JSONException ex) {
            throw new RuntimeException("Error while creating verification request");
        }
    }

    public final Map h() {
        return this.t;
    }

    public final com.android.volley.q n() {
        return com.android.volley.q.c;
    }

}
