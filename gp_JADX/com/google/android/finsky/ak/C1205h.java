package com.google.android.finsky.ak;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.p188a.C2918a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class C1205h implements C1202e {
    public final C1461c f7315a;
    public final C4819c f7316b;
    public final C1198a f7317c;
    public final String f7318d;
    public final C2918a f7319e;
    public final C2918a f7320f;
    public final C2918a f7321g;
    public final C2918a f7322h;
    public final int f7323i;
    public final long f7324j;

    C1205h(C1461c c1461c, C4819c c4819c, C1198a c1198a, String str, C2918a c2918a, C2918a c2918a2, C2918a c2918a3, int i, long j, C2918a c2918a4) {
        this.f7315a = c1461c;
        this.f7316b = c4819c;
        this.f7317c = c1198a;
        this.f7318d = str;
        this.f7319e = c2918a;
        this.f7320f = c2918a2;
        this.f7321g = c2918a3;
        this.f7323i = i;
        this.f7324j = j;
        this.f7322h = c2918a4;
    }

    public final C4809e mo1519a(C1215q c1215q) {
        return mo1520a(c1215q, null, null);
    }

    public final C4809e mo1520a(C1215q c1215q, String str, String str2) {
        return this.f7316b.mo4403a(new C1206i(this, c1215q, str, str2));
    }

    public final C4809e mo1521a(Object obj) {
        return mo1520a(new C1215q(obj), null, null).mo4397a(new C1208j(obj));
    }

    public final C4809e mo1526c(Object obj) {
        return mo1527d(this.f7321g.mo3197a(obj));
    }

    public final C4809e mo1527d(Object obj) {
        return mo1523b(new C1215q(obj)).mo4397a(new C1209k());
    }

    public final C4809e mo1523b(C1215q c1215q) {
        return this.f7316b.mo4403a(new C1210l(this, c1215q, C1214p.m7188a(this.f7323i)));
    }

    public final C4809e mo1525c(C1215q c1215q) {
        return this.f7316b.mo4403a(new C1211m(this, c1215q, C1214p.m7188a(this.f7323i)));
    }

    public final C4809e mo1524b(Object obj) {
        return mo1522a(Collections.singletonList(obj)).mo4397a(new C1212n());
    }

    public final C4809e mo1522a(List list) {
        return this.f7316b.mo4403a(new C1213o(this, list, C1214p.m7188a(this.f7323i)));
    }

    final List m7180d(C1215q c1215q) {
        Cursor query = this.f7317c.f7305c.getReadableDatabase().query(this.f7318d, new String[]{"pk"}, c1215q.f7339a.toString(), c1215q.m7196a(), null, null, null);
        List arrayList = new ArrayList();
        try {
            int columnIndex = query.getColumnIndex("pk");
            while (query.moveToNext()) {
                arrayList.add(query.getString(columnIndex));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }

    private final void m7169a(Object obj, byte[] bArr, String str, String str2) {
        Throwable th;
        if (this.f7315a.dj().mo2294a(12632999)) {
            Closeable query;
            try {
                SQLiteDatabase readableDatabase = this.f7317c.f7305c.getReadableDatabase();
                String valueOf = String.valueOf(this.f7318d);
                String valueOf2 = String.valueOf("_audit");
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                query = readableDatabase.query(valueOf2, null, null, null, null, null, null, null);
                if (query == null) {
                    C4679j.m21814a(query);
                } else {
                    try {
                        if (((long) query.getCount()) >= this.f7324j) {
                            this.f7317c.f7305c.getWritableDatabase().execSQL(String.format(Locale.US, "DELETE FROM %s_audit WHERE rowid in (SELECT rowid FROM %s_audit ORDER BY %s LIMIT %d)", new Object[]{this.f7318d, this.f7318d, "timestamp", Long.valueOf((((long) r2) - this.f7324j) + 1)}));
                        }
                        C4679j.m21814a(query);
                    } catch (Throwable th2) {
                        th = th2;
                        C4679j.m21814a(query);
                        throw th;
                    }
                }
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("data_table_pk", obj.toString());
                contentValues.put("data", bArr);
                contentValues.put("timestamp", Long.valueOf(C4678i.m21812a()));
                contentValues.put("reason", str);
                contentValues.put("trace", str2);
                SQLiteDatabase writableDatabase = this.f7317c.f7305c.getWritableDatabase();
                String valueOf3 = String.valueOf(this.f7318d);
                String valueOf4 = String.valueOf("_audit");
                if (valueOf4.length() != 0) {
                    valueOf4 = valueOf3.concat(valueOf4);
                } else {
                    valueOf4 = new String(valueOf3);
                }
                writableDatabase.insertOrThrow(valueOf4, null, contentValues);
            } catch (Throwable th3) {
                th = th3;
                query = null;
                C4679j.m21814a(query);
                throw th;
            }
        }
    }

    final List m7176b(C1215q c1215q, String str, String str2) {
        Cursor query = this.f7317c.f7305c.getReadableDatabase().query(this.f7318d, new String[]{"data"}, c1215q.f7339a.toString(), c1215q.m7196a(), null, null, str, str2);
        List arrayList = new ArrayList(query.getCount());
        try {
            int columnIndex = query.getColumnIndex("data");
            while (query.moveToNext()) {
                arrayList.add(this.f7320f.mo3197a(query.getBlob(columnIndex)));
            }
            return arrayList;
        } finally {
            query.close();
        }
    }
}
