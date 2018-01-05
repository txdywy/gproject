package com.android.volley.p060a;

import com.android.volley.C0684b;
import com.android.volley.C0695j;
import com.android.volley.C0697m;
import com.android.volley.aa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

public final class C0673n {
    public static C0684b m4460a(C0697m c0697m) {
        Object obj;
        long j;
        Object obj2;
        long a;
        long a2;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = c0697m.f4168c;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = (String) map.get("Date");
        if (str != null) {
            j2 = C0673n.m4459a(str);
        }
        str = (String) map.get("Cache-Control");
        if (str != null) {
            String[] split = str.split(",");
            obj = null;
            j = 0;
            j4 = 0;
            for (String trim : split) {
                String trim2 = trim2.trim();
                if (trim2.equals("no-cache") || trim2.equals("no-store")) {
                    return null;
                }
                if (trim2.startsWith("max-age=")) {
                    try {
                        j4 = Long.parseLong(trim2.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim2.startsWith("stale-while-revalidate=")) {
                    try {
                        j = Long.parseLong(trim2.substring(23));
                    } catch (Exception e2) {
                    }
                } else if (trim2.equals("must-revalidate") || trim2.equals("proxy-revalidate")) {
                    obj = 1;
                }
            }
            j3 = j4;
            j4 = j;
            obj2 = 1;
        } else {
            obj = null;
            obj2 = null;
        }
        str = (String) map.get("Expires");
        if (str != null) {
            a = C0673n.m4459a(str);
        } else {
            a = 0;
        }
        str = (String) map.get("Last-Modified");
        if (str != null) {
            a2 = C0673n.m4459a(str);
        } else {
            a2 = 0;
        }
        str = (String) map.get("ETag");
        if (obj2 != null) {
            j3 = currentTimeMillis + (1000 * j3);
            if (obj != null) {
                j = j3;
            } else {
                j = (1000 * j4) + j3;
            }
        } else if (j2 <= 0 || a < j2) {
            j = 0;
            j3 = 0;
        } else {
            j = (a - j2) + currentTimeMillis;
            j3 = j;
        }
        C0684b c0684b = new C0684b();
        c0684b.f4131a = c0697m.f4167b;
        c0684b.f4132b = str;
        c0684b.f4136f = j3;
        c0684b.f4135e = j;
        c0684b.f4133c = j2;
        c0684b.f4134d = a2;
        c0684b.f4137g = map;
        c0684b.f4138h = c0697m.f4169d;
        return c0684b;
    }

    public static long m4459a(String str) {
        try {
            return C0673n.m4463a().parse(str).getTime();
        } catch (Throwable e) {
            aa.m4481a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    static SimpleDateFormat m4463a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static String m4462a(Map map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 == null) {
            return str;
        }
        String[] split = str2.split(";");
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=");
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return str;
    }

    public static String m4461a(Map map) {
        return C0673n.m4462a(map, "ISO-8859-1");
    }

    static Map m4464a(List list) {
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0695j c0695j : list) {
            treeMap.put(c0695j.f4159a, c0695j.f4160b);
        }
        return treeMap;
    }

    static List m4465b(Map map) {
        List arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C0695j((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
