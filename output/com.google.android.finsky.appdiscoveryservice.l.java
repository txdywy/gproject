package com.google.android.finsky.appdiscoveryservice;

import android.app.Service;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.a.a;
import com.android.vending.a.d;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.appdiscoveryservice.b.a;
import com.google.android.finsky.appdiscoveryservice.b.e;
import com.google.android.finsky.appdiscoveryservice.b.f;
import com.google.android.finsky.appdiscoveryservice.b.i;
import com.google.android.finsky.appdiscoveryservice.b.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

public final class com.google.android.finsky.appdiscoveryservice.l extends com.android.vending.a.d
{

    public final Map a;
    public final Executor b;
    public final com.google.android.finsky.appdiscoveryservice.b.i c;
    public final com.google.android.finsky.ba.c d;
    public final com.google.android.finsky.appdiscoveryservice.o e;
    public final com.google.android.finsky.d.a f;
    public final PackageManager g;
    public Service h;
    public com.google.android.finsky.d.w i;

    l(Service p0, Executor p1, com.google.android.finsky.appdiscoveryservice.b.i p2, Map p3, com.google.android.finsky.ba.c p4, com.google.android.finsky.appdiscoveryservice.o p5, com.google.android.finsky.d.a p6, PackageManager p7) {
        com.android.vending.a.d();
        this.h = p0;
        this.b = p1;
        this.c = p2;
        this.a = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.i = this.f.a(0);
    }

    public final void a(int p0) {
        v0 = this.a.get(Integer.valueOf(Binder.getCallingUid()));
        if ((com.google.android.finsky.appdiscoveryservice.a)v0 != 0) {
            v0 = ((com.google.android.finsky.appdiscoveryservice.a)v0).a(p0);
            if (v0 != 0)
                v0.c();
        }
    }

    public final void a(int p0, int p1, int p2, boolean p3, String p4, com.android.vending.a.a p5) {
  0:    if (p4 == 0)
  2:        v8 = "";
        else
424:        v8 = p4;
 12:    v9 = this.g.getNameForUid(Binder.getCallingUid());
 32:    v2 = (com.google.android.finsky.appdiscoveryservice.a)this.a.get(Integer.valueOf(Binder.getCallingUid()));
 34:    if (v2 == 0) goto 53;
 42:    if (v2.a.equals(v9) && v2.d == p0)
 50:        v3 = 1;
        else
 89:        v3 = 0;
 51:    if (v3 != 0) goto 420;
 53:    if (v2 != 0) {
 61:        v4 = v2.e.keySet().iterator();
 65:        while (v4.hasNext())
 85:            ((com.google.android.finsky.appdiscoveryservice.b.f)v2.e.remove((Integer)v4.next())).c();
 93:        v2.e.clear();
        }
 96:    try {
        }
        catch (PackageManager$NameNotFoundException ex) {
280:        v4 = new Object[1];
283:        v4[0] = ex;
285:        FinskyLog.e("Failed to retrieve version code for client.", v4);
288:        return;
        }
123:    if (((Boolean)com.google.android.finsky.aa.b.iF.b()).booleanValue()) goto 289;
125:    v2 = 1;
130:    v3 = new com.google.android.finsky.appdiscoveryservice.a(v9, this.g.getPackageInfo(v9, 0).versionCode, p0, v2);
145:    this.a.put(Integer.valueOf(Binder.getCallingUid()), v3);
148:    v36 = v3;
153:    v3 = new Object[2];
156:    v3[0] = v8;
163:    v3[1] = Integer.valueOf(p2);
165:    FinskyLog.b("findApps called with query: %s, max results: %d", v3);
174:    v15 = new com.google.android.finsky.appdiscoveryservice.b.e(this.i);
177:    if (p3 != 0 && v36.c != 0) {
190:        FinskyLog.b("Server results disabled.", new Object[0]);
237:        v16 = new com.google.android.finsky.appdiscoveryservice.b.k(this.c.a, new com.google.android.finsky.appdiscoveryservice.m(this, Binder.getCallingUid()), p0, p1, p2, v8, v9, v36.b, p5, this.c.d, this.c.e, this.c.b, v15, this.c.h);
        }
        else {
319:        FinskyLog.b("Server results enabled.", new Object[0]);
326:        v18 = new com.google.android.finsky.appdiscoveryservice.m;
336:        v18.<init>(this, Binder.getCallingUid());
404:        v16 = new com.google.android.finsky.appdiscoveryservice.b.a(this.c.a, v18, p0, p1, p2, v8, v9, v36.b, p5, this.c.d, this.c.e, this.c.b, this.c.c, this.c.f, this.c.g, v15, this.c.h, v36.c, new ConditionVariable());
        }
239:    try {
255:        if ((com.google.android.finsky.appdiscoveryservice.b.f)v36.e.putIfAbsent(Integer.valueOf(p1), v16) != 0)
264:            throw new IllegalArgumentException("The caller must have unique a requestCode specified across any simultaneously active tasks.");
        }
        catch (IllegalArgumentException ex) {
275:        throw new RemoteException(ex.getMessage());
        }
256:    goto 409;
280:    v4 = new Object[1];
283:    v4[0] = ex;
285:    FinskyLog.e("Failed to retrieve version code for client.", v4);
288:    return;
292:    v2 = 0;
293:    if (v2 >= com.google.android.finsky.appdiscoveryservice.o.b.length) goto 311;
303:    if (this.e.a.checkPermission(com.google.android.finsky.appdiscoveryservice.o.b[v2], v9) != 0) goto 308;
305:    v2 = 1;
306:    goto 126;
308:    v2 = v2 + 1;
310:    goto 293;
311:    v2 = 0;
312:    goto 126;
415:    this.b.execute(v16);
418:    return;
420:    v36 = v2;
422:    goto 150;
    }

    public final boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        if (this.d.dj().a(12628776)) {
            this.h.stopSelf();
            throw new RemoteException("This service is no longer available");
        }
        v0 = this.g.getNameForUid(Binder.getCallingUid());
        if (TextUtils.isEmpty(v0))
            throw new SecurityException("AppDiscoveryService cannot be used with apps with a shared user");
        if (!com.google.android.finsky.appdiscoveryservice.v.a(v0)) {
            v3 = new Object[1];
            v3[0] = v0;
            throw new SecurityException(String.format("Calling package - %s - has not been whitelisted for the AppDiscoveryService.", v3));
        }
        return super.onTransact(p0, p1, p2, p3);
    }

}
