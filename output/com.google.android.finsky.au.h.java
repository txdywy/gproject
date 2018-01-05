package com.google.android.finsky.au;

import com.google.android.finsky.cm.c;
import com.google.android.finsky.l.a;
import com.google.wireless.android.finsky.b.ae;
import java.io.OutputStream;

public final class com.google.android.finsky.au.h extends com.google.android.finsky.au.a
{

    public final com.google.android.finsky.cm.c c;

    h(String p0, com.google.android.finsky.l.a p1, com.google.android.finsky.cm.c p2, String p3, com.google.wireless.android.finsky.b.ae p4) {
        com.google.android.finsky.au.a(p0, p1, p3, p4);
        this.c = p2;
    }

    public final void a(OutputStream p0) {
        this.c.a(p0);
    }

    public final boolean a(boolean p0) {
        return this.c.a(p0);
    }

    public final OutputStream e() {
        return this.c.a(this.f, this.b, this.g);
    }

    public final void f() {
        this.c.b(this.f);
    }

    public final boolean g() {
        return 0;
    }

}
