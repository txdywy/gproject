package com.google.android.finsky.ak;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.a.a;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.utils.j;
import com.google.android.finsky.z.c;
import com.google.android.finsky.z.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class com.google.android.finsky.ak.h implements com.google.android.finsky.ak.e
{

    public final com.google.android.finsky.ba.c a;
    public final com.google.android.finsky.z.c b;
    public final com.google.android.finsky.ak.a c;
    public final String d;
    public final com.google.android.finsky.utils.a.a e;
    public final com.google.android.finsky.utils.a.a f;
    public final com.google.android.finsky.utils.a.a g;
    public final com.google.android.finsky.utils.a.a h;
    public final int i;
    public final long j;

    h(com.google.android.finsky.ba.c p0, com.google.android.finsky.z.c p1, com.google.android.finsky.ak.a p2, String p3, com.google.android.finsky.utils.a.a p4, com.google.android.finsky.utils.a.a p5, com.google.android.finsky.utils.a.a p6, int p7, long p8, com.google.android.finsky.utils.a.a p10) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.i = p7;
        this.j = p8;
        this.h = p10;
    }

    static void a(com.google.android.finsky.ak.h p0, Object p1, byte[] p2, String p3, String p4) {
        p0.a(p1, p2, p3, p4);
    }

    private final void a(Object p0, byte[] p1, String p2, String p3) {
 13:    if (!this.a.dj().a(12632999))
 15:        return;
 17:    try {
 27:        v4 = String.valueOf(this.d);
 33:        v3 = String.valueOf("_audit");
 41:        if (v3.length() != 0)
 43:            v3 = v4.concat(v3);
            else {
148:            try {
150:                v3 = new String(v4);
                }
                catch (Throwable ex) {
154:                v2 = ex;
155:                v3 = 0;
156:                com.google.android.finsky.utils.j.a(v3);
159:                throw v2;
                }
            }
 54:        v3 = this.c.c.getReadableDatabase().query(v3, 0, 0, 0, 0, 0, 0, 0);
        }
        catch (Throwable ex) {
154:        v2 = ex;
155:        v3 = 0;
156:        com.google.android.finsky.utils.j.a(v3);
159:        throw v2;
        }
 58:    if (v3 != 0) goto 160;
 60:    com.google.android.finsky.utils.j.a(v3);
 66:    v3 = new ContentValues(5);
 75:    v3.put("data_table_pk", p0.toString());
 82:    v3.put("data", p1);
 95:    v3.put("timestamp", Long.valueOf(com.google.android.finsky.utils.i.a()));
102:    v3.put("reason", p2);
109:    v3.put("trace", p3);
122:    v5 = String.valueOf(this.d);
128:    v2 = String.valueOf("_audit");
136:    if (v2.length() != 0)
138:        v2 = v5.concat(v2);
        else
229:        v2 = new String(v5);
143:    this.c.c.getWritableDatabase().insertOrThrow(v2, 0, v3);
146:    return;
154:    v2 = ex;
155:    v3 = 0;
156:    com.google.android.finsky.utils.j.a(v3);
159:    throw v2;
160:    v2 = v3.getCount();
169:    if ((long)v2 >= this.j) {
184:        v7 = new Object[4];
189:        v7[0] = this.d;
194:        v7[1] = this.d;
199:        v7[2] = "timestamp";
213:        v7[3] = Long.valueOf((long)v2 - this.j + 1);
219:        this.c.c.getWritableDatabase().execSQL(String.format(Locale.US, "DELETE FROM %s_audit WHERE rowid in (SELECT rowid FROM %s_audit ORDER BY %s LIMIT %d)", v7));
        }
222:    com.google.android.finsky.utils.j.a(v3);
225:    goto 63;
233:    v2 = ex;
234:    goto 156;
235:    try
            run 160...222
        catch (Throwable ex) {
160:        goto 233;
        }
    }

    public final com.google.android.finsky.z.e a(com.google.android.finsky.ak.q p0) {
        return this.a(p0, 0, 0);
    }

    public final com.google.android.finsky.z.e a(com.google.android.finsky.ak.q p0, String p1, String p2) {
        return this.b.a(new com.google.android.finsky.ak.i(this, p0, p1, p2));
    }

    public final com.google.android.finsky.z.e a(Object p0) {
        return this.a(new com.google.android.finsky.ak.q(p0), 0, 0).a(new com.google.android.finsky.ak.j(p0));
    }

    public final com.google.android.finsky.z.e a(List p0) {
        return this.b.a(new com.google.android.finsky.ak.o(this, p0, com.google.android.finsky.ak.p.a(this.i)));
    }

    public final com.google.android.finsky.z.e b(com.google.android.finsky.ak.q p0) {
        return this.b.a(new com.google.android.finsky.ak.l(this, p0, com.google.android.finsky.ak.p.a(this.i)));
    }

    public final com.google.android.finsky.z.e b(Object p0) {
        return this.a(Collections.singletonList(p0)).a(new com.google.android.finsky.ak.n());
    }

    final List b(com.google.android.finsky.ak.q p0, String p1, String p2) {
        v2 = new String[1];
        v2[0] = "data";
        v1 = this.c.c.getReadableDatabase().query(this.d, v2, p0.a.toString(), p0.a(), 0, 0, p1, p2);
        v0 = new ArrayList(v1.getCount());
        try {
            while (v1.moveToNext())
                v0.add(this.f.a(v1.getBlob(v1.getColumnIndex("data"))));
        }
        catch (Throwable ex) {
            v1.close();
            throw ex;
        }
        v1.close();
        return v0;
    }

    public final com.google.android.finsky.z.e c(com.google.android.finsky.ak.q p0) {
        return this.b.a(new com.google.android.finsky.ak.m(this, p0, com.google.android.finsky.ak.p.a(this.i)));
    }

    public final com.google.android.finsky.z.e c(Object p0) {
        return this.d(this.g.a(p0));
    }

    public final com.google.android.finsky.z.e d(Object p0) {
        return this.b(new com.google.android.finsky.ak.q(p0)).a(new com.google.android.finsky.ak.k());
    }

    final List d(com.google.android.finsky.ak.q p0) {
        v2 = new String[1];
        v2[0] = "pk";
        v1 = this.c.c.getReadableDatabase().query(this.d, v2, p0.a.toString(), p0.a(), 0, 0, 0);
        v0 = new ArrayList();
        try {
            while (v1.moveToNext())
                v0.add(v1.getString(v1.getColumnIndex("pk")));
        }
        catch (Throwable ex) {
            v1.close();
            throw ex;
        }
        v1.close();
        return v0;
    }

}
