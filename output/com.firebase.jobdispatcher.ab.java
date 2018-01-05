package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.h.u;
import android.util.Log;
import java.util.Locale;

public final class com.firebase.jobdispatcher.ab extends com.firebase.jobdispatcher.r
{

    public final com.firebase.jobdispatcher.aa a;

    ab(com.firebase.jobdispatcher.aa p0) {
        this.a = p0;
        com.firebase.jobdispatcher.r();
    }

    public final void a(Bundle p0, com.firebase.jobdispatcher.n p1) {
        v0 = GooglePlayReceiver.a.a(p0);
        if (v0 == 0) {
            Log.wtf("FJD.JobService", "start: unknown invocation provided");
            return;
        }
        v0 = v0.a();
        enter this.a.b;
        try {
            if (this.a.b.containsKey(v0.e())) {
                v5 = new Object[1];
                v5[0] = v0.e();
                Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", v5));
                exit this.a.b;
            }
            else {
                try {
                    this.a.b.put(v0.e(), new com.firebase.jobdispatcher.ae(v0, p1));
                    com.firebase.jobdispatcher.aa.a.post(new com.firebase.jobdispatcher.ac(this.a, v0));
                    exit this.a.b;
                }
                catch (Throwable ex) {
                    exit this.a.b;
                    throw ex;
                }
            }
            return;
            exit this.a.b;
        }
        catch (Throwable ex) {
            exit this.a.b;
            throw ex;
        }
    }

    public final void a(Bundle p0, boolean p1) {
        v0 = GooglePlayReceiver.a.a(p0);
        if (v0 == 0) {
            Log.wtf("FJD.JobService", "stop: unknown invocation provided");
            return;
        }
        enter this.a.b;
        try {
            v0 = (com.firebase.jobdispatcher.ae)this.a.b.remove(v0.a().e());
            if (v0 == 0) {
                if (Log.isLoggable("FJD.JobService", 3))
                    Log.d("FJD.JobService", "Provided job has already been executed.");
                exit this.a.b;
            }
            else {
                try {
                    com.firebase.jobdispatcher.aa.a.post(new com.firebase.jobdispatcher.ad(this.a, p1, v0));
                    exit this.a.b;
                }
                catch (Throwable ex) {
                    exit this.a.b;
                    throw ex;
                }
            }
            return;
            exit this.a.b;
        }
        catch (Throwable ex) {
            exit this.a.b;
            throw ex;
        }
    }

}
