package com.firebase.jobdispatcher;

public final class com.firebase.jobdispatcher.ad implements Runnable
{

    public final boolean a;
    public final com.firebase.jobdispatcher.ae b;
    public final com.firebase.jobdispatcher.aa c;

    ad(com.firebase.jobdispatcher.aa p0, boolean p1, com.firebase.jobdispatcher.ae p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.a();
        if (this.a != 0)
            this.b.a(0);
    }

}
