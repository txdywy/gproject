package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.a.a;
import com.google.android.a.c;

public final class com.firebase.jobdispatcher.s extends com.google.android.a.a implements com.firebase.jobdispatcher.q
{

    s(IBinder p0) {
        com.google.android.a.a(p0, "com.firebase.jobdispatcher.IRemoteJobService");
    }

    public final void a(Bundle p0, com.firebase.jobdispatcher.n p1) {
        v0 = this.obtainAndWriteInterfaceToken();
        com.google.android.a.c.a(v0, p0);
        com.google.android.a.c.a(v0, p1);
        this.transactOneway(1, v0);
    }

    public final void a(Bundle p0, boolean p1) {
        v0 = this.obtainAndWriteInterfaceToken();
        com.google.android.a.c.a(v0, p0);
        com.google.android.a.c.a(v0, p1);
        this.transactOneway(2, v0);
    }

}
