package com.google.android.gms.phenotype.core.p304a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Set;

public final class C5511i {
    public static Set m26435a(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("RequestTags", new String[]{"user"}, null, null, null, null, null);
        try {
            Set hashSet = new HashSet(query.getCount());
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
            }
            return hashSet;
        } finally {
            query.close();
        }
    }
}
