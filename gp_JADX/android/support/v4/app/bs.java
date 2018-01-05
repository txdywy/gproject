package android.support.v4.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;

final class bs extends JobServiceEngine implements bo {
    public final bm f1435a;
    public final Object f1436b = new Object();
    public JobParameters f1437c;

    bs(bm bmVar) {
        super(bmVar);
        this.f1435a = bmVar;
    }

    public final IBinder mo309a() {
        return getBinder();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.f1437c = jobParameters;
        this.f1435a.m1349a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        bm bmVar = this.f1435a;
        if (bmVar.f1419c != null) {
            bmVar.f1419c.cancel(bmVar.f1420d);
        }
        synchronized (this.f1436b) {
            this.f1437c = null;
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.v4.app.br mo310b() {
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.f1436b;
        monitor-enter(r1);
        r2 = r3.f1437c;	 Catch:{ all -> 0x0026 }
        if (r2 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0009:
        return r0;
    L_0x000a:
        r2 = r3.f1437c;	 Catch:{ all -> 0x0026 }
        r2 = r2.dequeueWork();	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        if (r2 == 0) goto L_0x0009;
    L_0x0013:
        r0 = r2.getIntent();
        r1 = r3.f1435a;
        r1 = r1.getClassLoader();
        r0.setExtrasClassLoader(r1);
        r0 = new android.support.v4.app.bt;
        r0.<init>(r3, r2);
        goto L_0x0009;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.bs.b():android.support.v4.app.br");
    }
}
