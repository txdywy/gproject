package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.support.v4.h.u;
import android.util.Log;

public final class com.firebase.jobdispatcher.e extends com.firebase.jobdispatcher.o
{

    public final com.firebase.jobdispatcher.d a;

    e(com.firebase.jobdispatcher.d p0) {
        this.a = p0;
        com.firebase.jobdispatcher.o();
    }

    public final void a(Bundle p0, int p1) {
        v0 = GooglePlayReceiver.a.a(p0);
        if (v0 == 0)
            Log.wtf("FJD.ExternalReceiver", "jobFinished: unknown invocation provided");
        else {
            v2 = v0.a();
            enter com.firebase.jobdispatcher.d.a;
            try {
                v0 = com.firebase.jobdispatcher.d.a.get(v2.b);
                if ((com.firebase.jobdispatcher.af)v0 != 0) {
                    ((com.firebase.jobdispatcher.af)v0).a(v2);
                    if (((com.firebase.jobdispatcher.af)v0).a())
                        com.firebase.jobdispatcher.d.a.remove(v2.b);
                }
                exit com.firebase.jobdispatcher.d.a;
            }
            catch (Throwable ex) {
                try {
                    exit com.firebase.jobdispatcher.d.a;
                }
                catch (Throwable ex) {
                    exit com.firebase.jobdispatcher.d.a;
                    throw ex;
                }
                throw ex;
            }
            this.a.d.a(v2, p1);
        }
    }

}
