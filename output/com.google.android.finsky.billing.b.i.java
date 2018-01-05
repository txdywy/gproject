package com.google.android.finsky.billing.b;

import android.accounts.Account;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.h.p;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.j;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.a.a;
import com.google.android.finsky.billing.a.d;
import com.google.android.finsky.billing.a.h;
import com.google.android.finsky.billing.c.a;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.lg;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dialogbuilder.b.a;
import com.google.android.finsky.dialogbuilder.b.h;
import com.google.android.finsky.dialogbuilder.b.l;
import com.google.android.finsky.dialogbuilder.d;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.d.b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.af;
import com.google.wireless.android.finsky.dfe.c.a.ag;
import com.google.wireless.android.finsky.dfe.c.a.ar;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.db;
import com.google.wireless.android.finsky.dfe.c.a.dr;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.du;
import com.google.wireless.android.finsky.dfe.c.a.ee;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.w;
import com.google.wireless.android.finsky.dfe.nano.ew;
import com.google.wireless.android.finsky.dfe.nano.ez;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.b.i extends AsyncTaskLoader
{

    public com.google.wireless.android.finsky.dfe.c.a.co A;
    public com.google.android.finsky.billing.a.h B;
    public final com.google.android.finsky.api.c a;
    public final DfeResponseVerifier b;
    public final com.google.android.finsky.billing.b.d c;
    public final com.google.android.finsky.billing.c.a d;
    public final com.google.android.finsky.billing.b.n e;
    public final com.google.android.finsky.dialogbuilder.b.a f;
    public final com.google.android.finsky.dialogbuilder.b.h g;
    public final com.google.android.finsky.billing.b.f h;
    public final com.google.android.finsky.dialogbuilder.b.l i;
    public final boolean j;
    public final boolean k;
    public final Semaphore l;
    public final Object m;
    public com.google.wireless.android.finsky.dfe.c.a.ac n;
    public com.google.android.finsky.cv.a.lg o;
    public String p;
    public com.google.wireless.android.finsky.dfe.c.a.dt q;
    public android.support.v4.h.p r;
    public boolean s;
    public boolean t;
    public boolean u;
    public com.google.android.finsky.billing.b.l v;
    public com.google.android.finsky.billing.b.k w;
    public com.google.wireless.android.finsky.dfe.c.a.ae x;
    public long y;
    public com.google.android.finsky.api.j z;

    i(Context p0, com.google.android.finsky.api.c p1, DfeResponseVerifier p2, com.google.android.finsky.billing.b.d p3, com.google.android.finsky.billing.c.a p4, com.google.android.finsky.billing.b.n p5, com.google.android.finsky.dialogbuilder.b.a p6, com.google.android.finsky.dialogbuilder.b.h p7, com.google.android.finsky.billing.b.f p8, com.google.android.finsky.dialogbuilder.b.l p9, com.google.android.finsky.ba.e p10) {
        AsyncTaskLoader(p0);
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        this.i = p9;
        this.j = p10.a(12629551);
        this.k = p10.a(12629613);
        this.l = new Semaphore(0);
        this.m = new Object();
    }

    private final com.google.wireless.android.finsky.dfe.c.a.ae b() {
  4:    if (this.u != 0) {
  9:        this.u = 0;
 13:        v2 = this.x;
 15:        return v2;
        }
 20:    if (this.k == 0)
 30:        this.c.a(this.A);
 37:    if (this.j != 0)
 54:        this.c.f.a(this.c.d(307).a, 0);
 61:    enter this.m;
 62:    try {
 68:        this.y = SystemClock.elapsedRealtime();
 73:        this.s = 1;
 78:        this.t = 0;
 89:        this.v = new com.google.android.finsky.billing.b.l(this);
100:        this.w = new com.google.android.finsky.billing.b.k(this);
102:        exit this.m;
        }
        catch (Throwable ex) {
170:        try {
170:            exit this.m;
            }
            catch (Throwable ex) {
170:            exit this.m;
171:            throw ex;
            }
171:        throw ex;
        }
107:    v5 = this.getContext();
115:    v6 = this.a.c();
127:    v8 = this.d.a();
137:    v10 = this.B.b.j(v6);
148:    if (v10.a(12639865)) goto 172;
150:    v2 = 0;
151:    if (v2 != 0)
155:        this.a(v2);
        else {
628:        this.z = this.a.a(this.n, this.o, this.p, this.q, this.r, this.v, this.w);
630:        try {
634:            this.l.acquire();
            }
            catch (InterruptedException ex) {
644:            if (this.s != 0)
653:                this.a(new VolleyError(ex));
            }
        }
161:    this.s = 0;
165:    v2 = this.x;
167:    return v2;
174:    if (this.n.b != 0) goto 183;
178:    this.c.b(9);
181:    v2 = 0;
182:    goto 151;
187:    if (this.n.b.c != 0) goto 196;
191:    this.c.b(8);
194:    v2 = 0;
195:    goto 151;
196:    this.B.b(v6, this.c);
205:    v11 = this.B.a(v5, v6, this.n.b.c.b, v8);
211:    if (this.n.d == 0) goto 228;
216:    if (this.n.d.length <= 0) goto 228;
220:    this.c.b(10);
223:    v2 = 1;
224:    if (v2 != 0)
226:        v2 = 0;
        else {
531:        if (v10.a(12644643)) {
539:            v2 = this.B.a.b(this.B.a(v5, v6, v8), this.c);
543:            if (v2 != 0 && (v10.a(12639866))) {
151:                if (v2 != 0)
155:                    this.a(v2);
                    else {
628:                    this.z = this.a.a(this.n, this.o, this.p, this.q, this.r, this.v, this.w);
630:                    try {
634:                        this.l.acquire();
                        }
                        catch (InterruptedException ex) {
644:                        if (this.s != 0)
653:                            this.a(new VolleyError(ex));
                        }
                    }
161:                this.s = 0;
165:                v2 = this.x;
167:                return v2;
                }
            }
556:        v2 = this.B.a.c(v11, this.c);
560:        if (v2 == 0 || !v10.a(12639866))
571:            v2 = 0;
576:        else if (v2.e != 0) {
580:            this.c.b(11);
583:            v2 = 0;
            }
            else
586:            v2 = v2.c;
        }
227:    goto 151;
230:    if (this.n.i == 0) goto 244;
236:    if (this.n.i.l == 0) goto 244;
239:    this.c.b(5);
242:    v2 = 1;
243:    goto 224;
246:    v12 = new StringBuilder();
251:    if (this.n.c == 0) goto 461;
257:    if (this.n.c.g == 0) goto 272;
264:    if (this.n.c.g.length <= 0) goto 272;
267:    this.c.b(1);
270:    v2 = 1;
271:    goto 224;
276:    if (this.n.c.h != 0) {
284:        v3 = 0;
285:        while (v3 < this.n.c.h.length) {
301:            if (!this.B.g.contains(this.n.c.h[v3].c)) {
303:                v2 = -1;
308:                switch (this.n.c.h[v3].c.hashCode()) {
                        case -1827029976:
391:                        if (this.n.c.h[v3].c.equals("accountId"))
393:                            v2 = 3;
660:                        break;
                        case -1631695148:
371:                        if (this.n.c.h[v3].c.equals("replaceSkusImmediately"))
373:                            v2 = 1;
660:                        break;
                        case -733100941:
381:                        if (this.n.c.h[v3].c.equals("prorationMode"))
383:                            v2 = 2;
660:                        break;
                        case 3772:
401:                        if (this.n.c.h[v3].c.equals("vr"))
403:                            v2 = 4;
660:                        break;
                        case 1261903366:
361:                        if (this.n.c.h[v3].c.equals("replaceSkusProration"))
363:                            v2 = 0;
660:                        break;
                        default:
660:                        break;
                    }
311:                switch (v2) {
                        case 0:
660:                        break;
                        case 1:
660:                        break;
                        case 2:
660:                        break;
                        case 3:
660:                        break;
                        case 4:
407:                        if (this.n.c.h[v3].e != 0)
411:                            v12.append("#vr=true");
660:                        break;
                        default:
338:                        if (this.n.c.h[v3].f())
342:                            v2 = String.valueOf(this.n.c.h[v3].e);
419:                        else if (this.n.c.h[v3].g())
425:                            v2 = String.valueOf(this.n.c.h[v3].f);
434:                        else if (this.n.c.h[v3].e())
436:                            v2 = this.n.c.h[v3].d;
                            else {
447:                            v17 = new Object[1];
451:                            v17[0] = this.n.c.h[v3];
455:                            FinskyLog.c("Got weird param type: %s", v17);
458:                            v2 = "weird_param";
                            }
348:                        v12.append("#").append(this.n.c.h[v3].c).append("=").append(v2);
660:                        break;
                    }
                }
353:            v3 = v3 + 1;
            }
        }
461:    v3 = String.valueOf(v11);
469:    v2 = String.valueOf(v12.toString());
477:    if (v2.length() != 0)
479:        v2 = v3.concat(v2);
        else
493:        v2 = new String(v3);
483:    if (v2 == 0)
490:        throw new NullPointerException();
501:    this.n.a = this.n.a | 1024;
503:    this.n.t = v2;
509:    if (v12.length() > 0) {
515:        this.c.a(v12.toString());
518:        v2 = 1;
        }
        else
521:        v2 = 0;
519:    goto 224;
    }

    final void a(VolleyError p0) {
  9:    if (this.n.e != 0)
 11:        v0 = 1;
        else
 57:        v0 = 0;
 12:    v3 = this.i.a(p0, v0);
 20:    v5 = new com.google.wireless.android.finsky.dfe.c.a.ae();
 23:    if (this.x == 0) {
 61:        v5.b = new af[1];
 67:        v4 = new com.google.wireless.android.finsky.dfe.c.a.af();
 76:        v4.b = v4.b | 1;
 78:        v4.c = "error";
 80:        v5.b[0] = v4;
 86:        v5.b[0].d = v3;
 88:        this.x = v5;
 94:        if (this.n.x == 0) {
103:            this.x.h = new com.google.wireless.android.finsky.dfe.c.a.bl();
111:            v2 = new com.google.wireless.android.finsky.dfe.c.a.db();
120:            v2.a = v2.a | 1;
122:            v2.b = "error";
124:            this.x.h.f = v2;
            }
128:        if (this.n != 0 && this.n.d()) {
144:            if (this.n.d == 0)
151:                throw new NullPointerException();
156:            this.x.a = this.x.a | 1;
158:            this.x.e = this.n.d;
            }
160:        v2 = 0;
164:        if (this.z != 0)
168:            v2 = this.z.b();
178:        v4 = SystemClock.elapsedRealtime() - this.y;
181:        if (this.j != 0)
207:            this.c.f.a(this.c.d(308).a(p0).a(v2).b(v4).a, 0);
212:        if (this.k == 0 && this.A != 0) {
236:            v2 = this.c.a(this.A.c, this.A.e).a(p0).a(v2).b(v4);
244:            if (this.A.d())
248:                v2.d(this.A.d);
255:            this.c.f.a(v2.a, 0);
            }
258:        this.t = 1;
260:        this.A = 0;
262:        return;
        }
 27:    if (this.x.b == 0) {
 61:        v5.b = new af[1];
 67:        v4 = new com.google.wireless.android.finsky.dfe.c.a.af();
 76:        v4.b = v4.b | 1;
 78:        v4.c = "error";
 80:        v5.b[0] = v4;
 86:        v5.b[0].d = v3;
 88:        this.x = v5;
 94:        if (this.n.x == 0) {
103:            this.x.h = new com.google.wireless.android.finsky.dfe.c.a.bl();
111:            v2 = new com.google.wireless.android.finsky.dfe.c.a.db();
120:            v2.a = v2.a | 1;
122:            v2.b = "error";
124:            this.x.h.f = v2;
            }
128:        if (this.n != 0 && this.n.d()) {
144:            if (this.n.d == 0)
151:                throw new NullPointerException();
156:            this.x.a = this.x.a | 1;
158:            this.x.e = this.n.d;
            }
160:        v2 = 0;
164:        if (this.z != 0)
168:            v2 = this.z.b();
178:        v4 = SystemClock.elapsedRealtime() - this.y;
181:        if (this.j != 0)
207:            this.c.f.a(this.c.d(308).a(p0).a(v2).b(v4).a, 0);
212:        if (this.k == 0 && this.A != 0) {
236:            v2 = this.c.a(this.A.c, this.A.e).a(p0).a(v2).b(v4);
244:            if (this.A.d())
248:                v2.d(this.A.d);
255:            this.c.f.a(v2.a, 0);
            }
258:        this.t = 1;
260:        this.A = 0;
262:        return;
        }
 36:    v5.b = new af[this.x.b.length + 1];
 38:    v0 = 0;
 39:    while (v0 < this.x.b.length) {
 52:        v5.b[v0 + 1] = this.x.b[v0];
 54:        v0 = v0 + 1;
        }
 56:    goto 63;
 61:    v5.b = new af[1];
 67:    v4 = new com.google.wireless.android.finsky.dfe.c.a.af();
 76:    v4.b = v4.b | 1;
 78:    v4.c = "error";
 80:    v5.b[0] = v4;
 86:    v5.b[0].d = v3;
 88:    this.x = v5;
 94:    if (this.n.x == 0) {
103:        this.x.h = new com.google.wireless.android.finsky.dfe.c.a.bl();
111:        v2 = new com.google.wireless.android.finsky.dfe.c.a.db();
120:        v2.a = v2.a | 1;
122:        v2.b = "error";
124:        this.x.h.f = v2;
        }
128:    if (this.n != 0 && this.n.d()) {
144:        if (this.n.d == 0)
151:            throw new NullPointerException();
156:        this.x.a = this.x.a | 1;
158:        this.x.e = this.n.d;
        }
160:    v2 = 0;
164:    if (this.z != 0)
168:        v2 = this.z.b();
178:    v4 = SystemClock.elapsedRealtime() - this.y;
181:    if (this.j != 0)
207:        this.c.f.a(this.c.d(308).a(p0).a(v2).b(v4).a, 0);
212:    if (this.k == 0 && this.A != 0) {
236:        v2 = this.c.a(this.A.c, this.A.e).a(p0).a(v2).b(v4);
244:        if (this.A.d())
248:            v2.d(this.A.d);
255:        this.c.f.a(v2.a, 0);
        }
258:    this.t = 1;
260:    this.A = 0;
    }

    final void a(com.google.wireless.android.finsky.dfe.c.a.ae p0) {
  5:    this.g.b();
  8:    this.g.b = 0;
 12:    this.g.a.clear();
 19:    this.f.a.clear();
 24:    this.h.e = 0;
 26:    this.x = p0;
 28:    v4 = 0;
 32:    if (this.z != 0)
 36:        v4 = this.z.b();
 46:    v6 = SystemClock.elapsedRealtime() - this.y;
 50:    if (p0.c != 0)
 86:        this.c.f.a(this.c.d(308).a(p0.c.c).a(p0.c.b).a(v4).b(v6).a, 0);
 91:    if (p0.g != 0)
 99:        this.c.a(this.A, p0.g, v4, v6);
108:    if (this.x.d == 0) {
240:        if (this.x.d != 0) {
250:            if (this.x.d.a & 1)
252:                v0 = 1;
                else
330:                v0 = 0;
253:            if (v0 != 0 && this.x.d.f != 0)
274:                new com.google.android.finsky.billing.b.j(this, this.d.a()).start();
            }
279:        if (p0.h == 0)
285:            this.d.a(p0.f);
288:        this.A = 0;
290:        return;
        }
113:    if (this.x.d.b.length > 0) {
119:        this.e.m = 1;
132:        this.e.g.a(this.e.c, "acquire", new com.google.android.finsky.billing.b.o(this.e, this.x.d.d), this.x.d.b);
        }
137:    if (this.x.d.c != 0) {
147:        if (this.x.d.c.a & 8)
149:            v0 = 1;
            else
291:            v0 = 0;
150:        if (v0 != 0)
156:            this.e.f.a(this.x.d.c.c, this.x.d.c.e);
163:        if (this.x.d.c.a & 16)
165:            v0 = 1;
            else
294:            v0 = 0;
166:        if (v0 != 0) {
170:            if (this.x.d.c.f != 0) {
174:                v2 = new Object[1];
176:                v2[0] = this.x.d.c.c;
178:                FinskyLog.a("Will queue %s to be downloaded over any network", v2);
183:                this.e.f.a(this.x.d.c.c);
                }
                else {
299:                v2 = new Object[1];
301:                v2[0] = this.x.d.c.c;
303:                FinskyLog.a("Will queue %s to be downloaded on wifi only", v2);
308:                this.e.f.b(this.x.d.c.c);
                }
            }
200:        this.e.f.a(this.x.d.c.c, this.x.d.c.b, this.e.c.name, this.x.d.c.d, 2, 0, this.e.e);
        }
205:    if (this.x.d.e == 0) {
240:        if (this.x.d != 0) {
250:            if (this.x.d.a & 1)
252:                v0 = 1;
                else
330:                v0 = 0;
253:            if (v0 != 0 && this.x.d.f != 0)
274:                new com.google.android.finsky.billing.b.j(this, this.d.a()).start();
            }
279:        if (p0.h == 0)
285:            this.d.a(p0.f);
288:        this.A = 0;
290:        return;
        }
230:    com.google.android.gms.ads.d.a.a(this.e.i, new com.google.android.gms.ads.d.b(this.x.d.e.b, this.x.d.e.c, this.x.d.e.d, this.x.d.e.e, this.x.d.e.f, this.x.d.e.g, this.x.d.e.h));
233:    this.e.a(0);
240:    if (this.x.d != 0) {
250:        if (this.x.d.a & 1)
252:            v0 = 1;
            else
330:            v0 = 0;
253:        if (v0 != 0 && this.x.d.f != 0)
274:            new com.google.android.finsky.billing.b.j(this, this.d.a()).start();
        }
279:    if (p0.h == 0)
285:        this.d.a(p0.f);
288:    this.A = 0;
290:    return;
315:    v2 = new Object[1];
321:    v2[0] = ex.getMessage();
323:    FinskyLog.d("Unable to report IAP, GooglePlayServicesNotAvailableException: %s", v2);
326:    this.e.a(ex);
329:    goto 236;
332:    try
            run 228...233
        catch (GooglePlayServicesNotAvailableException ex) {
228:        goto 312;
        }
    }

    public final boolean a() {
        if (this.n != 0 && this.n.x != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final Object loadInBackground() {
        return this.b();
    }

    public final boolean onCancelLoad() {
        enter this.m;
        try {
            if (this.s != 0) {
                this.s = 0;
                this.v.a = 1;
                this.w.a = 1;
                this.l.release();
            }
            exit this.m;
            return super.onCancelLoad();
            exit this.m;
        }
        catch (Throwable ex) {
            exit this.m;
            throw ex;
        }
    }

}
