package com.google.android.finsky.cm;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageInstaller.SessionParams;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@TargetApi(21)
public final class C2298e implements C2296c {
    public final Context f11330a;
    public final PackageInstaller f11331b = this.f11330a.getPackageManager().getPackageInstaller();
    public final HashMap f11332c;
    public final HashMap f11333d;
    public final Handler f11334e;
    public final Handler f11335f;
    public final C2320a f11336g;
    public final C3849a f11337h;
    public final C1461c f11338i;
    public final C2376e f11339j;
    public final C0986a f11340k;

    public C2298e(Context context, C2320a c2320a, C3849a c3849a, C1461c c1461c, C2376e c2376e, C0986a c0986a) {
        this.f11330a = context;
        this.f11336g = c2320a;
        this.f11337h = c3849a;
        this.f11338i = c1461c;
        this.f11339j = c2376e;
        this.f11340k = c0986a;
        HandlerThread handlerThread = new HandlerThread("PackageInstallerImpl", 10);
        handlerThread.start();
        this.f11334e = new Handler(handlerThread.getLooper());
        this.f11335f = new Handler(Looper.getMainLooper());
        this.f11332c = new HashMap();
        this.f11333d = new HashMap();
        this.f11334e.post(new C2299f(this));
    }

    public final void mo2848a(String str, String str2, int i, es esVar) {
        mo2847a(str, str2, i, 2, esVar, 1);
    }

    public final void mo2847a(String str, String str2, int i, int i2, es esVar, int i3) {
        this.f11334e.post(new C2309p(this, str, str2, i, i2, esVar, i3));
    }

    public final void mo2843a(String str, long j, String str2, int i, int i2, es esVar, int i3) {
        this.f11334e.post(new C2310q(this, str, j, str2, i, i2, esVar, i3));
    }

    private final synchronized void m11826a(String str, long j, String str2, Bitmap bitmap, int i, int i2, es esVar, int i3) {
        if (this.f11332c.containsKey(str)) {
            FinskyLog.m21669e("Creating session for %s when one already exists", str);
        } else {
            SessionParams sessionParams = new SessionParams(i3);
            boolean a = this.f11338i.dj().mo2294a(12637133);
            boolean a2 = this.f11338i.dj().mo2294a(12639086);
            boolean a3 = this.f11338i.dj().mo2294a(12642050);
            if ((a || a2 || a3) && i3 == 2 && C0327a.m1721a()) {
                sessionParams.setDontKillApp(true);
            }
            if (bitmap != null) {
                sessionParams.setAppIcon(bitmap);
            }
            if (!TextUtils.isEmpty(str2)) {
                sessionParams.setAppLabel(str2);
            }
            sessionParams.setAppPackageName(str);
            sessionParams.setInstallLocation(i);
            if (j > 0) {
                sessionParams.setSize(j);
            }
            if (C0327a.m1722b()) {
                sessionParams.setInstallReason(i2);
            }
            if (esVar != null && C2298e.m11827a(esVar)) {
                Object obj;
                if (this.f11330a.checkPermission("android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS", Process.myPid(), Process.myUid()) == 0) {
                    obj = 1;
                } else {
                    FinskyLog.m21667d("INSTALL_GRANT_RUNTIME_PERMISSIONS is not granted", new Object[0]);
                    obj = null;
                }
                if (obj != null) {
                    try {
                        Method method = SessionParams.class.getMethod("setGrantedRuntimePermissions", new Class[]{String[].class});
                        Object[] objArr = new Object[1];
                        objArr[0] = new String[]{"android.permission.SYSTEM_ALERT_WINDOW"};
                        method.invoke(sessionParams, objArr);
                    } catch (NoSuchMethodException e) {
                        FinskyLog.m21665c("Can't find setGrantedRuntimePermissions for %s: %s", str, e);
                    } catch (InvocationTargetException e2) {
                        FinskyLog.m21665c("Can't invoke setGrantedRuntimePermissions for %s: %s", str, e2);
                    } catch (IllegalAccessException e3) {
                        FinskyLog.m21665c("Can't access setGrantedRuntimePermissions for %s: %s", str, e3);
                    }
                }
            }
            if (C0327a.m1722b()) {
                try {
                    SessionParams.class.getDeclaredMethod("setInstallAsInstantApp", new Class[]{Boolean.TYPE}).invoke(sessionParams, new Object[]{Boolean.valueOf(false)});
                } catch (NoSuchMethodException e4) {
                    FinskyLog.m21665c("Couldn't find setInstallAsInstantApp method on SessionParams.", new Object[0]);
                    this.f11332c.put(str, this.f11331b.getSessionInfo(this.f11331b.createSession(sessionParams)));
                    FinskyLog.m21659a("Created session %d for %s", Integer.valueOf(r2), str);
                } catch (InvocationTargetException e5) {
                    FinskyLog.m21665c("Couldn't find setInstallAsInstantApp method on SessionParams.", new Object[0]);
                    this.f11332c.put(str, this.f11331b.getSessionInfo(this.f11331b.createSession(sessionParams)));
                    FinskyLog.m21659a("Created session %d for %s", Integer.valueOf(r2), str);
                } catch (IllegalAccessException e6) {
                    FinskyLog.m21665c("Couldn't find setInstallAsInstantApp method on SessionParams.", new Object[0]);
                    this.f11332c.put(str, this.f11331b.getSessionInfo(this.f11331b.createSession(sessionParams)));
                    FinskyLog.m21659a("Created session %d for %s", Integer.valueOf(r2), str);
                }
            }
            this.f11332c.put(str, this.f11331b.getSessionInfo(this.f11331b.createSession(sessionParams)));
            FinskyLog.m21659a("Created session %d for %s", Integer.valueOf(r2), str);
        }
    }

    private static boolean m11827a(es esVar) {
        if (!C4671b.m21788e()) {
            return false;
        }
        if (!((esVar.f12309a & 4) != 0) || esVar.f12313e < 23 || esVar.f12316h == null) {
            return false;
        }
        for (Object equals : esVar.f12316h) {
            if ("android.permission.SYSTEM_ALERT_WINDOW".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public final void mo2841a(String str) {
        this.f11334e.post(new C2311r(this, str));
    }

    final void m11830a(int i, String str) {
        this.f11334e.post(new C2312s(this, i, str));
    }

    final void m11847c(String str) {
        SessionInfo sessionInfo = (SessionInfo) this.f11332c.get(str);
        if (sessionInfo != null) {
            m11845b(sessionInfo.getSessionId(), str);
        }
    }

    final void m11845b(int i, String str) {
        Session session = (Session) this.f11333d.remove(str);
        if (session != null) {
            try {
                session.close();
            } catch (Exception e) {
                FinskyLog.m21667d("Unexpected error closing session for %s: %s", str, e.getMessage());
            }
        }
        this.f11332c.remove(str);
        try {
            this.f11331b.abandonSession(i);
            FinskyLog.m21659a("Canceling session %d for %s", Integer.valueOf(i), str);
        } catch (SecurityException e2) {
        }
    }

    public final void mo2851a(List list) {
        this.f11334e.post(new C2313t(this, list));
    }

    public final void mo2842a(String str, long j, long j2) {
        this.f11334e.post(new C2314u(this, str, j2, j));
    }

    public final int mo2838a() {
        return ((ActivityManager) this.f11330a.getSystemService("activity")).getLauncherLargeIconSize();
    }

    public final void mo2844a(String str, Bitmap bitmap) {
        this.f11334e.post(new C2315v(this, str, bitmap));
    }

    final Session m11848d(String str) {
        Session session = (Session) this.f11333d.get(str);
        if (session != null) {
            try {
                session.getNames();
                return session;
            } catch (IOException e) {
                FinskyLog.m21667d("Stale open session for %s: %s", str, e.getMessage());
                this.f11333d.remove(str);
            } catch (SecurityException e2) {
                FinskyLog.m21667d("Stale open session for %s: %s", str, e2.getMessage());
                this.f11333d.remove(str);
            }
        }
        SessionInfo sessionInfo = (SessionInfo) this.f11332c.get(str);
        if (sessionInfo == null) {
            return null;
        }
        try {
            session = this.f11331b.openSession(sessionInfo.getSessionId());
            this.f11333d.put(str, session);
            return session;
        } catch (SecurityException e3) {
            FinskyLog.m21665c("SessionInfo was stale for %s - deleting info", str);
            this.f11332c.remove(str);
            return null;
        } catch (IOException e4) {
            FinskyLog.m21665c("IOException opening old session for %s - deleting info", e4.getMessage());
            this.f11332c.remove(str);
            return null;
        }
    }

    public final boolean mo2852a(boolean z) {
        return true;
    }

    public final OutputStream mo2839a(String str, String str2, long j) {
        Session[] sessionArr = new Session[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f11334e.post(new C2316w(this, sessionArr, str, countDownLatch));
        try {
            countDownLatch.await();
            Session session = sessionArr[0];
            if (session != null) {
                return new C2317x(session.openWrite(str2, 0, j), session);
            }
            FinskyLog.m21667d("Can't open session for %s", str);
            throw new IOException(String.format("Can't open session for %s", new Object[]{str}));
        } catch (Throwable e) {
            throw new IOException(e);
        }
    }

    public final void mo2840a(OutputStream outputStream) {
        C2317x c2317x = (C2317x) outputStream;
        OutputStream outputStream2 = c2317x.f11396a;
        c2317x.f11397b.fsync(outputStream2);
        outputStream2.close();
    }

    public final void mo2853b(String str) {
    }

    public final void mo2845a(String str, Uri uri) {
        FinskyLog.m21669e("Cannot install %s from uri %s", str, uri);
    }

    public final void mo2850a(String str, boolean z, C2297d c2297d) {
        this.f11334e.post(new C2300g(this, str, c2297d));
    }

    final void m11832a(Runnable runnable) {
        this.f11334e.post(new C2304k(this, runnable));
    }

    public final void mo2849a(String str, boolean z) {
        this.f11337h.mo3824a(str, z, null);
    }

    public final void mo2846a(String str, String str2) {
        if (this.f11338i.dj().mo2294a(12637133) && C0327a.m1721a()) {
            this.f11334e.post(new C2308o(this, str, str2));
        }
    }
}
