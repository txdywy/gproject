package com.google.android.finsky.scheduler;

import android.app.job.JobParameters;

final class ax implements C4022q {
    public final /* synthetic */ JobParameters f20239a;
    public final /* synthetic */ ak f20240b;

    ax(ak akVar, JobParameters jobParameters) {
        this.f20240b = akVar;
        this.f20239a = jobParameters;
    }

    public final void mo3889a() {
        if (this.f20240b.f20200a == null) {
            this.f20240b.m18818c(this.f20239a.getJobId());
        }
    }
}
