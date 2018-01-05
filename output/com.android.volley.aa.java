package com.android.volley;

import android.util.Log;
import java.util.Locale;

public static class com.android.volley.aa
{

    public static String a;
    public static boolean b;

    static {
        com.android.volley.aa.a = "Volley";
        com.android.volley.aa.b = Log.isLoggable("Volley", 2);
    }

    aa() {
    }

    public static void a(String p0, Object[] p1) {
        if (com.android.volley.aa.b != 0)
            Log.v(com.android.volley.aa.a, com.android.volley.aa.d(p0, p1));
    }

    public static void a(Throwable p0, String p1, Object[] p2) {
        Log.e(com.android.volley.aa.a, com.android.volley.aa.d(p1, p2), p0);
    }

    public static void b(String p0, Object[] p1) {
        Log.d(com.android.volley.aa.a, com.android.volley.aa.d(p0, p1));
    }

    public static void c(String p0, Object[] p1) {
        Log.e(com.android.volley.aa.a, com.android.volley.aa.d(p0, p1));
    }

    public static String d(String p0, Object[] p1) {
  1:    if (p1 != 0)
148:        p0 = String.format(Locale.US, p0, p1);
 12:    v3 = new Throwable().fillInStackTrace().getStackTrace();
 18:    v0 = 2;
 20:    if (v0 >= v3.length) goto 158;
 34:    if (v3[v0].getClass().equals(com.android.volley.aa)) goto 154;
 38:    v2 = v3[v0].getClassName();
 50:    v2 = v2.substring(v2.lastIndexOf(46) + 1);
 62:    v2 = v2.substring(v2.lastIndexOf(36) + 1);
 68:    v0 = v3[v0].getMethodName();
110:    v0 = (String.valueOf(v2).length() + 1 + String.valueOf(v0).length()) + v2 + "." + v0;
119:    v4 = new Object[3];
134:    v4[0] = Long.valueOf(Thread.currentThread().getId());
137:    v4[1] = v0;
139:    v4[2] = p0;
145:    return String.format(Locale.US, "[%d] %s: %s", v4);
154:    v0 = v0 + 1;
156:    goto 19;
158:    v0 = "<unknown>";
159:    goto 114;
    }

}
