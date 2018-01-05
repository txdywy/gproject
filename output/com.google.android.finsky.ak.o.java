package com.google.android.finsky.ak;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.ak.o implements Callable
{

    public final List a;
    public final String b;
    public final com.google.android.finsky.ak.h c;

    o(com.google.android.finsky.ak.h p0, List p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    private final List a() {
 10:    this.c.c.c.getWritableDatabase().beginTransaction();
 13:    try {
 21:        v2 = new ArrayList(this.a.size());
 26:        v3 = this.a.iterator();
 30:        while (true) {
 34:            if (!v3.hasNext()) {
166:                this.c.c.c.getWritableDatabase().setTransactionSuccessful();
179:                this.c.c.c.getWritableDatabase().endTransaction();
182:                return v2;
                }
 36:            v4 = v3.next();
 42:            v5 = new ContentValues();
 49:            v1 = this.c.g.a(v4);
 53:            if (v1 != 0)
 61:                v5.put("pk", v1.toString());
 68:            if (this.c.h != 0)
 80:                v5.putAll((ContentValues)this.c.h.a(v4));
 91:            v0 = (byte[])this.c.e.a(v4);
 95:            v5.put("data", v0);
113:            v4 = this.c.c.c.getWritableDatabase().replaceOrThrow(this.c.d, 0, v5);
119:            if (v1 != 0) {
                }
                else {
151:                try {
151:                    v1 = Long.valueOf(v4);
                    }
                    catch (Throwable ex) {
147:                    this.c.c.c.getWritableDatabase().endTransaction();
150:                    throw ex;
                    }
                }
125:            com.google.android.finsky.ak.h.a(this.c, v1, v0, "upsert", this.b);
132:            v2.add(Long.valueOf(v4));
            }
        }
        catch (Throwable ex) {
147:        this.c.c.c.getWritableDatabase().endTransaction();
150:        throw ex;
        }
135:    goto -1;
    }

    public final Object call() {
        return this.a();
    }

}
