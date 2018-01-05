package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.common.internal.zzbv;

public final class nf implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zzbv com_google_android_gms_common_internal_zzbv = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    connectionResult = (ConnectionResult) C5129a.m23816a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 3:
                    com_google_android_gms_common_internal_zzbv = (zzbv) C5129a.m23816a(parcel, readInt, zzbv.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzedc(i, connectionResult, com_google_android_gms_common_internal_zzbv);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzedc[i];
    }
}
