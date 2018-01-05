package com.google.android.finsky.dy;

import android.content.ContentValues;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;

final class C2932n implements C2918a {
    C2932n() {
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        C4719w c4719w = (C4719w) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("sha256", C4691w.m21842a(c4719w.f24273b));
        return contentValues;
    }
}
