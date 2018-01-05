package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C4938d implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) C5129a.m23816a(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 9:
                    str6 = C5129a.m23827h(parcel, readInt);
                    break;
                case 10:
                    list = C5129a.m23821c(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C5129a.m23827h(parcel, readInt);
                    break;
                case 12:
                    str8 = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, list, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
