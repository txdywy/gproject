package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0739o extends C0022b implements C0738n {
    public C0739o() {
        attachInterface(this, "com.firebase.jobdispatcher.IJobCallback");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo1112a((Bundle) C0883c.m5513a(parcel, Bundle.CREATOR), parcel.readInt());
        return true;
    }
}
