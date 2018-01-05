package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzej extends zza {
    public static final Creator CREATOR = new an();
    public final int f28673a;
    public final zzfn f28674b;

    public zzej(int i, zzfn com_google_android_gms_wearable_internal_zzfn) {
        this.f28673a = i;
        this.f28674b = com_google_android_gms_wearable_internal_zzfn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28673a);
        C5130b.m23842a(parcel, 3, this.f28674b, i);
        C5130b.m23853b(parcel, a);
    }
}
