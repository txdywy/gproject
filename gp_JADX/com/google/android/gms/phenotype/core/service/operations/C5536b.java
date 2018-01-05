package com.google.android.gms.phenotype.core.service.operations;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.phenotype.core.C5530i;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5506d;
import com.google.android.gms.phenotype.core.p304a.C5507e;
import com.google.android.gms.phenotype.core.p304a.C5508f;
import com.google.android.gms.phenotype.core.p304a.C5509g;
import com.google.android.gms.phenotype.core.p304a.C5510h;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.logging.Level;

public final class C5536b extends C5535a {
    public static final c f28405a = c.a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation");
    public static final String f28406b;
    public static final String f28407c;
    public static final String f28408d;
    public static final String f28409e;
    public static final String f28410f;
    public static final String f28411g;
    public final String f28412h;
    public String f28413i;
    public String f28414j = null;
    public int f28415k;
    public String f28416l;

    public C5536b(String str) {
        this.f28412h = str;
    }

    public final Boolean m26490a(C5505c c5505c) {
        SQLiteStatement compileStatement;
        if (this.f28412h == null) {
            ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 77, "CommitToConfigurationOperation.java")).a("No snapshot token provided");
            return Boolean.valueOf(false);
        }
        String[] a = GetConfigurationSnapshotOperation.m26487a(this.f28412h);
        if (a.length != 7) {
            if (this.f28412h.isEmpty()) {
                ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 84, "CommitToConfigurationOperation.java")).a("Empty snapshot token - package not registered?");
            } else {
                ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 86, "CommitToConfigurationOperation.java")).a("Malformed snapshot token (size): %s", this.f28412h);
            }
            return Boolean.valueOf(false);
        }
        this.f28416l = a[0];
        this.f28413i = a[1];
        try {
            this.f28415k = Integer.parseInt(a[2]);
            try {
                long parseLong = Long.parseLong(a[3]);
                this.f28414j = a[5];
                String str = a[6];
                ((d) ((d) f28405a.a(Level.CONFIG)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 109, "CommitToConfigurationOperation.java")).a("from token: user=%s, source=%s, version=%d, changeCount=%d, target=%s, committedConfigHash=%s", this.f28416l, this.f28413i, Integer.valueOf(this.f28415k), Long.valueOf(parseLong), this.f28414j, str);
                SQLiteDatabase writableDatabase = c5505c.getWritableDatabase();
                writableDatabase.beginTransaction();
                SQLiteStatement compileStatement2;
                try {
                    Boolean valueOf;
                    if (!this.f28414j.equals(this.f28413i) && !this.f28413i.equals("com.google.EMPTY") && (GetConfigurationSnapshotOperation.m26485a(writableDatabase, this.f28413i) || !C5538d.m26492a(writableDatabase, this.f28413i))) {
                        ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 121, "CommitToConfigurationOperation.java")).a("Source package is not registered or has log sources");
                        valueOf = Boolean.valueOf(false);
                        writableDatabase.endTransaction();
                        return valueOf;
                    } else if (C5507e.m26430a(writableDatabase, this.f28413i) != parseLong) {
                        ((d) ((d) f28405a.a(Level.WARNING)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 127, "CommitToConfigurationOperation.java")).a("Stale snapshot (change count changed) for %s", this.f28413i);
                        valueOf = Boolean.valueOf(false);
                        writableDatabase.endTransaction();
                        return valueOf;
                    } else {
                        Pair a2 = C5506d.m26429a(writableDatabase, this.f28414j);
                        Object obj = "";
                        if (a2 != null) {
                            obj = GetConfigurationSnapshotOperation.m26484a(writableDatabase, this.f28414j, ((Integer) a2.second).intValue(), (String) a2.first, true);
                        }
                        if (str.equals(obj)) {
                            if (((long) writableDatabase.delete("Flags", "packageName = ? AND committed = 1", new String[]{this.f28414j})) < 0) {
                                throw new SQLiteException("unable to delete from Flags");
                            }
                            if (((long) writableDatabase.delete("FlagOverrides", "packageName = ? AND committed = 1", new String[]{this.f28414j})) < 0) {
                                throw new SQLiteException("unable to delete from FlagsOverrides");
                            }
                            String str2;
                            String str3 = f28407c;
                            if (!this.f28414j.equals(this.f28413i)) {
                                str2 = this.f28414j;
                                str3 = str3.replace("packageName", new StringBuilder(String.valueOf(str2).length() + 2).append("'").append(str2).append("'").toString());
                            }
                            String str4 = f28406b;
                            compileStatement = writableDatabase.compileStatement(new StringBuilder((String.valueOf(str4).length() + 108) + String.valueOf(str3).length()).append("INSERT INTO Flags (").append(str4).append(") SELECT ").append(str3).append(" FROM Flags WHERE packageName = ? AND version = ? AND user = ? AND committed = 0").toString());
                            compileStatement.bindString(1, this.f28413i);
                            compileStatement.bindLong(2, (long) this.f28415k);
                            compileStatement.bindString(3, this.f28416l);
                            compileStatement.execute();
                            compileStatement.close();
                            C5530i[] a3 = GetConfigurationSnapshotOperation.m26486a(writableDatabase, this.f28414j, this.f28416l);
                            m26489a(writableDatabase, a3);
                            if (a3 == null) {
                                if (((long) writableDatabase.delete("ExperimentTokens", "packageName = ? AND isCommitted = 1", new String[]{this.f28414j})) < 0) {
                                    throw new SQLiteException("unable to delete from ExperimentTokens");
                                }
                                str3 = f28409e;
                                if (!this.f28413i.equals(this.f28414j)) {
                                    str2 = this.f28414j;
                                    str3 = str3.replace("packageName", new StringBuilder(String.valueOf(str2).length() + 2).append("'").append(str2).append("'").toString());
                                }
                                str4 = f28408d;
                                compileStatement = writableDatabase.compileStatement(new StringBuilder((String.valueOf(str4).length() + 132) + String.valueOf(str3).length()).append("INSERT INTO ExperimentTokens (").append(str4).append(") SELECT ").append(str3).append(" FROM ExperimentTokens WHERE packageName = ? AND version = ? AND user = ? AND isCommitted = 0").toString());
                                compileStatement.bindString(1, this.f28413i);
                                compileStatement.bindLong(2, (long) this.f28415k);
                                compileStatement.bindString(3, this.f28416l);
                                compileStatement.execute();
                                compileStatement.close();
                                int i = this.f28415k;
                                str4 = this.f28416l;
                                if (((long) writableDatabase.delete("CrossLoggedExperimentTokens", "fromPackageName = ? AND isCommitted = 1", new String[]{this.f28414j})) < 0) {
                                    throw new SQLiteException("unable to delete from CrossLoggedExperimentTokens");
                                }
                                str2 = f28410f;
                                String str5 = f28411g;
                                compileStatement2 = writableDatabase.compileStatement(new StringBuilder((String.valueOf(str2).length() + 166) + String.valueOf(str5).length()).append("INSERT INTO CrossLoggedExperimentTokens (").append(str2).append(") SELECT ").append(str5).append(" FROM CrossLoggedExperimentTokens WHERE fromPackageName = ? AND fromVersion = ? AND fromUser = ? AND isCommitted = 0").toString());
                                compileStatement2.bindString(1, this.f28414j);
                                compileStatement2.bindLong(2, (long) i);
                                compileStatement2.bindString(3, str4);
                                compileStatement2.execute();
                                compileStatement2.close();
                            }
                            str3 = this.f28416l;
                            long j = (long) this.f28415k;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("packageName", this.f28414j);
                            contentValues.put("user", str3);
                            contentValues.put("version", Long.valueOf(j));
                            if (writableDatabase.insertWithOnConflict("ApplicationStates", null, contentValues, 5) < 0) {
                                throw new SQLiteException("unable to insert to ApplicationUsers");
                            }
                            C5540f.m26497a();
                            writableDatabase.setTransactionSuccessful();
                            valueOf = Boolean.valueOf(true);
                            writableDatabase.endTransaction();
                            return valueOf;
                        }
                        ((d) ((d) f28405a.a(Level.WARNING)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 131, "CommitToConfigurationOperation.java")).a("Stale snapshot (committed configuration changed) for %s", this.f28414j);
                        valueOf = Boolean.valueOf(false);
                        writableDatabase.endTransaction();
                        return valueOf;
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                }
            } catch (NumberFormatException e) {
                ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 103, "CommitToConfigurationOperation.java")).a("Malformed snapshot token (change): %s", this.f28412h);
                return Boolean.valueOf(false);
            }
        } catch (NumberFormatException e2) {
            ((d) ((d) f28405a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/CommitToConfigurationOperation", "execute", 96, "CommitToConfigurationOperation.java")).a("Malformed snapshot token (version): %s", this.f28412h);
            return Boolean.valueOf(false);
        }
    }

    private final void m26489a(SQLiteDatabase sQLiteDatabase, C5530i[] c5530iArr) {
        if (c5530iArr != null) {
            for (C5530i c5530i : c5530iArr) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("packageName", this.f28414j);
                contentValues.put("user", this.f28416l);
                contentValues.put("name", c5530i.f28382a);
                contentValues.put("flagType", Integer.valueOf(c5530i.f28389h));
                contentValues.put("committed", Integer.valueOf(1));
                switch (c5530i.f28388g) {
                    case 1:
                        contentValues.put("intVal", Long.valueOf(c5530i.m26469a()));
                        break;
                    case 2:
                        contentValues.put("boolVal", Integer.valueOf(c5530i.m26471b() ? 1 : 0));
                        break;
                    case 3:
                        contentValues.put("floatVal", Double.valueOf(c5530i.m26472c()));
                        break;
                    case 4:
                        contentValues.put("stringVal", c5530i.m26473d());
                        break;
                    case 5:
                        contentValues.put("extensionVal", c5530i.m26474e());
                        break;
                    default:
                        throw new RuntimeException("bad Flag type - should not happen!");
                }
                if (sQLiteDatabase.insertWithOnConflict("FlagOverrides", null, contentValues, 5) < 0) {
                    throw new SQLiteException("unable to insert into FlagOverrides");
                }
            }
        }
    }

    static {
        String join = TextUtils.join(", ", C5510h.f28335a);
        f28406b = join;
        f28407c = join.replace("committed", "1");
        join = TextUtils.join(", ", C5509g.f28334a);
        f28408d = join;
        f28409e = join.replace("isCommitted", "1");
        join = TextUtils.join(", ", C5508f.f28333a);
        f28410f = join;
        f28411g = join.replace("isCommitted", "1");
    }
}
