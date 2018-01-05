package com.google.android.finsky.billing.iab;

import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.utils.be;
import com.google.wireless.android.finsky.dfe.nano.gi;

public final class C1866v {
    public static void m9978a(String str, gi giVar) {
        if (giVar != null) {
            if (((giVar.a & 1) != 0 ? 1 : null) != null) {
                C0957n a = C1866v.m9977a(str);
                if (a != null) {
                    a.m5763a(Integer.valueOf(giVar.b));
                }
            }
        }
    }

    public static C0957n m9977a(String str) {
        return C0968o.f5933j.m5777b(be.m21800a(str));
    }
}
