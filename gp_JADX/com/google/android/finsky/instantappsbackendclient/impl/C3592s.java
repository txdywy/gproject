package com.google.android.finsky.instantappsbackendclient.impl;

import android.app.job.JobParameters;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C3592s implements Runnable {
    public final UpdateContentFilterJob f17897a;
    public final JobParameters f17898b;

    C3592s(UpdateContentFilterJob updateContentFilterJob, JobParameters jobParameters) {
        this.f17897a = updateContentFilterJob;
        this.f17898b = jobParameters;
    }

    public final void run() {
        UpdateContentFilterJob updateContentFilterJob = this.f17897a;
        JobParameters jobParameters = this.f17898b;
        updateContentFilterJob.f17847a.m17149c();
        FinskyLog.m21662b("AIA content filter cache forceUpdate complete, level: %s, authority: %s", Integer.valueOf(updateContentFilterJob.f17847a.m17147a()), Integer.valueOf(updateContentFilterJob.f17847a.m17148b()));
        updateContentFilterJob.jobFinished(jobParameters, false);
    }
}
