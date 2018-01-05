package com.google.android.finsky.billing.e;

import android.text.TextUtils;
import org.json.JSONObject;

static class com.google.android.finsky.billing.e.l
{

    public final int a;
    public final com.google.android.finsky.billing.e.m b;
    public final com.google.android.finsky.billing.e.n c;

    l(int p0) {
        com.google.android.finsky.billing.e.l(p0, 0, 0);
    }

    l(int p0, com.google.android.finsky.billing.e.m p1, com.google.android.finsky.billing.e.n p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    static com.google.android.finsky.billing.e.l a(JSONObject p0, boolean p1) {
        v6 = 0;
        v4 = p0.getJSONObject("pin");
        if (p1 != 0)
            v0 = "setupUrl";
        else
            v0 = "setup_url";
        v1 = v4.getString(v0);
        if ("active".equalsIgnoreCase(v4.getString("status"))) {
            if (p1 != 0)
                v0 = "resetUrl";
            else
                v0 = "reset_url";
            v2 = v4.getString(v0);
            if (p1 != 0)
                v0 = "recoveryUrl";
            else
                v0 = "recovery_url";
            v0 = new com.google.android.finsky.billing.e.n(v1, v2, v4.getString(v0), v4.optInt("length"), 1);
        }
        else if (!TextUtils.isEmpty(v1))
            v0 = new com.google.android.finsky.billing.e.n(v1, 0, 0, 0, 0);
        else
            v0 = 0;
        v2 = p0.getJSONObject("password");
        if ("active".equalsIgnoreCase(v2.getString("status"))) {
            if (p1 != 0)
                v1 = "recoveryUrl";
            else
                v1 = "recovery_url";
            v6 = new com.google.android.finsky.billing.e.m(v2.getString(v1));
        }
        return new com.google.android.finsky.billing.e.l(0, v6, v0);
    }

}
