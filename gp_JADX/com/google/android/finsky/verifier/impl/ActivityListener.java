package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ActivityListener extends Binder implements Parcelable {
    public static final Creator CREATOR = new C4737a();

    public void mo4337a(Activity activity) {
    }

    public void mo4338b(Activity activity) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this);
    }
}
