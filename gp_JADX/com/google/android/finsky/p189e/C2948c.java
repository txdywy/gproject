package com.google.android.finsky.p189e;

import android.content.Context;
import android.net.Uri;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.t;

public final class C2948c {
    public Context f15567a;
    public C2153a f15568b;
    public C1461c f15569c;
    public C2376e f15570d;
    public C0986a f15571e;
    public C2946a f15572f;

    public C2948c(Context context, C2153a c2153a, C1461c c1461c, C2376e c2376e, C0986a c0986a, C2946a c2946a) {
        this.f15567a = context;
        this.f15568b = c2153a;
        this.f15569c = c1461c;
        this.f15570d = c2376e;
        this.f15571e = c0986a;
        this.f15572f = c2946a;
    }

    public final void m15329a(C1518d c1518d, t tVar, Uri uri, boolean z, C2956k c2956k) {
        String a = C2947b.m15326a(c1518d, this.f15569c.dj());
        tVar.b(a);
        bb.m21792a(new C2949d(this, c1518d, uri, tVar, z, a, c2956k), new Void[0]);
    }

    private final C2957l m15327a(C1518d c1518d, t tVar, String str, Exception exception) {
        FinskyLog.m21665c("Copy error (%s) for %s (%s): %s", str, c1518d.f8208f, c1518d.f8207e, exception);
        this.f15568b.m11221a(c1518d.f8208f, new C2474c(127).m13244b(str).m13210a(963).m13238a((Throwable) exception).m13231a(tVar).m13236a(c1518d.f8208f).f13342a);
        return C2957l.m15347a(963);
    }
}
