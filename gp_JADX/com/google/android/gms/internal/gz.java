package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;

@TargetApi(11)
final class gz extends SQLiteOpenHelper {
    public /* synthetic */ gy f26839a;

    gz(gy gyVar, Context context, String str) {
        this.f26839a = gyVar;
        super(context, str, null, 1);
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (VERSION.SDK_INT < 11 || !(e instanceof SQLiteDatabaseLockedException)) {
                this.f26839a.mo4742p().f26845d.m24652a("Opening the local database failed, dropping and recreating it");
                String F = gj.m24440F();
                if (!this.f26839a.mo4736j().getDatabasePath(F).delete()) {
                    this.f26839a.mo4742p().f26845d.m24653a("Failed to delete corrupted local db file", F);
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException e2) {
                    this.f26839a.mo4742p().f26845d.m24653a("Failed to open local database. Events will bypass local storage", e2);
                    return null;
                }
            }
            throw e2;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        gk.m24490a(this.f26839a.mo4742p(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (VERSION.SDK_INT < 15) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
            try {
                rawQuery.moveToFirst();
            } finally {
                rawQuery.close();
            }
        }
        gk.m24491a(this.f26839a.mo4742p(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
