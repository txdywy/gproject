package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C5281j implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        int i = 0;
        List list = null;
        PackageInfo packageInfo = null;
        byte[] bArr2 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    bitmapTeleporter = (BitmapTeleporter) C5129a.m23816a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 5:
                    list4 = C5129a.m23821c(parcel, readInt, Route.CREATOR);
                    break;
                case 6:
                    list3 = C5129a.m23821c(parcel, readInt, AtomInfo.CREATOR);
                    break;
                case 7:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 8:
                    bArr2 = C5129a.m23830k(parcel, readInt);
                    break;
                case 9:
                    packageInfo = (PackageInfo) C5129a.m23816a(parcel, readInt, PackageInfo.CREATOR);
                    break;
                case 10:
                    list = C5129a.m23821c(parcel, readInt, UsesApp.CREATOR);
                    break;
                case 11:
                    list2 = C5129a.m23821c(parcel, readInt, SharedLibInfo.CREATOR);
                    break;
                case 12:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new AppInfo(str2, str, bitmapTeleporter, list4, list3, list2, i, bArr2, packageInfo, list, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppInfo[i];
    }
}
