package com.google.android.finsky.instantappsbackendclient.impl;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import com.google.android.finsky.instantappsbackendclient.p215b.C3409a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.ExecutorService;

public class UpdateContentFilterJob extends JobService {
    public C3574a f17847a;
    public ExecutorService f17848b;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onCreate() {
        super.onCreate();
        ((C3409a) C3947d.m18649a(C3409a.class)).mo3517a(this);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.f17847a.m17152f().edit().clear().apply();
        FinskyLog.m21662b("Updating AIA content filter cache", new Object[0]);
        this.f17848b.execute(new C3592s(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return this.f17847a.m17151e();
    }
}
