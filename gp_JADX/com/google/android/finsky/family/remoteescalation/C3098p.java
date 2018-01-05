package com.google.android.finsky.family.remoteescalation;

import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import com.google.wireless.android.finsky.dfe.h.a.ap;
import com.google.wireless.android.finsky.dfe.h.a.aq;

public final class C3098p {
    public static void m15867a(C1254c c1254c, ac acVar, boolean z, C0660x c0660x, C0657w c0657w) {
        C3098p.m15868a(c1254c, acVar.l, acVar.k, z, c0660x, c0657w);
    }

    public static void m15868a(C1254c c1254c, String str, String str2, boolean z, C0660x c0660x, C0657w c0657w) {
        aq aqVar = new aq();
        ap apVar = new ap();
        apVar.e = z ? 1 : 2;
        apVar.b |= 4;
        if (str == null) {
            throw new NullPointerException();
        }
        apVar.b |= 1;
        apVar.c = str;
        if (str2 == null) {
            throw new NullPointerException();
        }
        apVar.b |= 2;
        apVar.d = str2;
        aqVar.b = new ap[]{apVar};
        C0660x c3099q = new C3099q(c1254c, c0660x);
        String str3 = (String) C0954a.aQ.m5777b(C1473m.f7980a.cZ()).m5760a();
        if (!TextUtils.isEmpty(str3)) {
            if (str3 == null) {
                throw new NullPointerException();
            }
            aqVar.a |= 1;
            aqVar.c = str3;
        }
        c1254c.mo1568a(aqVar, c3099q, c0657w);
    }

    public static boolean m15870a(ae aeVar) {
        return aeVar.i == 3 || aeVar.i == 4;
    }

    public static void m15869a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            C0954a.aQ.m5777b(str).m5763a((Object) str2);
        }
    }
}
