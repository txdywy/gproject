package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.C5147b;

public final class ji extends hz {
    public final AlarmManager f27055a = ((AlarmManager) mo4736j().getSystemService("alarm"));
    public final gm f27056b;
    public Integer f27057c;

    protected ji(hv hvVar) {
        super(hvVar);
        this.f27056b = new jj(this, hvVar);
    }

    @TargetApi(24)
    private final void m24886z() {
        JobScheduler jobScheduler = (JobScheduler) mo4736j().getSystemService("jobscheduler");
        mo4742p().f26851j.m24653a("Cancelling job. JobID", Integer.valueOf(m24906t()));
        jobScheduler.cancel(m24906t());
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
        this.f27055a.cancel(m24908v());
        if (VERSION.SDK_INT >= 24) {
            m24886z();
        }
    }

    final int m24906t() {
        if (this.f27057c == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo4736j().getPackageName());
            this.f27057c = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f27057c.intValue();
    }

    public final void m24907u() {
        m24432x();
        this.f27055a.cancel(m24908v());
        this.f27056b.m24504c();
        if (VERSION.SDK_INT >= 24) {
            m24886z();
        }
    }

    final PendingIntent m24908v() {
        Intent intent = new Intent();
        Context j = mo4736j();
        gj.m24442H();
        intent = intent.setClassName(j, "com.google.android.gms.measurement.AppMeasurementReceiver");
        intent.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(mo4736j(), 0, intent, 0);
    }
}
