package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.List;

public class DeviceDataUploadOptedInAccountsParcelable extends zza {
    public static final Creator CREATOR = new C5605e();
    public final List f28535a;
    public final List f28536b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.f28535a = list;
        this.f28536b = list2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DeviceDataUploadOptedInAccountsParcelable)) {
            return false;
        }
        DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
        return ad.m23722a(this.f28535a, deviceDataUploadOptedInAccountsParcelable.f28535a) && ad.m23722a(this.f28536b, deviceDataUploadOptedInAccountsParcelable.f28536b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28535a, this.f28536b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23845a(parcel, 2, this.f28535a);
        C5130b.m23845a(parcel, 3, this.f28536b);
        C5130b.m23853b(parcel, a);
    }
}
