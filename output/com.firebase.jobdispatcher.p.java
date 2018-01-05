package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.a;
import com.google.android.a.c;

public final class com.firebase.jobdispatcher.p extends com.google.android.a.a implements com.firebase.jobdispatcher.n
{

    p(IBinder p0) {
        com.google.android.a.a(p0, "com.firebase.jobdispatcher.IJobCallback");
    }

    public final void a(Bundle p0, int p1) {
        v0 = this.obtainAndWriteInterfaceToken();
        com.google.android.a.c.a(v0, p0);
        v0.writeInt(p1);
        this.transactOneway(1, v0);
    }

}
