package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.gms.internal.nh;

public abstract class C5010z extends nh implements C5009y {
    public C5010z() {
        attachInterface(this, "com.google.android.gms.car.ICarConnectionListener");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                parcel.readInt();
                mo4706a();
                return true;
            case 2:
                mo4707b();
                return true;
            default:
                return false;
        }
    }
}
