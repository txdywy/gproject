package com.google.android.play.p122c.p123a.p124a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C1234b extends C0022b implements C1233a {
    public C1234b() {
        attachInterface(this, "com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        IBinder readStrongBinder;
        C6278d c6278d;
        switch (i) {
            case 1:
                parcel.readString();
                parcel.createTypedArrayList(Bundle.CREATOR);
                C0883c.m5513a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallServiceCallback") instanceof C6277c))) {
                    c6278d = new C6278d(readStrongBinder);
                }
                mo1534a();
                return true;
            case 2:
                parcel.readString();
                parcel.createTypedArrayList(Bundle.CREATOR);
                C0883c.m5513a(parcel, Bundle.CREATOR);
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.play.core.dependencyinstall.protocol.IDependencyInstallServiceCallback") instanceof C6277c))) {
                    c6278d = new C6278d(readStrongBinder);
                }
                mo1535b();
                return true;
            default:
                return false;
        }
    }
}
