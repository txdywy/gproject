package com.google.android.finsky.ao;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.d;
import com.google.android.finsky.api.h;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cv.a.ch;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.l.j;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.ao.b implements Runnable
{

    public final com.google.android.finsky.ao.a a;

    b(com.google.android.finsky.ao.a p0) {
        this.a = p0;
    }

    public final void run() {
        if (!this.a.f.isEmpty()) {
            v0 = (com.google.android.finsky.ao.g)this.a.f.remove(0);
            v6 = new HashMap();
            v8 = v0.b.b.iterator();
            while (v8.hasNext()) {
                v1 = (com.google.android.finsky.ao.j)v8.next();
                v9 = new ArrayList();
                v6.put(v1.a, v9);
                v4 = 0;
                while (v4 < v1.b.d.length) {
                    v12 = v1.b.d[v4];
                    if (v12 != 0) {
                        if (com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.jR.b()), v12.c)) {
                            v1 = this.a.b.a(v12.c);
                            if (v1 == 0)
                                v1 = 0;
                            else {
                                this.a.c.a(v12).a(v1);
                                v1 = this.a.c.e();
                            }
                            if (v1 == 0) {
                                if (v12.b & 16)
                                    v1 = 1;
                                else
                                    v1 = 0;
                                if (v1 != 0 && v12.g != 0)
                                    v1 = 1;
                                else
                                    v1 = 0;
                                if (v1 == 0)
                                    v9.add(v12.c);
                            }
                        }
                    }
                    v4 = v4 + 1;
                }
            }
            v1 = com.google.android.finsky.ao.a.a(v6);
            if (v1.isEmpty())
                this.a.a(v0, new com.google.android.finsky.ao.l().a());
            else {
                v2 = this.a.a.a(v0.b.a);
                if (v2 == 0) {
                    v1 = new com.google.android.finsky.ao.l();
                    v1.b = 2201;
                    this.a.a(v0, v1.a());
                }
                else
                    this.a.g.put(Integer.valueOf(v0.a), v2.a(com.google.android.finsky.api.d.a(v1), 0, new com.google.android.finsky.ao.c(this.a, v6, v0), new com.google.android.finsky.ao.d(this.a, v0)));
            }
        }
    }

}
