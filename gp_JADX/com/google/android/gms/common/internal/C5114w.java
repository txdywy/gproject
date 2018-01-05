package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class C5114w extends nh implements C5113v {
    public C5114w() {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4615a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) ni.m25192a(parcel, Bundle.CREATOR));
                break;
            case 2:
                parcel.readInt();
                ni.m25192a(parcel, Bundle.CREATOR);
                mo4614a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
