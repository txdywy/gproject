package com.google.android.gms.phenotype.core.p304a;

import android.database.sqlite.SQLiteDatabase;

public final class C5508f {
    public static final String[] f28333a = new String[]{"fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted", "token", "provenance"};

    public static void m26432a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C5505c.m26426a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
        sQLiteDatabase.execSQL(C5505c.m26425a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
        sQLiteDatabase.execSQL(C5505c.m26425a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
    }
}
