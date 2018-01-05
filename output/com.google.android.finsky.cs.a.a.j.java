package com.google.android.finsky.cs.a.a;

import android.content.Context;
import com.google.android.finsky.cs.a.e;
import com.google.android.finsky.cs.a.f;
import com.google.android.finsky.cs.f;
import com.google.android.gms.phenotype.core.a.c;
import com.google.android.play.a.a.l;

protected final class com.google.android.finsky.cs.a.a.j extends com.google.android.finsky.cs.a.a.a
{

    public final com.google.android.finsky.cs.a.f i;

    j(com.google.android.finsky.cs.a.a.p p0, com.google.android.gms.phenotype.core.a.c p1, Context p2, String p3, String[] p4, int p5, String p6, byte[] p7, com.google.android.finsky.cs.a.f p8) {
        com.google.android.finsky.cs.a.a.a(p0, p1, p2, p3, p4, p5, p6, p7);
        this.i = p8;
    }

    protected final String a(String p0) {
        v0 = this.i.b(p0);
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.d;
        return v0;
    }

    protected final boolean a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, String p2) {
        return this.i.a(p0, p1, p2);
    }

}
