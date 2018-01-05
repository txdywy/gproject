package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C7601b;
import com.squareup.okhttp.C7678j;
import com.squareup.okhttp.C7689v;
import com.squareup.okhttp.ag;
import com.squareup.okhttp.ah;
import com.squareup.okhttp.ak;
import com.squareup.okhttp.internal.C7646f;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class C7671w {
    public static final Comparator f39702a = new C7672x();
    public static final String f39703b = C7646f.m36885a();
    public static final String f39704c = (f39703b + "-Sent-Millis");
    public static final String f39705d = (f39703b + "-Received-Millis");

    public static long m36981a(ag agVar) {
        return C7671w.m36983a(agVar.f39290c);
    }

    public static long m36982a(ak akVar) {
        return C7671w.m36983a(akVar.f39309f);
    }

    public static long m36983a(C7689v c7689v) {
        return C7671w.m36988b(c7689v.m37014a("Content-Length"));
    }

    private static long m36988b(String str) {
        long j = -1;
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    public static Map m36989b(C7689v c7689v) {
        Map treeMap = new TreeMap(f39702a);
        int length = c7689v.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = c7689v.m37013a(i);
            String b = c7689v.m37017b(i);
            List arrayList = new ArrayList();
            List list = (List) treeMap.get(a);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(b);
            treeMap.put(a, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static void m36986a(ah ahVar, Map map) {
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List) entry.getValue()).isEmpty()) {
                String str2;
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    str2 = (String) list.get(0);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            stringBuilder.append("; ");
                        }
                        stringBuilder.append((String) list.get(i));
                    }
                    str2 = stringBuilder.toString();
                }
                ahVar.m36642b(str, str2);
            }
        }
    }

    static boolean m36987a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static List m36985a(C7689v c7689v, String str) {
        List arrayList = new ArrayList();
        int length = c7689v.f39793a.length / 2;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(c7689v.m37013a(i))) {
                String b = c7689v.m37017b(i);
                int i2 = 0;
                while (i2 < b.length()) {
                    int a = C7653e.m36923a(b, i2, " ");
                    String trim = b.substring(i2, a).trim();
                    a = C7653e.m36922a(b, a);
                    if (!b.regionMatches(true, a, "realm=\"", 0, 7)) {
                        break;
                    }
                    i2 = a + 7;
                    a = C7653e.m36923a(b, i2, "\"");
                    String substring = b.substring(i2, a);
                    i2 = C7653e.m36922a(b, C7653e.m36923a(b, a + 1, ",") + 1);
                    arrayList.add(new C7678j(trim, substring));
                }
            }
        }
        return arrayList;
    }

    public static ag m36984a(C7601b c7601b, ak akVar, Proxy proxy) {
        if (akVar.f39306c == 407) {
            return c7601b.mo6466b(proxy, akVar);
        }
        return c7601b.mo6465a(proxy, akVar);
    }

    static {
        new StringBuilder().append(f39703b).append("-Selected-Protocol");
        new StringBuilder().append(f39703b).append("-Response-Source");
    }
}
