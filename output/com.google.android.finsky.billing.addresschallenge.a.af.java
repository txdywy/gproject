package com.google.android.finsky.billing.addresschallenge.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class com.google.android.finsky.billing.addresschallenge.a.af
{

    public final String a;
    public final com.google.android.finsky.billing.addresschallenge.a.ad b;

    af(com.google.android.finsky.billing.addresschallenge.a.ad p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(com.google.android.finsky.billing.addresschallenge.a.as.a, "null country name map not allowed");
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
        this.b = p0;
        this.a = this.a("ZZ", com.google.android.finsky.billing.addresschallenge.a.c.b);
        com.google.android.finsky.billing.addresschallenge.a.az.a(this.a, "null default format not allowed");
    }

    private final String a(String p0, com.google.android.finsky.billing.addresschallenge.a.c p1) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
        v0 = (String)com.google.android.finsky.billing.addresschallenge.a.as.a.get(p0);
        if (v0 == 0)
            v0 = this.a;
        else {
            try {
                v1 = new JSONObject(new JSONTokener(v0));
                if (!v1.has(p1.name().toLowerCase()))
                    v0 = this.a;
                else
                    v0 = v1.getString(p1.name().toLowerCase());
            }
            catch (JSONException ex) {
                throw new RuntimeException((String.valueOf(p0).length() + 31 + String.valueOf(v0).length()) + "Invalid json for region code " + p0 + ": " + v0);
            }
        }
        return v0;
    }

    private final void a(String p0, List p1) {
        v2 = 0;
        if (this.b.a(p0) != 0) {
            v3 = new HashMap();
            v4 = this.b.a(p0);
            v0 = 0;
            v1 = 0;
            while (v0 < v4.length) {
                v3.put(v4[v0], Integer.valueOf(v1));
                v1 = v1 + 1;
                v0 = v0 + 1;
            }
            v4 = new ArrayList();
            v5 = new ArrayList();
            v6 = p1.iterator();
            v1 = 0;
            while (v6.hasNext()) {
                v0 = (com.google.android.finsky.billing.addresschallenge.a.d)v6.next();
                if (v3.containsKey(v0)) {
                    v4.add(v0);
                    v5.add(Integer.valueOf(v1));
                }
                v1 = v1 + 1;
            }
            Collections.sort(v4, new com.google.android.finsky.billing.addresschallenge.a.ag(v3));
            while (v2 < v4.size()) {
                p1.set(((Integer)v5.get(v2)).intValue(), (com.google.android.finsky.billing.addresschallenge.a.d)v4.get(v2));
                v2 = v2 + 1;
            }
        }
    }

    private final List b(com.google.android.finsky.billing.addresschallenge.a.ao p0, String p1) {
        if (p0 == com.google.android.finsky.billing.addresschallenge.a.ao.b)
            v0 = this.a(p1, com.google.android.finsky.billing.addresschallenge.a.c.b);
        else
            v0 = this.a(p1, com.google.android.finsky.billing.addresschallenge.a.c.f);
        v5 = new ArrayList();
        v6 = v0.toCharArray();
        v4 = 0;
        v1 = 0;
        while (v4 < v6.length) {
            if (v1 != 0) {
                if ("%n".equals(2 + "%" + v6[v4])) {
                    v5.add("%n");
                    v1 = 0;
                }
                else {
                    com.google.android.finsky.billing.addresschallenge.a.az.a(com.google.android.finsky.billing.addresschallenge.a.d.a(v6[v4]), (String.valueOf(v0).length() + 46) + "Unrecognized character '" + v6[v4] + "' in format pattern: " + v0);
                    v5.add(2 + "%" + v6[v4]);
                    v1 = 0;
                }
            }
            else if (v6[v4] == 37)
                v1 = 1;
            else
                v5.add(1 + v6[v4]);
            v4 = v4 + 1;
        }
        return v5;
    }

    public final List a(com.google.android.finsky.billing.addresschallenge.a.ao p0, String p1) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
        com.google.android.finsky.billing.addresschallenge.a.az.a(p1);
        v1 = new ArrayList();
        v2 = this.b(p0, p1).iterator();
        while (v2.hasNext()) {
            v0 = (String)v2.next();
            if (!v0.matches("%."))
                continue;
            if (v0.equals("%n"))
                continue;
            v1.add(com.google.android.finsky.billing.addresschallenge.a.d.a(v0.charAt(1)));
        }
        this.a(p1, v1);
        v3 = new ArrayList();
        v2 = 0;
        while (v2 < ((ArrayList)v1).size()) {
            v1 = ((ArrayList)v1).get(v2);
            v2 = v2 + 1;
            if ((com.google.android.finsky.billing.addresschallenge.a.d)v1 == com.google.android.finsky.billing.addresschallenge.a.d.j) {
                v3.add(com.google.android.finsky.billing.addresschallenge.a.d.e);
                v3.add(com.google.android.finsky.billing.addresschallenge.a.d.f);
            }
            else
                v3.add((com.google.android.finsky.billing.addresschallenge.a.d)v1);
        }
        return v3;
    }

}
