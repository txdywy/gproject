package com.google.android.instantapps.common;

import android.app.job.JobParameters;

final /* synthetic */ class C5704b implements Runnable {
    public final C3375a f28865a;
    public final JobParameters f28866b;

    C5704b(C3375a c3375a, JobParameters jobParameters) {
        this.f28865a = c3375a;
        this.f28866b = jobParameters;
    }

    public final void run() {
        this.f28865a.mo3499a(this.f28866b);
    }
}
