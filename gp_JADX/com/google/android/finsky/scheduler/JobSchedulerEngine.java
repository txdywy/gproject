package com.google.android.finsky.scheduler;

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
import android.os.PersistableBundle;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@TargetApi(21)
public final class JobSchedulerEngine implements C4011l {
    public static final int f20148a = C4031b.f20257b;
    public final Context f20149b;
    public final JobScheduler f20150c = ((JobScheduler) this.f20149b.getSystemService("jobscheduler"));
    public final C2471a f20151d;
    public final bj f20152e;

    public class PhoneskyJobSchedulerJobService extends JobService {
        public ak f20144a;
        public C2471a f20145b;
        public C2495w f20146c;
        public C4037m f20147d;

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
            ((bl) C3947d.m18649a(bl.class)).mo1900a(this);
            this.f20146c = this.f20145b.m13184a("SchedulerJobSchedulerWakeup");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f20147d = this.f20144a.m18807a(jobParameters, this, this.f20146c.m13365a());
            return this.f20147d != null;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            if (this.f20147d != null) {
                this.f20147d.m18928a(0);
                this.f20147d = null;
            }
            return false;
        }
    }

    public JobSchedulerEngine(Context context, C2471a c2471a, bj bjVar) {
        this.f20149b = context;
        this.f20151d = c2471a;
        this.f20152e = bjVar;
    }

    public final void mo3886a(List list, int i) {
        List<C4023a> a = new C4031b(list).m18885a();
        if (a.size() > f20148a) {
            this.f20152e.m18907a(2539).m18898a(this.f20151d.m13184a(null));
            FinskyLog.m21669e("More jobs than max expected! Max Expected: %d. Got: %d", Integer.valueOf(f20148a), Integer.valueOf(a.size()));
        }
        Set a2 = m18763a(i);
        int i2 = 8999;
        for (C4023a c4023a : a) {
            int i3 = i2 + 1;
            Object obj = null;
            if (i3 > 9020 || i3 < 9000) {
                i3 = 9000;
                obj = 1;
            }
            while (a2.contains(Integer.valueOf(i3))) {
                i3++;
                if (i3 > 9020) {
                    if (obj != null) {
                        FinskyLog.m21669e("Cannot find an unused id", new Object[0]);
                        i3 = 9021;
                        break;
                    }
                    i3 = 9000;
                    obj = 1;
                }
            }
            a2.add(Integer.valueOf(i3));
            FinskyLog.m21659a("Scheduling job with id: %d", Integer.valueOf(i3));
            long j = c4023a.f20246a.f20154b;
            long j2 = c4023a.f20246a.f20155c;
            long longValue = ((Long) C0954a.bl.m5760a()).longValue();
            if (longValue != -1 && C4678i.m21813b() + j < longValue + ((Long) C0955b.iW.m28964b()).longValue()) {
                j = ((Long) C0955b.iW.m28964b()).longValue();
                if (j > j2) {
                    j2 = j;
                    this.f20150c.schedule(new Builder(i3, new ComponentName(this.f20149b, PhoneskyJobSchedulerJobService.class)).setRequiresCharging(c4023a.f20246a.f20157e).setRequiresDeviceIdle(c4023a.f20246a.f20158f).setRequiredNetworkType(c4023a.f20246a.f20156d).setExtras(new PersistableBundle()).setMinimumLatency(j2).setOverrideDeadline(j).build());
                    i2 = i3;
                }
            }
            long j3 = j2;
            j2 = j;
            j = j3;
            this.f20150c.schedule(new Builder(i3, new ComponentName(this.f20149b, PhoneskyJobSchedulerJobService.class)).setRequiresCharging(c4023a.f20246a.f20157e).setRequiresDeviceIdle(c4023a.f20246a.f20158f).setRequiredNetworkType(c4023a.f20246a.f20156d).setExtras(new PersistableBundle()).setMinimumLatency(j2).setOverrideDeadline(j).build());
            i2 = i3;
        }
    }

    public final void mo3885a() {
        m18763a(-1);
        JobInfo build = new Builder(9000, new ComponentName(this.f20149b, PhoneskyJobSchedulerJobService.class)).setExtras(new PersistableBundle()).setMinimumLatency(0).setOverrideDeadline(0).build();
        FinskyLog.m21659a("Scheduling immediate wakeup job with id: %d", Integer.valueOf(9000));
        this.f20150c.schedule(build);
    }

    private final Set m18763a(int i) {
        Set hashSet = new HashSet();
        hashSet.add(Integer.valueOf(i));
        List<JobInfo> allPendingJobs = this.f20150c.getAllPendingJobs();
        if (allPendingJobs == null) {
            return hashSet;
        }
        for (JobInfo jobInfo : allPendingJobs) {
            if (jobInfo.getId() == i) {
                hashSet.add(Integer.valueOf(jobInfo.getId()));
            } else {
                if (jobInfo.getId() >= 9000 && jobInfo.getId() <= 9020) {
                    hashSet.add(Integer.valueOf(jobInfo.getId()));
                    FinskyLog.m21659a("Cancelling existing job with id: %d", Integer.valueOf(jobInfo.getId()));
                    this.f20150c.cancel(jobInfo.getId());
                }
                if (jobInfo.getId() == 9021) {
                    hashSet.add(Integer.valueOf(jobInfo.getId()));
                    FinskyLog.m21659a("Cancelling existing overflow job with id: %d", Integer.valueOf(jobInfo.getId()));
                    this.f20150c.cancel(jobInfo.getId());
                }
            }
        }
        return hashSet;
    }
}
