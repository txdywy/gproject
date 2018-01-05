package com.google.android.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

private static class com.google.android.c.g
{

    public static final Uri a;
    public static final Uri b;
    public static final Pattern c;
    public static final Pattern d;
    public static final AtomicBoolean e;
    public static HashMap f;
    public static final HashMap g;
    public static final HashMap h;
    public static final HashMap i;
    public static final HashMap j;
    public static Object k;
    public static boolean l;
    public static String[] m;

    static {
        com.google.android.c.g.a = Uri.parse("content://com.google.android.gsf.gservices");
        com.google.android.c.g.b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        com.google.android.c.g.c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        com.google.android.c.g.d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        com.google.android.c.g.e = new AtomicBoolean();
        com.google.android.c.g.g = new HashMap();
        com.google.android.c.g.h = new HashMap();
        com.google.android.c.g.i = new HashMap();
        com.google.android.c.g.j = new HashMap();
        com.google.android.c.g.m = new String[0];
    }

    g() {
    }

    public static float a(ContentResolver p0, String p1) {
 13:    v0 = com.google.android.c.g.a(com.google.android.c.g.j, p1, Float.valueOf(1064514355));
 19:    if ((Float)v0 != 0) {
 21:        v0 = ((Float)v0).floatValue();
 25:        return v0;
        }
 27:    v2 = com.google.android.c.g.a(p0, p1, 0);
 31:    if (v2 != 0) goto 42;
 34:    v1 = (Float)v0;
 35:    v0 = 1064514355;
 38:    com.google.android.c.g.a(com.google.android.c.g.a(p0), com.google.android.c.g.j, p1, v1);
 41:    return v0;
 42:    v2 = Float.parseFloat(v2);
 50:    v1 = Float.valueOf(v2);
 51:    v0 = v2;
 52:    goto 36;
 55:    v1 = (Float)v0;
 56:    v0 = 1064514355;
 57:    goto 36;
 58:    try
            run 42...49
        catch (NumberFormatException ex) {
 42:        goto 53;
        }
    }

    public static int a(ContentResolver p0, String p1, int p2) {
 14:    v0 = (Integer)com.google.android.c.g.a(com.google.android.c.g.h, p1, Integer.valueOf(p2));
 16:    if (v0 != 0) {
 18:        p2 = v0.intValue();
 22:        return p2;
        }
 24:    v1 = com.google.android.c.g.a(p0, p1, 0);
 28:    if (v1 != 0) goto 36;
 32:    com.google.android.c.g.a(com.google.android.c.g.a(p0), com.google.android.c.g.h, p1, v0);
 35:    return p2;
 36:    v1 = Integer.parseInt(v1);
 40:    v0 = Integer.valueOf(v1);
 44:    p2 = v1;
 45:    goto 30;
 47:    goto 30;
 48:    try
            run 36...43
        catch (NumberFormatException ex) {
 36:        goto 46;
        }
    }

    public static long a(ContentResolver p0, String p1, long p2) {
 14:    v0 = (Long)com.google.android.c.g.a(com.google.android.c.g.i, p1, Long.valueOf(p2));
 16:    if (v0 != 0) {
 18:        p2 = v0.longValue();
 22:        return p2;
        }
 24:    v2 = com.google.android.c.g.a(p0, p1, 0);
 28:    if (v2 != 0) goto 36;
 32:    com.google.android.c.g.a(com.google.android.c.g.a(p0), com.google.android.c.g.i, p1, v0);
 35:    return p2;
 36:    v2 = Long.parseLong(v2);
 40:    v0 = Long.valueOf(v2);
 44:    p2 = v2;
 45:    goto 30;
 47:    goto 30;
 48:    try
            run 36...43
        catch (NumberFormatException ex) {
 36:        goto 46;
        }
    }

    public static Object a(ContentResolver p0) {
        enter com.google.android.c.g;
        try {
            com.google.android.c.g.b(p0);
            exit com.google.android.c.g;
            return com.google.android.c.g.k;
            exit com.google.android.c.g;
        }
        catch (Throwable ex) {
            exit com.google.android.c.g;
            throw ex;
        }
    }

    private static Object a(HashMap p0, String p1, Object p2) {
        enter com.google.android.c.g;
        try {
            if (p0.containsKey(p1)) {
                v0 = p0.get(p1);
                if (v0 != 0) {
                }
                else
                    v0 = p2;
                exit com.google.android.c.g;
            }
            else {
                exit com.google.android.c.g;
                v0 = 0;
            }
            return v0;
            exit com.google.android.c.g;
        }
        catch (Throwable ex) {
            exit com.google.android.c.g;
            throw ex;
        }
    }

    public static String a(ContentResolver p0, String p1, String p2) {
  3:    v1 = com.google.android.c.g;
  5:    enter com.google.android.c.g;
  6:    com.google.android.c.g.b(p0);
 17:    if (com.google.android.c.g.f.containsKey(p1)) {
 21:        v0 = com.google.android.c.g.f.get(p1);
 27:        if ((String)v0 != 0)
 29:            p2 = (String)v0;
 30:        exit com.google.android.c.g;
 31:        return p2;
        }
 35:    v0 = 0;
 36:    if (v0 >= com.google.android.c.g.m.length) goto 92;
 44:    if (p1.startsWith(com.google.android.c.g.m[v0])) {
 48:        if (com.google.android.c.g.l == 0 || com.google.android.c.g.f.isEmpty()) {
 60:            com.google.android.c.g.c(p0, com.google.android.c.g.m);
 69:            if (com.google.android.c.g.f.containsKey(p1)) {
 73:                v0 = com.google.android.c.g.f.get(p1);
 79:                if ((String)v0 != 0)
 81:                    p2 = (String)v0;
 82:                exit com.google.android.c.g;
                }
                else
 87:                exit com.google.android.c.g;
            }
            else
 87:            exit com.google.android.c.g;
 83:        return p2;
        }
 45:    goto 89;
 85:    exit v1;
 86:    throw ex;
 87:    exit com.google.android.c.g;
 88:    return p2;
 89:    v0 = v0 + 1;
 91:    goto 36;
 92:    exit com.google.android.c.g;
 95:    v4 = new String[1];
 97:    v4[0] = p1;
102:    v1 = p0.query(com.google.android.c.g.a, 0, 0, v4, 0);
106:    if (v1 == 0) goto 114;
108:    try {
112:        if (!v1.moveToFirst()) {
115:            com.google.android.c.g.a(com.google.android.c.g.k, p1, 0);
118:            if (v1 != 0)
120:                v1.close();
            }
            else {
125:            try {
125:                v0 = v1.getString(1);
129:                if (v0 != 0) {
135:                    if (v0.equals(p2))
137:                        v0 = p2;
                    }
138:                com.google.android.c.g.a(com.google.android.c.g.k, p1, v0);
                }
                catch (Throwable ex) {
151:                if (v1 != 0)
153:                    v1.close();
156:                throw ex;
                }
141:            if (v0 != 0)
143:                p2 = v0;
144:            if (v1 != 0)
146:                v1.close();
            }
        }
        catch (Throwable ex) {
151:        if (v1 != 0)
153:            v1.close();
156:        throw ex;
        }
123:    return p2;
159:    try
            run 87...93
        catch (Throwable ex) {
 87:        goto 84;
        }
160:    try
            run 6...86
        catch (Throwable ex) {
  6:        goto 84;
        }
    }

    public static Map a(ContentResolver p0, String[] p1) {
        v1 = p0.query(com.google.android.c.g.b, 0, 0, p1, 0);
        v0 = new TreeMap();
        if (v1 == 0)
            return v0;
        try {
            while (v1.moveToNext())
                v0.put(v1.getString(0), v1.getString(1));
        }
        catch (Throwable ex) {
            v1.close();
            throw ex;
        }
        v1.close();
        return v0;
    }

    private static void a(Object p0, String p1, String p2) {
        enter com.google.android.c.g;
        try {
            if (p0 == com.google.android.c.g.k)
                com.google.android.c.g.f.put(p1, p2);
            exit com.google.android.c.g;
            return;
            exit com.google.android.c.g;
        }
        catch (Throwable ex) {
            exit com.google.android.c.g;
            throw ex;
        }
    }

    private static void a(Object p0, HashMap p1, String p2, Object p3) {
        enter com.google.android.c.g;
        try {
            if (p0 == com.google.android.c.g.k) {
                p1.put(p2, p3);
                com.google.android.c.g.f.remove(p2);
            }
            exit com.google.android.c.g;
            return;
            exit com.google.android.c.g;
        }
        catch (Throwable ex) {
            exit com.google.android.c.g;
            throw ex;
        }
    }

    public static boolean a(ContentResolver p0, String p1, boolean p2) {
        v0 = (Boolean)com.google.android.c.g.a(com.google.android.c.g.g, p1, Boolean.valueOf(p2));
        if (v0 != 0)
            p2 = v0.booleanValue();
        else {
            v4 = com.google.android.c.g.a(p0, p1, 0);
            if (v4 != 0 && !v4.equals("")) {
                if (com.google.android.c.g.c.matcher(v4).matches()) {
                    v0 = Boolean.valueOf(1);
                    p2 = 1;
                }
                else if (com.google.android.c.g.d.matcher(v4).matches()) {
                    v0 = Boolean.valueOf(0);
                    p2 = 0;
                }
                else
                    Log.w("Gservices", "attempt to read gservices key " + p1 + " (value \"" + v4 + "\") as boolean");
            }
            com.google.android.c.g.a(com.google.android.c.g.a(p0), com.google.android.c.g.g, p1, v0);
        }
        return p2;
    }

    private static void b(ContentResolver p0) {
        if (com.google.android.c.g.f == 0) {
            com.google.android.c.g.e.set(0);
            com.google.android.c.g.f = new HashMap();
            com.google.android.c.g.k = new Object();
            com.google.android.c.g.l = 0;
            p0.registerContentObserver(com.google.android.c.g.a, 1, new com.google.android.c.h());
        }
        else if (com.google.android.c.g.e.getAndSet(0)) {
            com.google.android.c.g.f.clear();
            com.google.android.c.g.g.clear();
            com.google.android.c.g.h.clear();
            com.google.android.c.g.i.clear();
            com.google.android.c.g.j.clear();
            com.google.android.c.g.k = new Object();
            com.google.android.c.g.l = 0;
        }
    }

    public static void b(ContentResolver p0, String[] p1) {
        v0 = 0;
        if (p1.length == 0)
            return;
        enter com.google.android.c.g;
        try {
            com.google.android.c.g.b(p0);
            v3 = new HashSet((com.google.android.c.g.m.length + p1.length) * 4 / 3 + 1);
            v3.addAll(Arrays.asList(com.google.android.c.g.m));
            v2 = new ArrayList();
            while (v0 < p1.length) {
                if (v3.add(p1[v0]))
                    v2.add(p1[v0]);
                v0 = v0 + 1;
            }
            if (v2.isEmpty())
                v0 = new String[0];
            else {
                try {
                    com.google.android.c.g.m = (String[])v3.toArray(new String[v3.size()]);
                    v0 = (String[])v2.toArray(new String[v2.size()]);
                }
                catch (Throwable ex) {
                    exit com.google.android.c.g;
                    throw ex;
                }
            }
            if (com.google.android.c.g.l == 0 || com.google.android.c.g.f.isEmpty())
                com.google.android.c.g.c(p0, com.google.android.c.g.m);
            else if (v0.length != 0)
                com.google.android.c.g.c(p0, v0);
            exit com.google.android.c.g;
            return;
            exit com.google.android.c.g;
        }
        catch (Throwable ex) {
            exit com.google.android.c.g;
            throw ex;
        }
    }

    private static void c(ContentResolver p0, String[] p1) {
        com.google.android.c.g.f.putAll(com.google.android.c.g.a(p0, p1));
        com.google.android.c.g.l = 1;
    }

}
