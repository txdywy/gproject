package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class jk implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        long j = 0;
        Double d = null;
        String str = null;
        String str2 = null;
        Float f = null;
        Long l = null;
        String str3 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    j = C5129a.m23825f(parcel, readInt);
                    break;
                case 4:
                    l = C5129a.m23826g(parcel, readInt);
                    break;
                case 5:
                    int a2 = C5129a.m23815a(parcel, readInt);
                    if (a2 != 0) {
                        C5129a.m23819b(parcel, a2, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    }
                    f = null;
                    break;
                case 6:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    int a3 = C5129a.m23815a(parcel, readInt);
                    if (a3 != 0) {
                        C5129a.m23819b(parcel, a3, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    }
                    d = null;
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzcvg(i, str3, j, l, f, str2, str, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcvg[i];
    }
}
