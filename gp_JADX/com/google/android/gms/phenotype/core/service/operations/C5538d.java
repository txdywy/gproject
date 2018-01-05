package com.google.android.gms.phenotype.core.service.operations;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.phenotype.core.C5530i;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.logging.Level;

public final class C5538d extends C5535a {
    public static final c f28421a = c.a("com/google/android/gms/phenotype/core/service/operations/GetCommittedConfigurationOperation");

    public static boolean m26492a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{str}, null, null, null);
        try {
            boolean z;
            if (query.getCount() != 0) {
                z = true;
            } else {
                z = false;
            }
            query.close();
            return z;
        } catch (Throwable th) {
            query.close();
        }
    }

    static C5530i[] m26493b(SQLiteDatabase sQLiteDatabase, String str) {
        C5530i[] c5530iArr = null;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("FlagOverrides", GetConfigurationSnapshotOperation.f28398d, "packageName = ? AND committed = 1", new String[]{str}, null, null, null);
        try {
            if (query.getCount() != 0) {
                c5530iArr = new C5530i[query.getCount()];
                int i = 0;
                while (query.moveToNext()) {
                    C5530i a = GetConfigurationSnapshotOperation.m26482a(query);
                    ((d) ((d) f28421a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetCommittedConfigurationOperation", "getCommittedOverrides", 112, "GetCommittedConfigurationOperation.java")).a("override: %s", a);
                    int i2 = i + 1;
                    c5530iArr[i] = a;
                    i = i2;
                }
                query.close();
            }
            return c5530iArr;
        } finally {
            query.close();
        }
    }
}
