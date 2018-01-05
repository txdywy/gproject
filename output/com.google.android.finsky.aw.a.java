package com.google.android.finsky.aw;

import a.a;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.bn.c;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.co;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.dl;
import com.google.android.finsky.cv.a.gs;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ae;
import com.google.wireless.android.finsky.b.d;
import com.google.wireless.android.finsky.b.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.aw.a
{

    public final a.a a;
    public final a.a b;
    public final a.a c;
    public Map d;

    a(a.a p0, a.a p1, a.a p2) {
        this.d = new HashMap();
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    private static com.google.android.finsky.cv.a.dl a(dl[] p0, int p1, String p2) {
        v1 = 0;
        while (v1 < p0.length) {
            v0 = p0[v1];
            if (v0.c == p1) {
                if (TextUtils.equals(v0.h, p2))
                    return v0;
            }
            v1 = v1 + 1;
        }
        v0 = 0;
        return v0;
    }

    private static com.google.android.finsky.cv.a.gs a(com.google.wireless.android.finsky.b.d p0) {
        if (p0 == 0)
            v0 = 0;
        else {
            v0 = new com.google.android.finsky.cv.a.gs();
            v0.a = v0.a | 1;
            v0.b = p0.b;
            v0.a = v0.a | 2;
            v0.c = p0.g;
        }
        return v0;
    }

    public static String a(Context p0, long p1) {
        v0 = 0;
        if (p1 != -1) {
            if (p1 <= 0)
                FinskyLog.c("Found negative or zero app size", new Object[0]);
            else
                v0 = Formatter.formatShortFileSize(p0, p1);
        }
        return v0;
    }

    public final long a(com.google.wireless.android.finsky.b.a p0, String p1, int p2) {
        v3 = 0;
        v1 = new ArrayList();
        v4 = new com.google.android.finsky.cv.a.dl();
        v4.a(0);
        v4.b(p2);
        v4.a(p0.b);
        if (p0.a & 2)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0 && p0.f())
            v4.b(p0.c);
        v4.g = com.google.android.finsky.aw.a.a(p0.q);
        v1.add(v4);
        v4 = 0;
        while (v4 < p0.j.length) {
            v8 = new com.google.android.finsky.cv.a.dl();
            if (p0.j[v4].c == 0)
                v0 = 1;
            else
                v0 = 2;
            v8.a(v0);
            v8.b(p0.j[v4].d);
            v8.a(p0.j[v4].e);
            if (p0.j[v4].b & 8)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                if (p0.j[v4].e())
                    v8.b(p0.j[v4].g);
            }
            v8.g = com.google.android.finsky.aw.a.a(p0.j[v4].j);
            v1.add(v8);
            v4 = v4 + 1;
        }
        v4 = 0;
        while (v4 < p0.r.length) {
            v8 = new com.google.android.finsky.cv.a.dl();
            v8.a(0);
            v8.b(p2);
            v8.a(p0.r[v4].d);
            if (p0.r[v4].c == 0)
                throw new NullPointerException();
            v8.b = v8.b | 16;
            v8.h = p0.r[v4].c;
            if (p0.r[v4].b & 4)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                if (p0.r[v4].b & 64)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0)
                    v8.b(p0.r[v4].e);
            }
            v8.g = com.google.android.finsky.aw.a.a(p0.r[v4].j);
            v1.add(v8);
            v4 = v4 + 1;
        }
        v6 = new com.google.android.finsky.cv.a.n();
        v6.n = (dl[])v1.toArray(new dl[v1.size()]);
        v4 = 0;
        while (v3 < ((ArrayList)v1).size()) {
            v1 = ((ArrayList)v1).get(v3);
            v3 = v3 + 1;
            v4 = v4 + ((com.google.android.finsky.cv.a.dl)v1).e;
        }
        v6.a = v6.a | 16;
        v6.f = v4;
        v6.a(p1);
        v6.a = v6.a | 2;
        v6.c = p2;
        v0 = new com.google.android.finsky.cv.a.co();
        v0.a = v6;
        v1 = new com.google.android.finsky.cv.a.cv();
        v1.a(p1);
        v1.b(p1);
        v1.b(3);
        v1.a(1);
        v1.s = v0;
        return this.b(new Document(v1));
    }

    public final String a(Context p0, Document p1) {
        return com.google.android.finsky.aw.a.a(p0, this.c(p1));
    }

    public final void a(Document p0) {
        v0 = p0.N();
        if (v0 != 0) {
            this.a(v0.k);
            this.d.put(v0.k, new com.google.android.finsky.aw.b(v0.c, this.c(p0)));
        }
    }

    public final void a(String p0) {
        this.d.remove(p0);
    }

    public final long b(Document p0) {
        return this.c(p0);
    }

    public final long c(Document p0) {
  0:    v5 = p0.N();
  4:    if (v5 == 0) {
  6:        v8 = 0;
  8:        return v8;
        }
 21:    v10 = ((com.google.android.finsky.cn.a)this.a.a()).a(v5.k);
 25:    if (v10 != 0)
 29:        v3 = v10.d;
        else
214:        v3 = -1;
 42:    v2 = ((com.google.android.finsky.bn.b)this.b.a()).a(v5.k);
 46:    if (v2 != 0)
 50:        v4 = v2.z;
        else
218:        v4 = 0;
 51:    v8 = 0;
 55:    v11 = new HashSet();
 58:    if (v10 != 0 && v10.o != 0)
 70:        v11.addAll(Arrays.asList(v10.o));
 73:    v12 = v5.n;
 77:    v5 = 0;
 78:    if (v5 >= v12.length)
  8:        return v8;
 84:    if (v3 < v12[v5].d) goto 128;
107:    if (((com.google.android.finsky.ba.c)this.c.a()).dj().a(12642050) && !TextUtils.isEmpty(v12[v5].h) && !v11.contains(v12[v5].h))
125:        v2 = 1;
        else
221:        v2 = 0;
126:    if (v2 == 0) goto 223;
128:    v2 = 1;
129:    if (v2 != 0) {
131:        v6 = v12[v5].e;
137:        if (v12[v5].b & 8)
139:            v2 = 1;
            else
225:            v2 = 0;
140:        if (v2 != 0 && v12[v5].f > 0)
152:            v6 = v12[v5].f;
154:        if (v10 != 0 && (v10.g == 0 || v10.h != 0)) {
164:            v2 = v12[v5].g;
166:            if (v2 == 0 && v4 != 0) {
180:                v15 = com.google.android.finsky.aw.a.a(v4.n, v12[v5].c, v12[v5].h);
184:                if (v15 != 0 && v15.d == v12[v5].d)
196:                    v2 = v15.g;
                }
198:            if (v2 != 0) {
202:                if (v2.b <= v3)
204:                    v6 = v2.c;
                }
            }
206:        v6 = v6 + v8;
        }
        else
227:        v6 = v8;
209:    v5 = v5 + 1;
210:    v8 = v6;
211:    goto 78;
223:    v2 = 0;
224:    goto 129;
    }

}
