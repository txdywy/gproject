package com.google.android.finsky.ak;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

public final class C1201d {
    public final String f7309a;
    public final String f7310b;
    public final Map f7311c;

    public C1201d(String str, String str2, Map map) {
        this.f7309a = str;
        this.f7310b = str2;
        this.f7311c = map;
        m7151a();
    }

    final void m7152a(SQLiteDatabase sQLiteDatabase) {
        Map hashMap = new HashMap();
        hashMap.put("pk", String.valueOf(this.f7310b).concat(" PRIMARY KEY"));
        hashMap.put("data", "BLOB");
        hashMap.putAll(this.f7311c);
        StringBuilder append = new StringBuilder("CREATE TABLE ").append(this.f7309a).append(" (");
        int i = 0;
        for (Entry entry : hashMap.entrySet()) {
            if (i != 0) {
                append.append(", ");
            }
            append.append((String) entry.getKey()).append(" ").append((String) entry.getValue());
            i = 1;
        }
        append.append(")");
        sQLiteDatabase.execSQL(append.toString());
        sQLiteDatabase.execSQL(String.format(Locale.US, "CREATE TABLE %s_audit(data_table_pk %s,data BLOB,timestamp INTEGER,reason TEXT,trace TEXT)", new Object[]{this.f7309a, this.f7310b}));
    }

    private final void m7151a() {
        for (Entry entry : this.f7311c.entrySet()) {
            if (!"pk".equals(entry.getKey())) {
                if ("data".equals(entry.getKey())) {
                }
            }
            throw new IllegalArgumentException("Column names cannot contain 'pk' or 'data'");
        }
    }
}
