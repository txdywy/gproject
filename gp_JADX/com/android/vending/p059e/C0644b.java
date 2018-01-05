package com.android.vending.p059e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.p008a.C0022b;
import com.google.android.p008a.C0883c;

public abstract class C0644b extends C0022b implements C0643a {
    public C0644b() {
        attachInterface(this, "com.android.vending.reviews.IReviewsService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (routeToSuperOrEnforceInterface(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable a = mo3907a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        C0883c.m5518b(parcel2, a);
        return true;
    }
}
