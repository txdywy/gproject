package com.google.android.finsky.billing.p131e;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.C0683z;
import com.google.android.finsky.p230q.C3950c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class C1827p extends C0683z {
    public final Map f9410t = new HashMap();

    public static JSONObject m9851c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appName", "play");
            jSONObject.put("recoveryOptions", str);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException("Error while creating recovery option request", e);
        }
    }

    public C1827p(String str, String str2, String str3, JSONObject jSONObject, C0660x c0660x, C0657w c0657w) {
        super(str, jSONObject, c0660x, c0657w);
        C3950c.m18652a(this.f9410t, str2, str3);
    }

    public final Map mo1547h() {
        return this.f9410t;
    }
}
