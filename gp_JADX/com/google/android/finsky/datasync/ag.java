package com.google.android.finsky.datasync;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.finsky.utils.FinskyLog;

public final class ag extends SQLiteOpenHelper {
    public static final String[] f13533a = new String[]{"fetch_suggestion_url", "user_account_name", "enqueued_millis", "failed_attempts_count", "processing_start_millis"};
    public static final String[] f13534b = new String[]{"fetch_suggestion_url", "user_account_name"};
    public static ag f13535c;

    private ag(Context context) {
        super(context, "fetch_suggestions.db", null, 2);
    }

    static synchronized ag m13461a(Context context) {
        ag agVar;
        synchronized (ag.class) {
            if (f13535c == null) {
                f13535c = new ag(context);
            }
            agVar = f13535c;
        }
        return agVar;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE fetch_suggestions_queues_table (fetch_suggestion_url TEXT NOT NULL, user_account_name TEXT NOT NULL, enqueued_millis INTEGER NOT NULL, failed_attempts_count INTEGER NOT NULL, processing_start_millis INTEGER NOT NULL DEFAULT 0, queue_name TEXT NOT NULL, PRIMARY KEY(fetch_suggestion_url, user_account_name))");
        sQLiteDatabase.execSQL("CREATE TABLE synced_entries_table (fetch_suggestion_url TEXT NOT NULL, user_account_name TEXT NOT NULL, PRIMARY KEY(fetch_suggestion_url, user_account_name))");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m13462a(sQLiteDatabase);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        FinskyLog.m21659a("Downgrading database %s from %d to %d", "fetch_suggestions.db", Integer.valueOf(i), Integer.valueOf(i2));
        m13462a(sQLiteDatabase);
    }

    private final void m13462a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fetch_suggestions_queues_table");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS synced_entries_table");
        } catch (SQLException e) {
            FinskyLog.m21665c("Unable to drop tables in %s: %s", "fetch_suggestions.db", e);
        }
        onCreate(sQLiteDatabase);
    }
}
