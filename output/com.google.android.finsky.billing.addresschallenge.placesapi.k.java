package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.content.Context;
import android.text.TextUtils;
import com.google.wireless.android.c.a.a.a;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public static class com.google.android.finsky.billing.addresschallenge.placesapi.k
{

    public com.google.wireless.android.c.a.a.a a;

    k(com.google.wireless.android.c.a.a.a p0) {
        this.a = p0;
    }

    public static com.google.android.finsky.billing.addresschallenge.placesapi.k a(JSONObject p0, com.google.android.finsky.billing.addresschallenge.placesapi.a p1) {
  8:    v1 = new com.google.wireless.android.c.a.a.a();
 11:    v2 = com.google.android.finsky.billing.addresschallenge.placesapi.a.a(p0.getString("adr_address"));
 21:    if (com.google.android.finsky.billing.addresschallenge.placesapi.a.a(v2, com.google.android.finsky.billing.addresschallenge.placesapi.d.f) != 0) goto 17;
 25:    v0 = com.google.android.finsky.billing.addresschallenge.placesapi.a.a(v2, com.google.android.finsky.billing.addresschallenge.placesapi.d.a);
 33:    if (!TextUtils.isEmpty(v0))
 35:        v1.b(v0);
 40:    v0 = com.google.android.finsky.billing.addresschallenge.placesapi.a.a(v2, com.google.android.finsky.billing.addresschallenge.placesapi.d.c);
 48:    if (!TextUtils.isEmpty(v0))
 50:        v1.d(v0);
 55:    v0 = com.google.android.finsky.billing.addresschallenge.placesapi.a.a(v2, com.google.android.finsky.billing.addresschallenge.placesapi.d.e);
 63:    if (!TextUtils.isEmpty(v0))
 65:        v1.f(v0);
 70:    v0 = com.google.android.finsky.billing.addresschallenge.placesapi.a.a(v2, com.google.android.finsky.billing.addresschallenge.placesapi.d.d);
 78:    if (!TextUtils.isEmpty(v0))
 80:        v1.e(v0);
 83:    while (!v2.isEmpty() && ((com.google.android.finsky.billing.addresschallenge.placesapi.b)v2.getLast()).b == com.google.android.finsky.billing.addresschallenge.placesapi.d.g)
101:        v2.removeLast();
104:    goto 119;
112:    v1 = new JSONException(ex.getMessage());
115:    v1.initCause(ex);
118:    throw v1;
119:    try {
136:        v0 = TextUtils.join("", v2).replaceAll("\\n", p1.b.getString(2131951671));
144:        if (!TextUtils.isEmpty(v0))
146:            v1.c(v0);
        }
        catch (AdrMicroformatParserException ex) {
112:        v1 = new JSONException(ex.getMessage());
115:        v1.initCause(ex);
118:        throw v1;
        }
154:    return new com.google.android.finsky.billing.addresschallenge.placesapi.k(v1);
156:    try
            run 6...104
        catch (AdrMicroformatParserException ex) {
  6:        goto 105;
        }
    }

}
