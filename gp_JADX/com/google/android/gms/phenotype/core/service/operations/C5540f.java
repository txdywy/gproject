package com.google.android.gms.phenotype.core.service.operations;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.p037h.C0314i;
import android.util.Pair;
import com.google.android.gms.phenotype.core.C5524c;
import com.google.android.gms.phenotype.core.p304a.C5504b;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5506d;
import com.google.android.gms.phenotype.core.p305b.C5515a;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public final class C5540f extends C5535a {
    public static final c f28426a = c.a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation");
    public static final byte[][] f28427b = new byte[0][];
    public static final int[] f28428c = new int[]{14900366};
    public static final C5541g f28429g = new C5541g();
    public static final C5524c f28430h = C5524c.f28368b.m26462a();
    public static final byte[][] f28431i = new byte[0][];
    public final String f28432d;
    public final String f28433e = null;
    public final String f28434f;

    public C5540f(String str, String str2) {
        this.f28432d = str;
        this.f28434f = str2;
    }

    public static void m26497a() {
        ((d) ((d) f28426a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation", "clearCache", 84, "GetExperimentTokensOperation.java")).a("Clearing ExperimentTokensCache");
        f28429g.m1694a(-1);
    }

    public final C5524c m26503a(C5505c c5505c) {
        if (this.f28433e == null && this.f28432d == null) {
            ((d) ((d) f28426a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation", "execute", 92, "GetExperimentTokensOperation.java")).a("No package name or log source specified");
            return null;
        } else if (this.f28433e == null || this.f28432d == null) {
            C5524c c5524c = (C5524c) f28429g.m1692a(this.f28433e == null ? this.f28432d : this.f28433e);
            if (c5524c == null) {
                SQLiteDatabase writableDatabase = c5505c.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    C5524c c5524c2;
                    Object obj;
                    Object obj2;
                    List<String> a = m26495a(writableDatabase);
                    if (a == null) {
                        ((d) ((d) f28426a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation", "execute", 109, "GetExperimentTokensOperation.java")).a("failed to find package for log source: %s with calling package: %s", this.f28433e, this.f28434f);
                        c5524c2 = c5524c;
                    } else {
                        Object obj3;
                        List b;
                        for (String a2 : a) {
                            if (C5504b.m26422a(a2)) {
                                obj3 = 1;
                                b = C5540f.m26500b(writableDatabase);
                                break;
                            }
                        }
                        obj3 = null;
                        b = a;
                        List arrayList = new ArrayList(r0.size());
                        for (String a22 : r0) {
                            Object obj4;
                            Object obj5 = obj3 == null ? 1 : null;
                            Pair a3 = C5506d.m26429a(writableDatabase, a22);
                            byte[] bArr;
                            String str;
                            int i;
                            int[] iArr;
                            Map a4;
                            if (a3 == null) {
                                int a5 = C5540f.m26494a(writableDatabase, a22);
                                if (a5 < 0) {
                                    obj4 = null;
                                } else {
                                    bArr = null;
                                    int i2 = a5;
                                    str = "";
                                    i = i2;
                                    iArr = null;
                                    if (bArr == null) {
                                        iArr = C5540f.m26501b(writableDatabase, a22);
                                    }
                                    if (C5540f.m26502c(writableDatabase)) {
                                        if (iArr != null) {
                                            iArr = f28428c;
                                        } else {
                                            iArr = Arrays.copyOf(iArr, iArr.length + 1);
                                            iArr[iArr.length - 1] = 14900366;
                                        }
                                        obj4 = new C5524c(str, null, f28427b, f28427b, f28427b, f28427b, iArr);
                                    } else if (obj5 != null) {
                                        obj4 = new C5524c(str, bArr, f28427b, f28427b, f28427b, f28427b, iArr);
                                    } else {
                                        a4 = C5540f.m26496a(writableDatabase, i, a22, str);
                                        if (a4 == null) {
                                            obj4 = new C5524c(str, bArr, C5540f.m26499a((Collection) a4.get(Integer.valueOf(1))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(2))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(3))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(4))), iArr);
                                        } else {
                                            obj4 = new C5524c(str, bArr, f28427b, f28427b, f28427b, f28427b, iArr);
                                        }
                                    }
                                }
                            } else {
                                str = (String) a3.first;
                                i = ((Integer) a3.second).intValue();
                                bArr = C5540f.m26498a(writableDatabase, str, a22, i);
                                iArr = null;
                                if (bArr == null) {
                                    iArr = C5540f.m26501b(writableDatabase, a22);
                                }
                                if (C5540f.m26502c(writableDatabase)) {
                                    if (iArr != null) {
                                        iArr = Arrays.copyOf(iArr, iArr.length + 1);
                                        iArr[iArr.length - 1] = 14900366;
                                    } else {
                                        iArr = f28428c;
                                    }
                                    obj4 = new C5524c(str, null, f28427b, f28427b, f28427b, f28427b, iArr);
                                } else if (obj5 != null) {
                                    a4 = C5540f.m26496a(writableDatabase, i, a22, str);
                                    if (a4 == null) {
                                        obj4 = new C5524c(str, bArr, f28427b, f28427b, f28427b, f28427b, iArr);
                                    } else {
                                        obj4 = new C5524c(str, bArr, C5540f.m26499a((Collection) a4.get(Integer.valueOf(1))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(2))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(3))), C5540f.m26499a((Collection) a4.get(Integer.valueOf(4))), iArr);
                                    }
                                } else {
                                    obj4 = new C5524c(str, bArr, f28427b, f28427b, f28427b, f28427b, iArr);
                                }
                            }
                            if (obj4 != null) {
                                arrayList.add(obj4);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            c5524c2 = c5524c;
                        } else if (obj3 != null) {
                            c5524c2 = new C5524c("", null, C5524c.f28367a, C5524c.f28367a, C5524c.f28367a, C5524c.f28367a, C5524c.m26459b(arrayList), C5524c.m26457a(arrayList));
                        } else {
                            c5524c2 = C5524c.m26453a(arrayList, ((Boolean) C5515a.f28350h.m27280a()).booleanValue());
                        }
                    }
                    C0314i c0314i = f28429g;
                    if (this.f28433e == null) {
                        obj = this.f28432d;
                    } else {
                        String str2 = this.f28433e;
                    }
                    if (c5524c2 == null) {
                        obj2 = f28430h;
                    } else {
                        C5524c c5524c3 = c5524c2;
                    }
                    c0314i.m1693a(obj, obj2);
                    writableDatabase.setTransactionSuccessful();
                    return c5524c2;
                } finally {
                    writableDatabase.endTransaction();
                }
            } else if (c5524c == f28430h) {
                return null;
            } else {
                return c5524c.m26462a();
            }
        } else {
            ((d) ((d) f28426a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation", "execute", 97, "GetExperimentTokensOperation.java")).a("Both package name and log source specified");
            return null;
        }
    }

    private final List m26495a(SQLiteDatabase sQLiteDatabase) {
        if (this.f28432d != null) {
            return Collections.singletonList(this.f28432d);
        }
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT LogSources.packageName FROM LogSources JOIN Packages ON LogSources.packageName = Packages.packageName WHERE logSourceName = ? AND androidPackageName = ?", new String[]{this.f28433e, this.f28434f});
        try {
            if (rawQuery.getCount() == 0) {
                ((d) ((d) f28426a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetExperimentTokensOperation", "getPackages", 258, "GetExperimentTokensOperation.java")).a("No packageName for: %s", this.f28433e);
                return null;
            }
            List arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            rawQuery.close();
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    private static List m26500b(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"packageName"}, null, null, null, null, null);
        List arrayList = new ArrayList(query.getCount());
        while (query.moveToNext()) {
            try {
                arrayList.add(query.getString(0));
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    private static int m26494a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{str}, null, null, null, null);
        try {
            if (query.getCount() <= 0) {
                return -1;
            }
            query.moveToFirst();
            int i = query.getInt(0);
            query.close();
            return i;
        } finally {
            query.close();
        }
    }

    private static boolean m26502c(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("FlagOverrides", new String[]{"packageName"}, "committed = 1", null, null, null, null, "1");
        try {
            boolean z;
            if (query.getCount() > 0) {
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

    private static byte[] m26498a(SQLiteDatabase sQLiteDatabase, String str, String str2, int i) {
        byte[] bArr = null;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ExperimentTokens", new String[]{"experimentToken"}, "user = ? AND packageName = ? AND version = ? AND isCommitted = 1", new String[]{str, str2, Integer.toString(i)}, null, null, null);
        try {
            if (query.getCount() > 0) {
                query.moveToNext();
                bArr = query.getBlob(0);
            } else {
                query.close();
            }
            return bArr;
        } finally {
            query.close();
        }
    }

    private static int[] m26501b(SQLiteDatabase sQLiteDatabase, String str) {
        int[] iArr = "packageName = ?";
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("WeakExperimentIds", new String[]{"experimentId"}, iArr, new String[]{str}, null, null, null);
        try {
            iArr = new int[query.getCount()];
            int i = 0;
            while (query.moveToNext()) {
                int i2 = i + 1;
                iArr[i] = query.getInt(0);
                i = i2;
            }
            return iArr;
        } finally {
            query.close();
        }
    }

    private static byte[][] m26499a(Collection collection) {
        if (collection == null) {
            return f28431i;
        }
        return (byte[][]) collection.toArray(f28431i);
    }

    private static Map m26496a(SQLiteDatabase sQLiteDatabase, int i, String str, String str2) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT DISTINCT token, provenance, fromUser FROM CrossLoggedExperimentTokens WHERE isCommitted = 1 AND toPackageName = ? AND toVersion = ?", new String[]{str, Integer.toString(i)});
        try {
            if (rawQuery.getCount() == 0) {
                return null;
            }
            Map hashMap = new HashMap();
            while (rawQuery.moveToNext()) {
                if (((Boolean) C5515a.f28350h.m27280a()).booleanValue() || str2.equals(rawQuery.getString(2)) || rawQuery.getInt(1) != 1) {
                    C5535a.m26477a(hashMap, Integer.valueOf(rawQuery.getInt(1)), rawQuery.getBlob(0));
                }
            }
            rawQuery.close();
            return hashMap;
        } finally {
            rawQuery.close();
        }
    }
}
