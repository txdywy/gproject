package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5289s implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        Account[] accountArr = null;
        String str = null;
        int i = 0;
        boolean z = false;
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
                    accountArr = (Account[]) C5129a.m23820b(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new OptInInfo(i, str, accountArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OptInInfo[i];
    }
}
