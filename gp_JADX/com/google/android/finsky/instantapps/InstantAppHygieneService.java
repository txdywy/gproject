package com.google.android.finsky.instantapps;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport.CrashInfo;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.os.C0327a;
import android.util.Log;
import com.google.android.finsky.instantapps.appmanagement.C3380a;
import com.google.android.finsky.instantapps.appmanagement.C3383c;
import com.google.android.finsky.instantapps.appmanagement.C3389h;
import com.google.android.finsky.instantapps.appmanagement.C3392k;
import com.google.android.finsky.instantapps.appmanagement.C3400t;
import com.google.android.finsky.instantapps.metrics.C3530c;
import com.google.android.finsky.instantapps.metrics.C3532e;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.finsky.instantapps.p214b.C3405b;
import com.google.android.finsky.instantapps.p214b.C3407d;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import com.google.android.finsky.instantappsbackendclient.impl.C3574a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.instantapps.common.C3375a;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.p217e.bb;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.C5718h;
import com.google.android.instantapps.common.p221d.p222a.ad;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
public class InstantAppHygieneService extends C3375a {
    public ExecutorService f17310a;
    public C3532e f17311b;
    public C3383c f17312c;
    public C3407d f17313d;
    public C5710a f17314e;
    public C3574a f17315f;

    public int onStartCommand(Intent intent, int i, int i2) {
        m16862a((Context) this);
        return super.onStartCommand(intent, i, i2);
    }

    public static void m16860a(Context context, long j) {
        if (C0327a.m1722b()) {
            Class cls = InstantAppHygieneService.class;
            if (C3375a.m16857b()) {
                int i;
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                long max = Math.max(j, TimeUnit.MINUTES.toMillis(15));
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    if (jobInfo.getId() == 151530822) {
                        String valueOf;
                        long intervalMillis = jobInfo.getIntervalMillis();
                        ComponentName service = jobInfo.getService();
                        String className = service.getClassName();
                        if (className.startsWith(".")) {
                            String valueOf2 = String.valueOf(service.getPackageName());
                            valueOf = String.valueOf(className);
                            valueOf = valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
                        } else {
                            valueOf = className;
                        }
                        if (!valueOf.equals(cls.getCanonicalName())) {
                            C3375a.f17309g.m27207a("Pending job with different class %s", className);
                        } else if (intervalMillis == max) {
                            i = 0;
                            if (i == 0) {
                                C3375a.f17309g.m27207a("Scheduling job with period %dms", Long.valueOf(max));
                                try {
                                    if (jobScheduler.schedule(new Builder(151530822, new ComponentName(context, cls)).setPeriodic(max).setPersisted(true).setRequiredNetworkType(1).setRequiresDeviceIdle(true).build()) != 0) {
                                        C3375a.f17309g.m27211d("Failed to schedule", new Object[0]);
                                        return;
                                    }
                                    return;
                                } catch (Throwable e) {
                                    C3375a.f17309g.m27208a(e, "Could not schedule hygiene service", new Object[0]);
                                    return;
                                }
                            }
                            return;
                        } else {
                            C3375a.f17309g.m27207a("Pending job period %dms. Requested %dms", Long.valueOf(intervalMillis), Long.valueOf(max));
                        }
                        i = true;
                        if (i == 0) {
                            C3375a.f17309g.m27207a("Scheduling job with period %dms", Long.valueOf(max));
                            if (jobScheduler.schedule(new Builder(151530822, new ComponentName(context, cls)).setPeriodic(max).setPersisted(true).setRequiredNetworkType(1).setRequiresDeviceIdle(true).build()) != 0) {
                                C3375a.f17309g.m27211d("Failed to schedule", new Object[0]);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                i = true;
                if (i == 0) {
                    C3375a.f17309g.m27207a("Scheduling job with period %dms", Long.valueOf(max));
                    if (jobScheduler.schedule(new Builder(151530822, new ComponentName(context, cls)).setPeriodic(max).setPersisted(true).setRequiredNetworkType(1).setRequiresDeviceIdle(true).build()) != 0) {
                        C3375a.f17309g.m27211d("Failed to schedule", new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            }
            C3375a.f17309g.m27211d("Hygiene service should not be started on pre-L devices", new Object[0]);
        }
    }

    public static boolean m16862a(Context context) {
        if (!C3375a.m16857b() || !C0327a.m1722b()) {
            return false;
        }
        if (((JobScheduler) context.getSystemService("jobscheduler")).schedule(new Builder(151530821, new ComponentName(context, InstantAppHygieneService.class)).setOverrideDeadline(0).build()) == 0) {
            FinskyLog.m21667d("One off hygiene failed to schedule", new Object[0]);
            return false;
        }
        FinskyLog.m21659a("One off hygiene successfully scheduled", new Object[0]);
        return true;
    }

    public static void m16863b(Context context) {
        if (!C0327a.m1722b()) {
            return;
        }
        if (C3375a.m16857b()) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(151530822);
        } else {
            Log.e("AIA-HygieneService", "Daily hygiene was cancelled on an unsupported device");
        }
    }

    public void onCreate() {
        super.onCreate();
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3507a(this);
    }

    protected final void mo3499a(JobParameters jobParameters) {
        Log.i("AIA-HygieneService", "Started");
        this.f17314e.mo5136a(2101);
        C3532e c3532e = this.f17311b;
        m16861a(new C3530c((C5710a) C3532e.m17115a((C5710a) c3532e.f17792a.mo1a(), 1), (C5718h) C3532e.m17115a((C5718h) c3532e.f17793b.mo1a(), 2)), this.f17314e);
        C3383c c3383c = this.f17312c;
        m16861a(new C3380a((InstantAppsClient) C3383c.m16885a((InstantAppsClient) c3383c.f17359a.mo1a(), 1), (C5785k) C3383c.m16885a((C5785k) c3383c.f17360b.mo1a(), 2), (PackageManager) C3383c.m16885a((PackageManager) c3383c.f17361c.mo1a(), 3), (C3600b) C3383c.m16885a((C3600b) c3383c.f17362d.mo1a(), 4), (C3389h) C3383c.m16885a((C3389h) c3383c.f17363e.mo1a(), 5), (C3392k) C3383c.m16885a((C3392k) c3383c.f17364f.mo1a(), 6), (C3400t) C3383c.m16885a((C3400t) c3383c.f17365g.mo1a(), 7), (C5710a) C3383c.m16885a((C5710a) c3383c.f17366h.mo1a(), 8)), this.f17314e);
        C3407d c3407d = this.f17313d;
        m16861a(new C3405b((C5785k) C3407d.m16906a((C5785k) c3407d.f17427a.mo1a(), 1), (bb) C3407d.m16906a((bb) c3407d.f17428b.mo1a(), 2), (C5710a) C3407d.m16906a((C5710a) c3407d.f17429c.mo1a(), 3)), this.f17314e);
        this.f17315f.m17150d();
        Log.i("AIA-HygieneService", "Finished");
        this.f17314e.mo5136a(2102);
        jobFinished(jobParameters, false);
    }

    private static void m16861a(C3379a c3379a, C5710a c5710a) {
        try {
            c3379a.call();
        } catch (Throwable e) {
            ad adVar = new ad(2103);
            adVar.f28909b = new CrashInfo(e);
            c5710a.mo5139a(adVar.m26987a());
            Log.e("AIA-HygieneService", String.valueOf(c3379a.getClass().getSimpleName()).concat(" failed!"), e);
        }
    }

    protected final /* synthetic */ Executor mo3498a() {
        return this.f17310a;
    }
}
