package com.google.android.finsky.splitinstallservice;

import android.content.ContentValues;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.p188a.C2918a;

final /* synthetic */ class av implements C2918a {
    public static final C2918a f21221a = new av();

    private av() {
    }

    public final Object mo3197a(Object obj) {
        C4196a c4196a = (C4196a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", c4196a.f21138c);
        contentValues.put("active_in_installer_state", Integer.valueOf(c4196a.f21147l));
        contentValues.put("creation_timestamp", Long.valueOf(c4196a.f21146k));
        return contentValues;
    }
}
