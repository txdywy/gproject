package com.google.android.finsky.scheduler;

import android.content.ContentValues;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.p188a.C2918a;

final class ae implements C2918a {
    ae() {
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        C4026d c4026d = (C4026d) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("job_id", Integer.valueOf(c4026d.f20249a.f20174b));
        contentValues.put("consumer_id", Integer.valueOf(c4026d.f20249a.f20176d));
        contentValues.put("is_running", Integer.valueOf(c4026d.f20249a.f20183k ? 1 : 0));
        return contentValues;
    }
}
