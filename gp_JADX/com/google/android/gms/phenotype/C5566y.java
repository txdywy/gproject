package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5566y implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        boolean z = false;
        Configuration[] configurationArr = null;
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
                    configurationArr = (Configuration[]) C5129a.m23820b(parcel, readInt, Configuration.CREATOR);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 6:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Configurations(str2, str, configurationArr, z, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }
}
