package com.google.android.gms.common.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class C5148c extends SQLiteOpenHelper {
    public C5148c(Context context, String str, int i) {
        super(context, str, null, i);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
