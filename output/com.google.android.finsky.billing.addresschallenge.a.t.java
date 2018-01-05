package com.google.android.finsky.billing.addresschallenge.a;

import android.util.Log;
import java.util.HashSet;
import org.json.JSONObject;

public final class com.google.android.finsky.billing.addresschallenge.a.t implements com.google.android.finsky.billing.addresschallenge.a.aj
{

    public final com.google.android.finsky.billing.addresschallenge.a.al a;
    public final com.google.android.finsky.billing.addresschallenge.a.y b;
    public final com.google.android.finsky.billing.addresschallenge.a.v c;
    public final com.google.android.finsky.billing.addresschallenge.a.r d;

    t(com.google.android.finsky.billing.addresschallenge.a.r p0, com.google.android.finsky.billing.addresschallenge.a.al p1, com.google.android.finsky.billing.addresschallenge.a.y p2, com.google.android.finsky.billing.addresschallenge.a.v p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a() {
        v1 = String.valueOf(this.a);
        Log.w("CacheData", (String.valueOf(v1).length() + 23) + "Request for key " + v1 + " failed");
        this.d.d.remove(this.a.toString());
        this.d.b(this.a.toString());
        com.google.android.finsky.billing.addresschallenge.a.r.a(this.b);
    }

    public final void a(Object p0) {
        if ((com.google.android.finsky.billing.addresschallenge.a.ah)p0 == 0) {
            v0 = String.valueOf(this.c.a);
            if (v0.length() != 0)
                v0 = "server returns null for key:".concat(v0);
            else
                v0 = new String("server returns null for key:");
            Log.w("CacheData", v0);
            this.c.d.e.add(this.c.a);
            this.c.d.b(this.c.a);
            com.google.android.finsky.billing.addresschallenge.a.r.a(this.c.c);
        }
        else if (!((com.google.android.finsky.billing.addresschallenge.a.ah)p0).has(com.google.android.finsky.billing.addresschallenge.a.c.c.name().toLowerCase())) {
            v0 = String.valueOf(this.c.a);
            if (v0.length() != 0)
                v0 = "invalid or empty data returned for key: ".concat(v0);
            else
                v0 = new String("invalid or empty data returned for key: ");
            Log.w("CacheData", v0);
            this.c.d.e.add(this.c.a);
            this.c.d.b(this.c.a);
            com.google.android.finsky.billing.addresschallenge.a.r.a(this.c.c);
        }
        else {
            if (this.c.b != 0)
                ((com.google.android.finsky.billing.addresschallenge.a.ah)p0).a((com.google.android.finsky.billing.addresschallenge.a.ah)this.c.b);
            this.c.d.b.a(this.c.a, (com.google.android.finsky.billing.addresschallenge.a.ah)p0);
            this.c.d.b(this.c.a);
            com.google.android.finsky.billing.addresschallenge.a.r.a(this.c.c);
        }
        this.d.c.a(this.a.toString(), ((com.google.android.finsky.billing.addresschallenge.a.ah)p0).toString());
    }

}
