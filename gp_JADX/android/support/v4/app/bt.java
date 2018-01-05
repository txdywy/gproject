package android.support.v4.app;

import android.app.job.JobWorkItem;
import android.content.Intent;

final class bt implements br {
    public final JobWorkItem f1438a;
    public final /* synthetic */ bs f1439b;

    bt(bs bsVar, JobWorkItem jobWorkItem) {
        this.f1439b = bsVar;
        this.f1438a = jobWorkItem;
    }

    public final Intent mo307a() {
        return this.f1438a.getIntent();
    }

    public final void mo308b() {
        synchronized (this.f1439b.f1436b) {
            if (this.f1439b.f1437c != null) {
                this.f1439b.f1437c.completeWork(this.f1438a);
            }
        }
    }
}
