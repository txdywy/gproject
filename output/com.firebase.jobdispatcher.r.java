package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.firebase.jobdispatcher.r extends com.google.android.a.b implements com.firebase.jobdispatcher.q
{

    r() {
        com.google.android.a.b();
        this.attachInterface(this, "com.firebase.jobdispatcher.IRemoteJobService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 53;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 22:    v3 = p1.readStrongBinder();
 26:    if (v3 == 0)
 28:        v1 = 0;
        else {
 36:        v1 = v3.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
 42:        if (v1 instanceof com.firebase.jobdispatcher.n)
 44:            v1 = (com.firebase.jobdispatcher.n)v1;
            else
 49:            v1 = new com.firebase.jobdispatcher.p(v3);
        }
 29:    this.a((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR), v1);
 32:    v0 = 1;
 33:    goto 8;
 65:    this.a((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR), com.google.android.a.c.a(p1));
 68:    goto 32;
    }

}
