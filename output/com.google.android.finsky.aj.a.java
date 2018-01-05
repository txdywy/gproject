package com.google.android.finsky.aj;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.z.c;
import com.google.android.finsky.z.d;
import com.google.android.finsky.z.e;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;

public final class com.google.android.finsky.aj.a
{

    public final Map a;
    public final com.google.android.finsky.aj.g b;
    public final List c;
    public com.google.android.finsky.z.c d;

    a(com.google.android.finsky.aj.g p0, com.google.android.finsky.z.d p1) {
        this.b = p0;
        this.a = new ConcurrentHashMap();
        this.c = new ArrayList();
        this.d = p1.a(Executors.newFixedThreadPool(((Integer)com.google.android.finsky.aa.b.hC.b()).intValue()));
    }

    public final com.google.android.finsky.aj.e a(String p0) {
        return (com.google.android.finsky.aj.e)this.a.get(p0);
    }

    public final void a(List p0) {
  0:    v2 = p0.iterator();
  8:    if (!v2.hasNext())
 82:        return;
 14:    v0 = (Document)v2.next();
 22:    v1 = this.a.get(v0.cf());
 28:    if ((com.google.android.finsky.aj.e)v1 == 0) goto 56;
 51:    if (((com.google.android.finsky.aj.e)v1).c < com.google.android.finsky.utils.i.a() - ((Long)com.google.android.finsky.aa.b.hD.b()).longValue())
 53:        v1 = 1;
        else
 80:        v1 = 0;
 54:    if (v1 == 0) goto 4;
 56:    v0 = v0.cf();
 76:    this.d.a(new com.google.android.finsky.aj.b(this, v0)).a(new com.google.android.finsky.aj.c(this, v0));
 79:    goto 4;
    }

    public final boolean a() {
        if (this.a.size() > 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
