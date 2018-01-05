package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5576k implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        long j = 0;
        HarmfulAppsData[] harmfulAppsDataArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 3:
                    harmfulAppsDataArr = (HarmfulAppsData[]) C5129a.m23820b(parcel, readInt, HarmfulAppsData.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzd(j, harmfulAppsDataArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
