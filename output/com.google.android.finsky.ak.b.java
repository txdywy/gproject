package com.google.android.finsky.ak;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public final class com.google.android.finsky.ak.b implements Callable
{

    public final com.google.android.finsky.ak.a a;

    b(com.google.android.finsky.ak.a p0) {
        this.a = p0;
    }

    public final Object call() {
        this.a.c.close();
        this.a.a.deleteDatabase(this.a.c.getDatabaseName());
        return Boolean.valueOf(1);
    }

}
