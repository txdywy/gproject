package com.google.android.gms.phenotype.core.service.operations;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.phenotype.core.p304a.C5504b;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import com.google.d.b.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public final class C5544j {
    public static final c f28443a = c.a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon");

    public static C5545k m26507a(C5505c c5505c, a aVar, String str) {
        if (aVar == null) {
            throw new IllegalArgumentException("Null RegistrationInfo");
        }
        SQLiteDatabase writableDatabase = c5505c.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            C5545k a = C5544j.m26506a(writableDatabase, aVar, str);
            writableDatabase.setTransactionSuccessful();
            return a;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private static C5545k m26506a(SQLiteDatabase sQLiteDatabase, a aVar, String str) {
        int i = 0;
        if (aVar.a == null || aVar.a.isEmpty()) {
            ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 110, "RegistrationCommon.java")).a("No package name specified");
            return C5545k.f28444a;
        } else if (aVar.c == null) {
            ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 115, "RegistrationCommon.java")).a("No log source(s) specified");
            return C5545k.f28444a;
        } else {
            int length;
            for (String str2 : aVar.c) {
                if (str2 == null || str2.isEmpty()) {
                    ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 120, "RegistrationCommon.java")).a("Invalid log source name");
                    return C5545k.f28444a;
                }
            }
            if (!aVar.f && aVar.d != null && aVar.d.length != 0) {
                ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 126, "RegistrationCommon.java")).a("Experiment ids for weak only");
                return C5545k.f28444a;
            } else if (aVar.f && aVar.d == null) {
                ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 131, "RegistrationCommon.java")).a("Experiment ids required for weak");
                return C5545k.f28444a;
            } else if (aVar.g == null || aVar.g.isEmpty()) {
                ((d) ((d) f28443a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegistrationCommon", "registerInTransaction", 136, "RegistrationCommon.java")).a("No Android package specified");
                return C5545k.f28444a;
            } else if (!C5544j.m26508a(sQLiteDatabase, aVar.a, aVar.g)) {
                return C5545k.f28444a;
            } else {
                String str3 = aVar.a;
                int[] iArr = aVar.d;
                if (sQLiteDatabase.delete("WeakExperimentIds", "packageName = ?", new String[]{str3}) < 0) {
                    throw new SQLiteException(String.valueOf(str3).concat(" failed to delete from WeakExperimentIds"));
                }
                if (iArr != null) {
                    length = iArr.length;
                    while (i < length) {
                        int i2 = iArr[i];
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("packageName", str3);
                        contentValues.put("experimentId", Integer.valueOf(i2));
                        if (sQLiteDatabase.insert("WeakExperimentIds", null, contentValues) < 0) {
                            throw new SQLiteException(String.valueOf(str3).concat(" failed to insert to WeakExperimentIds"));
                        }
                        i++;
                    }
                }
                if (C5544j.m26510a(sQLiteDatabase, aVar.a, aVar.c) || aVar.f) {
                    C5540f.m26497a();
                }
                return new C5545k(C5544j.m26511b(sQLiteDatabase, aVar, str));
            }
        }
    }

    private static boolean m26508a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"androidPackageName"}, "packageName = ?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() > 1) {
                String str3 = "Violation of 1:1 mapping of config package: ";
                String valueOf = String.valueOf(str);
                throw new AssertionError(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            } else if (query.getCount() == 1) {
                query.moveToFirst();
                boolean equals = str2.equals(query.getString(0));
                return equals;
            } else {
                query.close();
                return true;
            }
        } finally {
            query.close();
        }
    }

    private static boolean m26510a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Set<String> hashSet = new HashSet(Arrays.asList(strArr));
        if (!C5544j.m26509a(sQLiteDatabase, str, (Set) hashSet)) {
            return false;
        }
        ((d) ((d) C5504b.f28328a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/common/MetricsLogSources", "clearCache", 32, "MetricsLogSources.java")).a("clearing MetricsLogSourcesCache");
        if (sQLiteDatabase.delete("LogSources", "packageName = ?", new String[]{str}) < 0) {
            throw new SQLiteException(String.valueOf(str).concat(" failed to delete LogSources"));
        }
        for (String str2 : hashSet) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", str);
            contentValues.put("logSourceName", str2);
            if (sQLiteDatabase.insertWithOnConflict("LogSources", null, contentValues, 5) < 0) {
                throw new SQLiteException(String.valueOf(str).concat(" failed to insert LogSources"));
            }
        }
        return true;
    }

    private static boolean m26509a(SQLiteDatabase sQLiteDatabase, String str, Set set) {
        Set hashSet = new HashSet();
        Cursor query = sQLiteDatabase.query("LogSources", new String[]{"logSourceName"}, "packageName = ?", new String[]{str}, null, null, null);
        while (query.moveToNext()) {
            try {
                hashSet.add(query.getString(0));
            } finally {
                query.close();
            }
        }
        return !set.equals(hashSet);
    }

    private static int m26511b(SQLiteDatabase sQLiteDatabase, a aVar, String str) {
        Object obj = str != null ? 1 : null;
        Object obj2 = null;
        String str2 = "Packages";
        String[] strArr = new String[]{"version", "params", "dynamicParams", "weak"};
        String valueOf = String.valueOf("packageName = ?");
        String valueOf2 = String.valueOf(obj != null ? " AND isSynced = 1" : "");
        Cursor query = sQLiteDatabase.query(str2, strArr, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), new String[]{aVar.a}, null, null, null);
        try {
            byte[] bArr;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            if (query.moveToNext()) {
                Object obj7;
                Object obj8;
                if (query.getInt(0) == aVar.b) {
                    obj7 = 1;
                } else {
                    obj7 = null;
                }
                if (Arrays.equals(aVar.e, query.getBlob(1))) {
                    obj8 = 1;
                } else {
                    obj8 = null;
                }
                byte[] blob = query.getBlob(2);
                if (aVar.f == (query.getInt(3) != 0)) {
                    bArr = blob;
                    obj3 = obj8;
                    obj4 = obj7;
                    obj2 = 1;
                    obj5 = 1;
                } else {
                    bArr = blob;
                    obj3 = obj8;
                    int i = 1;
                    obj5 = null;
                    obj4 = obj7;
                }
            } else {
                obj5 = null;
                obj4 = null;
                obj3 = null;
                bArr = null;
            }
            query.close();
            if (obj2 == null || obj4 == null || obj3 == null || r2 == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("packageName", aVar.a);
                contentValues.put("version", Integer.valueOf(aVar.b));
                contentValues.put("params", aVar.e);
                contentValues.put("dynamicParams", bArr);
                contentValues.put("weak", Integer.valueOf(aVar.f ? 1 : 0));
                contentValues.put("androidPackageName", aVar.g);
                contentValues.put("isSynced", Integer.valueOf(0));
                if (sQLiteDatabase.insertWithOnConflict("Packages", null, contentValues, 5) < 0) {
                    throw new SQLiteException(String.valueOf(aVar.a).concat(" failed to insert registration"));
                }
            }
            if (obj4 != null || ((obj3 == null && bArr == null) || obj != null)) {
                obj6 = obj4;
            } else {
                Cursor query2 = sQLiteDatabase.query("ExperimentTokens", new String[]{"version"}, "packageName = ? AND version = ?", new String[]{aVar.a, Integer.toString(aVar.b)}, null, null, null);
                try {
                    if (query2.getCount() > 0) {
                        obj4 = 1;
                    }
                    query2.close();
                    obj6 = obj4;
                } catch (Throwable th) {
                    query2.close();
                }
            }
            if (obj != null) {
                Cursor query3 = sQLiteDatabase.query("RequestTags", new String[]{"user"}, "user = ?", new String[]{str}, null, null, null, "1");
                try {
                    if (query3.getCount() == 0) {
                        obj5 = 1;
                    } else {
                        obj5 = null;
                    }
                    query3.close();
                } catch (Throwable th2) {
                    query3.close();
                }
            } else {
                obj5 = null;
            }
            if (obj5 != null) {
                return 12;
            }
            if (obj2 == null) {
                return obj != null ? 13 : 6;
            } else {
                if (obj6 == null) {
                    return obj != null ? 14 : 7;
                } else {
                    if (obj3 == null && bArr == null) {
                        return obj != null ? 15 : 8;
                    } else {
                        return 0;
                    }
                }
            }
        } catch (Throwable th3) {
            query.close();
        }
    }
}
