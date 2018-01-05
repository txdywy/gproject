package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class an implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        Account account = null;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    account = (Account) C5129a.m23816a(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    googleSignInAccount = (GoogleSignInAccount) C5129a.m23816a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzbt(i2, account, i, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbt[i];
    }
}
