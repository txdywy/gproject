package com.google.android.finsky.instantapps.metrics;

import android.app.job.JobParameters;

final /* synthetic */ class C3535h implements Runnable {
    public final LogFlushJob f17797a;
    public final JobParameters f17798b;

    C3535h(LogFlushJob logFlushJob, JobParameters jobParameters) {
        this.f17797a = logFlushJob;
        this.f17798b = jobParameters;
    }

    public final void run() {
        this.f17797a.jobFinished(this.f17798b, false);
    }
}
