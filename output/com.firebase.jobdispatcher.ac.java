package com.firebase.jobdispatcher;

import android.support.v4.h.u;

public final class com.firebase.jobdispatcher.ac implements Runnable
{

    public final com.firebase.jobdispatcher.z a;
    public final com.firebase.jobdispatcher.aa b;

    ac(com.firebase.jobdispatcher.aa p0, com.firebase.jobdispatcher.z p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        enter this.b.b;
        try {
            if (!this.b.a(this.a)) {
                v0 = (com.firebase.jobdispatcher.ae)this.b.b.remove(this.a.e());
                if (v0 != 0)
                    v0.a(0);
            }
            exit this.b.b;
            return;
            exit this.b.b;
        }
        catch (Throwable ex) {
            exit this.b.b;
            throw ex;
        }
    }

}
