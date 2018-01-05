package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.common.internal.zzbt;

public final class ne implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        zzbt com_google_android_gms_common_internal_zzbt = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    com_google_android_gms_common_internal_zzbt = (zzbt) C5129a.m23816a(parcel, readInt, zzbt.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzeda(i, com_google_android_gms_common_internal_zzbt);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeda[i];
    }
}
