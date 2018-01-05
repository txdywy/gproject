package com.google.android.finsky.datasync;

import android.database.sqlite.SQLiteException;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.utils.FinskyLog;

final class ac implements Runnable {
    public final /* synthetic */ String f13521a;
    public final /* synthetic */ String f13522b;
    public final /* synthetic */ boolean f13523c;
    public final /* synthetic */ aa f13524d;

    ac(aa aaVar, String str, String str2, boolean z) {
        this.f13524d = aaVar;
        this.f13521a = str;
        this.f13522b = str2;
        this.f13523c = z;
    }

    public final void run() {
        RuntimeException e;
        try {
            this.f13524d.f13516c.getWritableDatabase().delete("fetch_suggestions_queues_table", "fetch_suggestion_url = ? and user_account_name = ?", new String[]{this.f13521a, this.f13522b});
            FinskyLog.m21662b("%s: deleteEntry queue: %s url: %s", "[Cache and Sync]", this.f13524d.f13515b, this.f13521a);
            if (!this.f13523c) {
                if (this.f13524d.f13515b.equals("dfe")) {
                    C1189b.m7141a(C1189b.f7280p, 1);
                } else {
                    C1189b.m7141a(C1189b.f7281q, 1);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            FinskyLog.m21667d("%s: deleteEntry %s", "[Cache and Sync]", e.getMessage());
        } catch (IllegalStateException e3) {
            e = e3;
            FinskyLog.m21667d("%s: deleteEntry %s", "[Cache and Sync]", e.getMessage());
        }
    }
}
