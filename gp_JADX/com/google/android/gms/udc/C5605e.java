package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C5605e implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        List list = null;
        int a = C5129a.m23814a(parcel);
        List list2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    list2 = C5129a.m23834o(parcel, readInt);
                    break;
                case 3:
                    list = C5129a.m23834o(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new DeviceDataUploadOptedInAccountsParcelable(list2, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceDataUploadOptedInAccountsParcelable[i];
    }
}
