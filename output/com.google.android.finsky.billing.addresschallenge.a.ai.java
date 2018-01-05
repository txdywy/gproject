package com.google.android.finsky.billing.addresschallenge.a;

import com.google.android.finsky.utils.be;

static class com.google.android.finsky.billing.addresschallenge.a.ai
{

    ai() {
    }

    static String a(String p0) {
        v4 = p0.length();
        v5 = new StringBuilder(v4);
        v1 = 0;
        while (true) {
            if (v1 >= v4)
                return v5.toString();
            v2 = 0;
            v0 = v1;
            while (v0 < v4) {
                v2 = p0.charAt(v0);
                if (v2 == 58)
                    break;
                if (v2 == 47)
                    break;
                v0 = v0 + 1;
            }
            if (v0 == v4)
                break;
            if (v0 > v1) {
                v5.append(com.google.android.finsky.utils.be.a(p0.substring(v1, v0)));
                v5.append(v2);
            }
            else {
                v5.append(v2);
                v0 = v1;
            }
            v1 = v0 + 1;
        }
        v5.append(com.google.android.finsky.utils.be.a(p0.substring(v1)));
        return v5.toString();
    }

}
