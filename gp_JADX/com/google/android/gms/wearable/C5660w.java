package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5660w implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = null;
        int a = C5129a.m23814a(parcel);
        long j = 0;
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
                case 6:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new PutDataRequest(uri, bundle, bArr, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PutDataRequest[i];
    }
}
