package com.google.android.finsky.billing.addresschallenge.a;

import android.util.Log;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class com.google.android.finsky.billing.addresschallenge.a.x implements com.google.android.finsky.billing.addresschallenge.a.z
{

    public final Map a;
    public com.google.android.finsky.billing.addresschallenge.a.r b;

    x(com.google.android.finsky.billing.addresschallenge.a.r p0) {
        this.a = new HashMap();
        this.b = p0;
        this.a();
    }

    private static com.google.android.finsky.billing.addresschallenge.a.i a(com.google.android.finsky.billing.addresschallenge.a.ah p0) {
  4:    v3 = new EnumMap(com.google.android.finsky.billing.addresschallenge.a.c);
  7:    v4 = p0.a();
 12:    v2 = 0;
 17:    if (v2 >= v4.length())
 66:        return new com.google.android.finsky.billing.addresschallenge.a.i(v3);
 33:    v0 = (com.google.android.finsky.billing.addresschallenge.a.c)com.google.android.finsky.billing.addresschallenge.a.c.p.get(v4.getString(v2).toLowerCase());
 35:    if (v0 != 0)
 55:        v3.put(v0, (String)p0.get(v0.toString().toLowerCase()));
 39:    v2 = v2 + 1;
 40:    goto 13;
 60:    goto 37;
 67:    try
            run 19...58
        catch (JSONException ex) {
 19:        goto 59;
        }
    }

    private final void a() {
        v2 = 0;
        v3 = new StringBuilder();
        v4 = com.google.android.finsky.billing.addresschallenge.a.as.a.keySet().iterator();
        while (v4.hasNext()) {
            v0 = (String)v4.next();
            v3.append(String.valueOf(v0).concat("~"));
            try {
                v1 = com.google.android.finsky.billing.addresschallenge.a.ah.a((String)com.google.android.finsky.billing.addresschallenge.a.as.a.get(v0));
            }
            catch (JSONException ex) {
                v1 = 0;
            }
            this.a.put(new com.google.android.finsky.billing.addresschallenge.a.am(com.google.android.finsky.billing.addresschallenge.a.an.a).a(new com.google.android.finsky.billing.addresschallenge.a.b().a(v0).a()).a().toString(), v1);
        }
        v3.setLength(v3.length() - 1);
        v0 = com.google.android.finsky.billing.addresschallenge.a.c.a.toString().toLowerCase();
        v1 = v3.toString();
        try {
            v2 = com.google.android.finsky.billing.addresschallenge.a.ah.a((String.valueOf(v0).length() + 20 + String.valueOf(v1).length()) + "{\"id\":\"data\",\"" + v0 + "\": \"" + v1 + "\"}");
        }
        catch (JSONException ex) {
        }
        this.a.put("data", v2);
    }

    private static boolean c(String p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0, "Cannot use null as a key");
        if (p0.split("/").length == 2)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.billing.addresschallenge.a.i a(String p0) {
  2:    v0 = this.b.a(p0);
  6:    if (v0 != 0) {
141:        if (v0 != 0 && p0.startsWith("data"))
151:            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
            else
212:            v0 = 0;
155:        return v0;
        }
 14:    if (this.b.a(p0) != 0) {
137:        v0 = this.b.a(p0);
141:        if (v0 != 0 && p0.startsWith("data"))
151:            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
            else
212:            v0 = 0;
155:        return v0;
        }
 26:    v1 = new com.google.android.finsky.billing.addresschallenge.a.ap(this);
 33:    if (!com.google.android.finsky.billing.addresschallenge.a.al.a(p0)) {
137:        v0 = this.b.a(p0);
141:        if (v0 != 0 && p0.startsWith("data"))
151:            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
            else
212:            v0 = 0;
155:        return v0;
        }
 40:    v2 = new com.google.android.finsky.billing.addresschallenge.a.am(p0).a();
 46:    this.b.a(v2, (com.google.android.finsky.billing.addresschallenge.a.ah)this.a.get(p0), v1);
 49:    v1.c();
 58:    if (this.b.a(p0) != 0) {
137:        v0 = this.b.a(p0);
141:        if (v0 != 0 && p0.startsWith("data"))
151:            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
            else
212:            v0 = 0;
155:        return v0;
        }
 64:    if (!com.google.android.finsky.billing.addresschallenge.a.x.c(p0)) {
137:        v0 = this.b.a(p0);
141:        if (v0 != 0 && p0.startsWith("data"))
151:            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
            else
212:            v0 = 0;
155:        return v0;
        }
 70:    Log.i("ClientData", "Server failure: looking up key in region data constants.");
 77:    com.google.android.finsky.billing.addresschallenge.a.az.a(v2, "null key not allowed.");
 84:    v0 = v2.a(com.google.android.finsky.billing.addresschallenge.a.d.k);
 88:    if (v0 == 0) goto 156;
 90:    v0 = v0.toString();
 96:    v4 = v0.lastIndexOf("/");
100:    if (v4 <= 0) goto 156;
106:    if (v4 == v0.length()) goto 156;
110:    v0 = v0.substring(v4 + 1);
118:    v0 = (String)com.google.android.finsky.billing.addresschallenge.a.as.a.get(v0);
120:    if (v0 != 0) {
122:        try {
132:            this.b.b.a(v2.toString(), com.google.android.finsky.billing.addresschallenge.a.ah.a(v0));
            }
            catch (JSONException ex) {
162:            v1 = String.valueOf(v2);
201:            Log.w("CacheData", (String.valueOf(v1).length() + 54) + "Failed to parse data for key " + v1 + " from RegionDataConstants");
            }
            catch (InterruptedException ex) {
211:            throw new RuntimeException(ex);
            }
        }
137:    v0 = this.b.a(p0);
141:    if (v0 != 0 && p0.startsWith("data"))
151:        v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
        else
212:        v0 = 0;
155:    return v0;
156:    try {
156:        v0 = "";
        }
        catch (InterruptedException ex) {
211:        throw new RuntimeException(ex);
        }
158:    goto 114;
211:    throw new RuntimeException(ex);
216:    try
            run 49...120
        catch (InterruptedException ex) {
 49:        goto 205;
        }
    }

    public final com.google.android.finsky.billing.addresschallenge.a.i b(String p0) {
        if (p0.split("/").length == 1) {
            v0 = (com.google.android.finsky.billing.addresschallenge.a.ah)this.a.get(p0);
            if (v0 == 0 || !p0.startsWith("data"))
                throw new RuntimeException((String.valueOf(p0).length() + 33) + "key " + p0 + " does not have bootstrap data");
            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
        }
        else {
            if (p0.split("/").length <= 1)
                throw new RuntimeException((String.valueOf(p0).length() + 34) + "Cannot get country key with key '" + p0 + "'");
            if (!com.google.android.finsky.billing.addresschallenge.a.x.c(p0)) {
                v0 = p0.split("/");
                p0 = v0[0] + "/" + v0[1];
            }
            v0 = (com.google.android.finsky.billing.addresschallenge.a.ah)this.a.get(p0);
            if (v0 == 0 || !p0.startsWith("data"))
                throw new RuntimeException((String.valueOf(p0).length() + 33) + "key " + p0 + " does not have bootstrap data");
            v0 = com.google.android.finsky.billing.addresschallenge.a.x.a(v0);
        }
        return v0;
    }

}
