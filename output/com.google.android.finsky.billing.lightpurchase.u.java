package com.google.android.finsky.billing.lightpurchase;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.wireless.android.finsky.dfe.nano.al;

public static class com.google.android.finsky.billing.lightpurchase.u
{

    u() {
    }

    private static void a(com.google.android.finsky.d.w p0, Throwable p1) {
        if (com.google.android.finsky.m.a.dj().a(12604323)) {
            v0 = new com.google.android.finsky.d.c(1108);
            v0.a(p1);
            p0.a(v0);
        }
    }

    public static byte[] a(Context p0, String p1, String p2, com.google.wireless.android.finsky.dfe.nano.al p3, com.google.android.finsky.d.w p4) {
        v0 = new Bundle();
        v0.putString("product_id", p2);
        v0.putString("product_name", "");
        v0.putLong("value", p3.b);
        v0.putLong("price", p3.b);
        v0.putString("currency", p3.c);
        v0.putLong("quantity", 1);
        try {
            v0 = AppMeasurement.getInstance(p0).a(p1, "_iap", v0);
        }
        catch (Exception ex) {
            com.google.android.finsky.billing.lightpurchase.u.a(p4, ex);
            v0 = 0;
            return v0;
        }
        com.google.android.finsky.billing.lightpurchase.u.a(p4, 0);
        return v0;
    }

}
