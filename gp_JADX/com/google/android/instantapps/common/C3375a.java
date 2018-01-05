package com.google.android.instantapps.common;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.Executor;

public abstract class C3375a extends JobService {
    public static final C5804k f17309g = new C5804k("BaseHygieneJobService");

    public abstract Executor mo3498a();

    public abstract void mo3499a(JobParameters jobParameters);

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

    public final boolean onStartJob(JobParameters jobParameters) {
        mo3498a().execute(new C5704b(this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public static boolean m16857b() {
        return VERSION.SDK_INT >= 21;
    }
}
