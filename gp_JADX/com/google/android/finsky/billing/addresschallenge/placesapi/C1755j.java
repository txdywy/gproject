package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import org.json.JSONObject;

final class C1755j extends C1751l {
    public C1745a f9070a;

    public C1755j(C1745a c1745a, C0660x c0660x, C0657w c0657w) {
        super(c0660x, c0657w);
        this.f9070a = c1745a;
    }

    protected final /* synthetic */ Object mo2428a(JSONObject jSONObject) {
        return C1756k.m9657a(jSONObject.getJSONObject("result"), this.f9070a);
    }
}
