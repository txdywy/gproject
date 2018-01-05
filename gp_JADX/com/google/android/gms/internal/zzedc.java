package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzbv;

public final class zzedc extends zza {
    public static final Creator CREATOR = new nf();
    public int f27836a;
    public final ConnectionResult f27837b;
    public final zzbv f27838c;

    public zzedc() {
        this(new ConnectionResult(8, null));
    }

    zzedc(int i, ConnectionResult connectionResult, zzbv com_google_android_gms_common_internal_zzbv) {
        this.f27836a = i;
        this.f27837b = connectionResult;
        this.f27838c = com_google_android_gms_common_internal_zzbv;
    }

    private zzedc(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f27836a);
        C5130b.m23842a(parcel, 2, this.f27837b, i);
        C5130b.m23842a(parcel, 3, this.f27838c, i);
        C5130b.m23853b(parcel, a);
    }
}
