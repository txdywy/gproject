package com.google.android.finsky.activities;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.finsky.activities.MultiInstallActivity.InstallDetails;

final class ez implements Creator {
    ez() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstallDetails[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new InstallDetails(parcel);
    }
}
