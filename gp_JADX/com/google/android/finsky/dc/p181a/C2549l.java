package com.google.android.finsky.dc.p181a;

import android.annotation.TargetApi;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionParams;
import android.net.Uri;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.lang.reflect.InvocationTargetException;

@TargetApi(21)
public final class C2549l implements C2545h {
    public final C2538b f13627a;
    public PackageInstaller f13628b;
    public int f13629c;
    public Session f13630d;

    public C2549l(C2538b c2538b) {
        this.f13627a = c2538b;
    }

    public final void mo2941a(Uri uri, C2297d c2297d) {
        IllegalAccessException e;
        this.f13628b = this.f13627a.f13594a.getPackageManager().getPackageInstaller();
        SessionParams sessionParams = new SessionParams(1);
        sessionParams.setAppPackageName(this.f13627a.f13600g);
        if (((Boolean) C0955b.iE.m28964b()).booleanValue() && C0327a.m1722b()) {
            try {
                sessionParams.getClass().getMethod("setAllocateAggressive", new Class[]{Boolean.TYPE}).invoke(sessionParams, new Object[]{Boolean.valueOf(true)});
            } catch (NoSuchMethodException e2) {
                e = e2;
                FinskyLog.m21667d("SessionParams.setAllocateAggressive could not be called: %s", e);
                this.f13629c = this.f13628b.createSession(sessionParams);
                try {
                    this.f13630d = this.f13628b.openSession(this.f13629c);
                    bb.m21792a(new C2550m(this, uri, c2297d), new Void[0]);
                } catch (Throwable e3) {
                    this.f13627a.m13504a(971, e3);
                    return;
                }
            } catch (InvocationTargetException e4) {
                e = e4;
                FinskyLog.m21667d("SessionParams.setAllocateAggressive could not be called: %s", e);
                this.f13629c = this.f13628b.createSession(sessionParams);
                this.f13630d = this.f13628b.openSession(this.f13629c);
                bb.m21792a(new C2550m(this, uri, c2297d), new Void[0]);
            } catch (IllegalAccessException e5) {
                e = e5;
                FinskyLog.m21667d("SessionParams.setAllocateAggressive could not be called: %s", e);
                this.f13629c = this.f13628b.createSession(sessionParams);
                this.f13630d = this.f13628b.openSession(this.f13629c);
                bb.m21792a(new C2550m(this, uri, c2297d), new Void[0]);
            }
        }
        try {
            this.f13629c = this.f13628b.createSession(sessionParams);
            this.f13630d = this.f13628b.openSession(this.f13629c);
            bb.m21792a(new C2550m(this, uri, c2297d), new Void[0]);
        } catch (Throwable e32) {
            this.f13627a.m13504a(970, e32);
        }
    }
}
