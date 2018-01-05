package com.google.android.finsky.billing.addresschallenge.p156a;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

public final class C1723r {
    public String f9000a;
    public final ah f9001b;
    public final C1706w f9002c;
    public final HashSet f9003d;
    public final HashSet f9004e;
    public final HashMap f9005f;

    public C1723r() {
        this(new au());
    }

    public C1723r(C1706w c1706w) {
        this.f9003d = new HashSet();
        this.f9004e = new HashSet();
        this.f9005f = new HashMap();
        this.f9002c = c1706w;
        Object a = this.f9002c.mo2415a();
        az.m9578a(a, "Cannot set URL of address data server to null.");
        this.f9000a = a;
        this.f9001b = new ah();
    }

    static void m9609a(C1705y c1705y) {
        if (c1705y != null) {
            c1705y.mo2414b();
        }
    }

    final void m9611a(al alVar, JSONObject jSONObject, C1705y c1705y) {
        az.m9578a((Object) alVar, "null key not allowed.");
        c1705y.mo2413a();
        if (this.f9001b.m9547c(alVar.toString())) {
            C1723r.m9609a(c1705y);
        } else if (this.f9004e.contains(alVar.toString())) {
            C1723r.m9609a(c1705y);
        } else if (this.f9003d.add(alVar.toString())) {
            C1727v c1727v;
            String str;
            String a = this.f9002c.mo2416a(alVar.toString());
            if (a != null && a.length() > 0) {
                c1727v = new C1727v(this, alVar.toString(), jSONObject, c1705y);
                try {
                    JSONObject a2 = ah.m9541a(a);
                    String str2;
                    if (a2 == null) {
                        str = "CacheData";
                        str2 = "server returns null for key:";
                        r1 = String.valueOf(c1727v.f9011a);
                        Log.w(str, r1.length() != 0 ? str2.concat(r1) : new String(str2));
                        c1727v.f9014d.f9004e.add(c1727v.f9011a);
                        c1727v.f9014d.m9612b(c1727v.f9011a);
                        C1723r.m9609a(c1727v.f9013c);
                        return;
                    } else if (a2.has(C1708c.ID.name().toLowerCase())) {
                        if (c1727v.f9012b != null) {
                            a2.m9544a((ah) c1727v.f9012b);
                        }
                        c1727v.f9014d.f9001b.m9545a(c1727v.f9011a, a2);
                        c1727v.f9014d.m9612b(c1727v.f9011a);
                        C1723r.m9609a(c1727v.f9013c);
                        return;
                    } else {
                        str = "CacheData";
                        str2 = "invalid or empty data returned for key: ";
                        r1 = String.valueOf(c1727v.f9011a);
                        Log.w(str, r1.length() != 0 ? str2.concat(r1) : new String(str2));
                        c1727v.f9014d.f9004e.add(c1727v.f9011a);
                        c1727v.f9014d.m9612b(c1727v.f9011a);
                        C1723r.m9609a(c1727v.f9013c);
                        return;
                    }
                } catch (JSONException e) {
                    r1 = "CacheData";
                    str = "Data from client's cache is in the wrong format: ";
                    String valueOf = String.valueOf(a);
                    Log.w(r1, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
            ai aiVar = new ai();
            HttpParams params = ak.f8828a.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 5000);
            HttpConnectionParams.setSoTimeout(params, 5000);
            c1727v = new C1727v(this, alVar.toString(), jSONObject, c1705y);
            r1 = this.f9000a;
            str = alVar.toString();
            new ak(new HttpGet(ai.m9548a(new StringBuilder((String.valueOf(r1).length() + 1) + String.valueOf(str).length()).append(r1).append("/").append(str).toString())), new C1726t(this, alVar, c1705y, c1727v)).start();
        } else {
            r1 = String.valueOf(alVar);
            Log.d("CacheData", new StringBuilder(String.valueOf(r1).length() + 42).append("data for key ").append(r1).append(" requested but not cached yet").toString());
            Object c1725s = new C1725s(c1705y);
            az.m9577a((Object) alVar);
            az.m9577a(c1725s);
            HashSet hashSet = (HashSet) this.f9005f.get(alVar);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f9005f.put(alVar, hashSet);
            }
            hashSet.add(c1725s);
        }
    }

    public final ah m9610a(String str) {
        az.m9578a((Object) str, "null key not allowed");
        return this.f9001b.m9546b(str);
    }

    final void m9612b(String str) {
        HashSet hashSet = (HashSet) this.f9005f.get(new am(str).m9554a());
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1724u c1724u = (C1724u) it.next();
                str.toString();
                c1724u.mo2418a();
            }
            hashSet.clear();
        }
    }
}
