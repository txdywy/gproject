package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5270i implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        String str = null;
        String str2 = null;
        Intent intent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    intent = (Intent) C5129a.m23816a(parcel, readInt, Intent.CREATOR);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    bitmapTeleporter = (BitmapTeleporter) C5129a.m23816a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new LaunchData(intent, str2, str, bitmapTeleporter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LaunchData[i];
    }
}
