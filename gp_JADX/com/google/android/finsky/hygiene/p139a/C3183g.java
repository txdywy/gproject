package com.google.android.finsky.hygiene.p139a;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1301y;

final class C3183g extends C3181h {
    C3183g() {
        super(9);
    }

    public final boolean mo3371a() {
        String str = (String) C0954a.f5850t.m5760a();
        return TextUtils.isEmpty(str) || !str.equals(C1301y.m7756a(VERSION.RELEASE));
    }
}
