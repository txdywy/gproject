package com.google.android.finsky.appdiscoveryservice;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;

public final class C1340v {
    C1340v() {
    }

    static boolean m7821a(String str) {
        if (!((Boolean) C0955b.iF.m28964b()).booleanValue()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equals : ((String) C0955b.iH.m28964b()).replace(" ", "").split(",")) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
