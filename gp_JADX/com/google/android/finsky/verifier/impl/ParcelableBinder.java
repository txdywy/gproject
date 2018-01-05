package com.google.android.finsky.verifier.impl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableBinder implements Parcelable {
    public static final Creator CREATOR = new ai();
    public final IBinder f24328a;

    public ParcelableBinder(IBinder iBinder) {
        this.f24328a = iBinder;
    }

    public ParcelableBinder(IInterface iInterface) {
        this.f24328a = iInterface.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f24328a);
    }
}
