package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.zzn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.ArrayList;

public final class C4940f implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int a = C5129a.m23814a(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = C5129a.m23821c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C5129a.m23816a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z3 = C5129a.m23822c(parcel, readInt);
                    break;
                case 5:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 6:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 7:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 9:
                    arrayList = C5129a.m23821c(parcel, readInt, zzn.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new GoogleSignInOptions(i, arrayList2, account, z3, z2, z, str2, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
