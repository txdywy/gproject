package com.google.android.gms.phenotype.core.p304a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.nio.charset.Charset;
import java.util.logging.Level;

public final class C5505c extends SQLiteOpenHelper {
    public static final c f28329a = c.a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper");
    public static final Object f28330b = new Object();
    public static int f28331c = 0;
    public static C5505c f28332d;

    static String m26426a(String str, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        stringBuilder.append(str);
        stringBuilder.append(" (");
        C5505c.m26428a(stringBuilder, strArr);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    static String m26425a(String str, String str2, String... strArr) {
        StringBuilder stringBuilder = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
        stringBuilder.append(str2);
        stringBuilder.append(" ON ");
        stringBuilder.append(str);
        stringBuilder.append(" (");
        C5505c.m26428a(stringBuilder, strArr);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    static String m26427a(String... strArr) {
        StringBuilder stringBuilder = new StringBuilder(", PRIMARY KEY(");
        C5505c.m26428a(stringBuilder, strArr);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static void m26428a(StringBuilder stringBuilder, String... strArr) {
        int length = strArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str);
            i++;
            obj = null;
        }
    }

    public static C5505c m26423a(Context context) {
        C5505c c5505c;
        synchronized (f28330b) {
            if (f28332d == null) {
                f28332d = new C5505c(context, "phenotype.db");
            }
            f28331c++;
            c5505c = f28332d;
        }
        return c5505c;
    }

    private C5505c(Context context, String str) {
        super(context, str, null, 16);
    }

    public final synchronized void close() {
        synchronized (f28330b) {
            int i = f28331c - 1;
            f28331c = i;
            if (i == 0) {
                super.close();
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(C5505c.m26426a("Packages", "packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "dynamicParams BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL", "isSynced INTEGER"));
        sQLiteDatabase.execSQL(C5505c.m26425a("Packages", "androidPackageName", "androidPackageName"));
        sQLiteDatabase.execSQL(C5505c.m26426a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
        String str = "LogSources";
        String[] strArr = new String[2];
        strArr[0] = "logSourceName TEXT NOT NULL";
        String valueOf = String.valueOf("packageName TEXT NOT NULL");
        String valueOf2 = String.valueOf(C5505c.m26427a("logSourceName", "packageName"));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        strArr[1] = valueOf2;
        sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        sQLiteDatabase.execSQL(C5505c.m26425a("LogSources", "packageName", "packageName"));
        sQLiteDatabase.execSQL(C5505c.m26426a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
        sQLiteDatabase.execSQL(C5505c.m26425a("WeakExperimentIds", "packageName", "packageName"));
        C5509g.m26433a(sQLiteDatabase);
        C5510h.m26434a(sQLiteDatabase);
        sQLiteDatabase.execSQL(C5505c.m26426a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
        str = "ApplicationTags";
        strArr = new String[5];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "version INTEGER NOT NULL";
        strArr[2] = "partitionId INTEGER NOT NULL";
        strArr[3] = "user TEXT NOT NULL";
        valueOf = String.valueOf("tag BLOB NOT NULL");
        valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "partitionId", "user"));
        if (valueOf2.length() != 0) {
            valueOf2 = valueOf.concat(valueOf2);
        } else {
            valueOf2 = new String(valueOf);
        }
        strArr[4] = valueOf2;
        sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        C5508f.m26432a(sQLiteDatabase);
        sQLiteDatabase.execSQL(C5505c.m26426a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        sQLiteDatabase.execSQL(C5505c.m26426a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
        sQLiteDatabase.execSQL(C5505c.m26426a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        str = "FlagOverrides";
        strArr = new String[10];
        strArr[0] = "packageName TEXT NOT NULL";
        strArr[1] = "user TEXT NOT NULL";
        strArr[2] = "name TEXT NOT NULL";
        strArr[3] = "flagType INTEGER NOT NULL";
        strArr[4] = "intVal INTEGER";
        strArr[5] = "boolVal INTEGER";
        strArr[6] = "floatVal REAL";
        strArr[7] = "stringVal TEXT";
        strArr[8] = "extensionVal BLOB";
        String valueOf3 = String.valueOf("committed");
        valueOf2 = String.valueOf(C5505c.m26427a("packageName", "user", "name", "committed"));
        strArr[9] = valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3);
        sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        sQLiteDatabase.execSQL(C5505c.m26426a("GcmState", "packageName TEXT NOT NULL PRIMARY KEY", "isSubscribed INTEGER NOT NULL", "subscribeAfterTime INTEGER NOT NULL DEFAULT 0"));
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (sQLiteDatabase.enableWriteAheadLogging()) {
            ((d) ((d) f28329a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onConfigure", 602, "PhenotypeDbHelper.java")).a("Enabled write-ahead logging");
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String valueOf;
        String valueOf2;
        ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 608, "PhenotypeDbHelper.java")).a("onUpgrade %d to %d", i, i2);
        if (i < 3 && i2 >= 3) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 611, "PhenotypeDbHelper.java")).a("Wiping Phenotype Database.");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Packages");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ApplicationStates");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS WeakExperimentIds");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ExperimentTokens");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Flags");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RequestTags");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ApplicationTags");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CrossLoggedExperimentTokens");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase.execSQL(C5505c.m26426a("Packages", "packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL"));
            sQLiteDatabase.execSQL(C5505c.m26425a("Packages", "androidPackageName", "androidPackageName"));
            sQLiteDatabase.execSQL(C5505c.m26426a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
            String str = "LogSources";
            String[] strArr = new String[2];
            strArr[0] = "logSourceName TEXT NOT NULL";
            valueOf = String.valueOf("packageName TEXT NOT NULL");
            valueOf2 = String.valueOf(C5505c.m26427a("logSourceName", "packageName"));
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            strArr[1] = valueOf2;
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
            sQLiteDatabase.execSQL(C5505c.m26425a("LogSources", "packageName", "packageName"));
            sQLiteDatabase.execSQL(C5505c.m26426a("WeakExperimentIds", "packageName TEXT NOT NULL", "experimentId INTEGER NOT NULL"));
            sQLiteDatabase.execSQL(C5505c.m26425a("WeakExperimentIds", "packageName", "packageName"));
            str = "ExperimentTokens";
            strArr = new String[6];
            strArr[0] = "packageName TEXT NOT NULL";
            strArr[1] = "version INTEGER NOT NULL";
            strArr[2] = "user TEXT NOT NULL";
            strArr[3] = "isCommitted INTEGER NOT NULL";
            strArr[4] = "experimentToken BLOB NOT NULL";
            String valueOf3 = String.valueOf("serverToken TEXT NOT NULL");
            valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "user", "isCommitted"));
            strArr[5] = valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3);
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
            sQLiteDatabase.execSQL(C5505c.m26425a("ExperimentTokens", "committed", "packageName", "version", "user", "isCommitted"));
            str = "Flags";
            strArr = new String[12];
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
            valueOf3 = String.valueOf("committed INTEGER NOT NULL");
            valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "flagType", "partitionId", "user", "name", "committed"));
            strArr[11] = valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3);
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
            sQLiteDatabase.execSQL(C5505c.m26425a("Flags", "committed", "packageName", "version", "user", "committed"));
            sQLiteDatabase.execSQL(C5505c.m26426a("RequestTags", "user TEXT NOT NULL PRIMARY KEY", "bytesTag BLOB NOT NULL"));
            str = "ApplicationTags";
            strArr = new String[5];
            strArr[0] = "packageName TEXT NOT NULL";
            strArr[1] = "version INTEGER NOT NULL";
            strArr[2] = "partitionId INTEGER NOT NULL";
            strArr[3] = "user TEXT NOT NULL";
            valueOf = String.valueOf("tag BLOB NOT NULL");
            valueOf2 = String.valueOf(C5505c.m26427a("packageName", "version", "partitionId", "user"));
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            strArr[4] = valueOf2;
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
            sQLiteDatabase.execSQL(C5505c.m26426a("CrossLoggedExperimentTokens", "fromPackageName TEXT NOT NULL", "fromVersion INTEGER NOT NULL", "fromUser TEXT NOT NULL", "toPackageName TEXT NOT NULL", "toVersion INTEGER NOT NULL", "isCommitted INTEGER NOT NULL", "token BLOB NOT NULL", "provenance INTEGER NOT NULL"));
            sQLiteDatabase.execSQL(C5505c.m26425a("CrossLoggedExperimentTokens", "apply", "fromPackageName", "fromVersion", "fromUser", "toPackageName", "toVersion", "isCommitted"));
            sQLiteDatabase.execSQL(C5505c.m26425a("CrossLoggedExperimentTokens", "remove", "toPackageName"));
            sQLiteDatabase.execSQL(C5505c.m26426a("ChangeCounts", "key INTEGER NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i < 4 && i2 >= 4) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 794, "PhenotypeDbHelper.java")).a("Adding DogfoodsToken table");
            sQLiteDatabase.execSQL(C5505c.m26426a("DogfoodsToken", "key INTEGER NOT NULL PRIMARY KEY", "token BLOB"));
        }
        if (i < 5 && i2 >= 5) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 804, "PhenotypeDbHelper.java")).a("Adding configHash to ExperimentTokens table");
            sQLiteDatabase.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN configHash TEXT NOT NULL DEFAULT ''");
        }
        if (i < 6 && i2 >= 6) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 814, "PhenotypeDbHelper.java")).a("Adding LastFetch table");
            sQLiteDatabase.execSQL(C5505c.m26426a("LastFetch", "key INTEGER NOT NULL PRIMARY KEY", "servertimestamp INTEGER NOT NULL"));
        }
        if (i < 7 && i2 >= 7) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 824, "PhenotypeDbHelper.java")).a("Relaxing LogSources Table restrictions");
            str = "LogSources_copy";
            strArr = new String[2];
            strArr[0] = "logSourceName TEXT NOT NULL";
            valueOf = String.valueOf("packageName TEXT NOT NULL");
            valueOf2 = String.valueOf(C5505c.m26427a("logSourceName", "packageName"));
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            strArr[1] = valueOf2;
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
            sQLiteDatabase.execSQL("INSERT INTO LogSources_copy (logSourceName, packageName) SELECT logSourceName, packageName FROM LogSources");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS LogSources");
            sQLiteDatabase.execSQL("ALTER TABLE LogSources_copy RENAME TO LogSources");
        }
        if (i < 8 && i2 >= 8) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 853, "PhenotypeDbHelper.java")).a("Add isSynced to Packages");
            sQLiteDatabase.execSQL("ALTER TABLE Packages ADD COLUMN isSynced DEFAULT 0");
        }
        if (i < 9 && i2 >= 9) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 858, "PhenotypeDbHelper.java")).a("Add subscribedGcm to Packages");
            sQLiteDatabase.execSQL("ALTER TABLE Packages ADD COLUMN subscribedGcm INTEGER NOT NULL DEFAULT 0");
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 867, "PhenotypeDbHelper.java")).a("Add UnsubscribeGcmPackages table");
            sQLiteDatabase.execSQL(C5505c.m26426a("UnsubscribeGcmPackages", "packageName TEXT NOT NULL PRIMARY KEY"));
        }
        if (i < 10 && i2 >= 10) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 873, "PhenotypeDbHelper.java")).a("Adding FlagOverrides table");
            str = "FlagOverrides";
            strArr = new String[10];
            strArr[0] = "packageName TEXT NOT NULL";
            strArr[1] = "user TEXT NOT NULL";
            strArr[2] = "name TEXT NOT NULL";
            strArr[3] = "flagType INTEGER NOT NULL";
            strArr[4] = "intVal INTEGER";
            strArr[5] = "boolVal INTEGER";
            strArr[6] = "floatVal REAL";
            strArr[7] = "stringVal TEXT";
            strArr[8] = "extensionVal BLOB";
            valueOf3 = String.valueOf("committed");
            valueOf2 = String.valueOf(C5505c.m26427a("packageName", "user", "name", "committed"));
            strArr[9] = valueOf2.length() != 0 ? valueOf3.concat(valueOf2) : new String(valueOf3);
            sQLiteDatabase.execSQL(C5505c.m26426a(str, strArr));
        }
        if (i < 11 && i2 >= 11) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 896, "PhenotypeDbHelper.java")).a("Update patchable to nullable in ApplicationStates");
            sQLiteDatabase.execSQL("ALTER TABLE ApplicationStates RENAME TO OldApplicationStates");
            sQLiteDatabase.execSQL(C5505c.m26426a("ApplicationStates", "packageName TEXT NOT NULL PRIMARY KEY", "user TEXT NOT NULL", "version INTEGER NOT NULL", "patchable INTEGER"));
            valueOf2 = "packageName,user,version,patchable";
            sQLiteDatabase.execSQL(new StringBuilder((String.valueOf(valueOf2).length() + 66) + String.valueOf(valueOf2).length()).append("INSERT INTO ApplicationStates(").append(valueOf2).append(") SELECT ").append(valueOf2).append(" FROM OldApplicationStates;").toString());
            sQLiteDatabase.execSQL("DROP TABLE OldApplicationStates;");
        }
        if (i < 12 && i2 >= 12) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 927, "PhenotypeDbHelper.java")).a("Fix Phenotype registration to be weak");
            sQLiteDatabase.execSQL("UPDATE Packages SET weak = 1 WHERE packageName = 'com.google.android.gms.phenotype.core'");
        }
        if (i < 13 && i2 >= 13) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 933, "PhenotypeDbHelper.java")).a("Update ChangeCounts schema");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ChangeCounts");
            sQLiteDatabase.execSQL(C5505c.m26426a("ChangeCounts", "packageName TEXT NOT NULL PRIMARY KEY", "count INTEGER NOT NULL"));
        }
        if (i < 14 && i2 >= 14) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 944, "PhenotypeDbHelper.java")).a("Add servingVersion to ExperimentTokens");
            sQLiteDatabase.execSQL("ALTER TABLE ExperimentTokens ADD COLUMN servingVersion INTEGER NOT NULL DEFAULT 0");
        }
        if (i < 15 && i2 >= 15) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 956, "PhenotypeDbHelper.java")).a("Add dynamicParams to Packages");
            sQLiteDatabase.execSQL("ALTER TABLE Packages ADD COLUMN dynamicParams BLOB DEFAULT NULL");
        }
        if (i < 16 && i2 >= 16) {
            ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onUpgrade", 967, "PhenotypeDbHelper.java")).a("Restructuring GCM data");
            sQLiteDatabase.execSQL(C5505c.m26426a("GcmState", "packageName TEXT NOT NULL PRIMARY KEY", "isSubscribed INTEGER NOT NULL", "subscribeAfterTime INTEGER NOT NULL DEFAULT 0"));
            sQLiteDatabase.execSQL("INSERT INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM Packages WHERE subscribedGcm = 1");
            sQLiteDatabase.execSQL("INSERT INTO GcmState(packageName, isSubscribed) SELECT packageName, 1 FROM UnsubscribeGcmPackages");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS UnsubscribeGcmPackages");
            sQLiteDatabase.execSQL("ALTER TABLE Packages RENAME TO OldPackages");
            sQLiteDatabase.execSQL(C5505c.m26426a("Packages", "packageName TEXT NOT NULL PRIMARY KEY", "version INTEGER NOT NULL", "params BLOB", "dynamicParams BLOB", "weak INTEGER NOT NULL", "androidPackageName TEXT NOT NULL", "isSynced INTEGER"));
            sQLiteDatabase.execSQL(C5505c.m26425a("Packages", "androidPackageName", "androidPackageName"));
            valueOf2 = "packageName,version,params,dynamicParams,weak,androidPackageName,isSynced";
            sQLiteDatabase.execSQL(new StringBuilder((String.valueOf(valueOf2).length() + 48) + String.valueOf(valueOf2).length()).append("INSERT INTO Packages(").append(valueOf2).append(") SELECT ").append(valueOf2).append(" FROM OldPackages;").toString());
            sQLiteDatabase.execSQL("DROP TABLE OldPackages;");
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((d) ((d) f28329a.a(Level.INFO)).a("com/google/android/gms/phenotype/core/common/PhenotypeDbHelper", "onDowngrade", 1011, "PhenotypeDbHelper.java")).a("onDowngrade %d to %d", i, i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Packages");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ApplicationStates");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS LogSources");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS WeakExperimentIds");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ExperimentTokens");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Flags");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS RequestTags");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ApplicationTags");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CrossLoggedExperimentTokens");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ChangeCounts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS DogfoodsToken");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS LastFetch");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS FlagOverrides");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS GcmState");
        onCreate(sQLiteDatabase);
    }

    public static String m26424a(SQLiteDatabase sQLiteDatabase, String str) {
        String str2 = null;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"androidPackageName"}, "packageName = ?", new String[]{str}, null, null, null, "1");
        try {
            if (query.moveToFirst()) {
                str2 = query.getString(0);
            } else {
                query.close();
            }
            return str2;
        } finally {
            query.close();
        }
    }

    static {
        Charset.forName("UTF-8");
    }
}
