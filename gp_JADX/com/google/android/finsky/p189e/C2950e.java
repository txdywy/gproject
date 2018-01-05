package com.google.android.finsky.p189e;

import android.content.Context;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.t;

public final class C2950e {
    public Context f15580a;
    public C2153a f15581b;
    public C1461c f15582c;

    public C2950e(Context context, C2153a c2153a, C1461c c1461c) {
        this.f15580a = context;
        this.f15581b = c2153a;
        this.f15582c = c1461c;
    }

    private final C2957l m15331a(C1518d c1518d, t tVar, String str, Exception exception) {
        FinskyLog.m21667d("Error while verifying download for %s (%s)", c1518d.f8208f, c1518d.f8207e);
        this.f15581b.m11221a(c1518d.f8208f, new C2474c(111).m13244b(str).m13238a((Throwable) exception).m13210a(961).m13231a(tVar).m13236a(c1518d.f8208f).f13342a);
        return C2957l.m15347a(961);
    }
}
