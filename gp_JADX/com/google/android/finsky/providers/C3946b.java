package com.google.android.finsky.providers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

final class C3946b extends SQLiteOpenHelper {
    public int f19944a;

    public C3946b(Context context, int i) {
        super(context, "suggestions.db", null, i);
        this.f19944a = i;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE suggestions (_id INTEGER PRIMARY KEY,display1 TEXT UNIQUE ON CONFLICT REPLACE");
        if ((this.f19944a & 2) != 0) {
            stringBuilder.append(",display2 TEXT");
        }
        stringBuilder.append(",query TEXT,date LONG);");
        sQLiteDatabase.execSQL(stringBuilder.toString());
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if ((i2 & 2) != 0 && (i & 2) == 0) {
            sQLiteDatabase.execSQL("ALTER TABLE suggestions ADD COLUMN display2 TEXT");
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w("SuggestionsProvider", "Downgrading database from version " + i + " to " + i2 + ", which will destroy all old data");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS suggestions");
        onCreate(sQLiteDatabase);
    }
}
