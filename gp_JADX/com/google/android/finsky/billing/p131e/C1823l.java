package com.google.android.finsky.billing.p131e;

import android.text.TextUtils;
import org.json.JSONObject;

public final class C1823l {
    public final int f9401a;
    public final C1824m f9402b;
    public final C1825n f9403c;

    private C1823l(int i, C1824m c1824m, C1825n c1825n) {
        this.f9401a = i;
        this.f9402b = c1824m;
        this.f9403c = c1825n;
    }

    public C1823l(int i) {
        this(i, null, null);
    }

    static C1823l m9849a(JSONObject jSONObject, boolean z) {
        C1825n c1825n;
        C1824m c1824m = null;
        JSONObject jSONObject2 = jSONObject.getJSONObject("pin");
        String string = jSONObject2.getString("status");
        Object string2 = jSONObject2.getString(z ? "setupUrl" : "setup_url");
        if ("active".equalsIgnoreCase(string)) {
            c1825n = new C1825n(string2, jSONObject2.getString(z ? "resetUrl" : "reset_url"), jSONObject2.getString(z ? "recoveryUrl" : "recovery_url"), jSONObject2.optInt("length"), true);
        } else if (TextUtils.isEmpty(string2)) {
            c1825n = null;
        } else {
            c1825n = new C1825n(string2, null, null, 0, false);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("password");
        if ("active".equalsIgnoreCase(jSONObject3.getString("status"))) {
            c1824m = new C1824m(jSONObject3.getString(z ? "recoveryUrl" : "recovery_url"));
        }
        return new C1823l(0, c1824m, c1825n);
    }
}
