package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class be implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        zzdg com_google_android_gms_wearable_internal_zzdg = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    com_google_android_gms_wearable_internal_zzdg = (zzdg) C5129a.m23816a(parcel, readInt, zzdg.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzfs(i, com_google_android_gms_wearable_internal_zzdg);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfs[i];
    }
}
