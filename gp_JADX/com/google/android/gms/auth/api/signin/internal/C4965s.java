package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C4965s implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        GoogleSignInOptions googleSignInOptions = null;
        int a = C5129a.m23814a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    googleSignInOptions = (GoogleSignInOptions) C5129a.m23816a(parcel, readInt, GoogleSignInOptions.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
