package com.google.android.gms.phenotype.core.p304a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

public final class C5506d {
    public static Pair m26429a(SQLiteDatabase sQLiteDatabase, String str) {
        Pair pair = null;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ApplicationStates", new String[]{"user", "version"}, "packageName = ?", new String[]{str}, pair, pair, pair);
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                pair = Pair.create(query.getString(0), Integer.valueOf(query.getInt(1)));
                query.close();
            }
            return pair;
        } finally {
            query.close();
        }
    }
}
