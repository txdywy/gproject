package com.google.android.finsky.scheduler;

import android.app.job.JobParameters;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.JobSchedulerEngine.PhoneskyJobSchedulerJobService;

final class aw implements C4021p {
    public final /* synthetic */ C2495w f20235a;
    public final /* synthetic */ JobParameters f20236b;
    public final /* synthetic */ PhoneskyJobSchedulerJobService f20237c;
    public final /* synthetic */ ak f20238d;

    aw(ak akVar, C2495w c2495w, JobParameters jobParameters, PhoneskyJobSchedulerJobService phoneskyJobSchedulerJobService) {
        this.f20238d = akVar;
        this.f20235a = c2495w;
        this.f20236b = jobParameters;
        this.f20237c = phoneskyJobSchedulerJobService;
    }

    public final void mo3888a() {
        this.f20238d.f20200a = null;
        this.f20238d.f20209j.m18907a(2522).m18893a(3, 4).m18900b(this.f20235a);
        this.f20238d.m18818c(this.f20236b.getJobId());
        this.f20237c.jobFinished(this.f20236b, false);
    }
}
