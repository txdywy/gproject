package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.w;
import com.android.volley.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

protected final class com.google.android.finsky.billing.addresschallenge.placesapi.g extends com.google.android.finsky.billing.addresschallenge.placesapi.l
{

    g(com.android.volley.x p0, com.android.volley.w p1) {
        com.google.android.finsky.billing.addresschallenge.placesapi.l(p0, p1);
    }

    protected final Object a(JSONObject p0) {
        v1 = p0.getJSONArray("predictions");
        v2 = new ArrayList(v1.length());
        v0 = 0;
        while (v0 < v1.length()) {
            v3 = v1.getJSONObject(v0);
            v2.add(new com.google.android.finsky.billing.addresschallenge.placesapi.e(v3.getString("description"), v3.getString("reference")));
            v0 = v0 + 1;
        }
        return new com.google.android.finsky.billing.addresschallenge.placesapi.h(v2);
    }

}
