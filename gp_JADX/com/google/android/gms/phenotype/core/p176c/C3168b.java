package com.google.android.gms.phenotype.core.p176c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.phenotype.core.p304a.C5503a;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5507e;
import com.google.android.gms.phenotype.core.p304a.C5511i;
import com.google.android.gms.phenotype.core.p305b.C5515a;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import com.google.d.a.b.b;
import com.google.d.a.b.e;
import com.google.d.a.b.f;
import com.google.d.a.b.g;
import com.google.d.a.b.h;
import com.google.d.a.b.j;
import com.google.d.a.b.k;
import com.google.wireless.android.a.a.a.a.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;

public abstract class C3168b {
    public static final c f16401h = c.a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer");
    public static final byte[] f16402i = new byte[0];
    public static final C5519f f16403j = C5520c.f28363a;
    public static final C5521e f16404k = new C5522d();
    public static final b[] f16405r = new b[0];
    public final ConnectivityManager f16406l;
    public final C5505c f16407m;
    public final C5517i f16408n;
    public final C5521e f16409o;
    public final C3173h f16410p;
    public final int f16411q = 128;

    public C3168b(ConnectivityManager connectivityManager, C5505c c5505c, C5517i c5517i, C5521e c5521e, C3173h c3173h) {
        this.f16406l = connectivityManager;
        this.f16407m = c5505c;
        this.f16410p = c3173h;
        this.f16408n = c5517i;
        this.f16409o = c5521e;
    }

    public abstract com.google.wireless.android.a.a.a.a.b mo3352a(boolean z);

    public abstract String mo3353a(String str);

    public abstract void mo3354a();

    public abstract String mo3355b();

    public abstract void mo3356b(String str);

    public abstract void mo3357c();

    public abstract void mo3358d();

    public final void m16156a(String str, String[] strArr) {
        m16155a(1, str, strArr, true);
    }

    public final void m16155a(int i, String str, String[] strArr, boolean z) {
        Cursor query;
        C5519f c = this.f16409o.mo5045c();
        SQLiteDatabase writableDatabase;
        try {
            String str2;
            if (strArr.length > ((Integer) C5515a.f28344b.m27280a()).intValue()) {
                ((d) ((d) f16401h.a(Level.INFO)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "limitToReasonable", 332, "HeterodyneSyncer.java")).a("users truncated from %d to %d", strArr.length, C5515a.f28344b.m27280a());
                strArr = (String[]) Arrays.copyOf(strArr, ((Integer) C5515a.f28344b.m27280a()).intValue());
            }
            if (z) {
                writableDatabase = this.f16407m.getWritableDatabase();
                writableDatabase.beginTransaction();
                Set<String> a = C5511i.m26435a(writableDatabase);
                for (Object obj : strArr) {
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "removeOldUsers", 343, "HeterodyneSyncer.java")).a("retaining: %s", obj);
                    a.remove(obj);
                }
                for (String str22 : C3168b.m16134a(writableDatabase)) {
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "removeOldUsers", 349, "HeterodyneSyncer.java")).a("retaining committed user: %s", str22);
                    a.remove(str22);
                }
                a.remove("");
                Set<String> hashSet = new HashSet();
                for (String str222 : a) {
                    String[] strArr2 = new String[]{str222};
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "removeOldUsers", 359, "HeterodyneSyncer.java")).a("removing user: %s", (String) r11.next());
                    query = writableDatabase.query("ExperimentTokens", new String[]{"packageName"}, "user = ?", strArr2, null, null, null);
                    while (query.moveToNext()) {
                        hashSet.add(query.getString(0));
                    }
                    query.close();
                    writableDatabase.delete("ExperimentTokens", "user = ?", strArr2);
                    writableDatabase.delete("Flags", "user = ?", strArr2);
                    writableDatabase.delete("RequestTags", "user = ?", strArr2);
                    writableDatabase.delete("ApplicationTags", "user = ?", strArr2);
                    writableDatabase.delete("CrossLoggedExperimentTokens", "fromUser = ?", strArr2);
                }
                for (String b : hashSet) {
                    C5507e.m26431b(writableDatabase, b);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            m16149f();
            int g = m16150g();
            boolean a2 = C3168b.m16142a(strArr);
            if (g == -1) {
                ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "syncGiven", 240, "HeterodyneSyncer.java")).a("Skipping - there are no registered packages");
                c.mo5042a();
                return;
            }
            Set hashSet2 = new HashSet();
            if (z || strArr[0].equals("")) {
                str222 = (strArr.length <= 0 || strArr[0].equals("")) ? null : strArr[0];
                hashSet2.addAll(m16135a("", str222, i, str, g, a2));
            }
            if (g == 1) {
                for (String b2 : strArr) {
                    if (!b2.equals("")) {
                        hashSet2.addAll(m16135a(b2, null, i, str, g, a2));
                    }
                }
            }
            m16138a(hashSet2);
            c.mo5042a();
        } catch (RuntimeException e) {
            try {
                this.f16409o.mo5043a();
                throw e;
            } catch (Throwable th) {
                c.mo5042a();
            }
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
        }
    }

    private final void m16138a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next();
            mo3354a();
        }
    }

    private final Set m16135a(String str, String str2, int i, String str3, int i2, boolean z) {
        String a;
        ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "sync", 296, "HeterodyneSyncer.java")).a("Contact Heterodyne with user: %s fetch reason: %d, %s - with registrantState: %d", str, Integer.valueOf(i), str3, Integer.valueOf(i2));
        if (!"".equals(str)) {
            a = mo3353a(str);
        } else if (i2 != 1 || str2 == null) {
            a = null;
        } else {
            a = mo3353a(str2);
        }
        if (a == null) {
            this.f16409o.mo5043a();
        }
        long a2 = C5507e.m26430a(this.f16407m.getWritableDatabase(), "__sync");
        f a3 = m16130a(str, i, str3, i2, z);
        try {
            return m16133a(a2, a3, m16131a(a3, a, mo3355b()), str);
        } catch (Throwable e) {
            ((d) ((d) ((d) f16401h.a(Level.WARNING)).a(e)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "sync", 322, "HeterodyneSyncer.java")).a("Sync failed");
            this.f16409o.mo5043a();
            return Collections.emptySet();
        }
    }

    private static Set m16134a(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ApplicationStates", new String[]{"user"}, null, null, null, null, null);
        Set hashSet = new HashSet(query.getCount());
        while (query.moveToNext()) {
            try {
                hashSet.add(query.getString(0));
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    private final void m16149f() {
        Cursor query;
        Cursor query2;
        SQLiteDatabase writableDatabase = this.f16407m.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            query = writableDatabase.query("ApplicationStates", new String[]{"packageName", "version"}, null, null, null, null, null);
            String[] strArr = new String[]{null, null};
            while (query.moveToNext()) {
                String string = query.getString(0);
                long j = query.getLong(1);
                strArr[0] = string;
                query2 = writableDatabase.query("ExperimentTokens", new String[]{"version"}, "packageName = ? AND version < ?", new String[]{string, Long.toString(j)}, null, null, "version DESC", "1");
                if (query2.moveToFirst()) {
                    int i;
                    strArr[1] = Long.toString(query2.getLong(0));
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "removeOldVersions", 483, "HeterodyneSyncer.java")).a("removeOldVersions for %s < %d", string, query2.getLong(0));
                    int i2 = writableDatabase.delete("Flags", "packageName = ? AND version < ?", strArr) > 0 ? 1 : 0;
                    if (writableDatabase.delete("ExperimentTokens", "packageName = ? AND version < ?", strArr) > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    i2 |= i;
                    if (writableDatabase.delete("ApplicationTags", "packageName = ? AND version < ?", strArr) > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    i2 |= i;
                    if (writableDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND fromVersion < ?", strArr) > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    i2 |= i;
                    if (writableDatabase.delete("CrossLoggedExperimentTokens", "toPackageName = ? AND toVersion < ?", strArr) > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i | i2) != 0) {
                        C5507e.m26431b(writableDatabase, string);
                    }
                    query2.close();
                } else {
                    query2.close();
                }
            }
            query.close();
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
        }
    }

    private final f m16130a(String str, int i, String str2, int i2, boolean z) {
        f fVar = new f();
        fVar.a = new com.google.d.a.b.d();
        fVar.a.b = "".equals(str) ? 0 : 1;
        fVar.d = i;
        if (str2 != null) {
            fVar.e = str2;
        }
        fVar.f = this.f16411q;
        if (this.f16406l != null) {
            NetworkInfo activeNetworkInfo = this.f16406l.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                fVar.g = new l();
                fVar.g.a = activeNetworkInfo.getType();
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype == -1) {
                    subtype = 100;
                }
                fVar.g.b = subtype;
            }
        }
        this.f16410p.mo3359a();
        boolean z2 = i2 == 1 || z;
        com.google.wireless.android.a.a.a.a.b a = mo3352a(z2);
        com.google.wireless.android.a.a.a.a.f fVar2 = new com.google.wireless.android.a.a.a.a.f();
        fVar2.a = 4;
        fVar2.d = a;
        fVar.a.d = fVar2;
        fVar.a.g = z;
        SQLiteDatabase writableDatabase = this.f16407m.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            fVar.b = C3168b.m16143a(writableDatabase, str);
            fVar.c = C3168b.m16147b(writableDatabase, str);
            fVar.a.f = C3168b.m16146b(writableDatabase);
            writableDatabase.setTransactionSuccessful();
            return fVar;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private static b[] m16143a(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("Packages", new String[]{"packageName", "version", "params", "dynamicParams"}, null, null, null, null, null);
        try {
            List arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                b bVar = new b();
                bVar.b = new com.google.d.a.b.l();
                bVar.b.a = query.getString(0);
                bVar.b.b = query.getLong(1);
                byte[] blob = query.getBlob(2);
                byte[] blob2 = query.getBlob(3);
                if (blob2 == null) {
                    blob2 = blob;
                }
                if (blob2 != null) {
                    bVar.c = blob2;
                }
                if (!((Boolean) C5515a.f28349g.m27280a()).booleanValue()) {
                    bVar.d = C3168b.m16144a(sQLiteDatabase, bVar.b, str);
                }
                arrayList.add(bVar);
            }
            b[] bVarArr = (b[]) arrayList.toArray(f16405r);
            return bVarArr;
        } finally {
            query.close();
        }
    }

    private static k[] m16144a(SQLiteDatabase sQLiteDatabase, com.google.d.a.b.l lVar, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ApplicationTags", new String[]{"partitionId", "tag"}, "packageName = ? AND user = ? AND version = ?", new String[]{lVar.a, str, Long.toString(lVar.b)}, null, null, null);
        k[] kVarArr = new k[query.getCount()];
        int i = 0;
        while (query.moveToNext()) {
            try {
                k kVar = new k();
                kVar.b = query.getLong(0);
                kVar.c = query.getBlob(1);
                int i2 = i + 1;
                kVarArr[i] = kVar;
                i = i2;
            } finally {
                query.close();
            }
        }
        return kVarArr;
    }

    private static byte[] m16147b(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("RequestTags", new String[]{"bytesTag"}, "user = ?", new String[]{str}, null, null, null);
        try {
            byte[] bArr;
            if (query.getCount() <= 0) {
                bArr = f16402i;
            } else {
                query.moveToFirst();
                bArr = query.getBlob(0);
                query.close();
            }
            return bArr;
        } finally {
            query.close();
        }
    }

    private static byte[] m16146b(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("DogfoodsToken", new String[]{"token"}, null, null, null, null, null);
        try {
            if (query.getCount() != 0) {
                query.moveToFirst();
                byte[] blob = query.getBlob(0);
                if (blob != null) {
                    return blob;
                }
            }
            query.close();
            return f16402i;
        } finally {
            query.close();
        }
    }

    private final g m16131a(f fVar, String str, String str2) {
        ((d) ((d) f16401h.a(C3168b.m16151h())).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "sendRequest", 760, "HeterodyneSyncer.java")).a("Heterodyne Request: %s", fVar);
        C5519f c = this.f16409o.mo5045c();
        try {
            this.f16409o.mo5043a();
            C5523j a = this.f16408n.mo5041a(fVar, str, str2);
            if (a.f28365b > 0) {
                mo3358d();
            }
            if (!a.f28366c) {
                mo3356b(str);
            }
            ((d) ((d) f16401h.a(C3168b.m16151h())).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "sendRequest", 777, "HeterodyneSyncer.java")).a("Heterodyne Response: %s", a.f28364a);
            this.f16409o.mo5043a();
            if (a.f28364a != null) {
                this.f16409o.mo5043a();
            }
            g gVar = a.f28364a;
            return gVar;
        } finally {
            c.mo5042a();
        }
    }

    private final Set m16133a(long j, f fVar, g gVar, String str) {
        if (gVar == null) {
            ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "processResponse", 849, "HeterodyneSyncer.java")).a("Null response");
            this.f16409o.mo5043a();
            return Collections.emptySet();
        }
        ((d) ((d) f16401h.a(C3168b.m16151h())).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "processResponse", 854, "HeterodyneSyncer.java")).a("Heterodyne response: %s", gVar);
        this.f16409o.mo5043a();
        if (!(gVar.c == null || gVar.c.isEmpty())) {
            this.f16410p.mo3360b();
        }
        SQLiteDatabase writableDatabase = this.f16407m.getWritableDatabase();
        writableDatabase.beginTransaction();
        Long l = null;
        Set emptySet = Collections.emptySet();
        SQLiteStatement compileStatement;
        try {
            long a = C5507e.m26430a(writableDatabase, "__sync");
            if (a != j) {
                ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "processResponse", 870, "HeterodyneSyncer.java")).a("Expected change count %d but was %d", j, a);
                Set emptySet2 = Collections.emptySet();
                writableDatabase.endTransaction();
                C5503a.m26421a();
                return emptySet2;
            }
            writableDatabase.execSQL("UPDATE Packages SET isSynced = 1 WHERE 1");
            Long a2 = C3168b.m16132a(writableDatabase, gVar.d);
            if (m16141a(writableDatabase, str, gVar)) {
                compileStatement = writableDatabase.compileStatement("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                Long valueOf = Long.valueOf(C5507e.m26431b(writableDatabase, "__sync"));
                writableDatabase.delete("CrossLoggedExperimentTokens", "fromUser = ? AND isCommitted != 1", new String[]{str});
                Set<String> hashSet = new HashSet();
                for (com.google.d.a.b.c cVar : gVar.a) {
                    String str2 = cVar.b.a;
                    long j2 = cVar.b.b;
                    boolean a3 = C3168b.m16140a(writableDatabase, str2, j2, str, cVar, gVar.d);
                    C3168b.m16145b(writableDatabase, str2, j2, str, cVar.c);
                    C3168b.m16137a(writableDatabase, str2, j2, str, cVar.c);
                    boolean z = a3;
                    for (j jVar : cVar.c) {
                        if (jVar.d == 2) {
                            z = true;
                        } else {
                            long j3 = jVar.b.b;
                            if (C3168b.m16139a(writableDatabase, str2, j2, str, j3, jVar.b.c)) {
                                if (jVar.d == 0) {
                                    C3168b.m16136a(writableDatabase, str2, j2, str, j3);
                                }
                                for (h hVar : jVar.c) {
                                    if (!hVar.i) {
                                        if (hVar.i) {
                                            ((d) ((d) f16401h.a(Level.INFO)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateFlag", 1361, "HeterodyneSyncer.java")).a("deleting flag in updateFlag - not supposed to happen: %s, %s", str2, hVar.b);
                                        } else {
                                            compileStatement.clearBindings();
                                            compileStatement.bindString(1, str2);
                                            compileStatement.bindLong(2, j2);
                                            compileStatement.bindLong(3, (long) hVar.j);
                                            compileStatement.bindLong(4, j3);
                                            compileStatement.bindString(5, str);
                                            compileStatement.bindString(6, hVar.b);
                                            compileStatement.bindLong(7, 0);
                                            switch (hVar.h) {
                                                case 1:
                                                    compileStatement.bindLong(8, hVar.c);
                                                    break;
                                                case 2:
                                                    compileStatement.bindLong(9, hVar.d ? 1 : 0);
                                                    break;
                                                case 3:
                                                    compileStatement.bindDouble(10, hVar.e);
                                                    break;
                                                case 4:
                                                    compileStatement.bindString(11, hVar.f);
                                                    break;
                                                case 5:
                                                    compileStatement.bindBlob(12, hVar.g.a);
                                                    break;
                                                default:
                                                    ((d) ((d) f16401h.a(Level.WARNING)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateFlag", 1393, "HeterodyneSyncer.java")).a("Value type not set for flag %s, ignoring", hVar.b);
                                                    break;
                                            }
                                            ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateFlag", 1397, "HeterodyneSyncer.java")).a("updateFlag: %s, %d, %d, %s, %s", str2, Long.valueOf(j2), Long.valueOf(j3), str, hVar.b);
                                            compileStatement.execute();
                                        }
                                    }
                                }
                                z = true;
                            } else {
                                continue;
                            }
                        }
                    }
                    for (e eVar : cVar.g) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("fromPackageName", eVar.b.a);
                        contentValues.put("fromVersion", Long.valueOf(eVar.b.b));
                        contentValues.put("fromUser", str);
                        contentValues.put("toPackageName", str2);
                        contentValues.put("toVersion", Long.valueOf(j2));
                        contentValues.put("isCommitted", Integer.valueOf(0));
                        contentValues.put("token", eVar.c);
                        contentValues.put("provenance", Integer.valueOf(eVar.d));
                        writableDatabase.insert("CrossLoggedExperimentTokens", null, contentValues);
                    }
                    if (z) {
                        hashSet.add(str2);
                    }
                }
                for (String b : hashSet) {
                    C5507e.m26431b(writableDatabase, b);
                }
                compileStatement.close();
                emptySet = hashSet;
                l = valueOf;
            } else {
                ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "processResponse", 879, "HeterodyneSyncer.java")).a("No change response");
                a = gVar.d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("servingVersion", Long.valueOf(a));
                for (b bVar : fVar.b) {
                    writableDatabase.update("ExperimentTokens", contentValues2, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{bVar.b.a, String.valueOf(bVar.b.b), str});
                }
                this.f16409o.mo5043a();
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            C5503a.m26421a();
            if (a2 != null && ((Boolean) C5515a.f28346d.m27280a()).booleanValue()) {
                a2.longValue();
                mo3357c();
            }
            if (l != null && l.longValue() % ((long) ((Integer) C5515a.f28345c.m27280a()).intValue()) == 0) {
                ((d) ((d) f16401h.a(Level.INFO)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "vacuum", 1444, "HeterodyneSyncer.java")).a("vacuuming");
                SQLiteDatabase writableDatabase2 = this.f16407m.getWritableDatabase();
                C5519f c = this.f16409o.mo5045c();
                try {
                    writableDatabase2.execSQL("VACUUM");
                    c.mo5042a();
                    this.f16409o.mo5043a();
                    ((d) ((d) f16401h.a(Level.INFO)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "vacuum", 1456, "HeterodyneSyncer.java")).a("done vacuuming");
                } catch (Throwable e) {
                    Throwable th = e;
                    this.f16409o.mo5043a();
                    ((d) ((d) ((d) f16401h.a(Level.WARNING)).a(th)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "vacuum", 1459, "HeterodyneSyncer.java")).a("SQLException when vacuuming:");
                }
            }
            return emptySet;
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            C5503a.m26421a();
        }
    }

    private static void m16137a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, j[] jVarArr) {
        for (j jVar : jVarArr) {
            for (h hVar : jVar.c) {
                if (hVar.i) {
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "deleteFlags", 978, "HeterodyneSyncer.java")).a("Deleting flag: %s from partition %d", hVar.b, jVar.b.b);
                    sQLiteDatabase.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND name = ? AND flagType = ? AND committed = 0", new String[]{str, Long.toString(j), str2, Long.toString(jVar.b.b), hVar.b, Integer.toString(hVar.j)});
                }
            }
        }
    }

    private static void m16136a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, long j2) {
        ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "deleteFlagsInPartition", 1011, "HeterodyneSyncer.java")).a("Clearing partition: %d", j2);
        sQLiteDatabase.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND committed = 0", new String[]{str, Long.toString(j), str2, Long.toString(j2)});
    }

    private static void m16145b(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, j[] jVarArr) {
        for (j jVar : jVarArr) {
            if (jVar.d == 2) {
                C3168b.m16136a(sQLiteDatabase, str, j, str2, jVar.b.b);
                ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "deletePartitions", 1037, "HeterodyneSyncer.java")).a("Deleting partition: %s", jVar.b);
                sQLiteDatabase.delete("ApplicationTags", "packageName = ? AND version = ? AND user = ? AND partitionId = ?", new String[]{str, Long.toString(j), str2, Long.toString(jVar.b.b)});
            }
        }
    }

    private final boolean m16141a(SQLiteDatabase sQLiteDatabase, String str, g gVar) {
        if (gVar.b == null || gVar.b.length == 0) {
            this.f16409o.mo5043a();
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("user", str);
        contentValues.put("bytesTag", gVar.b);
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("RequestTags", new String[]{"bytesTag"}, "user = ?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() == 0) {
                sQLiteDatabase.insert("RequestTags", null, contentValues);
            } else {
                query.moveToFirst();
                if (Arrays.equals(query.getBlob(0), gVar.b)) {
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateRequestTag", 1086, "HeterodyneSyncer.java")).a("Update request tag - no change");
                    query.close();
                    return false;
                }
                ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateRequestTag", 1090, "HeterodyneSyncer.java")).a("Update request tag - changed");
                sQLiteDatabase.update("RequestTags", contentValues, "user = ?", new String[]{str});
            }
            query.close();
            return true;
        } catch (Throwable th) {
            query.close();
        }
    }

    private static Long m16132a(SQLiteDatabase sQLiteDatabase, long j) {
        long j2 = 0;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", Integer.valueOf(1));
        contentValues.put("servertimestamp", Long.valueOf(j));
        sQLiteDatabase.insertWithOnConflict("LastFetch", null, contentValues, 5);
        ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "shouldScheduleOneOff", 1135, "HeterodyneSyncer.java")).a("update last fetch to %d", j);
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("LastFetch", new String[]{"servertimestamp"}, "key = 0", null, null, null, null);
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                j2 = query.getLong(0);
            }
            query.close();
            if (j2 > j) {
                sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("LastFetch", new String[]{"servertimestamp"}, "key = 2", null, null, null, null);
                try {
                    long j3;
                    if (query.getCount() > 0) {
                        query.moveToFirst();
                        j3 = query.getLong(0);
                    } else {
                        j3 = 0;
                    }
                    query.close();
                    if (j3 != j2) {
                        contentValues = new ContentValues();
                        contentValues.put("key", Integer.valueOf(2));
                        contentValues.put("servertimestamp", Long.valueOf(j2));
                        sQLiteDatabase.insertWithOnConflict("LastFetch", null, contentValues, 5);
                        return Long.valueOf(j2);
                    }
                } catch (Throwable th) {
                    query.close();
                }
            }
            return null;
        } catch (Throwable th2) {
            query.close();
        }
    }

    private static boolean m16140a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, com.google.d.a.b.c cVar, long j2) {
        ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateTokens", 1211, "HeterodyneSyncer.java")).a("update experiment token: %s, %d, %s", str, Long.valueOf(j), str2);
        Cursor query = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken", "serverToken", "configHash"}, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{str, Long.toString(j), str2}, null, null, null);
        int i = 0;
        boolean z = true;
        try {
            if (query.moveToFirst()) {
                if (Arrays.equals(cVar.d, query.getBlob(0))) {
                    boolean equals;
                    String str3 = cVar.e;
                    Object string = query.getString(1);
                    if (str3 != null) {
                        if (string == null) {
                            string = "";
                        }
                        equals = str3.equals(string);
                    } else if (string == null) {
                        equals = true;
                    } else {
                        str3 = "";
                        equals = str3.equals(string);
                    }
                    if (equals) {
                        ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateTokens", 1240, "HeterodyneSyncer.java")).a("Update tokens, no change: %s, %d, %s", str, Long.valueOf(j), str2);
                        z = false;
                    }
                }
                i = query.getInt(2);
            }
            query.close();
            sQLiteDatabase.delete("ExperimentTokens", "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{str, Long.toString(j), str2});
            if (cVar.c.length != 0) {
                j[] jVarArr = cVar.c;
                i = 0;
                int i2 = 0;
                while (i2 < jVarArr.length) {
                    int hashCode = jVarArr[i2].b.hashCode() ^ (i * 17);
                    i2++;
                    i = hashCode;
                }
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", str);
            contentValues.put("version", Long.valueOf(j));
            contentValues.put("user", str2);
            contentValues.put("isCommitted", Integer.valueOf(0));
            contentValues.put("experimentToken", cVar.d);
            contentValues.put("serverToken", cVar.e == null ? "" : cVar.e);
            contentValues.put("configHash", Integer.toString(i));
            contentValues.put("servingVersion", Long.valueOf(j2));
            sQLiteDatabase.insert("ExperimentTokens", null, contentValues);
            return z;
        } catch (Throwable th) {
            query.close();
        }
    }

    private static boolean m16139a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, long j2, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateApplicationTags", 1298, "HeterodyneSyncer.java")).a("update application tag, empty no change: %s, %d, %s, %d", str, Long.valueOf(j), str2, Long.valueOf(j2));
            return false;
        }
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("ApplicationTags", new String[]{"tag"}, "packageName = ? AND version = ? AND partitionId = ? AND user = ?", new String[]{str, Long.toString(j), Long.toString(j2), str2}, null, null, null);
        try {
            if (query.getCount() > 0) {
                query.moveToFirst();
                if (Arrays.equals(bArr, query.getBlob(0))) {
                    ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateApplicationTags", 1324, "HeterodyneSyncer.java")).a("update application tag, no change: %s, %d, %s, %d", str, Long.valueOf(j), str2, Long.valueOf(j2));
                    return false;
                }
            }
            query.close();
            ((d) ((d) f16401h.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/sync/HeterodyneSyncer", "updateApplicationTags", 1335, "HeterodyneSyncer.java")).a("update application tag, changed: %s, %d, %s, %d", str, Long.valueOf(j), str2, Long.valueOf(j2));
            ContentValues contentValues = new ContentValues();
            contentValues.put("packageName", str);
            contentValues.put("version", Long.valueOf(j));
            contentValues.put("partitionId", Long.valueOf(j2));
            contentValues.put("user", str2);
            contentValues.put("tag", bArr);
            sQLiteDatabase.insertWithOnConflict("ApplicationTags", null, contentValues, 5);
            return true;
        } finally {
            query.close();
        }
    }

    private final int m16150g() {
        SQLiteDatabase writableDatabase = this.f16407m.getWritableDatabase();
        writableDatabase.beginTransaction();
        Cursor query = writableDatabase.query("Packages", new String[]{"weak"}, null, null, null, null, null);
        try {
            if (query.getCount() == 0) {
                writableDatabase.setTransactionSuccessful();
                return -1;
            }
            int i = 0;
            while (query.moveToNext()) {
                if (query.getInt(0) == 0) {
                    i++;
                }
            }
            writableDatabase.setTransactionSuccessful();
            if (i == 0) {
                i = 0;
            } else {
                i = 1;
            }
            query.close();
            writableDatabase.endTransaction();
            return i;
        } finally {
            query.close();
            writableDatabase.endTransaction();
        }
    }

    private static boolean m16142a(String[] strArr) {
        for (String endsWith : strArr) {
            if (endsWith.endsWith("@google.com")) {
                return true;
            }
        }
        return false;
    }

    private static Level m16151h() {
        return ((Boolean) C5515a.f28347e.m27280a()).booleanValue() ? Level.INFO : Level.CONFIG;
    }

    static final /* synthetic */ void m16148e() {
    }
}
