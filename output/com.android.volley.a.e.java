package com.android.volley.a;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.aa;
import com.android.volley.b;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.android.volley.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;
import java.util.TreeSet;

public final class com.android.volley.a.e implements com.android.volley.k
{

    public static final boolean a;
    public final com.android.volley.a.d b;
    public final com.android.volley.a.f c;

    static {
        com.android.volley.a.e.a = com.android.volley.aa.b;
    }

    e(com.android.volley.a.p p0) {
        com.android.volley.a.e(p0, new com.android.volley.a.f(4096));
    }

    e(com.android.volley.a.p p0, com.android.volley.a.f p1) {
        this.b = new com.android.volley.a.a(p0);
        this.c = p1;
    }

    private static List a(List p0, com.android.volley.b p1) {
        v2 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!p0.isEmpty()) {
            v1 = p0.iterator();
            while (v1.hasNext())
                v2.add(((com.android.volley.j)v1.next()).a);
        }
        v3 = new ArrayList(p0);
        if (p1.h == 0) {
            if (!p1.g.isEmpty()) {
                v4 = p1.g.entrySet().iterator();
                while (v4.hasNext()) {
                    v0 = (Map$Entry)v4.next();
                    if (v2.contains(v0.getKey()))
                        continue;
                    v3.add(new com.android.volley.j((String)v0.getKey(), (String)v0.getValue()));
                }
            }
            return v3;
        }
        if (!p1.h.isEmpty()) {
            v1 = p1.h.iterator();
            while (v1.hasNext()) {
                v0 = (com.android.volley.j)v1.next();
                if (v2.contains(v0.a))
                    continue;
                v3.add(v0);
            }
        }
        return v3;
        if (!p1.g.isEmpty()) {
            v4 = p1.g.entrySet().iterator();
            while (v4.hasNext()) {
                v0 = (Map$Entry)v4.next();
                if (v2.contains(v0.getKey()))
                    continue;
                v3.add(new com.android.volley.j((String)v0.getKey(), (String)v0.getValue()));
            }
        }
        return v3;
    }

    private static void a(String p0, com.android.volley.n p1, VolleyError p2) {
        v1 = p1.o();
        try {
            p1.m.a(p2);
        }
        catch (VolleyError ex) {
            v3 = new Object[2];
            v3[0] = p0;
            v3[1] = Integer.valueOf(v1);
            p1.a(String.format("%s-timeout-giveup [timeout=%s]", v3));
            throw ex;
        }
        v2 = new Object[2];
        v2[0] = p0;
        v2[1] = Integer.valueOf(v1);
        p1.a(String.format("%s-retry [timeout=%s]", v2));
    }

    private final byte[] a(InputStream p0, int p1) {
        v2 = new com.android.volley.a.af(this.c, p1);
        v1 = 0;
        if (p0 == 0) {
            try {
                throw new ServerError();
            }
            catch (Throwable ex) {
                if (p0 != 0) {
                    try {
                        p0.close();
                    }
                    catch (IOException ex) {
                        com.android.volley.aa.a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.c.a(v1);
                v2.close();
                throw ex;
            }
        }
        try {
            v1 = this.c.a(1024);
            while (true) {
                v0 = p0.read(v1);
                if (v0 == -1)
                    break;
                v2.write(v1, 0, v0);
            }
        }
        catch (Throwable ex) {
            if (p0 != 0) {
                try {
                    p0.close();
                }
                catch (IOException ex) {
                    com.android.volley.aa.a("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.c.a(v1);
            v2.close();
            throw ex;
        }
        if (p0 != 0) {
            try {
                p0.close();
            }
            catch (IOException ex) {
                com.android.volley.aa.a("Error occurred when closing InputStream", new Object[0]);
            }
        }
        this.c.a(v1);
        v2.close();
        return v2.toByteArray();
    }

    public final com.android.volley.m a(com.android.volley.n p0) {
  0:    v18 = SystemClock.elapsedRealtime();
  4:    v3 = 0;
  6:    v8 = Collections.emptyList();
 14:    if (p0.n != 0) goto 68;
 16:    v2 = Collections.emptyMap();
 26:    v17 = this.b.a(p0, v2);
 38:    v8 = Collections.unmodifiableList(v17.b);
 44:    if (v17.a == 304) {
 50:        if (p0.n != 0) {
147:            v2 = new com.android.volley.m(304, p0.n.a, 1, SystemClock.elapsedRealtime() - v18, com.android.volley.a.e.a(v8, p0.n));
148:            return v2;
            }
 64:        v2 = new com.android.volley.m(304, 0, 1, SystemClock.elapsedRealtime() - v18, v8);
 67:        return v2;
        }
 45:    goto 149;
 70:    v2 = new HashMap();
 75:    if (p0.n.b != 0)
 81:        v2.put("If-None-Match", p0.n.b);
 90:    if (p0.n.d > 0)
109:        v2.put("If-Modified-Since", com.android.volley.a.n.a().format(new Date(p0.n.d)));
112:    goto 20;
123:    com.android.volley.a.e.a("socket", p0, new TimeoutError());
126:    goto 4;
147:    v2 = new com.android.volley.m(304, p0.n.a, 1, SystemClock.elapsedRealtime() - v18, com.android.volley.a.e.a(v8, p0.n));
148:    return v2;
153:    if (v17.d == 0) goto 273;
161:    v4 = this.a(v17.d, v17.c);
169:    v6 = SystemClock.elapsedRealtime() - v18;
173:    if (com.android.volley.a.e.a != 0) goto 181;
179:    if (v6 <= 3000) goto 231;
184:    v9 = new Object[5];
187:    v9[0] = p0;
194:    v9[1] = Long.valueOf(v6);
197:    if (v4 == 0) goto 277;
200:    v2 = Integer.valueOf(v4.length);
204:    v9[2] = v2;
211:    v9[3] = Integer.valueOf(v17.a);
226:    v9[4] = Integer.valueOf(p0.m.b());
228:    com.android.volley.aa.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", v9);
233:    if (v17.a < 200)
244:        throw new IOException();
237:    if (v17.a > 299)
244:        throw new IOException();
238:    goto 280;
255:    v2 = String.valueOf(p0.d());
263:    if (v2.length() != 0)
265:        v2 = "Bad URL ".concat(v2);
        else
361:        v2 = new String("Bad URL ");
272:    throw new RuntimeException(v2, ex);
274:    v4 = new byte[0];
276:    goto 165;
277:    v2 = "null";
279:    goto 204;
289:    v2 = new com.android.volley.m(v17.a, v4, 0, SystemClock.elapsedRealtime() - v18, v8);
292:    return v2;
294:    v2 = ex;
295:    v3 = v17;
297:    if (v3 == 0)
370:        throw new NoConnectionError(v2);
304:    v5 = new Object[2];
311:    v5[0] = Integer.valueOf(v3.a);
318:    v5[1] = p0.d();
320:    com.android.volley.aa.c("Unexpected response code %d for %s", v5);
323:    if (v4 != 0) {
334:        v2 = new com.android.volley.m(v3.a, v4, 0, SystemClock.elapsedRealtime() - v18, v8);
339:        if (v3.a == 401 || v3.a == 403)
354:            com.android.volley.a.e.a("auth", p0, new AuthFailureError(v2));
            else {
373:            if (v3.a >= 400 && v3.a <= 499)
384:                throw new ClientError(v2);
387:            if (v3.a < 500)
424:                throw new ServerError(v2);
391:            if (v3.a > 599)
424:                throw new ServerError(v2);
397:            if (p0.l == 0)
418:                throw new ServerError(v2);
408:            com.android.volley.a.e.a("server", p0, new ServerError(v2));
            }
        }
        else
434:        com.android.volley.a.e.a("network", p0, new NetworkError());
357:    goto 4;
439:    v2 = ex;
440:    v4 = 0;
441:    goto 297;
443:    v2 = ex;
444:    v4 = 0;
445:    v3 = v17;
447:    goto 297;
448:    try
            run 277...292
        catch (SocketTimeoutException ex) {
277:        goto 113;
        }
        catch (MalformedURLException ex) {
277:        goto 245;
        }
        catch (IOException ex) {
277:        goto 294;
        }
449:    try
            run 274...276
        catch (SocketTimeoutException ex) {
274:        goto 113;
        }
        catch (MalformedURLException ex) {
274:        goto 245;
        }
        catch (IOException ex) {
274:        goto 443;
        }
450:    try
            run 165...245
        catch (SocketTimeoutException ex) {
165:        goto 113;
        }
        catch (MalformedURLException ex) {
165:        goto 245;
        }
        catch (IOException ex) {
165:        goto 294;
        }
451:    try
            run 127...164
        catch (SocketTimeoutException ex) {
127:        goto 113;
        }
        catch (MalformedURLException ex) {
127:        goto 245;
        }
        catch (IOException ex) {
127:        goto 443;
        }
452:    try
            run 68...112
        catch (SocketTimeoutException ex) {
 68:        goto 113;
        }
        catch (MalformedURLException ex) {
 68:        goto 245;
        }
        catch (IOException ex) {
 68:        goto 439;
        }
453:    try
            run 30...67
        catch (SocketTimeoutException ex) {
 30:        goto 113;
        }
        catch (MalformedURLException ex) {
 30:        goto 245;
        }
        catch (IOException ex) {
 30:        goto 443;
        }
454:    try
            run 10...29
        catch (SocketTimeoutException ex) {
 10:        goto 113;
        }
        catch (MalformedURLException ex) {
 10:        goto 245;
        }
        catch (IOException ex) {
 10:        goto 439;
        }
    }

}
