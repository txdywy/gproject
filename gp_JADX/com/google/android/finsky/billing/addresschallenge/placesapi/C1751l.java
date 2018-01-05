package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import org.json.JSONObject;

public abstract class C1751l implements C0660x {
    public final C0660x f9067b;
    public final C0657w f9068c;

    public C1751l(C0660x c0660x, C0657w c0657w) {
        this.f9067b = c0660x;
        this.f9068c = c0657w;
    }

    protected abstract Object mo2428a(JSONObject jSONObject);

    public final /* synthetic */ void b_(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if ("OK".equals(jSONObject.optString("status"))) {
            try {
                this.f9067b.b_(mo2428a(jSONObject));
            } catch (Throwable e) {
                if (this.f9068c != null) {
                    this.f9068c.mo1062a(new ParseError(e));
                }
            }
        } else if (this.f9068c != null) {
            this.f9068c.mo1062a(new VolleyError("Response status not OK"));
        }
    }
}
