package com.google.android.finsky.appdiscoveryservice;

import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.play.utils.b.a;

static class com.google.android.finsky.appdiscoveryservice.v
{

    v() {
    }

    static boolean a(String p0) {
        if (!((Boolean)com.google.android.finsky.aa.b.iF.b()).booleanValue())
            v0 = 1;
        else {
            if (TextUtils.isEmpty(p0)) {
                v0 = 0;
                return v0;
            }
            v3 = ((String)com.google.android.finsky.aa.b.iH.b()).replace(" ", "").split(",");
            v0 = 0;
            while (v0 < v3.length) {
                if (v3[v0].equals(p0)) {
                    v0 = 1;
                    return v0;
                }
                v0 = v0 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

}
