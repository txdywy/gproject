package com.google.android.finsky.billing.addresschallenge.placesapi;

import android.text.TextUtils;
import com.google.wireless.android.c.a.a.a;
import com.squareup.leakcanary.C7582R;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1756k {
    public a f9071a;

    private C1756k(a aVar) {
        this.f9071a = aVar;
    }

    public static C1756k m9657a(JSONObject jSONObject, C1745a c1745a) {
        String string = jSONObject.getString("adr_address");
        try {
            a aVar = new a();
            Iterable a = C1745a.m9652a(string);
            do {
            } while (C1745a.m9651a(a, C1748d.UNKNOWN) != null);
            Object a2 = C1745a.m9651a(a, C1748d.ADR_STREET_ADDRESS);
            if (!TextUtils.isEmpty(a2)) {
                aVar.b(a2);
            }
            a2 = C1745a.m9651a(a, C1748d.ADR_LOCALITY);
            if (!TextUtils.isEmpty(a2)) {
                aVar.d(a2);
            }
            a2 = C1745a.m9651a(a, C1748d.ADR_POSTAL_CODE);
            if (!TextUtils.isEmpty(a2)) {
                aVar.f(a2);
            }
            a2 = C1745a.m9651a(a, C1748d.ADR_REGION);
            if (!TextUtils.isEmpty(a2)) {
                aVar.e(a2);
            }
            while (!a.isEmpty() && ((C1746b) a.getLast()).f9052b == C1748d.SEPARATOR) {
                a.removeLast();
            }
            a2 = TextUtils.join("", a).replaceAll("\\n", c1745a.f9050b.getString(C7582R.string.adr_microformat_newline_replacement));
            if (!TextUtils.isEmpty(a2)) {
                aVar.c(a2);
            }
            return new C1756k(aVar);
        } catch (Throwable e) {
            JSONException jSONException = new JSONException(e.getMessage());
            jSONException.initCause(e);
            throw jSONException;
        }
    }
}
