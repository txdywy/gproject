package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzn extends zza {
    public static final Creator CREATOR = new C4958j();
    public int f25467a;
    public int f25468b;
    public Bundle f25469c;

    zzn(int i, int i2, Bundle bundle) {
        this.f25467a = i;
        this.f25468b = i2;
        this.f25469c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23854b(parcel, 1, this.f25467a);
        C5130b.m23854b(parcel, 2, this.f25468b);
        C5130b.m23840a(parcel, 3, this.f25469c);
        C5130b.m23853b(parcel, a);
    }
}
