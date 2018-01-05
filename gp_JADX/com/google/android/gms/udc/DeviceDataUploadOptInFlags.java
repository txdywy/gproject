package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public class DeviceDataUploadOptInFlags extends zza {
    public static final Creator CREATOR = new C5604d();
    public final boolean f28533a;
    public final boolean f28534b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
        this.f28533a = z;
        this.f28534b = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23846a(parcel, 2, this.f28533a);
        C5130b.m23846a(parcel, 3, this.f28534b);
        C5130b.m23853b(parcel, a);
    }
}
