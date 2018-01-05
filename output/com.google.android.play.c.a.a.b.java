package com.google.android.play.c.a.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.google.android.play.c.a.a.b extends com.google.android.a.b implements com.google.android.play.c.a.a.a
{

    b() {
        com.google.android.a.b();
        this.attachInterface(this, "com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        v0 = 1;
        if (this.routeToSuperOrEnforceInterface(p0, p1, p2, p3))
            return v0;
        switch (p0) {
            case 1:
                p1.readString();
                p1.createTypedArrayList(Bundle.CREATOR);
                com.google.android.a.c.a(p1, Bundle.CREATOR);
                v1 = p1.readStrongBinder();
                if (v1 != 0) {
                    if (!(v1.queryLocalInterface("com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallServiceCallback") instanceof com.google.android.play.c.a.a.c))
                        new com.google.android.play.c.a.a.d(v1);
                }
                this.a();
                break;
            case 2:
                p1.readString();
                p1.createTypedArrayList(Bundle.CREATOR);
                com.google.android.a.c.a(p1, Bundle.CREATOR);
                v1 = p1.readStrongBinder();
                if (v1 != 0) {
                    if (!(v1.queryLocalInterface("com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallServiceCallback") instanceof com.google.android.play.c.a.a.c))
                        new com.google.android.play.c.a.a.d(v1);
                }
                this.b();
                break;
            default:
                v0 = 0;
                break;
        }
    }

}
