package com.google.android.finsky.au;

import com.google.android.finsky.cn.a;
import com.google.android.finsky.l.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.ae;
import com.google.wireless.android.finsky.b.f;
import java.io.File;

public final class com.google.android.finsky.au.a extends com.google.android.finsky.au.d
{

    public final com.google.android.finsky.l.a a;
    public final String b;

    a(String p0, com.google.android.finsky.l.a p1, String p2, com.google.wireless.android.finsky.b.ae p3) {
        if (p3.k != 0)
            v9 = p3.k;
        else if (p3.i.isEmpty())
            v9 = 0;
        else
            v9 = new com.google.wireless.android.finsky.b.f().a(p3.e).a(p3.i).d();
        com.google.android.finsky.au.d(p0, p2, p3.d, p3.f, p3.g, p3.h, v9, p3.j);
        this.a = p1;
        this.b = p3.c;
    }

    public final String a(String p0) {
        return p0;
    }

    public final boolean a() {
        return 0;
    }

    public final File b() {
        v1 = new Object[2];
        v1[0] = this.f;
        v1[1] = this.b;
        FinskyLog.e("getSourceFile called for %s (%s) is not supported for splits because patching is not yet supported", v1);
        return 0;
    }

    public final int c() {
        return this.a.c.g(this.f);
    }

    public final boolean d() {
        return 1;
    }

}
