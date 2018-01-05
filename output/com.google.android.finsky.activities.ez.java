package com.google.android.finsky.activities;

import android.os.Parcel;

public final class com.google.android.finsky.activities.ez implements Parcelable$Creator
{

    ez() {
    }

    public final Object createFromParcel(Parcel p0) {
        return new MultiInstallActivity$InstallDetails(p0);
    }

    public final Object[] newArray(int p0) {
        return new MultiInstallActivity$InstallDetails[p0];
    }

}
