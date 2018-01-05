package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C4958j implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C5129a.m23814a(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzn(i2, i, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
