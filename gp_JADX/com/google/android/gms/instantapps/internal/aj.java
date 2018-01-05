package com.google.android.gms.instantapps.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class aj implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        Route route = null;
        AppInfo appInfo = null;
        Intent intent = null;
        Intent intent2 = null;
        boolean z2 = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 5:
                    intent2 = (Intent) C5129a.m23816a(parcel, readInt, Intent.CREATOR);
                    break;
                case 6:
                    intent = (Intent) C5129a.m23816a(parcel, readInt, Intent.CREATOR);
                    break;
                case 8:
                    appInfo = (AppInfo) C5129a.m23816a(parcel, readInt, AppInfo.CREATOR);
                    break;
                case 9:
                    route = (Route) C5129a.m23816a(parcel, readInt, Route.CREATOR);
                    break;
                case 10:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 11:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new InstantAppPreLaunchInfo(i, str, z2, intent2, intent, appInfo, route, z, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InstantAppPreLaunchInfo[i];
    }
}
