package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class C5658u implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 3:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C5129a.m23816a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    uri = (Uri) C5129a.m23816a(parcel, readInt, Uri.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new Asset(bArr, str, parcelFileDescriptor, uri);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
