package com.google.android.finsky.billing.lightpurchase;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.wireless.android.finsky.dfe.nano.al;

public final class C1962u {
    public static byte[] m10413a(Context context, String str, String str2, al alVar, C2495w c2495w) {
        Bundle bundle = new Bundle();
        bundle.putString("product_id", str2);
        bundle.putString("product_name", "");
        bundle.putLong("value", alVar.b);
        bundle.putLong("price", alVar.b);
        bundle.putString("currency", alVar.c);
        bundle.putLong("quantity", 1);
        try {
            byte[] a = AppMeasurement.getInstance(context).m26062a(str, "_iap", bundle);
            C1962u.m10412a(c2495w, null);
            return a;
        } catch (Throwable e) {
            C1962u.m10412a(c2495w, e);
            return null;
        }
    }

    private static void m10412a(C2495w c2495w, Throwable th) {
        if (C1473m.f7980a.dj().mo2294a(12604323)) {
            C2474c c2474c = new C2474c(1108);
            c2474c.m13238a(th);
            c2495w.m13367a(c2474c);
        }
    }
}
