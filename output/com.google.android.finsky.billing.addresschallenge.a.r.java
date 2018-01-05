package com.google.android.finsky.billing.addresschallenge.a;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONException;
import org.json.JSONObject;

final class com.google.android.finsky.billing.addresschallenge.a.r
{

    public String a;
    public final com.google.android.finsky.billing.addresschallenge.a.ah b;
    public final com.google.android.finsky.billing.addresschallenge.a.w c;
    public final HashSet d;
    public final HashSet e;
    public final HashMap f;

    r() {
        com.google.android.finsky.billing.addresschallenge.a.r(new com.google.android.finsky.billing.addresschallenge.a.au());
    }

    r(com.google.android.finsky.billing.addresschallenge.a.w p0) {
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashMap();
        this.c = p0;
        v0 = this.c.a();
        com.google.android.finsky.billing.addresschallenge.a.az.a(v0, "Cannot set URL of address data server to null.");
        this.a = v0;
        this.b = new com.google.android.finsky.billing.addresschallenge.a.ah();
    }

    static void a(com.google.android.finsky.billing.addresschallenge.a.y p0) {
        if (p0 != 0)
            p0.b();
    }

    public final com.google.android.finsky.billing.addresschallenge.a.ah a(String p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "null key not allowed");
        return this.b.b(p0);
    }

    final void a(com.google.android.finsky.billing.addresschallenge.a.al p0, JSONObject p1, com.google.android.finsky.billing.addresschallenge.a.y p2) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "null key not allowed.");
        p2.a();
        if (this.b.c(p0.toString())) {
            com.google.android.finsky.billing.addresschallenge.a.r.a(p2);
            return;
        }
        if (this.e.contains(p0.toString())) {
            com.google.android.finsky.billing.addresschallenge.a.r.a(p2);
            return;
        }
        if (!this.d.add(p0.toString())) {
            v1 = String.valueOf(p0);
            Log.d("CacheData", (String.valueOf(v1).length() + 42) + "data for key " + v1 + " requested but not cached yet");
            v1 = new com.google.android.finsky.billing.addresschallenge.a.s(p2);
            com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
            com.google.android.finsky.billing.addresschallenge.a.az.a(v1);
            v0 = (HashSet)this.f.get(p0);
            if (v0 == 0) {
                v0 = new HashSet();
                this.f.put(p0, v0);
            }
            v0.add(v1);
            return;
        }
        v6 = this.c.a(p0.toString());
        if (v6 == 0) {
            new com.google.android.finsky.billing.addresschallenge.a.ai();
            v0 = com.google.android.finsky.billing.addresschallenge.a.ak.a.getParams();
            HttpConnectionParams.setConnectionTimeout(v0, 5000);
            HttpConnectionParams.setSoTimeout(v0, 5000);
            v2 = p0.toString();
            new com.google.android.finsky.billing.addresschallenge.a.ak(new HttpGet(com.google.android.finsky.billing.addresschallenge.a.ai.a((String.valueOf(this.a).length() + 1 + String.valueOf(v2).length()) + this.a + "/" + v2)), new com.google.android.finsky.billing.addresschallenge.a.t(this, p0, p2, new com.google.android.finsky.billing.addresschallenge.a.v(this, p0.toString(), p1, p2, 0))).start();
            return;
        }
        if (v6.length() <= 0) {
            new com.google.android.finsky.billing.addresschallenge.a.ai();
            v0 = com.google.android.finsky.billing.addresschallenge.a.ak.a.getParams();
            HttpConnectionParams.setConnectionTimeout(v0, 5000);
            HttpConnectionParams.setSoTimeout(v0, 5000);
            v2 = p0.toString();
            new com.google.android.finsky.billing.addresschallenge.a.ak(new HttpGet(com.google.android.finsky.billing.addresschallenge.a.ai.a((String.valueOf(this.a).length() + 1 + String.valueOf(v2).length()) + this.a + "/" + v2)), new com.google.android.finsky.billing.addresschallenge.a.t(this, p0, p2, new com.google.android.finsky.billing.addresschallenge.a.v(this, p0.toString(), p1, p2, 0))).start();
            return;
        }
        v0 = new com.google.android.finsky.billing.addresschallenge.a.v(this, p0.toString(), p1, p2, 0);
        try {
            v2 = com.google.android.finsky.billing.addresschallenge.a.ah.a(v6);
            if (v2 != 0) {
                if (!v2.has(com.google.android.finsky.billing.addresschallenge.a.c.c.name().toLowerCase())) {
                    v1 = String.valueOf(v0.a);
                    if (v1.length() != 0)
                        v1 = "invalid or empty data returned for key: ".concat(v1);
                    else
                        v1 = new String("invalid or empty data returned for key: ");
                    Log.w("CacheData", v1);
                    v0.d.e.add(v0.a);
                    v0.d.b(v0.a);
                    com.google.android.finsky.billing.addresschallenge.a.r.a(v0.c);
                }
                else {
                    if (v0.b != 0)
                        v2.a((com.google.android.finsky.billing.addresschallenge.a.ah)v0.b);
                    v0.d.b.a(v0.a, v2);
                    v0.d.b(v0.a);
                    com.google.android.finsky.billing.addresschallenge.a.r.a(v0.c);
                }
                return;
            }
            v1 = String.valueOf(v0.a);
            if (v1.length() != 0)
                v1 = "server returns null for key:".concat(v1);
            else {
                try {
                    v1 = new String("server returns null for key:");
                }
                catch (JSONException ex) {
                    v0 = String.valueOf(v6);
                    if (v0.length() != 0)
                        v0 = "Data from client's cache is in the wrong format: ".concat(v0);
                    else
                        v0 = new String("Data from client's cache is in the wrong format: ");
                    Log.w("CacheData", v0);
                    new com.google.android.finsky.billing.addresschallenge.a.ai();
                    v0 = com.google.android.finsky.billing.addresschallenge.a.ak.a.getParams();
                    HttpConnectionParams.setConnectionTimeout(v0, 5000);
                    HttpConnectionParams.setSoTimeout(v0, 5000);
                    v2 = p0.toString();
                    new com.google.android.finsky.billing.addresschallenge.a.ak(new HttpGet(com.google.android.finsky.billing.addresschallenge.a.ai.a((String.valueOf(this.a).length() + 1 + String.valueOf(v2).length()) + this.a + "/" + v2)), new com.google.android.finsky.billing.addresschallenge.a.t(this, p0, p2, new com.google.android.finsky.billing.addresschallenge.a.v(this, p0.toString(), p1, p2, 0))).start();
                    return;
                }
            }
            Log.w("CacheData", v1);
            v0.d.e.add(v0.a);
            v0.d.b(v0.a);
            com.google.android.finsky.billing.addresschallenge.a.r.a(v0.c);
        }
        catch (JSONException ex) {
            v0 = String.valueOf(v6);
            if (v0.length() != 0)
                v0 = "Data from client's cache is in the wrong format: ".concat(v0);
            else
                v0 = new String("Data from client's cache is in the wrong format: ");
            Log.w("CacheData", v0);
            new com.google.android.finsky.billing.addresschallenge.a.ai();
            v0 = com.google.android.finsky.billing.addresschallenge.a.ak.a.getParams();
            HttpConnectionParams.setConnectionTimeout(v0, 5000);
            HttpConnectionParams.setSoTimeout(v0, 5000);
            v2 = p0.toString();
            new com.google.android.finsky.billing.addresschallenge.a.ak(new HttpGet(com.google.android.finsky.billing.addresschallenge.a.ai.a((String.valueOf(this.a).length() + 1 + String.valueOf(v2).length()) + this.a + "/" + v2)), new com.google.android.finsky.billing.addresschallenge.a.t(this, p0, p2, new com.google.android.finsky.billing.addresschallenge.a.v(this, p0.toString(), p1, p2, 0))).start();
            return;
        }
    }

    final void b(String p0) {
        v0 = this.f.get(new com.google.android.finsky.billing.addresschallenge.a.am(p0).a());
        if ((HashSet)v0 != 0) {
            v2 = ((HashSet)v0).iterator();
            while (v2.hasNext()) {
                p0.toString();
                ((com.google.android.finsky.billing.addresschallenge.a.u)v2.next()).a();
            }
            ((HashSet)v0).clear();
        }
    }

}
