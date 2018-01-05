package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.api.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.by.f;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.i;
import com.google.android.finsky.by.j;
import com.google.android.finsky.by.n;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.az;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.b.q;
import com.google.wireless.android.finsky.b.r;
import com.google.wireless.android.finsky.b.s;
import com.google.wireless.android.finsky.b.t;
import com.google.wireless.android.finsky.b.v;
import com.google.wireless.android.finsky.b.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

final class com.google.android.finsky.by.a.r
{

    public static final long a;
    public com.google.android.finsky.ba.c b;
    public final com.google.android.finsky.api.c c;
    public final Handler d;
    public final Handler e;
    public final com.google.android.finsky.by.a.al f;
    public final com.google.android.finsky.by.a.a g;
    public final List h;
    public final List i;
    public com.google.android.finsky.by.a.aa j;
    public final boolean k;
    public final Runnable l;
    public Queue m;

    static {
        com.google.android.finsky.by.a.r.a = ((Long)com.google.android.finsky.aa.b.dN.b()).longValue();
    }

    r(com.google.android.finsky.api.c p0, com.google.android.finsky.by.a.al p1, com.google.android.finsky.by.a.a p2, Handler p3, Handler p4, boolean p5) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.l = new com.google.android.finsky.by.a.s(this);
        ((com.google.android.finsky.by.a.n)com.google.android.finsky.providers.d.a(com.google.android.finsky.by.a.n)).a(this);
        this.c = p0;
        this.f = p1;
        this.g = p2;
        this.d = p3;
        this.e = p4;
        this.k = p5;
    }

    private final synchronized void a(int p0, com.google.wireless.android.finsky.b.w p1, VolleyError p2, String p3) {
        enter this;
        try {
            if (this.m == 0)
                this.m = new LinkedList();
            v0 = new com.google.android.finsky.by.a.v();
            v0.a = System.currentTimeMillis();
            v0.b = p0;
            v0.c = p3;
            v0.d = p1;
            v0.e = p2;
            this.m.add(v0);
            if (this.m.size() > 100)
                this.m.remove();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    static void a(com.google.android.finsky.by.a.r p0, int p1, VolleyError p2, String p3) {
        p0.a(p1, 0, p2, p3);
    }

    private final synchronized void a(String p0) {
        enter this;
        try {
            v1 = this.h.iterator();
            while (v1.hasNext())
                this.d.post(new com.google.android.finsky.by.a.u((com.google.android.finsky.by.a.z)v1.next(), p0));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    private final String[] a(String[] p0) {
        v2 = 0;
        v1 = 0;
        v0 = 0;
        while (v1 < p0.length) {
            if (!this.g.h(p0[v1]))
                v0 = v0 + 1;
            v1 = v1 + 1;
        }
        if (v0 == p0.length)
            p0 = 0;
        else if (v0 > 0) {
            v1 = new String[p0.length - v0];
            v0 = 0;
            while (v2 < p0.length) {
                if (this.g.h(p0[v2])) {
                    v1[v0] = p0[v2];
                    v0 = v0 + 1;
                }
                v2 = v2 + 1;
            }
            p0 = v1;
        }
        return p0;
    }

    final synchronized void a(long p0) {
        enter this;
        try {
            this.e.removeCallbacks(this.l);
            this.e.postDelayed(this.l, p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(com.google.android.finsky.by.a.aa p0) {
        enter this;
        try {
            if (this.k != 0)
                this.a(1, 0, 0, p0.c);
            this.i.add(0, p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(com.google.android.finsky.by.a.z p0) {
        enter this;
        try {
            this.h.add(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(String[] p0, Runnable p1, String p2) {
        enter this;
        try {
            if (this.k != 0) {
                v0 = Arrays.toString(p0);
                p2 = (String.valueOf(p2).length() + 12 + String.valueOf(v0).length()) + p2 + " libraryIds=" + v0;
                this.a(1, 0, 0, p2);
            }
            v0 = this.a(p0);
            if (v0 == 0) {
                FinskyLog.a("Skipping replication request since all libraries are unsupported.", new Object[0]);
                this.d.post(p1);
            }
            else {
                try {
                    this.i.add(new com.google.android.finsky.by.a.aa(v0, p1, p2));
                    this.a(0);
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
    }

    final boolean a(com.google.wireless.android.finsky.b.w p0, String p1) {
  4:    if (this.k != 0)
 14:        this.a(0, p0, 0, p1);
 29:    if (Looper.myLooper() != this.e.getLooper())
 36:        FinskyLog.e("This method must be called from the background handler.", new Object[0]);
 47:    if (!TextUtils.isEmpty(p0.e))
 53:        v25 = p0.e;
        else
 94:        v25 = com.google.android.finsky.by.h.a(p0.d);
 65:    if (this.g.h(v25)) goto 99;
 70:    v5 = new Object[1];
 73:    v5[0] = v25;
 75:    FinskyLog.a("Ignoring library update for unsupported library %s", v5);
 85:    this.a(5, 0, 0, p1);
 88:    v4 = 0;
 89:    return v4;
103:    this.g.d();
110:    switch (p0.c) {
            case 1:
110:            goto 762;
            case 2:
110:            goto 222;
            case 3:
110:            goto 198;
            default:
        }
116:    v5 = new Object[2];
119:    v5[0] = v25;
130:    v5[1] = Integer.valueOf(p0.c);
132:    FinskyLog.e("Unknown LibraryUpdate.status: libraryId=%s, status=%d", v5);
140:    if (p0.f.length > 0) {
152:        this.g.a(v25, p0.f);
170:        v4 = Base64.encodeToString(p0.f, 0);
174:        com.google.android.finsky.aa.a.a(v25, this.g.f.name).a(v4);
178:        v5 = new Object[2];
181:        v5[0] = v25;
184:        v5[1] = v4;
        }
190:    this.g.e();
195:    v4 = p0.h;
197:    return v4;
210:    this.f.a(this.g.f, v25);
219:    this.g.j(v25);
222:    v60 = new ArrayList;
231:    v60.<init>(p0.g.length);
247:    v22 = 0;
249:    v4 = 0;
254:    if (v22 >= p0.g.length) goto 727;
296:    v49 = 0;
304:    v18 = 0;
306:    v17 = 0;
312:    if (p0.g[v22].l != 0) {
318:        if (p0.g[v22].l.a & 1)
320:            v5 = 1;
            else
481:            v5 = 0;
321:        if (v5 != 0) {
325:            switch (p0.g[v22].l.b) {
                    case 1:
484:                    v17 = 1;
780:                    break;
                    case 2:
490:                    v18 = p0.g[v22].l.c;
780:                    break;
                    default:
780:                    break;
                }
            }
        }
328:    v19 = 2;
334:    if (p0.g[v22].m != 0)
342:        v19 = p0.g[v22].m.b;
350:    if (p0.g[v22].b & 8)
352:        v5 = 1;
        else
494:        v5 = 0;
353:    if (v5 != 0)
359:        v49 = Long.valueOf(p0.g[v22].g);
367:    if (!com.google.android.finsky.by.h.a(v25) && p0.g[v22].f == 0) {
378:        if (p0.g[v22].c.c == 1) {
390:            v12 = 0;
398:            if (p0.g[v22].i.a & 1)
400:                v5 = 1;
                else
497:                v5 = 0;
401:            if (v5 != 0)
405:                v12 = p0.g[v22].i.c;
407:            v14 = 0;
415:            if (p0.g[v22].i.a & 2)
417:                v5 = 1;
                else
499:                v5 = 0;
418:            if (v5 != 0)
422:                v14 = p0.g[v22].i.d;
424:            v16 = 0;
432:            if (p0.g[v22].i.a & 4)
434:                v5 = 1;
                else
501:                v5 = 0;
435:            if (v5 != 0)
441:                v16 = p0.g[v22].i.e;
448:            v23 = new com.google.android.finsky.by.f(this.g.f.name, p0.g[v22].c.b, p0.g[v22].d, p0.g[v22].e, p0.g[v22].i.b, v12, v14, v16, v17, v18, v19, p0.g[v22].n);
            }
507:        else if ((com.google.android.finsky.dfemodel.q.b(p0.g[v22].c.c)) || p0.g[v22].d == 13) {
521:            if (v49 == 0)
525:                v49 = Long.valueOf(p0.g[v22].j.c);
533:            if (p0.g[v22].j.a & 8)
535:                v5 = 1;
                else
588:                v5 = 0;
536:            if (v5 != 0)
540:                v36 = p0.g[v22].j.e;
                else
590:                v36 = 0;
549:            if (p0.g[v22].c.d == 3)
575:                v23 = new com.google.android.finsky.by.j(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v49.longValue(), p0.g[v22].j.b, v36, p0.g[v22].j.d, p0.g[v22].j.f, p0.g[v22].j.g, p0.g[v22].n);
                else
626:                v23 = new com.google.android.finsky.by.n(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v49, p0.g[v22].j.b, v36, p0.g[v22].j.d, v17, v18, v19, p0.g[v22].n);
            }
634:        else if (com.google.android.finsky.dfemodel.q.a(p0.g[v22].c.c)) {
640:            if (p0.g[v22].k != 0)
673:                v23 = new com.google.android.finsky.by.i(this.g.f.name, v25, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].k.b, p0.g[v22].k.c, p0.g[v22].e, p0.g[v22].n);
                else {
677:                if (v49 != 0)
679:                    v32 = v49.longValue();
                    else
712:                    v32 = 9223372036854775807;
707:                v23 = new com.google.android.finsky.by.g(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v32, p0.g[v22].h, v17, v18, v19, p0.g[v22].n);
                }
            }
            else {
677:            if (v49 != 0)
679:                v32 = v49.longValue();
                else
712:                v32 = 9223372036854775807;
707:            v23 = new com.google.android.finsky.by.g(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v32, p0.g[v22].h, v17, v18, v19, p0.g[v22].n);
            }
        }
        else {
677:        if (v49 != 0)
679:            v32 = v49.longValue();
            else
712:            v32 = 9223372036854775807;
707:        v23 = new com.google.android.finsky.by.g(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v32, p0.g[v22].h, v17, v18, v19, p0.g[v22].n);
        }
454:    if (p0.g[v22].f != 0) {
462:        this.g.c(v23);
471:        this.f.c(v23);
474:        v4 = 1;
        }
        else
722:        v60.add(v23);
477:    v22 = v22 + 1;
479:    goto 250;
584:    this.g.e();
587:    throw ex;
626:    v23 = new com.google.android.finsky.by.n(this.g.f.name, v25, p0.g[v22].c.d, p0.g[v22].c.b, p0.g[v22].c.c, p0.g[v22].d, p0.g[v22].e, v49, p0.g[v22].j.b, v36, p0.g[v22].j.d, v17, v18, v19, p0.g[v22].n);
628:    goto 450;
733:    this.g.a(v60);
742:    this.f.a(v60);
749:    if ((!v60.isEmpty()) || v4 != 0)
757:        this.a(v25);
760:    goto 135;
766:    (new Object[1])[0] = v25;
772:    this.g.e();
775:    v4 = 0;
776:    goto 89;
777:    try
            run 593...768
        catch (Throwable ex) {
593:        goto 579;
        }
778:    try
            run 198...578
        catch (Throwable ex) {
198:        goto 579;
        }
779:    try
            run 106...186
        catch (Throwable ex) {
106:        goto 579;
        }
    }

}
