package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public abstract class fe extends nh implements fd {
    public fe() {
        attachInterface(this, "com.google.android.gms.herrevad.internal.IActiveNetworkQualityCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        mo4719a((Status) ni.m25192a(parcel, Status.CREATOR), (PredictedNetworkQuality) ni.m25192a(parcel, PredictedNetworkQuality.CREATOR));
        return true;
    }
}
