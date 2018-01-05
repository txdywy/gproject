package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.ParseError;
import com.android.volley.VolleyError;
import com.android.volley.w;
import com.android.volley.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.addresschallenge.placesapi.l implements com.android.volley.x
{

    public final com.android.volley.x b;
    public final com.android.volley.w c;

    l(com.android.volley.x p0, com.android.volley.w p1) {
        this.b = p0;
        this.c = p1;
    }

    protected abstract Object a(JSONObject p0);

    public final void b_(Object p0) {
        if (!"OK".equals(((JSONObject)p0).optString("status"))) {
            if (this.c != 0)
                this.c.a(new VolleyError("Response status not OK"));
        }
        else {
            try {
                this.b.b_(this.a((JSONObject)p0));
            }
            catch (JSONException ex) {
                if (this.c != 0)
                    this.c.a(new ParseError(ex));
            }
        }
    }

}
