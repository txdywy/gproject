package com.google.android.finsky.billing.iab;

import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.utils.be;
import com.google.wireless.android.finsky.dfe.nano.gi;

public static class com.google.android.finsky.billing.iab.v
{

    public static com.google.android.finsky.aa.n a(String p0) {
        return com.google.android.finsky.aa.o.j.b(com.google.android.finsky.utils.be.a(p0));
    }

    public static void a(String p0, com.google.wireless.android.finsky.dfe.nano.gi p1) {
        if (p1 != 0) {
            if (p1.a & 1)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v0 = com.google.android.finsky.billing.iab.v.a(p0);
                if (v0 != 0)
                    v0.a(Integer.valueOf(p1.b));
            }
        }
    }

}
