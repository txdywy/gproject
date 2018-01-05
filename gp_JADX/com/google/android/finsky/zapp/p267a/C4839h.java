package com.google.android.finsky.zapp.p267a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C4839h extends C0022b implements C4838g {
    public C4839h() {
        attachInterface(this, "com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        mo4412a(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR), (Bundle) C0883c.m5513a(parcel, Bundle.CREATOR));
        return true;
    }
}
