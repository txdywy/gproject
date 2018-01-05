package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5100e implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C5129a.m23816a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
