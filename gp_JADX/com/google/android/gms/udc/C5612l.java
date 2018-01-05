package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.udc.UdcCacheResponse.SettingAvailability;
import com.google.android.gms.udc.UdcCacheResponse.UdcSetting;

public final class C5612l implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        int a = C5129a.m23814a(parcel);
        SettingAvailability settingAvailability = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 3:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 4:
                    settingAvailability = (SettingAvailability) C5129a.m23816a(parcel, readInt, SettingAvailability.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new UdcSetting(i2, i, settingAvailability);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UdcSetting[i];
    }
}
