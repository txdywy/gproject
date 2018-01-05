package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5647x implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        byte[] bArr = null;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    uri = (Uri) C5129a.m23816a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 5:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzdg(uri, bundle, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdg[i];
    }
}
