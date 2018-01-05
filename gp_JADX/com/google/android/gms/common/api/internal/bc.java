package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class bc extends nh implements bb {
    public bc() {
        attachInterface(this, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo4689a((Status) ni.m25192a(parcel, Status.CREATOR));
        return true;
    }
}
