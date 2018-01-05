package com.google.android.finsky.datasync;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.finsky.utils.FinskyLog;

final class ae implements Runnable {
    public final /* synthetic */ String f13527a;
    public final /* synthetic */ String f13528b;
    public final /* synthetic */ aa f13529c;

    ae(aa aaVar, String str, String str2) {
        this.f13529c = aaVar;
        this.f13527a = str;
        this.f13528b = str2;
    }

    public final void run() {
        RuntimeException e;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fetch_suggestion_url", this.f13527a);
            String str = "user_account_name";
            aa aaVar = this.f13529c;
            String str2 = this.f13528b;
            if (aaVar.f13517d) {
                str2 = "";
            }
            contentValues.put(str, str2);
            this.f13529c.f13516c.getWritableDatabase().insert("synced_entries_table", null, contentValues);
        } catch (SQLiteException e2) {
            e = e2;
            FinskyLog.m21667d("%s: addSyncedEntry %s", "[Cache and Sync]", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            FinskyLog.m21667d("%s: addSyncedEntry %s", "[Cache and Sync]", e.getMessage());
        }
    }
}
