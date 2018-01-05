package com.google.android.finsky.updatechecker.impl;

import android.annotation.TargetApi;
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
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.aa;

@TargetApi(21)
public final class ReschedulerUsingJobScheduler implements C4638a {
    public final Context f23861a;
    public final C1627b f23862b;
    public final C1552e f23863c;
    public final ai f23864d;
    public final C4661t f23865e;
    public final C3960a f23866f;

    public class CheckPreconditionsAndAutoUpdateJobService extends JobService implements C2239c {
        public C2471a f23856a;
        public C4661t f23857b;
        public ai f23858c;
        public C1461c f23859d;
        public JobParameters f23860e;

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

        public boolean onStartJob(JobParameters jobParameters) {
            int i;
            boolean z;
            boolean z2;
            C2495w a;
            int i2;
            boolean z3;
            int i3;
            ((C1448f) C3947d.m18649a(C1448f.class)).mo1968a(this);
            this.f23860e = jobParameters;
            PersistableBundle extras = this.f23860e.getExtras();
            if (extras == null) {
                i = 0;
                z = false;
                z2 = false;
                a = this.f23856a.m13184a(null);
                i2 = 100;
                z3 = false;
                i3 = -1;
            } else {
                C2495w a2;
                int i4 = extras.getInt("Finksy.AutoUpdateRescheduleReason", 0);
                boolean parseBoolean = Boolean.parseBoolean(extras.getString("Finsky.AutoUpdateLogConditionsMet"));
                boolean parseBoolean2 = Boolean.parseBoolean(extras.getString("Finsky.AutoUpdateRequirePower"));
                C1463g c1463g = this.f23856a.f13311a;
                if (extras == null) {
                    FinskyLog.m21665c("Null bundle, which breaks event chain!. Creating a new logging context.", new Object[0]);
                    a2 = C2495w.m13363a(null, c1463g);
                } else if (extras.containsKey("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID")) {
                    a2 = new C2495w(extras.getLong("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID", -1), extras.getString("com.google.android.finsky.analytics.LoggingContext.KEY_REASON"), Boolean.parseBoolean(extras.getString("com.google.android.finsky.analytics.LoggingContext.KEY_USE_DEFAULT_LOGGER")), extras.getString("com.google.android.finsky.analytics.LoggingContext.KEY_ACCOUNT"), c1463g);
                } else {
                    FinskyLog.m21665c("No LoggingContext in the bundle, which breaks event chain!. Creating a new logging context.", new Object[0]);
                    a2 = C2495w.m13363a(null, c1463g);
                }
                i2 = extras.getInt("Finsky.AutoUpdateBatteryLevelThreshold", 100);
                z3 = Boolean.parseBoolean(extras.getString("Finsky.AutoUpdateRequireDeviceIdle"));
                i3 = extras.getInt("Finsky.AutoUpdateRequiredNetworkType", -1);
                z2 = parseBoolean2;
                z = parseBoolean;
                a = a2;
                i = i4;
            }
            boolean isOverrideDeadlineExpired = this.f23860e.isOverrideDeadlineExpired();
            if (!isOverrideDeadlineExpired || (i & 1) == 0) {
                FinskyLog.m21659a("JobScheduler invoked, loading libraries.", new Object[0]);
                this.f23857b.m21648a(new C4650i(this, isOverrideDeadlineExpired, i, a, z2, i2, z, z3, i3));
                return true;
            }
            FinskyLog.m21659a("Timed out waiting for job to be scheduled.", new Object[0]);
            jobFinished(this.f23860e, true);
            return false;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            this.f23860e = null;
            return false;
        }

        public final void mo2827a(boolean z) {
            String str;
            if (this.f23860e != null) {
                jobFinished(this.f23860e, false);
            }
            if (z) {
                str = "auto-updates finished successfully.";
            } else {
                str = "finished w/error. waiting for next daily hygiene.";
            }
            FinskyLog.m21659a(str, new Object[0]);
        }
    }

    public ReschedulerUsingJobScheduler(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, C1552e c1552e, ai aiVar, C1502a c1502a, C3960a c3960a) {
        this.f23866f = c3960a;
        this.f23865e = new C4661t(context, c2266a, c2206c, c3646a, c1627b, c4640d, c1502a, this.f23866f);
        this.f23861a = context;
        this.f23862b = c1627b;
        this.f23863c = c1552e;
        this.f23864d = aiVar;
    }

    public final boolean mo4312a() {
        return false;
    }

    public final void mo4311a(C2495w c2495w) {
        int i;
        ((JobScheduler) this.f23861a.getSystemService("jobscheduler")).cancel(821848294);
        Builder builder = new Builder(821848294, new ComponentName(this.f23861a, CheckPreconditionsAndAutoUpdateJobService.class));
        if (this.f23862b.m9312b()) {
            i = 2;
        } else {
            i = 1;
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        if ((i & 2) != 0) {
            long longValue = ((Long) C0955b.dq.m28964b()).longValue();
            builder.setMinimumLatency(longValue).setRequiredNetworkType(1).setBackoffCriteria(longValue, 1).setOverrideDeadline(((Long) C0955b.dr.m28964b()).longValue());
            persistableBundle.putInt("Finsky.AutoUpdateRequiredNetworkType", 1);
            C4661t c4661t = this.f23865e;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(true);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        } else {
            int i2;
            Object obj;
            int b;
            int i3;
            boolean z;
            boolean z2;
            C4661t c4661t2;
            aa aaVar2;
            long longValue2 = ((Long) C0955b.dt.m28964b()).longValue();
            long longValue3 = ((Long) C0955b.ds.m28964b()).longValue();
            if (this.f23866f.m18669b()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            builder.setMinimumLatency(longValue2).setRequiredNetworkType(i2).setOverrideDeadline(longValue3);
            if (this.f23863c.mo2294a(12616694)) {
                Object obj2;
                if (!C1503a.m8831b(this.f23861a)) {
                    longValue2 = ((Long) C0954a.f5840j.m5760a()).longValue();
                    if (longValue2 == 0) {
                        C0954a.f5840j.m5763a(Long.valueOf(System.currentTimeMillis()));
                    } else if (System.currentTimeMillis() - longValue2 >= ((Long) C0955b.hb.m28964b()).longValue()) {
                        obj2 = 1;
                        if (obj2 != null) {
                            obj = 1;
                            if (obj != null) {
                                b = this.f23864d.m21697b();
                            } else {
                                b = -1;
                            }
                            if (!this.f23863c.mo2294a(12618334)) {
                                i3 = 90;
                            } else if (!this.f23863c.mo2294a(12618335)) {
                                i3 = 80;
                            } else if (!this.f23863c.mo2294a(12618336)) {
                                i3 = 70;
                            } else if (!this.f23863c.mo2294a(12618337)) {
                                i3 = 60;
                            } else if (this.f23863c.mo2294a(12618338)) {
                                i3 = 50;
                            } else {
                                i3 = 100;
                            }
                            z = (obj == null && m21602a(b, i3)) ? false : true;
                            builder.setRequiresCharging(z);
                            z2 = this.f23863c.mo2294a(12605750) || (!z && this.f23863c.mo2294a(12619116));
                            builder.setRequiresDeviceIdle(z2);
                            c4661t2 = this.f23865e;
                            aaVar2 = new aa();
                            aaVar2.a |= 32768;
                            aaVar2.q = true;
                            aaVar2.b(c4661t2.m21649a());
                            aaVar2.c(c4661t2.m21650b());
                            aaVar2.a(false);
                            c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
                            persistableBundle.putString("Finsky.AutoUpdateRequirePower", String.valueOf(z));
                            persistableBundle.putInt("Finsky.AutoUpdateBatteryLevelThreshold", i3);
                            persistableBundle.putInt("Finsky.AutoUpdateRequiredNetworkType", i2);
                            persistableBundle.putString("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
                        }
                    }
                }
                obj2 = null;
                if (obj2 != null) {
                    obj = 1;
                    if (obj != null) {
                        b = -1;
                    } else {
                        b = this.f23864d.m21697b();
                    }
                    if (!this.f23863c.mo2294a(12618334)) {
                        i3 = 90;
                    } else if (!this.f23863c.mo2294a(12618335)) {
                        i3 = 80;
                    } else if (!this.f23863c.mo2294a(12618336)) {
                        i3 = 70;
                    } else if (!this.f23863c.mo2294a(12618337)) {
                        i3 = 60;
                    } else if (this.f23863c.mo2294a(12618338)) {
                        i3 = 100;
                    } else {
                        i3 = 50;
                    }
                    if (obj == null) {
                    }
                    builder.setRequiresCharging(z);
                    if (!this.f23863c.mo2294a(12605750)) {
                    }
                    builder.setRequiresDeviceIdle(z2);
                    c4661t2 = this.f23865e;
                    aaVar2 = new aa();
                    aaVar2.a |= 32768;
                    aaVar2.q = true;
                    aaVar2.b(c4661t2.m21649a());
                    aaVar2.c(c4661t2.m21650b());
                    aaVar2.a(false);
                    c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
                    persistableBundle.putString("Finsky.AutoUpdateRequirePower", String.valueOf(z));
                    persistableBundle.putInt("Finsky.AutoUpdateBatteryLevelThreshold", i3);
                    persistableBundle.putInt("Finsky.AutoUpdateRequiredNetworkType", i2);
                    persistableBundle.putString("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
                }
            }
            obj = null;
            if (obj != null) {
                b = this.f23864d.m21697b();
            } else {
                b = -1;
            }
            if (!this.f23863c.mo2294a(12618334)) {
                i3 = 90;
            } else if (!this.f23863c.mo2294a(12618335)) {
                i3 = 80;
            } else if (!this.f23863c.mo2294a(12618336)) {
                i3 = 70;
            } else if (!this.f23863c.mo2294a(12618337)) {
                i3 = 60;
            } else if (this.f23863c.mo2294a(12618338)) {
                i3 = 50;
            } else {
                i3 = 100;
            }
            if (obj == null) {
            }
            builder.setRequiresCharging(z);
            if (this.f23863c.mo2294a(12605750)) {
            }
            builder.setRequiresDeviceIdle(z2);
            c4661t2 = this.f23865e;
            aaVar2 = new aa();
            aaVar2.a |= 32768;
            aaVar2.q = true;
            aaVar2.b(c4661t2.m21649a());
            aaVar2.c(c4661t2.m21650b());
            aaVar2.a(false);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar2).m13244b("wifi_checker").m13217a(c4661t2.f23996g.m8828a()));
            persistableBundle.putString("Finsky.AutoUpdateRequirePower", String.valueOf(z));
            persistableBundle.putInt("Finsky.AutoUpdateBatteryLevelThreshold", i3);
            persistableBundle.putInt("Finsky.AutoUpdateRequiredNetworkType", i2);
            persistableBundle.putString("Finsky.AutoUpdateRequireDeviceIdle", String.valueOf(z2));
        }
        persistableBundle.putInt("Finksy.AutoUpdateRescheduleReason", i);
        persistableBundle.putLong("com.google.android.finsky.analytics.LoggingContext.KEY_LAST_EVENT_ID", c2495w.f13431a);
        persistableBundle.putString("com.google.android.finsky.analytics.LoggingContext.KEY_REASON", c2495w.f13432b);
        persistableBundle.putString("com.google.android.finsky.analytics.LoggingContext.KEY_USE_DEFAULT_LOGGER", Boolean.TRUE.toString());
        builder.setExtras(persistableBundle);
        FinskyLog.m21659a("Scheduling auto-update check using JobScheduler.", new Object[0]);
        ((JobScheduler) this.f23861a.getSystemService("jobscheduler")).schedule(builder.build());
    }

    static boolean m21602a(int i, int i2) {
        return i >= i2;
    }
}
