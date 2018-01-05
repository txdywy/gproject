package com.google.android.finsky.billing.common;

import android.os.Bundle;
import com.google.android.finsky.cv.a.is;
import com.google.android.finsky.cv.a.it;
import com.google.android.finsky.utils.FinskyLog;

public static class com.google.android.finsky.billing.common.r
{

    r() {
    }

    public static Bundle a(com.google.android.finsky.cv.a.is p0) {
        if (p0 == 0)
            v0 = 0;
        else {
            v2 = new Bundle();
            v3 = 0;
            while (v3 < p0.a.length) {
                if (p0.a[v3].d())
                    v2.putString(p0.a[v3].d, p0.a[v3].bq_());
                else if (p0.a[v3].f())
                    v2.putBoolean(p0.a[v3].d, p0.a[v3].e());
                else if (p0.a[v3].h())
                    v2.putLong(p0.a[v3].d, p0.a[v3].g());
                else if (p0.a[v3].a == 3) {
                    if (p0.a[v3].a == 3)
                        v0 = p0.a[v3].h;
                    else
                        v0 = 0;
                    v2.putInt(p0.a[v3].d, v0);
                }
                else {
                    v7 = new Object[1];
                    v7[0] = p0.a[v3].d;
                    FinskyLog.c("No known value type for key: %s", v7);
                }
                v3 = v3 + 1;
            }
            v0 = v2;
        }
        return v0;
    }

}
