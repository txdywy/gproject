package com.google.android.wallet.redirect;

import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

public final class C6699e {
    public final String f33042a;
    public final JSONArray f33043b;
    public String f33044c;

    public C6699e(String str, String str2) {
        this.f33042a = str;
        try {
            this.f33043b = TextUtils.isEmpty(str2) ? null : new JSONArray(str2);
        } catch (Throwable e) {
            throw new IllegalArgumentException("Could not parse json.", e);
        }
    }

    public final String m30350a() {
        if (this.f33044c == null) {
            this.f33044c = m30349d();
        }
        return this.f33044c;
    }

    public final boolean m30351b() {
        return "POST".equalsIgnoreCase(this.f33042a);
    }

    public final boolean m30352c() {
        boolean z;
        if ("GET".equalsIgnoreCase(this.f33042a) || TextUtils.isEmpty(this.f33042a)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (m30351b() && this.f33043b != null)) {
            return true;
        }
        return false;
    }

    private final String m30349d() {
        if (this.f33043b == null) {
            return null;
        }
        Builder builder = new Builder();
        int length = this.f33043b.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject optJSONObject = this.f33043b.optJSONObject(i);
                if (optJSONObject != null) {
                    builder.appendQueryParameter(optJSONObject.getString("name"), optJSONObject.getString("value"));
                }
            } catch (Throwable e) {
                Log.e("HtmlFormContent", "Failed to parse JSON object", e);
            }
        }
        return builder.build().getEncodedQuery();
    }
}
