package com.google.android.gms.phenotype.core.p304a;

import android.database.sqlite.SQLiteDatabase;

public final class C5510h {
    public static final String[] f28335a = new String[]{"packageName", "version", "flagType", "partitionId", "user", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal", "committed"};

    public static void m26434a(SQLiteDatabase sQLiteDatabase) {
        String str = "Flags";
        String[] strArr = new String[12];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "flagType INTEGER NOT NULL";
        strArr[3] = "partitionId INTEGER NOT NULL";
        strArr[4] = "user TEXT NOT NULL";
        strArr[5] = "name TEXT NOT NULL";
        strArr[6] = "intVal INTEGER";
        strArr[7] = "boolVal INTEGER";
        strArr[8] = "floatVal REAL";
        strArr[9] = "stringVal TEXT";
        strArr[10] = "extensionVal BLOB";
        String valueOf = String.valueOf("committed INTEGER NOT NULL");
        String valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
        strArr[11] = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        sQLiteDatabase.execSQL(C5505c.m26425a("Flags", "committed", "packageName", "version", "user", "committed"));
    }
}
