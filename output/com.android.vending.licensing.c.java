package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.b;

public class com.android.vending.licensing.c extends com.google.android.a.b implements ILicensingService
{

    c() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.licensing.ILicensingService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        if (this.routeToSuperOrEnforceInterface(p0, p1, p2, p3))
            v0 = 1;
        else if (p0 == 1) {
            v5 = p1.readStrongBinder();
            if (v5 == 0)
                v0 = 0;
            else {
                v0 = v5.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
                if (v0 instanceof com.android.vending.licensing.a)
                    v0 = (com.android.vending.licensing.a)v0;
                else
                    v0 = new com.android.vending.licensing.b(v5);
            }
            this.a(p1.readLong(), p1.readString(), v0);
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

}
