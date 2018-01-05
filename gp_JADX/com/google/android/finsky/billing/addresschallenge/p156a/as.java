package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class as {
    public static final Map f8852a = new HashMap();

    static String m9564a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < strArr.length; i += 2) {
            try {
                jSONObject.put(strArr[i], strArr[i + 1]);
            } catch (JSONException e) {
            }
        }
        return jSONObject.toString();
    }

    static {
        for (at atVar : at.values()) {
            f8852a.put(atVar.toString(), atVar.dJ);
        }
    }
}
