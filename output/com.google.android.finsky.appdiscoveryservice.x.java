package com.google.android.finsky.appdiscoveryservice;

import android.text.TextUtils;

public final class com.google.android.finsky.appdiscoveryservice.x implements com.google.android.finsky.appdiscoveryservice.s
{

    x() {
    }

    private static int a(String p0, String p1, int p2) {
        if (p1.charAt(0) == p0.charAt(0)) {
            v0 = 0;
            v2 = 0;
            while (v0 < p0.length()) {
                if (v0 < p1.length() && p0.charAt(v0) == p1.charAt(v0))
                    v2 = v2 + p2;
                else
                    v2 = v2 - p2 * 2;
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        else
            v0 = 0;
        if (v0 > 0) {
            v2 = p1.length() - p0.length();
            if (v2 >= 0)
                v0 = v0 + p2 - Math.max(0, p2 - v2);
        }
        return v0;
    }

    public final int a(String p0, String p1) {
        v0 = 1;
        if (TextUtils.isEmpty(p0))
            v1 = 0;
        else {
            if (TextUtils.isEmpty(p1))
                throw new IllegalArgumentException("target cannot be null or empty");
            v2 = p0.toLowerCase();
            v3 = p1.toLowerCase();
            v1 = com.google.android.finsky.appdiscoveryservice.x.a(v2, v3, 100) - 1;
            v3 = v3.split("\\s+");
            if (v3.length > 1)
                while (v0 < v3.length) {
                    v1 = v1 + com.google.android.finsky.appdiscoveryservice.x.a(v2, v3[v0], 10);
                    v0 = v0 + 1;
                }
        }
        return v1;
    }

}
