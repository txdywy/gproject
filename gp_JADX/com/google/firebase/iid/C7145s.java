package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class C7145s {
    public static final long f34895a = TimeUnit.DAYS.toMillis(7);
    public final String f34896b;
    public String f34897c;
    public long f34898d;

    private C7145s(String str, String str2, long j) {
        this.f34896b = str;
        this.f34897c = str2;
        this.f34898d = j;
    }

    static C7145s m32416a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C7145s(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C7145s(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to parse token: ").append(valueOf).toString());
            return null;
        }
    }

    static String m32417a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to encode token: ").append(valueOf).toString());
            return null;
        }
    }

    final boolean m32418b(String str) {
        return System.currentTimeMillis() > this.f34898d + f34895a || !str.equals(this.f34897c);
    }
}
