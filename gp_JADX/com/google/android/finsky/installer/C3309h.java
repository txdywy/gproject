package com.google.android.finsky.installer;

import android.os.Parcel;
import com.google.android.p008a.C0022b;

public abstract class C3309h extends C0022b implements C3308g {
    public C3309h() {
        attachInterface(this, "com.google.android.finsky.installer.IMultiUserCoordinatorServiceListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo3463a(parcel.readString());
                return true;
            case 2:
                mo3464b(parcel.readString());
                return true;
            default:
                return false;
        }
    }
}
