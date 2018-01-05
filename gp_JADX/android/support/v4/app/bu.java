package android.support.v4.app;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

final class bu extends bv {
    public final JobInfo f1440a;
    public final JobScheduler f1441b;

    bu(Context context, ComponentName componentName, int i) {
        super(componentName);
        m1354a(i);
        this.f1440a = new Builder(i, this.f).setOverrideDeadline(0).build();
        this.f1441b = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    final void mo304a(Intent intent) {
        this.f1441b.enqueue(this.f1440a, new JobWorkItem(intent));
    }
}
