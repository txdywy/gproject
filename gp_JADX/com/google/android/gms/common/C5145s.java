package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5145s implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int a = C5129a.m23814a(parcel);
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 2:
                    iBinder = C5129a.m23828i(parcel, readInt);
                    break;
                case 3:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzl(str, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
