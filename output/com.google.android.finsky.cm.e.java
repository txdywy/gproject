package com.google.android.finsky.cm;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller$Session;
import android.content.pm.PackageInstaller$SessionInfo;
import android.content.pm.PackageInstaller$SessionParams;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.support.v4.os.a;
import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cs.e;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.packagemanager.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

final class com.google.android.finsky.cm.e implements com.google.android.finsky.cm.c
{

    public final Context a;
    public final PackageInstaller b;
    public final HashMap c;
    public final HashMap d;
    public final Handler e;
    public final Handler f;
    public final com.google.android.finsky.cn.a g;
    public final com.google.android.finsky.packagemanager.a h;
    public final com.google.android.finsky.ba.c i;
    public final com.google.android.finsky.cs.e j;
    public final com.google.android.finsky.accounts.a k;

    e(Context p0, com.google.android.finsky.cn.a p1, com.google.android.finsky.packagemanager.a p2, com.google.android.finsky.ba.c p3, com.google.android.finsky.cs.e p4, com.google.android.finsky.accounts.a p5) {
        this.a = p0;
        this.g = p1;
        this.h = p2;
        this.b = this.a.getPackageManager().getPackageInstaller();
        this.i = p3;
        this.j = p4;
        this.k = p5;
        v0 = new HandlerThread("PackageInstallerImpl", 10);
        v0.start();
        this.e = new Handler(v0.getLooper());
        this.f = new Handler(Looper.getMainLooper());
        this.c = new HashMap();
        this.d = new HashMap();
        this.e.post(new com.google.android.finsky.cm.f(this));
    }

    static void a(com.google.android.finsky.cm.e p0, String p1, long p2, String p4, Bitmap p5, int p6, int p7, com.google.android.finsky.cv.a.es p8, int p9) {
        p0.a(p1, p2, p4, p5, p6, p7, p8, p9);
    }

    private final synchronized void a(String p0, long p1, String p3, Bitmap p4, int p5, int p6, com.google.android.finsky.cv.a.es p7, int p8) {
  0:    enter this;
  7:    if (!this.c.containsKey(p0)) goto 22;
 12:    v3 = new Object[1];
 15:    v3[0] = p0;
 17:    FinskyLog.e("Creating session for %s when one already exists", v3);
 20:    exit this;
 21:    return;
 26:    v3 = new PackageInstaller$SessionParams(p8);
 68:    if (((this.i.dj().a(12637133)) || (this.i.dj().a(12639086)) || this.i.dj().a(12642050)) && p8 == 2 && android.support.v4.os.a.a())
 86:        v3.setDontKillApp(1);
 89:    if (p4 != 0)
 91:        v3.setAppIcon(p4);
 98:    if (!TextUtils.isEmpty(p3))
100:        v3.setAppLabel(p3);
103:    v3.setAppPackageName(p0);
108:    v3.setInstallLocation(p5);
115:    if (p1 > 0)
117:        v3.setSize(p1);
124:    if (android.support.v4.os.a.b())
128:        v3.setInstallReason(p6);
131:    if (p7 == 0) goto 193;
137:    if (!com.google.android.finsky.cm.e.a(p7)) goto 193;
155:    if (this.a.checkPermission("android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS", Process.myPid(), Process.myUid()) != 0) goto 269;
157:    v2 = 1;
158:    if (v2 != 0) {
160:        try {
165:            v5 = new Class[1];
170:            v5[0] = String[];
177:            v4 = new Object[1];
181:            v6 = new String[1];
186:            v6[0] = "android.permission.SYSTEM_ALERT_WINDOW";
188:            v4[0] = v6;
190:            PackageInstaller$SessionParams.getMethod("setGrantedRuntimePermissions", v5).invoke(v3, v4);
            }
            catch (NoSuchMethodException ex) {
283:            v5 = new Object[2];
286:            v5[0] = p0;
289:            v5[1] = ex;
291:            FinskyLog.c("Can't find setGrantedRuntimePermissions for %s: %s", v5);
            }
            catch (InvocationTargetException ex) {
299:            v5 = new Object[2];
302:            v5[0] = p0;
305:            v5[1] = ex;
307:            FinskyLog.c("Can't invoke setGrantedRuntimePermissions for %s: %s", v5);
            }
            catch (IllegalAccessException ex) {
315:            v5 = new Object[2];
318:            v5[0] = p0;
321:            v5[1] = ex;
323:            FinskyLog.c("Can't access setGrantedRuntimePermissions for %s: %s", v5);
            }
            catch (Throwable ex) {
267:            exit this;
268:            throw ex;
            }
        }
197:    if (!android.support.v4.os.a.b()) goto 229;
204:    v5 = new Class[1];
209:    v5[0] = Boolean.TYPE;
216:    v4 = new Object[1];
224:    v4[0] = Boolean.valueOf(0);
226:    PackageInstaller$SessionParams.getDeclaredMethod("setInstallAsInstantApp", v5).invoke(v3, v4);
229:    try {
231:        v2 = this.b.createSession(v3);
243:        this.c.put(p0, this.b.getSessionInfo(v2));
249:        v4 = new Object[2];
256:        v4[0] = Integer.valueOf(v2);
259:        v4[1] = p0;
261:        FinskyLog.a("Created session %d for %s", v4);
        }
        catch (Throwable ex) {
267:        exit this;
268:        throw ex;
        }
264:    goto 20;
267:    exit this;
268:    throw ex;
274:    FinskyLog.d("INSTALL_GRANT_RUNTIME_PERMISSIONS is not granted", new Object[0]);
277:    v2 = 0;
278:    goto 158;
334:    FinskyLog.c("Couldn't find setInstallAsInstantApp method on SessionParams.", new Object[0]);
337:    goto 229;
339:    goto 329;
341:    goto 329;
342:    try
            run 269...337
        catch (Throwable ex) {
269:        goto 266;
        }
344:    try
            run 199...229
        catch (NoSuchMethodException ex) {
199:        goto 338;
        }
        catch (InvocationTargetException ex) {
199:        goto 340;
        }
        catch (IllegalAccessException ex) {
199:        goto 328;
        }
        catch (Throwable ex) {
199:        goto 266;
        }
345:    try
            run 193...196
        catch (Throwable ex) {
193:        goto 266;
        }
347:    try
            run 22...154
        catch (Throwable ex) {
 22:        goto 266;
        }
348:    try
            run 1...20
        catch (Throwable ex) {
  1:        goto 266;
        }
    }

    private static boolean a(com.google.android.finsky.cv.a.es p0) {
        v0 = 0;
        if (com.google.android.finsky.utils.b.e()) {
            if (p0.a & 4)
                v2 = 1;
            else
                v2 = 0;
            if (v2 == 0)
                return v0;
            if (p0.e < 23)
                return v0;
            if (p0.h == 0)
                return v0;
            v2 = 0;
            while (true) {
                if (v2 >= p0.h.length)
                    return v0;
                if ("android.permission.SYSTEM_ALERT_WINDOW".equals(p0.h[v2]))
                    break;
                v2 = v2 + 1;
            }
            v0 = 1;
        }
        return v0;
    }

    public final int a() {
        return ((ActivityManager)this.a.getSystemService("activity")).getLauncherLargeIconSize();
    }

    public final OutputStream a(String p0, String p1, long p2) {
        v0 = new PackageInstaller$Session[1];
        v1 = new CountDownLatch(1);
        this.e.post(new com.google.android.finsky.cm.w(this, v0, p0, v1));
        try {
            v1.await();
        }
        catch (InterruptedException ex) {
            throw new IOException(ex);
        }
        if (v0[0] == 0) {
            v1 = new Object[1];
            v1[0] = p0;
            FinskyLog.d("Can't open session for %s", v1);
            v2 = new Object[1];
            v2[0] = p0;
            throw new IOException(String.format("Can't open session for %s", v2));
        }
        return new com.google.android.finsky.cm.x(v0[0].openWrite(p1, 0, p2), v0[0]);
    }

    final void a(int p0, String p1) {
        this.e.post(new com.google.android.finsky.cm.s(this, p0, p1));
    }

    public final void a(OutputStream p0) {
        ((com.google.android.finsky.cm.x)p0).b.fsync(((com.google.android.finsky.cm.x)p0).a);
        ((com.google.android.finsky.cm.x)p0).a.close();
    }

    final void a(Runnable p0) {
        this.e.post(new com.google.android.finsky.cm.k(this, p0));
    }

    public final void a(String p0) {
        this.e.post(new com.google.android.finsky.cm.r(this, p0));
    }

    public final void a(String p0, long p1, long p3) {
        this.e.post(new com.google.android.finsky.cm.u(this, p0, p3, p1));
    }

    public final void a(String p0, long p1, String p3, int p4, int p5, com.google.android.finsky.cv.a.es p6, int p7) {
        this.e.post(new com.google.android.finsky.cm.q(this, p0, p1, p3, p4, p5, p6, p7));
    }

    public final void a(String p0, Bitmap p1) {
        this.e.post(new com.google.android.finsky.cm.v(this, p0, p1));
    }

    public final void a(String p0, Uri p1) {
        v1 = new Object[2];
        v1[0] = p0;
        v1[1] = p1;
        FinskyLog.e("Cannot install %s from uri %s", v1);
    }

    public final void a(String p0, String p1) {
        if (this.i.dj().a(12637133) && android.support.v4.os.a.a())
            this.e.post(new com.google.android.finsky.cm.o(this, p0, p1));
    }

    public final void a(String p0, String p1, int p2, int p3, com.google.android.finsky.cv.a.es p4, int p5) {
        this.e.post(new com.google.android.finsky.cm.p(this, p0, p1, p2, p3, p4, p5));
    }

    public final void a(String p0, String p1, int p2, com.google.android.finsky.cv.a.es p3) {
        this.a(p0, p1, p2, 2, p3, 1);
    }

    public final void a(String p0, boolean p1) {
        this.h.a(p0, p1, 0);
    }

    public final void a(String p0, boolean p1, com.google.android.finsky.cm.d p2) {
        this.e.post(new com.google.android.finsky.cm.g(this, p0, p2));
    }

    public final void a(List p0) {
        this.e.post(new com.google.android.finsky.cm.t(this, p0));
    }

    public final boolean a(boolean p0) {
        return 1;
    }

    final void b(int p0, String p1) {
        v0 = this.d.remove(p1);
        if ((PackageInstaller$Session)v0 != 0) {
            try {
                ((PackageInstaller$Session)v0).close();
            }
            catch (Exception ex) {
                v2 = new Object[2];
                v2[0] = p1;
                v2[1] = ex.getMessage();
                FinskyLog.d("Unexpected error closing session for %s: %s", v2);
            }
        }
        this.c.remove(p1);
        try {
            this.b.abandonSession(p0);
        }
        catch (SecurityException ex) {
            return;
        }
        v1 = new Object[2];
        v1[0] = Integer.valueOf(p0);
        v1[1] = p1;
        FinskyLog.a("Canceling session %d for %s", v1);
    }

    public final void b(String p0) {
    }

    final void c(String p0) {
        v0 = (PackageInstaller$SessionInfo)this.c.get(p0);
        if (v0 != 0)
            this.b(v0.getSessionId(), p0);
    }

    final PackageInstaller$Session d(String p0) {
 10:    v0 = (PackageInstaller$Session)this.d.get(p0);
 12:    if (v0 == 0) {
 45:        v0 = (PackageInstaller$SessionInfo)this.c.get(p0);
 47:        if (v0 == 0)
 49:            v0 = 0;
            else {
 79:            v0 = this.b.openSession(v0.getSessionId());
 85:            this.d.put(p0, v0);
            }
 50:        return v0;
        }
 14:    v0.getNames();
 17:    return v0;
 21:    v3 = new Object[2];
 23:    v3[0] = p0;
 29:    v3[1] = ex.getMessage();
 31:    FinskyLog.d("Stale open session for %s: %s", v3);
 36:    this.d.remove(p0);
 45:    v0 = (PackageInstaller$SessionInfo)this.c.get(p0);
 47:    if (v0 == 0)
 49:        v0 = 0;
        else {
 79:        v0 = this.b.openSession(v0.getSessionId());
 85:        this.d.put(p0, v0);
        }
 50:    return v0;
 54:    v3 = new Object[2];
 56:    v3[0] = p0;
 62:    v3[1] = ex.getMessage();
 64:    FinskyLog.d("Stale open session for %s: %s", v3);
 69:    this.d.remove(p0);
 72:    goto 39;
 73:    try {
 79:        v0 = this.b.openSession(v0.getSessionId());
        }
        catch (SecurityException ex) {
 92:        v2 = new Object[1];
 94:        v2[0] = p0;
 96:        FinskyLog.c("SessionInfo was stale for %s - deleting info", v2);
101:        this.c.remove(p0);
104:        v0 = 0;
105:        return v0;
        }
        catch (IOException ex) {
109:        v3 = new Object[1];
115:        v3[0] = ex.getMessage();
117:        FinskyLog.c("IOException opening old session for %s - deleting info", v3);
122:        this.c.remove(p0);
125:        v0 = 0;
126:        return v0;
        }
 85:    this.d.put(p0, v0);
 88:    return v0;
128:    try
            run 14...17
        catch (IOException ex) {
 14:        goto 18;
        }
        catch (SecurityException ex) {
 14:        goto 51;
        }
    }

}
