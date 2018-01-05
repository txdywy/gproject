package com.google.android.finsky.instantapps.metrics;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
public class LogFlushJob extends JobService {
    public static final long f17780a = TimeUnit.SECONDS.toMillis(30);
    public C5710a f17781b;

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

    static void m17108a(Context context, long j) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!m17109a(jobScheduler)) {
            long convert = TimeUnit.SECONDS.convert(j, TimeUnit.MILLISECONDS);
            jobScheduler.schedule(new Builder(165064389, new ComponentName(context, LogFlushJob.class)).setMinimumLatency(convert).setOverrideDeadline(f17780a + convert).build());
        }
    }

    static void m17107a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (m17109a(jobScheduler)) {
            jobScheduler.cancel(165064389);
        }
    }

    public void onCreate() {
        super.onCreate();
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3515a(this);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.f17781b.m26981a(new C3535h(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    private static boolean m17109a(JobScheduler jobScheduler) {
        for (JobInfo id : jobScheduler.getAllPendingJobs()) {
            if (id.getId() == 165064389) {
                return true;
            }
        }
        return false;
    }
}
