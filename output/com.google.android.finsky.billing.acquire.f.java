package com.google.android.finsky.billing.acquire;

import com.google.android.finsky.cv.a.is;
import com.google.android.finsky.cv.a.it;
import com.google.android.finsky.utils.ax;

public static class com.google.android.finsky.billing.acquire.f
{

    f() {
    }

    public static com.google.android.finsky.cv.a.is a(com.google.android.finsky.billing.acquire.g p0) {
        v0 = new com.google.android.finsky.cv.a.is();
        v2 = new it[1];
        v2[0] = new com.google.android.finsky.cv.a.it().a("RESPONSE_CODE").a(p0.d);
        v0.a = v2;
        return v0;
    }

    public static boolean a() {
        v0 = 1;
        if (com.google.android.finsky.utils.ax.a("ro.boot.vr") != 1)
            v0 = 0;
        return v0;
    }

}
