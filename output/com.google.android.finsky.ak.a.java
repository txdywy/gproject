package com.google.android.finsky.ak;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.z.c;

public class com.google.android.finsky.ak.a
{

    public final Context a;
    public final d[] b;
    public final SQLiteOpenHelper c;
    public final com.google.android.finsky.z.c d;

    a(Context p0, com.google.android.finsky.z.c p1, String p2, d[] p3) {
        this.a = p0;
        this.b = p3;
        this.d = p1;
        this.c = new com.google.android.finsky.ak.c(this, p0, p2);
    }

}
