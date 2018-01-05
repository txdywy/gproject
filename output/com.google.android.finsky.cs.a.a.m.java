package com.google.android.finsky.cs.a.a;

import android.content.Context;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.cs.a.d;
import com.google.android.finsky.cs.a.e;
import com.google.android.finsky.cs.a.f;
import com.google.android.finsky.cs.a.i;
import com.google.android.finsky.cs.a.l;
import com.google.android.finsky.cs.a.o;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.i.c;
import com.google.android.finsky.utils.ad;
import com.google.android.gms.phenotype.core.a.c;
import com.google.android.play.a.a.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

protected final class com.google.android.finsky.cs.a.a.m extends com.google.android.finsky.cs.a.a.a
{

    public final com.google.android.finsky.cs.a.f i;
    public final com.google.android.finsky.i.c j;
    public final com.google.android.finsky.cs.a.o k;

    m(com.google.android.finsky.cs.a.a.p p0, com.google.android.gms.phenotype.core.a.c p1, Context p2, String p3, String[] p4, int p5, String p6, byte[] p7, com.google.android.finsky.cs.a.f p8, com.google.android.finsky.i.c p9, com.google.android.finsky.cs.a.o p10) {
        com.google.android.finsky.cs.a.a.a(p0, p1, p2, p3, p4, p5, p6, p7);
        this.i = p8;
        this.j = p9;
        this.k = p10;
    }

    protected final String a(String p0) {
        v0 = this.i.a();
        if (v0 == 0)
            v0 = 0;
        else
            v0 = v0.d;
        return v0;
    }

    protected final boolean a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, String p2) {
 22:    if (com.google.android.finsky.cs.a.i.a(p0, p1, this.i.a.a.getFilesDir(), "experiment-flags-process-stable") == 0)
 25:        v6 = 0;
        else
106:        v6 = 1;
 26:    if (v6 == 0)
200:        return v6;
 35:    com.google.android.finsky.aa.a.aA.a(Boolean.valueOf(1));
 48:    v2 = this.i.a();
 52:    if (v2 == 0)
 58:        v3 = Collections.emptyMap();
        else
110:        v3 = v2.a;
 61:    v9 = new HashMap();
 64:    v10 = p0.c();
 70:    v4 = 0;
 71:    while (v4 < v10.length) {
 75:        v12 = v10[v4].a();
 81:        v5 = 0;
 82:        while (v5 < v12.length) {
 94:            switch (v12[v5].g()) {
                    case 2:
139:                    v2 = Long.valueOf(v12[v5].b());
203:                    break;
                    case 3:
116:                    v2 = Boolean.valueOf(v12[v5].c());
203:                    break;
                    case 4:
130:                    v2 = Double.valueOf(v12[v5].d());
203:                    break;
                    case 5:
144:                    v2 = v12[v5].e();
203:                    break;
                    case 6:
121:                    v2 = v12[v5].f();
203:                    break;
                    default:
 97:                    v2 = 0;
203:                    break;
                }
 98:            v9.put(v12[v5].a(), v2);
103:            v5 = v5 + 1;
            }
151:        v4 = v4 + 1;
        }
155:    v4 = this.k.a.iterator();
163:    if (!v4.hasNext()) goto 201;
169:    v2 = (String)v4.next();
183:    if (com.google.android.finsky.utils.ad.a(v9.get(v2), v3.get(v2))) goto 159;
185:    v2 = 1;
190:    com.google.android.finsky.aa.a.aB.a(Boolean.valueOf(v2));
197:    this.j.a();
200:    return v6;
201:    v2 = 0;
202:    goto 186;
    }

}
