package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.common.zzc;

public final class C5115b implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        zzc[] com_google_android_gms_common_zzcArr = null;
        int a = C5129a.m23814a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    iBinder = C5129a.m23828i(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C5129a.m23820b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 8:
                    account = (Account) C5129a.m23816a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    com_google_android_gms_common_zzcArr = (zzc[]) C5129a.m23820b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzz(i3, i2, i, str, iBinder, scopeArr, bundle, account, com_google_android_gms_common_zzcArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
