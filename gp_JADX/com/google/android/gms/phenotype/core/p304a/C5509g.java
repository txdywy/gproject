package com.google.android.gms.phenotype.core.p304a;

import android.database.sqlite.SQLiteDatabase;

public final class C5509g {
    public static final String[] f28334a = new String[]{"packageName", "version", "user", "isCommitted", "experimentToken", "serverToken", "configHash", "servingVersion"};

    public static void m26433a(SQLiteDatabase sQLiteDatabase) {
        String str = "ExperimentTokens";
        String[] strArr = new String[8];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "user TEXT NOT NULL";
        strArr[3] = "isCommitted INTEGER NOT NULL";
        strArr[4] = "experimentToken BLOB NOT NULL";
        strArr[5] = "serverToken TEXT NOT NULL";
        strArr[6] = "configHash TEXT NOT NULL";
        String valueOf = String.valueOf("servingVersion INTEGER NOT NULL");
        String valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "user", "isCommitted"));
        strArr[7] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        sQLiteDatabase.execSQL(C5505c.m26425a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
    }
}
