package com.google.android.finsky.billing.addresschallenge.p156a;

import android.util.Log;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public final class C1729x implements C1728z {
    public final Map f9015a = new HashMap();
    public C1723r f9016b;

    public C1729x(C1723r c1723r) {
        this.f9016b = c1723r;
        m9620a();
    }

    public final C1714i mo2421a(String str) {
        ah a = this.f9016b.m9610a(str);
        if (a == null) {
            if (this.f9016b.m9610a(str) == null) {
                a = (ah) this.f9015a.get(str);
                Object apVar = new ap(this);
                if (al.m9552a(str)) {
                    Object a2 = new am(str).m9554a();
                    this.f9016b.m9611a(a2, a, apVar);
                    try {
                        apVar.m9558c();
                        if (this.f9016b.m9610a(str) == null && C1729x.m9621c(str)) {
                            String alVar;
                            Object substring;
                            Log.i("ClientData", "Server failure: looking up key in region data constants.");
                            C1723r c1723r = this.f9016b;
                            az.m9578a(a2, "null key not allowed.");
                            Map map = as.f8852a;
                            al a3 = a2.m9553a(C1709d.COUNTRY);
                            if (a3 != null) {
                                alVar = a3.toString();
                                int lastIndexOf = alVar.lastIndexOf("/");
                                if (lastIndexOf > 0 && lastIndexOf != alVar.length()) {
                                    substring = alVar.substring(lastIndexOf + 1);
                                    alVar = (String) map.get(substring);
                                    if (alVar != null) {
                                        try {
                                            c1723r.f9001b.m9545a(a2.toString(), ah.m9541a(alVar));
                                        } catch (JSONException e) {
                                            String valueOf = String.valueOf(a2);
                                            Log.w("CacheData", new StringBuilder(String.valueOf(valueOf).length() + 54).append("Failed to parse data for key ").append(valueOf).append(" from RegionDataConstants").toString());
                                        }
                                    }
                                }
                            }
                            substring = "";
                            alVar = (String) map.get(substring);
                            if (alVar != null) {
                                c1723r.f9001b.m9545a(a2.toString(), ah.m9541a(alVar));
                            }
                        }
                    } catch (Throwable e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
            a = this.f9016b.m9610a(str);
        }
        if (a == null || !str.startsWith("data")) {
            return null;
        }
        return C1729x.m9619a(a);
    }

    public final C1714i mo2422b(String str) {
        ah ahVar;
        if (str.split("/").length == 1) {
            ahVar = (ah) this.f9015a.get(str);
            if (ahVar != null && str.startsWith("data")) {
                return C1729x.m9619a(ahVar);
            }
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 33).append("key ").append(str).append(" does not have bootstrap data").toString());
        } else if (str.split("/").length <= 1) {
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 34).append("Cannot get country key with key '").append(str).append("'").toString());
        } else {
            if (!C1729x.m9621c(str)) {
                String[] split = str.split("/");
                str = split[0] + "/" + split[1];
            }
            ahVar = (ah) this.f9015a.get(str);
            if (ahVar != null && str.startsWith("data")) {
                return C1729x.m9619a(ahVar);
            }
            throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 33).append("key ").append(str).append(" does not have bootstrap data").toString());
        }
    }

    private static boolean m9621c(String str) {
        az.m9578a((Object) str, "Cannot use null as a key");
        return str.split("/").length == 2;
    }

    private static C1714i m9619a(ah ahVar) {
        Map enumMap = new EnumMap(C1708c.class);
        JSONArray a = ahVar.m9543a();
        for (int i = 0; i < a.length(); i++) {
            try {
                C1708c c1708c = (C1708c) C1708c.f8931p.get(a.getString(i).toLowerCase());
                if (c1708c != null) {
                    enumMap.put(c1708c, (String) ahVar.get(c1708c.toString().toLowerCase()));
                }
            } catch (JSONException e) {
            }
        }
        return new C1714i(enumMap);
    }

    private final void m9620a() {
        Object obj = null;
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : as.f8852a.keySet()) {
            Object a;
            stringBuilder.append(String.valueOf(str).concat("~"));
            try {
                a = ah.m9541a((String) as.f8852a.get(str));
            } catch (JSONException e) {
                a = obj;
            }
            this.f9015a.put(new am(an.DATA).m9555a(new C1707b().m9586a(str).m9584a()).m9554a().toString(), a);
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        String str2 = C1708c.COUNTRIES.toString().toLowerCase();
        String stringBuilder2 = stringBuilder.toString();
        try {
            obj = ah.m9541a(new StringBuilder((String.valueOf(str2).length() + 20) + String.valueOf(stringBuilder2).length()).append("{\"id\":\"data\",\"").append(str2).append("\": \"").append(stringBuilder2).append("\"}").toString());
        } catch (JSONException e2) {
        }
        this.f9015a.put("data", obj);
    }
}
