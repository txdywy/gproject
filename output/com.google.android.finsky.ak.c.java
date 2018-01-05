package com.google.android.finsky.ak;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.h.a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.ak.c extends SQLiteOpenHelper
{

    public final com.google.android.finsky.ak.a a;

    c(com.google.android.finsky.ak.a p0, Context p1, String p2) {
        this.a = p0;
        SQLiteOpenHelper(p1, p2, 0, 1);
    }

    public final void onCreate(SQLiteDatabase p0) {
        p0.beginTransaction();
        try {
            v0 = 0;
            while (v0 < this.a.b.length) {
                this.a.b[v0].a(p0);
                v0 = v0 + 1;
            }
            p0.setTransactionSuccessful();
        }
        catch (Throwable ex) {
            p0.endTransaction();
            throw ex;
        }
        p0.endTransaction();
    }

    public final void onDowngrade(SQLiteDatabase p0, int p1, int p2) {
        p0.beginTransaction();
        try {
            p0.setTransactionSuccessful();
        }
        catch (Throwable ex) {
            p0.endTransaction();
            throw ex;
        }
        p0.endTransaction();
    }

    public final void onUpgrade(SQLiteDatabase p0, int p1, int p2) {
  2:    p0.beginTransaction();
  9:    v4 = 0;
 10:    if (v4 >= this.a.b.length) {
264:        p0.setTransactionSuccessful();
267:        p0.endTransaction();
270:        return;
        }
 19:    v3 = new Object[1];
 24:    v3[0] = this.a.b[v4].a;
 31:    v2 = p0.rawQuery(String.format(Locale.US, "PRAGMA table_info(%s)", v3), 0);
 35:    if (v2 == 0) goto 43;
 41:    if (!v2.isAfterLast()) goto 50;
 43:    this.a.b[v4].a(p0);
 48:    v4 = v4 + 1;
 49:    goto 10;
 52:    v8 = new android.support.v4.h.a();
 55:    try {
 55:        while (v2.moveToNext())
 71:            v8.put(v2.getString(1), v2.getString(2));
        }
        catch (Throwable ex) {
 76:        try {
 76:            v2.close();
 79:            throw ex;
            }
            catch (Throwable ex) {
 81:            p0.endTransaction();
 84:            throw ex;
            }
 81:        p0.endTransaction();
 84:        throw ex;
        }
 74:    goto 85;
 76:    try {
 76:        v2.close();
 79:        throw ex;
        }
        catch (Throwable ex) {
 81:        p0.endTransaction();
 84:        throw ex;
        }
 81:    p0.endTransaction();
 84:    throw ex;
 85:    v2.close();
 90:    v3 = new ArrayList();
 99:    v9 = this.a.b[v4].c.entrySet().iterator();
103:    while (v9.hasNext()) {
113:        v1 = (Map$Entry)v9.next();
123:        if (!v8.containsKey(v1.getKey())) {
128:            v10 = new Object[3];
135:            v10[0] = v1.getKey();
142:            v10[1] = v1.getValue();
147:            v10[2] = this.a.b[v4].a;
149:            FinskyLog.a("Adding column %s (%s) to %s", v10);
152:            v3.add(v1);
            }
174:        else if (!((String)v1.getValue()).equals(v8.get(v1.getKey()))) {
179:            v10 = new Object[3];
186:            v10[0] = v1.getKey();
197:            v10[1] = v8.get(v1.getKey());
204:            v10[2] = v1.getValue();
206:            FinskyLog.e("Column data types don't match existing column %s. From: %s To: %s", v10);
            }
        }
213:    v1 = (ArrayList)v3;
219:    v3 = 0;
220:    while (v3 < v1.size()) {
222:        v2 = v1.get(v3);
226:        v3 = v3 + 1;
235:        v11 = new Object[3];
240:        v11[0] = this.a.b[v4].a;
247:        v11[1] = ((Map$Entry)v2).getKey();
254:        v11[2] = ((Map$Entry)v2).getValue();
260:        p0.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s %s", v11));
        }
263:    goto 46;
271:    try
            run 85...267
        catch (Throwable ex) {
 85:        goto 80;
        }
274:    try
            run 5...55
        catch (Throwable ex) {
  5:        goto 80;
        }
    }

}
