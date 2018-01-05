package com.google.android.finsky.ak;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.a.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.ak.m implements Callable
{

    public final com.google.android.finsky.ak.q a;
    public final String b;
    public final com.google.android.finsky.ak.h c;

    m(com.google.android.finsky.ak.h p0, com.google.android.finsky.ak.q p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    private final List a() {
        this.c.c.c.getWritableDatabase().beginTransaction();
        try {
            v0 = this.c.b(this.a, 0, 0);
            if (v0.isEmpty()) {
                v0 = Collections.emptyList();
                this.c.c.c.getWritableDatabase().endTransaction();
                return v0;
            }
        }
        catch (Throwable ex) {
            this.c.c.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        try {
            if (this.c.c.c.getWritableDatabase().delete(this.c.d, this.a.a.toString(), this.a.a()) != v0.size())
                FinskyLog.e("Only deleted some records", new Object[0]);
            v1 = v0.iterator();
            while (v1.hasNext())
                com.google.android.finsky.ak.h.a(this.c, this.c.g.a(v1.next()), 0, "delete", this.b);
        }
        catch (Throwable ex) {
            this.c.c.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        try {
            this.c.c.c.getWritableDatabase().setTransactionSuccessful();
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
