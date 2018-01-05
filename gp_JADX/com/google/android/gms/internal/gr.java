package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class gr implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = C5129a.m23814a(parcel);
        long j = 0;
        zzcqt com_google_android_gms_internal_zzcqt = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_internal_zzcqt = (zzcqt) C5129a.m23816a(parcel, readInt, zzcqt.CREATOR);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzcqw(str2, com_google_android_gms_internal_zzcqt, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcqw[i];
    }
}
