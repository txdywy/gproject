package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ah implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        String str = null;
        String str2 = null;
        IntentFilter[] intentFilterArr = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    iBinder = C5129a.m23828i(parcel, readInt);
                    break;
                case 3:
                    intentFilterArr = (IntentFilter[]) C5129a.m23820b(parcel, readInt, IntentFilter.CREATOR);
                    break;
                case 4:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new zzd(iBinder, intentFilterArr, str2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzd[i];
    }
}
