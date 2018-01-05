package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5627d implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        int i2 = 0;
        zzas com_google_android_gms_wearable_internal_zzas = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    com_google_android_gms_wearable_internal_zzas = (zzas) C5129a.m23816a(parcel, readInt, zzas.CREATOR);
                    break;
                case 3:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzaq(com_google_android_gms_wearable_internal_zzas, i2, i, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaq[i];
    }
}
