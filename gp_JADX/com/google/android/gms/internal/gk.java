package com.google.android.gms.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class gk extends hz {
    public static final Map f26778a;
    public static final Map f26779b;
    public static final Map f26780c;
    public static final Map f26781d;
    public static final Map f26782e;
    public final gl f26783f = new gl(this, mo4736j(), gj.m24439E());
    public final jh f26784g = new jh(mo4735i());

    static {
        Map c0305a = new C0305a(1);
        f26778a = c0305a;
        c0305a.put("origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;");
        c0305a = new C0305a(18);
        f26779b = c0305a;
        c0305a.put("app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;");
        f26779b.put("app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;");
        f26779b.put("gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;");
        f26779b.put("dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;");
        f26779b.put("measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;");
        f26779b.put("last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;");
        f26779b.put("day", "ALTER TABLE apps ADD COLUMN day INTEGER;");
        f26779b.put("daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;");
        f26779b.put("daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;");
        f26779b.put("daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;");
        f26779b.put("remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;");
        f26779b.put("config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;");
        f26779b.put("failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;");
        f26779b.put("app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;");
        f26779b.put("firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;");
        f26779b.put("daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;");
        f26779b.put("daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;");
        f26779b.put("health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;");
        f26779b.put("android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;");
        c0305a = new C0305a(1);
        f26780c = c0305a;
        c0305a.put("realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;");
        c0305a = new C0305a(1);
        f26781d = c0305a;
        c0305a.put("has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;");
        c0305a = new C0305a(1);
        f26782e = c0305a;
        c0305a.put("previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;");
    }

    gk(hv hvVar) {
        super(hvVar);
    }

    private static Set m24489a(SQLiteDatabase sQLiteDatabase, String str) {
        Set hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(new StringBuilder(String.valueOf(str).length() + 22).append("SELECT * FROM ").append(str).append(" LIMIT 0").toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    final long m24494a(String str) {
        Cursor cursor = null;
        try {
            cursor = m24497t().rawQuery(str, null);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo4742p().f26845d.m24654a("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    protected final void mo4745s() {
    }

    final boolean m24499v() {
        return mo4736j().getDatabasePath(gj.m24439E()).exists();
    }

    final long m24495b(String str) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor rawQuery = m24497t().rawQuery(str, null);
            try {
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery == null) {
                        return j;
                    }
                    rawQuery.close();
                    return j;
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return 0;
            } catch (SQLiteException e2) {
                e = e2;
                cursor = rawQuery;
                try {
                    mo4742p().f26845d.m24654a("Database error", str, e);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = rawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo4742p().f26845d.m24654a("Database error", str, e);
            throw e;
        }
    }

    final SQLiteDatabase m24497t() {
        mo4728b();
        try {
            return this.f26783f.getWritableDatabase();
        } catch (SQLiteException e) {
            mo4742p().f26847f.m24653a("Error opening database", e);
            throw e;
        }
    }

    public final String m24498u() {
        Object e;
        Throwable th;
        String str = null;
        Cursor rawQuery;
        try {
            rawQuery = m24497t().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                if (rawQuery.moveToFirst()) {
                    str = rawQuery.getString(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                } else if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    mo4742p().f26845d.m24653a("Database error getting next bundle app id", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            rawQuery = null;
            mo4742p().f26845d.m24653a("Database error getting next bundle app id", e);
            if (rawQuery != null) {
                rawQuery.close();
            }
            return str;
        } catch (Throwable th3) {
            rawQuery = null;
            th = th3;
            if (rawQuery != null) {
                rawQuery.close();
            }
            throw th;
        }
        return str;
    }

    private static boolean m24493a(hc hcVar, SQLiteDatabase sQLiteDatabase, String str) {
        Object e;
        Throwable th;
        Cursor cursor = null;
        if (hcVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor query;
        try {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                boolean moveToFirst = query.moveToFirst();
                if (query == null) {
                    return moveToFirst;
                }
                query.close();
                return moveToFirst;
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    hcVar.f26847f.m24654a("Error querying for table", str, e);
                    if (query != null) {
                        query.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            query = null;
            hcVar.f26847f.m24654a("Error querying for table", str, e);
            if (query != null) {
                query.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static void m24492a(hc hcVar, SQLiteDatabase sQLiteDatabase, String str, String str2, Map map) {
        if (hcVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Iterable a = m24489a(sQLiteDatabase, str);
        String[] split = str2.split(",");
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            if (a.remove(str3)) {
                i++;
            } else {
                throw new SQLiteException(new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(str3).length()).append("Table ").append(str).append(" is missing required column: ").append(str3).toString());
            }
        }
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (!a.remove(entry.getKey())) {
                    sQLiteDatabase.execSQL((String) entry.getValue());
                }
            }
        }
        if (!a.isEmpty()) {
            hcVar.f26847f.m24654a("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        }
    }

    static void m24491a(hc hcVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, Map map) {
        if (hcVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m24493a(hcVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            m24492a(hcVar, sQLiteDatabase, str, str3, map);
        } catch (SQLiteException e) {
            hcVar.f26845d.m24653a("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    static void m24490a(hc hcVar, SQLiteDatabase sQLiteDatabase) {
        if (hcVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            hcVar.f26847f.m24652a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            hcVar.f26847f.m24652a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            hcVar.f26847f.m24652a("Failed to turn on database read permission for owner");
        }
        if (!file.setWritable(true, true)) {
            hcVar.f26847f.m24652a("Failed to turn on database write permission for owner");
        }
    }
}
