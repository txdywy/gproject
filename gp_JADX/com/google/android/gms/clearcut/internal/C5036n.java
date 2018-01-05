package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5036n implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = C5129a.m23814a(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 8:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 10:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new PlayLoggerContext(str4, i3, i2, str3, str2, z, str, z2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
