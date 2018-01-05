package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.firebase.jobdispatcher.o extends com.google.android.a.b implements com.firebase.jobdispatcher.n
{

    o() {
        com.google.android.a.b();
        this.attachInterface(this, "com.firebase.jobdispatcher.IJobCallback");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        if (this.routeToSuperOrEnforceInterface(p0, p1, p2, p3))
            v0 = 1;
        else if (p0 == 1) {
            this.a((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR), p1.readInt());
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

}
