package com.google.android.finsky.cs.a.a;

import android.content.Context;
import com.google.android.gms.phenotype.core.a.c;
import com.google.android.gms.phenotype.core.i;
import com.google.android.gms.phenotype.core.service.operations.m;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.cs.a.a.l
{

    public final com.google.android.gms.phenotype.core.a.c a;
    public final Context b;
    public final String c;
    public final i[] d;
    public final String e;

    l(com.google.android.gms.phenotype.core.a.c p0, Context p1, String p2, Map p3, String p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = com.google.android.finsky.cs.a.a.l.a(p3);
        this.e = p4;
    }

    private static i[] a(Map p0) {
        v5 = new i[p0.size()];
        v6 = p0.entrySet().iterator();
        v2 = 0;
        while (v6.hasNext()) {
            v0 = (Map$Entry)v6.next();
            v1 = (String)v0.getKey();
            v0 = v0.getValue();
            if (v0 instanceof String)
                v1 = new com.google.android.gms.phenotype.core.i(v1, (String)v0, 0);
            else if (v0 instanceof Long)
                v1 = new com.google.android.gms.phenotype.core.i(v1, ((Long)v0).longValue(), 0);
            else if (v0 instanceof Integer)
                v1 = new com.google.android.gms.phenotype.core.i(v1, ((Integer)v0).longValue(), 0);
            else if (v0 instanceof Double)
                v1 = new com.google.android.gms.phenotype.core.i(v1, ((Double)v0).doubleValue(), 0);
            else if (v0 instanceof Boolean)
                v1 = new com.google.android.gms.phenotype.core.i(v1, ((Boolean)v0).booleanValue(), 0);
            else if (v0 instanceof byte[])
                v1 = new com.google.android.gms.phenotype.core.i(v1, (byte[])v0, 0);
            else
                v1 = 0;
            v5[v2] = v1;
            v2 = v2 + 1;
        }
        return v5;
    }

    public final void a() {
        new com.google.android.gms.phenotype.core.service.operations.m(this.c, this.e, this.d).a(this.b, this.a);
    }

}
