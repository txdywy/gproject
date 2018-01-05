package com.google.android.finsky.billing.p131e;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0699q;
import com.android.volley.p060a.C0683z;
import com.google.android.finsky.p230q.C3950c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1828q extends C0683z {
    public final Map f9411t = new HashMap();

    public static JSONObject m9853a(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("credentialType", z ? "pin" : "password");
            jSONObject.put("credential", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error while creating verification request");
        }
    }

    public C1828q(String str, String str2, String str3, JSONObject jSONObject, C0660x c0660x, C0657w c0657w) {
        super(str, jSONObject, c0660x, c0657w);
        C3950c.m18652a(this.f9411t, str2, str3);
    }

    public final C0699q mo1074n() {
        return C0699q.HIGH;
    }

    public final Map mo1547h() {
        return this.f9411t;
    }
}
