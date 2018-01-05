package com.google.android.finsky.ak;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.p037h.C0305a;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

final class C1200c extends SQLiteOpenHelper {
    public final /* synthetic */ C1198a f7308a;

    C1200c(C1198a c1198a, Context context, String str) {
        this.f7308a = c1198a;
        super(context, str, null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1198a c1198a = this.f7308a;
        sQLiteDatabase.beginTransaction();
        try {
            for (C1201d a : c1198a.f7304b) {
                a.m7152a(sQLiteDatabase);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor rawQuery;
        C1198a c1198a = this.f7308a;
        sQLiteDatabase.beginTransaction();
        try {
            for (C1201d c1201d : c1198a.f7304b) {
                rawQuery = sQLiteDatabase.rawQuery(String.format(Locale.US, "PRAGMA table_info(%s)", new Object[]{c1201d.f7309a}), null);
                if (rawQuery == null || rawQuery.isAfterLast()) {
                    c1201d.m7152a(sQLiteDatabase);
                } else {
                    Map c0305a = new C0305a();
                    while (rawQuery.moveToNext()) {
                        c0305a.put(rawQuery.getString(1), rawQuery.getString(2));
                    }
                    rawQuery.close();
                    List arrayList = new ArrayList();
                    for (Entry entry : c1201d.f7311c.entrySet()) {
                        if (!c0305a.containsKey(entry.getKey())) {
                            FinskyLog.m21659a("Adding column %s (%s) to %s", entry.getKey(), entry.getValue(), c1201d.f7309a);
                            arrayList.add(entry);
                        } else if (!((String) entry.getValue()).equals(c0305a.get(entry.getKey()))) {
                            FinskyLog.m21669e("Column data types don't match existing column %s. From: %s To: %s", entry.getKey(), c0305a.get(entry.getKey()), entry.getValue());
                        }
                    }
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        Entry entry2 = (Entry) obj;
                        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s %s", new Object[]{c1201d.f7309a, entry2.getKey(), entry2.getValue()}));
                    }
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
