package com.android.volley.a;

import com.android.volley.aa;
import com.android.volley.b;
import com.android.volley.j;
import com.android.volley.m;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

static class com.android.volley.a.n
{

    public static long a(String p0) {
        try {
            v0 = com.android.volley.a.n.a().parse(p0).getTime();
        }
        catch (ParseException ex) {
            v2 = new Object[1];
            v2[0] = p0;
            com.android.volley.aa.a(ex, "Unable to parse dateStr: %s, falling back to 0", v2);
            v0 = 0;
        }
        return v0;
    }

    public static com.android.volley.b a(com.android.volley.m p0) {
        v22 = System.currentTimeMillis();
        v4 = 0;
        v10 = 0;
        v8 = 0;
        v2 = (String)p0.c.get("Date");
        if (v2 != 0)
            v4 = com.android.volley.a.n.a(v2);
        v2 = p0.c.get("Cache-Control");
        if ((String)v2 != 0) {
            v13 = ((String)v2).split(",");
            v2 = 0;
            v3 = 0;
            v6 = 0;
            v8 = 0;
            while (v2 < v13.length) {
                v10 = v13[v2].trim();
                if (v10.equals("no-cache")) {
                    v2 = 0;
                    return v2;
                }
                if (v10.equals("no-store")) {
                    v2 = 0;
                    return v2;
                }
                if (v10.startsWith("max-age=")) {
                    try {
                        v8 = Long.parseLong(v10.substring(8));
                    }
                    catch (Exception ex) {
                    }
                }
                else if (v10.startsWith("stale-while-revalidate=")) {
                    try {
                        v6 = Long.parseLong(v10.substring(23));
                    }
                    catch (Exception ex) {
                    }
                }
                else if ((v10.equals("must-revalidate")) || v10.equals("proxy-revalidate"))
                    v3 = 1;
                v2 = v2 + 1;
            }
            v10 = v8;
            v8 = v6;
            v6 = 1;
        }
        else {
            v3 = 0;
            v6 = 0;
        }
        v2 = p0.c.get("Expires");
        if ((String)v2 != 0)
            v12 = com.android.volley.a.n.a((String)v2);
        else
            v12 = 0;
        v2 = p0.c.get("Last-Modified");
        if ((String)v2 != 0)
            v14 = com.android.volley.a.n.a((String)v2);
        else
            v14 = 0;
        if (v6 != 0) {
            v10 = v22 + 1000 * v10;
            if (v3 != 0)
                v6 = v10;
            else
                v6 = 1000 * v8 + v10;
        }
        else if (v4 > 0 && v12 >= v4) {
            v6 = v12 - v4 + v22;
            v10 = v6;
        }
        else {
            v6 = 0;
            v10 = 0;
        }
        v3 = new com.android.volley.b();
        v3.a = p0.b;
        v3.b = (String)p0.c.get("ETag");
        v3.f = v10;
        v3.e = v6;
        v3.c = v4;
        v3.d = v14;
        v3.g = p0.c;
        v3.h = p0.d;
        v2 = v3;
        return v2;
    }

    public static String a(Map p0) {
        return com.android.volley.a.n.a(p0, "ISO-8859-1");
    }

    public static String a(Map p0, String p1) {
  7:    v0 = (String)p0.get("Content-Type");
  9:    if (v0 == 0)
 50:        return p1;
 13:    v2 = v0.split(";");
 17:    v0 = 1;
 18:    while (true) {
 19:        if (v0 >= v2.length)
 50:            return p1;
 29:        v3 = v2[v0].trim().split("=");
 35:        if (v3.length == 2)
 35:            break;
 51:        v0 = v0 + 1;
        }
 46:    if (!v3[0].equals("charset")) goto 51;
 48:    p1 = v3[1];
 50:    return p1;
    }

    static SimpleDateFormat a() {
        v0 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        v0.setTimeZone(TimeZone.getTimeZone("GMT"));
        return v0;
    }

    static Map a(List p0) {
        v1 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        v2 = p0.iterator();
        while (v2.hasNext()) {
            v0 = (com.android.volley.j)v2.next();
            v1.put(v0.a, v0.b);
        }
        return v1;
    }

    static List b(Map p0) {
        v2 = new ArrayList(p0.size());
        v3 = p0.entrySet().iterator();
        while (v3.hasNext()) {
            v0 = (Map$Entry)v3.next();
            v2.add(new com.android.volley.j((String)v0.getKey(), (String)v0.getValue()));
        }
        return v2;
    }

}
