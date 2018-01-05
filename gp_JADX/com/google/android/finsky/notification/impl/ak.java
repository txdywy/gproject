package com.google.android.finsky.notification.impl;

import android.content.ContentValues;
import com.google.android.finsky.cd.C2259b;
import com.google.android.finsky.utils.p188a.C2918a;

final class ak implements C2918a {
    ak() {
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        String str;
        C2259b c2259b = (C2259b) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("notification_id", c2259b.f11206b);
        String str2 = "account_name";
        if (c2259b.am_()) {
            str = c2259b.f11207c;
        } else {
            str = null;
        }
        contentValues.put(str2, str);
        contentValues.put("timestamp", Long.valueOf(c2259b.f11208d));
        contentValues.put("notification_count", Integer.valueOf(c2259b.f11209e));
        return contentValues;
    }
}
