package com.google.android.finsky.ak;

import android.content.Context;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.utils.a.a;
import com.google.android.finsky.z.d;
import com.google.android.play.utils.b.a;
import java.util.concurrent.Executors;

public final class com.google.android.finsky.ak.g implements com.google.android.finsky.ak.f
{

    public final com.google.android.finsky.z.d a;
    public final com.google.android.finsky.ba.c b;
    public final Context c;

    g(Context p0, com.google.android.finsky.z.d p1, com.google.android.finsky.ba.c p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final com.google.android.finsky.ak.a a(String p0, d[] p1) {
        return new com.google.android.finsky.ak.a(this.c, this.a.a(Executors.newSingleThreadExecutor()), p0, p1);
    }

    public final com.google.android.finsky.ak.e a(com.google.android.finsky.ak.a p0, String p1, com.google.android.finsky.utils.a.a p2, com.google.android.finsky.utils.a.a p3, com.google.android.finsky.utils.a.a p4, int p5, com.google.android.finsky.utils.a.a p6) {
        return new com.google.android.finsky.ak.h(this.b, p0.d, p0, p1, p2, p3, p4, p5, ((Long)com.google.android.finsky.aa.b.jk.b()).longValue(), p6);
    }

    public final com.google.android.finsky.ak.e a(String p0, com.google.android.finsky.ak.d p1, com.google.android.finsky.utils.a.a p2, com.google.android.finsky.utils.a.a p3, com.google.android.finsky.utils.a.a p4, com.google.android.finsky.utils.a.a p5) {
        v0 = new d[1];
        v0[0] = p1;
        v4 = this.a(p0, v0);
        return new com.google.android.finsky.ak.h(this.b, v4.d, v4, p1.a, p2, p3, p4, 0, ((Long)com.google.android.finsky.aa.b.jk.b()).longValue(), p5);
    }

}
