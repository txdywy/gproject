package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzbv extends zza {
    public static final Creator CREATOR = new ao();
    public int f26066a;
    public IBinder f26067b;
    public ConnectionResult f26068c;
    public boolean f26069d;
    public boolean f26070e;

    zzbv(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f26066a = i;
        this.f26067b = iBinder;
        this.f26068c = connectionResult;
        this.f26069d = z;
        this.f26070e = z2;
    }

    public final C5110o m23861a() {
        IBinder iBinder = this.f26067b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return queryLocalInterface instanceof C5110o ? (C5110o) queryLocalInterface : new C5126q(iBinder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbv)) {
            return false;
        }
        zzbv com_google_android_gms_common_internal_zzbv = (zzbv) obj;
        return this.f26068c.equals(com_google_android_gms_common_internal_zzbv.f26068c) && m23861a().equals(com_google_android_gms_common_internal_zzbv.m23861a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f26066a);
        C5130b.m23841a(parcel, 2, this.f26067b);
        C5130b.m23842a(parcel, 3, this.f26068c, i);
        C5130b.m23846a(parcel, 4, this.f26069d);
        C5130b.m23846a(parcel, 5, this.f26070e);
        C5130b.m23853b(parcel, a);
    }
}
