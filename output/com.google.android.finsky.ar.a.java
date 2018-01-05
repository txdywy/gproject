package com.google.android.finsky.ar;

import com.google.android.finsky.ce.a;
import com.google.android.finsky.utils.ai;
import com.google.wireless.android.a.a.a.a.aj;

public final class com.google.android.finsky.ar.a
{

    public final com.google.android.finsky.ce.a a;
    public final com.google.android.finsky.utils.ai b;

    a(com.google.android.finsky.ce.a p0, com.google.android.finsky.utils.ai p1) {
        this.a = p0;
        this.b = p1;
    }

    public final com.google.wireless.android.a.a.a.a.aj a() {
        v2 = 1;
        v3 = new com.google.wireless.android.a.a.a.a.aj();
        if (this.a.c())
            v0 = 2;
        else
            v0 = 1;
        v3.b = v0;
        v3.a = v3.a | 1;
        v0 = this.b.a();
        if (v0 != 0 && v0.booleanValue())
            v0 = 2;
        else
            v0 = 1;
        v3.c = v0;
        v3.a = v3.a | 2;
        if (!this.b.c())
            v2 = 2;
        v3.d = v2;
        v3.a = v3.a | 4;
        return v3;
    }

}
