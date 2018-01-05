package com.google.android.finsky.search;

import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.a.a.a.a.cn;

public final class C4058d {
    public final cn f20388a = C2482j.m13314i();

    public static void m18979a(int i, VolleyError volleyError, C2495w c2495w) {
        c2495w.m13367a(new C2474c(i).m13210a(1).m13238a((Throwable) volleyError));
    }

    public static void m18980a(cn cnVar, cn cnVar2) {
        C4058d.m18981a(cnVar.b, cnVar.e, cnVar.f, cnVar.g, cnVar.d, cnVar2);
    }

    public static void m18981a(String str, int i, int i2, byte[] bArr, long j, cn cnVar) {
        cnVar.a(str);
        cnVar.a(j);
        cnVar.a(i);
        cnVar.b(i2);
        if (bArr != null && bArr.length > 0) {
            cnVar.a(bArr);
        }
    }
}
