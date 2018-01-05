package com.google.android.finsky.cs.a.a;

import com.google.android.finsky.cs.a.a;
import com.google.android.finsky.cs.a.c;
import com.google.android.finsky.cs.a.f;
import com.google.android.finsky.cs.a.h;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.bb;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.cs.a.a.d extends com.google.android.finsky.cs.a.c implements com.google.android.finsky.cs.b
{

    public com.google.android.finsky.cs.a.a.e e;

    d() {
        com.google.android.finsky.cs.a.c();
        ((com.google.android.finsky.cs.a.a.o)com.google.android.finsky.providers.d.a(com.google.android.finsky.cs.a.a.o)).a(this);
    }

    private static com.google.android.finsky.cs.f a(com.google.android.finsky.cs.f p0, Map p1) {
        if (p0 == 0)
            v0 = new com.google.android.finsky.cs.f(p1, 0, 0, 0);
        else {
            v1 = new HashMap();
            v1.putAll(p1);
            v1.putAll(p0.a);
            v0 = new com.google.android.finsky.cs.f(v1, p0.b, p0.c, p0.d);
        }
        return v0;
    }

    public final com.google.android.finsky.cs.f a() {
        return com.google.android.finsky.cs.a.a.d.a(this.d.a(), this.c);
    }

    public final com.google.android.finsky.cs.f a(String p0) {
        return com.google.android.finsky.cs.a.a.d.a(this.d.b(p0), this.b);
    }

    public final void a(String p0, Map p1) {
        new com.google.android.finsky.cs.a.a.l(this.e.d, this.e.b, "com.google.android.finsky.stable", p1, com.google.android.finsky.cs.a.a.e.a(p0)).a();
    }

    public final void b(String p0) {
        new com.google.android.finsky.cs.a.a.k(this.e.d, this.e.b, "com.google.android.finsky.stable", com.google.android.finsky.cs.a.a.e.a(p0)).a();
    }

    public final void b(String p0, Map p1) {
        new com.google.android.finsky.cs.a.a.l(this.e.d, this.e.b, "com.google.android.finsky.regular", p1, com.google.android.finsky.cs.a.a.e.a(p0)).a();
    }

    public final void c(String p0) {
        new com.google.android.finsky.cs.a.a.k(this.e.d, this.e.b, "com.google.android.finsky.regular", com.google.android.finsky.cs.a.a.e.a(p0)).a();
    }

    public final void d(String p0) {
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.cs.a.a.m(this.e.e, this.e.d, this.e.b, "com.google.android.finsky.stable", com.google.android.finsky.cs.a.h.a, this.e.c, com.google.android.finsky.cs.a.a.e.a(p0), this.e.f.a(), this.e.a, this.e.g, this.e.h), new Void[0]);
        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.cs.a.a.j(this.e.e, this.e.d, this.e.b, "com.google.android.finsky.regular", com.google.android.finsky.cs.a.h.a, this.e.c, com.google.android.finsky.cs.a.a.e.a(p0), this.e.f.a(), this.e.a), new Void[0]);
    }

}
