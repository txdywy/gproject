package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.w;
import com.android.volley.x;
import org.json.JSONObject;

protected final class com.google.android.finsky.billing.addresschallenge.placesapi.j extends com.google.android.finsky.billing.addresschallenge.placesapi.l
{

    public com.google.android.finsky.billing.addresschallenge.placesapi.a a;

    j(com.google.android.finsky.billing.addresschallenge.placesapi.a p0, com.android.volley.x p1, com.android.volley.w p2) {
        com.google.android.finsky.billing.addresschallenge.placesapi.l(p1, p2);
        this.a = p0;
    }

    protected final Object a(JSONObject p0) {
        return com.google.android.finsky.billing.addresschallenge.placesapi.k.a(p0.getJSONObject("result"), this.a);
    }

}
