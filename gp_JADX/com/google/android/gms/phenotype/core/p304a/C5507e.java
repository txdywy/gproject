package com.google.android.gms.phenotype.core.p304a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public final class C5507e {
    public static long m26430a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ChangeCounts", new String[]{"count"}, "packageName = ?", new String[]{str}, null, null, null);
        long j = 0;
        try {
            if (query.moveToFirst()) {
                j = query.getLong(0);
            }
            query.close();
            return j;
        } catch (Throwable th) {
            query.close();
        }
    }

    public static long m26431b(SQLiteDatabase sQLiteDatabase, String str) {
        long a = C5507e.m26430a(sQLiteDatabase, str) + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("packageName", str);
        contentValues.put("count", Long.valueOf(a));
        if (sQLiteDatabase.insertWithOnConflict("ChangeCounts", null, contentValues, 5) >= 0) {
            return a;
        }
        String str2 = "Failed to increment change count for ";
        String valueOf = String.valueOf(str);
        throw new SQLiteException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
