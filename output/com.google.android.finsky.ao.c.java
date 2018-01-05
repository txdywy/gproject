package com.google.android.finsky.ao;

import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.bu;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.ao.c implements com.android.volley.x
{

    public final com.google.android.finsky.ao.a a;
    public final Map b;
    public final com.google.android.finsky.ao.g c;

    c(com.google.android.finsky.ao.a p0, Map p1, com.google.android.finsky.ao.g p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void b_(Object p0) {
        v6 = new HashMap();
        v0 = 0;
        while (v0 < ((com.google.wireless.android.finsky.dfe.nano.bx)p0).a.length) {
            v8 = new Document(((com.google.wireless.android.finsky.dfe.nano.bx)p0).a[v0].b);
            v6.put(v8.cf(), v8);
            v0 = v0 + 1;
        }
        v7 = new com.google.android.finsky.ao.l();
        v8 = this.b.keySet().iterator();
        while (v8.hasNext()) {
            v2 = (String)v8.next();
            v9 = ((List)this.b.get(v2)).iterator();
            while (v9.hasNext()) {
                v1 = (List)v7.a.get(v2);
                if (v1 == 0) {
                    v1 = new ArrayList();
                    v7.a.put(v2, v1);
                }
                v1.add((Document)v6.get((String)v9.next()));
            }
        }
        this.a.a(this.c, v7.a());
    }

}
