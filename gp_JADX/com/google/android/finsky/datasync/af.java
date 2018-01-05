package com.google.android.finsky.datasync;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.finsky.utils.FinskyLog;

final class af implements Runnable {
    public final /* synthetic */ String f13530a;
    public final /* synthetic */ String f13531b;
    public final /* synthetic */ aa f13532c;

    af(aa aaVar, String str, String str2) {
        this.f13532c = aaVar;
        this.f13530a = str;
        this.f13531b = str2;
    }

    public final void run() {
        RuntimeException e;
        try {
            SQLiteDatabase writableDatabase = this.f13532c.f13516c.getWritableDatabase();
            String str = "UPDATE %s SET %s = %s + 1 WHERE ";
            String valueOf = String.valueOf("fetch_suggestion_url = ? and user_account_name = ?".replace("?", "%s"));
            writableDatabase.execSQL(String.format(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[]{"fetch_suggestions_queues_table", "failed_attempts_count", "failed_attempts_count", DatabaseUtils.sqlEscapeString(this.f13530a), DatabaseUtils.sqlEscapeString(this.f13531b)}));
            FinskyLog.m21662b("%s: recordFailure queue: %s url: %s", "[Cache and Sync]", this.f13532c.f13515b, this.f13530a);
        } catch (SQLiteException e2) {
            e = e2;
            FinskyLog.m21667d("%s: recordFailure %s", "[Cache and Sync]", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            FinskyLog.m21667d("%s: recordFailure %s", "[Cache and Sync]", e.getMessage());
        }
    }
}
