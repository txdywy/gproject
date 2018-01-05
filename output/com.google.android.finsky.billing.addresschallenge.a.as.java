package com.google.android.finsky.billing.addresschallenge.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

static class com.google.android.finsky.billing.addresschallenge.a.as
{

    public static final Map a;

    static {
        com.google.android.finsky.billing.addresschallenge.a.as.a = new HashMap();
        v1 = com.google.android.finsky.billing.addresschallenge.a.at.values();
        v0 = 0;
        while (v0 < v1.length) {
            com.google.android.finsky.billing.addresschallenge.a.as.a.put(v1[v0].toString(), v1[v0].dJ);
            v0 = v0 + 1;
        }
    }

    static String a(String[] p0) {
        v1 = new JSONObject();
        v0 = 0;
        while (v0 < p0.length) {
            try {
                v1.put(p0[v0], p0[v0 + 1]);
            }
            catch (JSONException ex) {
            }
            v0 = v0 + 2;
        }
        return v1.toString();
    }

}
