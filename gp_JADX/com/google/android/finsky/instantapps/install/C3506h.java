package com.google.android.finsky.instantapps.install;

import android.app.ApplicationErrorReport.CrashInfo;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionParams;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.os.C0330d;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.List;

final class C3506h {
    public final Context f17731a;
    public final af f17732b;
    public final List f17733c;
    public final C3437s f17734d;
    public Session f17735e;

    C3506h(Context context, af afVar, List list, C3437s c3437s) {
        this.f17731a = context;
        this.f17732b = afVar;
        this.f17733c = list;
        this.f17734d = c3437s;
    }

    final synchronized boolean m17083a(String str) {
        boolean z;
        if (this.f17735e != null) {
            throw new IllegalStateException("This session has already been prepared");
        }
        int i;
        PackageInstaller packageInstaller = this.f17731a.getPackageManager().getPackageInstaller();
        try {
            this.f17731a.getPackageManager().getPackageInfo(str, 0);
            i = 2;
        } catch (NameNotFoundException e) {
            i = 1;
        }
        SessionParams sessionParams = new SessionParams(i);
        try {
            Field declaredField = SessionParams.class.getDeclaredField("installFlags");
            declaredField.set(sessionParams, Integer.valueOf(((Integer) declaredField.get(sessionParams)).intValue() | eq.FLAG_MOVED));
            for (C3503c c3503c : this.f17733c) {
                Object obj;
                if (c3503c.f17729e || TextUtils.isEmpty(c3503c.f17725a)) {
                    obj = null;
                    continue;
                } else {
                    obj = 1;
                    continue;
                }
                if (obj == null) {
                    z = false;
                    break;
                }
            }
            z = true;
            sessionParams.setDontKillApp(z);
            sessionParams.setAppPackageName(str);
            try {
                C0330d.m1728a("createSession");
                i = packageInstaller.createSession(sessionParams);
                packageInstaller.registerSessionCallback(new C3507i(this, i, str), new Handler(Looper.getMainLooper()));
                try {
                    C0330d.m1728a("openSession");
                    this.f17735e = packageInstaller.openSession(i);
                } catch (Throwable e2) {
                    m17080a(e2);
                } finally {
                    C0330d.m1727a();
                }
                if (this.f17735e != null) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (IOException e3) {
                i = e3;
                m17080a((Throwable) i);
                z = false;
                return z;
            } finally {
                C0330d.m1727a();
            }
        } catch (Throwable e22) {
            m17080a(e22);
            z = false;
        }
        return z;
    }

    final synchronized void m17082a() {
        if (this.f17735e == null) {
            throw new IllegalStateException("prepare() was not called on this session");
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f17731a, 0, new Intent("com.google.finsky.instantapps.INSTALL_COMMIT"), 134217728);
        this.f17731a.registerReceiver(new C3508j(broadcast), new IntentFilter("com.google.finsky.instantapps.INSTALL_COMMIT"));
        this.f17735e.commit(broadcast.getIntentSender());
        this.f17735e.close();
        this.f17732b.mo5136a(1646);
        this.f17735e = null;
    }

    final synchronized OutputStream m17081a(C3503c c3503c) {
        if (this.f17735e == null) {
            throw new IllegalStateException("prepare() was not called on this session");
        }
        Object[] objArr = new Object[]{c3503c.f17725a, Long.valueOf(c3503c.f17727c)};
        return this.f17735e.openWrite(String.valueOf(c3503c.f17725a).concat("-apk"), 0, c3503c.f17727c);
    }

    final synchronized void m17084b() {
        if (this.f17735e == null) {
            throw new IllegalStateException("prepare() was not called on this session");
        }
        this.f17732b.mo5136a(1647);
        this.f17735e.abandon();
        this.f17735e = null;
    }

    private final void m17080a(Throwable th) {
        FinskyLog.m21660a(th, "Installation failed", new Object[0]);
        af afVar = this.f17732b;
        ad adVar = new ad(1628);
        adVar.f28909b = new CrashInfo(th);
        afVar.mo5139a(adVar.m26987a());
    }
}
