package com.google.android.finsky.ak;

import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

final class com.google.android.finsky.ak.d
{

    public final String a;
    public final String b;
    public final Map c;

    d(String p0, String p1, Map p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.a();
    }

    private final void a() {
        v1 = this.c.entrySet().iterator();
        while (true) {
            if (!v1.hasNext())
                return;
            v0 = (Map$Entry)v1.next();
            if ("pk".equals(v0.getKey()))
                throw new IllegalArgumentException("Column names cannot contain 'pk' or 'data'");
            if ("data".equals(v0.getKey()))
                throw new IllegalArgumentException("Column names cannot contain 'pk' or 'data'");
        }
    }

    final void a(SQLiteDatabase p0) {
        v0 = new HashMap();
        v0.put("pk", String.valueOf(this.b).concat(" PRIMARY KEY"));
        v0.put("data", "BLOB");
        v0.putAll(this.c);
        v4 = new StringBuilder("CREATE TABLE ").append(this.a).append(" (");
        v5 = v0.entrySet().iterator();
        v1 = 0;
        while (v5.hasNext()) {
            v0 = (Map$Entry)v5.next();
            if (v1 != 0)
                v4.append(", ");
            v4.append((String)v0.getKey()).append(" ").append((String)v0.getValue());
            v1 = 1;
        }
        v4.append(")");
        p0.execSQL(v4.toString());
        v4 = new Object[2];
        v4[0] = this.a;
        v4[1] = this.b;
        p0.execSQL(String.format(Locale.US, "CREATE TABLE %s_audit(data_table_pk %s,data BLOB,timestamp INTEGER,reason TEXT,trace TEXT)", v4));
    }

}
