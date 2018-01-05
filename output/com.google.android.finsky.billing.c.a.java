package com.google.android.finsky.billing.c;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.as.e;
import com.google.android.finsky.billing.e.a;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.m;
import com.google.wireless.android.finsky.dfe.c.a.n;
import com.google.wireless.android.finsky.dfe.c.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final class com.google.android.finsky.billing.c.a
{

    public final com.google.android.finsky.as.e a;
    public final com.google.android.finsky.by.c b;
    public final SharedPreferences c;
    public final Account d;
    public final com.google.android.finsky.billing.e.e e;
    public final com.google.android.finsky.billing.c.h f;
    public final com.google.android.finsky.billing.c.b g;
    public final com.google.android.finsky.cn.a h;
    public Integer i;
    public com.google.wireless.android.finsky.dfe.c.a.l j;

    a(Context p0, Account p1, com.google.android.finsky.billing.e.e p2, com.google.android.finsky.billing.c.h p3, com.google.android.finsky.billing.c.b p4, com.google.android.finsky.as.e p5, com.google.android.finsky.by.c p6, com.google.android.finsky.cn.a p7, Bundle p8) {
        this.c = p0.getSharedPreferences("AcquireClientConfigPrefs", 0);
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.a = p5;
        this.b = p6;
        this.h = p7;
        if (p8 != 0) {
            if (p8.containsKey("AcquireClientConfigModel.consumptionAppVersionCode"))
                this.i = Integer.valueOf(p8.getInt("AcquireClientConfigModel.consumptionAppVersionCode"));
            this.j = (com.google.wireless.android.finsky.dfe.c.a.l)ParcelableProto.a(p8, "AcquireClientConfigModel.clientConfig");
        }
    }

    private final boolean b() {
        v0 = this.b.a(this.d);
        if (v0 == 0)
            v0 = 0;
        else {
            v2 = v0.g(com.google.android.finsky.by.h.f).iterator();
            while (v2.hasNext()) {
                if (((com.google.android.finsky.by.g)v2.next()).l == 29) {
                    v0 = 1;
                    return v0;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.c.a.l a() {
  0:    v2 = 3;
  1:    v4 = 1;
  5:    if (this.j != 0) {
  7:        v0 = this.j;
  9:        return v0;
        }
 15:    this.j = new com.google.wireless.android.finsky.dfe.c.a.l();
 21:    v6 = new ArrayList();
 34:    v7 = this.c.getAll().entrySet().iterator();
 38:    while (v7.hasNext()) {
 48:        v0 = (Map$Entry)v7.next();
 52:        v8 = new com.google.wireless.android.finsky.dfe.c.a.m();
 59:        v1 = (String)v0.getKey();
 61:        if (v1 == 0)
 68:            throw new NullPointerException();
 73:        v8.b = v8.b | 1;
 75:        v8.c = v1;
 81:        v0 = v0.getValue().toString();
 85:        if (v0 == 0)
 92:            throw new NullPointerException();
 97:        v8.b = v8.b | 2;
 99:        v8.d = v0;
101:        v6.add(v8);
        }
117:    this.j.b = (m[])v6.toArray(new m[v6.size()]);
131:    this.j.a = this.j.a | 1;
133:    this.j.c = this.e.b();
147:    this.j.a = this.j.a | 2;
149:    this.j.d = this.e.c();
163:    this.j.a = this.j.a | 4;
165:    this.j.e = this.e.e();
189:    if (((Boolean)com.google.android.finsky.billing.e.a.e.b(this.d.name).a()).booleanValue())
191:        v0 = 3;
        else
409:        v0 = 0;
192:    this.j.f = v0;
198:    this.j.a = this.j.a | 8;
206:    this.j.g = this.g.j;
212:    this.j.a = this.j.a | 16;
222:    v0 = com.google.android.finsky.billing.e.a.b.b(this.d.name);
230:    if (!v0.b()) goto 245;
242:    switch (((Integer)v0.a()).intValue()) {
            case 0:
492:            break;
            case 1:
415:            v2 = 4;
492:            break;
            case 2:
412:            v2 = 2;
492:            break;
            default:
245:            v2 = 0;
492:            break;
        }
246:    this.j.h = v2;
252:    this.j.a = this.j.a | 32;
280:    this.j.a = this.j.a | 64;
282:    this.j.i = ((Long)com.google.android.finsky.aa.a.W.b(this.d.name).a()).longValue();
310:    this.j.a = this.j.a | 128;
312:    this.j.j = ((Boolean)com.google.android.finsky.billing.e.a.d.b(this.d.name).a()).booleanValue();
324:    this.j.a = this.j.a | 256;
326:    this.j.k = this.b();
356:    if (((Long)com.google.android.finsky.aa.a.bu.b(this.d.name).a()).longValue() > System.currentTimeMillis())
358:        v0 = 1;
        else
418:        v0 = 0;
363:    this.j.a = this.j.a | 512;
365:    this.j.l = v0;
379:    this.j.a = this.j.a | 2048;
381:    this.j.n = this.a.b();
391:    if (TextUtils.isEmpty(this.f.d))
420:        v4 = 0;
393:    if (v4 == 0) {
444:        v0 = (String)com.google.android.finsky.aa.a.aQ.b(this.d.name).a();
446:        if (v0 != 0) {
450:            if (v0 == 0)
457:                throw new NullPointerException();
462:            this.j.a = this.j.a | 8192;
464:            this.j.p = v0;
            }
468:        if (this.i != 0) {
485:            this.j.a = this.j.a | 32768;
487:            this.j.r = (long)this.i.intValue();
            }
489:        v0 = this.j;
491:        return v0;
        }
401:    if (this.f.d == 0)
408:        throw new NullPointerException();
402:    goto 422;
426:    this.j.a = this.j.a | 1024;
428:    this.j.m = this.f.d;
444:    v0 = (String)com.google.android.finsky.aa.a.aQ.b(this.d.name).a();
446:    if (v0 != 0) {
450:        if (v0 == 0)
457:            throw new NullPointerException();
462:        this.j.a = this.j.a | 8192;
464:        this.j.p = v0;
        }
468:    if (this.i != 0) {
485:        this.j.a = this.j.a | 32768;
487:        this.j.r = (long)this.i.intValue();
        }
489:    v0 = this.j;
491:    return v0;
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.n p0) {
  3:    if (p0 != 0) goto 6;
  5:    return;
  6:    this.j = 0;
 10:    if (p0.c == 0) goto 36;
 14:    v0 = this.c.edit();
 21:    v4 = 0;
 22:    while (v4 < p0.c.length) {
 30:        v0.putString(p0.c[v4].c, p0.c[v4].d);
 33:        v4 = v4 + 1;
        }
 35:    goto 37;
 36:    v0 = 0;
 39:    if (p0.d != 0) {
 41:        if (v0 == 0)
 45:            v0 = this.c.edit();
 52:        v4 = 0;
 53:        while (v4 < p0.d.length) {
 57:            v0.remove(p0.d[v4]);
 60:            v4 = v4 + 1;
            }
        }
 63:    if (v0 != 0)
 65:        v0.apply();
 72:    if (p0.a & 4)
 74:        v0 = 1;
        else
301:        v0 = 0;
 75:    if (v0 != 0) {
 79:        switch (p0.g) {
                case 2:
304:                v0 = 2;
326:                break;
                case 3:
307:                v0 = 0;
326:                break;
                case 4:
310:                v0 = 1;
326:                break;
                default:
 82:                v0 = -1;
326:                break;
            }
 97:        com.google.android.finsky.billing.e.a.b.b(this.d.name).a(Integer.valueOf(v0));
        }
104:    if (p0.a & 2)
106:        v0 = 1;
        else
313:        v0 = 0;
107:    if (v0 != 0) {
112:        if (3 == p0.f)
114:            v0 = 1;
            else
316:            v0 = 0;
129:        com.google.android.finsky.billing.e.a.e.b(this.d.name).a(Boolean.valueOf(v0));
        }
134:    if (p0.e != 0) {
136:        try {
138:            this.e.d();
            }
            catch (RuntimeException ex) {
            }
        }
143:    if (p0.h != 0)
163:        com.google.android.finsky.aa.a.W.b(this.d.name).a(Long.valueOf(System.currentTimeMillis()));
168:    if (p0.i != 0)
184:        com.google.android.finsky.billing.e.a.d.b(this.d.name).a(Boolean.valueOf(1));
191:    if (p0.a & 32)
193:        v0 = 1;
        else
319:        v0 = 0;
194:    if (v0 != 0)
217:        com.google.android.finsky.aa.a.bu.b(this.d.name).a(Long.valueOf(p0.j + System.currentTimeMillis()));
224:    if (p0.a & 128)
226:        v0 = 1;
        else
321:        v0 = 0;
227:    if (v0 != 0)
241:        com.google.android.finsky.aa.a.aQ.b(this.d.name).a(p0.m);
248:    if (p0.k != 0) {
250:        this.f.d = 0;
254:        if (this.f.c != 0)
258:            this.f.c.cancel(1);
266:        this.f.c = new com.google.android.finsky.billing.c.i(this.f, p0.k);
272:        com.google.android.finsky.utils.bb.a(this.f.c, new Void[0]);
        }
277:    if (p0.n != 0) {
285:        v0 = this.h.a(p0.n.b);
289:        if (v0 != 0)
297:            this.i = Integer.valueOf(v0.d);
        }
299:    goto 5;
    }

}
