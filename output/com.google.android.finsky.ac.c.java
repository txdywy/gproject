package com.google.android.finsky.ac;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.l.c;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.scheduler.a.a.b;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.a;
import com.google.android.finsky.scheduler.b.b;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.scheduler.b.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

protected final class com.google.android.finsky.ac.c extends com.google.android.finsky.scheduler.ah implements com.google.android.finsky.l.i
{

    public com.google.android.finsky.l.c a;
    public com.google.android.finsky.scheduler.b.d v_;

    c() {
        com.google.android.finsky.scheduler.ah();
        ((com.google.android.finsky.ac.b)com.google.android.finsky.providers.d.a(com.google.android.finsky.ac.b)).a(this);
    }

    public final void a(boolean p0) {
        if (p0 != 0) {
            FinskyLog.a("Installation state replication succeeded.", new Object[0]);
            this.b(0);
        }
        else {
            FinskyLog.a("Installation state replication failed.", new Object[0]);
            v1 = this.v_.c();
            if (v1 >= ((Integer)com.google.android.finsky.aa.b.jN.b()).intValue()) {
                v2 = new Object[1];
                v2[0] = Integer.valueOf(v1);
                FinskyLog.a("Giving up after %d failures.", v2);
                this.b(0);
            }
            else {
                v2 = new Object[1];
                v2[0] = Integer.valueOf(v1);
                FinskyLog.a("Scheduling replication attempt %d.", v2);
                v0 = ((Long)com.google.android.finsky.aa.b.jM.b()).longValue();
                v3 = this.v_.c();
                v4 = this.v_.a();
                if (v3 > 0)
                    v2 = v0 * (long)(v3 + 1);
                else
                    v2 = v0;
                v2 = Math.min(v2, ((Long)com.google.android.finsky.aa.b.iZ.b()).longValue());
                v0 = v4.a.c;
                if (v0 >= v2)
                    v0 = v2;
                this.b(new com.google.android.finsky.scheduler.b.h(1, v4.a().a(v0).a(), this.v_.d()));
            }
        }
    }

    protected final boolean a(com.google.android.finsky.scheduler.b.d p0) {
        FinskyLog.a("ContentSyncJob started", new Object[0]);
        this.v_ = p0;
        this.a.a(new com.google.android.finsky.ac.d(this));
        return 1;
    }

    protected final boolean k_(int p0) {
        FinskyLog.a("ContentSyncJob stopped", new Object[0]);
        return 0;
    }

}
