package com.google.android.finsky.ak;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.ak.l implements Callable
{

    public final com.google.android.finsky.ak.q a;
    public final String b;
    public final com.google.android.finsky.ak.h c;

    l(com.google.android.finsky.ak.h p0, com.google.android.finsky.ak.q p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    private final Integer a() {
        this.c.c.c.getWritableDatabase().beginTransaction();
        try {
            v0 = this.c.d(this.a);
            if (v0.isEmpty()) {
                v0 = Integer.valueOf(0);
                this.c.c.c.getWritableDatabase().endTransaction();
                return v0;
            }
        }
        catch (Throwable ex) {
            this.c.c.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        try {
            v1 = new com.google.android.finsky.ak.q().a("pk", v0);
            v1 = this.c.c.c.getWritableDatabase().delete(this.c.d, v1.a.toString(), v1.a());
            if (v1 != v0.size()) {
                v3 = new Object[3];
                v3[0] = Integer.valueOf(v1);
                v3[1] = Integer.valueOf(v0.size());
                v3[2] = this.c.d;
                FinskyLog.e("Only deleted some records. %d out of %d in %s", v3);
            }
            v0 = v0.iterator();
            while (v0.hasNext())
                com.google.android.finsky.ak.h.a(this.c, v0.next(), 0, "delete", this.b);
        }
        catch (Throwable ex) {
            this.c.c.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        try {
            this.c.c.c.getWritableDatabase().setTransactionSuccessful();
            v0 = Integer.valueOf(v1);
        }
        catch (Throwable ex) {
            this.c.c.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        this.c.c.c.getWritableDatabase().endTransaction();
        return v0;
    }

    public final Object call() {
        return this.a();
    }

}
