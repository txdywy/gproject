package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;

public abstract class tu extends nh implements tt {
    public tu() {
        attachInterface(this, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo4464a((Bundle) ni.m25192a(parcel, Bundle.CREATOR));
        return true;
    }
}
