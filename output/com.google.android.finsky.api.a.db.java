package com.google.android.finsky.api.a;

import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.api.l;
import com.google.android.finsky.api.p;
import com.google.android.finsky.d.g;
import com.google.android.finsky.do.a;
import com.google.android.finsky.dx.a;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.api.a.db extends com.google.android.finsky.api.a.co
{

    public final com.google.protobuf.nano.i Z;

    db(String p0, com.google.protobuf.nano.i p1, com.google.android.finsky.api.a.b p2, com.google.android.finsky.api.a.cz p3, com.android.volley.x p4, com.android.volley.w p5, com.google.android.finsky.do.a p6, com.google.android.finsky.dx.a p7, com.google.android.finsky.api.p p8, com.google.android.finsky.d.g p9, com.google.android.finsky.api.l p10) {
        com.google.android.finsky.api.a.co(p0, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        this.Z = p1;
    }

    public final String l() {
        return "application/x-protobuf";
    }

    public final byte[] m() {
        if (this.Z == 0)
            v0 = 0;
        else
            v0 = com.google.protobuf.nano.i.a(this.Z);
        return v0;
    }

}
