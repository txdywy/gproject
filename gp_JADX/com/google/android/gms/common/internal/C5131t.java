package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.nh;
import com.google.android.gms.internal.ni;

public abstract class C5131t extends nh implements C5128s {
    public C5131t() {
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                IInterface a = mo4624a();
                parcel2.writeNoException();
                ni.m25193a(parcel2, a);
                return true;
            case 2:
                int b = mo4625b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            default:
                return false;
        }
    }
}
