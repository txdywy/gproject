package com.google.android.gms.phenotype.core.service.operations;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.phenotype.core.C5514a;
import com.google.android.gms.phenotype.core.C5516b;
import com.google.android.gms.phenotype.core.C5530i;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5506d;
import com.google.android.gms.phenotype.core.p304a.C5507e;
import com.google.android.gms.phenotype.core.p304a.C5513k;
import com.google.android.gms.phenotype.core.p305b.C5515a;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;

public final class GetConfigurationSnapshotOperation extends C5535a {
    public static final c f28395a = c.a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation");
    public static final C5530i[] f28396b = new C5530i[0];
    public static final String[] f28397c = new String[0];
    public static final String[] f28398d = new String[]{"flagType", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal"};
    public static final C5516b f28399e = new C5516b("", "", new C5514a[0], false, null, 0);
    public static final String[] f28400f = new String[0];
    public final String f28401g;
    public final String f28402h;
    public final String f28403i;
    public final String f28404j;

    final class NotRegisteredException extends Exception {
        NotRegisteredException() {
        }
    }

    public GetConfigurationSnapshotOperation(String str, String str2, String str3, String str4) {
        this.f28401g = str;
        this.f28402h = str2;
        this.f28403i = str3;
        this.f28404j = str4;
    }

    public final C5516b m26488a(Context context, C5505c c5505c) {
        if (this.f28401g == null) {
            ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 106, "GetConfigurationSnapshotOperation.java")).a("No source package name specified");
            return null;
        } else if (this.f28404j == null) {
            ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 111, "GetConfigurationSnapshotOperation.java")).a("No target package name specified");
            return null;
        } else if (!this.f28401g.endsWith(this.f28404j) && !this.f28401g.equals("com.google.EMPTY")) {
            ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 117, "GetConfigurationSnapshotOperation.java")).a("Alternate configuration naming convention error!");
            return null;
        } else if (this.f28402h == null) {
            ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 122, "GetConfigurationSnapshotOperation.java")).a("User cannot be null. Pass \"\" to indicate no user instead.");
            return null;
        } else if (this.f28402h.equals("") || C5513k.m26437a(this.f28402h, context)) {
            SQLiteDatabase writableDatabase = c5505c.getWritableDatabase();
            writableDatabase.beginTransaction();
            if (this.f28401g.equals(this.f28404j) || !m26485a(writableDatabase, this.f28401g)) {
                C5516b a;
                try {
                    String str;
                    String str2;
                    String a2;
                    String str3;
                    String str4;
                    long a3;
                    String str5;
                    String str6;
                    Object obj;
                    int a4 = m26478a(writableDatabase);
                    C5530i[] a5 = m26486a(writableDatabase, this.f28404j, this.f28402h);
                    C5539e a6 = m26483a(writableDatabase, a4, a5);
                    Pair a7 = C5506d.m26429a(writableDatabase, this.f28404j);
                    if (this.f28403i != null) {
                        String[] a8 = m26487a(this.f28403i);
                        if (a8.length == 7) {
                            str = a8[4];
                            str2 = null;
                            if (a7 != null) {
                                str2 = m26484a(writableDatabase, this.f28404j, ((Integer) a7.second).intValue(), (String) a7.first, true);
                            }
                            a2 = m26484a(writableDatabase, this.f28401g, a4, this.f28402h, false);
                            str3 = this.f28402h;
                            str4 = this.f28401g;
                            a3 = C5507e.m26430a(writableDatabase, this.f28401g);
                            str5 = this.f28404j;
                            str6 = str2 == null ? str2 : "";
                            a2 = new StringBuilder(((((String.valueOf(str3).length() + 37) + String.valueOf(str4).length()) + String.valueOf(a2).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append(str3).append(" ").append(str4).append(" ").append(a4).append(" ").append(a3).append(" ").append(a2).append(" ").append(str5).append(" ").append(str6).toString();
                            obj = (a5 != null || a5 == f28396b) ? 1 : null;
                            obj = (obj == null && str.equals(str2) && ((Boolean) C5515a.f28351i.m27280a()).booleanValue()) ? 1 : null;
                            if (obj == null) {
                                a = m26479a(writableDatabase, a4, a2, a6, a7);
                            } else {
                                a = m26480a(writableDatabase, a4, a2, a6, a5);
                            }
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            return a;
                        }
                    }
                    str = "!";
                    str2 = null;
                    if (a7 != null) {
                        str2 = m26484a(writableDatabase, this.f28404j, ((Integer) a7.second).intValue(), (String) a7.first, true);
                    }
                    a2 = m26484a(writableDatabase, this.f28401g, a4, this.f28402h, false);
                    str3 = this.f28402h;
                    str4 = this.f28401g;
                    a3 = C5507e.m26430a(writableDatabase, this.f28401g);
                    str5 = this.f28404j;
                    if (str2 == null) {
                    }
                    a2 = new StringBuilder(((((String.valueOf(str3).length() + 37) + String.valueOf(str4).length()) + String.valueOf(a2).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append(str3).append(" ").append(str4).append(" ").append(a4).append(" ").append(a3).append(" ").append(a2).append(" ").append(str5).append(" ").append(str6).toString();
                    if (a5 != null) {
                    }
                    if (obj == null) {
                    }
                    if (obj == null) {
                        a = m26480a(writableDatabase, a4, a2, a6, a5);
                    } else {
                        a = m26479a(writableDatabase, a4, a2, a6, a7);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return a;
                } catch (NotRegisteredException e) {
                    if (this.f28401g.equals(this.f28404j)) {
                        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 187, "GetConfigurationSnapshotOperation.java")).a("succeeded but not registered: %s", this.f28401g);
                        a = f28399e;
                    } else {
                        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 190, "GetConfigurationSnapshotOperation.java")).a("alternate package not registered correctly: %s", this.f28401g);
                        a = null;
                    }
                    writableDatabase.endTransaction();
                    return a;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                }
            } else {
                ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 135, "GetConfigurationSnapshotOperation.java")).a("Alternate configuration source cannot have log sources");
                writableDatabase.endTransaction();
                return null;
            }
        } else {
            ((d) ((d) f28395a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "execute", 126, "GetConfigurationSnapshotOperation.java")).a("Invalid user");
            return null;
        }
    }

    static String m26484a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        String str3 = "ExperimentTokens";
        String[] strArr = new String[]{"configHash"};
        String str4 = "packageName = ? AND version = ? AND user = ? AND isCommitted = ?";
        String[] strArr2 = new String[4];
        strArr2[0] = str;
        strArr2[1] = Integer.toString(i);
        strArr2[2] = str2;
        strArr2[3] = z ? "1" : "0";
        Cursor query = sQLiteDatabase.query(str3, strArr, str4, strArr2, null, null, null);
        try {
            String string;
            if (query.getCount() > 0) {
                query.moveToNext();
                string = query.getString(0);
                return string;
            }
            string = "";
            query.close();
            return string;
        } finally {
            query.close();
        }
    }

    static String[] m26487a(String str) {
        if (str != null) {
            String[] split = str.split(" ", 8);
            if (split.length == 7) {
                return split;
            }
        }
        return f28400f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.phenotype.core.C5530i[] m26486a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13) {
        /*
        r1 = "FlagOverrides";
        r2 = f28398d;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = "1";
        r0 = r11;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r1 = r0.getCount();	 Catch:{ all -> 0x0092 }
        if (r1 != 0) goto L_0x001a;
    L_0x0015:
        r0.close();
        r0 = 0;
    L_0x0019:
        return r0;
    L_0x001a:
        r0.close();
        r1 = "FlagOverrides";
        r2 = f28398d;
        r3 = "packageName = ? AND user = '*' AND committed = 0";
        r0 = 1;
        r4 = new java.lang.String[r0];
        r0 = 0;
        r4[r0] = r12;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r11;
        r9 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r1 = "FlagOverrides";
        r2 = f28398d;
        r3 = "packageName = ? AND user = ? AND committed = 0";
        r0 = 2;
        r4 = new java.lang.String[r0];
        r0 = 0;
        r4[r0] = r12;
        r0 = 1;
        r4[r0] = r13;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r11;
        r10 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r0 = r9.getCount();	 Catch:{ all -> 0x00c6 }
        r1 = r10.getCount();	 Catch:{ all -> 0x00c6 }
        r0 = r0 + r1;
        if (r0 != 0) goto L_0x00ce;
    L_0x0053:
        r1 = "FlagOverrides";
        r2 = f28398d;	 Catch:{ all -> 0x00c6 }
        r3 = "packageName != ? AND committed = 1";
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = "1";
        r0 = r11;
        r1 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x00c6 }
        r0 = r1.getCount();	 Catch:{ all -> 0x00c1 }
        if (r0 != 0) goto L_0x0097;
    L_0x006a:
        r0 = f28395a;	 Catch:{ all -> 0x00c1 }
        r2 = java.util.logging.Level.CONFIG;	 Catch:{ all -> 0x00c1 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x00c1 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c1 }
        r2 = "com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation";
        r3 = "getUncommittedOverrides";
        r4 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r5 = "GetConfigurationSnapshotOperation.java";
        r0 = r0.a(r2, r3, r4, r5);	 Catch:{ all -> 0x00c1 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c1 }
        r2 = "getUncommittedOverrides no overrides (after commit)";
        r0.a(r2);	 Catch:{ all -> 0x00c1 }
        r1.close();	 Catch:{ all -> 0x00c6 }
        r9.close();
        r10.close();
        r0 = 0;
        goto L_0x0019;
    L_0x0092:
        r1 = move-exception;
        r0.close();
        throw r1;
    L_0x0097:
        r0 = f28395a;	 Catch:{ all -> 0x00c1 }
        r2 = java.util.logging.Level.CONFIG;	 Catch:{ all -> 0x00c1 }
        r0 = r0.a(r2);	 Catch:{ all -> 0x00c1 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c1 }
        r2 = "com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation";
        r3 = "getUncommittedOverrides";
        r4 = 325; // 0x145 float:4.55E-43 double:1.606E-321;
        r5 = "GetConfigurationSnapshotOperation.java";
        r0 = r0.a(r2, r3, r4, r5);	 Catch:{ all -> 0x00c1 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c1 }
        r2 = "getUncommittedOverrides empty overrides";
        r0.a(r2);	 Catch:{ all -> 0x00c1 }
        r0 = f28396b;	 Catch:{ all -> 0x00c1 }
        r1.close();	 Catch:{ all -> 0x00c6 }
        r9.close();
        r10.close();
        goto L_0x0019;
    L_0x00c1:
        r0 = move-exception;
        r1.close();	 Catch:{ all -> 0x00c6 }
        throw r0;	 Catch:{ all -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        r9.close();
        r10.close();
        throw r0;
    L_0x00ce:
        r0 = r9.getCount();	 Catch:{ all -> 0x00c6 }
        r1 = r10.getCount();	 Catch:{ all -> 0x00c6 }
        r0 = r0 + r1;
        r1 = new com.google.android.gms.phenotype.core.C5530i[r0];	 Catch:{ all -> 0x00c6 }
        r2 = 0;
    L_0x00da:
        r0 = r9.moveToNext();	 Catch:{ all -> 0x00c6 }
        if (r0 == 0) goto L_0x0107;
    L_0x00e0:
        r3 = m26482a(r9);	 Catch:{ all -> 0x00c6 }
        r0 = f28395a;	 Catch:{ all -> 0x00c6 }
        r4 = java.util.logging.Level.CONFIG;	 Catch:{ all -> 0x00c6 }
        r0 = r0.a(r4);	 Catch:{ all -> 0x00c6 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c6 }
        r4 = "com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation";
        r5 = "getUncommittedOverrides";
        r6 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r7 = "GetConfigurationSnapshotOperation.java";
        r0 = r0.a(r4, r5, r6, r7);	 Catch:{ all -> 0x00c6 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c6 }
        r4 = "getUncommittedOverrides override: %s";
        r0.a(r4, r3);	 Catch:{ all -> 0x00c6 }
        r0 = r2 + 1;
        r1[r2] = r3;	 Catch:{ all -> 0x00c6 }
        r2 = r0;
        goto L_0x00da;
    L_0x0107:
        r0 = r10.moveToNext();	 Catch:{ all -> 0x00c6 }
        if (r0 == 0) goto L_0x0134;
    L_0x010d:
        r3 = m26482a(r10);	 Catch:{ all -> 0x00c6 }
        r0 = f28395a;	 Catch:{ all -> 0x00c6 }
        r4 = java.util.logging.Level.CONFIG;	 Catch:{ all -> 0x00c6 }
        r0 = r0.a(r4);	 Catch:{ all -> 0x00c6 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c6 }
        r4 = "com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation";
        r5 = "getUncommittedOverrides";
        r6 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
        r7 = "GetConfigurationSnapshotOperation.java";
        r0 = r0.a(r4, r5, r6, r7);	 Catch:{ all -> 0x00c6 }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x00c6 }
        r4 = "getUncommittedOverrides override: %s";
        r0.a(r4, r3);	 Catch:{ all -> 0x00c6 }
        r0 = r2 + 1;
        r1[r2] = r3;	 Catch:{ all -> 0x00c6 }
        r2 = r0;
        goto L_0x0107;
    L_0x0134:
        r9.close();
        r10.close();
        r0 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.core.service.operations.GetConfigurationSnapshotOperation.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):com.google.android.gms.phenotype.core.i[]");
    }

    private final int m26478a(SQLiteDatabase sQLiteDatabase) {
        if (this.f28401g.equals("com.google.EMPTY")) {
            return 0;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"version"}, "packageName = ?", new String[]{this.f28401g}, null, null, null);
        try {
            if (query.getCount() <= 0) {
                throw new NotRegisteredException();
            }
            query.moveToFirst();
            int i = query.getInt(0);
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("ExperimentTokens", new String[]{"version"}, "packageName = ? AND version <= ? AND user = ? AND isCommitted = 0", new String[]{this.f28401g, Integer.toString(i), this.f28402h}, null, null, "version DESC", "1");
            try {
                int i2;
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    i2 = query.getInt(0);
                } else {
                    i2 = i;
                }
                query.close();
                return i2;
            } catch (Throwable th) {
                query.close();
            }
        } finally {
            query.close();
        }
    }

    private final C5539e m26483a(SQLiteDatabase sQLiteDatabase, int i, C5530i[] c5530iArr) {
        int i2 = 0;
        if (c5530iArr != null) {
            int length = c5530iArr.length;
            while (i2 < length) {
                C5530i c5530i = c5530iArr[i2];
                if (c5530i.f28382a.equals("__phenotype_server_token") && c5530i.f28388g == 4) {
                    return new C5539e(null, c5530i.m26473d(), 0);
                }
                i2++;
            }
            return C5539e.f28422a;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ExperimentTokens", new String[]{"experimentToken", "serverToken", "servingVersion"}, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{this.f28401g, Integer.toString(i), this.f28402h}, null, null, null, null);
        try {
            C5539e c5539e;
            if (query.moveToFirst()) {
                c5539e = new C5539e(query.getBlob(0), query.getString(1), query.getLong(2));
                return c5539e;
            }
            c5539e = C5539e.f28422a;
            query.close();
            return c5539e;
        } finally {
            query.close();
        }
    }

    private final C5516b m26479a(SQLiteDatabase sQLiteDatabase, int i, String str, C5539e c5539e, Pair pair) {
        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "getPatchConfigurations", 470, "GetConfigurationSnapshotOperation.java")).a("getPatchConfigurations");
        String str2 = (String) pair.first;
        int intValue = ((Integer) pair.second).intValue();
        Collection treeSet = new TreeSet();
        Set treeSet2 = new TreeSet(C5530i.f28381i);
        C5530i[] b = C5538d.m26493b(sQLiteDatabase, this.f28404j);
        if (b != null) {
            for (Object obj : b) {
                treeSet.add(obj);
                treeSet2.add(obj);
            }
        }
        Cursor query = sQLiteDatabase.query("Flags", f28398d, "packageName = ? AND version = ? AND user = ? AND committed = 1", new String[]{this.f28404j, Integer.toString(intValue), str2}, null, null, null);
        while (query.moveToNext()) {
            C5530i a;
            try {
                a = m26482a(query);
                if (!treeSet2.contains(a)) {
                    treeSet.add(a);
                    treeSet2.add(a);
                }
            } finally {
                query.close();
            }
        }
        Set treeSet3 = new TreeSet();
        Collection treeSet4 = new TreeSet(C5530i.f28381i);
        query = sQLiteDatabase.query("Flags", f28398d, "packageName = ? AND version = ? AND user = ? AND committed = 0", new String[]{this.f28401g, Integer.toString(i), this.f28402h}, null, null, null);
        while (query.moveToNext()) {
            try {
                a = m26482a(query);
                treeSet3.add(a);
                treeSet4.add(a);
            } finally {
                query.close();
            }
        }
        treeSet3.removeAll(treeSet);
        treeSet2.removeAll(treeSet4);
        return m26481a(treeSet3, treeSet2, str, c5539e, true);
    }

    private final C5516b m26480a(SQLiteDatabase sQLiteDatabase, int i, String str, C5539e c5539e, C5530i[] c5530iArr) {
        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "getFullConfigurations", 554, "GetConfigurationSnapshotOperation.java")).a("getFullConfigurations");
        Set treeSet = new TreeSet(C5530i.f28381i);
        Cursor query = sQLiteDatabase.query("Flags", f28398d, "packageName = ?", new String[]{this.f28401g}, null, null, null);
        while (query.moveToNext()) {
            try {
                treeSet.add(m26482a(query));
            } finally {
                query.close();
            }
        }
        Set treeSet2 = new TreeSet(C5530i.f28381i);
        query = sQLiteDatabase.query("Flags", f28398d, "packageName = ? AND version = ? AND user = ? AND committed = 0", new String[]{this.f28401g, Integer.toString(i), this.f28402h}, null, null, null);
        while (query.moveToNext()) {
            try {
                C5530i a = m26482a(query);
                treeSet2.add(a);
                treeSet.remove(a);
            } finally {
                query.close();
            }
        }
        if (c5530iArr != null) {
            for (Object obj : c5530iArr) {
                treeSet2.remove(obj);
                treeSet2.add(obj);
                treeSet.remove(obj);
            }
        }
        return m26481a(treeSet2, treeSet, str, c5539e, false);
    }

    private static C5516b m26481a(Set set, Set set2, String str, C5539e c5539e, boolean z) {
        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "byFlagStorageType", 616, "GetConfigurationSnapshotOperation.java")).a("byFlagStorageType, addSet = %s", TextUtils.join(", ", set));
        ((d) ((d) f28395a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/GetConfigurationSnapshotOperation", "byFlagStorageType", 617, "GetConfigurationSnapshotOperation.java")).a("byFlagStorageType, deleteSet = %s", TextUtils.join(", ", set2));
        Map hashMap = new HashMap();
        for (C5530i c5530i : set) {
            C5535a.m26477a(hashMap, Integer.valueOf(c5530i.f28389h), c5530i);
        }
        Map hashMap2 = new HashMap();
        for (C5530i c5530i2 : set2) {
            C5535a.m26477a(hashMap2, Integer.valueOf(c5530i2.f28389h), c5530i2);
        }
        List arrayList = new ArrayList();
        Set<Integer> hashSet = new HashSet();
        hashSet.addAll(hashMap.keySet());
        hashSet.addAll(hashMap2.keySet());
        for (Integer num : hashSet) {
            Collection collection = (Collection) hashMap.get(num);
            Collection<C5530i> collection2 = (Collection) hashMap2.get(num);
            C5530i[] c5530iArr = f28396b;
            if (collection != null) {
                c5530iArr = (C5530i[]) collection.toArray(new C5530i[collection.size()]);
            }
            String[] strArr = f28397c;
            if (collection2 != null) {
                String[] strArr2 = new String[collection2.size()];
                int i = 0;
                for (C5530i c5530i3 : collection2) {
                    int i2 = i + 1;
                    strArr2[i] = c5530i3.f28382a;
                    i = i2;
                }
                strArr = strArr2;
            }
            arrayList.add(new C5514a(num.intValue(), c5530iArr, strArr));
        }
        return new C5516b(str, c5539e.f28424c, (C5514a[]) arrayList.toArray(new C5514a[arrayList.size()]), z, c5539e.f28423b, c5539e.f28425d);
    }

    static C5530i m26482a(Cursor cursor) {
        boolean z = true;
        int i = cursor.getInt(0);
        String string = cursor.getString(1);
        if (!cursor.isNull(2)) {
            return new C5530i(string, cursor.getLong(2), i);
        }
        if (!cursor.isNull(3)) {
            if (cursor.getInt(3) == 0) {
                z = false;
            }
            return new C5530i(string, z, i);
        } else if (!cursor.isNull(4)) {
            return new C5530i(string, cursor.getDouble(4), i);
        } else {
            if (!cursor.isNull(5)) {
                return new C5530i(string, cursor.getString(5), i);
            }
            if (cursor.isNull(6)) {
                return null;
            }
            return new C5530i(string, cursor.getBlob(6), i);
        }
    }

    static boolean m26485a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("LogSources", new String[]{"packageName"}, "packageName = ?", new String[]{str}, null, null, "1");
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
}
