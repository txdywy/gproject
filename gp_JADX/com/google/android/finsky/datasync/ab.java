package com.google.android.finsky.datasync;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;

final class ab implements Runnable {
    public final /* synthetic */ String f13518a;
    public final /* synthetic */ String f13519b;
    public final /* synthetic */ aa f13520c;

    ab(aa aaVar, String str, String str2) {
        this.f13520c = aaVar;
        this.f13518a = str;
        this.f13519b = str2;
    }

    public final void run() {
        RuntimeException e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("fetch_suggestion_url", this.f13518a);
        String str = "user_account_name";
        aa aaVar = this.f13520c;
        String str2 = this.f13519b;
        if (aaVar.f13517d) {
            str2 = "";
        }
        contentValues.put(str, str2);
        contentValues.put("failed_attempts_count", Integer.valueOf(0));
        contentValues.put("enqueued_millis", Long.valueOf(C4678i.m21812a()));
        contentValues.put("queue_name", this.f13520c.f13515b);
        try {
            this.f13520c.f13516c.getWritableDatabase().replace("fetch_suggestions_queues_table", null, contentValues);
            FinskyLog.m21662b("%s: createNewEntryOrRefreshExisting queue: %s url: %s", "[Cache and Sync]", this.f13520c.f13515b, this.f13518a);
            if (this.f13520c.f13515b.equals("dfe")) {
                C1189b.m7141a(C1189b.f7277m, 1);
            }
        } catch (SQLiteException e2) {
            e = e2;
            FinskyLog.m21667d("%s: createNewEntryOrRefreshExisting %s", "[Cache and Sync]", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            FinskyLog.m21667d("%s: createNewEntryOrRefreshExisting %s", "[Cache and Sync]", e.getMessage());
        }
    }
}
