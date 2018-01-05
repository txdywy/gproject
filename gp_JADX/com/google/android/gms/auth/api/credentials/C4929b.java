package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.ArrayList;
import java.util.List;

public final class C4929b implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        int i2 = 0;
        List list = null;
        List list2 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 2:
                    list2 = C5129a.m23834o(parcel, readInt);
                    break;
                case 3:
                    int a2 = C5129a.m23815a(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (a2 != 0) {
                        list = new ArrayList();
                        int readInt2 = parcel.readInt();
                        for (readInt = 0; readInt < readInt2; readInt++) {
                            list.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(dataPosition + a2);
                        break;
                    }
                    list = null;
                    break;
                case 4:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 5:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new PasswordSpecification(str, list2, list, i2, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PasswordSpecification[i];
    }
}
