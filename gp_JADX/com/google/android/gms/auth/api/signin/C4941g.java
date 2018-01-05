package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C4941g implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 4:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    googleSignInAccount = (GoogleSignInAccount) C5129a.m23816a(parcel, readInt, GoogleSignInAccount.CREATOR);
                    break;
                case 8:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
