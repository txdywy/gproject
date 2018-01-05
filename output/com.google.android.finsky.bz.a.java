package com.google.android.finsky.bz;

import com.google.android.finsky.aq.a;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.d;
import com.google.android.finsky.r.b;
import com.google.wireless.android.finsky.dfe.f.a.b;

public final class com.google.android.finsky.bz.a implements com.google.android.finsky.r.c
{

    public final com.google.android.finsky.aq.a a;

    a(com.google.android.finsky.aq.a p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.r.b p0) {
        v0 = 0;
        v1 = this.a.g();
        if (v1 != 0 && com.google.android.finsky.aq.a.a(v1) < v1.c)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            if (p0.a != 0) {
                v2 = p0.a.N();
                if (v2 != 0)
                    v0 = v2.k;
            }
            if (!this.a.a(v0)) {
                p0.g = p0.g & -33;
                p0.f.c();
            }
        }
    }

}
