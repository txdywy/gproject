package com.google.android.finsky.datasync;

import android.database.sqlite.SQLiteException;
import com.google.android.finsky.utils.FinskyLog;

final class ad implements Runnable {
    public final /* synthetic */ String f13525a;
    public final /* synthetic */ aa f13526b;

    ad(aa aaVar, String str) {
        this.f13526b = aaVar;
        this.f13525a = str;
    }

    public final void run() {
        RuntimeException e;
        try {
            this.f13526b.f13516c.getWritableDatabase().delete("fetch_suggestions_queues_table", "user_account_name = ?", new String[]{this.f13525a});
            FinskyLog.m21662b("%s: deleteEntries queue: %s account name: %s", "[Cache and Sync]", this.f13526b.f13515b, this.f13525a);
        } catch (SQLiteException e2) {
            e = e2;
            FinskyLog.m21667d("%s: deleteEntries %s", "[Cache and Sync]", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            FinskyLog.m21667d("%s: deleteEntries %s", "[Cache and Sync]", e.getMessage());
        }
    }
}
