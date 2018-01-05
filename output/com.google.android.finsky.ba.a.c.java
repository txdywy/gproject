package com.google.android.finsky.ba.a;

import android.support.v4.h.h;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.f;
import com.google.android.finsky.cv.a.kn;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.nano.cm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.ba.a.c implements com.google.android.finsky.ba.e
{

    public android.support.v4.h.h a;
    public final String b;
    public final com.google.android.finsky.accounts.a c;
    public final List d;
    public android.support.v4.h.h e;
    public long[] f;
    public long[] g;
    public String h;
    public String i;
    public String j;

    c(String p0, com.google.android.finsky.accounts.a p1, f[] p2) {
        this.a = new android.support.v4.h.h();
        this.d = new ArrayList();
        this.b = p0;
        this.c = p1;
        Collections.addAll(this.d, p2);
        this.b(com.google.android.finsky.utils.k.b((String)com.google.android.finsky.aa.a.X.b(this.b).a()));
        v1 = com.google.android.finsky.aa.a.Y.b(this.b);
        v0 = com.google.android.finsky.utils.k.b((String)v1.a());
        if (v0.length != 0 && this.k())
            this.a(v0);
        else {
            v1.c();
            this.e = 0;
        }
    }

    private static void a(long[] p0, long[] p1) {
        Arrays.sort(p0);
        p1[0] = p0[0];
        v0 = 1;
        while (v0 < p0.length) {
            p1[v0] = p0[v0] - p0[v0 - 1];
            v0 = v0 + 1;
        }
    }

    private final void a(long[] p0, long[] p1, int p2, int p3) {
        this.f = Arrays.copyOf(p0, p2);
        this.g = Arrays.copyOf(p1, p3);
        this.h = com.google.android.finsky.utils.k.a(this.f);
        this.i = com.google.android.finsky.utils.k.a(this.g);
        this.j = 0;
    }

    private final void b(long[] p0) {
        v0 = 0;
        v4 = com.google.android.finsky.ba.a.c.c(p0);
        this.a.b();
        v5 = new long[v4.length];
        v6 = new long[v4.length];
        v3 = 0;
        v2 = 0;
        while (v3 < v4.length) {
            if (com.google.android.finsky.ba.a.d.a.c(v4[v3]) >= 0) {
                v1 = v2 + 1;
                v5[v2] = v4[v3];
                this.a.b(v4[v3], 0);
            }
            else {
                v6[v0] = v4[v3];
                v0 = v0 + 1;
                v1 = v2;
            }
            v3 = v3 + 1;
            v2 = v1;
        }
        this.a(v5, v6, v2, v0);
    }

    private static boolean b(long p0) {
        v0 = com.google.android.finsky.ba.a.d.c.c(p0);
        if (v0 < 0)
            v0 = 0;
        else {
            v0 = (Boolean)com.google.android.finsky.ba.a.d.c.b(v0);
            if (v0 != 0 && v0.booleanValue())
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    private static long[] c(long[] p0) {
        v1 = 0;
        v3 = com.google.android.finsky.utils.k.b((String)com.google.android.finsky.aa.b.dl.b());
        if (v3.length != 0) {
            v2 = new long[p0.length + v3.length];
            v0 = 0;
            while (v0 < p0.length) {
                v2[v0] = p0[v0];
                v0 = v0 + 1;
            }
            while (v1 < v3.length) {
                v2[p0.length + v1] = v3[v1];
                v1 = v1 + 1;
            }
            p0 = v2;
        }
        return p0;
    }

    public final android.support.v4.h.h a() {
        return com.google.android.finsky.ba.a.d.a;
    }

    public final void a(com.google.android.finsky.ba.f p0) {
        this.d.add(p0);
    }

    public final synchronized void a(com.google.android.finsky.cv.a.kn p0) {
  0:    enter this;
  1:    try {
  7:        v3 = com.google.android.finsky.aa.a.X.b(this.b);
 21:        Arrays.sort(p0.b);
 24:        v5 = com.google.android.finsky.utils.k.a(p0.b);
        }
        catch (Throwable ex) {
225:        exit this;
226:        throw ex;
        }
 32:    if (!TextUtils.equals((String)v3.a(), v5)) goto 36;
 34:    exit this;
 35:    return;
 36:    v3.a(v5);
 39:    v8 = com.google.android.finsky.ba.a.c.c(p0.b);
 53:    v5 = new long[com.google.android.finsky.ba.a.d.c.a()];
 55:    v3 = 0;
 57:    v4 = 0;
 58:    while (v4 < com.google.android.finsky.ba.a.d.c.a()) {
 68:        v6 = com.google.android.finsky.ba.a.d.c.a(v4);
 78:        if (this.a(v6)) {
 80:            v2 = v3 + 1;
 82:            v5[v3] = v6;
            }
            else
477:            v2 = v3;
 86:        v4 = v4 + 1;
 87:        v3 = v2;
        }
 89:    v10 = Arrays.copyOf(v5, v3);
101:    this.a = new android.support.v4.h.h(v8.length);
106:    v11 = new long[v8.length + v10.length];
109:    v12 = new long[v8.length];
111:    v4 = 0;
112:    v3 = 0;
113:    v2 = 0;
114:    while (v2 < v10.length) {
121:        v11[v4] = v10[v2];
130:        this.a.b(v10[v2], 0);
133:        v2 = v2 + 1;
135:        v4 = v4 + 1;
        }
139:    v7 = 0;
140:    v2 = 0;
142:    if (v7 >= v10.length) goto 234;
146:    v5 = 0;
148:    v6 = 0;
149:    if (v6 >= v8.length) goto 158;
155:    if (v8[v6] != v10[v7]) goto 227;
157:    v5 = 1;
158:    if (v5 != 0) goto 230;
163:    v5 = new Object[1];
170:    v5[0] = Long.valueOf(v10[v7]);
172:    FinskyLog.a("Process stable target turned off mid-process: %d", v5);
175:    v2 = 1;
180:    if (!com.google.android.finsky.ba.a.c.b(v10[v7])) goto 230;
182:    v2 = 1;
191:    if (this.d.size() > 0 && v2 != 0) {
196:        if (v2 == 1)
199:            v5 = 1;
            else
292:            v5 = 0;
204:        v6 = this.d.iterator();
208:        while (v6.hasNext())
220:            ((com.google.android.finsky.ba.f)v6.next()).a(v5);
        }
223:    goto 294;
225:    exit this;
226:    throw ex;
227:    v6 = v6 + 1;
229:    goto 149;
232:    v7 = v7 + 1;
233:    goto 141;
235:    v5 = 0;
236:    if (v5 >= v8.length) goto 285;
246:    if (com.google.android.finsky.ba.a.d.c.c(v8[v5]) < 0) goto 282;
256:    if (this.a.c(v8[v5]) >= 0) goto 282;
261:    v7 = new Object[1];
268:    v7[0] = Long.valueOf(v8[v5]);
270:    FinskyLog.a("Process stable target turned on mid-process: %d", v7);
273:    v2 = 1;
278:    if (!com.google.android.finsky.ba.a.c.b(v8[v5])) goto 282;
280:    v2 = 1;
281:    goto 183;
282:    v5 = v5 + 1;
284:    goto 236;
285:    if (v2 != 0)
287:        v2 = 2;
        else
289:        v2 = 0;
288:    goto 183;
296:    v5 = 0;
297:    while (v5 < v8.length) {
309:        if (this.a.c(v8[v5]) < 0) {
317:            if (com.google.android.finsky.ba.a.d.a.c(v8[v5]) >= 0 && com.google.android.finsky.ba.a.d.c.c(v8[v5]) < 0) {
329:                v11[v4] = v8[v5];
336:                this.a.b(v8[v5], 0);
339:                v18 = v3;
341:                v3 = v4 + 1;
342:                v2 = v18;
                }
                else {
350:                v2 = v3 + 1;
352:                v12[v3] = v8[v5];
354:                v3 = v4;
                }
            }
            else {
473:            v2 = v3;
474:            v3 = v4;
            }
346:        v5 = v5 + 1;
347:        v4 = v3;
348:        v3 = v2;
        }
359:    v5 = new android.support.v4.h.h(v8.length);
365:    v6 = new android.support.v4.h.h(v8.length);
369:    v2 = 0;
370:    while (v2 < v8.length) {
378:        if (this.a.c(v8[v2]) < 0)
381:            v5.b(v8[v2], 0);
384:        v2 = v2 + 1;
        }
390:    v7 = new android.support.v4.h.h(v8.length);
394:    v2 = 0;
395:    while (v2 < v8.length) {
400:        v7.b(v8[v2], 0);
403:        v2 = v2 + 1;
        }
406:    v2 = 0;
407:    while (v2 < this.a.a()) {
413:        v14 = this.a.a(v2);
421:        if (v7.c(v14) < 0)
424:            v6.b(v14, 0);
427:        v2 = v2 + 1;
        }
434:    if (v5.a() > 0 || v6.a() > 0) {
446:        v7 = this.d.iterator();
450:        while (v7.hasNext())
462:            ((com.google.android.finsky.ba.f)v7.next()).a(v5, v6);
        }
468:    this.a(v11, v12, v4, v3);
471:    goto 34;
479:    try
            run 234...471
        catch (Throwable ex) {
234:        goto 224;
        }
480:    try
            run 36...223
        catch (Throwable ex) {
 36:        goto 224;
        }
    }

    public final void a(long[] p0) {
        v0 = 0;
        if (!this.k())
            FinskyLog.e("Experiment overriding not allowed.", new Object[0]);
        else {
            v1 = com.google.android.finsky.aa.a.Y.b(this.b);
            if (p0 == 0 || p0.length == 0) {
                v1.c();
                this.e = 0;
            }
            else {
                v1.a(com.google.android.finsky.utils.k.a(p0));
                this.e = new android.support.v4.h.h(p0.length);
                while (v0 < p0.length) {
                    this.e.b(p0[v0], 0);
                    v0 = v0 + 1;
                }
            }
        }
    }

    public synchronized boolean a(long p0) {
        v1 = 1;
        enter this;
        try {
            if (this.e != 0) {
                if (this.e.c(p0) >= 0)
                    v0 = 1;
                else
                    v0 = 0;
                if (this.a.c(p0) >= 0) {
                }
                else
                    v1 = 0;
                if (v0 != v1) {
                    v2 = new Object[2];
                    v2[0] = Long.valueOf(p0);
                    v2[1] = Boolean.valueOf(v0);
                    FinskyLog.a("Target id: \"%s\" overridden. Enabled: <%b>", v2);
                }
            }
            else {
                try {
                    if (this.a.c(p0) >= 0)
                        v0 = 1;
                    else
                        v0 = 0;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized long[] b() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.f;
    }

    public final synchronized long[] c() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.g;
    }

    public final synchronized boolean d() {
        v0 = 1;
        enter this;
        try {
            if (this.e != 0) {
                if (this.e.a() > 0) {
                }
                else
                    v0 = 0;
            }
            else {
                try {
                    if (this.a.a() <= 0)
                        v0 = 0;
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized boolean e() {
        enter this;
        try {
            if (!TextUtils.isEmpty(this.i))
                v0 = 1;
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final synchronized String f() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.h;
    }

    public final synchronized String g() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.i;
    }

    public final synchronized String h() {
        enter this;
        try {
            if (this.j == 0) {
                v0 = new com.google.wireless.android.finsky.dfe.nano.cm();
                v0.b = 1;
                v0.a = v0.a | 1;
                if (this.f != 0) {
                    if (this.f.length > 0) {
                        v0.c = new long[this.f.length];
                        com.google.android.finsky.ba.a.c.a(this.f, v0.c);
                    }
                }
                if (this.g != 0) {
                    if (this.g.length > 0) {
                        v0.d = new long[this.g.length];
                        com.google.android.finsky.ba.a.c.a(this.g, v0.d);
                    }
                }
                this.j = com.google.android.finsky.utils.ab.a(v0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.j;
    }

    public final synchronized android.support.v4.h.h i() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a;
    }

    public final android.support.v4.h.h j() {
        return this.e;
    }

    public final boolean k() {
        if (((Boolean)com.google.android.finsky.aa.b.h.b()).booleanValue() && this.c.f())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
