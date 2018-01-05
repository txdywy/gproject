package com.google.android.finsky.billing.addresschallenge.placesapi;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class C1752g extends C1751l {
    public C1752g(C0660x c0660x, C0657w c0657w) {
        super(c0660x, c0657w);
    }

    protected final /* synthetic */ Object mo2428a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("predictions");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new C1749e(jSONObject2.getString("description"), jSONObject2.getString("reference")));
        }
        return new C1753h(arrayList);
    }
}
