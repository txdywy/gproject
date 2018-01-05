package com.google.android.c;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

private static class com.google.android.c.c implements BaseColumns
{

    public static HashMap a;

    static {
        com.google.android.c.c.a = new HashMap();
    }

    c() {
    }

    public static Uri a(Uri p0, String p1) {
        return Uri.withAppendedPath(p0, p1);
    }

    private static com.google.android.c.f a(ContentResolver p0, Uri p1) {
        v0 = (com.google.android.c.f)com.google.android.c.c.a.get(p1);
        if (v0 == 0) {
            v0 = new com.google.android.c.f();
            com.google.android.c.c.a.put(p1, v0);
            p0.registerContentObserver(p1, 1, new com.google.android.c.d(v0));
            return v0;
        }
        if (!v0.c.getAndSet(0))
            return v0;
        enter v0;
        try {
            v0.a.clear();
            v0.b = new Object();
            exit v0;
            return v0;
            exit v0;
        }
        catch (Throwable ex) {
            exit v0;
            throw ex;
        }
    }

    protected static String a(ContentResolver p0, Uri p1, String p2) {
  0:    v6 = 0;
  3:    enter com.google.android.c.c;
  4:    try {
  4:        v7 = com.google.android.c.c.a(p0, p1);
  8:        exit com.google.android.c.c;
        }
        catch (Throwable ex) {
 31:        try {
 31:            exit com.google.android.c.c;
            }
            catch (Throwable ex) {
 31:            exit com.google.android.c.c;
 32:            throw ex;
            }
 32:        throw ex;
        }
  9:    enter v7;
 10:    try {
 18:        if (v7.a.containsKey(p2)) {
 26:            v0 = (String)v7.a.get(p2);
 28:            exit v7;
 29:            return v0;
            }
        }
        catch (Throwable ex) {
 77:        try {
 77:            exit v7;
            }
            catch (Throwable ex) {
 77:            exit v7;
 78:            throw ex;
            }
 78:        throw ex;
        }
 33:    try {
 33:        exit v7;
        }
        catch (Throwable ex) {
 77:        try {
 77:            exit v7;
            }
            catch (Throwable ex) {
 77:            exit v7;
 78:            throw ex;
            }
 78:        throw ex;
        }
 35:    try {
 35:        v2 = new String[1];
 40:        v2[0] = "value";
 45:        v4 = new String[1];
 48:        v4[0] = p2;
 53:        v2 = p0.query(p1, v2, "name=?", v4, 0);
        }
        catch (SQLException ex) {
 94:        v1 = ex;
 95:        v0 = 0;
 96:        try {
123:            Log.e("GoogleSettings", "Can't get key " + p2 + " from " + p1, v1);
            }
            catch (Throwable ex) {
132:            v0 = ex;
133:            if (v6 != 0)
135:                v6.close();
138:            throw v0;
            }
126:        if (v6 != 0)
128:            v6.close();
131:        return v0;
        }
        catch (Throwable ex) {
132:        v0 = ex;
133:        if (v6 != 0)
135:            v6.close();
138:        throw v0;
        }
 57:    if (v2 == 0) {
 66:        com.google.android.c.c.a(v7, v7.b, p2, 0);
 69:        if (v2 != 0)
 71:            v2.close();
 74:        v0 = 0;
 75:        return v0;
        }
 63:    if (!v2.moveToFirst()) {
 66:        com.google.android.c.c.a(v7, v7.b, p2, 0);
 69:        if (v2 != 0)
 71:            v2.close();
 74:        v0 = 0;
 75:        return v0;
        }
 80:    v0 = v2.getString(0);
 84:    com.google.android.c.c.a(v7, v7.b, p2, v0);
 87:    if (v2 != 0)
 89:        v2.close();
 92:    return v0;
 94:    v1 = ex;
 95:    v0 = 0;
 96:    try {
123:        Log.e("GoogleSettings", "Can't get key " + p2 + " from " + p1, v1);
        }
        catch (Throwable ex) {
132:        v0 = ex;
133:        if (v6 != 0)
135:            v6.close();
138:        throw v0;
        }
126:    if (v6 != 0)
128:        v6.close();
131:    return v0;
132:    v0 = ex;
133:    if (v6 != 0)
135:        v6.close();
138:    throw v0;
139:    v0 = ex;
140:    v6 = v2;
141:    goto 133;
143:    v1 = ex;
144:    v0 = 0;
145:    v6 = v2;
146:    goto 96;
147:    v1 = ex;
148:    v6 = v2;
149:    goto 96;
151:    try
            run 84...87
        catch (SQLException ex) {
 84:        goto 147;
        }
        catch (Throwable ex) {
 84:        goto 139;
        }
152:    try
            run 80...83
        catch (SQLException ex) {
 80:        goto 142;
        }
        catch (Throwable ex) {
 80:        goto 139;
        }
154:    try
            run 59...69
        catch (SQLException ex) {
 59:        goto 142;
        }
        catch (Throwable ex) {
 59:        goto 139;
        }
    }

    private static void a(com.google.android.c.f p0, Object p1, String p2, String p3) {
        enter p0;
        try {
            if (p1 == p0.b)
                p0.a.put(p2, p3);
            exit p0;
            return;
            exit p0;
        }
        catch (Throwable ex) {
            exit p0;
            throw ex;
        }
    }

}
