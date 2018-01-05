package com.google.android.finsky.p2p;

import android.content.ContentValues;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.c.a.l;

final class C3846e implements C2918a {
    C3846e() {
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        l lVar = (l) obj;
        if (lVar == null) {
            return null;
        }
        long j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("apk_path", lVar.d);
        contentValues.put("last_updated", Long.valueOf(lVar.c));
        String str = "frosting_id";
        if (lVar.e != null) {
            j = lVar.e.b;
        } else {
            j = 0;
        }
        contentValues.put(str, Long.valueOf(j));
        return contentValues;
    }
}
