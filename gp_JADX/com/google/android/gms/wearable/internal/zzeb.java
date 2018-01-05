package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;

public final class zzeb extends zza {
    public static final Creator CREATOR = new aj();
    public final int f28665a;
    public final ConnectionConfiguration[] f28666b;

    public zzeb(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f28665a = i;
        this.f28666b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 2, this.f28665a);
        C5130b.m23849a(parcel, 3, this.f28666b, i);
        C5130b.m23853b(parcel, a);
    }
}
