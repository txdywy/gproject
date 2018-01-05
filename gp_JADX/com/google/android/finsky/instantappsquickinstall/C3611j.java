package com.google.android.finsky.instantappsquickinstall;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public final class C3611j implements C1003o {
    public final QuickInstallState f17944a;
    public final C3340g f17945b;
    public final C2495w f17946c;
    public C3613m f17947d;
    public C3371p f17948e;
    public C3612l f17949f;
    public C3603k f17950g;
    public boolean f17951h;
    public boolean f17952i;
    public boolean f17953j;

    public C3611j(QuickInstallState quickInstallState, C3340g c3340g, C2495w c2495w) {
        ((C1396e) C3947d.m18649a(C1396e.class)).mo2005h();
        this.f17944a = quickInstallState;
        this.f17945b = c3340g;
        this.f17946c = c2495w;
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.m16819a().equals(this.f17944a.f17928b.f17930a)) {
            if (c3369m.f17273c.f17153d == 4 && !this.f17952i) {
                this.f17947d.m603h();
                new Object[1][0] = this.f17944a.f17928b.f17930a;
                this.f17952i = true;
            }
            if (c3369m.f17273c.f17153d == 6 && !this.f17951h) {
                Context h = this.f17947d.m603h();
                ValidatedQuickInstallRequest validatedQuickInstallRequest = this.f17944a.f17928b;
                validatedQuickInstallRequest.f17931b.setPackage(validatedQuickInstallRequest.f17930a);
                ResolveInfo resolveActivity = h.getPackageManager().resolveActivity(validatedQuickInstallRequest.f17931b, 0);
                Intent intent = null;
                if (resolveActivity != null) {
                    this.f17947d.m603h();
                    new Object[1][0] = this.f17944a.f17928b.f17930a;
                    intent = this.f17944a.f17928b.f17931b;
                    intent.setComponent(new ComponentName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name));
                    intent.addFlags(270532608);
                } else {
                    this.f17947d.m603h();
                    FinskyLog.m21665c("Instant app %s post-install rejected, app is installed but will not be launched", this.f17944a.f17928b.f17930a);
                }
                this.f17947d.m603h();
                FinskyLog.m21659a("Install completed for instant app %s, starting post-install", this.f17944a.f17928b.f17930a);
                if (this.f17950g != null) {
                    this.f17950g.mo3552b(intent);
                }
                this.f17951h = true;
            }
            m17216b();
        }
    }

    public final void m17214a() {
        this.f17947d = null;
        this.f17950g = null;
        this.f17945b.mo3484b((C1003o) this);
        if (this.f17949f != null) {
            this.f17949f.cancel(true);
        }
    }

    final void m17216b() {
        if (this.f17947d != null) {
            if (this.f17949f != null) {
                this.f17949f.cancel(true);
            }
            this.f17949f = new C3612l(this, this.f17945b, this.f17944a);
            this.f17949f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
