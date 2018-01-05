package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class af {
    public final String f8825a = m9537a("ZZ", C1708c.FMT);
    public final ad f8826b;

    af(ad adVar) {
        az.m9578a(as.f8852a, "null country name map not allowed");
        az.m9577a((Object) adVar);
        this.f8826b = adVar;
        az.m9578a(this.f8825a, "null default format not allowed");
    }

    public final List m9540a(ao aoVar, String str) {
        az.m9577a((Object) aoVar);
        az.m9577a((Object) str);
        List arrayList = new ArrayList();
        for (String str2 : m9539b(aoVar, str)) {
            if (str2.matches("%.") && !str2.equals("%n")) {
                arrayList.add(C1709d.m9587a(str2.charAt(1)));
            }
        }
        m9538a(str, arrayList);
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) arrayList;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C1709d c1709d = (C1709d) obj;
            if (c1709d == C1709d.STREET_ADDRESS) {
                arrayList2.add(C1709d.ADDRESS_LINE_1);
                arrayList2.add(C1709d.ADDRESS_LINE_2);
            } else {
                arrayList2.add(c1709d);
            }
        }
        return arrayList2;
    }

    private final void m9538a(String str, List list) {
        int i = 0;
        if (this.f8826b.m9534a(str) != null) {
            Map hashMap = new HashMap();
            int i2 = 0;
            for (Object put : this.f8826b.m9534a(str)) {
                hashMap.put(put, Integer.valueOf(i2));
                i2++;
            }
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            i2 = 0;
            for (C1709d c1709d : list) {
                if (hashMap.containsKey(c1709d)) {
                    arrayList.add(c1709d);
                    arrayList2.add(Integer.valueOf(i2));
                }
                i2++;
            }
            Collections.sort(arrayList, new ag(hashMap));
            while (i < arrayList.size()) {
                list.set(((Integer) arrayList2.get(i)).intValue(), (C1709d) arrayList.get(i));
                i++;
            }
        }
    }

    private final List m9539b(ao aoVar, String str) {
        String a;
        if (aoVar == ao.LOCAL) {
            a = m9537a(str, C1708c.FMT);
        } else {
            a = m9537a(str, C1708c.LFMT);
        }
        List arrayList = new ArrayList();
        int i = 0;
        for (char c : a.toCharArray()) {
            if (i != 0) {
                if ("%n".equals("%" + c)) {
                    arrayList.add("%n");
                    i = 0;
                } else {
                    az.m9578a(C1709d.m9587a(c), new StringBuilder(String.valueOf(a).length() + 46).append("Unrecognized character '").append(c).append("' in format pattern: ").append(a).toString());
                    arrayList.add("%" + c);
                    i = 0;
                }
            } else if (c == '%') {
                i = 1;
            } else {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    private final String m9537a(String str, C1708c c1708c) {
        az.m9577a((Object) str);
        String str2 = (String) as.f8852a.get(str);
        if (str2 == null) {
            return this.f8825a;
        }
        try {
            JSONObject jSONObject = new JSONObject(new JSONTokener(str2));
            if (jSONObject.has(c1708c.name().toLowerCase())) {
                return jSONObject.getString(c1708c.name().toLowerCase());
            }
            return this.f8825a;
        } catch (JSONException e) {
            throw new RuntimeException(new StringBuilder((String.valueOf(str).length() + 31) + String.valueOf(str2).length()).append("Invalid json for region code ").append(str).append(": ").append(str2).toString());
        }
    }
}
